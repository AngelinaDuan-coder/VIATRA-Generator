/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.RealConstant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.RealConstantImpl#getRealValue <em>Real Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealConstantImpl extends ConstantImpl implements RealConstant {
	/**
	 * The default value of the '{@link #getRealValue() <em>Real Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValue()
	 * @generated
	 * @ordered
	 */
	protected static final double REAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRealValue() <em>Real Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValue()
	 * @generated
	 * @ordered
	 */
	protected double realValue = REAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.REAL_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRealValue() {
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealValue(double newRealValue) {
		double oldRealValue = realValue;
		realValue = newRealValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.REAL_CONSTANT__REAL_VALUE,
					oldRealValue, realValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProblemPackage.REAL_CONSTANT__REAL_VALUE:
			return getRealValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProblemPackage.REAL_CONSTANT__REAL_VALUE:
			setRealValue((Double) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProblemPackage.REAL_CONSTANT__REAL_VALUE:
			setRealValue(REAL_VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProblemPackage.REAL_CONSTANT__REAL_VALUE:
			return realValue != REAL_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (realValue: ");
		result.append(realValue);
		result.append(')');
		return result.toString();
	}

} //RealConstantImpl
