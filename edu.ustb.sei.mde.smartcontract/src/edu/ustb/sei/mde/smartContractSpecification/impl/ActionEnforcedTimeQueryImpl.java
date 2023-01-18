/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Action;
import edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery;
import edu.ustb.sei.mde.smartContractSpecification.Party;
import edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity;
import edu.ustb.sei.mde.smartContractSpecification.SingleParty;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Enforced Time Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl#getAction <em>Action</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl#getParty <em>Party</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionEnforcedTimeQueryImpl extends TimeQueryImpl implements ActionEnforcedTimeQuery {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Party party;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final PartyMemberMultiplicity MULTIPLICITY_EDEFAULT = PartyMemberMultiplicity.THIS;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected PartyMemberMultiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionEnforcedTimeQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.ACTION_ENFORCED_TIME_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party getParty() {
		if (party != null && party.eIsProxy()) {
			InternalEObject oldParty = (InternalEObject)party;
			party = (Party)eResolveProxy(oldParty);
			if (party != oldParty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY, oldParty, party));
			}
		}
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Party newParty) {
		Party oldParty = party;
		party = newParty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY, oldParty, party));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyMemberMultiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(PartyMemberMultiplicity newMultiplicity) {
		PartyMemberMultiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY:
				if (resolve) return getParty();
				return basicGetParty();
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY:
				return getMultiplicity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION:
				setAction((Action)newValue);
				return;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY:
				setParty((Party)newValue);
				return;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY:
				setMultiplicity((PartyMemberMultiplicity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION:
				setAction((Action)null);
				return;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY:
				setParty((Party)null);
				return;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__ACTION:
				return action != null;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__PARTY:
				return party != null;
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		String result = "";
		getAction().setUsed(true);
		switch (getMultiplicity()) {
		case ALL:
			result += getParty().getName() + "." + getAction().getName() + "Time(" + ")";break;
		case ANY:
			result += getParty().getName() + "." + getAction().getName() + "Time(" + "1" + ")";break;
		case THIS:
			result += getParty().getName() + "." + getAction().getName() + "Time(" + ((getParty() instanceof SingleParty) ? "" : "msg.sender") + ")";break;
		}
		return result;
	}

} //ActionEnforcedTimeQueryImpl
