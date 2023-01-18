/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Action;
import edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery;
import edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression;
import edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator;
import edu.ustb.sei.mde.smartContractSpecification.AndExpression;
import edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression;
import edu.ustb.sei.mde.smartContractSpecification.Asset;
import edu.ustb.sei.mde.smartContractSpecification.Booleanconstant;
import edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.BreachTerm;
import edu.ustb.sei.mde.smartContractSpecification.CollectionExpression;
import edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression;
import edu.ustb.sei.mde.smartContractSpecification.ComplexType;
import edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression;
import edu.ustb.sei.mde.smartContractSpecification.ConstantExpression;
import edu.ustb.sei.mde.smartContractSpecification.Contract;
import edu.ustb.sei.mde.smartContractSpecification.DataSlot;
import edu.ustb.sei.mde.smartContractSpecification.Deposit;
import edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression;
import edu.ustb.sei.mde.smartContractSpecification.DutyTerm;
import edu.ustb.sei.mde.smartContractSpecification.Expression;
import edu.ustb.sei.mde.smartContractSpecification.ExternalParty;
import edu.ustb.sei.mde.smartContractSpecification.Field;
import edu.ustb.sei.mde.smartContractSpecification.FieldContainer;
import edu.ustb.sei.mde.smartContractSpecification.FloatConstant;
import edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery;
import edu.ustb.sei.mde.smartContractSpecification.GroupParty;
import edu.ustb.sei.mde.smartContractSpecification.ImplyExpression;
import edu.ustb.sei.mde.smartContractSpecification.IntegerConstant;
import edu.ustb.sei.mde.smartContractSpecification.InternalParty;
import edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression;
import edu.ustb.sei.mde.smartContractSpecification.LogicalExpression;
import edu.ustb.sei.mde.smartContractSpecification.MoneyExpression;
import edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression;
import edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator;
import edu.ustb.sei.mde.smartContractSpecification.NamedElement;
import edu.ustb.sei.mde.smartContractSpecification.NotExpression;
import edu.ustb.sei.mde.smartContractSpecification.OrExpression;
import edu.ustb.sei.mde.smartContractSpecification.Party;
import edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity;
import edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType;
import edu.ustb.sei.mde.smartContractSpecification.Quantifier;
import edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression;
import edu.ustb.sei.mde.smartContractSpecification.RelationalExpression;
import edu.ustb.sei.mde.smartContractSpecification.RelationalOperator;
import edu.ustb.sei.mde.smartContractSpecification.RightExpression;
import edu.ustb.sei.mde.smartContractSpecification.RightTerm;
import edu.ustb.sei.mde.smartContractSpecification.SelectExpression;
import edu.ustb.sei.mde.smartContractSpecification.Selection;
import edu.ustb.sei.mde.smartContractSpecification.SingleParty;
import edu.ustb.sei.mde.smartContractSpecification.SlotRef;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.StringConstant;
import edu.ustb.sei.mde.smartContractSpecification.Term;
import edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery;
import edu.ustb.sei.mde.smartContractSpecification.ThisExpression;
import edu.ustb.sei.mde.smartContractSpecification.TimeConstant;
import edu.ustb.sei.mde.smartContractSpecification.TimeExpression;
import edu.ustb.sei.mde.smartContractSpecification.TimeLine;
import edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator;
import edu.ustb.sei.mde.smartContractSpecification.TimeQuery;
import edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator;
import edu.ustb.sei.mde.smartContractSpecification.TimeVarExpression;
import edu.ustb.sei.mde.smartContractSpecification.Transfer;
import edu.ustb.sei.mde.smartContractSpecification.TransferOperation;
import edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator;
import edu.ustb.sei.mde.smartContractSpecification.Type;
import edu.ustb.sei.mde.smartContractSpecification.TypeLib;
import edu.ustb.sei.mde.smartContractSpecification.TypedElement;
import edu.ustb.sei.mde.smartContractSpecification.Valueconstant;
import edu.ustb.sei.mde.smartContractSpecification.Withdraw;
import edu.ustb.sei.mde.smartContractSpecification.enumType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartContractSpecificationPackageImpl extends EPackageImpl implements SmartContractSpecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dutyTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breachTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionSourceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorDeclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedTimePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeVarExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEnforcedTimeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termValidTimeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalTimeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueconstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanconstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depositEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withdrawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicTimePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timePredicateOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partyMemberMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeQueryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additiveOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicativeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitiveOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeLineOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartContractSpecificationPackageImpl() {
		super(eNS_URI, SmartContractSpecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmartContractSpecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartContractSpecificationPackage init() {
		if (isInited) return (SmartContractSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(SmartContractSpecificationPackage.eNS_URI);

		// Obtain or create and register package
		SmartContractSpecificationPackageImpl theSmartContractSpecificationPackage = (SmartContractSpecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmartContractSpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmartContractSpecificationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSmartContractSpecificationPackage.createPackageContents();

		// Initialize created meta-data
		theSmartContractSpecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmartContractSpecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartContractSpecificationPackage.eNS_URI, theSmartContractSpecificationPackage);
		return theSmartContractSpecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Parties() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Terms() {
		return (EReference)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Types() {
		return (EReference)contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_EnumTypes() {
		return (EReference)contractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Assets() {
		return (EReference)contractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Actions() {
		return (EReference)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_InstanceType() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Many() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Parameters() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_IsMany() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Times() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Used() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalParty() {
		return internalPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleParty() {
		return singlePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupParty() {
		return groupPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalParty() {
		return externalPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Condition() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Action() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Party() {
		return (EReference)termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_TransferOperations() {
		return (EReference)termEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Break() {
		return (EAttribute)termEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_PostCondition() {
		return (EReference)termEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Auto() {
		return (EAttribute)termEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_BreachOperations() {
		return (EReference)termEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightTerm() {
		return rightTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDutyTerm() {
		return dutyTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreachTerm() {
		return breachTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionSourceExpression() {
		return collectionSourceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveExpression() {
		return descriptiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptiveExpression_PlainText() {
		return (EAttribute)descriptiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifierExpression() {
		return quantifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpression_Scope() {
		return (EReference)quantifierExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpression_Condition() {
		return (EReference)quantifierExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpression_Iterator() {
		return (EReference)quantifierExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifierExpression_Qunatifier() {
		return (EAttribute)quantifierExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorDeclExpression() {
		return iteratorDeclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIteratorDeclExpression__GetType() {
		return iteratorDeclExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpression() {
		return collectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpression_Source() {
		return (EReference)collectionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectExpression() {
		return selectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectExpression_Condition() {
		return (EReference)selectExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Condition() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ThenBranch() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ElseBranch() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplyExpression() {
		return implyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplyExpression_Condition() {
		return (EReference)implyExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplyExpression_Implied() {
		return (EReference)implyExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpression_Left() {
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpression_Right() {
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrExpression_Left() {
		return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrExpression_Right() {
		return (EReference)orExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotExpression() {
		return notExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotExpression_Inner() {
		return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Left() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Right() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_Operator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePredicate() {
		return timePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePredicate_Base() {
		return (EReference)timePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePredicate_Operator() {
		return (EAttribute)timePredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedTimePredicate() {
		return boundedTimePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedTimePredicate_Bound() {
		return (EReference)boundedTimePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedTimePredicate_Closed() {
		return (EAttribute)boundedTimePredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstant() {
		return timeConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Year() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Month() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Day() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Hour() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Min() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Sec() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstant_Date() {
		return (EAttribute)timeConstantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeVarExpression() {
		return timeVarExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionEnforcedTimeQuery() {
		return actionEnforcedTimeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionEnforcedTimeQuery_Action() {
		return (EReference)actionEnforcedTimeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionEnforcedTimeQuery_Party() {
		return (EReference)actionEnforcedTimeQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionEnforcedTimeQuery_Multiplicity() {
		return (EAttribute)actionEnforcedTimeQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermValidTimeQuery() {
		return termValidTimeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermValidTimeQuery_Term() {
		return (EReference)termValidTimeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalTimeQuery() {
		return globalTimeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalTimeQuery_Operator() {
		return (EAttribute)globalTimeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeQuery() {
		return timeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpression_Left() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticExpression_Right() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveExpression() {
		return additiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditiveExpression_Operator() {
		return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeExpression() {
		return multiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicativeExpression_Operator() {
		return (EAttribute)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression() {
		return constantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatConstant() {
		return floatConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatConstant_Value() {
		return (EAttribute)floatConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstant_Value() {
		return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute)integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueconstant() {
		return valueconstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueconstant_Value() {
		return (EAttribute)valueconstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanconstant() {
		return booleanconstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanconstant_Value() {
		return (EAttribute)booleanconstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLib() {
		return typeLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLib_Types() {
		return (EReference)typeLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotRef() {
		return slotRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotRef_Slot() {
		return (EReference)slotRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotRef_Next() {
		return (EReference)slotRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotRef_Transitive() {
		return (EAttribute)slotRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSlot() {
		return dataSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferOperation() {
		return transferOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferOperation_Money() {
		return (EReference)transferOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeposit() {
		return depositEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithdraw() {
		return withdrawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfer() {
		return transferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfer_Account() {
		return (EReference)transferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisExpression() {
		return thisExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldContainer() {
		return fieldContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldContainer_Fields() {
		return (EReference)fieldContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLine() {
		return timeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Base() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Deviation() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Operator() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getenumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getenumType_Selections() {
		return (EReference)enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoneyExpression() {
		return moneyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoneyExpression_RelationOperator() {
		return (EAttribute)moneyExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoneyExpression_Condition() {
		return (EReference)moneyExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightExpression() {
		return rightExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRightExpression_RightType() {
		return (EAttribute)rightExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRightExpression_RightProporty() {
		return (EAttribute)rightExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicTimePredicate() {
		return periodicTimePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicTimePredicate_Period() {
		return (EReference)periodicTimePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicTimePredicate_Basefrom() {
		return (EReference)periodicTimePredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicTimePredicate_Baseto() {
		return (EReference)periodicTimePredicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicTimePredicate_PeriodDate() {
		return (EReference)periodicTimePredicateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimePredicateOperator() {
		return timePredicateOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartyMemberMultiplicity() {
		return partyMemberMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeQueryOperator() {
		return timeQueryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditiveOperator() {
		return additiveOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicativeOperator() {
		return multiplicativeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitiveOperator() {
		return transitiveOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeLineOperator() {
		return timeLineOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractSpecificationFactory getSmartContractSpecificationFactory() {
		return (SmartContractSpecificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__PARTIES);
		createEReference(contractEClass, CONTRACT__TERMS);
		createEReference(contractEClass, CONTRACT__TYPES);
		createEReference(contractEClass, CONTRACT__ENUM_TYPES);
		createEReference(contractEClass, CONTRACT__ASSETS);

		partyEClass = createEClass(PARTY);
		createEReference(partyEClass, PARTY__ACTIONS);

		typeEClass = createEClass(TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__INSTANCE_TYPE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);

		assetEClass = createEClass(ASSET);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__MANY);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__PARAMETERS);
		createEAttribute(actionEClass, ACTION__IS_MANY);
		createEAttribute(actionEClass, ACTION__TIMES);
		createEAttribute(actionEClass, ACTION__USED);

		internalPartyEClass = createEClass(INTERNAL_PARTY);

		singlePartyEClass = createEClass(SINGLE_PARTY);

		groupPartyEClass = createEClass(GROUP_PARTY);

		externalPartyEClass = createEClass(EXTERNAL_PARTY);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__CONDITION);
		createEReference(termEClass, TERM__ACTION);
		createEReference(termEClass, TERM__PARTY);
		createEReference(termEClass, TERM__TRANSFER_OPERATIONS);
		createEAttribute(termEClass, TERM__BREAK);
		createEReference(termEClass, TERM__POST_CONDITION);
		createEAttribute(termEClass, TERM__AUTO);
		createEReference(termEClass, TERM__BREACH_OPERATIONS);

		rightTermEClass = createEClass(RIGHT_TERM);

		dutyTermEClass = createEClass(DUTY_TERM);

		breachTermEClass = createEClass(BREACH_TERM);

		expressionEClass = createEClass(EXPRESSION);

		collectionSourceExpressionEClass = createEClass(COLLECTION_SOURCE_EXPRESSION);

		descriptiveExpressionEClass = createEClass(DESCRIPTIVE_EXPRESSION);
		createEAttribute(descriptiveExpressionEClass, DESCRIPTIVE_EXPRESSION__PLAIN_TEXT);

		quantifierExpressionEClass = createEClass(QUANTIFIER_EXPRESSION);
		createEReference(quantifierExpressionEClass, QUANTIFIER_EXPRESSION__SCOPE);
		createEReference(quantifierExpressionEClass, QUANTIFIER_EXPRESSION__CONDITION);
		createEReference(quantifierExpressionEClass, QUANTIFIER_EXPRESSION__ITERATOR);
		createEAttribute(quantifierExpressionEClass, QUANTIFIER_EXPRESSION__QUNATIFIER);

		iteratorDeclExpressionEClass = createEClass(ITERATOR_DECL_EXPRESSION);
		createEOperation(iteratorDeclExpressionEClass, ITERATOR_DECL_EXPRESSION___GET_TYPE);

		collectionExpressionEClass = createEClass(COLLECTION_EXPRESSION);
		createEReference(collectionExpressionEClass, COLLECTION_EXPRESSION__SOURCE);

		selectExpressionEClass = createEClass(SELECT_EXPRESSION);
		createEReference(selectExpressionEClass, SELECT_EXPRESSION__CONDITION);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__CONDITION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__THEN_BRANCH);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__ELSE_BRANCH);

		implyExpressionEClass = createEClass(IMPLY_EXPRESSION);
		createEReference(implyExpressionEClass, IMPLY_EXPRESSION__CONDITION);
		createEReference(implyExpressionEClass, IMPLY_EXPRESSION__IMPLIED);

		andExpressionEClass = createEClass(AND_EXPRESSION);
		createEReference(andExpressionEClass, AND_EXPRESSION__LEFT);
		createEReference(andExpressionEClass, AND_EXPRESSION__RIGHT);

		orExpressionEClass = createEClass(OR_EXPRESSION);
		createEReference(orExpressionEClass, OR_EXPRESSION__LEFT);
		createEReference(orExpressionEClass, OR_EXPRESSION__RIGHT);

		notExpressionEClass = createEClass(NOT_EXPRESSION);
		createEReference(notExpressionEClass, NOT_EXPRESSION__INNER);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OPERATOR);

		timePredicateEClass = createEClass(TIME_PREDICATE);
		createEReference(timePredicateEClass, TIME_PREDICATE__BASE);
		createEAttribute(timePredicateEClass, TIME_PREDICATE__OPERATOR);

		boundedTimePredicateEClass = createEClass(BOUNDED_TIME_PREDICATE);
		createEReference(boundedTimePredicateEClass, BOUNDED_TIME_PREDICATE__BOUND);
		createEAttribute(boundedTimePredicateEClass, BOUNDED_TIME_PREDICATE__CLOSED);

		periodicTimePredicateEClass = createEClass(PERIODIC_TIME_PREDICATE);
		createEReference(periodicTimePredicateEClass, PERIODIC_TIME_PREDICATE__PERIOD);
		createEReference(periodicTimePredicateEClass, PERIODIC_TIME_PREDICATE__BASEFROM);
		createEReference(periodicTimePredicateEClass, PERIODIC_TIME_PREDICATE__BASETO);
		createEReference(periodicTimePredicateEClass, PERIODIC_TIME_PREDICATE__PERIOD_DATE);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);

		timeConstantEClass = createEClass(TIME_CONSTANT);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__YEAR);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__MONTH);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__DAY);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__HOUR);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__MIN);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__SEC);
		createEAttribute(timeConstantEClass, TIME_CONSTANT__DATE);

		timeVarExpressionEClass = createEClass(TIME_VAR_EXPRESSION);

		actionEnforcedTimeQueryEClass = createEClass(ACTION_ENFORCED_TIME_QUERY);
		createEReference(actionEnforcedTimeQueryEClass, ACTION_ENFORCED_TIME_QUERY__ACTION);
		createEReference(actionEnforcedTimeQueryEClass, ACTION_ENFORCED_TIME_QUERY__PARTY);
		createEAttribute(actionEnforcedTimeQueryEClass, ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY);

		termValidTimeQueryEClass = createEClass(TERM_VALID_TIME_QUERY);
		createEReference(termValidTimeQueryEClass, TERM_VALID_TIME_QUERY__TERM);

		globalTimeQueryEClass = createEClass(GLOBAL_TIME_QUERY);
		createEAttribute(globalTimeQueryEClass, GLOBAL_TIME_QUERY__OPERATOR);

		timeQueryEClass = createEClass(TIME_QUERY);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__LEFT);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__RIGHT);

		additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
		createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OPERATOR);

		multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
		createEAttribute(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__OPERATOR);

		constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);

		floatConstantEClass = createEClass(FLOAT_CONSTANT);
		createEAttribute(floatConstantEClass, FLOAT_CONSTANT__VALUE);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

		valueconstantEClass = createEClass(VALUECONSTANT);
		createEAttribute(valueconstantEClass, VALUECONSTANT__VALUE);

		booleanconstantEClass = createEClass(BOOLEANCONSTANT);
		createEAttribute(booleanconstantEClass, BOOLEANCONSTANT__VALUE);

		typeLibEClass = createEClass(TYPE_LIB);
		createEReference(typeLibEClass, TYPE_LIB__TYPES);

		slotRefEClass = createEClass(SLOT_REF);
		createEReference(slotRefEClass, SLOT_REF__SLOT);
		createEReference(slotRefEClass, SLOT_REF__NEXT);
		createEAttribute(slotRefEClass, SLOT_REF__TRANSITIVE);

		dataSlotEClass = createEClass(DATA_SLOT);

		transferOperationEClass = createEClass(TRANSFER_OPERATION);
		createEReference(transferOperationEClass, TRANSFER_OPERATION__MONEY);

		depositEClass = createEClass(DEPOSIT);

		withdrawEClass = createEClass(WITHDRAW);

		transferEClass = createEClass(TRANSFER);
		createEReference(transferEClass, TRANSFER__ACCOUNT);

		thisExpressionEClass = createEClass(THIS_EXPRESSION);

		fieldContainerEClass = createEClass(FIELD_CONTAINER);
		createEReference(fieldContainerEClass, FIELD_CONTAINER__FIELDS);

		timeLineEClass = createEClass(TIME_LINE);
		createEReference(timeLineEClass, TIME_LINE__BASE);
		createEReference(timeLineEClass, TIME_LINE__DEVIATION);
		createEAttribute(timeLineEClass, TIME_LINE__OPERATOR);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEReference(enumTypeEClass, ENUM_TYPE__SELECTIONS);

		selectionEClass = createEClass(SELECTION);

		moneyExpressionEClass = createEClass(MONEY_EXPRESSION);
		createEAttribute(moneyExpressionEClass, MONEY_EXPRESSION__RELATION_OPERATOR);
		createEReference(moneyExpressionEClass, MONEY_EXPRESSION__CONDITION);

		rightExpressionEClass = createEClass(RIGHT_EXPRESSION);
		createEAttribute(rightExpressionEClass, RIGHT_EXPRESSION__RIGHT_TYPE);
		createEAttribute(rightExpressionEClass, RIGHT_EXPRESSION__RIGHT_PROPORTY);

		// Create enums
		quantifierEEnum = createEEnum(QUANTIFIER);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		timePredicateOperatorEEnum = createEEnum(TIME_PREDICATE_OPERATOR);
		partyMemberMultiplicityEEnum = createEEnum(PARTY_MEMBER_MULTIPLICITY);
		timeQueryOperatorEEnum = createEEnum(TIME_QUERY_OPERATOR);
		additiveOperatorEEnum = createEEnum(ADDITIVE_OPERATOR);
		multiplicativeOperatorEEnum = createEEnum(MULTIPLICATIVE_OPERATOR);
		transitiveOperatorEEnum = createEEnum(TRANSITIVE_OPERATOR);
		timeLineOperatorEEnum = createEEnum(TIME_LINE_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contractEClass.getESuperTypes().add(this.getNamedElement());
		contractEClass.getESuperTypes().add(this.getFieldContainer());
		partyEClass.getESuperTypes().add(this.getNamedElement());
		partyEClass.getESuperTypes().add(this.getType());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		complexTypeEClass.getESuperTypes().add(this.getType());
		complexTypeEClass.getESuperTypes().add(this.getFieldContainer());
		assetEClass.getESuperTypes().add(this.getType());
		assetEClass.getESuperTypes().add(this.getFieldContainer());
		fieldEClass.getESuperTypes().add(this.getNamedElement());
		fieldEClass.getESuperTypes().add(this.getTypedElement());
		fieldEClass.getESuperTypes().add(this.getDataSlot());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getTypedElement());
		internalPartyEClass.getESuperTypes().add(this.getParty());
		internalPartyEClass.getESuperTypes().add(this.getDataSlot());
		internalPartyEClass.getESuperTypes().add(this.getFieldContainer());
		singlePartyEClass.getESuperTypes().add(this.getInternalParty());
		groupPartyEClass.getESuperTypes().add(this.getInternalParty());
		externalPartyEClass.getESuperTypes().add(this.getParty());
		termEClass.getESuperTypes().add(this.getNamedElement());
		rightTermEClass.getESuperTypes().add(this.getTerm());
		dutyTermEClass.getESuperTypes().add(this.getTerm());
		breachTermEClass.getESuperTypes().add(this.getTerm());
		collectionSourceExpressionEClass.getESuperTypes().add(this.getExpression());
		descriptiveExpressionEClass.getESuperTypes().add(this.getExpression());
		quantifierExpressionEClass.getESuperTypes().add(this.getExpression());
		iteratorDeclExpressionEClass.getESuperTypes().add(this.getDataSlot());
		iteratorDeclExpressionEClass.getESuperTypes().add(this.getNamedElement());
		collectionExpressionEClass.getESuperTypes().add(this.getExpression());
		collectionExpressionEClass.getESuperTypes().add(this.getCollectionSourceExpression());
		selectExpressionEClass.getESuperTypes().add(this.getCollectionExpression());
		logicalExpressionEClass.getESuperTypes().add(this.getExpression());
		conditionalExpressionEClass.getESuperTypes().add(this.getExpression());
		implyExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		andExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		orExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		notExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getExpression());
		timePredicateEClass.getESuperTypes().add(this.getExpression());
		boundedTimePredicateEClass.getESuperTypes().add(this.getTimePredicate());
		periodicTimePredicateEClass.getESuperTypes().add(this.getTimePredicate());
		timeExpressionEClass.getESuperTypes().add(this.getExpression());
		timeConstantEClass.getESuperTypes().add(this.getTimeExpression());
		timeVarExpressionEClass.getESuperTypes().add(this.getTimeExpression());
		timeVarExpressionEClass.getESuperTypes().add(this.getSlotRef());
		actionEnforcedTimeQueryEClass.getESuperTypes().add(this.getTimeQuery());
		termValidTimeQueryEClass.getESuperTypes().add(this.getTimeQuery());
		globalTimeQueryEClass.getESuperTypes().add(this.getTimeQuery());
		globalTimeQueryEClass.getESuperTypes().add(this.getExpression());
		timeQueryEClass.getESuperTypes().add(this.getTimeExpression());
		arithmeticExpressionEClass.getESuperTypes().add(this.getExpression());
		additiveExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		multiplicativeExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		constantExpressionEClass.getESuperTypes().add(this.getExpression());
		floatConstantEClass.getESuperTypes().add(this.getConstantExpression());
		stringConstantEClass.getESuperTypes().add(this.getConstantExpression());
		integerConstantEClass.getESuperTypes().add(this.getConstantExpression());
		valueconstantEClass.getESuperTypes().add(this.getConstantExpression());
		booleanconstantEClass.getESuperTypes().add(this.getConstantExpression());
		slotRefEClass.getESuperTypes().add(this.getExpression());
		slotRefEClass.getESuperTypes().add(this.getCollectionSourceExpression());
		dataSlotEClass.getESuperTypes().add(this.getNamedElement());
		depositEClass.getESuperTypes().add(this.getTransferOperation());
		withdrawEClass.getESuperTypes().add(this.getTransferOperation());
		transferEClass.getESuperTypes().add(this.getTransferOperation());
		thisExpressionEClass.getESuperTypes().add(this.getTimeExpression());
		thisExpressionEClass.getESuperTypes().add(this.getSlotRef());
		timeLineEClass.getESuperTypes().add(this.getTimeExpression());
		enumTypeEClass.getESuperTypes().add(this.getType());
		selectionEClass.getESuperTypes().add(this.getNamedElement());
		moneyExpressionEClass.getESuperTypes().add(this.getDataSlot());
		rightExpressionEClass.getESuperTypes().add(this.getDataSlot());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_Parties(), this.getParty(), null, "parties", null, 1, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Terms(), this.getTerm(), null, "terms", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Types(), this.getType(), null, "types", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_EnumTypes(), this.getType(), null, "enumTypes", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Assets(), this.getAsset(), null, "assets", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParty_Actions(), this.getAction(), null, "actions", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_InstanceType(), ecorePackage.getEString(), "instanceType", null, 1, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Many(), ecorePackage.getEBoolean(), "many", "false", 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Parameters(), this.getField(), null, "parameters", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_IsMany(), ecorePackage.getEBoolean(), "IsMany", "false", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Times(), ecorePackage.getEInt(), "Times", "0", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Used(), ecorePackage.getEBoolean(), "used", "false", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalPartyEClass, InternalParty.class, "InternalParty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singlePartyEClass, SingleParty.class, "SingleParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupPartyEClass, GroupParty.class, "GroupParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalPartyEClass, ExternalParty.class, "ExternalParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Condition(), this.getExpression(), null, "condition", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Action(), this.getAction(), null, "action", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Party(), this.getParty(), null, "party", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_TransferOperations(), this.getTransferOperation(), null, "transferOperations", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerm_Break(), ecorePackage.getEBoolean(), "break", "false", 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_PostCondition(), this.getExpression(), null, "postCondition", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerm_Auto(), ecorePackage.getEBoolean(), "auto", "false", 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_BreachOperations(), this.getTransferOperation(), null, "breachOperations", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightTermEClass, RightTerm.class, "RightTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dutyTermEClass, DutyTerm.class, "DutyTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breachTermEClass, BreachTerm.class, "BreachTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionSourceExpressionEClass, CollectionSourceExpression.class, "CollectionSourceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveExpressionEClass, DescriptiveExpression.class, "DescriptiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptiveExpression_PlainText(), ecorePackage.getEString(), "plainText", null, 0, 1, DescriptiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifierExpressionEClass, QuantifierExpression.class, "QuantifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifierExpression_Scope(), this.getCollectionSourceExpression(), null, "scope", null, 1, 1, QuantifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, QuantifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierExpression_Iterator(), this.getIteratorDeclExpression(), null, "iterator", null, 1, 1, QuantifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifierExpression_Qunatifier(), this.getQuantifier(), "qunatifier", null, 1, 1, QuantifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorDeclExpressionEClass, IteratorDeclExpression.class, "IteratorDeclExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIteratorDeclExpression__GetType(), this.getFieldContainer(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collectionExpressionEClass, CollectionExpression.class, "CollectionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionExpression_Source(), this.getCollectionSourceExpression(), null, "source", null, 1, 1, CollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectExpressionEClass, SelectExpression.class, "SelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_ThenBranch(), this.getExpression(), null, "thenBranch", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_ElseBranch(), this.getExpression(), null, "elseBranch", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implyExpressionEClass, ImplyExpression.class, "ImplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplyExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, ImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplyExpression_Implied(), this.getExpression(), null, "implied", null, 1, 1, ImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExpression_Left(), this.getExpression(), null, "left", null, 1, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndExpression_Right(), this.getExpression(), null, "right", null, 1, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrExpression_Left(), this.getExpression(), null, "left", null, 1, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrExpression_Right(), this.getExpression(), null, "right", null, 1, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExpression_Inner(), this.getExpression(), null, "inner", null, 1, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_Left(), this.getExpression(), null, "left", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Right(), this.getExpression(), null, "right", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalExpression_Operator(), this.getRelationalOperator(), "operator", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePredicateEClass, TimePredicate.class, "TimePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimePredicate_Base(), this.getExpression(), null, "base", null, 1, 1, TimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePredicate_Operator(), this.getTimePredicateOperator(), "operator", null, 1, 1, TimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedTimePredicateEClass, BoundedTimePredicate.class, "BoundedTimePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedTimePredicate_Bound(), this.getExpression(), null, "bound", null, 1, 1, BoundedTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedTimePredicate_Closed(), ecorePackage.getEBoolean(), "closed", "false", 1, 1, BoundedTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicTimePredicateEClass, PeriodicTimePredicate.class, "PeriodicTimePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicTimePredicate_Period(), this.getExpression(), null, "period", null, 0, 1, PeriodicTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicTimePredicate_Basefrom(), this.getExpression(), null, "basefrom", null, 0, 1, PeriodicTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicTimePredicate_Baseto(), this.getExpression(), null, "baseto", null, 0, 1, PeriodicTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicTimePredicate_PeriodDate(), ecorePackage.getEObject(), null, "periodDate", null, 0, 1, PeriodicTimePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeConstantEClass, TimeConstant.class, "TimeConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConstant_Year(), ecorePackage.getEInt(), "year", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Month(), ecorePackage.getEInt(), "month", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Day(), ecorePackage.getEInt(), "day", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Hour(), ecorePackage.getEInt(), "hour", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Min(), ecorePackage.getEInt(), "min", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Sec(), ecorePackage.getEInt(), "sec", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConstant_Date(), ecorePackage.getEInt(), "date", "0", 0, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeVarExpressionEClass, TimeVarExpression.class, "TimeVarExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEnforcedTimeQueryEClass, ActionEnforcedTimeQuery.class, "ActionEnforcedTimeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionEnforcedTimeQuery_Action(), this.getAction(), null, "action", null, 1, 1, ActionEnforcedTimeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionEnforcedTimeQuery_Party(), this.getParty(), null, "party", null, 1, 1, ActionEnforcedTimeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionEnforcedTimeQuery_Multiplicity(), this.getPartyMemberMultiplicity(), "multiplicity", "this", 1, 1, ActionEnforcedTimeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termValidTimeQueryEClass, TermValidTimeQuery.class, "TermValidTimeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermValidTimeQuery_Term(), this.getTerm(), null, "term", null, 1, 1, TermValidTimeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalTimeQueryEClass, GlobalTimeQuery.class, "GlobalTimeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalTimeQuery_Operator(), this.getTimeQueryOperator(), "operator", null, 1, 1, GlobalTimeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeQueryEClass, TimeQuery.class, "TimeQuery", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticExpression_Left(), this.getExpression(), null, "left", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpression_Right(), this.getExpression(), null, "right", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditiveExpression_Operator(), this.getAdditiveOperator(), "operator", null, 1, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicativeExpression_Operator(), this.getMultiplicativeOperator(), "operator", null, 1, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatConstantEClass, FloatConstant.class, "FloatConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatConstant_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, FloatConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueconstantEClass, Valueconstant.class, "Valueconstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueconstant_Value(), ecorePackage.getEString(), "value", "\"value\"", 1, 1, Valueconstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanconstantEClass, Booleanconstant.class, "Booleanconstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanconstant_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, Booleanconstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLibEClass, TypeLib.class, "TypeLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLib_Types(), this.getType(), null, "types", null, 0, -1, TypeLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotRefEClass, SlotRef.class, "SlotRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotRef_Slot(), this.getDataSlot(), null, "slot", null, 0, 1, SlotRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlotRef_Next(), this.getSlotRef(), null, "next", null, 0, 1, SlotRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotRef_Transitive(), this.getTransitiveOperator(), "transitive", "none", 1, 1, SlotRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSlotEClass, DataSlot.class, "DataSlot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferOperationEClass, TransferOperation.class, "TransferOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferOperation_Money(), this.getMoneyExpression(), null, "money", null, 1, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(depositEClass, Deposit.class, "Deposit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withdrawEClass, Withdraw.class, "Withdraw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferEClass, Transfer.class, "Transfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransfer_Account(), this.getExpression(), null, "account", null, 1, 1, Transfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisExpressionEClass, ThisExpression.class, "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldContainerEClass, FieldContainer.class, "FieldContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldContainer_Fields(), this.getField(), null, "fields", null, 0, -1, FieldContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeLineEClass, TimeLine.class, "TimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLine_Base(), this.getTimeExpression(), null, "base", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_Deviation(), this.getTimeExpression(), null, "deviation", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Operator(), this.getTimeLineOperator(), "operator", null, 1, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypeEClass, enumType.class, "enumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getenumType_Selections(), this.getSelection(), null, "selections", null, 1, -1, enumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moneyExpressionEClass, MoneyExpression.class, "MoneyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoneyExpression_RelationOperator(), this.getRelationalOperator(), "relationOperator", "equal", 0, 1, MoneyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoneyExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, MoneyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightExpressionEClass, RightExpression.class, "RightExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRightExpression_RightType(), ecorePackage.getEString(), "RightType", "", 0, 1, RightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRightExpression_RightProporty(), ecorePackage.getEString(), "RightProporty", null, 0, 1, RightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.FOR_ALL);
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_OR_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NOT_EQUAL);

		initEEnum(timePredicateOperatorEEnum, TimePredicateOperator.class, "TimePredicateOperator");
		addEEnumLiteral(timePredicateOperatorEEnum, TimePredicateOperator.AFTER);
		addEEnumLiteral(timePredicateOperatorEEnum, TimePredicateOperator.BEFORE);

		initEEnum(partyMemberMultiplicityEEnum, PartyMemberMultiplicity.class, "PartyMemberMultiplicity");
		addEEnumLiteral(partyMemberMultiplicityEEnum, PartyMemberMultiplicity.ALL);
		addEEnumLiteral(partyMemberMultiplicityEEnum, PartyMemberMultiplicity.ANY);
		addEEnumLiteral(partyMemberMultiplicityEEnum, PartyMemberMultiplicity.THIS);

		initEEnum(timeQueryOperatorEEnum, TimeQueryOperator.class, "TimeQueryOperator");
		addEEnumLiteral(timeQueryOperatorEEnum, TimeQueryOperator.NOW);
		addEEnumLiteral(timeQueryOperatorEEnum, TimeQueryOperator.CONTRACT_START);
		addEEnumLiteral(timeQueryOperatorEEnum, TimeQueryOperator.CONTRACT_END);

		initEEnum(additiveOperatorEEnum, AdditiveOperator.class, "AdditiveOperator");
		addEEnumLiteral(additiveOperatorEEnum, AdditiveOperator.ADD);
		addEEnumLiteral(additiveOperatorEEnum, AdditiveOperator.SUB);

		initEEnum(multiplicativeOperatorEEnum, MultiplicativeOperator.class, "MultiplicativeOperator");
		addEEnumLiteral(multiplicativeOperatorEEnum, MultiplicativeOperator.MUL);
		addEEnumLiteral(multiplicativeOperatorEEnum, MultiplicativeOperator.DIV);

		initEEnum(transitiveOperatorEEnum, TransitiveOperator.class, "TransitiveOperator");
		addEEnumLiteral(transitiveOperatorEEnum, TransitiveOperator.NONE);
		addEEnumLiteral(transitiveOperatorEEnum, TransitiveOperator.TRANSITIVE_ENCLOSURE);
		addEEnumLiteral(transitiveOperatorEEnum, TransitiveOperator.SELF_TRANSITIVE_ENCLOSURE);

		initEEnum(timeLineOperatorEEnum, TimeLineOperator.class, "TimeLineOperator");
		addEEnumLiteral(timeLineOperatorEEnum, TimeLineOperator.FORWARD);
		addEEnumLiteral(timeLineOperatorEEnum, TimeLineOperator.BACKWARD);

		// Create resource
		createResource(eNS_URI);
	}

} //SmartContractSpecificationPackageImpl
