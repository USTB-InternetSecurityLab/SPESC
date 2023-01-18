/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartContractSpecificationFactoryImpl extends EFactoryImpl implements SmartContractSpecificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartContractSpecificationFactory init() {
		try {
			SmartContractSpecificationFactory theSmartContractSpecificationFactory = (SmartContractSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(SmartContractSpecificationPackage.eNS_URI);
			if (theSmartContractSpecificationFactory != null) {
				return theSmartContractSpecificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartContractSpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractSpecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmartContractSpecificationPackage.CONTRACT: return createContract();
			case SmartContractSpecificationPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case SmartContractSpecificationPackage.COMPLEX_TYPE: return createComplexType();
			case SmartContractSpecificationPackage.ASSET: return createAsset();
			case SmartContractSpecificationPackage.FIELD: return createField();
			case SmartContractSpecificationPackage.ACTION: return createAction();
			case SmartContractSpecificationPackage.SINGLE_PARTY: return createSingleParty();
			case SmartContractSpecificationPackage.GROUP_PARTY: return createGroupParty();
			case SmartContractSpecificationPackage.EXTERNAL_PARTY: return createExternalParty();
			case SmartContractSpecificationPackage.RIGHT_TERM: return createRightTerm();
			case SmartContractSpecificationPackage.DUTY_TERM: return createDutyTerm();
			case SmartContractSpecificationPackage.BREACH_TERM: return createBreachTerm();
			case SmartContractSpecificationPackage.DESCRIPTIVE_EXPRESSION: return createDescriptiveExpression();
			case SmartContractSpecificationPackage.QUANTIFIER_EXPRESSION: return createQuantifierExpression();
			case SmartContractSpecificationPackage.ITERATOR_DECL_EXPRESSION: return createIteratorDeclExpression();
			case SmartContractSpecificationPackage.SELECT_EXPRESSION: return createSelectExpression();
			case SmartContractSpecificationPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case SmartContractSpecificationPackage.IMPLY_EXPRESSION: return createImplyExpression();
			case SmartContractSpecificationPackage.AND_EXPRESSION: return createAndExpression();
			case SmartContractSpecificationPackage.OR_EXPRESSION: return createOrExpression();
			case SmartContractSpecificationPackage.NOT_EXPRESSION: return createNotExpression();
			case SmartContractSpecificationPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case SmartContractSpecificationPackage.TIME_PREDICATE: return createTimePredicate();
			case SmartContractSpecificationPackage.BOUNDED_TIME_PREDICATE: return createBoundedTimePredicate();
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE: return createPeriodicTimePredicate();
			case SmartContractSpecificationPackage.TIME_CONSTANT: return createTimeConstant();
			case SmartContractSpecificationPackage.TIME_VAR_EXPRESSION: return createTimeVarExpression();
			case SmartContractSpecificationPackage.ACTION_ENFORCED_TIME_QUERY: return createActionEnforcedTimeQuery();
			case SmartContractSpecificationPackage.TERM_VALID_TIME_QUERY: return createTermValidTimeQuery();
			case SmartContractSpecificationPackage.GLOBAL_TIME_QUERY: return createGlobalTimeQuery();
			case SmartContractSpecificationPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
			case SmartContractSpecificationPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
			case SmartContractSpecificationPackage.FLOAT_CONSTANT: return createFloatConstant();
			case SmartContractSpecificationPackage.STRING_CONSTANT: return createStringConstant();
			case SmartContractSpecificationPackage.INTEGER_CONSTANT: return createIntegerConstant();
			case SmartContractSpecificationPackage.VALUECONSTANT: return createValueconstant();
			case SmartContractSpecificationPackage.BOOLEANCONSTANT: return createBooleanconstant();
			case SmartContractSpecificationPackage.TYPE_LIB: return createTypeLib();
			case SmartContractSpecificationPackage.SLOT_REF: return createSlotRef();
			case SmartContractSpecificationPackage.DEPOSIT: return createDeposit();
			case SmartContractSpecificationPackage.WITHDRAW: return createWithdraw();
			case SmartContractSpecificationPackage.TRANSFER: return createTransfer();
			case SmartContractSpecificationPackage.THIS_EXPRESSION: return createThisExpression();
			case SmartContractSpecificationPackage.TIME_LINE: return createTimeLine();
			case SmartContractSpecificationPackage.ENUM_TYPE: return createenumType();
			case SmartContractSpecificationPackage.SELECTION: return createSelection();
			case SmartContractSpecificationPackage.MONEY_EXPRESSION: return createMoneyExpression();
			case SmartContractSpecificationPackage.RIGHT_EXPRESSION: return createRightExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmartContractSpecificationPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.TIME_PREDICATE_OPERATOR:
				return createTimePredicateOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.PARTY_MEMBER_MULTIPLICITY:
				return createPartyMemberMultiplicityFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.TIME_QUERY_OPERATOR:
				return createTimeQueryOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.ADDITIVE_OPERATOR:
				return createAdditiveOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.MULTIPLICATIVE_OPERATOR:
				return createMultiplicativeOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.TRANSITIVE_OPERATOR:
				return createTransitiveOperatorFromString(eDataType, initialValue);
			case SmartContractSpecificationPackage.TIME_LINE_OPERATOR:
				return createTimeLineOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmartContractSpecificationPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.TIME_PREDICATE_OPERATOR:
				return convertTimePredicateOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.PARTY_MEMBER_MULTIPLICITY:
				return convertPartyMemberMultiplicityToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.TIME_QUERY_OPERATOR:
				return convertTimeQueryOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.ADDITIVE_OPERATOR:
				return convertAdditiveOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.MULTIPLICATIVE_OPERATOR:
				return convertMultiplicativeOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.TRANSITIVE_OPERATOR:
				return convertTransitiveOperatorToString(eDataType, instanceValue);
			case SmartContractSpecificationPackage.TIME_LINE_OPERATOR:
				return convertTimeLineOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleParty createSingleParty() {
		SinglePartyImpl singleParty = new SinglePartyImpl();
		return singleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupParty createGroupParty() {
		GroupPartyImpl groupParty = new GroupPartyImpl();
		return groupParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalParty createExternalParty() {
		ExternalPartyImpl externalParty = new ExternalPartyImpl();
		return externalParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightTerm createRightTerm() {
		RightTermImpl rightTerm = new RightTermImpl();
		return rightTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DutyTerm createDutyTerm() {
		DutyTermImpl dutyTerm = new DutyTermImpl();
		return dutyTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreachTerm createBreachTerm() {
		BreachTermImpl breachTerm = new BreachTermImpl();
		return breachTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveExpression createDescriptiveExpression() {
		DescriptiveExpressionImpl descriptiveExpression = new DescriptiveExpressionImpl();
		return descriptiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierExpression createQuantifierExpression() {
		QuantifierExpressionImpl quantifierExpression = new QuantifierExpressionImpl();
		return quantifierExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorDeclExpression createIteratorDeclExpression() {
		IteratorDeclExpressionImpl iteratorDeclExpression = new IteratorDeclExpressionImpl();
		return iteratorDeclExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectExpression createSelectExpression() {
		SelectExpressionImpl selectExpression = new SelectExpressionImpl();
		return selectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplyExpression createImplyExpression() {
		ImplyExpressionImpl implyExpression = new ImplyExpressionImpl();
		return implyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePredicate createTimePredicate() {
		TimePredicateImpl timePredicate = new TimePredicateImpl();
		return timePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedTimePredicate createBoundedTimePredicate() {
		BoundedTimePredicateImpl boundedTimePredicate = new BoundedTimePredicateImpl();
		return boundedTimePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstant createTimeConstant() {
		TimeConstantImpl timeConstant = new TimeConstantImpl();
		return timeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeVarExpression createTimeVarExpression() {
		TimeVarExpressionImpl timeVarExpression = new TimeVarExpressionImpl();
		return timeVarExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnforcedTimeQuery createActionEnforcedTimeQuery() {
		ActionEnforcedTimeQueryImpl actionEnforcedTimeQuery = new ActionEnforcedTimeQueryImpl();
		return actionEnforcedTimeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermValidTimeQuery createTermValidTimeQuery() {
		TermValidTimeQueryImpl termValidTimeQuery = new TermValidTimeQueryImpl();
		return termValidTimeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTimeQuery createGlobalTimeQuery() {
		GlobalTimeQueryImpl globalTimeQuery = new GlobalTimeQueryImpl();
		return globalTimeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveExpression createAdditiveExpression() {
		AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
		return additiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicativeExpression createMultiplicativeExpression() {
		MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
		return multiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatConstant createFloatConstant() {
		FloatConstantImpl floatConstant = new FloatConstantImpl();
		return floatConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valueconstant createValueconstant() {
		ValueconstantImpl valueconstant = new ValueconstantImpl();
		return valueconstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booleanconstant createBooleanconstant() {
		BooleanconstantImpl booleanconstant = new BooleanconstantImpl();
		return booleanconstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLib createTypeLib() {
		TypeLibImpl typeLib = new TypeLibImpl();
		return typeLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotRef createSlotRef() {
		SlotRefImpl slotRef = new SlotRefImpl();
		return slotRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deposit createDeposit() {
		DepositImpl deposit = new DepositImpl();
		return deposit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Withdraw createWithdraw() {
		WithdrawImpl withdraw = new WithdrawImpl();
		return withdraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfer createTransfer() {
		TransferImpl transfer = new TransferImpl();
		return transfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine createTimeLine() {
		TimeLineImpl timeLine = new TimeLineImpl();
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public enumType createenumType() {
		enumTypeImpl enumType = new enumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoneyExpression createMoneyExpression() {
		MoneyExpressionImpl moneyExpression = new MoneyExpressionImpl();
		return moneyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightExpression createRightExpression() {
		RightExpressionImpl rightExpression = new RightExpressionImpl();
		return rightExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicTimePredicate createPeriodicTimePredicate() {
		PeriodicTimePredicateImpl periodicTimePredicate = new PeriodicTimePredicateImpl();
		return periodicTimePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePredicateOperator createTimePredicateOperatorFromString(EDataType eDataType, String initialValue) {
		TimePredicateOperator result = TimePredicateOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePredicateOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyMemberMultiplicity createPartyMemberMultiplicityFromString(EDataType eDataType, String initialValue) {
		PartyMemberMultiplicity result = PartyMemberMultiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartyMemberMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeQueryOperator createTimeQueryOperatorFromString(EDataType eDataType, String initialValue) {
		TimeQueryOperator result = TimeQueryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeQueryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveOperator createAdditiveOperatorFromString(EDataType eDataType, String initialValue) {
		AdditiveOperator result = AdditiveOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditiveOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicativeOperator createMultiplicativeOperatorFromString(EDataType eDataType, String initialValue) {
		MultiplicativeOperator result = MultiplicativeOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicativeOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveOperator createTransitiveOperatorFromString(EDataType eDataType, String initialValue) {
		TransitiveOperator result = TransitiveOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitiveOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineOperator createTimeLineOperatorFromString(EDataType eDataType, String initialValue) {
		TimeLineOperator result = TimeLineOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeLineOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractSpecificationPackage getSmartContractSpecificationPackage() {
		return (SmartContractSpecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartContractSpecificationPackage getPackage() {
		return SmartContractSpecificationPackage.eINSTANCE;
	}

} //SmartContractSpecificationFactoryImpl
