/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {

	public abstract String compile(int parentlevel, int type);//0���������1������ͼ��ʱ�õ���2Ϊ������������ִ��
} // Expression
