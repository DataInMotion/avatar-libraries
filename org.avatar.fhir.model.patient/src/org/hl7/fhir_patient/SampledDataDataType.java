/*
 */
package org.hl7.fhir_patient;

import java.lang.String;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampled Data Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.SampledDataDataType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getSampledDataDataType()
 * @model extendedMetaData="name='SampledDataDataType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SampledDataDataType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getSampledDataDataType_Value()
	 * @model dataType="org.hl7.fhir_patient.SampledDataDataTypePrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.SampledDataDataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SampledDataDataType
