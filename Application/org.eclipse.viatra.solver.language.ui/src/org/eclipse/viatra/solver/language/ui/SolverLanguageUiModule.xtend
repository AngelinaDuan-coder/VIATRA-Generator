/*
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.syntaxcoloring.ITextAttributeProvider
import org.eclipse.viatra.solver.language.ui.highlight.SolverSemanticHighlightCalculator
import org.eclipse.viatra.solver.language.ui.highlight.SolverSemanticTextAttributeProvider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SolverLanguageUiModule extends AbstractSolverLanguageUiModule {
	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		SolverSemanticHighlightCalculator
	}
	
	def Class<? extends ITextAttributeProvider> bindITextAttributeProvider() {
		SolverSemanticTextAttributeProvider
	}
}
