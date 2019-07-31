package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.HashMap
import java.util.List
import org.eclipse.xtend.lib.annotations.Data

@Data
class RelationConstraints {
	val List<RelationMultiplicityConstraint> multiplicityConstraints
}

@Data
class RelationMultiplicityConstraint {
	Relation relation
	Relation inverseRelation
	boolean containment
	boolean container
	int lowerBound
	int upperBound
	int inverseUpperBound

	def isUpperBoundFinite() {
		upperBound >= 0
	}

	private def isInverseUpperBoundFinite() {
		inverseUpperBound >= 0
	}

	private def canHaveMultipleSourcesPerTarget() {
		inverseUpperBound != 1
	}

	def constrainsUnfinished() {
		lowerBound >= 1 && (!container || lowerBound >= 2)
	}

	def constrainsUnrepairable() {
		constrainsUnfinished && canHaveMultipleSourcesPerTarget
	}

	def constrainsRemainingInverse() {
		lowerBound >= 1 && !containment && inverseUpperBoundFinite
	}

	def constrainsRemainingContents() {
		containment
	}

	def isActive() {
		constrainsUnfinished || constrainsUnrepairable || constrainsRemainingInverse || constrainsRemainingContents
	}

	def getSourceType() {
		getParamType(0)
	}

	def getTargetType() {
		getParamType(1)
	}

	private def getParamType(int i) {
		val parameters = relation.parameters
		if (i < parameters.size) {
			val firstParam = parameters.get(i)
			if (firstParam instanceof ComplexTypeReference) {
				return firstParam.referred
			}
		}
		throw new IllegalArgumentException("Constraint with unknown source type")
	}
}

class RelationConstraintCalculator {
	def calculateRelationConstraints(LogicProblem problem) {
		val containmentRelations = switch (problem.containmentHierarchies.size) {
			case 0:
				<Relation>emptySet
			case 1:
				ImmutableSet.copyOf(problem.containmentHierarchies.head.containmentRelations)
			default:
				throw new IllegalArgumentException("Only a single containment hierarchy is supported")
		}
		val inverseRelations = new HashMap<Relation, Relation>
		val lowerMultiplicities = new HashMap<Relation, Integer>
		val upperMultiplicities = new HashMap<Relation, Integer>
		for (relation : problem.relations) {
			lowerMultiplicities.put(relation, 0)
			upperMultiplicities.put(relation, -1)
		}
		for (annotation : problem.annotations) {
			switch (annotation) {
				InverseRelationAssertion: {
					inverseRelations.put(annotation.inverseA, annotation.inverseB)
					inverseRelations.put(annotation.inverseB, annotation.inverseA)
				}
				LowerMultiplicityAssertion:
					lowerMultiplicities.put(annotation.relation, annotation.lower)
				UpperMultiplicityAssertion:
					upperMultiplicities.put(annotation.relation, annotation.upper)
			}
		}
		val multiplicityConstraintsBuilder = ImmutableList.builder()
		for (relation : problem.relations) {
			val containment = containmentRelations.contains(relation)
			val lowerMultiplicity = lowerMultiplicities.get(relation)
			val upperMultiplicity = upperMultiplicities.get(relation)
			var container = false
			var inverseUpperMultiplicity = -1
			val inverseRelation = inverseRelations.get(relation)
			if (inverseRelation !== null) {
				inverseUpperMultiplicity = upperMultiplicities.get(relation)
				container = containmentRelations.contains(inverseRelation)
			}
			val constraint = new RelationMultiplicityConstraint(relation, inverseRelation, containment, container,
				lowerMultiplicity, upperMultiplicity, inverseUpperMultiplicity)
			if (constraint.isActive) {
				if (relation.parameters.size != 2) {
					throw new IllegalArgumentException('''Relation «relation.name» has multiplicity or containment constraints, but it is not binary''')
				}
				multiplicityConstraintsBuilder.add(constraint)
			}
		}
		new RelationConstraints(multiplicityConstraintsBuilder.build)
	}
}
