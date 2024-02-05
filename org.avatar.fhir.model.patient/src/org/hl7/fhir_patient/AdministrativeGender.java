/*
 */
package org.hl7.fhir_patient;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrative Gender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.AdministrativeGender#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getAdministrativeGender()
 * @model extendedMetaData="name='AdministrativeGender' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdministrativeGender extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir_patient.AdministrativeGenderEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir_patient.AdministrativeGenderEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(AdministrativeGenderEnum)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getAdministrativeGender_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	AdministrativeGenderEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.AdministrativeGender#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir_patient.AdministrativeGenderEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AdministrativeGenderEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir_patient.AdministrativeGender#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(AdministrativeGenderEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir_patient.AdministrativeGender#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(AdministrativeGenderEnum)
	 * @generated
	 */
	boolean isSetValue();

} // AdministrativeGender
