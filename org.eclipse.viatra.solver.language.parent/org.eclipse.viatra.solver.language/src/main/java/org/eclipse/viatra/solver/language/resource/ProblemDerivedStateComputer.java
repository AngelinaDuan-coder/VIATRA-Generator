package org.eclipse.viatra.solver.language.resource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.model.problem.Assertion;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.Literal;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Parameter;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemFactory;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Statement;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicates;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ProblemDerivedStateComputer implements IDerivedStateComputer {
	public static final String NEW_NODE = "new";

	private static final String ID_REGEX_STRING = "[_a-zA-Z][_0-9a-zA-Z]*";

	private static final Pattern ID_REGEX = Pattern.compile(ID_REGEX_STRING);

	private static final Pattern QUALIFIED_NAME_REGEX = Pattern
			.compile(ID_REGEX_STRING + "(::" + ID_REGEX_STRING + ")*");

	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private IGlobalScopeProvider scopeProvider;

	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		for (EObject object : resource.getContents()) {
			if (object instanceof Problem) {
				installDerivedProblemState((Problem) object, preLinkingPhase);
			}
		}
	}

	protected void installDerivedProblemState(Problem problem, boolean preLinkingPhase) {
		Set<String> nodeNames = new HashSet<>();
		if (!preLinkingPhase) {
			installDerivedNodes(problem);
		}
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof PredicateDefinition) {
				PredicateDefinition definition = (PredicateDefinition) statement;
				installDerivedPredicateDefinitionState(definition);
			}
		}
		List<Node> grapNodes = problem.getNodes();
		for (String nodeName : nodeNames) {
			Node graphNode = ProblemFactory.eINSTANCE.createNode();
			graphNode.setName(nodeName);
			grapNodes.add(graphNode);
		}
	}

	protected void installDerivedNodes(Problem problem) {
		IScope nodeScope = scopeProvider.getScope(problem.eResource(), ProblemPackage.Literals.ASSERTION__ARGUMENTS,
				Predicates.alwaysTrue());
		Set<String> nodeNames = new HashSet<>();
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof ClassDeclaration) {
				ClassDeclaration declaration = (ClassDeclaration) statement;
				if (!declaration.isAbstract()) {
					String className = declaration.getName();
					if (validId(className)) {
						QualifiedName qualifiedName = QualifiedName.create(className, NEW_NODE);
						String nodeName = qualifiedNameConverter.toString(qualifiedName);
						nodeNames.add(nodeName);
					}
				}
			}
		}
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof Assertion) {
				Assertion assertion = (Assertion) statement;
				List<INode> nodes = NodeModelUtils.findNodesForFeature(assertion,
						ProblemPackage.Literals.ASSERTION__ARGUMENTS);
				for (INode node : nodes) {
					String nodeName = linkingHelper.getCrossRefNodeAsString(node, true);
					if (validQualifiedName(nodeName)) {
						QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(nodeName);
						if (nodeScope.getSingleElement(qualifiedName) == null) {
							nodeNames.add(nodeName);
						}
					}
				}
			}
		}
		List<Node> grapNodes = problem.getNodes();
		for (String nodeName : nodeNames) {
			Node graphNode = ProblemFactory.eINSTANCE.createNode();
			graphNode.setName(nodeName);
			grapNodes.add(graphNode);
		}
	}

	protected void installDerivedPredicateDefinitionState(PredicateDefinition definition) {
		Set<String> parameterNames = new HashSet<>();
		for (Parameter parameter : definition.getParameters()) {
			String name = parameter.getName();
			if (name != null) {
				parameterNames.add(name);
			}
		}
		for (Conjunction body : definition.getBodies()) {
			installDeriveConjunctionState(body, parameterNames);
		}
	}

	protected void installDeriveConjunctionState(Conjunction conjunction, Set<String> knownVariables) {
		Set<String> newVariables = new HashSet<>();
		for (Literal literal : conjunction.getLiterals()) {
			if (literal instanceof Atom) {
				Atom atom = (Atom) literal;
				collectVariables(atom, knownVariables, newVariables);
			}
		}
		createVariables(conjunction, newVariables);
		newVariables.addAll(knownVariables);
		for (Literal literal : conjunction.getLiterals()) {
			if (literal instanceof NegativeLiteral) {
				NegativeLiteral negativeLiteral = (NegativeLiteral) literal;
				installDeriveNegativeLiteralState(negativeLiteral, newVariables);
			}
		}
	}

	protected void installDeriveNegativeLiteralState(NegativeLiteral negativeLiteral, Set<String> knownVariables) {
		Set<String> newVariables = new HashSet<>();
		collectVariables(negativeLiteral.getAtom(), knownVariables, newVariables);
		createVariables(negativeLiteral, newVariables);
	}

	protected void collectVariables(Atom atom, Set<String> knownVariables, Set<String> newVariables) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(atom, ProblemPackage.Literals.ATOM__ARGUMENTS);
		for (INode node : nodes) {
			String variableName = linkingHelper.getCrossRefNodeAsString(node, true);
			if (!knownVariables.contains(variableName)) {
				newVariables.add(variableName);
			}
		}
	}

	protected void createVariables(ExistentialQuantifier quantifier, Set<String> newVariables) {
		for (String variableName : newVariables) {
			if (validId(variableName)) {
				ImplicitVariable variable = ProblemFactory.eINSTANCE.createImplicitVariable();
				variable.setName(variableName);
				quantifier.getImplicitVariables().add(variable);
			}
		}
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		for (EObject object : resource.getContents()) {
			if (object instanceof Problem) {
				discardDerivedProblemState((Problem) object);
			}
		}
	}

	protected void discardDerivedProblemState(Problem problem) {
		problem.getNodes().clear();
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof PredicateDefinition) {
				PredicateDefinition definition = (PredicateDefinition) statement;
				for (Conjunction body : definition.getBodies()) {
					body.getImplicitVariables().clear();
					for (Literal literal : body.getLiterals()) {
						if (literal instanceof NegativeLiteral) {
							NegativeLiteral negativeLiteral = (NegativeLiteral) literal;
							negativeLiteral.getImplicitVariables().clear();
						}
					}
				}
			}
		}
	}

	protected static boolean validId(String name) {
		return name != null && ID_REGEX.matcher(name).matches();
	}
	
	protected static boolean validQualifiedName(String name) {
		return name != null && QUALIFIED_NAME_REGEX.matcher(name).matches();
	}
}
