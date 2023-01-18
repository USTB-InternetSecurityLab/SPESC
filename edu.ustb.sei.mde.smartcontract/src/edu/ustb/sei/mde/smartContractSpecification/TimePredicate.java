/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getBase <em>Base</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimePredicate()
 * @model
 * @generated
 */
public interface TimePredicate extends Expression {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimePredicate_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBase();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator
	 * @see #setOperator(TimePredicateOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimePredicate_Operator()
	 * @model required="true"
	 * @generated
	 */
	TimePredicateOperator getOperator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TimePredicateOperator value);

} // TimePredicate
