/*
 */
package org.hl7.fhir_patient;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Comparator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How the Quantity should be understood and represented.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.QuantityComparator#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getQuantityComparator()
 * @model extendedMetaData="name='QuantityComparator' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QuantityComparator extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir_patient.QuantityComparatorEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir_patient.QuantityComparatorEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(QuantityComparatorEnum)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getQuantityComparator_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	QuantityComparatorEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.QuantityComparator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir_patient.QuantityComparatorEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(QuantityComparatorEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir_patient.QuantityComparator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(QuantityComparatorEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir_patient.QuantityComparator#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(QuantityComparatorEnum)
	 * @generated
	 */
	boolean isSetValue();

} // QuantityComparator
