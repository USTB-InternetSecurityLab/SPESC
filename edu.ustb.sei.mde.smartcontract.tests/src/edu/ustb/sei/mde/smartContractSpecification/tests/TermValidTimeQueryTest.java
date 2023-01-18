/**
 */
package edu.ustb.sei.mde.smartContractSpecification.tests;

import edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationFactory;
import edu.ustb.sei.mde.smartContractSpecification.TermValidTimeQuery;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Valid Time Query</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermValidTimeQueryTest extends TimeQueryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermValidTimeQueryTest.class);
	}

	/**
	 * Constructs a new Term Valid Time Query test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermValidTimeQueryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Valid Time Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TermValidTimeQuery getFixture() {
		return (TermValidTimeQuery)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartContractSpecificationFactory.eINSTANCE.createTermValidTimeQuery());
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

} //TermValidTimeQueryTest
