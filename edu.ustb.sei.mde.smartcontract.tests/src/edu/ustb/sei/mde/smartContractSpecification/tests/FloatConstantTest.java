/**
 */
package edu.ustb.sei.mde.smartContractSpecification.tests;

import edu.ustb.sei.mde.smartContractSpecification.FloatConstant;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Float Constant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatConstantTest extends ConstantExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FloatConstantTest.class);
	}

	/**
	 * Constructs a new Float Constant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatConstantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Float Constant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FloatConstant getFixture() {
		return (FloatConstant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartContractSpecificationFactory.eINSTANCE.createFloatConstant());
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

} //FloatConstantTest
