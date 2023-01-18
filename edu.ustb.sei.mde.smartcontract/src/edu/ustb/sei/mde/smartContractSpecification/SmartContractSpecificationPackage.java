/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SmartContractSpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartContractSpecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ustb.edu.cn/sei/mde/SmartContractSpecification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartContractSpecificationPackage eINSTANCE = edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.NamedElementImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__FIELDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PARTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TERMS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enum Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ENUM_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ASSETS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PartyImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypeImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PrimitiveTypeImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INSTANCE_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ComplexTypeImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AssetImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FIELDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FieldImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MANY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypedElementImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ActionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_MANY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TIMES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__USED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.InternalPartyImpl <em>Internal Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.InternalPartyImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getInternalParty()
	 * @generated
	 */
	int INTERNAL_PARTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTY__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTY__ACTIONS = PARTY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTY__FIELDS = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTY_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTY_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SinglePartyImpl <em>Single Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SinglePartyImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSingleParty()
	 * @generated
	 */
	int SINGLE_PARTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PARTY__NAME = INTERNAL_PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PARTY__ACTIONS = INTERNAL_PARTY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PARTY__FIELDS = INTERNAL_PARTY__FIELDS;

	/**
	 * The number of structural features of the '<em>Single Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PARTY_FEATURE_COUNT = INTERNAL_PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PARTY_OPERATION_COUNT = INTERNAL_PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.GroupPartyImpl <em>Group Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.GroupPartyImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getGroupParty()
	 * @generated
	 */
	int GROUP_PARTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PARTY__NAME = INTERNAL_PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PARTY__ACTIONS = INTERNAL_PARTY__ACTIONS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PARTY__FIELDS = INTERNAL_PARTY__FIELDS;

	/**
	 * The number of structural features of the '<em>Group Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PARTY_FEATURE_COUNT = INTERNAL_PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PARTY_OPERATION_COUNT = INTERNAL_PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ExternalPartyImpl <em>External Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ExternalPartyImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getExternalParty()
	 * @generated
	 */
	int EXTERNAL_PARTY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTY__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTY__ACTIONS = PARTY__ACTIONS;

	/**
	 * The number of structural features of the '<em>External Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTY_FEATURE_COUNT = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTY_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PARTY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transfer Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TRANSFER_OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__BREAK = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__POST_CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__AUTO = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Breach Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__BREACH_OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightTermImpl <em>Right Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RightTermImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRightTerm()
	 * @generated
	 */
	int RIGHT_TERM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__NAME = TERM__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__CONDITION = TERM__CONDITION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__ACTION = TERM__ACTION;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__PARTY = TERM__PARTY;

	/**
	 * The feature id for the '<em><b>Transfer Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__TRANSFER_OPERATIONS = TERM__TRANSFER_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__BREAK = TERM__BREAK;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__POST_CONDITION = TERM__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__AUTO = TERM__AUTO;

	/**
	 * The feature id for the '<em><b>Breach Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM__BREACH_OPERATIONS = TERM__BREACH_OPERATIONS;

	/**
	 * The number of structural features of the '<em>Right Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DutyTermImpl <em>Duty Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DutyTermImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDutyTerm()
	 * @generated
	 */
	int DUTY_TERM = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__NAME = TERM__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__CONDITION = TERM__CONDITION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__ACTION = TERM__ACTION;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__PARTY = TERM__PARTY;

	/**
	 * The feature id for the '<em><b>Transfer Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__TRANSFER_OPERATIONS = TERM__TRANSFER_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__BREAK = TERM__BREAK;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__POST_CONDITION = TERM__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__AUTO = TERM__AUTO;

	/**
	 * The feature id for the '<em><b>Breach Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM__BREACH_OPERATIONS = TERM__BREACH_OPERATIONS;

	/**
	 * The number of structural features of the '<em>Duty Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duty Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BreachTermImpl <em>Breach Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BreachTermImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBreachTerm()
	 * @generated
	 */
	int BREACH_TERM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__NAME = TERM__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__CONDITION = TERM__CONDITION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__ACTION = TERM__ACTION;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__PARTY = TERM__PARTY;

	/**
	 * The feature id for the '<em><b>Transfer Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__TRANSFER_OPERATIONS = TERM__TRANSFER_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__BREAK = TERM__BREAK;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__POST_CONDITION = TERM__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__AUTO = TERM__AUTO;

	/**
	 * The feature id for the '<em><b>Breach Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM__BREACH_OPERATIONS = TERM__BREACH_OPERATIONS;

	/**
	 * The number of structural features of the '<em>Breach Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Breach Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREACH_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 18;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.CollectionSourceExpressionImpl <em>Collection Source Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.CollectionSourceExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getCollectionSourceExpression()
	 * @generated
	 */
	int COLLECTION_SOURCE_EXPRESSION = 19;

	/**
	 * The number of structural features of the '<em>Collection Source Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SOURCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Source Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SOURCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DescriptiveExpressionImpl <em>Descriptive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DescriptiveExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDescriptiveExpression()
	 * @generated
	 */
	int DESCRIPTIVE_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Plain Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXPRESSION__PLAIN_TEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Descriptive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl <em>Quantifier Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getQuantifierExpression()
	 * @generated
	 */
	int QUANTIFIER_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__SCOPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__ITERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qunatifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__QUNATIFIER = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantifier Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Quantifier Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DataSlotImpl <em>Data Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DataSlotImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDataSlot()
	 * @generated
	 */
	int DATA_SLOT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.IteratorDeclExpressionImpl <em>Iterator Decl Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.IteratorDeclExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getIteratorDeclExpression()
	 * @generated
	 */
	int ITERATOR_DECL_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DECL_EXPRESSION__NAME = DATA_SLOT__NAME;

	/**
	 * The number of structural features of the '<em>Iterator Decl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DECL_EXPRESSION_FEATURE_COUNT = DATA_SLOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DECL_EXPRESSION___GET_TYPE = DATA_SLOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iterator Decl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_DECL_EXPRESSION_OPERATION_COUNT = DATA_SLOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.CollectionExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SelectExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSelectExpression()
	 * @generated
	 */
	int SELECT_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION__SOURCE = COLLECTION_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION__CONDITION = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_OPERATION_COUNT = COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.LogicalExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 25;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__THEN_BRANCH = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ELSE_BRANCH = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl <em>Imply Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getImplyExpression()
	 * @generated
	 */
	int IMPLY_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION__CONDITION = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION__IMPLIED = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION_OPERATION_COUNT = LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AndExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.OrExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LEFT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RIGHT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.NotExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__INNER = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RelationalExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl <em>Time Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimePredicate()
	 * @generated
	 */
	int TIME_PREDICATE = 32;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PREDICATE__BASE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PREDICATE__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PREDICATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PREDICATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BoundedTimePredicateImpl <em>Bounded Time Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BoundedTimePredicateImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBoundedTimePredicate()
	 * @generated
	 */
	int BOUNDED_TIME_PREDICATE = 33;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE__BASE = TIME_PREDICATE__BASE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE__OPERATOR = TIME_PREDICATE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE__BOUND = TIME_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE__CLOSED = TIME_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE_FEATURE_COUNT = TIME_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_TIME_PREDICATE_OPERATION_COUNT = TIME_PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeExpression()
	 * @generated
	 */
	int TIME_EXPRESSION = 35;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl <em>Time Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeConstant()
	 * @generated
	 */
	int TIME_CONSTANT = 36;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeVarExpressionImpl <em>Time Var Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeVarExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeVarExpression()
	 * @generated
	 */
	int TIME_VAR_EXPRESSION = 37;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeQueryImpl <em>Time Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeQueryImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeQuery()
	 * @generated
	 */
	int TIME_QUERY = 41;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl <em>Action Enforced Time Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getActionEnforcedTimeQuery()
	 * @generated
	 */
	int ACTION_ENFORCED_TIME_QUERY = 38;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermValidTimeQueryImpl <em>Term Valid Time Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TermValidTimeQueryImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTermValidTimeQuery()
	 * @generated
	 */
	int TERM_VALID_TIME_QUERY = 39;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.GlobalTimeQueryImpl <em>Global Time Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.GlobalTimeQueryImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getGlobalTimeQuery()
	 * @generated
	 */
	int GLOBAL_TIME_QUERY = 40;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ArithmeticExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 42;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AdditiveExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAdditiveExpression()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION = 43;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.MultiplicativeExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMultiplicativeExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION = 44;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ConstantExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getConstantExpression()
	 * @generated
	 */
	int CONSTANT_EXPRESSION = 45;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FloatConstantImpl <em>Float Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FloatConstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getFloatConstant()
	 * @generated
	 */
	int FLOAT_CONSTANT = 46;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.StringConstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 47;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.IntegerConstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 48;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BooleanconstantImpl <em>Booleanconstant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BooleanconstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBooleanconstant()
	 * @generated
	 */
	int BOOLEANCONSTANT = 50;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypeLibImpl <em>Type Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypeLibImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTypeLib()
	 * @generated
	 */
	int TYPE_LIB = 51;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SlotRefImpl <em>Slot Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SlotRefImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSlotRef()
	 * @generated
	 */
	int SLOT_REF = 52;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TransferOperationImpl <em>Transfer Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TransferOperationImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransferOperation()
	 * @generated
	 */
	int TRANSFER_OPERATION = 54;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DepositImpl <em>Deposit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DepositImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDeposit()
	 * @generated
	 */
	int DEPOSIT = 55;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.WithdrawImpl <em>Withdraw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.WithdrawImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getWithdraw()
	 * @generated
	 */
	int WITHDRAW = 56;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TransferImpl <em>Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TransferImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransfer()
	 * @generated
	 */
	int TRANSFER = 57;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl <em>This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getThisExpression()
	 * @generated
	 */
	int THIS_EXPRESSION = 58;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FieldContainerImpl <em>Field Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FieldContainerImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getFieldContainer()
	 * @generated
	 */
	int FIELD_CONTAINER = 59;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl <em>Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeLine()
	 * @generated
	 */
	int TIME_LINE = 60;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.enumTypeImpl <em>enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.enumTypeImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getenumType()
	 * @generated
	 */
	int ENUM_TYPE = 61;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SelectionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 62;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.MoneyExpressionImpl <em>Money Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.MoneyExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMoneyExpression()
	 * @generated
	 */
	int MONEY_EXPRESSION = 63;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl <em>Periodic Time Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPeriodicTimePredicate()
	 * @generated
	 */
	int PERIODIC_TIME_PREDICATE = 34;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__BASE = TIME_PREDICATE__BASE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__OPERATOR = TIME_PREDICATE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__PERIOD = TIME_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__BASEFROM = TIME_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Baseto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__BASETO = TIME_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE__PERIOD_DATE = TIME_PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE_FEATURE_COUNT = TIME_PREDICATE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodic Time Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_PREDICATE_OPERATION_COUNT = TIME_PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__YEAR = TIME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__MONTH = TIME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__DAY = TIME_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__HOUR = TIME_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__MIN = TIME_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__SEC = TIME_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__DATE = TIME_EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Time Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT_FEATURE_COUNT = TIME_EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Time Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT_OPERATION_COUNT = TIME_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VAR_EXPRESSION__SLOT = TIME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VAR_EXPRESSION__NEXT = TIME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VAR_EXPRESSION__TRANSITIVE = TIME_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Var Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VAR_EXPRESSION_FEATURE_COUNT = TIME_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Var Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VAR_EXPRESSION_OPERATION_COUNT = TIME_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUERY_FEATURE_COUNT = TIME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUERY_OPERATION_COUNT = TIME_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENFORCED_TIME_QUERY__ACTION = TIME_QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENFORCED_TIME_QUERY__PARTY = TIME_QUERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY = TIME_QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Enforced Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENFORCED_TIME_QUERY_FEATURE_COUNT = TIME_QUERY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Enforced Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENFORCED_TIME_QUERY_OPERATION_COUNT = TIME_QUERY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VALID_TIME_QUERY__TERM = TIME_QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Valid Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VALID_TIME_QUERY_FEATURE_COUNT = TIME_QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Term Valid Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VALID_TIME_QUERY_OPERATION_COUNT = TIME_QUERY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TIME_QUERY__OPERATOR = TIME_QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TIME_QUERY_FEATURE_COUNT = TIME_QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Time Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TIME_QUERY_OPERATION_COUNT = TIME_QUERY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__LEFT = ARITHMETIC_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__RIGHT = ARITHMETIC_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__OPERATOR = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__LEFT = ARITHMETIC_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__RIGHT = ARITHMETIC_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__OPERATOR = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONSTANT_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ValueconstantImpl <em>Valueconstant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ValueconstantImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getValueconstant()
	 * @generated
	 */
	int VALUECONSTANT = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUECONSTANT__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valueconstant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUECONSTANT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valueconstant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUECONSTANT_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANCONSTANT__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booleanconstant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANCONSTANT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Booleanconstant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANCONSTANT_OPERATION_COUNT = CONSTANT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIB__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Type Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIB_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REF__SLOT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REF__NEXT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REF__TRANSITIVE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slot Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slot Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__MONEY = 0;

	/**
	 * The number of structural features of the '<em>Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT__MONEY = TRANSFER_OPERATION__MONEY;

	/**
	 * The number of structural features of the '<em>Deposit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT_FEATURE_COUNT = TRANSFER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deposit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT_OPERATION_COUNT = TRANSFER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW__MONEY = TRANSFER_OPERATION__MONEY;

	/**
	 * The number of structural features of the '<em>Withdraw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_FEATURE_COUNT = TRANSFER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Withdraw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_OPERATION_COUNT = TRANSFER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER__MONEY = TRANSFER_OPERATION__MONEY;

	/**
	 * The feature id for the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER__ACCOUNT = TRANSFER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_FEATURE_COUNT = TRANSFER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_COUNT = TRANSFER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__SLOT = TIME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__NEXT = TIME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__TRANSITIVE = TIME_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_FEATURE_COUNT = TIME_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_OPERATION_COUNT = TIME_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CONTAINER__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Field Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__BASE = TIME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__DEVIATION = TIME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__OPERATOR = TIME_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_FEATURE_COUNT = TIME_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_OPERATION_COUNT = TIME_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__SELECTIONS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_EXPRESSION__NAME = DATA_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Relation Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_EXPRESSION__RELATION_OPERATOR = DATA_SLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_EXPRESSION__CONDITION = DATA_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Money Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_EXPRESSION_FEATURE_COUNT = DATA_SLOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Money Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_EXPRESSION_OPERATION_COUNT = DATA_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl <em>Right Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRightExpression()
	 * @generated
	 */
	int RIGHT_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_EXPRESSION__NAME = DATA_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Right Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_EXPRESSION__RIGHT_TYPE = DATA_SLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Proporty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_EXPRESSION__RIGHT_PROPORTY = DATA_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Right Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_EXPRESSION_FEATURE_COUNT = DATA_SLOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Right Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_EXPRESSION_OPERATION_COUNT = DATA_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.Quantifier
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 65;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 66;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator <em>Time Predicate Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimePredicateOperator()
	 * @generated
	 */
	int TIME_PREDICATE_OPERATOR = 67;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity <em>Party Member Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPartyMemberMultiplicity()
	 * @generated
	 */
	int PARTY_MEMBER_MULTIPLICITY = 68;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator <em>Time Query Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeQueryOperator()
	 * @generated
	 */
	int TIME_QUERY_OPERATOR = 69;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator <em>Additive Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAdditiveOperator()
	 * @generated
	 */
	int ADDITIVE_OPERATOR = 70;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMultiplicativeOperator()
	 * @generated
	 */
	int MULTIPLICATIVE_OPERATOR = 71;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator <em>Transitive Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransitiveOperator()
	 * @generated
	 */
	int TRANSITIVE_OPERATOR = 72;

	/**
	 * The meta object id for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator <em>Time Line Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator
	 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeLineOperator()
	 * @generated
	 */
	int TIME_LINE_OPERATOR = 73;


	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract#getParties()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Parties();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract#getTerms()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract#getTypes()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getEnumTypes <em>Enum Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Types</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract#getEnumTypes()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_EnumTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Contract#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Contract#getAssets()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Assets();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Party#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Party#getActions()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Actions();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.PrimitiveType#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PrimitiveType#getInstanceType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_InstanceType();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Field#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Field#isMany()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Many();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Action#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Action#isIsMany()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IsMany();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Action#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Action#getTimes()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Times();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Action#isUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Action#isUsed()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Used();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.InternalParty <em>Internal Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.InternalParty
	 * @generated
	 */
	EClass getInternalParty();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.SingleParty <em>Single Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SingleParty
	 * @generated
	 */
	EClass getSingleParty();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.GroupParty <em>Group Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.GroupParty
	 * @generated
	 */
	EClass getGroupParty();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ExternalParty <em>External Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ExternalParty
	 * @generated
	 */
	EClass getExternalParty();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getCondition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Condition();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getAction()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Action();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getParty()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Party();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getTransferOperations <em>Transfer Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Operations</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getTransferOperations()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_TransferOperations();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Term#isBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#isBreak()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Break();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getPostCondition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_PostCondition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Term#isAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#isAuto()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Auto();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.Term#getBreachOperations <em>Breach Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Breach Operations</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Term#getBreachOperations()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_BreachOperations();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.RightTerm <em>Right Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Term</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RightTerm
	 * @generated
	 */
	EClass getRightTerm();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.DutyTerm <em>Duty Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duty Term</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.DutyTerm
	 * @generated
	 */
	EClass getDutyTerm();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.BreachTerm <em>Breach Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breach Term</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.BreachTerm
	 * @generated
	 */
	EClass getBreachTerm();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression <em>Collection Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Source Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.CollectionSourceExpression
	 * @generated
	 */
	EClass getCollectionSourceExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression <em>Descriptive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression
	 * @generated
	 */
	EClass getDescriptiveExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression#getPlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plain Text</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.DescriptiveExpression#getPlainText()
	 * @see #getDescriptiveExpression()
	 * @generated
	 */
	EAttribute getDescriptiveExpression_PlainText();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression <em>Quantifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression
	 * @generated
	 */
	EClass getQuantifierExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getScope()
	 * @see #getQuantifierExpression()
	 * @generated
	 */
	EReference getQuantifierExpression_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getCondition()
	 * @see #getQuantifierExpression()
	 * @generated
	 */
	EReference getQuantifierExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getIterator()
	 * @see #getQuantifierExpression()
	 * @generated
	 */
	EReference getQuantifierExpression_Iterator();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getQunatifier <em>Qunatifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qunatifier</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.QuantifierExpression#getQunatifier()
	 * @see #getQuantifierExpression()
	 * @generated
	 */
	EAttribute getQuantifierExpression_Qunatifier();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression <em>Iterator Decl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Decl Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression
	 * @generated
	 */
	EClass getIteratorDeclExpression();

	/**
	 * Returns the meta object for the '{@link edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see edu.ustb.sei.mde.smartContractSpecification.IteratorDeclExpression#getType()
	 * @generated
	 */
	EOperation getIteratorDeclExpression__GetType();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.CollectionExpression#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.CollectionExpression#getSource()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_Source();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.SelectExpression <em>Select Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SelectExpression
	 * @generated
	 */
	EClass getSelectExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.SelectExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SelectExpression#getCondition()
	 * @see #getSelectExpression()
	 * @generated
	 */
	EReference getSelectExpression_Condition();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getCondition()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getThenBranch <em>Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Branch</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getThenBranch()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ThenBranch();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getElseBranch <em>Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Branch</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ConditionalExpression#getElseBranch()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ElseBranch();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ImplyExpression <em>Imply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imply Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ImplyExpression
	 * @generated
	 */
	EClass getImplyExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ImplyExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ImplyExpression#getCondition()
	 * @see #getImplyExpression()
	 * @generated
	 */
	EReference getImplyExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ImplyExpression#getImplied <em>Implied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implied</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ImplyExpression#getImplied()
	 * @see #getImplyExpression()
	 * @generated
	 */
	EReference getImplyExpression_Implied();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.AndExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AndExpression#getLeft()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.AndExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AndExpression#getRight()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Right();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.OrExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.OrExpression#getLeft()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.OrExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.OrExpression#getRight()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Right();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.NotExpression#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.NotExpression#getInner()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Inner();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getLeft()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getRight()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate <em>Time Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Predicate</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicate
	 * @generated
	 */
	EClass getTimePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getBase()
	 * @see #getTimePredicate()
	 * @generated
	 */
	EReference getTimePredicate_Base();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicate#getOperator()
	 * @see #getTimePredicate()
	 * @generated
	 */
	EAttribute getTimePredicate_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate <em>Bounded Time Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Time Predicate</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate
	 * @generated
	 */
	EClass getBoundedTimePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#getBound()
	 * @see #getBoundedTimePredicate()
	 * @generated
	 */
	EReference getBoundedTimePredicate_Bound();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#isClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate#isClosed()
	 * @see #getBoundedTimePredicate()
	 * @generated
	 */
	EAttribute getBoundedTimePredicate_Closed();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeExpression
	 * @generated
	 */
	EClass getTimeExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant <em>Time Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant
	 * @generated
	 */
	EClass getTimeConstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getYear()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Year();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getMonth()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Month();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getDay()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Day();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getHour()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Hour();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getMin()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Min();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getSec <em>Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getSec()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Sec();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeConstant#getDate()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Date();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimeVarExpression <em>Time Var Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Var Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeVarExpression
	 * @generated
	 */
	EClass getTimeVarExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery <em>Action Enforced Time Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Enforced Time Query</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery
	 * @generated
	 */
	EClass getActionEnforcedTimeQuery();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getAction()
	 * @see #getActionEnforcedTimeQuery()
	 * @generated
	 */
	EReference getActionEnforcedTimeQuery_Action();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getParty()
	 * @see #getActionEnforcedTimeQuery()
	 * @generated
	 */
	EReference getActionEnforcedTimeQuery_Party();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ActionEnforcedTimeQuery#getMultiplicity()
	 * @see #getActionEnforcedTimeQuery()
	 * @generated
	 */
	EAttribute getActionEnforcedTimeQuery_Multiplicity();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery <em>Term Valid Time Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Valid Time Query</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery
	 * @generated
	 */
	EClass getTermValidTimeQuery();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery#getTerm()
	 * @see #getTermValidTimeQuery()
	 * @generated
	 */
	EReference getTermValidTimeQuery_Term();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery <em>Global Time Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Time Query</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery
	 * @generated
	 */
	EClass getGlobalTimeQuery();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.GlobalTimeQuery#getOperator()
	 * @see #getGlobalTimeQuery()
	 * @generated
	 */
	EAttribute getGlobalTimeQuery_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimeQuery <em>Time Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Query</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQuery
	 * @generated
	 */
	EClass getTimeQuery();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression#getLeft()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ArithmeticExpression#getRight()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Right();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression
	 * @generated
	 */
	EClass getAdditiveExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression#getOperator()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EAttribute getAdditiveExpression_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression
	 * @generated
	 */
	EClass getMultiplicativeExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression#getOperator()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getMultiplicativeExpression_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.FloatConstant <em>Float Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Constant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.FloatConstant
	 * @generated
	 */
	EClass getFloatConstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.FloatConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.FloatConstant#getValue()
	 * @see #getFloatConstant()
	 * @generated
	 */
	EAttribute getFloatConstant_Value();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Valueconstant <em>Valueconstant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valueconstant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Valueconstant
	 * @generated
	 */
	EClass getValueconstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Valueconstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Valueconstant#getValue()
	 * @see #getValueconstant()
	 * @generated
	 */
	EAttribute getValueconstant_Value();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Booleanconstant <em>Booleanconstant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booleanconstant</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Booleanconstant
	 * @generated
	 */
	EClass getBooleanconstant();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.Booleanconstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Booleanconstant#isValue()
	 * @see #getBooleanconstant()
	 * @generated
	 */
	EAttribute getBooleanconstant_Value();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TypeLib <em>Type Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Lib</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TypeLib
	 * @generated
	 */
	EClass getTypeLib();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.TypeLib#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TypeLib#getTypes()
	 * @see #getTypeLib()
	 * @generated
	 */
	EReference getTypeLib_Types();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef <em>Slot Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Ref</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SlotRef
	 * @generated
	 */
	EClass getSlotRef();

	/**
	 * Returns the meta object for the reference '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SlotRef#getSlot()
	 * @see #getSlotRef()
	 * @generated
	 */
	EReference getSlotRef_Slot();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SlotRef#getNext()
	 * @see #getSlotRef()
	 * @generated
	 */
	EReference getSlotRef_Next();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.SlotRef#getTransitive <em>Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.SlotRef#getTransitive()
	 * @see #getSlotRef()
	 * @generated
	 */
	EAttribute getSlotRef_Transitive();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.DataSlot <em>Data Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Slot</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.DataSlot
	 * @generated
	 */
	EClass getDataSlot();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TransferOperation <em>Transfer Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Operation</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransferOperation
	 * @generated
	 */
	EClass getTransferOperation();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.TransferOperation#getMoney <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Money</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransferOperation#getMoney()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EReference getTransferOperation_Money();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Deposit <em>Deposit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deposit</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Deposit
	 * @generated
	 */
	EClass getDeposit();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Withdraw <em>Withdraw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withdraw</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Withdraw
	 * @generated
	 */
	EClass getWithdraw();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Transfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Transfer
	 * @generated
	 */
	EClass getTransfer();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.Transfer#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Account</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Transfer#getAccount()
	 * @see #getTransfer()
	 * @generated
	 */
	EReference getTransfer_Account();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.ThisExpression
	 * @generated
	 */
	EClass getThisExpression();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.FieldContainer <em>Field Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Container</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.FieldContainer
	 * @generated
	 */
	EClass getFieldContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.FieldContainer#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.FieldContainer#getFields()
	 * @see #getFieldContainer()
	 * @generated
	 */
	EReference getFieldContainer_Fields();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLine
	 * @generated
	 */
	EClass getTimeLine();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLine#getBase()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Base();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLine#getDeviation()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Deviation();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLine#getOperator()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Operator();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.enumType <em>enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>enum Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.enumType
	 * @generated
	 */
	EClass getenumType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ustb.sei.mde.smartContractSpecification.enumType#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.enumType#getSelections()
	 * @see #getenumType()
	 * @generated
	 */
	EReference getenumType_Selections();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression <em>Money Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MoneyExpression
	 * @generated
	 */
	EClass getMoneyExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getRelationOperator <em>Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getRelationOperator()
	 * @see #getMoneyExpression()
	 * @generated
	 */
	EAttribute getMoneyExpression_RelationOperator();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MoneyExpression#getCondition()
	 * @see #getMoneyExpression()
	 * @generated
	 */
	EReference getMoneyExpression_Condition();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Expression</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RightExpression
	 * @generated
	 */
	EClass getRightExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightType <em>Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Type</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightType()
	 * @see #getRightExpression()
	 * @generated
	 */
	EAttribute getRightExpression_RightType();

	/**
	 * Returns the meta object for the attribute '{@link edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightProporty <em>Right Proporty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Proporty</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RightExpression#getRightProporty()
	 * @see #getRightExpression()
	 * @generated
	 */
	EAttribute getRightExpression_RightProporty();

	/**
	 * Returns the meta object for class '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate <em>Periodic Time Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Time Predicate</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate
	 * @generated
	 */
	EClass getPeriodicTimePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriod()
	 * @see #getPeriodicTimePredicate()
	 * @generated
	 */
	EReference getPeriodicTimePredicate_Period();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBasefrom <em>Basefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basefrom</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBasefrom()
	 * @see #getPeriodicTimePredicate()
	 * @generated
	 */
	EReference getPeriodicTimePredicate_Basefrom();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBaseto <em>Baseto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Baseto</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBaseto()
	 * @see #getPeriodicTimePredicate()
	 * @generated
	 */
	EReference getPeriodicTimePredicate_Baseto();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriodDate <em>Period Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Date</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriodDate()
	 * @see #getPeriodicTimePredicate()
	 * @generated
	 */
	EReference getPeriodicTimePredicate_PeriodDate();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator <em>Time Predicate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Predicate Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator
	 * @generated
	 */
	EEnum getTimePredicateOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity <em>Party Member Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Party Member Multiplicity</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity
	 * @generated
	 */
	EEnum getPartyMemberMultiplicity();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator <em>Time Query Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Query Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator
	 * @generated
	 */
	EEnum getTimeQueryOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator <em>Additive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Additive Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator
	 * @generated
	 */
	EEnum getAdditiveOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicative Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator
	 * @generated
	 */
	EEnum getMultiplicativeOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator <em>Transitive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transitive Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator
	 * @generated
	 */
	EEnum getTransitiveOperator();

	/**
	 * Returns the meta object for enum '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator <em>Time Line Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Line Operator</em>'.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator
	 * @generated
	 */
	EEnum getTimeLineOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartContractSpecificationFactory getSmartContractSpecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.NamedElementImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__PARTIES = eINSTANCE.getContract_Parties();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__TERMS = eINSTANCE.getContract_Terms();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__TYPES = eINSTANCE.getContract_Types();

		/**
		 * The meta object literal for the '<em><b>Enum Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ENUM_TYPES = eINSTANCE.getContract_EnumTypes();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__ASSETS = eINSTANCE.getContract_Assets();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PartyImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__ACTIONS = eINSTANCE.getParty_Actions();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypeImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PrimitiveTypeImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__INSTANCE_TYPE = eINSTANCE.getPrimitiveType_InstanceType();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ComplexTypeImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AssetImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FieldImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MANY = eINSTANCE.getField_Many();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypedElementImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ActionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__IS_MANY = eINSTANCE.getAction_IsMany();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TIMES = eINSTANCE.getAction_Times();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__USED = eINSTANCE.getAction_Used();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.InternalPartyImpl <em>Internal Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.InternalPartyImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getInternalParty()
		 * @generated
		 */
		EClass INTERNAL_PARTY = eINSTANCE.getInternalParty();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SinglePartyImpl <em>Single Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SinglePartyImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSingleParty()
		 * @generated
		 */
		EClass SINGLE_PARTY = eINSTANCE.getSingleParty();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.GroupPartyImpl <em>Group Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.GroupPartyImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getGroupParty()
		 * @generated
		 */
		EClass GROUP_PARTY = eINSTANCE.getGroupParty();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ExternalPartyImpl <em>External Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ExternalPartyImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getExternalParty()
		 * @generated
		 */
		EClass EXTERNAL_PARTY = eINSTANCE.getExternalParty();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TermImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONDITION = eINSTANCE.getTerm_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__ACTION = eINSTANCE.getTerm_Action();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__PARTY = eINSTANCE.getTerm_Party();

		/**
		 * The meta object literal for the '<em><b>Transfer Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__TRANSFER_OPERATIONS = eINSTANCE.getTerm_TransferOperations();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__BREAK = eINSTANCE.getTerm_Break();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__POST_CONDITION = eINSTANCE.getTerm_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__AUTO = eINSTANCE.getTerm_Auto();

		/**
		 * The meta object literal for the '<em><b>Breach Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__BREACH_OPERATIONS = eINSTANCE.getTerm_BreachOperations();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightTermImpl <em>Right Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RightTermImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRightTerm()
		 * @generated
		 */
		EClass RIGHT_TERM = eINSTANCE.getRightTerm();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DutyTermImpl <em>Duty Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DutyTermImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDutyTerm()
		 * @generated
		 */
		EClass DUTY_TERM = eINSTANCE.getDutyTerm();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BreachTermImpl <em>Breach Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BreachTermImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBreachTerm()
		 * @generated
		 */
		EClass BREACH_TERM = eINSTANCE.getBreachTerm();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.CollectionSourceExpressionImpl <em>Collection Source Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.CollectionSourceExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getCollectionSourceExpression()
		 * @generated
		 */
		EClass COLLECTION_SOURCE_EXPRESSION = eINSTANCE.getCollectionSourceExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DescriptiveExpressionImpl <em>Descriptive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DescriptiveExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDescriptiveExpression()
		 * @generated
		 */
		EClass DESCRIPTIVE_EXPRESSION = eINSTANCE.getDescriptiveExpression();

		/**
		 * The meta object literal for the '<em><b>Plain Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTIVE_EXPRESSION__PLAIN_TEXT = eINSTANCE.getDescriptiveExpression_PlainText();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl <em>Quantifier Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.QuantifierExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getQuantifierExpression()
		 * @generated
		 */
		EClass QUANTIFIER_EXPRESSION = eINSTANCE.getQuantifierExpression();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPRESSION__SCOPE = eINSTANCE.getQuantifierExpression_Scope();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPRESSION__CONDITION = eINSTANCE.getQuantifierExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPRESSION__ITERATOR = eINSTANCE.getQuantifierExpression_Iterator();

		/**
		 * The meta object literal for the '<em><b>Qunatifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIER_EXPRESSION__QUNATIFIER = eINSTANCE.getQuantifierExpression_Qunatifier();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.IteratorDeclExpressionImpl <em>Iterator Decl Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.IteratorDeclExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getIteratorDeclExpression()
		 * @generated
		 */
		EClass ITERATOR_DECL_EXPRESSION = eINSTANCE.getIteratorDeclExpression();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITERATOR_DECL_EXPRESSION___GET_TYPE = eINSTANCE.getIteratorDeclExpression__GetType();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.CollectionExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION__SOURCE = eINSTANCE.getCollectionExpression_Source();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SelectExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSelectExpression()
		 * @generated
		 */
		EClass SELECT_EXPRESSION = eINSTANCE.getSelectExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_EXPRESSION__CONDITION = eINSTANCE.getSelectExpression_Condition();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.LogicalExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ConditionalExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getConditionalExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__THEN_BRANCH = eINSTANCE.getConditionalExpression_ThenBranch();

		/**
		 * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ELSE_BRANCH = eINSTANCE.getConditionalExpression_ElseBranch();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl <em>Imply Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ImplyExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getImplyExpression()
		 * @generated
		 */
		EClass IMPLY_EXPRESSION = eINSTANCE.getImplyExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLY_EXPRESSION__CONDITION = eINSTANCE.getImplyExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Implied</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLY_EXPRESSION__IMPLIED = eINSTANCE.getImplyExpression_Implied();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AndExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.OrExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.NotExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__INNER = eINSTANCE.getNotExpression_Inner();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RelationalExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl <em>Time Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimePredicateImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimePredicate()
		 * @generated
		 */
		EClass TIME_PREDICATE = eINSTANCE.getTimePredicate();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PREDICATE__BASE = eINSTANCE.getTimePredicate_Base();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PREDICATE__OPERATOR = eINSTANCE.getTimePredicate_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BoundedTimePredicateImpl <em>Bounded Time Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BoundedTimePredicateImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBoundedTimePredicate()
		 * @generated
		 */
		EClass BOUNDED_TIME_PREDICATE = eINSTANCE.getBoundedTimePredicate();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_TIME_PREDICATE__BOUND = eINSTANCE.getBoundedTimePredicate_Bound();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_TIME_PREDICATE__CLOSED = eINSTANCE.getBoundedTimePredicate_Closed();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeExpression()
		 * @generated
		 */
		EClass TIME_EXPRESSION = eINSTANCE.getTimeExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl <em>Time Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeConstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeConstant()
		 * @generated
		 */
		EClass TIME_CONSTANT = eINSTANCE.getTimeConstant();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__YEAR = eINSTANCE.getTimeConstant_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__MONTH = eINSTANCE.getTimeConstant_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__DAY = eINSTANCE.getTimeConstant_Day();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__HOUR = eINSTANCE.getTimeConstant_Hour();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__MIN = eINSTANCE.getTimeConstant_Min();

		/**
		 * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__SEC = eINSTANCE.getTimeConstant_Sec();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__DATE = eINSTANCE.getTimeConstant_Date();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeVarExpressionImpl <em>Time Var Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeVarExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeVarExpression()
		 * @generated
		 */
		EClass TIME_VAR_EXPRESSION = eINSTANCE.getTimeVarExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl <em>Action Enforced Time Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ActionEnforcedTimeQueryImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getActionEnforcedTimeQuery()
		 * @generated
		 */
		EClass ACTION_ENFORCED_TIME_QUERY = eINSTANCE.getActionEnforcedTimeQuery();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ENFORCED_TIME_QUERY__ACTION = eINSTANCE.getActionEnforcedTimeQuery_Action();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ENFORCED_TIME_QUERY__PARTY = eINSTANCE.getActionEnforcedTimeQuery_Party();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ENFORCED_TIME_QUERY__MULTIPLICITY = eINSTANCE.getActionEnforcedTimeQuery_Multiplicity();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TermValidTimeQueryImpl <em>Term Valid Time Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TermValidTimeQueryImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTermValidTimeQuery()
		 * @generated
		 */
		EClass TERM_VALID_TIME_QUERY = eINSTANCE.getTermValidTimeQuery();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_VALID_TIME_QUERY__TERM = eINSTANCE.getTermValidTimeQuery_Term();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.GlobalTimeQueryImpl <em>Global Time Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.GlobalTimeQueryImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getGlobalTimeQuery()
		 * @generated
		 */
		EClass GLOBAL_TIME_QUERY = eINSTANCE.getGlobalTimeQuery();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_TIME_QUERY__OPERATOR = eINSTANCE.getGlobalTimeQuery_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeQueryImpl <em>Time Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeQueryImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeQuery()
		 * @generated
		 */
		EClass TIME_QUERY = eINSTANCE.getTimeQuery();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ArithmeticExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__LEFT = eINSTANCE.getArithmeticExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__RIGHT = eINSTANCE.getArithmeticExpression_Right();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.AdditiveExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAdditiveExpression()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_EXPRESSION__OPERATOR = eINSTANCE.getAdditiveExpression_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.MultiplicativeExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMultiplicativeExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATIVE_EXPRESSION__OPERATOR = eINSTANCE.getMultiplicativeExpression_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ConstantExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FloatConstantImpl <em>Float Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FloatConstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getFloatConstant()
		 * @generated
		 */
		EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_CONSTANT__VALUE = eINSTANCE.getFloatConstant_Value();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.StringConstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.IntegerConstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ValueconstantImpl <em>Valueconstant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ValueconstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getValueconstant()
		 * @generated
		 */
		EClass VALUECONSTANT = eINSTANCE.getValueconstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUECONSTANT__VALUE = eINSTANCE.getValueconstant_Value();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.BooleanconstantImpl <em>Booleanconstant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.BooleanconstantImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getBooleanconstant()
		 * @generated
		 */
		EClass BOOLEANCONSTANT = eINSTANCE.getBooleanconstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEANCONSTANT__VALUE = eINSTANCE.getBooleanconstant_Value();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TypeLibImpl <em>Type Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TypeLibImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTypeLib()
		 * @generated
		 */
		EClass TYPE_LIB = eINSTANCE.getTypeLib();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIB__TYPES = eINSTANCE.getTypeLib_Types();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SlotRefImpl <em>Slot Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SlotRefImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSlotRef()
		 * @generated
		 */
		EClass SLOT_REF = eINSTANCE.getSlotRef();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_REF__SLOT = eINSTANCE.getSlotRef_Slot();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_REF__NEXT = eINSTANCE.getSlotRef_Next();

		/**
		 * The meta object literal for the '<em><b>Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_REF__TRANSITIVE = eINSTANCE.getSlotRef_Transitive();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DataSlotImpl <em>Data Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DataSlotImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDataSlot()
		 * @generated
		 */
		EClass DATA_SLOT = eINSTANCE.getDataSlot();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TransferOperationImpl <em>Transfer Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TransferOperationImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransferOperation()
		 * @generated
		 */
		EClass TRANSFER_OPERATION = eINSTANCE.getTransferOperation();

		/**
		 * The meta object literal for the '<em><b>Money</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OPERATION__MONEY = eINSTANCE.getTransferOperation_Money();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.DepositImpl <em>Deposit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.DepositImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getDeposit()
		 * @generated
		 */
		EClass DEPOSIT = eINSTANCE.getDeposit();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.WithdrawImpl <em>Withdraw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.WithdrawImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getWithdraw()
		 * @generated
		 */
		EClass WITHDRAW = eINSTANCE.getWithdraw();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TransferImpl <em>Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TransferImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransfer()
		 * @generated
		 */
		EClass TRANSFER = eINSTANCE.getTransfer();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER__ACCOUNT = eINSTANCE.getTransfer_Account();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl <em>This Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.ThisExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getThisExpression()
		 * @generated
		 */
		EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.FieldContainerImpl <em>Field Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.FieldContainerImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getFieldContainer()
		 * @generated
		 */
		EClass FIELD_CONTAINER = eINSTANCE.getFieldContainer();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CONTAINER__FIELDS = eINSTANCE.getFieldContainer_Fields();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl <em>Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.TimeLineImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeLine()
		 * @generated
		 */
		EClass TIME_LINE = eINSTANCE.getTimeLine();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__BASE = eINSTANCE.getTimeLine_Base();

		/**
		 * The meta object literal for the '<em><b>Deviation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__DEVIATION = eINSTANCE.getTimeLine_Deviation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__OPERATOR = eINSTANCE.getTimeLine_Operator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.enumTypeImpl <em>enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.enumTypeImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getenumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getenumType();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE__SELECTIONS = eINSTANCE.getenumType_Selections();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SelectionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.MoneyExpressionImpl <em>Money Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.MoneyExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMoneyExpression()
		 * @generated
		 */
		EClass MONEY_EXPRESSION = eINSTANCE.getMoneyExpression();

		/**
		 * The meta object literal for the '<em><b>Relation Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONEY_EXPRESSION__RELATION_OPERATOR = eINSTANCE.getMoneyExpression_RelationOperator();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONEY_EXPRESSION__CONDITION = eINSTANCE.getMoneyExpression_Condition();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl <em>Right Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.RightExpressionImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRightExpression()
		 * @generated
		 */
		EClass RIGHT_EXPRESSION = eINSTANCE.getRightExpression();

		/**
		 * The meta object literal for the '<em><b>Right Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_EXPRESSION__RIGHT_TYPE = eINSTANCE.getRightExpression_RightType();

		/**
		 * The meta object literal for the '<em><b>Right Proporty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_EXPRESSION__RIGHT_PROPORTY = eINSTANCE.getRightExpression_RightProporty();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl <em>Periodic Time Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.PeriodicTimePredicateImpl
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPeriodicTimePredicate()
		 * @generated
		 */
		EClass PERIODIC_TIME_PREDICATE = eINSTANCE.getPeriodicTimePredicate();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_TIME_PREDICATE__PERIOD = eINSTANCE.getPeriodicTimePredicate_Period();

		/**
		 * The meta object literal for the '<em><b>Basefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_TIME_PREDICATE__BASEFROM = eINSTANCE.getPeriodicTimePredicate_Basefrom();

		/**
		 * The meta object literal for the '<em><b>Baseto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_TIME_PREDICATE__BASETO = eINSTANCE.getPeriodicTimePredicate_Baseto();

		/**
		 * The meta object literal for the '<em><b>Period Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_TIME_PREDICATE__PERIOD_DATE = eINSTANCE.getPeriodicTimePredicate_PeriodDate();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.Quantifier
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.RelationalOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator <em>Time Predicate Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimePredicateOperator()
		 * @generated
		 */
		EEnum TIME_PREDICATE_OPERATOR = eINSTANCE.getTimePredicateOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity <em>Party Member Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.PartyMemberMultiplicity
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getPartyMemberMultiplicity()
		 * @generated
		 */
		EEnum PARTY_MEMBER_MULTIPLICITY = eINSTANCE.getPartyMemberMultiplicity();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator <em>Time Query Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.TimeQueryOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeQueryOperator()
		 * @generated
		 */
		EEnum TIME_QUERY_OPERATOR = eINSTANCE.getTimeQueryOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator <em>Additive Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.AdditiveOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getAdditiveOperator()
		 * @generated
		 */
		EEnum ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.MultiplicativeOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getMultiplicativeOperator()
		 * @generated
		 */
		EEnum MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator <em>Transitive Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.TransitiveOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTransitiveOperator()
		 * @generated
		 */
		EEnum TRANSITIVE_OPERATOR = eINSTANCE.getTransitiveOperator();

		/**
		 * The meta object literal for the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator <em>Time Line Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator
		 * @see edu.ustb.sei.mde.smartContractSpecification.impl.SmartContractSpecificationPackageImpl#getTimeLineOperator()
		 * @generated
		 */
		EEnum TIME_LINE_OPERATOR = eINSTANCE.getTimeLineOperator();

	}

} //SmartContractSpecificationPackage
