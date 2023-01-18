/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Query Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTimeQueryOperator()
 * @model
 * @generated
 */
public enum TimeQueryOperator implements Enumerator {
	/**
	 * The '<em><b>Now</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOW_VALUE
	 * @generated
	 * @ordered
	 */
	NOW(0, "now", "now"),

	/**
	 * The '<em><b>Contract Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_START_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_START(1, "contractStart", "contractStart"),

	/**
	 * The '<em><b>Contract End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_END_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_END(2, "contractEnd", "contractEnd");

	/**
	 * The '<em><b>Now</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Now</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOW
	 * @model name="now"
	 * @generated
	 * @ordered
	 */
	public static final int NOW_VALUE = 0;

	/**
	 * The '<em><b>Contract Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contract Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_START
	 * @model name="contractStart"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_START_VALUE = 1;

	/**
	 * The '<em><b>Contract End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contract End</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_END
	 * @model name="contractEnd"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_END_VALUE = 2;

	/**
	 * An array of all the '<em><b>Time Query Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeQueryOperator[] VALUES_ARRAY =
		new TimeQueryOperator[] {
			NOW,
			CONTRACT_START,
			CONTRACT_END,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Query Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeQueryOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Query Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeQueryOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeQueryOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Query Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeQueryOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeQueryOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Query Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeQueryOperator get(int value) {
		switch (value) {
			case NOW_VALUE: return NOW;
			case CONTRACT_START_VALUE: return CONTRACT_START;
			case CONTRACT_END_VALUE: return CONTRACT_END;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeQueryOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeQueryOperator
