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

import org.hl7.fhir_patient.ContactDetail;
import org.hl7.fhir_patient.ContactPoint;
import org.hl7.fhir_patient.Fhir_PatientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.ContactDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.ContactDetailImpl#getTelecom <em>Telecom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactDetailImpl extends DataTypeImpl implements ContactDetail {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String name;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.CONTACT_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir_patient.String newName, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CONTACT_DETAIL__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir_patient.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CONTACT_DETAIL__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CONTACT_DETAIL__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CONTACT_DETAIL__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, Fhir_PatientPackage.CONTACT_DETAIL__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.CONTACT_DETAIL__NAME:
				return basicSetName(null, msgs);
			case Fhir_PatientPackage.CONTACT_DETAIL__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
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
			case Fhir_PatientPackage.CONTACT_DETAIL__NAME:
				return getName();
			case Fhir_PatientPackage.CONTACT_DETAIL__TELECOM:
				return getTelecom();
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
			case Fhir_PatientPackage.CONTACT_DETAIL__NAME:
				setName((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.CONTACT_DETAIL__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
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
			case Fhir_PatientPackage.CONTACT_DETAIL__NAME:
				setName((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.CONTACT_DETAIL__TELECOM:
				getTelecom().clear();
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
			case Fhir_PatientPackage.CONTACT_DETAIL__NAME:
				return name != null;
			case Fhir_PatientPackage.CONTACT_DETAIL__TELECOM:
				return telecom != null && !telecom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactDetailImpl
