/*
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.bme.mit.inf.dslreasoner.application.ide.contentassist.antlr.internal.InternalApplicationConfigurationParser;
import hu.bme.mit.inf.dslreasoner.application.services.ApplicationConfigurationGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ApplicationConfigurationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ApplicationConfigurationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ApplicationConfigurationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getFileAccess().getAlternatives(), "rule__File__Alternatives");
			builder.put(grammarAccess.getMetamodelEntryAccess().getAlternatives(), "rule__MetamodelEntry__Alternatives");
			builder.put(grammarAccess.getMetamodelAccess().getAlternatives(), "rule__Metamodel__Alternatives");
			builder.put(grammarAccess.getPartialModelEntryAccess().getAlternatives(), "rule__PartialModelEntry__Alternatives");
			builder.put(grammarAccess.getPartialModelAccess().getAlternatives(), "rule__PartialModel__Alternatives");
			builder.put(grammarAccess.getPatternEntryAccess().getAlternatives(), "rule__PatternEntry__Alternatives");
			builder.put(grammarAccess.getGraphPatternAccess().getAlternatives(), "rule__GraphPattern__Alternatives");
			builder.put(grammarAccess.getObjectiveEntryAccess().getAlternatives(), "rule__ObjectiveEntry__Alternatives");
			builder.put(grammarAccess.getObjectiveAccess().getAlternatives(), "rule__Objective__Alternatives");
			builder.put(grammarAccess.getConfigEntryAccess().getAlternatives(), "rule__ConfigEntry__Alternatives");
			builder.put(grammarAccess.getConfigAccess().getAlternatives(), "rule__Config__Alternatives");
			builder.put(grammarAccess.getTypeScopeAccess().getAlternatives(), "rule__TypeScope__Alternatives");
			builder.put(grammarAccess.getClassTypeScopeAccess().getAlternatives_2(), "rule__ClassTypeScope__Alternatives_2");
			builder.put(grammarAccess.getClassTypeScopeAccess().getAlternatives_3(), "rule__ClassTypeScope__Alternatives_3");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getAlternatives_2(), "rule__ObjectTypeScope__Alternatives_2");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getAlternatives_3(), "rule__ObjectTypeScope__Alternatives_3");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getAlternatives_2(), "rule__IntegerTypeScope__Alternatives_2");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getAlternatives_3(), "rule__IntegerTypeScope__Alternatives_3");
			builder.put(grammarAccess.getRealTypeScopeAccess().getAlternatives_2(), "rule__RealTypeScope__Alternatives_2");
			builder.put(grammarAccess.getRealTypeScopeAccess().getAlternatives_3(), "rule__RealTypeScope__Alternatives_3");
			builder.put(grammarAccess.getStringTypeScopeAccess().getAlternatives_2(), "rule__StringTypeScope__Alternatives_2");
			builder.put(grammarAccess.getStringTypeScopeAccess().getAlternatives_3(), "rule__StringTypeScope__Alternatives_3");
			builder.put(grammarAccess.getTypeReferenceAccess().getAlternatives(), "rule__TypeReference__Alternatives");
			builder.put(grammarAccess.getNumberSpecificationAccess().getAlternatives(), "rule__NumberSpecification__Alternatives");
			builder.put(grammarAccess.getExactNumberAccess().getAlternatives(), "rule__ExactNumber__Alternatives");
			builder.put(grammarAccess.getIntervallNumberAccess().getAlternatives_2(), "rule__IntervallNumber__Alternatives_2");
			builder.put(grammarAccess.getScopeAccess().getAlternatives(), "rule__Scope__Alternatives");
			builder.put(grammarAccess.getOptimizationDirectionAccess().getAlternatives(), "rule__OptimizationDirection__Alternatives");
			builder.put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
			builder.put(grammarAccess.getDocumentLevelSpecificationAccess().getAlternatives(), "rule__DocumentLevelSpecification__Alternatives");
			builder.put(grammarAccess.getSolverAccess().getAlternatives(), "rule__Solver__Alternatives");
			builder.put(grammarAccess.getConfigurationScriptAccess().getGroup(), "rule__ConfigurationScript__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getREALLiteralAccess().getGroup(), "rule__REALLiteral__Group__0");
			builder.put(grammarAccess.getINTLiteralAccess().getGroup(), "rule__INTLiteral__Group__0");
			builder.put(grammarAccess.getEPackageImportAccess().getGroup(), "rule__EPackageImport__Group__0");
			builder.put(grammarAccess.getViatraImportAccess().getGroup(), "rule__ViatraImport__Group__0");
			builder.put(grammarAccess.getFileDeclarationAccess().getGroup(), "rule__FileDeclaration__Group__0");
			builder.put(grammarAccess.getMetamodelSpecificationAccess().getGroup(), "rule__MetamodelSpecification__Group__0");
			builder.put(grammarAccess.getMetamodelSpecificationAccess().getGroup_2(), "rule__MetamodelSpecification__Group_2__0");
			builder.put(grammarAccess.getAllPackageEntryAccess().getGroup(), "rule__AllPackageEntry__Group__0");
			builder.put(grammarAccess.getAllPackageEntryAccess().getGroup_2(), "rule__AllPackageEntry__Group_2__0");
			builder.put(grammarAccess.getAllPackageEntryAccess().getGroup_2_3(), "rule__AllPackageEntry__Group_2_3__0");
			builder.put(grammarAccess.getMetamodelElementAccess().getGroup(), "rule__MetamodelElement__Group__0");
			builder.put(grammarAccess.getMetamodelElementAccess().getGroup_0(), "rule__MetamodelElement__Group_0__0");
			builder.put(grammarAccess.getMetamodelElementAccess().getGroup_2(), "rule__MetamodelElement__Group_2__0");
			builder.put(grammarAccess.getMetamodelDeclarationAccess().getGroup(), "rule__MetamodelDeclaration__Group__0");
			builder.put(grammarAccess.getPartialModelSpecificationAccess().getGroup(), "rule__PartialModelSpecification__Group__0");
			builder.put(grammarAccess.getPartialModelSpecificationAccess().getGroup_2(), "rule__PartialModelSpecification__Group_2__0");
			builder.put(grammarAccess.getFolderEntryAccess().getGroup(), "rule__FolderEntry__Group__0");
			builder.put(grammarAccess.getFolderEntryAccess().getGroup_2(), "rule__FolderEntry__Group_2__0");
			builder.put(grammarAccess.getFolderEntryAccess().getGroup_2_3(), "rule__FolderEntry__Group_2_3__0");
			builder.put(grammarAccess.getPartialModelDeclarationAccess().getGroup(), "rule__PartialModelDeclaration__Group__0");
			builder.put(grammarAccess.getPatternSpecificationAccess().getGroup(), "rule__PatternSpecification__Group__0");
			builder.put(grammarAccess.getPatternSpecificationAccess().getGroup_2(), "rule__PatternSpecification__Group_2__0");
			builder.put(grammarAccess.getAllPatternEntryAccess().getGroup(), "rule__AllPatternEntry__Group__0");
			builder.put(grammarAccess.getAllPatternEntryAccess().getGroup_2(), "rule__AllPatternEntry__Group_2__0");
			builder.put(grammarAccess.getAllPatternEntryAccess().getGroup_2_3(), "rule__AllPatternEntry__Group_2_3__0");
			builder.put(grammarAccess.getPatternElementAccess().getGroup(), "rule__PatternElement__Group__0");
			builder.put(grammarAccess.getPatternElementAccess().getGroup_0(), "rule__PatternElement__Group_0__0");
			builder.put(grammarAccess.getGraphPatternDeclarationAccess().getGroup(), "rule__GraphPatternDeclaration__Group__0");
			builder.put(grammarAccess.getObjectiveSpecificationAccess().getGroup(), "rule__ObjectiveSpecification__Group__0");
			builder.put(grammarAccess.getObjectiveSpecificationAccess().getGroup_2(), "rule__ObjectiveSpecification__Group_2__0");
			builder.put(grammarAccess.getOptimizationEntryAccess().getGroup(), "rule__OptimizationEntry__Group__0");
			builder.put(grammarAccess.getThresholdEntryAccess().getGroup(), "rule__ThresholdEntry__Group__0");
			builder.put(grammarAccess.getCostObjectiveFunctionAccess().getGroup(), "rule__CostObjectiveFunction__Group__0");
			builder.put(grammarAccess.getCostObjectiveFunctionAccess().getGroup_3(), "rule__CostObjectiveFunction__Group_3__0");
			builder.put(grammarAccess.getCostEntryAccess().getGroup(), "rule__CostEntry__Group__0");
			builder.put(grammarAccess.getObjectiveDeclarationAccess().getGroup(), "rule__ObjectiveDeclaration__Group__0");
			builder.put(grammarAccess.getConfigSpecificationAccess().getGroup(), "rule__ConfigSpecification__Group__0");
			builder.put(grammarAccess.getConfigSpecificationAccess().getGroup_2(), "rule__ConfigSpecification__Group_2__0");
			builder.put(grammarAccess.getConfigSpecificationAccess().getGroup_2_1(), "rule__ConfigSpecification__Group_2_1__0");
			builder.put(grammarAccess.getConfigDeclarationAccess().getGroup(), "rule__ConfigDeclaration__Group__0");
			builder.put(grammarAccess.getDocumentationEntryAccess().getGroup(), "rule__DocumentationEntry__Group__0");
			builder.put(grammarAccess.getRuntimeEntryAccess().getGroup(), "rule__RuntimeEntry__Group__0");
			builder.put(grammarAccess.getMemoryEntryAccess().getGroup(), "rule__MemoryEntry__Group__0");
			builder.put(grammarAccess.getCustomEntryAccess().getGroup(), "rule__CustomEntry__Group__0");
			builder.put(grammarAccess.getScopeSpecificationAccess().getGroup(), "rule__ScopeSpecification__Group__0");
			builder.put(grammarAccess.getScopeSpecificationAccess().getGroup_2(), "rule__ScopeSpecification__Group_2__0");
			builder.put(grammarAccess.getScopeSpecificationAccess().getGroup_2_1(), "rule__ScopeSpecification__Group_2_1__0");
			builder.put(grammarAccess.getClassTypeScopeAccess().getGroup(), "rule__ClassTypeScope__Group__0");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getGroup(), "rule__ObjectTypeScope__Group__0");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getGroup(), "rule__IntegerTypeScope__Group__0");
			builder.put(grammarAccess.getRealTypeScopeAccess().getGroup(), "rule__RealTypeScope__Group__0");
			builder.put(grammarAccess.getStringTypeScopeAccess().getGroup(), "rule__StringTypeScope__Group__0");
			builder.put(grammarAccess.getClassReferenceAccess().getGroup(), "rule__ClassReference__Group__0");
			builder.put(grammarAccess.getObjectReferenceAccess().getGroup(), "rule__ObjectReference__Group__0");
			builder.put(grammarAccess.getIntegerReferenceAccess().getGroup(), "rule__IntegerReference__Group__0");
			builder.put(grammarAccess.getRealReferenceAccess().getGroup(), "rule__RealReference__Group__0");
			builder.put(grammarAccess.getStringReferenceAccess().getGroup(), "rule__StringReference__Group__0");
			builder.put(grammarAccess.getIntervallNumberAccess().getGroup(), "rule__IntervallNumber__Group__0");
			builder.put(grammarAccess.getIntEnumberationAccess().getGroup(), "rule__IntEnumberation__Group__0");
			builder.put(grammarAccess.getIntEnumberationAccess().getGroup_2(), "rule__IntEnumberation__Group_2__0");
			builder.put(grammarAccess.getIntEnumberationAccess().getGroup_2_1(), "rule__IntEnumberation__Group_2_1__0");
			builder.put(grammarAccess.getRealEnumerationAccess().getGroup(), "rule__RealEnumeration__Group__0");
			builder.put(grammarAccess.getRealEnumerationAccess().getGroup_2(), "rule__RealEnumeration__Group_2__0");
			builder.put(grammarAccess.getRealEnumerationAccess().getGroup_2_1(), "rule__RealEnumeration__Group_2_1__0");
			builder.put(grammarAccess.getStringEnumerationAccess().getGroup(), "rule__StringEnumeration__Group__0");
			builder.put(grammarAccess.getStringEnumerationAccess().getGroup_2(), "rule__StringEnumeration__Group_2__0");
			builder.put(grammarAccess.getStringEnumerationAccess().getGroup_2_1(), "rule__StringEnumeration__Group_2_1__0");
			builder.put(grammarAccess.getScopeDeclarationAccess().getGroup(), "rule__ScopeDeclaration__Group__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup(), "rule__GenerationTask__Group__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_0(), "rule__GenerationTask__Group_3_0__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_1(), "rule__GenerationTask__Group_3_1__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_2(), "rule__GenerationTask__Group_3_2__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_3(), "rule__GenerationTask__Group_3_3__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_4(), "rule__GenerationTask__Group_3_4__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_5(), "rule__GenerationTask__Group_3_5__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_6(), "rule__GenerationTask__Group_3_6__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_7(), "rule__GenerationTask__Group_3_7__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_8(), "rule__GenerationTask__Group_3_8__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_9(), "rule__GenerationTask__Group_3_9__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_10(), "rule__GenerationTask__Group_3_10__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_11(), "rule__GenerationTask__Group_3_11__0");
			builder.put(grammarAccess.getGenerationTaskAccess().getGroup_3_12(), "rule__GenerationTask__Group_3_12__0");
			builder.put(grammarAccess.getConfigurationScriptAccess().getImportsAssignment_0(), "rule__ConfigurationScript__ImportsAssignment_0");
			builder.put(grammarAccess.getConfigurationScriptAccess().getCommandsAssignment_1(), "rule__ConfigurationScript__CommandsAssignment_1");
			builder.put(grammarAccess.getEPackageImportAccess().getImportedPackageAssignment_2(), "rule__EPackageImport__ImportedPackageAssignment_2");
			builder.put(grammarAccess.getViatraImportAccess().getImportedViatraAssignment_2(), "rule__ViatraImport__ImportedViatraAssignment_2");
			builder.put(grammarAccess.getFileSpecificationAccess().getPathAssignment(), "rule__FileSpecification__PathAssignment");
			builder.put(grammarAccess.getFileDeclarationAccess().getNameAssignment_1(), "rule__FileDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getFileDeclarationAccess().getSpecificationAssignment_3(), "rule__FileDeclaration__SpecificationAssignment_3");
			builder.put(grammarAccess.getFileReferenceAccess().getReferredAssignment(), "rule__FileReference__ReferredAssignment");
			builder.put(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_1(), "rule__MetamodelSpecification__EntriesAssignment_1");
			builder.put(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_2_1(), "rule__MetamodelSpecification__EntriesAssignment_2_1");
			builder.put(grammarAccess.getAllPackageEntryAccess().getPackageAssignment_1(), "rule__AllPackageEntry__PackageAssignment_1");
			builder.put(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_2(), "rule__AllPackageEntry__ExclusionAssignment_2_2");
			builder.put(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_3_1(), "rule__AllPackageEntry__ExclusionAssignment_2_3_1");
			builder.put(grammarAccess.getMetamodelElementAccess().getPackageAssignment_0_0(), "rule__MetamodelElement__PackageAssignment_0_0");
			builder.put(grammarAccess.getMetamodelElementAccess().getClassifierAssignment_1(), "rule__MetamodelElement__ClassifierAssignment_1");
			builder.put(grammarAccess.getMetamodelElementAccess().getFeatureAssignment_2_1(), "rule__MetamodelElement__FeatureAssignment_2_1");
			builder.put(grammarAccess.getMetamodelDeclarationAccess().getNameAssignment_1(), "rule__MetamodelDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getMetamodelDeclarationAccess().getSpecificationAssignment_2(), "rule__MetamodelDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getMetamodelReferenceAccess().getReferredAssignment(), "rule__MetamodelReference__ReferredAssignment");
			builder.put(grammarAccess.getPartialModelSpecificationAccess().getEntryAssignment_1(), "rule__PartialModelSpecification__EntryAssignment_1");
			builder.put(grammarAccess.getPartialModelSpecificationAccess().getEntryAssignment_2_1(), "rule__PartialModelSpecification__EntryAssignment_2_1");
			builder.put(grammarAccess.getModelEntryAccess().getPathAssignment(), "rule__ModelEntry__PathAssignment");
			builder.put(grammarAccess.getFolderEntryAccess().getPathAssignment_1(), "rule__FolderEntry__PathAssignment_1");
			builder.put(grammarAccess.getFolderEntryAccess().getExclusionAssignment_2_2(), "rule__FolderEntry__ExclusionAssignment_2_2");
			builder.put(grammarAccess.getFolderEntryAccess().getExclusionAssignment_2_3_1(), "rule__FolderEntry__ExclusionAssignment_2_3_1");
			builder.put(grammarAccess.getPartialModelDeclarationAccess().getNameAssignment_1(), "rule__PartialModelDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getPartialModelDeclarationAccess().getSpecificationAssignment_2(), "rule__PartialModelDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getPartialModelReferenceAccess().getReferredAssignment(), "rule__PartialModelReference__ReferredAssignment");
			builder.put(grammarAccess.getPatternSpecificationAccess().getEntriesAssignment_1(), "rule__PatternSpecification__EntriesAssignment_1");
			builder.put(grammarAccess.getPatternSpecificationAccess().getEntriesAssignment_2_1(), "rule__PatternSpecification__EntriesAssignment_2_1");
			builder.put(grammarAccess.getAllPatternEntryAccess().getPackageAssignment_1(), "rule__AllPatternEntry__PackageAssignment_1");
			builder.put(grammarAccess.getAllPatternEntryAccess().getExclusuionAssignment_2_2(), "rule__AllPatternEntry__ExclusuionAssignment_2_2");
			builder.put(grammarAccess.getAllPatternEntryAccess().getExclusuionAssignment_2_3_1(), "rule__AllPatternEntry__ExclusuionAssignment_2_3_1");
			builder.put(grammarAccess.getPatternElementAccess().getPackageAssignment_0_0(), "rule__PatternElement__PackageAssignment_0_0");
			builder.put(grammarAccess.getPatternElementAccess().getPatternAssignment_1(), "rule__PatternElement__PatternAssignment_1");
			builder.put(grammarAccess.getGraphPatternDeclarationAccess().getNameAssignment_1(), "rule__GraphPatternDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getGraphPatternDeclarationAccess().getSpecificationAssignment_2(), "rule__GraphPatternDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getGraphPatternReferenceAccess().getReferredAssignment(), "rule__GraphPatternReference__ReferredAssignment");
			builder.put(grammarAccess.getObjectiveSpecificationAccess().getEntriesAssignment_1(), "rule__ObjectiveSpecification__EntriesAssignment_1");
			builder.put(grammarAccess.getObjectiveSpecificationAccess().getEntriesAssignment_2_1(), "rule__ObjectiveSpecification__EntriesAssignment_2_1");
			builder.put(grammarAccess.getOptimizationEntryAccess().getDirectionAssignment_0(), "rule__OptimizationEntry__DirectionAssignment_0");
			builder.put(grammarAccess.getOptimizationEntryAccess().getFunctionAssignment_1(), "rule__OptimizationEntry__FunctionAssignment_1");
			builder.put(grammarAccess.getThresholdEntryAccess().getFunctionAssignment_0(), "rule__ThresholdEntry__FunctionAssignment_0");
			builder.put(grammarAccess.getThresholdEntryAccess().getOperatorAssignment_1(), "rule__ThresholdEntry__OperatorAssignment_1");
			builder.put(grammarAccess.getThresholdEntryAccess().getThresholdAssignment_2(), "rule__ThresholdEntry__ThresholdAssignment_2");
			builder.put(grammarAccess.getCostObjectiveFunctionAccess().getEntriesAssignment_2(), "rule__CostObjectiveFunction__EntriesAssignment_2");
			builder.put(grammarAccess.getCostObjectiveFunctionAccess().getEntriesAssignment_3_1(), "rule__CostObjectiveFunction__EntriesAssignment_3_1");
			builder.put(grammarAccess.getCostEntryAccess().getPatternElementAssignment_0(), "rule__CostEntry__PatternElementAssignment_0");
			builder.put(grammarAccess.getCostEntryAccess().getWeightAssignment_2(), "rule__CostEntry__WeightAssignment_2");
			builder.put(grammarAccess.getObjectiveDeclarationAccess().getNameAssignment_1(), "rule__ObjectiveDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getObjectiveDeclarationAccess().getSpecificationAssignment_2(), "rule__ObjectiveDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getObjectiveReferenceAccess().getReferredAssignment(), "rule__ObjectiveReference__ReferredAssignment");
			builder.put(grammarAccess.getConfigSpecificationAccess().getEntriesAssignment_2_0(), "rule__ConfigSpecification__EntriesAssignment_2_0");
			builder.put(grammarAccess.getConfigSpecificationAccess().getEntriesAssignment_2_1_1(), "rule__ConfigSpecification__EntriesAssignment_2_1_1");
			builder.put(grammarAccess.getConfigDeclarationAccess().getNameAssignment_1(), "rule__ConfigDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getConfigDeclarationAccess().getSpecificationAssignment_2(), "rule__ConfigDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getDocumentationEntryAccess().getLevelAssignment_2(), "rule__DocumentationEntry__LevelAssignment_2");
			builder.put(grammarAccess.getRuntimeEntryAccess().getMillisecLimitAssignment_2(), "rule__RuntimeEntry__MillisecLimitAssignment_2");
			builder.put(grammarAccess.getMemoryEntryAccess().getMegabyteLimitAssignment_2(), "rule__MemoryEntry__MegabyteLimitAssignment_2");
			builder.put(grammarAccess.getCustomEntryAccess().getKeyAssignment_0(), "rule__CustomEntry__KeyAssignment_0");
			builder.put(grammarAccess.getCustomEntryAccess().getValueAssignment_2(), "rule__CustomEntry__ValueAssignment_2");
			builder.put(grammarAccess.getConfigReferenceAccess().getConfigAssignment(), "rule__ConfigReference__ConfigAssignment");
			builder.put(grammarAccess.getScopeSpecificationAccess().getScopesAssignment_2_0(), "rule__ScopeSpecification__ScopesAssignment_2_0");
			builder.put(grammarAccess.getScopeSpecificationAccess().getScopesAssignment_2_1_1(), "rule__ScopeSpecification__ScopesAssignment_2_1_1");
			builder.put(grammarAccess.getClassTypeScopeAccess().getTypeAssignment_1(), "rule__ClassTypeScope__TypeAssignment_1");
			builder.put(grammarAccess.getClassTypeScopeAccess().getSetsNewAssignment_2_0(), "rule__ClassTypeScope__SetsNewAssignment_2_0");
			builder.put(grammarAccess.getClassTypeScopeAccess().getSetsSumAssignment_2_1(), "rule__ClassTypeScope__SetsSumAssignment_2_1");
			builder.put(grammarAccess.getClassTypeScopeAccess().getNumberAssignment_3_0(), "rule__ClassTypeScope__NumberAssignment_3_0");
			builder.put(grammarAccess.getClassTypeScopeAccess().getNumberAssignment_3_1(), "rule__ClassTypeScope__NumberAssignment_3_1");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getTypeAssignment_1(), "rule__ObjectTypeScope__TypeAssignment_1");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getSetsNewAssignment_2_0(), "rule__ObjectTypeScope__SetsNewAssignment_2_0");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getSetsSumAssignment_2_1(), "rule__ObjectTypeScope__SetsSumAssignment_2_1");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getNumberAssignment_3_0(), "rule__ObjectTypeScope__NumberAssignment_3_0");
			builder.put(grammarAccess.getObjectTypeScopeAccess().getNumberAssignment_3_1(), "rule__ObjectTypeScope__NumberAssignment_3_1");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getTypeAssignment_1(), "rule__IntegerTypeScope__TypeAssignment_1");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getSetsNewAssignment_2_0(), "rule__IntegerTypeScope__SetsNewAssignment_2_0");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getSetsSumAssignment_2_1(), "rule__IntegerTypeScope__SetsSumAssignment_2_1");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getNumberAssignment_3_0(), "rule__IntegerTypeScope__NumberAssignment_3_0");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getNumberAssignment_3_1(), "rule__IntegerTypeScope__NumberAssignment_3_1");
			builder.put(grammarAccess.getIntegerTypeScopeAccess().getNumberAssignment_3_2(), "rule__IntegerTypeScope__NumberAssignment_3_2");
			builder.put(grammarAccess.getRealTypeScopeAccess().getTypeAssignment_1(), "rule__RealTypeScope__TypeAssignment_1");
			builder.put(grammarAccess.getRealTypeScopeAccess().getSetsNewAssignment_2_0(), "rule__RealTypeScope__SetsNewAssignment_2_0");
			builder.put(grammarAccess.getRealTypeScopeAccess().getSetsSumAssignment_2_1(), "rule__RealTypeScope__SetsSumAssignment_2_1");
			builder.put(grammarAccess.getRealTypeScopeAccess().getNumberAssignment_3_0(), "rule__RealTypeScope__NumberAssignment_3_0");
			builder.put(grammarAccess.getRealTypeScopeAccess().getNumberAssignment_3_1(), "rule__RealTypeScope__NumberAssignment_3_1");
			builder.put(grammarAccess.getRealTypeScopeAccess().getNumberAssignment_3_2(), "rule__RealTypeScope__NumberAssignment_3_2");
			builder.put(grammarAccess.getStringTypeScopeAccess().getTypeAssignment_1(), "rule__StringTypeScope__TypeAssignment_1");
			builder.put(grammarAccess.getStringTypeScopeAccess().getSetsNewAssignment_2_0(), "rule__StringTypeScope__SetsNewAssignment_2_0");
			builder.put(grammarAccess.getStringTypeScopeAccess().getSetsSumAssignment_2_1(), "rule__StringTypeScope__SetsSumAssignment_2_1");
			builder.put(grammarAccess.getStringTypeScopeAccess().getNumberAssignment_3_0(), "rule__StringTypeScope__NumberAssignment_3_0");
			builder.put(grammarAccess.getStringTypeScopeAccess().getNumberAssignment_3_1(), "rule__StringTypeScope__NumberAssignment_3_1");
			builder.put(grammarAccess.getStringTypeScopeAccess().getNumberAssignment_3_2(), "rule__StringTypeScope__NumberAssignment_3_2");
			builder.put(grammarAccess.getClassReferenceAccess().getElementAssignment_1(), "rule__ClassReference__ElementAssignment_1");
			builder.put(grammarAccess.getExactNumberAccess().getExactNumberAssignment_0(), "rule__ExactNumber__ExactNumberAssignment_0");
			builder.put(grammarAccess.getExactNumberAccess().getExactUnlimitedAssignment_1(), "rule__ExactNumber__ExactUnlimitedAssignment_1");
			builder.put(grammarAccess.getIntervallNumberAccess().getMinAssignment_0(), "rule__IntervallNumber__MinAssignment_0");
			builder.put(grammarAccess.getIntervallNumberAccess().getMaxNumberAssignment_2_0(), "rule__IntervallNumber__MaxNumberAssignment_2_0");
			builder.put(grammarAccess.getIntervallNumberAccess().getMaxUnlimitedAssignment_2_1(), "rule__IntervallNumber__MaxUnlimitedAssignment_2_1");
			builder.put(grammarAccess.getIntEnumberationAccess().getEntryAssignment_2_0(), "rule__IntEnumberation__EntryAssignment_2_0");
			builder.put(grammarAccess.getIntEnumberationAccess().getEntryAssignment_2_1_1(), "rule__IntEnumberation__EntryAssignment_2_1_1");
			builder.put(grammarAccess.getRealEnumerationAccess().getEntryAssignment_2_0(), "rule__RealEnumeration__EntryAssignment_2_0");
			builder.put(grammarAccess.getRealEnumerationAccess().getEntryAssignment_2_1_1(), "rule__RealEnumeration__EntryAssignment_2_1_1");
			builder.put(grammarAccess.getStringEnumerationAccess().getEntryAssignment_2_0(), "rule__StringEnumeration__EntryAssignment_2_0");
			builder.put(grammarAccess.getStringEnumerationAccess().getEntryAssignment_2_1_1(), "rule__StringEnumeration__EntryAssignment_2_1_1");
			builder.put(grammarAccess.getScopeDeclarationAccess().getNameAssignment_1(), "rule__ScopeDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getScopeDeclarationAccess().getSpecificationAssignment_2(), "rule__ScopeDeclaration__SpecificationAssignment_2");
			builder.put(grammarAccess.getScopeReferenceAccess().getReferredAssignment(), "rule__ScopeReference__ReferredAssignment");
			builder.put(grammarAccess.getGenerationTaskAccess().getMetamodelAssignment_3_0_2(), "rule__GenerationTask__MetamodelAssignment_3_0_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getPartialModelAssignment_3_1_2(), "rule__GenerationTask__PartialModelAssignment_3_1_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getPatternsAssignment_3_2_2(), "rule__GenerationTask__PatternsAssignment_3_2_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getObjectivesAssignment_3_3_2(), "rule__GenerationTask__ObjectivesAssignment_3_3_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getScopeAssignment_3_4_2(), "rule__GenerationTask__ScopeAssignment_3_4_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getNumberSpecifiedAssignment_3_5_0(), "rule__GenerationTask__NumberSpecifiedAssignment_3_5_0");
			builder.put(grammarAccess.getGenerationTaskAccess().getNumberAssignment_3_5_2(), "rule__GenerationTask__NumberAssignment_3_5_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getRunSpecifiedAssignment_3_6_0(), "rule__GenerationTask__RunSpecifiedAssignment_3_6_0");
			builder.put(grammarAccess.getGenerationTaskAccess().getRunsAssignment_3_6_2(), "rule__GenerationTask__RunsAssignment_3_6_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getSolverAssignment_3_7_2(), "rule__GenerationTask__SolverAssignment_3_7_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getConfigAssignment_3_8_2(), "rule__GenerationTask__ConfigAssignment_3_8_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getDebugFolderAssignment_3_9_2(), "rule__GenerationTask__DebugFolderAssignment_3_9_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getTargetLogFileAssignment_3_10_2(), "rule__GenerationTask__TargetLogFileAssignment_3_10_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getTargetStatisticsFileAssignment_3_11_2(), "rule__GenerationTask__TargetStatisticsFileAssignment_3_11_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getTagetFolderAssignment_3_12_2(), "rule__GenerationTask__TagetFolderAssignment_3_12_2");
			builder.put(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), "rule__GenerationTask__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ApplicationConfigurationGrammarAccess grammarAccess;

	@Override
	protected InternalApplicationConfigurationParser createParser() {
		InternalApplicationConfigurationParser result = new InternalApplicationConfigurationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ApplicationConfigurationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ApplicationConfigurationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
