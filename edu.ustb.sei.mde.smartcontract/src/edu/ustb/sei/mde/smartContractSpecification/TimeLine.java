/**
 */
package edu.ustb.sei.mde.smartContractSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getBase <em>Base</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getDeviation <em>Deviation</em>}</li>
 *   <li>{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimeLine()
 * @model
 * @generated
 */
public interface TimeLine extends TimeExpression {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(TimeExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimeLine_Base()
	 * @model containment="true"
	 * @generated
	 */
	TimeExpression getBase();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(TimeExpression value);

	/**
	 * Returns the value of the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation</em>' containment reference.
	 * @see #setDeviation(TimeExpression)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimeLine_Deviation()
	 * @model containment="true"
	 * @generated
	 */
	TimeExpression getDeviation();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getDeviation <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation</em>' containment reference.
	 * @see #getDeviation()
	 * @generated
	 */
	void setDeviation(TimeExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator
	 * @see #setOperator(TimeLineOperator)
	 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimeLine_Operator()
	 * @model required="true"
	 * @generated
	 */
	TimeLineOperator getOperator();

	/**
	 * Sets the value of the '{@link edu.ustb.sei.mde.smartContractSpecification.TimeLine#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see edu.ustb.sei.mde.smartContractSpecification.TimeLineOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TimeLineOperator value);

} // TimeLine
