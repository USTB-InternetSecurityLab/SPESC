/**
 */
package edu.ustb.sei.mde.smartContractSpecification;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transitive Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.ustb.sei.mde.smartContractSpecification.SmartContractSpecificationPackage#getTransitiveOperator()
 * @model
 * @generated
 */
public enum TransitiveOperator implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Transitive Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITIVE_ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_ENCLOSURE(1, "transitiveEnclosure", "transitiveEnclosure"),

	/**
	 * The '<em><b>Self Transitive Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_TRANSITIVE_ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_TRANSITIVE_ENCLOSURE(2, "selfTransitiveEnclosure", "selfTransitiveEnclosure");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Transitive Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transitive Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSITIVE_ENCLOSURE
	 * @model name="transitiveEnclosure"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_ENCLOSURE_VALUE = 1;

	/**
	 * The '<em><b>Self Transitive Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Self Transitive Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELF_TRANSITIVE_ENCLOSURE
	 * @model name="selfTransitiveEnclosure"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_TRANSITIVE_ENCLOSURE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transitive Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransitiveOperator[] VALUES_ARRAY =
		new TransitiveOperator[] {
			NONE,
			TRANSITIVE_ENCLOSURE,
			SELF_TRANSITIVE_ENCLOSURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Transitive Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransitiveOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transitive Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitiveOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitiveOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitive Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitiveOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitiveOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitive Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitiveOperator get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case TRANSITIVE_ENCLOSURE_VALUE: return TRANSITIVE_ENCLOSURE;
			case SELF_TRANSITIVE_ENCLOSURE_VALUE: return SELF_TRANSITIVE_ENCLOSURE;
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
	private TransitiveOperator(int value, String name, String literal) {
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
	
} //TransitiveOperator
