/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TransferOperation#getMoney <em>Money</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTransferOperation()
 * @model abstract="true"
 * @generated
 */
public interface TransferOperation extends EObject {

	/**
	 * Returns the value of the '<em><b>Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Money</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money</em>' containment reference.
	 * @see #setMoney(MoneyExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTransferOperation_Money()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MoneyExpression getMoney();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TransferOperation#getMoney <em>Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money</em>' containment reference.
	 * @see #getMoney()
	 * @generated
	 */
	void setMoney(MoneyExpression value);
} // TransferOperation
