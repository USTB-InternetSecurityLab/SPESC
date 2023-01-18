/**
 */
package edu.ustb.sei.mde.smartContractSpecification.provider;


import edu.ustb.sei.mde.smartContractSpecification.RelationalExpression;
import edu.ustb.sei.mde.smartContractSpecification.RelationalOperator;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage;

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
 * This is the item provider adapter for a {@link edu.ustb.sei.mde.smartContractSpecification.RelationalExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpressionItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_RelationalExpression_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationalExpression_operator_feature", "_UI_RelationalExpression_type"),
				 SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__OPERATOR,
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
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT);
			childrenFeatures.add(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT);
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
	 * This returns RelationalExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationalExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RelationalOperator labelValue = ((RelationalExpression)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RelationalExpression_type") :
			getString("_UI_RelationalExpression_type") + " " + label;
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

		switch (notification.getFeatureID(RelationalExpression.class)) {
			case SmartContractSpecificationPackage.RELATIONAL_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmartContractSpecificationPackage.RELATIONAL_EXPRESSION__LEFT:
			case SmartContractSpecificationPackage.RELATIONAL_EXPRESSION__RIGHT:
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
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createDescriptiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createQuantifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createRelationalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createBoundedTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createPeriodicTimePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createTimeVarExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createActionEnforcedTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createGlobalTimeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createValueconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createBooleanconstant()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createSlotRef()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
				 SmartContractSpecificationFactory.eINSTANCE.createThisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT,
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
			childFeature == SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__LEFT ||
			childFeature == SmartContractSpecificationPackage.Literals.RELATIONAL_EXPRESSION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
