/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getSlot <em>Slot</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getNext <em>Next</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getTransitive <em>Transitive</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getSlotRef()
 * @model
 * @generated
 */
public interface SlotRef extends Expression, CollectionSourceExpression {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference.
	 * @see #setSlot(DataSlot)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getSlotRef_Slot()
	 * @model
	 * @generated
	 */
	DataSlot getSlot();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getSlot <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(SlotRef)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getSlotRef_Next()
	 * @model containment="true"
	 * @generated
	 */
	SlotRef getNext();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(SlotRef value);

	/**
	 * Returns the value of the '<em><b>Transitive</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator
	 * @see #setTransitive(TransitiveOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getSlotRef_Transitive()
	 * @model default="none" required="true"
	 * @generated
	 */
	TransitiveOperator getTransitive();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getTransitive <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator
	 * @see #getTransitive()
	 * @generated
	 */
	void setTransitive(TransitiveOperator value);

} // SlotRef
