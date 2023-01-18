/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends ArithmeticExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator
	 * @see #setOperator(AdditiveOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAdditiveExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	AdditiveOperator getOperator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AdditiveOperator value);

} // AdditiveExpression
