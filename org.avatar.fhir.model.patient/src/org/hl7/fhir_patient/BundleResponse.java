/*
 */
package org.hl7.fhir_patient;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for a collection of resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.BundleResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.BundleResponse#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.BundleResponse#getEtag <em>Etag</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.BundleResponse#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getBundleResponse()
 * @model extendedMetaData="name='Bundle.Response' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BundleResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(org.hl7.fhir_patient.String)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getBundleResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir_patient.String getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.BundleResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(org.hl7.fhir_patient.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location header created by processing this operation, populated if the operation returns a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Uri)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getBundleResponse_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.BundleResponse#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Uri value);

	/**
	 * Returns the value of the '<em><b>Etag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Etag</em>' containment reference.
	 * @see #setEtag(org.hl7.fhir_patient.String)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getBundleResponse_Etag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etag' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir_patient.String getEtag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.BundleResponse#getEtag <em>Etag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etag</em>' containment reference.
	 * @see #getEtag()
	 * @generated
	 */
	void setEtag(org.hl7.fhir_patient.String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time that the resource was modified on the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(Instant)
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#getBundleResponse_LastModified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastModified' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getLastModified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir_patient.BundleResponse#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Instant value);

} // BundleResponse
