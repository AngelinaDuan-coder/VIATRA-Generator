/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.EPackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageImportImpl extends ImportImpl implements EPackageImport
{
  /**
   * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedPackage()
   * @generated
   * @ordered
   */
  protected EPackage importedPackage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPackageImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationConfigurationPackage.Literals.EPACKAGE_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPackage getImportedPackage()
  {
    if (importedPackage != null && importedPackage.eIsProxy())
    {
      InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
      importedPackage = (EPackage)eResolveProxy(oldImportedPackage);
      if (importedPackage != oldImportedPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
      }
    }
    return importedPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetImportedPackage()
  {
    return importedPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportedPackage(EPackage newImportedPackage)
  {
    EPackage oldImportedPackage = importedPackage;
    importedPackage = newImportedPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE:
        if (resolve) return getImportedPackage();
        return basicGetImportedPackage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE:
        setImportedPackage((EPackage)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE:
        setImportedPackage((EPackage)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.EPACKAGE_IMPORT__IMPORTED_PACKAGE:
        return importedPackage != null;
    }
    return super.eIsSet(featureID);
  }

} //EPackageImportImpl
