/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Action;
import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.Party;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.Term;
import edu.ustb.sei.mde.smartContractSpecification.TransferOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getAction <em>Action</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getParty <em>Party</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getTransferOperations <em>Transfer Operations</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#isBreak <em>Break</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#isAuto <em>Auto</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl#getBreachOperations <em>Breach Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TermImpl extends NamedElementImpl implements Term {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

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
	 * The cached value of the '{@link #getTransferOperations() <em>Transfer Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferOperation> transferOperations;

	/**
	 * The default value of the '{@link #isBreak() <em>Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreak() <em>Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreak()
	 * @generated
	 * @ordered
	 */
	protected boolean break_ = BREAK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression postCondition;

	/**
	 * The default value of the '{@link #isAuto() <em>Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuto() <em>Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto()
	 * @generated
	 * @ordered
	 */
	protected boolean auto = AUTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBreachOperations() <em>Breach Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreachOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferOperation> breachOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TERM__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TERM__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__CONDITION, newCondition, newCondition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartContractSpecificationPackage.TERM__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__ACTION, oldAction, action));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartContractSpecificationPackage.TERM__PARTY, oldParty, party));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__PARTY, oldParty, party));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferOperation> getTransferOperations() {
		if (transferOperations == null) {
			transferOperations = new EObjectContainmentEList<TransferOperation>(TransferOperation.class, this, SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS);
		}
		return transferOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBreak() {
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreak(boolean newBreak) {
		boolean oldBreak = break_;
		break_ = newBreak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__BREAK, oldBreak, break_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Expression newPostCondition, NotificationChain msgs) {
		Expression oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__POST_CONDITION, oldPostCondition, newPostCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Expression newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject)postCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TERM__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject)newPostCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.TERM__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__POST_CONDITION, newPostCondition, newPostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuto() {
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(boolean newAuto) {
		boolean oldAuto = auto;
		auto = newAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.TERM__AUTO, oldAuto, auto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferOperation> getBreachOperations() {
		if (breachOperations == null) {
			breachOperations = new EObjectContainmentEList<TransferOperation>(TransferOperation.class, this, SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS);
		}
		return breachOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TERM__CONDITION:
				return basicSetCondition(null, msgs);
			case SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS:
				return ((InternalEList<?>)getTransferOperations()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.TERM__POST_CONDITION:
				return basicSetPostCondition(null, msgs);
			case SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS:
				return ((InternalEList<?>)getBreachOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TERM__CONDITION:
				return getCondition();
			case SmartContractSpecificationPackage.TERM__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case SmartContractSpecificationPackage.TERM__PARTY:
				if (resolve) return getParty();
				return basicGetParty();
			case SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS:
				return getTransferOperations();
			case SmartContractSpecificationPackage.TERM__BREAK:
				return isBreak();
			case SmartContractSpecificationPackage.TERM__POST_CONDITION:
				return getPostCondition();
			case SmartContractSpecificationPackage.TERM__AUTO:
				return isAuto();
			case SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS:
				return getBreachOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartContractSpecificationPackage.TERM__CONDITION:
				setCondition((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__ACTION:
				setAction((Action)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__PARTY:
				setParty((Party)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS:
				getTransferOperations().clear();
				getTransferOperations().addAll((Collection<? extends TransferOperation>)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__BREAK:
				setBreak((Boolean)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__POST_CONDITION:
				setPostCondition((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__AUTO:
				setAuto((Boolean)newValue);
				return;
			case SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS:
				getBreachOperations().clear();
				getBreachOperations().addAll((Collection<? extends TransferOperation>)newValue);
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
			case SmartContractSpecificationPackage.TERM__CONDITION:
				setCondition((Expression)null);
				return;
			case SmartContractSpecificationPackage.TERM__ACTION:
				setAction((Action)null);
				return;
			case SmartContractSpecificationPackage.TERM__PARTY:
				setParty((Party)null);
				return;
			case SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS:
				getTransferOperations().clear();
				return;
			case SmartContractSpecificationPackage.TERM__BREAK:
				setBreak(BREAK_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TERM__POST_CONDITION:
				setPostCondition((Expression)null);
				return;
			case SmartContractSpecificationPackage.TERM__AUTO:
				setAuto(AUTO_EDEFAULT);
				return;
			case SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS:
				getBreachOperations().clear();
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
			case SmartContractSpecificationPackage.TERM__CONDITION:
				return condition != null;
			case SmartContractSpecificationPackage.TERM__ACTION:
				return action != null;
			case SmartContractSpecificationPackage.TERM__PARTY:
				return party != null;
			case SmartContractSpecificationPackage.TERM__TRANSFER_OPERATIONS:
				return transferOperations != null && !transferOperations.isEmpty();
			case SmartContractSpecificationPackage.TERM__BREAK:
				return break_ != BREAK_EDEFAULT;
			case SmartContractSpecificationPackage.TERM__POST_CONDITION:
				return postCondition != null;
			case SmartContractSpecificationPackage.TERM__AUTO:
				return auto != AUTO_EDEFAULT;
			case SmartContractSpecificationPackage.TERM__BREACH_OPERATIONS:
				return breachOperations != null && !breachOperations.isEmpty();
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
		result.append(" (break: ");
		result.append(break_);
		result.append(", auto: ");
		result.append(auto);
		result.append(')');
		return result.toString();
	}

} //TermImpl
