/*
 */
package org.hl7.fhir_patient;

import java.lang.String;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canonical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A URI that is a reference to a canonical URL on a FHIR resource
 * see [Canonical References](references.html#canonical)
 * If the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.Canonical#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getCanonical()
 * @model extendedMetaData="name='canonical' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Canonical extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getCanonical_Value()
	 * @model dataType="org.hl7.fhir_patient.CanonicalPrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.Canonical#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Canonical
