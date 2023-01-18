/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Money Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getRelationOperator <em>Relation Operator</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getMoneyExpression()
 * @model
 * @generated
 */
public interface MoneyExpression extends DataSlot {
	/**
	 * Returns the value of the '<em><b>Relation Operator</b></em>' attribute.
	 * The default value is <code>"equal"</code>.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalOperator
	 * @see #setRelationOperator(RelationalOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getMoneyExpression_RelationOperator()
	 * @model default="equal"
	 * @generated
	 */
	RelationalOperator getRelationOperator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getRelationOperator <em>Relation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalOperator
	 * @see #getRelationOperator()
	 * @generated
	 */
	void setRelationOperator(RelationalOperator value);

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
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getMoneyExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // MoneyExpression
