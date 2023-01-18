/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression;
import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression;
import edu.ustb.sei.mde.smartContractSpecification.Quantifier;
import edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantifier Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl#getQunatifier <em>Qunatifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifierExpressionImpl extends ExpressionImpl implements QuantifierExpression {
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CollectionSourceExpression scope;

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
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected IteratorDeclExpression iterator;

	/**
	 * The default value of the '{@link #getQunatifier() <em>Qunatifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQunatifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUNATIFIER_EDEFAULT = Quantifier.FOR_ALL;

	/**
	 * The cached value of the '{@link #getQunatifier() <em>Qunatifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQunatifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier qunatifier = QUNATIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifierExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.QUANTIFIER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionSourceExpression getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CollectionSourceExpression newScope, NotificationChain msgs) {
		CollectionSourceExpression oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(CollectionSourceExpression newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE, newScope, newScope));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorDeclExpression getIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterator(IteratorDeclExpression newIterator, NotificationChain msgs) {
		IteratorDeclExpression oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR, oldIterator, newIterator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(IteratorDeclExpression newIterator) {
		if (newIterator != iterator) {
			NotificationChain msgs = null;
			if (iterator != null)
				msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR, null, msgs);
			if (newIterator != null)
				msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR, null, msgs);
			msgs = basicSetIterator(newIterator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR, newIterator, newIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQunatifier() {
		return qunatifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQunatifier(Quantifier newQunatifier) {
		Quantifier oldQunatifier = qunatifier;
		qunatifier = newQunatifier == null ? QUNATIFIER_EDEFAULT : newQunatifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__QUNATIFIER, oldQunatifier, qunatifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE:
				return basicSetScope(null, msgs);
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION:
				return basicSetCondition(null, msgs);
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR:
				return basicSetIterator(null, msgs);
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
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE:
				return getScope();
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION:
				return getCondition();
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR:
				return getIterator();
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__QUNATIFIER:
				return getQunatifier();
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
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE:
				setScope((CollectionSourceExpression)newValue);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR:
				setIterator((IteratorDeclExpression)newValue);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__QUNATIFIER:
				setQunatifier((Quantifier)newValue);
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
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE:
				setScope((CollectionSourceExpression)null);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION:
				setCondition((Expression)null);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR:
				setIterator((IteratorDeclExpression)null);
				return;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__QUNATIFIER:
				setQunatifier(QUNATIFIER_EDEFAULT);
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
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__SCOPE:
				return scope != null;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__CONDITION:
				return condition != null;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__ITERATOR:
				return iterator != null;
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION__QUNATIFIER:
				return qunatifier != QUNATIFIER_EDEFAULT;
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
		result.append(" (qunatifier: ");
		result.append(qunatifier);
		result.append(')');
		return result.toString();
	}

	@Override
	public String compile(int parentlevel, int type) {
		// TODO Auto-generated method stub
		return null;
	}

} //QuantifierExpressionImpl
