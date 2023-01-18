/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getIterator <em>Iterator</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getQunatifier <em>Qunatifier</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getQuantifierExpression()
 * @model
 * @generated
 */
public interface QuantifierExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CollectionSourceExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getQuantifierExpression_Scope()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionSourceExpression getScope();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CollectionSourceExpression value);

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
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getQuantifierExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(IteratorDeclExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getQuantifierExpression_Iterator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IteratorDeclExpression getIterator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(IteratorDeclExpression value);

	/**
	 * Returns the value of the '<em><b>Qunatifier</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qunatifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qunatifier</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Quantifier
	 * @see #setQunatifier(Quantifier)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getQuantifierExpression_Qunatifier()
	 * @model required="true"
	 * @generated
	 */
	Quantifier getQunatifier();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getQunatifier <em>Qunatifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qunatifier</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Quantifier
	 * @see #getQunatifier()
	 * @generated
	 */
	void setQunatifier(Quantifier value);

} // QuantifierExpression
