/**
 */
package edu.ustb.sei.mde.smartContractSpecification.tests;

import edu.ustb.sei.mde.smartContractSpecification.Selection;
import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionTest.class);
	}

	/**
	 * Constructs a new Selection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Selection getFixture() {
		return (Selection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartContractSpecificationFactory.eINSTANCE.createSelection());
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

} //SelectionTest
