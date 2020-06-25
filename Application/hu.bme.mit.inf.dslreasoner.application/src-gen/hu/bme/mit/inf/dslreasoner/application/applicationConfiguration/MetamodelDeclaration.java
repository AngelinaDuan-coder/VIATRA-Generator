/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelDeclaration#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getMetamodelDeclaration()
 * @model
 * @generated
 */
public interface MetamodelDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' containment reference.
   * @see #setSpecification(MetamodelSpecification)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getMetamodelDeclaration_Specification()
   * @model containment="true"
   * @generated
   */
  MetamodelSpecification getSpecification();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelDeclaration#getSpecification <em>Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' containment reference.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(MetamodelSpecification value);

} // MetamodelDeclaration
