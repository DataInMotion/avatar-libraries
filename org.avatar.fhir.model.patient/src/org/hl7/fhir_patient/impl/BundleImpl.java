/*
 */
package org.hl7.fhir_patient.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir_patient.Bundle;
import org.hl7.fhir_patient.BundleEntry;
import org.hl7.fhir_patient.BundleLink;
import org.hl7.fhir_patient.BundleType;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Identifier;
import org.hl7.fhir_patient.Instant;
import org.hl7.fhir_patient.Signature;
import org.hl7.fhir_patient.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.BundleImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends ResourceImpl implements Bundle {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BundleType type;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt total;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleLink> link;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleEntry> entry;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(BundleType newType, NotificationChain msgs) {
		BundleType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TYPE, oldType, newType);
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
	public void setType(BundleType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(Instant newTimestamp, NotificationChain msgs) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TIMESTAMP, oldTimestamp, newTimestamp);
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
	public void setTimestamp(Instant newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(UnsignedInt newTotal, NotificationChain msgs) {
		UnsignedInt oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TOTAL, oldTotal, newTotal);
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
	public void setTotal(UnsignedInt newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<BundleLink>(BundleLink.class, this, Fhir_PatientPackage.BUNDLE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<BundleEntry>(BundleEntry.class, this, Fhir_PatientPackage.BUNDLE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__SIGNATURE, oldSignature, newSignature);
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
	public void setSignature(Signature newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.BUNDLE__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.BUNDLE__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.BUNDLE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case Fhir_PatientPackage.BUNDLE__TYPE:
				return basicSetType(null, msgs);
			case Fhir_PatientPackage.BUNDLE__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case Fhir_PatientPackage.BUNDLE__TOTAL:
				return basicSetTotal(null, msgs);
			case Fhir_PatientPackage.BUNDLE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.BUNDLE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.BUNDLE__SIGNATURE:
				return basicSetSignature(null, msgs);
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
			case Fhir_PatientPackage.BUNDLE__IDENTIFIER:
				return getIdentifier();
			case Fhir_PatientPackage.BUNDLE__TYPE:
				return getType();
			case Fhir_PatientPackage.BUNDLE__TIMESTAMP:
				return getTimestamp();
			case Fhir_PatientPackage.BUNDLE__TOTAL:
				return getTotal();
			case Fhir_PatientPackage.BUNDLE__LINK:
				return getLink();
			case Fhir_PatientPackage.BUNDLE__ENTRY:
				return getEntry();
			case Fhir_PatientPackage.BUNDLE__SIGNATURE:
				return getSignature();
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
			case Fhir_PatientPackage.BUNDLE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__TYPE:
				setType((BundleType)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__TOTAL:
				setTotal((UnsignedInt)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends BundleEntry>)newValue);
				return;
			case Fhir_PatientPackage.BUNDLE__SIGNATURE:
				setSignature((Signature)newValue);
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
			case Fhir_PatientPackage.BUNDLE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case Fhir_PatientPackage.BUNDLE__TYPE:
				setType((BundleType)null);
				return;
			case Fhir_PatientPackage.BUNDLE__TIMESTAMP:
				setTimestamp((Instant)null);
				return;
			case Fhir_PatientPackage.BUNDLE__TOTAL:
				setTotal((UnsignedInt)null);
				return;
			case Fhir_PatientPackage.BUNDLE__LINK:
				getLink().clear();
				return;
			case Fhir_PatientPackage.BUNDLE__ENTRY:
				getEntry().clear();
				return;
			case Fhir_PatientPackage.BUNDLE__SIGNATURE:
				setSignature((Signature)null);
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
			case Fhir_PatientPackage.BUNDLE__IDENTIFIER:
				return identifier != null;
			case Fhir_PatientPackage.BUNDLE__TYPE:
				return type != null;
			case Fhir_PatientPackage.BUNDLE__TIMESTAMP:
				return timestamp != null;
			case Fhir_PatientPackage.BUNDLE__TOTAL:
				return total != null;
			case Fhir_PatientPackage.BUNDLE__LINK:
				return link != null && !link.isEmpty();
			case Fhir_PatientPackage.BUNDLE__ENTRY:
				return entry != null && !entry.isEmpty();
			case Fhir_PatientPackage.BUNDLE__SIGNATURE:
				return signature != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleImpl
