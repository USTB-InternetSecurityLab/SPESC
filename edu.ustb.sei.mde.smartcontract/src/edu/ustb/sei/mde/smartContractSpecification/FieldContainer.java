/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.FieldContainer#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getFieldContainer()
 * @model abstract="true"
 * @generated
 */
public interface FieldContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getFieldContainer_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // FieldContainer
