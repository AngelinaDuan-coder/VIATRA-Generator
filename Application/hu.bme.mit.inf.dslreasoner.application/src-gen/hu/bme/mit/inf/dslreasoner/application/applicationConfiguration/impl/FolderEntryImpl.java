/**
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FolderEntry;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ModelEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.FolderEntryImpl#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderEntryImpl extends PartialModelEntryImpl implements FolderEntry
{
  /**
   * The cached value of the '{@link #getExclusion() <em>Exclusion</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusion()
   * @generated
   * @ordered
   */
  protected EList<ModelEntry> exclusion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FolderEntryImpl()
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
    return ApplicationConfigurationPackage.Literals.FOLDER_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelEntry> getExclusion()
  {
    if (exclusion == null)
    {
      exclusion = new EObjectContainmentEList<ModelEntry>(ModelEntry.class, this, ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION);
    }
    return exclusion;
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
      case ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION:
        return ((InternalEList<?>)getExclusion()).basicRemove(otherEnd, msgs);
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
      case ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION:
        return getExclusion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION:
        getExclusion().clear();
        getExclusion().addAll((Collection<? extends ModelEntry>)newValue);
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
      case ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION:
        getExclusion().clear();
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
      case ApplicationConfigurationPackage.FOLDER_ENTRY__EXCLUSION:
        return exclusion != null && !exclusion.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FolderEntryImpl
