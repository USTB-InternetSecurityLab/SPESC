/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.enumType#getSelections <em>Selections</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getenumType()
 * @model
 * @generated
 */
public interface enumType extends Type {
	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Selection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getenumType_Selections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Selection> getSelections();

} // enumType
