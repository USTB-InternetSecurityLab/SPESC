/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression;
import edu.ustb.sei.mde.smartContractSpecification.DataSlot;
import edu.ustb.sei.mde.smartContractSpecification.SlotRef;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.Term;
import edu.ustb.sei.mde.smartContractSpecification.ThisExpression;
import edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl#getTransitive <em>Transitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThisExpressionImpl extends TimeExpressionImpl implements ThisExpression {
	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected DataSlot slot;
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected SlotRef next;
	/**
	 * The default value of the '{@link #getTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final TransitiveOperator TRANSITIVE_EDEFAULT = TransitiveOperator.NONE;
	/**
	 * The cached value of the '{@link #getTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitive()
	 * @generated
	 * @ordered
	 */
	protected TransitiveOperator transitive = TRANSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThisExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.THIS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getSlot() {
		if (slot != null && slot.eIsProxy()) {
			InternalEObject oldSlot = (InternalEObject)slot;
			slot = (DataSlot)eResolveProxy(oldSlot);
			if (slot != oldSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT, oldSlot, slot));
			}
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetSlot() {
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(DataSlot newSlot) {
		DataSlot oldSlot = slot;
		slot = newSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT, oldSlot, slot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotRef getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(SlotRef newNext, NotificationChain msgs) {
		SlotRef oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(SlotRef newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveOperator getTransitive() {
		return transitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitive(TransitiveOperator newTransitive) {
		TransitiveOperator oldTransitive = transitive;
		transitive = newTransitive == null ? TRANSITIVE_EDEFAULT : newTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE, oldTransitive, transitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT:
				return basicSetNext(null, msgs);
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
			case SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT:
				if (resolve) return getSlot();
				return basicGetSlot();
			case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT:
				return getNext();
			case SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE:
				return getTransitive();
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
			case SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT:
				setSlot((DataSlot)newValue);
				return;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT:
				setNext((SlotRef)newValue);
				return;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE:
				setTransitive((TransitiveOperator)newValue);
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
			case SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT:
				setSlot((DataSlot)null);
				return;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT:
				setNext((SlotRef)null);
				return;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE:
				setTransitive(TRANSITIVE_EDEFAULT);
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
			case SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT:
				return slot != null;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT:
				return next != null;
			case SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE:
				return transitive != TRANSITIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CollectionSourceExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SlotRef.class) {
			switch (derivedFeatureID) {
				case SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT: return SmartContractSpecificationPackage.SLOT_REF__SLOT;
				case SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT: return SmartContractSpecificationPackage.SLOT_REF__NEXT;
				case SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE: return SmartContractSpecificationPackage.SLOT_REF__TRANSITIVE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CollectionSourceExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SlotRef.class) {
			switch (baseFeatureID) {
				case SmartContractSpecificationPackage.SLOT_REF__SLOT: return SmartContractSpecificationPackage.THIS_EXPRESSION__SLOT;
				case SmartContractSpecificationPackage.SLOT_REF__NEXT: return SmartContractSpecificationPackage.THIS_EXPRESSION__NEXT;
				case SmartContractSpecificationPackage.SLOT_REF__TRANSITIVE: return SmartContractSpecificationPackage.THIS_EXPRESSION__TRANSITIVE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (transitive: ");
		result.append(transitive);
		result.append(')');
		return result.toString();
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		int level = 1;
		String result = "";
		Term t = getTerm(this);
		if(t != null) {
			result += t.getParty().getName();
		}
		if(getNext() != null) {
			result += ".get" + getNext().compile(level,type);
			if(type != 1) {
				result += "(msg.sender)";
			}
		}
		return result;
	}
	
	public Term getTerm(EObject o) {
		if(o==null) return null;
		else if(o instanceof Term) return (Term) o;
		else return getTerm(o.eContainer());
		
	}

} //ThisExpressionImpl
