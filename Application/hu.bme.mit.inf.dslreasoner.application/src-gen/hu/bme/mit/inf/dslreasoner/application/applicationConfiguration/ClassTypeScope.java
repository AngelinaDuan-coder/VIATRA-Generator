/**
 * generated by Xtext 2.12.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ClassTypeScope#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getClassTypeScope()
 * @model
 * @generated
 */
public interface ClassTypeScope extends TypeScope
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ClassReference)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getClassTypeScope_Type()
   * @model containment="true"
   * @generated
   */
  ClassReference getType();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ClassTypeScope#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ClassReference value);

} // ClassTypeScope
