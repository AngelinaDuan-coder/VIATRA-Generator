/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Allowance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.External_Allowance#getGrantor <em>Grantor</em>}</li>
 *   <li>{@link TaxationWithRoot.External_Allowance#getStarting_year <em>Starting year</em>}</li>
 *   <li>{@link TaxationWithRoot.External_Allowance#getEnding_year <em>Ending year</em>}</li>
 *   <li>{@link TaxationWithRoot.External_Allowance#getReciver <em>Reciver</em>}</li>
 *   <li>{@link TaxationWithRoot.External_Allowance#getId5 <em>Id5</em>}</li>
 *   <li>{@link TaxationWithRoot.External_Allowance#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance()
 * @model
 * @generated
 */
public interface External_Allowance extends EObject {
	/**
	 * Returns the value of the '<em><b>Grantor</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Grantor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grantor</em>' attribute.
	 * @see TaxationWithRoot.Grantor
	 * @see #setGrantor(Grantor)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Grantor()
	 * @model required="true"
	 * @generated
	 */
	Grantor getGrantor();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getGrantor <em>Grantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grantor</em>' attribute.
	 * @see TaxationWithRoot.Grantor
	 * @see #getGrantor()
	 * @generated
	 */
	void setGrantor(Grantor value);

	/**
	 * Returns the value of the '<em><b>Starting year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting year</em>' attribute.
	 * @see #setStarting_year(int)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Starting_year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStarting_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getStarting_year <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting year</em>' attribute.
	 * @see #getStarting_year()
	 * @generated
	 */
	void setStarting_year(int value);

	/**
	 * Returns the value of the '<em><b>Ending year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending year</em>' attribute.
	 * @see #setEnding_year(int)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Ending_year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getEnding_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getEnding_year <em>Ending year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending year</em>' attribute.
	 * @see #getEnding_year()
	 * @generated
	 */
	void setEnding_year(int value);

	/**
	 * Returns the value of the '<em><b>Reciver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciver</em>' reference.
	 * @see #setReciver(Physical_Person)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Reciver()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Physical_Person getReciver();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getReciver <em>Reciver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reciver</em>' reference.
	 * @see #getReciver()
	 * @generated
	 */
	void setReciver(Physical_Person value);

	/**
	 * Returns the value of the '<em><b>Id5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id5</em>' attribute.
	 * @see #setId5(String)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Id5()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId5();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getId5 <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id5</em>' attribute.
	 * @see #getId5()
	 * @generated
	 */
	void setId5(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Dependent#getAllowances <em>Allowances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' container reference.
	 * @see #setPerson(Dependent)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExternal_Allowance_Person()
	 * @see TaxationWithRoot.Dependent#getAllowances
	 * @model opposite="allowances" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dependent getPerson();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.External_Allowance#getPerson <em>Person</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' container reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Dependent value);

} // External_Allowance
