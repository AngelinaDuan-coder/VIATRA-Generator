/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileDeclaration;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.FileDeclarationImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileDeclarationImpl extends DeclarationImpl implements FileDeclaration
{
  /**
   * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecification()
   * @generated
   * @ordered
   */
  protected FileSpecification specification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileDeclarationImpl()
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
    return ApplicationConfigurationPackage.Literals.FILE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileSpecification getSpecification()
  {
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecification(FileSpecification newSpecification, NotificationChain msgs)
  {
    FileSpecification oldSpecification = specification;
    specification = newSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION, oldSpecification, newSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSpecification(FileSpecification newSpecification)
  {
    if (newSpecification != specification)
    {
      NotificationChain msgs = null;
      if (specification != null)
        msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION, null, msgs);
      if (newSpecification != null)
        msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION, null, msgs);
      msgs = basicSetSpecification(newSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION, newSpecification, newSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION:
        return basicSetSpecification(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION:
        return getSpecification();
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
      case ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION:
        setSpecification((FileSpecification)newValue);
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
      case ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION:
        setSpecification((FileSpecification)null);
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
      case ApplicationConfigurationPackage.FILE_DECLARATION__SPECIFICATION:
        return specification != null;
    }
    return super.eIsSet(featureID);
  }

} //FileDeclarationImpl
