/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.TimeExpression;
import edu.ustb.sei.mde.smartContractSpecification.TimeLine;
import edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl#getDeviation <em>Deviation</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineImpl extends TimeExpressionImpl implements TimeLine {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected TimeExpression base;

	/**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
	protected TimeExpression deviation;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TimeLineOperator OPERATOR_EDEFAULT = TimeLineOperator.FORWARD;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TimeLineOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(TimeExpression newBase, NotificationChain msgs) {
		TimeExpression oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_LINE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(TimeExpression newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_LINE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_LINE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_LINE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression getDeviation() {
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviation(TimeExpression newDeviation, NotificationChain msgs) {
		TimeExpression oldDeviation = deviation;
		deviation = newDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_LINE__DEVIATION, oldDeviation, newDeviation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviation(TimeExpression newDeviation) {
		if (newDeviation != deviation) {
			NotificationChain msgs = null;
			if (deviation != null)
				msgs = ((InternalEObject)deviation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_LINE__DEVIATION, null, msgs);
			if (newDeviation != null)
				msgs = ((InternalEObject)newDeviation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TIME_LINE__DEVIATION, null, msgs);
			msgs = basicSetDeviation(newDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_LINE__DEVIATION, newDeviation, newDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TimeLineOperator newOperator) {
		TimeLineOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TIME_LINE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TIME_LINE__BASE:
				return basicSetBase(null, msgs);
			case SmartContractSpecificationPackage.TIME_LINE__DEVIATION:
				return basicSetDeviation(null, msgs);
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
			case SmartContractSpecificationPackage.TIME_LINE__BASE:
				return getBase();
			case SmartContractSpecificationPackage.TIME_LINE__DEVIATION:
				return getDeviation();
			case SmartContractSpecificationPackage.TIME_LINE__OPERATOR:
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
			case SmartContractSpecificationPackage.TIME_LINE__BASE:
				setBase((TimeExpression)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_LINE__DEVIATION:
				setDeviation((TimeExpression)newValue);
				return;
			case SmartContractSpecificationPackage.TIME_LINE__OPERATOR:
				setOperator((TimeLineOperator)newValue);
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
			case SmartContractSpecificationPackage.TIME_LINE__BASE:
				setBase((TimeExpression)null);
				return;
			case SmartContractSpecificationPackage.TIME_LINE__DEVIATION:
				setDeviation((TimeExpression)null);
				return;
			case SmartContractSpecificationPackage.TIME_LINE__OPERATOR:
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
			case SmartContractSpecificationPackage.TIME_LINE__BASE:
				return base != null;
			case SmartContractSpecificationPackage.TIME_LINE__DEVIATION:
				return deviation != null;
			case SmartContractSpecificationPackage.TIME_LINE__OPERATOR:
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
		int level = 4;
		String result = "";
		if(parentlevel <= level)
			result += "(";
		switch (getOperator()) {
		case FORWARD:
			result += getBase().compile(level,type) + " + " + getDeviation().compile(level,type);break;
		case BACKWARD:
			result += getBase().compile(level,type) + " - " + getDeviation().compile(level,type);break;
		}
		if(parentlevel <= level)
			result += ")";
		return result;
	}

} //TimeLineImpl
