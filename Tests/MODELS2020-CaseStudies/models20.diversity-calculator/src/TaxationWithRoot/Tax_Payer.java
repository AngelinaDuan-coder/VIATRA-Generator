/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Payer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Tax_Payer#getDependents <em>Dependents</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Payer#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Payer#getIncomes <em>Incomes</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Payer#getFrom_law <em>From law</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getTax_Payer()
 * @model abstract="true"
 *        annotation="duplicates"
 * @generated
 */
public interface Tax_Payer extends Physical_Person, Tax_Case {
	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Dependent}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Dependent#getResponsible_person <em>Responsible person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependents</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationWithRootPackage#getTax_Payer_Dependents()
	 * @see TaxationWithRoot.Dependent#getResponsible_person
	 * @model opposite="responsible_person" containment="true" upper="6" ordered="false"
	 * @generated
	 */
	EList<Dependent> getDependents();

	/**
	 * Returns the value of the '<em><b>From agent</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.FromAgent#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From agent</em>' containment reference.
	 * @see #setFrom_agent(FromAgent)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getTax_Payer_From_agent()
	 * @see TaxationWithRoot.FromAgent#getTaxPayer
	 * @model opposite="taxPayer" containment="true" required="true"
	 * @generated
	 */
	FromAgent getFrom_agent();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Payer#getFrom_agent <em>From agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From agent</em>' containment reference.
	 * @see #getFrom_agent()
	 * @generated
	 */
	void setFrom_agent(FromAgent value);

	/**
	 * Returns the value of the '<em><b>Incomes</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Income}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomes</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationWithRootPackage#getTax_Payer_Incomes()
	 * @see TaxationWithRoot.Income#getTaxPayer
	 * @model opposite="taxPayer" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Income> getIncomes();

	/**
	 * Returns the value of the '<em><b>From law</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.FromLaw#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From law</em>' containment reference.
	 * @see #setFrom_law(FromLaw)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getTax_Payer_From_law()
	 * @see TaxationWithRoot.FromLaw#getTaxPayer
	 * @model opposite="taxPayer" containment="true" required="true"
	 * @generated
	 */
	FromLaw getFrom_law();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Payer#getFrom_law <em>From law</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From law</em>' containment reference.
	 * @see #getFrom_law()
	 * @generated
	 */
	void setFrom_law(FromLaw value);

} // Tax_Payer
