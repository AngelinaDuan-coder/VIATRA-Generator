package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysis
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationMultiplicityConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util.ParseUtil
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Collection
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data
class GeneratedPatterns {
	public Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidWFQueries
	public Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFQueries
	public Map<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries> multiplicityConstraintQueries
	public IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery
	public Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedMulticiplicityQueries
	public Map<ObjectCreationPrecondition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineObjectQueries
	public Map<? extends Type, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineTypeQueries
	public Map<Pair<RelationDeclaration, Relation>, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refinerelationQueries
	public Map<RelationDefinition, ModalPatternQueries> modalRelationQueries
	public Collection<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allQueries
}

@Data
class ModalPatternQueries {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mayQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mustQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> currentQuery
}

@Data
class UnifinishedMultiplicityQueries {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> unfinishedMultiplicityQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> unrepairableMultiplicityQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> remainingInverseMultiplicityQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> remainingContentsQuery
}

class PatternProvider {

	val TypeAnalysis typeAnalysis = new TypeAnalysis

	def generateQueries(LogicProblem problem, PartialInterpretation emptySolution, ModelGenerationStatistics statistics,
		Set<PQuery> existingQueries, ReasonerWorkspace workspace, TypeInferenceMethod typeInferenceMethod,
		ScopePropagatorStrategy scopePropagatorStrategy, RelationConstraints relationConstraints, boolean writeToFile) {
		val fqn2Query = existingQueries.toMap[it.fullyQualifiedName]
		val PatternGenerator patternGenerator = new PatternGenerator(typeInferenceMethod, scopePropagatorStrategy)
		val typeAnalysisResult = if (patternGenerator.requiresTypeAnalysis) {
				val startTime = System.nanoTime
				val result = typeAnalysis.performTypeAnalysis(problem, emptySolution)
				val typeAnalysisTime = System.nanoTime - startTime
				statistics.preliminaryTypeAnalisisTime = typeAnalysisTime
				result
			} else {
				null
			}
		val baseIndexerFile = patternGenerator.transformBaseProperties(problem, emptySolution, fqn2Query,
			typeAnalysisResult, relationConstraints)
		if (writeToFile) {
			workspace.writeText('''generated3valued.vql_deactivated''', baseIndexerFile)
		}
		val ParseUtil parseUtil = new ParseUtil
		val generatedQueries = parseUtil.parse(baseIndexerFile)
		val runtimeQueries = calclulateRuntimeQueries(patternGenerator, problem, emptySolution, typeAnalysisResult,
			relationConstraints, generatedQueries)
		return runtimeQueries
	}

	private def GeneratedPatterns calclulateRuntimeQueries(
		PatternGenerator patternGenerator,
		LogicProblem problem,
		PartialInterpretation emptySolution,
		TypeAnalysisResult typeAnalysisResult,
		RelationConstraints relationConstraints,
		Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> queries
	) {
		val invalidWFQueries = patternGenerator.invalidIndexer.getInvalidateByWfQueryNames(problem).mapValues [
			it.lookup(queries)
		]
		val unfinishedWFQueries = patternGenerator.unfinishedIndexer.getUnfinishedWFQueryNames(problem).mapValues [
			it.lookup(queries)
		]
		val multiplicityConstraintQueries = patternGenerator.unfinishedIndexer.getUnfinishedMultiplicityQueries(
			relationConstraints.multiplicityConstraints).mapValues [
			new UnifinishedMultiplicityQueries(unfinishedMultiplicityQueryName?.lookup(queries),
				unrepairableMultiplicityQueryName?.lookup(queries),
				remainingInverseMultiplicityQueryName?.lookup(queries), remainingContentsQueryName?.lookup(queries))
		]
		val hasElementInContainmentQuery = patternGenerator.typeRefinementGenerator.hasElementInContainmentName.lookup(
			queries)
		val unfinishedMultiplicityQueries = multiplicityConstraintQueries.entrySet.filter [
			value.unfinishedMultiplicityQuery !== null
		].toMap([key.relation], [value.unfinishedMultiplicityQuery])
		val refineObjectsQueries = patternGenerator.typeRefinementGenerator.
			getRefineObjectQueryNames(problem, emptySolution, typeAnalysisResult).mapValues[it.lookup(queries)]
		val refineTypeQueries = patternGenerator.typeRefinementGenerator.getRefineTypeQueryNames(problem, emptySolution,
			typeAnalysisResult).mapValues[it.lookup(queries)]
		val refineRelationQueries = patternGenerator.relationRefinementGenerator.getRefineRelationQueries(problem).
			mapValues[it.lookup(queries)]
		val modalRelationQueries = problem.relations.filter(RelationDefinition).toMap([it], [ relationDefinition |
			val indexer = patternGenerator.relationDefinitionIndexer
			new ModalPatternQueries(
				indexer.relationDefinitionName(relationDefinition, Modality.MAY).lookup(queries),
				indexer.relationDefinitionName(relationDefinition, Modality.MUST).lookup(queries),
				indexer.relationDefinitionName(relationDefinition, Modality.CURRENT).lookup(queries)
			)
		])
		return new GeneratedPatterns(
			invalidWFQueries,
			unfinishedWFQueries,
			multiplicityConstraintQueries,
			hasElementInContainmentQuery,
			unfinishedMultiplicityQueries,
			refineObjectsQueries,
			refineTypeQueries,
			refineRelationQueries,
			modalRelationQueries,
			queries.values
		)
	}
}
