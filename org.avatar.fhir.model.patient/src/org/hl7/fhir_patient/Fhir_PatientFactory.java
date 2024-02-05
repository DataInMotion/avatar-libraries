/*
 */
package org.hl7.fhir_patient;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir_patient.Fhir_PatientPackage
 * @generated
 */
@ProviderType
public interface Fhir_PatientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fhir_PatientFactory eINSTANCE = org.hl7.fhir_patient.impl.Fhir_PatientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Type</em>'.
	 * @generated
	 */
	AddressType createAddressType();

	/**
	 * Returns a new object of class '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Use</em>'.
	 * @generated
	 */
	AddressUse createAddressUse();

	/**
	 * Returns a new object of class '<em>Administrative Gender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrative Gender</em>'.
	 * @generated
	 */
	AdministrativeGender createAdministrativeGender();

	/**
	 * Returns a new object of class '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age</em>'.
	 * @generated
	 */
	Age createAge();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns a new object of class '<em>Availability Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability Available Time</em>'.
	 * @generated
	 */
	AvailabilityAvailableTime createAvailabilityAvailableTime();

	/**
	 * Returns a new object of class '<em>Availability Not Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability Not Available Time</em>'.
	 * @generated
	 */
	AvailabilityNotAvailableTime createAvailabilityNotAvailableTime();

	/**
	 * Returns a new object of class '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backbone Element</em>'.
	 * @generated
	 */
	BackboneElement createBackboneElement();

	/**
	 * Returns a new object of class '<em>Backbone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backbone Type</em>'.
	 * @generated
	 */
	BackboneType createBackboneType();

	/**
	 * Returns a new object of class '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base</em>'.
	 * @generated
	 */
	Base createBase();

	/**
	 * Returns a new object of class '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64 Binary</em>'.
	 * @generated
	 */
	Base64Binary createBase64Binary();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry</em>'.
	 * @generated
	 */
	BundleEntry createBundleEntry();

	/**
	 * Returns a new object of class '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Link</em>'.
	 * @generated
	 */
	BundleLink createBundleLink();

	/**
	 * Returns a new object of class '<em>Bundle Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Request</em>'.
	 * @generated
	 */
	BundleRequest createBundleRequest();

	/**
	 * Returns a new object of class '<em>Bundle Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Response</em>'.
	 * @generated
	 */
	BundleResponse createBundleResponse();

	/**
	 * Returns a new object of class '<em>Bundle Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Search</em>'.
	 * @generated
	 */
	BundleSearch createBundleSearch();

	/**
	 * Returns a new object of class '<em>Bundle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Type</em>'.
	 * @generated
	 */
	BundleType createBundleType();

	/**
	 * Returns a new object of class '<em>Canonical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canonical</em>'.
	 * @generated
	 */
	Canonical createCanonical();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

	/**
	 * Returns a new object of class '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codeable Concept</em>'.
	 * @generated
	 */
	CodeableConcept createCodeableConcept();

	/**
	 * Returns a new object of class '<em>Codeable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codeable Reference</em>'.
	 * @generated
	 */
	CodeableReference createCodeableReference();

	/**
	 * Returns a new object of class '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding</em>'.
	 * @generated
	 */
	Coding createCoding();

	/**
	 * Returns a new object of class '<em>Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Detail</em>'.
	 * @generated
	 */
	ContactDetail createContactDetail();

	/**
	 * Returns a new object of class '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point</em>'.
	 * @generated
	 */
	ContactPoint createContactPoint();

	/**
	 * Returns a new object of class '<em>Contact Point System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point System</em>'.
	 * @generated
	 */
	ContactPointSystem createContactPointSystem();

	/**
	 * Returns a new object of class '<em>Contact Point Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point Use</em>'.
	 * @generated
	 */
	ContactPointUse createContactPointUse();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement</em>'.
	 * @generated
	 */
	DataRequirement createDataRequirement();

	/**
	 * Returns a new object of class '<em>Data Requirement Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Code Filter</em>'.
	 * @generated
	 */
	DataRequirementCodeFilter createDataRequirementCodeFilter();

	/**
	 * Returns a new object of class '<em>Data Requirement Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Date Filter</em>'.
	 * @generated
	 */
	DataRequirementDateFilter createDataRequirementDateFilter();

	/**
	 * Returns a new object of class '<em>Data Requirement Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Sort</em>'.
	 * @generated
	 */
	DataRequirementSort createDataRequirementSort();

	/**
	 * Returns a new object of class '<em>Data Requirement Value Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Value Filter</em>'.
	 * @generated
	 */
	DataRequirementValueFilter createDataRequirementValueFilter();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal</em>'.
	 * @generated
	 */
	Decimal createDecimal();

	/**
	 * Returns a new object of class '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance</em>'.
	 * @generated
	 */
	Distance createDistance();

	/**
	 * Returns a new object of class '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Resource</em>'.
	 * @generated
	 */
	DomainResource createDomainResource();

	/**
	 * Returns a new object of class '<em>Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dosage</em>'.
	 * @generated
	 */
	Dosage createDosage();

	/**
	 * Returns a new object of class '<em>Dosage Dose And Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dosage Dose And Rate</em>'.
	 * @generated
	 */
	DosageDoseAndRate createDosageDoseAndRate();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Event Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timing</em>'.
	 * @generated
	 */
	EventTiming createEventTiming();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Extended Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Contact Detail</em>'.
	 * @generated
	 */
	ExtendedContactDetail createExtendedContactDetail();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>HTTP Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Verb</em>'.
	 * @generated
	 */
	HTTPVerb createHTTPVerb();

	/**
	 * Returns a new object of class '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Name</em>'.
	 * @generated
	 */
	HumanName createHumanName();

	/**
	 * Returns a new object of class '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id</em>'.
	 * @generated
	 */
	Id createId();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>Identifier Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Use</em>'.
	 * @generated
	 */
	IdentifierUse createIdentifierUse();

	/**
	 * Returns a new object of class '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant</em>'.
	 * @generated
	 */
	Instant createInstant();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Integer64</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer64</em>'.
	 * @generated
	 */
	Integer64 createInteger64();

	/**
	 * Returns a new object of class '<em>Link Relation Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Relation Types</em>'.
	 * @generated
	 */
	LinkRelationTypes createLinkRelationTypes();

	/**
	 * Returns a new object of class '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Type</em>'.
	 * @generated
	 */
	LinkType createLinkType();

	/**
	 * Returns a new object of class '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markdown</em>'.
	 * @generated
	 */
	Markdown createMarkdown();

	/**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
	Meta createMeta();

	/**
	 * Returns a new object of class '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Money</em>'.
	 * @generated
	 */
	Money createMoney();

	/**
	 * Returns a new object of class '<em>Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Use</em>'.
	 * @generated
	 */
	NameUse createNameUse();

	/**
	 * Returns a new object of class '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative</em>'.
	 * @generated
	 */
	Narrative createNarrative();

	/**
	 * Returns a new object of class '<em>Narrative Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative Status</em>'.
	 * @generated
	 */
	NarrativeStatus createNarrativeStatus();

	/**
	 * Returns a new object of class '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oid</em>'.
	 * @generated
	 */
	Oid createOid();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Communication</em>'.
	 * @generated
	 */
	PatientCommunication createPatientCommunication();

	/**
	 * Returns a new object of class '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Contact</em>'.
	 * @generated
	 */
	PatientContact createPatientContact();

	/**
	 * Returns a new object of class '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Link</em>'.
	 * @generated
	 */
	PatientLink createPatientLink();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Int</em>'.
	 * @generated
	 */
	PositiveInt createPositiveInt();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Quantity Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Comparator</em>'.
	 * @generated
	 */
	QuantityComparator createQuantityComparator();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns a new object of class '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio</em>'.
	 * @generated
	 */
	Ratio createRatio();

	/**
	 * Returns a new object of class '<em>Ratio Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Range</em>'.
	 * @generated
	 */
	RatioRange createRatioRange();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Related Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Artifact</em>'.
	 * @generated
	 */
	RelatedArtifact createRelatedArtifact();

	/**
	 * Returns a new object of class '<em>Related Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Artifact Type</em>'.
	 * @generated
	 */
	RelatedArtifactType createRelatedArtifactType();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampled Data</em>'.
	 * @generated
	 */
	SampledData createSampledData();

	/**
	 * Returns a new object of class '<em>Sampled Data Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampled Data Data Type</em>'.
	 * @generated
	 */
	SampledDataDataType createSampledDataDataType();

	/**
	 * Returns a new object of class '<em>Search Entry Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Entry Mode</em>'.
	 * @generated
	 */
	SearchEntryMode createSearchEntryMode();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Sort Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Direction</em>'.
	 * @generated
	 */
	SortDirection createSortDirection();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing</em>'.
	 * @generated
	 */
	Timing createTiming();

	/**
	 * Returns a new object of class '<em>Timing Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Repeat</em>'.
	 * @generated
	 */
	TimingRepeat createTimingRepeat();

	/**
	 * Returns a new object of class '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Definition</em>'.
	 * @generated
	 */
	TriggerDefinition createTriggerDefinition();

	/**
	 * Returns a new object of class '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Type</em>'.
	 * @generated
	 */
	TriggerType createTriggerType();

	/**
	 * Returns a new object of class '<em>Units Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Units Of Time</em>'.
	 * @generated
	 */
	UnitsOfTime createUnitsOfTime();

	/**
	 * Returns a new object of class '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Int</em>'.
	 * @generated
	 */
	UnsignedInt createUnsignedInt();

	/**
	 * Returns a new object of class '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri</em>'.
	 * @generated
	 */
	Uri createUri();

	/**
	 * Returns a new object of class '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url</em>'.
	 * @generated
	 */
	Url createUrl();

	/**
	 * Returns a new object of class '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Context</em>'.
	 * @generated
	 */
	UsageContext createUsageContext();

	/**
	 * Returns a new object of class '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uuid</em>'.
	 * @generated
	 */
	Uuid createUuid();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fhir_PatientPackage getFhir_PatientPackage();

} //Fhir_PatientFactory
