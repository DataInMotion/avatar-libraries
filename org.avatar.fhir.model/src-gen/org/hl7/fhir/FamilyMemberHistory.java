/*
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getSex <em>Sex</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getBornPeriod <em>Born Period</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getBornDate <em>Born Date</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getBornString <em>Born String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getAgeAge <em>Age Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getAgeString <em>Age String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getEstimatedAge <em>Estimated Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedAge <em>Deceased Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedRange <em>Deceased Range</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedDate <em>Deceased Date</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedString <em>Deceased String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistory#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory()
 * @model extendedMetaData="name='FamilyMemberHistory' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FamilyMemberHistory extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonical();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiatesUri();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the status of the record of the family history of a specific family member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FamilyHistoryStatus)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyHistoryStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FamilyHistoryStatus value);

	/**
	 * Returns the value of the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the family member's history is not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #setDataAbsentReason(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DataAbsentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataAbsentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDataAbsentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDataAbsentReason <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #getDataAbsentReason()
	 * @generated
	 */
	void setDataAbsentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who this history concerns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and possibly time) when the family member history was recorded or last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.FamilyMemberHistoryParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what participated in the activities related to the family member history and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FamilyMemberHistoryParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship this person has to the patient (father, mother, brother etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The birth sex of the family member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sex</em>' containment reference.
	 * @see #setSex(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Sex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sex' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSex();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getSex <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' containment reference.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Born Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Born Period</em>' containment reference.
	 * @see #setBornPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_BornPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bornPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBornPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getBornPeriod <em>Born Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Born Period</em>' containment reference.
	 * @see #getBornPeriod()
	 * @generated
	 */
	void setBornPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Born Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Born Date</em>' containment reference.
	 * @see #setBornDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_BornDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bornDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getBornDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getBornDate <em>Born Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Born Date</em>' containment reference.
	 * @see #getBornDate()
	 * @generated
	 */
	void setBornDate(Date value);

	/**
	 * Returns the value of the '<em><b>Born String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Born String</em>' containment reference.
	 * @see #setBornString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_BornString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bornString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBornString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getBornString <em>Born String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Born String</em>' containment reference.
	 * @see #getBornString()
	 * @generated
	 */
	void setBornString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Age Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Age</em>' containment reference.
	 * @see #setAgeAge(Age)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_AgeAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getAgeAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getAgeAge <em>Age Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Age</em>' containment reference.
	 * @see #getAgeAge()
	 * @generated
	 */
	void setAgeAge(Age value);

	/**
	 * Returns the value of the '<em><b>Age Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Range</em>' containment reference.
	 * @see #setAgeRange(Range)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_AgeRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAgeRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getAgeRange <em>Age Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Range</em>' containment reference.
	 * @see #getAgeRange()
	 * @generated
	 */
	void setAgeRange(Range value);

	/**
	 * Returns the value of the '<em><b>Age String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age String</em>' containment reference.
	 * @see #setAgeString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_AgeString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAgeString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getAgeString <em>Age String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age String</em>' containment reference.
	 * @see #getAgeString()
	 * @generated
	 */
	void setAgeString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Estimated Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the age value specified is an estimated value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Age</em>' containment reference.
	 * @see #setEstimatedAge(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_EstimatedAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='estimatedAge' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getEstimatedAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getEstimatedAge <em>Estimated Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Age</em>' containment reference.
	 * @see #getEstimatedAge()
	 * @generated
	 */
	void setEstimatedAge(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceased Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #setDeceasedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DeceasedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDeceasedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedBoolean <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #getDeceasedBoolean()
	 * @generated
	 */
	void setDeceasedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceased Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Age</em>' containment reference.
	 * @see #setDeceasedAge(Age)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DeceasedAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getDeceasedAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedAge <em>Deceased Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Age</em>' containment reference.
	 * @see #getDeceasedAge()
	 * @generated
	 */
	void setDeceasedAge(Age value);

	/**
	 * Returns the value of the '<em><b>Deceased Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Range</em>' containment reference.
	 * @see #setDeceasedRange(Range)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DeceasedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDeceasedRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedRange <em>Deceased Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Range</em>' containment reference.
	 * @see #getDeceasedRange()
	 * @generated
	 */
	void setDeceasedRange(Range value);

	/**
	 * Returns the value of the '<em><b>Deceased Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Date</em>' containment reference.
	 * @see #setDeceasedDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DeceasedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDeceasedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedDate <em>Deceased Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Date</em>' containment reference.
	 * @see #getDeceasedDate()
	 * @generated
	 */
	void setDeceasedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deceased String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased String</em>' containment reference.
	 * @see #setDeceasedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_DeceasedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeceasedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistory#getDeceasedString <em>Deceased String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased String</em>' containment reference.
	 * @see #getDeceasedString()
	 * @generated
	 */
	void setDeceasedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the family member history occurred in coded or textual form, or Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.FamilyMemberHistoryCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FamilyMemberHistoryCondition> getCondition();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.FamilyMemberHistoryProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The significant Procedures (or procedure) that the family member had. This is a repeating section to allow a system to represent more than one procedure per resource, though there is nothing stopping multiple resources - one per procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistory_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FamilyMemberHistoryProcedure> getProcedure();

} // FamilyMemberHistory
