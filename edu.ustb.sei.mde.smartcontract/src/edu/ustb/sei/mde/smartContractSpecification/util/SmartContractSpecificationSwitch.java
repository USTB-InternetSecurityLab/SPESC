/**
 */
package edu.ustb.sei.mde.smartContractSpecification.util;

import edu.ustb.sei.mde.smartContractSpecification.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage
 * @generated
 */
public class SmartContractSpecificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmartContractSpecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractSpecificationSwitch() {
		if (modelPackage == null) {
			modelPackage = SmartContractSpecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmartContractSpecificationPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseNamedElement(contract);
				if (result == null) result = caseFieldContainer(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = caseType(party);
				if (result == null) result = caseNamedElement(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseType(complexType);
				if (result == null) result = caseFieldContainer(complexType);
				if (result == null) result = caseNamedElement(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseType(asset);
				if (result == null) result = caseFieldContainer(asset);
				if (result == null) result = caseNamedElement(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseTypedElement(field);
				if (result == null) result = caseDataSlot(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseTypedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.INTERNAL_PARTY: {
				InternalParty internalParty = (InternalParty)theEObject;
				T result = caseInternalParty(internalParty);
				if (result == null) result = caseParty(internalParty);
				if (result == null) result = caseDataSlot(internalParty);
				if (result == null) result = caseFieldContainer(internalParty);
				if (result == null) result = caseType(internalParty);
				if (result == null) result = caseNamedElement(internalParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.SINGLE_PARTY: {
				SingleParty singleParty = (SingleParty)theEObject;
				T result = caseSingleParty(singleParty);
				if (result == null) result = caseInternalParty(singleParty);
				if (result == null) result = caseParty(singleParty);
				if (result == null) result = caseDataSlot(singleParty);
				if (result == null) result = caseFieldContainer(singleParty);
				if (result == null) result = caseType(singleParty);
				if (result == null) result = caseNamedElement(singleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.GROUP_PARTY: {
				GroupParty groupParty = (GroupParty)theEObject;
				T result = caseGroupParty(groupParty);
				if (result == null) result = caseInternalParty(groupParty);
				if (result == null) result = caseParty(groupParty);
				if (result == null) result = caseDataSlot(groupParty);
				if (result == null) result = caseFieldContainer(groupParty);
				if (result == null) result = caseType(groupParty);
				if (result == null) result = caseNamedElement(groupParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.EXTERNAL_PARTY: {
				ExternalParty externalParty = (ExternalParty)theEObject;
				T result = caseExternalParty(externalParty);
				if (result == null) result = caseParty(externalParty);
				if (result == null) result = caseType(externalParty);
				if (result == null) result = caseNamedElement(externalParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseNamedElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.RIGHT_TERM: {
				RightTerm rightTerm = (RightTerm)theEObject;
				T result = caseRightTerm(rightTerm);
				if (result == null) result = caseTerm(rightTerm);
				if (result == null) result = caseNamedElement(rightTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.DUTY_TERM: {
				DutyTerm dutyTerm = (DutyTerm)theEObject;
				T result = caseDutyTerm(dutyTerm);
				if (result == null) result = caseTerm(dutyTerm);
				if (result == null) result = caseNamedElement(dutyTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.BREACH_TERM: {
				BreachTerm breachTerm = (BreachTerm)theEObject;
				T result = caseBreachTerm(breachTerm);
				if (result == null) result = caseTerm(breachTerm);
				if (result == null) result = caseNamedElement(breachTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.COLLECTION_SOURCE_EXPRESSION: {
				CollectionSourceExpression collectionSourceExpression = (CollectionSourceExpression)theEObject;
				T result = caseCollectionSourceExpression(collectionSourceExpression);
				if (result == null) result = caseExpression(collectionSourceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION: {
				DescriptiveExpression descriptiveExpression = (DescriptiveExpression)theEObject;
				T result = caseDescriptiveExpression(descriptiveExpression);
				if (result == null) result = caseExpression(descriptiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION: {
				QuantifierExpression quantifierExpression = (QuantifierExpression)theEObject;
				T result = caseQuantifierExpression(quantifierExpression);
				if (result == null) result = caseExpression(quantifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ITERATOR_DECL_EXPRESSION: {
				IteratorDeclExpression iteratorDeclExpression = (IteratorDeclExpression)theEObject;
				T result = caseIteratorDeclExpression(iteratorDeclExpression);
				if (result == null) result = caseDataSlot(iteratorDeclExpression);
				if (result == null) result = caseNamedElement(iteratorDeclExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseCollectionSourceExpression(collectionExpression);
				if (result == null) result = caseExpression(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.SELECT_EXPRESSION: {
				SelectExpression selectExpression = (SelectExpression)theEObject;
				T result = caseSelectExpression(selectExpression);
				if (result == null) result = caseCollectionExpression(selectExpression);
				if (result == null) result = caseCollectionSourceExpression(selectExpression);
				if (result == null) result = caseExpression(selectExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION: {
				ImplyExpression implyExpression = (ImplyExpression)theEObject;
				T result = caseImplyExpression(implyExpression);
				if (result == null) result = caseLogicalExpression(implyExpression);
				if (result == null) result = caseExpression(implyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseLogicalExpression(andExpression);
				if (result == null) result = caseExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.OR_EXPRESSION: {
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = caseLogicalExpression(orExpression);
				if (result == null) result = caseExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.NOT_EXPRESSION: {
				NotExpression notExpression = (NotExpression)theEObject;
				T result = caseNotExpression(notExpression);
				if (result == null) result = caseLogicalExpression(notExpression);
				if (result == null) result = caseExpression(notExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseExpression(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_PREDICATE: {
				TimePredicate timePredicate = (TimePredicate)theEObject;
				T result = caseTimePredicate(timePredicate);
				if (result == null) result = caseExpression(timePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.BOUNDED_TIME_PREDICATE: {
				BoundedTimePredicate boundedTimePredicate = (BoundedTimePredicate)theEObject;
				T result = caseBoundedTimePredicate(boundedTimePredicate);
				if (result == null) result = caseTimePredicate(boundedTimePredicate);
				if (result == null) result = caseExpression(boundedTimePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE: {
				PeriodicTimePredicate periodicTimePredicate = (PeriodicTimePredicate)theEObject;
				T result = casePeriodicTimePredicate(periodicTimePredicate);
				if (result == null) result = caseTimePredicate(periodicTimePredicate);
				if (result == null) result = caseExpression(periodicTimePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = caseExpression(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_CONSTANT: {
				TimeConstant timeConstant = (TimeConstant)theEObject;
				T result = caseTimeConstant(timeConstant);
				if (result == null) result = caseTimeExpression(timeConstant);
				if (result == null) result = caseExpression(timeConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_VAR_EXPRESSION: {
				TimeVarExpression timeVarExpression = (TimeVarExpression)theEObject;
				T result = caseTimeVarExpression(timeVarExpression);
				if (result == null) result = caseTimeExpression(timeVarExpression);
				if (result == null) result = caseSlotRef(timeVarExpression);
				if (result == null) result = caseCollectionSourceExpression(timeVarExpression);
				if (result == null) result = caseExpression(timeVarExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY: {
				ActionEnforcedTimeQuery actionEnforcedTimeQuery = (ActionEnforcedTimeQuery)theEObject;
				T result = caseActionEnforcedTimeQuery(actionEnforcedTimeQuery);
				if (result == null) result = caseTimeQuery(actionEnforcedTimeQuery);
				if (result == null) result = caseTimeExpression(actionEnforcedTimeQuery);
				if (result == null) result = caseExpression(actionEnforcedTimeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TERM_VALID_TIME_QUERY: {
				TermValidTimeQuery termValidTimeQuery = (TermValidTimeQuery)theEObject;
				T result = caseTermValidTimeQuery(termValidTimeQuery);
				if (result == null) result = caseTimeQuery(termValidTimeQuery);
				if (result == null) result = caseTimeExpression(termValidTimeQuery);
				if (result == null) result = caseExpression(termValidTimeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.GLOBAL_TIME_QUERY: {
				GlobalTimeQuery globalTimeQuery = (GlobalTimeQuery)theEObject;
				T result = caseGlobalTimeQuery(globalTimeQuery);
				if (result == null) result = caseTimeQuery(globalTimeQuery);
				if (result == null) result = caseTimeExpression(globalTimeQuery);
				if (result == null) result = caseExpression(globalTimeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_QUERY: {
				TimeQuery timeQuery = (TimeQuery)theEObject;
				T result = caseTimeQuery(timeQuery);
				if (result == null) result = caseTimeExpression(timeQuery);
				if (result == null) result = caseExpression(timeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ADDITIVE_EXPRESSION: {
				AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
				T result = caseAdditiveExpression(additiveExpression);
				if (result == null) result = caseArithmeticExpression(additiveExpression);
				if (result == null) result = caseExpression(additiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.MULTIPLICATIVE_EXPRESSION: {
				MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
				T result = caseMultiplicativeExpression(multiplicativeExpression);
				if (result == null) result = caseArithmeticExpression(multiplicativeExpression);
				if (result == null) result = caseExpression(multiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.CONSTANT_EXPRESSION: {
				ConstantExpression constantExpression = (ConstantExpression)theEObject;
				T result = caseConstantExpression(constantExpression);
				if (result == null) result = caseExpression(constantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.FLOAT_CONSTANT: {
				FloatConstant floatConstant = (FloatConstant)theEObject;
				T result = caseFloatConstant(floatConstant);
				if (result == null) result = caseConstantExpression(floatConstant);
				if (result == null) result = caseExpression(floatConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseConstantExpression(stringConstant);
				if (result == null) result = caseExpression(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.INTEGER_CONSTANT: {
				IntegerConstant integerConstant = (IntegerConstant)theEObject;
				T result = caseIntegerConstant(integerConstant);
				if (result == null) result = caseConstantExpression(integerConstant);
				if (result == null) result = caseExpression(integerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.VALUECONSTANT: {
				Valueconstant valueconstant = (Valueconstant)theEObject;
				T result = caseValueconstant(valueconstant);
				if (result == null) result = caseConstantExpression(valueconstant);
				if (result == null) result = caseExpression(valueconstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.BOOLEANCONSTANT: {
				Booleanconstant booleanconstant = (Booleanconstant)theEObject;
				T result = caseBooleanconstant(booleanconstant);
				if (result == null) result = caseConstantExpression(booleanconstant);
				if (result == null) result = caseExpression(booleanconstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TYPE_LIB: {
				TypeLib typeLib = (TypeLib)theEObject;
				T result = caseTypeLib(typeLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.SLOT_REF: {
				SlotRef slotRef = (SlotRef)theEObject;
				T result = caseSlotRef(slotRef);
				if (result == null) result = caseCollectionSourceExpression(slotRef);
				if (result == null) result = caseExpression(slotRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.DATA_SLOT: {
				DataSlot dataSlot = (DataSlot)theEObject;
				T result = caseDataSlot(dataSlot);
				if (result == null) result = caseNamedElement(dataSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TRANSFER_OPERATION: {
				TransferOperation transferOperation = (TransferOperation)theEObject;
				T result = caseTransferOperation(transferOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.DEPOSIT: {
				Deposit deposit = (Deposit)theEObject;
				T result = caseDeposit(deposit);
				if (result == null) result = caseTransferOperation(deposit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.WITHDRAW: {
				Withdraw withdraw = (Withdraw)theEObject;
				T result = caseWithdraw(withdraw);
				if (result == null) result = caseTransferOperation(withdraw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TRANSFER: {
				Transfer transfer = (Transfer)theEObject;
				T result = caseTransfer(transfer);
				if (result == null) result = caseTransferOperation(transfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.THIS_EXPRESSION: {
				ThisExpression thisExpression = (ThisExpression)theEObject;
				T result = caseThisExpression(thisExpression);
				if (result == null) result = caseTimeExpression(thisExpression);
				if (result == null) result = caseSlotRef(thisExpression);
				if (result == null) result = caseCollectionSourceExpression(thisExpression);
				if (result == null) result = caseExpression(thisExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.FIELD_CONTAINER: {
				FieldContainer fieldContainer = (FieldContainer)theEObject;
				T result = caseFieldContainer(fieldContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.TIME_LINE: {
				TimeLine timeLine = (TimeLine)theEObject;
				T result = caseTimeLine(timeLine);
				if (result == null) result = caseTimeExpression(timeLine);
				if (result == null) result = caseExpression(timeLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.ENUM_TYPE: {
				enumType enumType = (enumType)theEObject;
				T result = caseenumType(enumType);
				if (result == null) result = caseType(enumType);
				if (result == null) result = caseNamedElement(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseNamedElement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.MONEY_EXPRESSION: {
				MoneyExpression moneyExpression = (MoneyExpression)theEObject;
				T result = caseMoneyExpression(moneyExpression);
				if (result == null) result = caseDataSlot(moneyExpression);
				if (result == null) result = caseNamedElement(moneyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION: {
				RightExpression rightExpression = (RightExpression)theEObject;
				T result = caseRightExpression(rightExpression);
				if (result == null) result = caseDataSlot(rightExpression);
				if (result == null) result = caseNamedElement(rightExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalParty(InternalParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleParty(SingleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupParty(GroupParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalParty(ExternalParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightTerm(RightTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duty Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duty Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDutyTerm(DutyTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breach Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breach Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreachTerm(BreachTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Source Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Source Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionSourceExpression(CollectionSourceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptiveExpression(DescriptiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierExpression(QuantifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Decl Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Decl Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorDeclExpression(IteratorDeclExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectExpression(SelectExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imply Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplyExpression(ImplyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotExpression(NotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePredicate(TimePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Time Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedTimePredicate(BoundedTimePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstant(TimeConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Var Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Var Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeVarExpression(TimeVarExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Enforced Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Enforced Time Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEnforcedTimeQuery(ActionEnforcedTimeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Valid Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Valid Time Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermValidTimeQuery(TermValidTimeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Time Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalTimeQuery(GlobalTimeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeQuery(TimeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveExpression(AdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeExpression(MultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExpression(ConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatConstant(FloatConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valueconstant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valueconstant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueconstant(Valueconstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booleanconstant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booleanconstant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanconstant(Booleanconstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLib(TypeLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotRef(SlotRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSlot(DataSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferOperation(TransferOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deposit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deposit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeposit(Deposit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Withdraw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Withdraw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithdraw(Withdraw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfer(Transfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThisExpression(ThisExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldContainer(FieldContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLine(TimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseenumType(enumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoneyExpression(MoneyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightExpression(RightExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Time Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Time Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicTimePredicate(PeriodicTimePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SmartContractSpecificationSwitch
