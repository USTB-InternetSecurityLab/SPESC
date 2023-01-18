/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage
 * @generated
 */
public interface SmartContractSpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartContractSpecificationFactory eINSTANCE = edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Single Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Party</em>'.
	 * @generated
	 */
	SingleParty createSingleParty();

	/**
	 * Returns a new object of class '<em>Group Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Party</em>'.
	 * @generated
	 */
	GroupParty createGroupParty();

	/**
	 * Returns a new object of class '<em>External Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Party</em>'.
	 * @generated
	 */
	ExternalParty createExternalParty();

	/**
	 * Returns a new object of class '<em>Right Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Term</em>'.
	 * @generated
	 */
	RightTerm createRightTerm();

	/**
	 * Returns a new object of class '<em>Duty Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duty Term</em>'.
	 * @generated
	 */
	DutyTerm createDutyTerm();

	/**
	 * Returns a new object of class '<em>Breach Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breach Term</em>'.
	 * @generated
	 */
	BreachTerm createBreachTerm();

	/**
	 * Returns a new object of class '<em>Descriptive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptive Expression</em>'.
	 * @generated
	 */
	DescriptiveExpression createDescriptiveExpression();

	/**
	 * Returns a new object of class '<em>Quantifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantifier Expression</em>'.
	 * @generated
	 */
	QuantifierExpression createQuantifierExpression();

	/**
	 * Returns a new object of class '<em>Iterator Decl Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Decl Expression</em>'.
	 * @generated
	 */
	IteratorDeclExpression createIteratorDeclExpression();

	/**
	 * Returns a new object of class '<em>Select Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Expression</em>'.
	 * @generated
	 */
	SelectExpression createSelectExpression();

	/**
	 * Returns a new object of class '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Expression</em>'.
	 * @generated
	 */
	ConditionalExpression createConditionalExpression();

	/**
	 * Returns a new object of class '<em>Imply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imply Expression</em>'.
	 * @generated
	 */
	ImplyExpression createImplyExpression();

	/**
	 * Returns a new object of class '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression</em>'.
	 * @generated
	 */
	AndExpression createAndExpression();

	/**
	 * Returns a new object of class '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expression</em>'.
	 * @generated
	 */
	OrExpression createOrExpression();

	/**
	 * Returns a new object of class '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Expression</em>'.
	 * @generated
	 */
	NotExpression createNotExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns a new object of class '<em>Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Predicate</em>'.
	 * @generated
	 */
	TimePredicate createTimePredicate();

	/**
	 * Returns a new object of class '<em>Bounded Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Time Predicate</em>'.
	 * @generated
	 */
	BoundedTimePredicate createBoundedTimePredicate();

	/**
	 * Returns a new object of class '<em>Time Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Constant</em>'.
	 * @generated
	 */
	TimeConstant createTimeConstant();

	/**
	 * Returns a new object of class '<em>Time Var Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Var Expression</em>'.
	 * @generated
	 */
	TimeVarExpression createTimeVarExpression();

	/**
	 * Returns a new object of class '<em>Action Enforced Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Enforced Time Query</em>'.
	 * @generated
	 */
	ActionEnforcedTimeQuery createActionEnforcedTimeQuery();

	/**
	 * Returns a new object of class '<em>Term Valid Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Valid Time Query</em>'.
	 * @generated
	 */
	TermValidTimeQuery createTermValidTimeQuery();

	/**
	 * Returns a new object of class '<em>Global Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Time Query</em>'.
	 * @generated
	 */
	GlobalTimeQuery createGlobalTimeQuery();

	/**
	 * Returns a new object of class '<em>Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additive Expression</em>'.
	 * @generated
	 */
	AdditiveExpression createAdditiveExpression();

	/**
	 * Returns a new object of class '<em>Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicative Expression</em>'.
	 * @generated
	 */
	MultiplicativeExpression createMultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>Float Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Constant</em>'.
	 * @generated
	 */
	FloatConstant createFloatConstant();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Constant</em>'.
	 * @generated
	 */
	IntegerConstant createIntegerConstant();

	/**
	 * Returns a new object of class '<em>Valueconstant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valueconstant</em>'.
	 * @generated
	 */
	Valueconstant createValueconstant();

	/**
	 * Returns a new object of class '<em>Booleanconstant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booleanconstant</em>'.
	 * @generated
	 */
	Booleanconstant createBooleanconstant();

	/**
	 * Returns a new object of class '<em>Type Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Lib</em>'.
	 * @generated
	 */
	TypeLib createTypeLib();

	/**
	 * Returns a new object of class '<em>Slot Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Ref</em>'.
	 * @generated
	 */
	SlotRef createSlotRef();

	/**
	 * Returns a new object of class '<em>Deposit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deposit</em>'.
	 * @generated
	 */
	Deposit createDeposit();

	/**
	 * Returns a new object of class '<em>Withdraw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Withdraw</em>'.
	 * @generated
	 */
	Withdraw createWithdraw();

	/**
	 * Returns a new object of class '<em>Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer</em>'.
	 * @generated
	 */
	Transfer createTransfer();

	/**
	 * Returns a new object of class '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Expression</em>'.
	 * @generated
	 */
	ThisExpression createThisExpression();

	/**
	 * Returns a new object of class '<em>Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line</em>'.
	 * @generated
	 */
	TimeLine createTimeLine();

	/**
	 * Returns a new object of class '<em>enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>enum Type</em>'.
	 * @generated
	 */
	enumType createenumType();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Money Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Money Expression</em>'.
	 * @generated
	 */
	MoneyExpression createMoneyExpression();

	/**
	 * Returns a new object of class '<em>Right Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Expression</em>'.
	 * @generated
	 */
	RightExpression createRightExpression();

	/**
	 * Returns a new object of class '<em>Periodic Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Time Predicate</em>'.
	 * @generated
	 */
	PeriodicTimePredicate createPeriodicTimePredicate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmartContractSpecificationPackage getSmartContractSpecificationPackage();

} //SmartContractSpecificationFactory
