/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Valid Time Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTermValidTimeQuery()
 * @model
 * @generated
 */
public interface TermValidTimeQuery extends TimeQuery {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference.
	 * @see #setTerm(Term)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTermValidTimeQuery_Term()
	 * @model required="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery#getTerm <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // TermValidTimeQuery
