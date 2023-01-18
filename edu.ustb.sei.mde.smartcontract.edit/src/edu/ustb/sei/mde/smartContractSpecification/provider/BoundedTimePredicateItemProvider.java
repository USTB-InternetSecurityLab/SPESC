/**
 */
package edu.ustb.sei.mde.smartContractSpecification.provider;


import edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;
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
 * This is the item provider adapter for a {@link edu.ustb.sei.mde.smartContractSpecification.BoundedTimePredicate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundedTimePredicateItemProvider extends TimePredicateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedTimePredicateItemProvider(AdapterFactory adapterFactory) {
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

			addClosedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Closed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClosedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BoundedTimePredicate_closed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BoundedTimePredicate_closed_feature", "_UI_BoundedTimePredicate_type"),
				 SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__CLOSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND);
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
	 * This returns BoundedTimePredicate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BoundedTimePredicate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimePredicateOperator labelValue = ((BoundedTimePredicate)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BoundedTimePredicate_type") :
			getString("_UI_BoundedTimePredicate_type") + " " + label;
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

		switch (notification.getFeatureID(BoundedTimePredicate.class)) {
			case SmartContractSpecificationPackage.BOUNDED_TIME_PREDICATE__CLOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmartContractSpecificationPackage.BOUNDED_TIME_PREDICATE__BOUND:
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
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));
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
			childFeature == SmartContractSpecificationPackage.Literals.BOUNDED_TIME_PREDICATE__BOUND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
