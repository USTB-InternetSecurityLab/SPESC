/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.RightExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl#getRightType <em>Right Type</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl#getRightProporty <em>Right Proporty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightExpressionImpl extends DataSlotImpl implements RightExpression {
	/**
	 * The default value of the '{@link #getRightType() <em>Right Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightType()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRightType() <em>Right Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightType()
	 * @generated
	 * @ordered
	 */
	protected String rightType = RIGHT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightProporty() <em>Right Proporty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightProporty()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_PROPORTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightProporty() <em>Right Proporty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightProporty()
	 * @generated
	 * @ordered
	 */
	protected String rightProporty = RIGHT_PROPORTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.RIGHT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightType() {
		return rightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightType(String newRightType) {
		String oldRightType = rightType;
		rightType = newRightType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_TYPE, oldRightType, rightType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightProporty() {
		return rightProporty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightProporty(String newRightProporty) {
		String oldRightProporty = rightProporty;
		rightProporty = newRightProporty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_PROPORTY, oldRightProporty, rightProporty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_TYPE:
				return getRightType();
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_PROPORTY:
				return getRightProporty();
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
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_TYPE:
				setRightType((String)newValue);
				return;
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_PROPORTY:
				setRightProporty((String)newValue);
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
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_TYPE:
				setRightType(RIGHT_TYPE_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_PROPORTY:
				setRightProporty(RIGHT_PROPORTY_EDEFAULT);
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
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_TYPE:
				return RIGHT_TYPE_EDEFAULT == null ? rightType != null : !RIGHT_TYPE_EDEFAULT.equals(rightType);
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION__RIGHT_PROPORTY:
				return RIGHT_PROPORTY_EDEFAULT == null ? rightProporty != null : !RIGHT_PROPORTY_EDEFAULT.equals(rightProporty);
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
		result.append(" (RightType: ");
		result.append(rightType);
		result.append(", RightProporty: ");
		result.append(rightProporty);
		result.append(')');
		return result.toString();
	}

} //RightExpressionImpl
