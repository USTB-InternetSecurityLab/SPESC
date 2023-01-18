/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getConditionalExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Branch</em>' containment reference.
	 * @see #setThenBranch(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getConditionalExpression_ThenBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThenBranch();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getThenBranch <em>Then Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Branch</em>' containment reference.
	 * @see #getThenBranch()
	 * @generated
	 */
	void setThenBranch(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference.
	 * @see #setElseBranch(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getConditionalExpression_ElseBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getElseBranch();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getElseBranch <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' containment reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Expression value);

} // ConditionalExpression
