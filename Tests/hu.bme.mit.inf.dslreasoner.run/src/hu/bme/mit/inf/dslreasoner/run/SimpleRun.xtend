package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EAttribute
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import org.eclipse.emf.ecore.EObject
import java.util.LinkedHashMap
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver

class SimpleRun {
	
	def static void main(String[] args) {
		val inputs = new FileSystemWorkspace('''initialModels/''',"")
		val workspace = new FileSystemWorkspace('''outputModels/''',"")
		workspace.initAndClear
		
		println("Input and output workspaces are created")
		
		val metamodel = loadMetamodel()
		val partialModel = loadPartialModel(inputs)
		val queries = loadQueries(metamodel)
		
		println("DSL loaded")
		
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel,new Ecore2LogicConfiguration())
		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem,partialModel)
		val validModelExtensionProblem = viatra2Logic.transformQueries(queries,modelGenerationProblem,new Viatra2LogicConfiguration)
		
		val logicProblem = validModelExtensionProblem.output
		
		println("Problem created")
		var LogicResult solution
		
		//*
		val ViatraReasoner viatraSolver = new ViatraReasoner
		val viatraConfig = new ViatraReasonerConfiguration => [
			it.typeScopes.maxNewElements = 10
			it.typeScopes.minNewElements = 10
			it.solutionScope.numberOfRequiredSolution = 1
			it.existingQueries = queries.patterns.map[it.internalQueryRepresentation]
			it.nameNewElements = true
			it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
			it.stateCoderStrategy = StateCoderStrategy::Neighbourhood
		]
		solution = viatraSolver.solve(logicProblem,viatraConfig,workspace)
		/*/
		val AlloySolver alloyReasoner = new AlloySolver
		val alloyConfig = new AlloySolverConfiguration => [
				it.typeScopes.maxNewElements = 5
				it.typeScopes.minNewElements = 5
				it.solutionScope.numberOfRequiredSolution = 1
				it.typeScopes.maxIntScope = 0
				it.writeToFile = true
			]
		solution = alloyReasoner.solve(logicProblem,alloyConfig,workspace)
		//*/
		
		println("Problem solved")
		
		solution.writeSolution(workspace)
	}
	
	def private static loadMetamodel() {
		val pckg = FunctionalArchitecturePackage.eINSTANCE
		val List<EClass> classes = pckg.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}
	
	def private static loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = hu.bme.mit.inf.dslreasoner.domains.transima.fam.patterns.Pattern.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		derivedFeatures.put(i.type.internalQueryRepresentation,metamodel.attributes.filter[it.name == "type"].head)
		derivedFeatures.put(i.model.internalQueryRepresentation,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
	
	def static loadPartialModel(ReasonerWorkspace inputs) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		inputs.readModel(EObject,"FAM.xmi").eResource.allContents.toList
	}
	
	def static writeSolution(LogicResult solution, ReasonerWorkspace workspace) {
		if(solution instanceof ModelResult) {
			val representations = solution.representation
			for(representationIndex : 0..<representations.size) {
				val representation = representations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if(representation instanceof PartialInterpretation) {
					workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
					val partialInterpretation2GML = new PartialInterpretation2Gml
					val gml = partialInterpretation2GML.transform(representation)
						//ecore2GML.transform(root)
						workspace.writeText('''solutionVisualisation.gml''',gml)
						
				} else {
					workspace.writeText('''solution«representationNumber».txt''',representation.toString)
				}
			}
			println("Solution saved and visualised")
		} 
	}
	
	def static visualizeSolution() {
		
	}
}