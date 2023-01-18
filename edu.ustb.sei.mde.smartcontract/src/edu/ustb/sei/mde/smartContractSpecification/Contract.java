/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getParties <em>Parties</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getTerms <em>Terms</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getTypes <em>Types</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getEnumTypes <em>Enum Types</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends NamedElement, FieldContainer {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract_Parties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerms();

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
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Enum Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Types</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract_EnumTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getEnumTypes();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ustb.sei.mde.smartContractSpecification.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getContract_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

} // Contract
