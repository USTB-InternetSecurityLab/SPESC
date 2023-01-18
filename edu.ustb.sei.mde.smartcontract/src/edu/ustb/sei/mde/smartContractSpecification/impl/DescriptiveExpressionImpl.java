/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.DescriptiveExpressionImpl#getPlainText <em>Plain Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptiveExpressionImpl extends ExpressionImpl implements DescriptiveExpression {
	/**
	 * The default value of the '{@link #getPlainText() <em>Plain Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainText()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAIN_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlainText() <em>Plain Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainText()
	 * @generated
	 * @ordered
	 */
	protected String plainText = PLAIN_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptiveExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.DESCRIPTIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlainText() {
		return plainText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlainText(String newPlainText) {
		String oldPlainText = plainText;
		plainText = newPlainText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION__PLAIN_TEXT, oldPlainText, plainText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION__PLAIN_TEXT:
				return getPlainText();
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
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION__PLAIN_TEXT:
				setPlainText((String)newValue);
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
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION__PLAIN_TEXT:
				setPlainText(PLAIN_TEXT_EDEFAULT);
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
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION__PLAIN_TEXT:
				return PLAIN_TEXT_EDEFAULT == null ? plainText != null : !PLAIN_TEXT_EDEFAULT.equals(plainText);
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
		result.append(" (plainText: ");
		result.append(plainText);
		result.append(')');
		return result.toString();
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		return plainText;
	}

} //DescriptiveExpressionImpl
