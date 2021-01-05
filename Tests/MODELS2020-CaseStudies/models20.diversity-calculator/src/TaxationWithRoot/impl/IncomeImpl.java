/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Expense;
import TaxationWithRoot.Income;
import TaxationWithRoot.Income_Detail;
import TaxationWithRoot.Income_Type;
import TaxationWithRoot.Tax_Card;
import TaxationWithRoot.Tax_Payer;
import TaxationWithRoot.TaxationWithRootPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getIncome_amount <em>Income amount</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getIncome_type <em>Income type</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getTax_card <em>Tax card</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getTax_liability <em>Tax liability</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getNum <em>Num</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.IncomeImpl#getExpenses <em>Expenses</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IncomeImpl extends MinimalEObjectImpl.Container implements Income {
	/**
	 * The default value of the '{@link #getIncome_amount() <em>Income amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double INCOME_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncome_amount() <em>Income amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome_amount()
	 * @generated
	 * @ordered
	 */
	protected double income_amount = INCOME_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncome_type() <em>Income type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome_type()
	 * @generated
	 * @ordered
	 */
	protected Income_Type income_type;

	/**
	 * The cached value of the '{@link #getTax_card() <em>Tax card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_card()
	 * @generated
	 * @ordered
	 */
	protected Tax_Card tax_card;

	/**
	 * The default value of the '{@link #getTax_liability() <em>Tax liability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_liability()
	 * @generated
	 * @ordered
	 */
	protected static final double TAX_LIABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTax_liability() <em>Tax liability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_liability()
	 * @generated
	 * @ordered
	 */
	protected double tax_liability = TAX_LIABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<Income_Detail> details;

	/**
	 * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected int num = NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpenses() <em>Expenses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Expense> expenses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationWithRootPackage.Literals.INCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIncome_amount() {
		return income_amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome_amount(double newIncome_amount) {
		double oldIncome_amount = income_amount;
		income_amount = newIncome_amount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__INCOME_AMOUNT, oldIncome_amount, income_amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income_Type getIncome_type() {
		return income_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome_type(Income_Type newIncome_type, NotificationChain msgs) {
		Income_Type oldIncome_type = income_type;
		income_type = newIncome_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__INCOME_TYPE, oldIncome_type, newIncome_type);
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
	public void setIncome_type(Income_Type newIncome_type) {
		if (newIncome_type != income_type) {
			NotificationChain msgs = null;
			if (income_type != null)
				msgs = ((InternalEObject)income_type).eInverseRemove(this, TaxationWithRootPackage.INCOME_TYPE__INCOME, Income_Type.class, msgs);
			if (newIncome_type != null)
				msgs = ((InternalEObject)newIncome_type).eInverseAdd(this, TaxationWithRootPackage.INCOME_TYPE__INCOME, Income_Type.class, msgs);
			msgs = basicSetIncome_type(newIncome_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__INCOME_TYPE, newIncome_type, newIncome_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card getTax_card() {
		return tax_card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax_card(Tax_Card newTax_card, NotificationChain msgs) {
		Tax_Card oldTax_card = tax_card;
		tax_card = newTax_card;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__TAX_CARD, oldTax_card, newTax_card);
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
	public void setTax_card(Tax_Card newTax_card) {
		if (newTax_card != tax_card) {
			NotificationChain msgs = null;
			if (tax_card != null)
				msgs = ((InternalEObject)tax_card).eInverseRemove(this, TaxationWithRootPackage.TAX_CARD__INCOME, Tax_Card.class, msgs);
			if (newTax_card != null)
				msgs = ((InternalEObject)newTax_card).eInverseAdd(this, TaxationWithRootPackage.TAX_CARD__INCOME, Tax_Card.class, msgs);
			msgs = basicSetTax_card(newTax_card, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__TAX_CARD, newTax_card, newTax_card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTax_liability() {
		return tax_liability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_liability(double newTax_liability) {
		double oldTax_liability = tax_liability;
		tax_liability = newTax_liability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__TAX_LIABILITY, oldTax_liability, tax_liability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Payer getTaxPayer() {
		if (eContainerFeatureID() != TaxationWithRootPackage.INCOME__TAX_PAYER) return null;
		return (Tax_Payer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxPayer(Tax_Payer newTaxPayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaxPayer, TaxationWithRootPackage.INCOME__TAX_PAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPayer(Tax_Payer newTaxPayer) {
		if (newTaxPayer != eInternalContainer() || (eContainerFeatureID() != TaxationWithRootPackage.INCOME__TAX_PAYER && newTaxPayer != null)) {
			if (EcoreUtil.isAncestor(this, newTaxPayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaxPayer != null)
				msgs = ((InternalEObject)newTaxPayer).eInverseAdd(this, TaxationWithRootPackage.TAX_PAYER__INCOMES, Tax_Payer.class, msgs);
			msgs = basicSetTaxPayer(newTaxPayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__TAX_PAYER, newTaxPayer, newTaxPayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Income_Detail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentWithInverseEList<Income_Detail>(Income_Detail.class, this, TaxationWithRootPackage.INCOME__DETAILS, TaxationWithRootPackage.INCOME_DETAIL__INCOME);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum() {
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum(int newNum) {
		int oldNum = num;
		num = newNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.INCOME__NUM, oldNum, num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expense> getExpenses() {
		if (expenses == null) {
			expenses = new EObjectContainmentWithInverseEList<Expense>(Expense.class, this, TaxationWithRootPackage.INCOME__EXPENSES, TaxationWithRootPackage.EXPENSE__INCOME);
		}
		return expenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				if (income_type != null)
					msgs = ((InternalEObject)income_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationWithRootPackage.INCOME__INCOME_TYPE, null, msgs);
				return basicSetIncome_type((Income_Type)otherEnd, msgs);
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				if (tax_card != null)
					msgs = ((InternalEObject)tax_card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationWithRootPackage.INCOME__TAX_CARD, null, msgs);
				return basicSetTax_card((Tax_Card)otherEnd, msgs);
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaxPayer((Tax_Payer)otherEnd, msgs);
			case TaxationWithRootPackage.INCOME__DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDetails()).basicAdd(otherEnd, msgs);
			case TaxationWithRootPackage.INCOME__EXPENSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpenses()).basicAdd(otherEnd, msgs);
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
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				return basicSetIncome_type(null, msgs);
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				return basicSetTax_card(null, msgs);
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				return basicSetTaxPayer(null, msgs);
			case TaxationWithRootPackage.INCOME__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
			case TaxationWithRootPackage.INCOME__EXPENSES:
				return ((InternalEList<?>)getExpenses()).basicRemove(otherEnd, msgs);
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
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				return eInternalContainer().eInverseRemove(this, TaxationWithRootPackage.TAX_PAYER__INCOMES, Tax_Payer.class, msgs);
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
			case TaxationWithRootPackage.INCOME__INCOME_AMOUNT:
				return getIncome_amount();
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				return getIncome_type();
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				return getTax_card();
			case TaxationWithRootPackage.INCOME__TAX_LIABILITY:
				return getTax_liability();
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				return getTaxPayer();
			case TaxationWithRootPackage.INCOME__DETAILS:
				return getDetails();
			case TaxationWithRootPackage.INCOME__NUM:
				return getNum();
			case TaxationWithRootPackage.INCOME__EXPENSES:
				return getExpenses();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaxationWithRootPackage.INCOME__INCOME_AMOUNT:
				setIncome_amount((Double)newValue);
				return;
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				setIncome_type((Income_Type)newValue);
				return;
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				setTax_card((Tax_Card)newValue);
				return;
			case TaxationWithRootPackage.INCOME__TAX_LIABILITY:
				setTax_liability((Double)newValue);
				return;
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				setTaxPayer((Tax_Payer)newValue);
				return;
			case TaxationWithRootPackage.INCOME__DETAILS:
				getDetails().clear();
				getDetails().addAll((Collection<? extends Income_Detail>)newValue);
				return;
			case TaxationWithRootPackage.INCOME__NUM:
				setNum((Integer)newValue);
				return;
			case TaxationWithRootPackage.INCOME__EXPENSES:
				getExpenses().clear();
				getExpenses().addAll((Collection<? extends Expense>)newValue);
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
			case TaxationWithRootPackage.INCOME__INCOME_AMOUNT:
				setIncome_amount(INCOME_AMOUNT_EDEFAULT);
				return;
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				setIncome_type((Income_Type)null);
				return;
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				setTax_card((Tax_Card)null);
				return;
			case TaxationWithRootPackage.INCOME__TAX_LIABILITY:
				setTax_liability(TAX_LIABILITY_EDEFAULT);
				return;
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				setTaxPayer((Tax_Payer)null);
				return;
			case TaxationWithRootPackage.INCOME__DETAILS:
				getDetails().clear();
				return;
			case TaxationWithRootPackage.INCOME__NUM:
				setNum(NUM_EDEFAULT);
				return;
			case TaxationWithRootPackage.INCOME__EXPENSES:
				getExpenses().clear();
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
			case TaxationWithRootPackage.INCOME__INCOME_AMOUNT:
				return income_amount != INCOME_AMOUNT_EDEFAULT;
			case TaxationWithRootPackage.INCOME__INCOME_TYPE:
				return income_type != null;
			case TaxationWithRootPackage.INCOME__TAX_CARD:
				return tax_card != null;
			case TaxationWithRootPackage.INCOME__TAX_LIABILITY:
				return tax_liability != TAX_LIABILITY_EDEFAULT;
			case TaxationWithRootPackage.INCOME__TAX_PAYER:
				return getTaxPayer() != null;
			case TaxationWithRootPackage.INCOME__DETAILS:
				return details != null && !details.isEmpty();
			case TaxationWithRootPackage.INCOME__NUM:
				return num != NUM_EDEFAULT;
			case TaxationWithRootPackage.INCOME__EXPENSES:
				return expenses != null && !expenses.isEmpty();
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
		result.append(" (income_amount: ");
		result.append(income_amount);
		result.append(", tax_liability: ");
		result.append(tax_liability);
		result.append(", num: ");
		result.append(num);
		result.append(')');
		return result.toString();
	}

} //IncomeImpl
