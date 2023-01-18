/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Action#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Action#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Action#getTimes <em>Times</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Action#isUsed <em>Used</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getParameters();

	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see #setIsMany(boolean)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAction_IsMany()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.Action#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAction_Times()
	 * @model default="0"
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.Action#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

	/**
	 * Returns the value of the '<em><b>Used</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' attribute.
	 * @see #setUsed(boolean)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getAction_Used()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsed();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.Action#isUsed <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used</em>' attribute.
	 * @see #isUsed()
	 * @generated
	 */
	void setUsed(boolean value);

} // Action
