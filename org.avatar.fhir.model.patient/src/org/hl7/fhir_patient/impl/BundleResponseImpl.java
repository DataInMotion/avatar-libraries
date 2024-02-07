/*
 */
package org.hl7.fhir_patient.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir_patient.BundleResponse;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Instant;
import org.hl7.fhir_patient.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleResponseImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleResponseImpl#getEtag <em>Etag</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleResponseImpl#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleResponseImpl extends BackboneElementImpl implements BundleResponse {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String status;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Uri location;

	/**
	 * The cached value of the '{@link #getEtag() <em>Etag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtag()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String etag;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Instant lastModified;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.BUNDLE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(org.hl7.fhir_patient.String newStatus, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS, oldStatus, newStatus);
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
	public void setStatus(org.hl7.fhir_patient.String newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Uri newLocation, NotificationChain msgs) {
		Uri oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Uri newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getEtag() {
		return etag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtag(org.hl7.fhir_patient.String newEtag, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldEtag = etag;
		etag = newEtag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG, oldEtag, newEtag);
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
	public void setEtag(org.hl7.fhir_patient.String newEtag) {
		if (newEtag != etag) {
			NotificationChain msgs = null;
			if (etag != null)
				msgs = ((InternalEObject)etag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG, null, msgs);
			if (newEtag != null)
				msgs = ((InternalEObject)newEtag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG, null, msgs);
			msgs = basicSetEtag(newEtag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG, newEtag, newEtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastModified(Instant newLastModified, NotificationChain msgs) {
		Instant oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED, oldLastModified, newLastModified);
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
	public void setLastModified(Instant newLastModified) {
		if (newLastModified != lastModified) {
			NotificationChain msgs = null;
			if (lastModified != null)
				msgs = ((InternalEObject)lastModified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED, null, msgs);
			if (newLastModified != null)
				msgs = ((InternalEObject)newLastModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED, null, msgs);
			msgs = basicSetLastModified(newLastModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED, newLastModified, newLastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION:
				return basicSetLocation(null, msgs);
			case Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG:
				return basicSetEtag(null, msgs);
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED:
				return basicSetLastModified(null, msgs);
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
			case Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS:
				return getStatus();
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION:
				return getLocation();
			case Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG:
				return getEtag();
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED:
				return getLastModified();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS:
				setStatus((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION:
				setLocation((Uri)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG:
				setEtag((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED:
				setLastModified((Instant)newValue);
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
			case Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS:
				setStatus((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION:
				setLocation((Uri)null);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG:
				setEtag((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED:
				setLastModified((Instant)null);
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
			case Fhir_PatientPackage.BUNDLE_RESPONSE__STATUS:
				return status != null;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LOCATION:
				return location != null;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__ETAG:
				return etag != null;
			case Fhir_PatientPackage.BUNDLE_RESPONSE__LAST_MODIFIED:
				return lastModified != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleResponseImpl
