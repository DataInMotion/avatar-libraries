/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.FamilyMemberHistoryCondition#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition()
 * @model extendedMetaData="name='FamilyMemberHistory.Condition' kind='elementOnly'"
 * @generated
 */
public interface FamilyMemberHistoryCondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what happened following the condition.  If the condition resulted in death, deceased date is captured on the relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contributed To Death</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This condition contributed to the cause of death of the related person. If contributedToDeath is not populated, then it is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #setContributedToDeath(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_ContributedToDeath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributedToDeath' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getContributedToDeath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getContributedToDeath <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #getContributedToDeath()
	 * @generated
	 */
	void setContributedToDeath(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Onset Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Age</em>' containment reference.
	 * @see #setOnsetAge(Age)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_OnsetAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOnsetAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetAge <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Age</em>' containment reference.
	 * @see #getOnsetAge()
	 * @generated
	 */
	void setOnsetAge(Age value);

	/**
	 * Returns the value of the '<em><b>Onset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Range</em>' containment reference.
	 * @see #setOnsetRange(Range)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_OnsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOnsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetRange <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Range</em>' containment reference.
	 * @see #getOnsetRange()
	 * @generated
	 */
	void setOnsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Onset Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Period</em>' containment reference.
	 * @see #setOnsetPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_OnsetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOnsetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetPeriod <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Period</em>' containment reference.
	 * @see #getOnsetPeriod()
	 * @generated
	 */
	void setOnsetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Onset String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset String</em>' containment reference.
	 * @see #setOnsetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_OnsetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOnsetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FamilyMemberHistoryCondition#getOnsetString <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset String</em>' containment reference.
	 * @see #getOnsetString()
	 * @generated
	 */
	void setOnsetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An area where general notes can be placed about this specific condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getFamilyMemberHistoryCondition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // FamilyMemberHistoryCondition
