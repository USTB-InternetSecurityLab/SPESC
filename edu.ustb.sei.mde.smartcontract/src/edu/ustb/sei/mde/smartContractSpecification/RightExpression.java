/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightType <em>Right Type</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightProporty <em>Right Proporty</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getRightExpression()
 * @model
 * @generated
 */
public interface RightExpression extends DataSlot {
	/**
	 * Returns the value of the '<em><b>Right Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Type</em>' attribute.
	 * @see #setRightType(String)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getRightExpression_RightType()
	 * @model default=""
	 * @generated
	 */
	String getRightType();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightType <em>Right Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Type</em>' attribute.
	 * @see #getRightType()
	 * @generated
	 */
	void setRightType(String value);

	/**
	 * Returns the value of the '<em><b>Right Proporty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Proporty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Proporty</em>' attribute.
	 * @see #setRightProporty(String)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getRightExpression_RightProporty()
	 * @model
	 * @generated
	 */
	String getRightProporty();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightProporty <em>Right Proporty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Proporty</em>' attribute.
	 * @see #getRightProporty()
	 * @generated
	 */
	void setRightProporty(String value);

} // RightExpression
