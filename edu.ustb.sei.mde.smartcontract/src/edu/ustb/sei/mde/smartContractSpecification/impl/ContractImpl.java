/**
 */
package edu.ustb.sei.mde.smartContractSpecification.impl;

import edu.ustb.sei.mde.smartContractSpecification.Asset;
import edu.ustb.sei.mde.smartContractSpecification.Contract;
import edu.ustb.sei.mde.smartContractSpecification.Field;
import edu.ustb.sei.mde.smartContractSpecification.FieldContainer;
import edu.ustb.sei.mde.smartContractSpecification.Party;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.Term;
import edu.ustb.sei.mde.smartContractSpecification.Type;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getEnumTypes <em>Enum Types</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.impl.ContractImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends NamedElementImpl implements Contract {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> parties;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getEnumTypes() <em>Enum Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> enumTypes;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartContractSpecificationPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, SmartContractSpecificationPackage.CONTRACT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Party> getParties() {
		if (parties == null) {
			parties = new EObjectContainmentEList<Party>(Party.class, this, SmartContractSpecificationPackage.CONTRACT__PARTIES);
		}
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<Term>(Term.class, this, SmartContractSpecificationPackage.CONTRACT__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, SmartContractSpecificationPackage.CONTRACT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEnumTypes() {
		if (enumTypes == null) {
			enumTypes = new EObjectContainmentEList<Type>(Type.class, this, SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES);
		}
		return enumTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<Asset>(Asset.class, this, SmartContractSpecificationPackage.CONTRACT__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartContractSpecificationPackage.CONTRACT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.CONTRACT__PARTIES:
				return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.CONTRACT__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.CONTRACT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES:
				return ((InternalEList<?>)getEnumTypes()).basicRemove(otherEnd, msgs);
			case SmartContractSpecificationPackage.CONTRACT__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case SmartContractSpecificationPackage.CONTRACT__FIELDS:
				return getFields();
			case SmartContractSpecificationPackage.CONTRACT__PARTIES:
				return getParties();
			case SmartContractSpecificationPackage.CONTRACT__TERMS:
				return getTerms();
			case SmartContractSpecificationPackage.CONTRACT__TYPES:
				return getTypes();
			case SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES:
				return getEnumTypes();
			case SmartContractSpecificationPackage.CONTRACT__ASSETS:
				return getAssets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartContractSpecificationPackage.CONTRACT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case SmartContractSpecificationPackage.CONTRACT__PARTIES:
				getParties().clear();
				getParties().addAll((Collection<? extends Party>)newValue);
				return;
			case SmartContractSpecificationPackage.CONTRACT__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends Term>)newValue);
				return;
			case SmartContractSpecificationPackage.CONTRACT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES:
				getEnumTypes().clear();
				getEnumTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SmartContractSpecificationPackage.CONTRACT__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
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
			case SmartContractSpecificationPackage.CONTRACT__FIELDS:
				getFields().clear();
				return;
			case SmartContractSpecificationPackage.CONTRACT__PARTIES:
				getParties().clear();
				return;
			case SmartContractSpecificationPackage.CONTRACT__TERMS:
				getTerms().clear();
				return;
			case SmartContractSpecificationPackage.CONTRACT__TYPES:
				getTypes().clear();
				return;
			case SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES:
				getEnumTypes().clear();
				return;
			case SmartContractSpecificationPackage.CONTRACT__ASSETS:
				getAssets().clear();
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
			case SmartContractSpecificationPackage.CONTRACT__FIELDS:
				return fields != null && !fields.isEmpty();
			case SmartContractSpecificationPackage.CONTRACT__PARTIES:
				return parties != null && !parties.isEmpty();
			case SmartContractSpecificationPackage.CONTRACT__TERMS:
				return terms != null && !terms.isEmpty();
			case SmartContractSpecificationPackage.CONTRACT__TYPES:
				return types != null && !types.isEmpty();
			case SmartContractSpecificationPackage.CONTRACT__ENUM_TYPES:
				return enumTypes != null && !enumTypes.isEmpty();
			case SmartContractSpecificationPackage.CONTRACT__ASSETS:
				return assets != null && !assets.isEmpty();
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
		if (baseClass == FieldContainer.class) {
			switch (derivedFeatureID) {
				case SmartContractSpecificationPackage.CONTRACT__FIELDS: return SmartContractSpecificationPackage.FIELD_CONTAINER__FIELDS;
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
		if (baseClass == FieldContainer.class) {
			switch (baseFeatureID) {
				case SmartContractSpecificationPackage.FIELD_CONTAINER__FIELDS: return SmartContractSpecificationPackage.CONTRACT__FIELDS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContractImpl
