/**
 */
package edu.ustb.sei.mde.smartContractSpecification.provider;


import edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PeriodicTimePredicateItemProvider extends TimePredicateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicTimePredicateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD);
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM);
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO);
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PeriodicTimePredicate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PeriodicTimePredicate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimePredicateOperator labelValue = ((PeriodicTimePredicate)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PeriodicTimePredicate_type") :
			getString("_UI_PeriodicTimePredicate_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PeriodicTimePredicate.class)) {
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD:
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASEFROM:
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__BASETO:
			case SmartContractSpecificationPackage.PERIODIC_TIME_PREDICATE__PERIOD_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createAsset()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createSingleParty()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createGroupParty()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createExternalParty()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createRightTerm()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createDutyTerm()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createBreachTerm()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createIteratorDeclExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTypeLib()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createDeposit()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createWithdraw()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTransfer()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createenumType()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createSelection()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createMoneyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE,
				 SmartContractSpecificationFactory.eINSTANCE.createRightExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE ||
			childFeature == SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD ||
			childFeature == SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASEFROM ||
			childFeature == SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__BASETO ||
			childFeature == SmartContractSpecificationPackage.Literals.PERIODIC_TIME_PREDICATE__PERIOD_DATE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
