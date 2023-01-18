/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Transfer#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTransfer()
 * @model
 * @generated
 */
public interface Transfer extends TransferOperation {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTransfer_Account()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAccount();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.Transfer#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Expression value);

} // Transfer
