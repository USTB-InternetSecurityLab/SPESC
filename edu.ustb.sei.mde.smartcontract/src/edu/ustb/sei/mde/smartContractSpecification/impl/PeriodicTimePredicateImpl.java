/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Time Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl#getBasefrom <em>Basefrom</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl#getBaseto <em>Baseto</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl#getPeriodDate <em>Period Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicTimePredicateImpl extends TimePredicateImpl implements PeriodicTimePredicate {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Expression period;

	/**
	 * The cached value of the '{@link #getBasefrom() <em>Basefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasefrom()
	 * @generated
	 * @ordered
	 */
	protected Expression basefrom;
	/**
	 * The cached value of the '{@link #getBaseto() <em>Baseto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseto()
	 * @generated
	 * @ordered
	 */
	protected Expression baseto;

	/**
	 * The cached value of the '{@link #getPeriodDate() <em>Period Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodDate()
	 * @generated
	 * @ordered
	 */
	protected EObject periodDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicTimePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Expression newPeriod, NotificationChain msgs) {
		Expression oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Expression newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBasefrom() {
		return basefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasefrom(Expression newBasefrom, NotificationChain msgs) {
		Expression oldBasefrom = basefrom;
		basefrom = newBasefrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM, oldBasefrom, newBasefrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasefrom(Expression newBasefrom) {
		if (newBasefrom != basefrom) {
			NotificationChain msgs = null;
			if (basefrom != null)
				msgs = ((InternalEObject)basefrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM, null, msgs);
			if (newBasefrom != null)
				msgs = ((InternalEObject)newBasefrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM, null, msgs);
			msgs = basicSetBasefrom(newBasefrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM, newBasefrom, newBasefrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBaseto() {
		return baseto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseto(Expression newBaseto, NotificationChain msgs) {
		Expression oldBaseto = baseto;
		baseto = newBaseto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO, oldBaseto, newBaseto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseto(Expression newBaseto) {
		if (newBaseto != baseto) {
			NotificationChain msgs = null;
			if (baseto != null)
				msgs = ((InternalEObject)baseto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO, null, msgs);
			if (newBaseto != null)
				msgs = ((InternalEObject)newBaseto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO, null, msgs);
			msgs = basicSetBaseto(newBaseto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO, newBaseto, newBaseto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPeriodDate() {
		return periodDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodDate(EObject newPeriodDate, NotificationChain msgs) {
		EObject oldPeriodDate = periodDate;
		periodDate = newPeriodDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE, oldPeriodDate, newPeriodDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodDate(EObject newPeriodDate) {
		if (newPeriodDate != periodDate) {
			NotificationChain msgs = null;
			if (periodDate != null)
				msgs = ((InternalEObject)periodDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE, null, msgs);
			if (newPeriodDate != null)
				msgs = ((InternalEObject)newPeriodDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE, null, msgs);
			msgs = basicSetPeriodDate(newPeriodDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE, newPeriodDate, newPeriodDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
				return basicSetPeriod(null, msgs);
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
				return basicSetBasefrom(null, msgs);
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
				return basicSetBaseto(null, msgs);
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				return basicSetPeriodDate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
				return getPeriod();
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
				return getBasefrom();
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
				return getBaseto();
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				return getPeriodDate();
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
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
				setPeriod((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
				setBasefrom((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
				setBaseto((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				setPeriodDate((EObject)newValue);
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
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
				setPeriod((Expression)null);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
				setBasefrom((Expression)null);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
				setBaseto((Expression)null);
				return;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				setPeriodDate((EObject)null);
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
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
				return period != null;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
				return basefrom != null;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
				return baseto != null;
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				return periodDate != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicTimePredicateImpl
