/*
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Address;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RelatedPersonImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedPersonImpl extends DomainResourceImpl implements RelatedPerson {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> relationship;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> name;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeGender gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photo;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedPersonCommunication> communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getRelatedPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.RELATED_PERSON__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.RELATED_PERSON__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<HumanName>(HumanName.class, this, FHIRPackage.RELATED_PERSON__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FHIRPackage.RELATED_PERSON__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeGender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(AdministrativeGender newGender, NotificationChain msgs) {
		AdministrativeGender oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(AdministrativeGender newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthDate(Date newBirthDate, NotificationChain msgs) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__BIRTH_DATE, oldBirthDate, newBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FHIRPackage.RELATED_PERSON__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Attachment>(Attachment.class, this, FHIRPackage.RELATED_PERSON__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RELATED_PERSON__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RELATED_PERSON__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedPersonCommunication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<RelatedPersonCommunication>(RelatedPersonCommunication.class, this, FHIRPackage.RELATED_PERSON__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.RELATED_PERSON__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__ACTIVE:
				return basicSetActive(null, msgs);
			case FHIRPackage.RELATED_PERSON__PATIENT:
				return basicSetPatient(null, msgs);
			case FHIRPackage.RELATED_PERSON__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__GENDER:
				return basicSetGender(null, msgs);
			case FHIRPackage.RELATED_PERSON__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case FHIRPackage.RELATED_PERSON__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__PHOTO:
				return ((InternalEList<?>)getPhoto()).basicRemove(otherEnd, msgs);
			case FHIRPackage.RELATED_PERSON__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.RELATED_PERSON__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.RELATED_PERSON__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.RELATED_PERSON__ACTIVE:
				return getActive();
			case FHIRPackage.RELATED_PERSON__PATIENT:
				return getPatient();
			case FHIRPackage.RELATED_PERSON__RELATIONSHIP:
				return getRelationship();
			case FHIRPackage.RELATED_PERSON__NAME:
				return getName();
			case FHIRPackage.RELATED_PERSON__TELECOM:
				return getTelecom();
			case FHIRPackage.RELATED_PERSON__GENDER:
				return getGender();
			case FHIRPackage.RELATED_PERSON__BIRTH_DATE:
				return getBirthDate();
			case FHIRPackage.RELATED_PERSON__ADDRESS:
				return getAddress();
			case FHIRPackage.RELATED_PERSON__PHOTO:
				return getPhoto();
			case FHIRPackage.RELATED_PERSON__PERIOD:
				return getPeriod();
			case FHIRPackage.RELATED_PERSON__COMMUNICATION:
				return getCommunication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.RELATED_PERSON__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__NAME:
				getName().clear();
				getName().addAll((Collection<? extends HumanName>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__GENDER:
				setGender((AdministrativeGender)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.RELATED_PERSON__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends RelatedPersonCommunication>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FHIRPackage.RELATED_PERSON__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.RELATED_PERSON__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.RELATED_PERSON__PATIENT:
				setPatient((Reference)null);
				return;
			case FHIRPackage.RELATED_PERSON__RELATIONSHIP:
				getRelationship().clear();
				return;
			case FHIRPackage.RELATED_PERSON__NAME:
				getName().clear();
				return;
			case FHIRPackage.RELATED_PERSON__TELECOM:
				getTelecom().clear();
				return;
			case FHIRPackage.RELATED_PERSON__GENDER:
				setGender((AdministrativeGender)null);
				return;
			case FHIRPackage.RELATED_PERSON__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FHIRPackage.RELATED_PERSON__ADDRESS:
				getAddress().clear();
				return;
			case FHIRPackage.RELATED_PERSON__PHOTO:
				getPhoto().clear();
				return;
			case FHIRPackage.RELATED_PERSON__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.RELATED_PERSON__COMMUNICATION:
				getCommunication().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FHIRPackage.RELATED_PERSON__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.RELATED_PERSON__ACTIVE:
				return active != null;
			case FHIRPackage.RELATED_PERSON__PATIENT:
				return patient != null;
			case FHIRPackage.RELATED_PERSON__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case FHIRPackage.RELATED_PERSON__NAME:
				return name != null && !name.isEmpty();
			case FHIRPackage.RELATED_PERSON__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FHIRPackage.RELATED_PERSON__GENDER:
				return gender != null;
			case FHIRPackage.RELATED_PERSON__BIRTH_DATE:
				return birthDate != null;
			case FHIRPackage.RELATED_PERSON__ADDRESS:
				return address != null && !address.isEmpty();
			case FHIRPackage.RELATED_PERSON__PHOTO:
				return photo != null && !photo.isEmpty();
			case FHIRPackage.RELATED_PERSON__PERIOD:
				return period != null;
			case FHIRPackage.RELATED_PERSON__COMMUNICATION:
				return communication != null && !communication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelatedPersonImpl
