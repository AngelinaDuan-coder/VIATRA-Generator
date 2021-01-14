/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectiveEntry#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getObjectiveEntry()
 * @model
 * @generated
 */
public interface ObjectiveEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(ObjectiveFunction)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getObjectiveEntry_Function()
   * @model containment="true"
   * @generated
   */
  ObjectiveFunction getFunction();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectiveEntry#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(ObjectiveFunction value);

} // ObjectiveEntry
