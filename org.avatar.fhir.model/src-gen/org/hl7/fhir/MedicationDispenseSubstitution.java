/*
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getWasSubstituted <em>Was Substituted</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationDispenseSubstitution#getResponsibleParty <em>Responsible Party</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicationDispenseSubstitution()
 * @model extendedMetaData="name='MedicationDispense.Substitution' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicationDispenseSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Was Substituted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the dispenser dispensed a different drug or product from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Was Substituted</em>' containment reference.
	 * @see #setWasSubstituted(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationDispenseSubstitution_WasSubstituted()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wasSubstituted' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getWasSubstituted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispenseSubstitution#getWasSubstituted <em>Was Substituted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Substituted</em>' containment reference.
	 * @see #getWasSubstituted()
	 * @generated
	 */
	void setWasSubstituted(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code signifying whether a different drug was dispensed from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationDispenseSubstitution_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispenseSubstitution#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason for the substitution (or lack of substitution) from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicationDispenseSubstitution_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or organization that has primary responsibility for the substitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference.
	 * @see #setResponsibleParty(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationDispenseSubstitution_ResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsibleParty' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponsibleParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationDispenseSubstitution#getResponsibleParty <em>Responsible Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Party</em>' containment reference.
	 * @see #getResponsibleParty()
	 * @generated
	 */
	void setResponsibleParty(Reference value);

} // MedicationDispenseSubstitution
