/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.NotExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.NotExpressionImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotExpressionImpl extends LogicalExpressionImpl implements NotExpression {
	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected Expression inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.NOT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(Expression newInner, NotificationChain msgs) {
		Expression oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.NOT_EXPRESSION__INNER, oldInner, newInner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(Expression newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.NOT_EXPRESSION__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.NOT_EXPRESSION__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.NOT_EXPRESSION__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
				return basicSetInner(null, msgs);
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
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
				return getInner();
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
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
				setInner((Expression)newValue);
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
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
				setInner((Expression)null);
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
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		int level = 2;
		String result = "";
		if(parentlevel <= level)
			result += "(";
		result += "!" + getInner().compile(level,type);
		if(parentlevel <= level)
			result += ")";
		return result;
	}

} //NotExpressionImpl
