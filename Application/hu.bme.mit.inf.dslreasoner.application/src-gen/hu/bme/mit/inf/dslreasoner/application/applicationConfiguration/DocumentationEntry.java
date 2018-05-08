/**
 * generated by Xtext 2.12.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentationEntry#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getDocumentationEntry()
 * @model
 * @generated
 */
public interface DocumentationEntry extends ConfigEntry
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentLevelSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentLevelSpecification
   * @see #setLevel(DocumentLevelSpecification)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getDocumentationEntry_Level()
   * @model
   * @generated
   */
  DocumentLevelSpecification getLevel();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentationEntry#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentLevelSpecification
   * @see #getLevel()
   * @generated
   */
  void setLevel(DocumentLevelSpecification value);

} // DocumentationEntry
