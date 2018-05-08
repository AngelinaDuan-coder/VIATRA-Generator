/**
 * generated by Xtext 2.12.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Pattern Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPatternEntry#getExclusuion <em>Exclusuion</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getAllPatternEntry()
 * @model
 * @generated
 */
public interface AllPatternEntry extends PatternEntry
{
  /**
   * Returns the value of the '<em><b>Exclusuion</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclusuion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclusuion</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getAllPatternEntry_Exclusuion()
   * @model containment="true"
   * @generated
   */
  EList<PatternElement> getExclusuion();

} // AllPatternEntry
