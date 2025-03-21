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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareReason;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getStatusHistory <em>Status History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareImpl#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodeOfCareImpl extends DomainResourceImpl implements EpisodeOfCare {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EpisodeOfCareStatus status;

	/**
	 * The cached value of the '{@link #getStatusHistory() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareStatusHistory> statusHistory;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareReason> reason;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareDiagnosis> diagnosis;

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
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

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
	 * The cached value of the '{@link #getReferralRequest() <em>Referral Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referralRequest;

	/**
	 * The cached value of the '{@link #getCareManager() <em>Care Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareManager()
	 * @generated
	 * @ordered
	 */
	protected Reference careManager;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> careTeam;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> account;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeOfCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getEpisodeOfCare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.EPISODE_OF_CARE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EpisodeOfCareStatus newStatus, NotificationChain msgs) {
		EpisodeOfCareStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__STATUS, oldStatus, newStatus);
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
	public void setStatus(EpisodeOfCareStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpisodeOfCareStatusHistory> getStatusHistory() {
		if (statusHistory == null) {
			statusHistory = new EObjectContainmentEList<EpisodeOfCareStatusHistory>(EpisodeOfCareStatusHistory.class, this, FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY);
		}
		return statusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.EPISODE_OF_CARE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpisodeOfCareReason> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<EpisodeOfCareReason>(EpisodeOfCareReason.class, this, FHIRPackage.EPISODE_OF_CARE__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpisodeOfCareDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<EpisodeOfCareDiagnosis>(EpisodeOfCareDiagnosis.class, this, FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS);
		}
		return diagnosis;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReferralRequest() {
		if (referralRequest == null) {
			referralRequest = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST);
		}
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCareManager() {
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCareManager(Reference newCareManager, NotificationChain msgs) {
		Reference oldCareManager = careManager;
		careManager = newCareManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, newCareManager);
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
	public void setCareManager(Reference newCareManager) {
		if (newCareManager != careManager) {
			NotificationChain msgs = null;
			if (careManager != null)
				msgs = ((InternalEObject)careManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER, null, msgs);
			if (newCareManager != null)
				msgs = ((InternalEObject)newCareManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER, null, msgs);
			msgs = basicSetCareManager(newCareManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER, newCareManager, newCareManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.EPISODE_OF_CARE__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.EPISODE_OF_CARE__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.EPISODE_OF_CARE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__PATIENT:
				return basicSetPatient(null, msgs);
			case FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FHIRPackage.EPISODE_OF_CARE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return ((InternalEList<?>)getReferralRequest()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return basicSetCareManager(null, msgs);
			case FHIRPackage.EPISODE_OF_CARE__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FHIRPackage.EPISODE_OF_CARE__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.EPISODE_OF_CARE__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.EPISODE_OF_CARE__STATUS:
				return getStatus();
			case FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return getStatusHistory();
			case FHIRPackage.EPISODE_OF_CARE__TYPE:
				return getType();
			case FHIRPackage.EPISODE_OF_CARE__REASON:
				return getReason();
			case FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return getDiagnosis();
			case FHIRPackage.EPISODE_OF_CARE__PATIENT:
				return getPatient();
			case FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FHIRPackage.EPISODE_OF_CARE__PERIOD:
				return getPeriod();
			case FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return getReferralRequest();
			case FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return getCareManager();
			case FHIRPackage.EPISODE_OF_CARE__CARE_TEAM:
				return getCareTeam();
			case FHIRPackage.EPISODE_OF_CARE__ACCOUNT:
				return getAccount();
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
			case FHIRPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__STATUS:
				setStatus((EpisodeOfCareStatus)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistory().clear();
				getStatusHistory().addAll((Collection<? extends EpisodeOfCareStatusHistory>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends EpisodeOfCareReason>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends EpisodeOfCareDiagnosis>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequest().clear();
				getReferralRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Reference)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Reference>)newValue);
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
			case FHIRPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__STATUS:
				setStatus((EpisodeOfCareStatus)null);
				return;
			case FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistory().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__TYPE:
				getType().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__REASON:
				getReason().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Reference)null);
				return;
			case FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FHIRPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequest().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Reference)null);
				return;
			case FHIRPackage.EPISODE_OF_CARE__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FHIRPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccount().clear();
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
			case FHIRPackage.EPISODE_OF_CARE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__STATUS:
				return status != null;
			case FHIRPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return statusHistory != null && !statusHistory.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__REASON:
				return reason != null && !reason.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__PATIENT:
				return patient != null;
			case FHIRPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FHIRPackage.EPISODE_OF_CARE__PERIOD:
				return period != null;
			case FHIRPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return referralRequest != null && !referralRequest.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return careManager != null;
			case FHIRPackage.EPISODE_OF_CARE__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FHIRPackage.EPISODE_OF_CARE__ACCOUNT:
				return account != null && !account.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EpisodeOfCareImpl
