/**
 */
package edu.ustb.sei.mde.smartContractSpecification.tests;

import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.Valueconstant;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valueconstant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueconstantTest extends ConstantExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueconstantTest.class);
	}

	/**
	 * Constructs a new Valueconstant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueconstantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Valueconstant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Valueconstant getFixture() {
		return (Valueconstant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartContractSpecificationFactory.eINSTANCE.createValueconstant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ValueconstantTest
