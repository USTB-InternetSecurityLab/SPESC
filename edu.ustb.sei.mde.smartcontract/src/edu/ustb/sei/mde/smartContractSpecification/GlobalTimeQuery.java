/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Time Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getGlobalTimeQuery()
 * @model
 * @generated
 */
public interface GlobalTimeQuery extends TimeQuery, Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator
	 * @see #setOperator(TimeQueryOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getGlobalTimeQuery_Operator()
	 * @model required="true"
	 * @generated
	 */
	TimeQueryOperator getOperator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TimeQueryOperator value);

} // GlobalTimeQuery
