/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Dependent;
import TaxationWithRoot.External_Allowance;
import TaxationWithRoot.Grantor;
import TaxationWithRoot.Physical_Person;
import TaxationWithRoot.TaxationWithRootPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Allowance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getGrantor <em>Grantor</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getStarting_year <em>Starting year</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getEnding_year <em>Ending year</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getReciver <em>Reciver</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getId5 <em>Id5</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.External_AllowanceImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class External_AllowanceImpl extends MinimalEObjectImpl.Container implements External_Allowance {
	/**
	 * The default value of the '{@link #getGrantor() <em>Grantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantor()
	 * @generated
	 * @ordered
	 */
	protected static final Grantor GRANTOR_EDEFAULT = Grantor.WWW;

	/**
	 * The cached value of the '{@link #getGrantor() <em>Grantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantor()
	 * @generated
	 * @ordered
	 */
	protected Grantor grantor = GRANTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarting_year() <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarting_year()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTING_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStarting_year() <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarting_year()
	 * @generated
	 * @ordered
	 */
	protected int starting_year = STARTING_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnding_year() <em>Ending year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding_year()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDING_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnding_year() <em>Ending year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding_year()
	 * @generated
	 * @ordered
	 */
	protected int ending_year = ENDING_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReciver() <em>Reciver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReciver()
	 * @generated
	 * @ordered
	 */
	protected Physical_Person reciver;

	/**
	 * The default value of the '{@link #getId5() <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId5()
	 * @generated
	 * @ordered
	 */
	protected static final String ID5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId5() <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId5()
	 * @generated
	 * @ordered
	 */
	protected String id5 = ID5_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected External_AllowanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationWithRootPackage.Literals.EXTERNAL_ALLOWANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grantor getGrantor() {
		return grantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrantor(Grantor newGrantor) {
		Grantor oldGrantor = grantor;
		grantor = newGrantor == null ? GRANTOR_EDEFAULT : newGrantor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__GRANTOR, oldGrantor, grantor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStarting_year() {
		return starting_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarting_year(int newStarting_year) {
		int oldStarting_year = starting_year;
		starting_year = newStarting_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__STARTING_YEAR, oldStarting_year, starting_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnding_year() {
		return ending_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnding_year(int newEnding_year) {
		int oldEnding_year = ending_year;
		ending_year = newEnding_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ENDING_YEAR, oldEnding_year, ending_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical_Person getReciver() {
		if (reciver != null && reciver.eIsProxy()) {
			InternalEObject oldReciver = (InternalEObject)reciver;
			reciver = (Physical_Person)eResolveProxy(oldReciver);
			if (reciver != oldReciver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER, oldReciver, reciver));
			}
		}
		return reciver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical_Person basicGetReciver() {
		return reciver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReciver(Physical_Person newReciver) {
		Physical_Person oldReciver = reciver;
		reciver = newReciver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER, oldReciver, reciver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId5() {
		return id5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId5(String newId5) {
		String oldId5 = id5;
		id5 = newId5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ID5, oldId5, id5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependent getPerson() {
		if (eContainerFeatureID() != TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON) return null;
		return (Dependent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Dependent newPerson, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPerson, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Dependent newPerson) {
		if (newPerson != eInternalContainer() || (eContainerFeatureID() != TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON && newPerson != null)) {
			if (EcoreUtil.isAncestor(this, newPerson))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, TaxationWithRootPackage.DEPENDENT__ALLOWANCES, Dependent.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPerson((Dependent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				return basicSetPerson(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				return eInternalContainer().eInverseRemove(this, TaxationWithRootPackage.DEPENDENT__ALLOWANCES, Dependent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__GRANTOR:
				return getGrantor();
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__STARTING_YEAR:
				return getStarting_year();
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ENDING_YEAR:
				return getEnding_year();
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER:
				if (resolve) return getReciver();
				return basicGetReciver();
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ID5:
				return getId5();
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				return getPerson();
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
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__GRANTOR:
				setGrantor((Grantor)newValue);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__STARTING_YEAR:
				setStarting_year((Integer)newValue);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ENDING_YEAR:
				setEnding_year((Integer)newValue);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER:
				setReciver((Physical_Person)newValue);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ID5:
				setId5((String)newValue);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				setPerson((Dependent)newValue);
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
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__GRANTOR:
				setGrantor(GRANTOR_EDEFAULT);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__STARTING_YEAR:
				setStarting_year(STARTING_YEAR_EDEFAULT);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ENDING_YEAR:
				setEnding_year(ENDING_YEAR_EDEFAULT);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER:
				setReciver((Physical_Person)null);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ID5:
				setId5(ID5_EDEFAULT);
				return;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				setPerson((Dependent)null);
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
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__GRANTOR:
				return grantor != GRANTOR_EDEFAULT;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__STARTING_YEAR:
				return starting_year != STARTING_YEAR_EDEFAULT;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ENDING_YEAR:
				return ending_year != ENDING_YEAR_EDEFAULT;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__RECIVER:
				return reciver != null;
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__ID5:
				return ID5_EDEFAULT == null ? id5 != null : !ID5_EDEFAULT.equals(id5);
			case TaxationWithRootPackage.EXTERNAL_ALLOWANCE__PERSON:
				return getPerson() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (grantor: ");
		result.append(grantor);
		result.append(", starting_year: ");
		result.append(starting_year);
		result.append(", ending_year: ");
		result.append(ending_year);
		result.append(", id5: ");
		result.append(id5);
		result.append(')');
		return result.toString();
	}

} //External_AllowanceImpl
