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

	public abstract String compile(int parentlevel, int type);//0正常情况，1好像是图形时用到，2为后置条件生成执行
} // Expression
