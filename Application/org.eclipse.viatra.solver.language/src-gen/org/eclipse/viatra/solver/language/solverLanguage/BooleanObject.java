/**
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.solverLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.BooleanObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBooleanObject()
 * @model
 * @generated
 */
public interface BooleanObject extends DataObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BooleanValue)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBooleanObject_Value()
   * @model containment="true"
   * @generated
   */
  BooleanValue getValue();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.BooleanObject#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanValue value);

} // BooleanObject
