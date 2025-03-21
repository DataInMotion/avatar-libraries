/*
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Meta#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Meta#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.Meta#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.Meta#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.Meta#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.Meta#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMeta()
 * @model extendedMetaData="name='Meta' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Meta extends DataType {
	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version specific identifier, as it appears in the version portion of the URL. This value changes when the resource is created, updated, or deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Id</em>' containment reference.
	 * @see #setVersionId(Id)
	 * @see org.hl7.fhir.FHIRPackage#getMeta_VersionId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getVersionId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Meta#getVersionId <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' containment reference.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(Id value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the resource last changed - e.g. when the version changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated</em>' containment reference.
	 * @see #setLastUpdated(Instant)
	 * @see org.hl7.fhir.FHIRPackage#getMeta_LastUpdated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastUpdated' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getLastUpdated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Meta#getLastUpdated <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' containment reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Instant value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A uri that identifies the source system of the resource. This provides a minimal amount of [[[Provenance]]] information that can be used to track or differentiate the source of information in the resource. The source may identify another FHIR server, document, message, database, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getMeta_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Meta#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Uri value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMeta_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getProfile();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMeta_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSecurity();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMeta_Tag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getTag();

} // Meta
