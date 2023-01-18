/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Time Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#getBound <em>Bound</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#isClosed <em>Closed</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getBoundedTimePredicate()
 * @model
 * @generated
 */
public interface BoundedTimePredicate extends TimePredicate {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getBoundedTimePredicate_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBound();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(boolean)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getBoundedTimePredicate_Closed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#isClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setClosed(boolean value);

} // BoundedTimePredicate
