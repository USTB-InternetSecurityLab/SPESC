/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.CollectionExpression#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getCollectionExpression()
 * @model abstract="true"
 * @generated
 */
public interface CollectionExpression extends Expression, CollectionSourceExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(CollectionSourceExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getCollectionExpression_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionSourceExpression getSource();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.CollectionExpression#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CollectionSourceExpression value);

} // CollectionExpression
