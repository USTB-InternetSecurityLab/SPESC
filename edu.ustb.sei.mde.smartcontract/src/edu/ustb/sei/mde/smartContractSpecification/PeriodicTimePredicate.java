/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Time Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriod <em>Period</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBasefrom <em>Basefrom</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBaseto <em>Baseto</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriodDate <em>Period Date</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getPeriodicTimePredicate()
 * @model
 * @generated
 */
public interface PeriodicTimePredicate extends TimePredicate {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getPeriodicTimePredicate_Period()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPeriod();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Expression value);

	/**
	 * Returns the value of the '<em><b>Basefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basefrom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basefrom</em>' containment reference.
	 * @see #setBasefrom(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getPeriodicTimePredicate_Basefrom()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBasefrom();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBasefrom <em>Basefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basefrom</em>' containment reference.
	 * @see #getBasefrom()
	 * @generated
	 */
	void setBasefrom(Expression value);

	/**
	 * Returns the value of the '<em><b>Baseto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseto</em>' containment reference.
	 * @see #setBaseto(Expression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getPeriodicTimePredicate_Baseto()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBaseto();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getBaseto <em>Baseto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseto</em>' containment reference.
	 * @see #getBaseto()
	 * @generated
	 */
	void setBaseto(Expression value);

	/**
	 * Returns the value of the '<em><b>Period Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Date</em>' containment reference.
	 * @see #setPeriodDate(EObject)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getPeriodicTimePredicate_PeriodDate()
	 * @model containment="true"
	 * @generated
	 */
	EObject getPeriodDate();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.PeriodicTimePredicate#getPeriodDate <em>Period Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Date</em>' containment reference.
	 * @see #getPeriodDate()
	 * @generated
	 */
	void setPeriodDate(EObject value);

} // PeriodicTimePredicate
