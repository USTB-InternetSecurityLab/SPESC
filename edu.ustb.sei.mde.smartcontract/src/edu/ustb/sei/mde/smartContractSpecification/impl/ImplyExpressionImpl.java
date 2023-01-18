/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.ImplyExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imply Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl#getImplied <em>Implied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplyExpressionImpl extends LogicalExpressionImpl implements ImplyExpression {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getImplied() <em>Implied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplied()
	 * @generated
	 * @ordered
	 */
	protected Expression implied;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplyExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.IMPLY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getImplied() {
		return implied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplied(Expression newImplied, NotificationChain msgs) {
		Expression oldImplied = implied;
		implied = newImplied;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED, oldImplied, newImplied);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplied(Expression newImplied) {
		if (newImplied != implied) {
			NotificationChain msgs = null;
			if (implied != null)
				msgs = ((InternalEObject)implied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED, null, msgs);
			if (newImplied != null)
				msgs = ((InternalEObject)newImplied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED, null, msgs);
			msgs = basicSetImplied(newImplied, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED, newImplied, newImplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION:
				return basicSetCondition(null, msgs);
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED:
				return basicSetImplied(null, msgs);
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
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION:
				return getCondition();
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED:
				return getImplied();
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
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED:
				setImplied((Expression)newValue);
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
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION:
				setCondition((Expression)null);
				return;
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED:
				setImplied((Expression)null);
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
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__CONDITION:
				return condition != null;
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION__IMPLIED:
				return implied != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		int level = 13;
		String result = "";
		if(parentlevel <= level)
			result += "(";
		result += getCondition().compile(level,type) + " ? " + getImplied().compile(level,type) + " : true";
		if(parentlevel <= level)
			result += ")";
		return result;
	}

} //ImplyExpressionImpl
