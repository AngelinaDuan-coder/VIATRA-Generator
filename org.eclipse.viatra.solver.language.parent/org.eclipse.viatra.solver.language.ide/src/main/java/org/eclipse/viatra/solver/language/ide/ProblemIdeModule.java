/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.viatra.solver.language.ide;

import org.eclipse.viatra.solver.language.ide.syntaxcoloring.ProblemSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register ide components.
 */
public class ProblemIdeModule extends AbstractProblemIdeModule {

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return ProblemSemanticHighlightingCalculator.class;
	}
}
