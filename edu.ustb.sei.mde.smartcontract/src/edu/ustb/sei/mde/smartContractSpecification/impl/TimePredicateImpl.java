/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePredicateImpl extends ExpressionImpl implements TimePredicate {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Expression base;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TimePredicateOperator OPERATOR_EDEFAULT = TimePredicateOperator.AFTER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TimePredicateOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.TIME_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Expression newBase, NotificationChain msgs) {
		Expression oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_PREDICATE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Expression newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_PREDICATE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_PREDICATE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_PREDICATE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePredicateOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TimePredicateOperator newOperator) {
		TimePredicateOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
				return basicSetBase(null, msgs);
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
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
				return getBase();
			case SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR:
				return getOperator();
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
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
				setBase((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR:
				setOperator((TimePredicateOperator)newValue);
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
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
				setBase((Expression)null);
				return;
			case SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
				return base != null;
			case SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		int level;
		String result = "";
		if(this instanceof BoundedTimePredicate && ((BoundedTimePredicate)this).isClosed() == true)
			level = 11;
		else
			level = 6;
		if(parentlevel <= level)
			result += "(";
		if(this instanceof BoundedTimePredicate) {
			if(((BoundedTimePredicate)this).isClosed() == false) {
				switch (getOperator()) {
				case BEFORE:result += "now < " + getBase().compile(level,type) + "-" + ((BoundedTimePredicate)this).getBound().compile(level,type);break;
				case AFTER:result += "now > " + getBase().compile(level,type) + "+" + ((BoundedTimePredicate)this).getBound().compile(level,type);break;
				}
			}else {
				switch (getOperator()) {
				case BEFORE:
					result += "(now < " + getBase().compile(level,type) + ") &&";
					result += "(now > " + getBase().compile(level,type) + "-" + ((BoundedTimePredicate)this).getBound().compile(level,type) + ")";
					break;
				case AFTER:
					result += "(now > " + getBase().compile(level,type) + ") &&";
					result += "(now < " + getBase().compile(level,type) + "+" + ((BoundedTimePredicate)this).getBound().compile(level,type) + ")";
					break;
				}
			}
		}else {
			switch (getOperator()) {
			case BEFORE:result += "now < " + getBase().compile(level,type);break;
			case AFTER:result += "now > " + getBase().compile(level,type);break;
			}
		}
		if(parentlevel <= level)
			result += ")";
		return result;
	}

} //TimePredicateImpl
