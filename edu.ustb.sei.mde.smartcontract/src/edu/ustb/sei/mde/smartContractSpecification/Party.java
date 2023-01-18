/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Party#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getParty()
 * @model abstract="true"
 * @generated
 */
public interface Party extends NamedElement, Type {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getParty_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Party
