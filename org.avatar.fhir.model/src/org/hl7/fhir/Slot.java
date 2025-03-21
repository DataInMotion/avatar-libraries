/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A slot of time on a schedule that may be available for booking appointments.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Slot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link org.hl7.fhir.Slot#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSlot()
 * @model extendedMetaData="name='Slot' kind='elementOnly'"
 * @generated
 */
public interface Slot extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External Ids for this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A broad categorization of the service that is to be performed during this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSlot_ServiceCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getServiceCategory();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the Schedule resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSlot_ServiceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getServiceType();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specialty of a practitioner that would be required to perform the service requested in this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Appointment Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style of appointment or patient that may be booked in the slot (not service type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSlot_AppointmentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointmentType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAppointmentType();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schedule resource that this slot defines an interval of status information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Schedule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * busy | free | busy-unavailable | busy-tentative | entered-in-error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SlotStatus)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SlotStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SlotStatus value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the slot is to begin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the slot is to conclude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_End()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Overbooked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This slot has already been overbooked, appointments are unlikely to be accepted for this time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overbooked</em>' containment reference.
	 * @see #setOverbooked(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Overbooked()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='overbooked' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOverbooked();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getOverbooked <em>Overbooked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overbooked</em>' containment reference.
	 * @see #getOverbooked()
	 * @generated
	 */
	void setOverbooked(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments on the slot to describe any extended information. Such as custom constraints on the slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSlot_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Slot#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

} // Slot
