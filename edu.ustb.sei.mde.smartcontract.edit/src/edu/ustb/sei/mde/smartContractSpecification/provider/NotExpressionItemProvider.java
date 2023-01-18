/**
 */
package edu.ustb.sei.mde.smartContractSpecification.provider;


import edu.ustb.sei.mde.smartContractSpecification.NotExpression;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.ustb.sei.mde.smartContractSpecification.NotExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NotExpressionItemProvider extends LogicalExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER);
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
	 * This returns NotExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NotExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NotExpression_type");
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

		switch (notification.getFeatureID(NotExpression.class)) {
			case SmartContractSpecificationPackage.NOT_EXPRESSION__INNER:
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
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.NOT_EXPRESSION__INNER,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));
	}

}
