/*
 */
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Date Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getImmunizationRecommendationDateCriterion()
 * @model extendedMetaData="name='ImmunizationRecommendation.DateCriterion' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImmunizationRecommendationDateCriterion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationRecommendationDateCriterion_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date whose meaning is specified by dateCriterion.code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationRecommendationDateCriterion_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DateTime value);

} // ImmunizationRecommendationDateCriterion
