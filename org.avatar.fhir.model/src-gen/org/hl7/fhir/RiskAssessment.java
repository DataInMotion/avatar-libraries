/*
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getPrediction <em>Prediction</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getMitigation <em>Mitigation</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskAssessment#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment()
 * @model extendedMetaData="name='RiskAssessment' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RiskAssessment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier assigned to the risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the request that is fulfilled by this risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference.
	 * @see #setBasedOn(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBasedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getBasedOn <em>Based On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' containment reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(Reference value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a resource that this risk assessment is part of, such as a Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the RiskAssessment, using the same statuses as an Observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ObservationStatus)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ObservationStatus value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The algorithm, process or mechanism used to evaluate the risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the risk assessment performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group the risk assessment applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter where the assessment was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider, patient, related person, or software application that performed the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason the risk assessment was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Basis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasis();

	/**
	 * Returns the value of the '<em><b>Prediction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RiskAssessmentPrediction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the expected outcome for the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prediction</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Prediction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prediction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RiskAssessmentPrediction> getPrediction();

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the steps that might be taken to reduce the identified risk(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference.
	 * @see #setMitigation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Mitigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMitigation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskAssessment#getMitigation <em>Mitigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation</em>' containment reference.
	 * @see #getMitigation()
	 * @generated
	 */
	void setMitigation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional comments about the risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRiskAssessment_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // RiskAssessment
