/**
 */
package edu.ustb.sei.mde.smartContractSpecification.provider;


import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.TimePredicateOperator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.ustb.sei.mde.smartContractSpecification.TimePredicate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimePredicateItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePredicateItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimePredicate_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimePredicate_operator_feature", "_UI_TimePredicate_type"),
				 SmartContractSpecificationPackage.Literals.TIME_PREDICATE__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE);
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
	 * This returns TimePredicate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimePredicate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimePredicateOperator labelValue = ((TimePredicate)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TimePredicate_type") :
			getString("_UI_TimePredicate_type") + " " + label;
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

		switch (notification.getFeatureID(TimePredicate.class)) {
			case SmartContractSpecificationPackage.TIME_PREDICATE__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmartContractSpecificationPackage.TIME_PREDICATE__BASE:
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
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.TIME_PREDICATE__BASE,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));
	}

}
