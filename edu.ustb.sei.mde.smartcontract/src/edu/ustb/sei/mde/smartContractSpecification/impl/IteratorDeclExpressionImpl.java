/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression;
import edu.ustb.sei.mde.smartContractSpecification.DataSlot;
import edu.ustb.sei.mde.smartContractSpecification.FieldContainer;
import edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression;
import edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression;
import edu.ustb.sei.mde.smartContractSpecification.SelectExpression;
import edu.ustb.sei.mde.smartContractSpecification.SlotRef;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Decl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IteratorDeclExpressionImpl extends DataSlotImpl implements IteratorDeclExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorDeclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.ITERATOR_DECL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FieldContainer getType() {
		QuantifierExpression exp = (QuantifierExpression) this.eContainer();
		SlotRef scope = getSlotRef(exp.getScope());
		if(scope==null) return null;
		
		SlotRef ref = (SlotRef)scope;
		while(ref.getNext()!=null)
			ref = ref.getNext();
		
		DataSlot ds = ref.getSlot();
		if(ds instanceof FieldContainer) 
			return (FieldContainer)ds;
		else 
			return null;
	}
	
	private SlotRef getSlotRef(CollectionSourceExpression exp) {
		if(exp instanceof SlotRef) return (SlotRef)exp;
		else if(exp instanceof SelectExpression) {
			return getSlotRef(((SelectExpression) exp).getSource());
		} else return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SmartContractSpecificationPackage.ITERATOR_DECL_EXPRESSION___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //IteratorDeclExpressionImpl
