/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Enforced Time Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getAction <em>Action</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getParty <em>Party</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getActionEnforcedTimeQuery()
 * @model
 * @generated
 */
public interface ActionEnforcedTimeQuery extends TimeQuery {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getActionEnforcedTimeQuery_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getActionEnforcedTimeQuery_Party()
	 * @model required="true"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"this"</code>.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity
	 * @see #setMultiplicity(PartyMemberMultiplicity)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getActionEnforcedTimeQuery_Multiplicity()
	 * @model default="this" required="true"
	 * @generated
	 */
	PartyMemberMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(PartyMemberMultiplicity value);

} // ActionEnforcedTimeQuery
