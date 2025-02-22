/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GraphPatternDeclaration;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GraphPatternReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Pattern Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.GraphPatternReferenceImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphPatternReferenceImpl extends GraphPatternImpl implements GraphPatternReference
{
  /**
   * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferred()
   * @generated
   * @ordered
   */
  protected GraphPatternDeclaration referred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphPatternReferenceImpl()
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
    return ApplicationConfigurationPackage.Literals.GRAPH_PATTERN_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GraphPatternDeclaration getReferred()
  {
    if (referred != null && referred.eIsProxy())
    {
      InternalEObject oldReferred = (InternalEObject)referred;
      referred = (GraphPatternDeclaration)eResolveProxy(oldReferred);
      if (referred != oldReferred)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED, oldReferred, referred));
      }
    }
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphPatternDeclaration basicGetReferred()
  {
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferred(GraphPatternDeclaration newReferred)
  {
    GraphPatternDeclaration oldReferred = referred;
    referred = newReferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED, oldReferred, referred));
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
      case ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED:
        if (resolve) return getReferred();
        return basicGetReferred();
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
      case ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED:
        setReferred((GraphPatternDeclaration)newValue);
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
      case ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED:
        setReferred((GraphPatternDeclaration)null);
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
      case ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE__REFERRED:
        return referred != null;
    }
    return super.eIsSet(featureID);
  }

} //GraphPatternReferenceImpl
