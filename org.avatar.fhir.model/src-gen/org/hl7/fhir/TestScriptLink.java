/*
 */
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptLink#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptLink#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestScriptLink()
 * @model extendedMetaData="name='TestScript.Link' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestScriptLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to a particular requirement or feature within the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptLink_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptLink#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short description of the link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptLink_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptLink#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

} // TestScriptLink
