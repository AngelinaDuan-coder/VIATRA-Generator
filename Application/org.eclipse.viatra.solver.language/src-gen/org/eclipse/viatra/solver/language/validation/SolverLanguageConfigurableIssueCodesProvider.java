/*
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.validation;

import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;
import org.eclipse.xtext.validation.SeverityConverter;

@SuppressWarnings("restriction")
public class SolverLanguageConfigurableIssueCodesProvider extends ConfigurableIssueCodesProvider {
	protected static final String ISSUE_CODE_PREFIX = "org.eclipse.viatra.solver.language.";

	public static final String DEPRECATED_MODEL_PART = ISSUE_CODE_PREFIX + "deprecatedModelPart";

	@Override
	protected void initialize(IAcceptor<PreferenceKey> acceptor) {
		super.initialize(acceptor);
		acceptor.accept(create(DEPRECATED_MODEL_PART, SeverityConverter.SEVERITY_WARNING));
	}
}
