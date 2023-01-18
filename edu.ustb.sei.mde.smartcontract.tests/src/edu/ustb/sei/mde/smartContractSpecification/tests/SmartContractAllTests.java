/**
 */
package edu.ustb.sei.mde.smartContractSpecification.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SmartContract</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartContractAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SmartContractAllTests("SmartContract Tests");
		suite.addTest(SmartContractSpecificationTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractAllTests(String name) {
		super(name);
	}

} //SmartContractAllTests
