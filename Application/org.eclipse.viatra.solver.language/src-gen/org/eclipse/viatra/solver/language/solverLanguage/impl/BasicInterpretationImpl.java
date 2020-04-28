/**
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.solverLanguage.BasicInterpretation;
import org.eclipse.viatra.solver.language.solverLanguage.ComplexObject;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Symbol;
import org.eclipse.viatra.solver.language.solverLanguage.TruthValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BasicInterpretationImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BasicInterpretationImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BasicInterpretationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicInterpretationImpl extends InterpretationImpl implements BasicInterpretation
{
  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected Symbol symbol;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<ComplexObject> objects;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TruthValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicInterpretationImpl()
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
    return SolverLanguagePackage.Literals.BASIC_INTERPRETATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Symbol getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbol(Symbol newSymbol, NotificationChain msgs)
  {
    Symbol oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL, oldSymbol, newSymbol);
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
  public void setSymbol(Symbol newSymbol)
  {
    if (newSymbol != symbol)
    {
      NotificationChain msgs = null;
      if (symbol != null)
        msgs = ((InternalEObject)symbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL, null, msgs);
      if (newSymbol != null)
        msgs = ((InternalEObject)newSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL, null, msgs);
      msgs = basicSetSymbol(newSymbol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL, newSymbol, newSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComplexObject> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<ComplexObject>(ComplexObject.class, this, SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TruthValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TruthValue newValue, NotificationChain msgs)
  {
    TruthValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.BASIC_INTERPRETATION__VALUE, oldValue, newValue);
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
  public void setValue(TruthValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.BASIC_INTERPRETATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.BASIC_INTERPRETATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.BASIC_INTERPRETATION__VALUE, newValue, newValue));
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
      case SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL:
        return basicSetSymbol(null, msgs);
      case SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case SolverLanguagePackage.BASIC_INTERPRETATION__VALUE:
        return basicSetValue(null, msgs);
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
      case SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL:
        return getSymbol();
      case SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS:
        return getObjects();
      case SolverLanguagePackage.BASIC_INTERPRETATION__VALUE:
        return getValue();
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
      case SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL:
        setSymbol((Symbol)newValue);
        return;
      case SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends ComplexObject>)newValue);
        return;
      case SolverLanguagePackage.BASIC_INTERPRETATION__VALUE:
        setValue((TruthValue)newValue);
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
      case SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL:
        setSymbol((Symbol)null);
        return;
      case SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS:
        getObjects().clear();
        return;
      case SolverLanguagePackage.BASIC_INTERPRETATION__VALUE:
        setValue((TruthValue)null);
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
      case SolverLanguagePackage.BASIC_INTERPRETATION__SYMBOL:
        return symbol != null;
      case SolverLanguagePackage.BASIC_INTERPRETATION__OBJECTS:
        return objects != null && !objects.isEmpty();
      case SolverLanguagePackage.BASIC_INTERPRETATION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //BasicInterpretationImpl
