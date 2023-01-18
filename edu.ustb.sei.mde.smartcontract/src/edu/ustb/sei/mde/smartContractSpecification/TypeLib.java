/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TypeLib#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTypeLib()
 * @model
 * @generated
 */
public interface TypeLib extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTypeLib_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // TypeLib
