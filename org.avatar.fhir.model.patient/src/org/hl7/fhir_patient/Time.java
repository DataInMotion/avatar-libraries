/*
 */
package org.hl7.fhir_patient;

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time during the day, with no date specified
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.Time#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getTime()
 * @model extendedMetaData="name='time' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Time extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getTime_Value()
	 * @model dataType="org.hl7.fhir_patient.TimePrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.Time#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

} // Time
