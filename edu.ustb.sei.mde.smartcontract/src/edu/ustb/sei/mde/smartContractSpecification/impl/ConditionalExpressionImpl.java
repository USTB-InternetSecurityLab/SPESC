/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression;
import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression {
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
	 * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBranch()
	 * @generated
	 * @ordered
	 */
	protected Expression thenBranch;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Expression elseBranch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.CONDITIONAL_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenBranch() {
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenBranch(Expression newThenBranch, NotificationChain msgs) {
		Expression oldThenBranch = thenBranch;
		thenBranch = newThenBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH, oldThenBranch, newThenBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenBranch(Expression newThenBranch) {
		if (newThenBranch != thenBranch) {
			NotificationChain msgs = null;
			if (thenBranch != null)
				msgs = ((InternalEObject)thenBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH, null, msgs);
			if (newThenBranch != null)
				msgs = ((InternalEObject)newThenBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH, null, msgs);
			msgs = basicSetThenBranch(newThenBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH, newThenBranch, newThenBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBranch(Expression newElseBranch, NotificationChain msgs) {
		Expression oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH, oldElseBranch, newElseBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Expression newElseBranch) {
		if (newElseBranch != elseBranch) {
			NotificationChain msgs = null;
			if (elseBranch != null)
				msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH, null, msgs);
			if (newElseBranch != null)
				msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH, null, msgs);
			msgs = basicSetElseBranch(newElseBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH, newElseBranch, newElseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return basicSetCondition(null, msgs);
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH:
				return basicSetThenBranch(null, msgs);
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH:
				return basicSetElseBranch(null, msgs);
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
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return getCondition();
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH:
				return getThenBranch();
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH:
				return getElseBranch();
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
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH:
				setThenBranch((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH:
				setElseBranch((Expression)newValue);
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
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((Expression)null);
				return;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH:
				setThenBranch((Expression)null);
				return;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH:
				setElseBranch((Expression)null);
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
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return condition != null;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__THEN_BRANCH:
				return thenBranch != null;
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION__ELSE_BRANCH:
				return elseBranch != null;
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
		result += getCondition().compile(level,type) + "?" + getThenBranch().compile(level,type) + ":" + getElseBranch().compile(level,type);
		if(parentlevel <= level)
			result += ")";
		return result;
	}

	@SuppressWarnings("unused")
	private Expression getImplied() {
		// TODO Auto-generated method stub
		return null;
	}

} //ConditionalExpressionImpl
