/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.FieldRef#getField <em>Field</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.FieldRef#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getFieldRef()
 * @model
 * @generated
 */
public interface FieldRef extends Expression {

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getFieldRef_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.FieldRef#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(FieldRef)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getFieldRef_Next()
	 * @model containment="true"
	 * @generated
	 */
	FieldRef getNext();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.FieldRef#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(FieldRef value);
} // FieldRef
