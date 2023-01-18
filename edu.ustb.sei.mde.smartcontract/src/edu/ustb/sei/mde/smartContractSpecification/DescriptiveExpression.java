/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression#getPlainText <em>Plain Text</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getDescriptiveExpression()
 * @model
 * @generated
 */
public interface DescriptiveExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Plain Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plain Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain Text</em>' attribute.
	 * @see #setPlainText(String)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getDescriptiveExpression_PlainText()
	 * @model
	 * @generated
	 */
	String getPlainText();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression#getPlainText <em>Plain Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plain Text</em>' attribute.
	 * @see #getPlainText()
	 * @generated
	 */
	void setPlainText(String value);

} // DescriptiveExpression
