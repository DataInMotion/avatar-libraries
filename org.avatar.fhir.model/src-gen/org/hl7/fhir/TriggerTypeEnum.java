/*
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getTriggerTypeEnum()
 * @model extendedMetaData="name='TriggerTypeEnum'"
 * @generated
 */
@ProviderType
public enum TriggerTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Named Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named Event
	 * <!-- end-model-doc -->
	 * @see #NAMED_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED_EVENT(0, "namedEvent", "named-event"),

	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Periodic
	 * <!-- end-model-doc -->
	 * @see #PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC(1, "periodic", "periodic"),

	/**
	 * The '<em><b>Data Changed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Changed
	 * <!-- end-model-doc -->
	 * @see #DATA_CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANGED(2, "dataChanged", "data-changed"),

	/**
	 * The '<em><b>Data Added</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Added
	 * <!-- end-model-doc -->
	 * @see #DATA_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ADDED(3, "dataAdded", "data-added"),

	/**
	 * The '<em><b>Data Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Updated
	 * <!-- end-model-doc -->
	 * @see #DATA_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_MODIFIED(4, "dataModified", "data-modified"),

	/**
	 * The '<em><b>Data Removed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Removed
	 * <!-- end-model-doc -->
	 * @see #DATA_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REMOVED(5, "dataRemoved", "data-removed"),

	/**
	 * The '<em><b>Data Accessed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Accessed
	 * <!-- end-model-doc -->
	 * @see #DATA_ACCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ACCESSED(6, "dataAccessed", "data-accessed"),

	/**
	 * The '<em><b>Data Access Ended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Access Ended
	 * <!-- end-model-doc -->
	 * @see #DATA_ACCESS_ENDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ACCESS_ENDED(7, "dataAccessEnded", "data-access-ended");

	/**
	 * The '<em><b>Named Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named Event
	 * <!-- end-model-doc -->
	 * @see #NAMED_EVENT
	 * @model name="namedEvent" literal="named-event"
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_EVENT_VALUE = 0;

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Periodic
	 * <!-- end-model-doc -->
	 * @see #PERIODIC
	 * @model name="periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_VALUE = 1;

	/**
	 * The '<em><b>Data Changed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Changed
	 * <!-- end-model-doc -->
	 * @see #DATA_CHANGED
	 * @model name="dataChanged" literal="data-changed"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANGED_VALUE = 2;

	/**
	 * The '<em><b>Data Added</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Added
	 * <!-- end-model-doc -->
	 * @see #DATA_ADDED
	 * @model name="dataAdded" literal="data-added"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ADDED_VALUE = 3;

	/**
	 * The '<em><b>Data Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Updated
	 * <!-- end-model-doc -->
	 * @see #DATA_MODIFIED
	 * @model name="dataModified" literal="data-modified"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_MODIFIED_VALUE = 4;

	/**
	 * The '<em><b>Data Removed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Removed
	 * <!-- end-model-doc -->
	 * @see #DATA_REMOVED
	 * @model name="dataRemoved" literal="data-removed"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REMOVED_VALUE = 5;

	/**
	 * The '<em><b>Data Accessed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Accessed
	 * <!-- end-model-doc -->
	 * @see #DATA_ACCESSED
	 * @model name="dataAccessed" literal="data-accessed"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ACCESSED_VALUE = 6;

	/**
	 * The '<em><b>Data Access Ended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Access Ended
	 * <!-- end-model-doc -->
	 * @see #DATA_ACCESS_ENDED
	 * @model name="dataAccessEnded" literal="data-access-ended"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ACCESS_ENDED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Trigger Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerTypeEnum[] VALUES_ARRAY =
		new TriggerTypeEnum[] {
			NAMED_EVENT,
			PERIODIC,
			DATA_CHANGED,
			DATA_ADDED,
			DATA_MODIFIED,
			DATA_REMOVED,
			DATA_ACCESSED,
			DATA_ACCESS_ENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerTypeEnum get(int value) {
		switch (value) {
			case NAMED_EVENT_VALUE: return NAMED_EVENT;
			case PERIODIC_VALUE: return PERIODIC;
			case DATA_CHANGED_VALUE: return DATA_CHANGED;
			case DATA_ADDED_VALUE: return DATA_ADDED;
			case DATA_MODIFIED_VALUE: return DATA_MODIFIED;
			case DATA_REMOVED_VALUE: return DATA_REMOVED;
			case DATA_ACCESSED_VALUE: return DATA_ACCESSED;
			case DATA_ACCESS_ENDED_VALUE: return DATA_ACCESS_ENDED;
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
	private TriggerTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //TriggerTypeEnum
