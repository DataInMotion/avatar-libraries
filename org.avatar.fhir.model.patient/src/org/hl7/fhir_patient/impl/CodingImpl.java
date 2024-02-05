/*
 */
package org.hl7.fhir_patient.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir_patient.Code;
import org.hl7.fhir_patient.Coding;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.CodingImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.CodingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.CodingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.CodingImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.CodingImpl#getUserSelected <em>User Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingImpl extends DataTypeImpl implements Coding {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String version;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String display;

	/**
	 * The cached value of the '{@link #getUserSelected() <em>User Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSelected()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.Boolean userSelected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.CODING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__SYSTEM, oldSystem, newSystem);
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
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir_patient.String newVersion, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.fhir_patient.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir_patient.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.hl7.fhir_patient.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.Boolean getUserSelected() {
		return userSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserSelected(org.hl7.fhir_patient.Boolean newUserSelected, NotificationChain msgs) {
		org.hl7.fhir_patient.Boolean oldUserSelected = userSelected;
		userSelected = newUserSelected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__USER_SELECTED, oldUserSelected, newUserSelected);
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
	public void setUserSelected(org.hl7.fhir_patient.Boolean newUserSelected) {
		if (newUserSelected != userSelected) {
			NotificationChain msgs = null;
			if (userSelected != null)
				msgs = ((InternalEObject)userSelected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__USER_SELECTED, null, msgs);
			if (newUserSelected != null)
				msgs = ((InternalEObject)newUserSelected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.CODING__USER_SELECTED, null, msgs);
			msgs = basicSetUserSelected(newUserSelected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.CODING__USER_SELECTED, newUserSelected, newUserSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.CODING__SYSTEM:
				return basicSetSystem(null, msgs);
			case Fhir_PatientPackage.CODING__VERSION:
				return basicSetVersion(null, msgs);
			case Fhir_PatientPackage.CODING__CODE:
				return basicSetCode(null, msgs);
			case Fhir_PatientPackage.CODING__DISPLAY:
				return basicSetDisplay(null, msgs);
			case Fhir_PatientPackage.CODING__USER_SELECTED:
				return basicSetUserSelected(null, msgs);
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
			case Fhir_PatientPackage.CODING__SYSTEM:
				return getSystem();
			case Fhir_PatientPackage.CODING__VERSION:
				return getVersion();
			case Fhir_PatientPackage.CODING__CODE:
				return getCode();
			case Fhir_PatientPackage.CODING__DISPLAY:
				return getDisplay();
			case Fhir_PatientPackage.CODING__USER_SELECTED:
				return getUserSelected();
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
			case Fhir_PatientPackage.CODING__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case Fhir_PatientPackage.CODING__VERSION:
				setVersion((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.CODING__CODE:
				setCode((Code)newValue);
				return;
			case Fhir_PatientPackage.CODING__DISPLAY:
				setDisplay((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.CODING__USER_SELECTED:
				setUserSelected((org.hl7.fhir_patient.Boolean)newValue);
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
			case Fhir_PatientPackage.CODING__SYSTEM:
				setSystem((Uri)null);
				return;
			case Fhir_PatientPackage.CODING__VERSION:
				setVersion((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.CODING__CODE:
				setCode((Code)null);
				return;
			case Fhir_PatientPackage.CODING__DISPLAY:
				setDisplay((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.CODING__USER_SELECTED:
				setUserSelected((org.hl7.fhir_patient.Boolean)null);
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
			case Fhir_PatientPackage.CODING__SYSTEM:
				return system != null;
			case Fhir_PatientPackage.CODING__VERSION:
				return version != null;
			case Fhir_PatientPackage.CODING__CODE:
				return code != null;
			case Fhir_PatientPackage.CODING__DISPLAY:
				return display != null;
			case Fhir_PatientPackage.CODING__USER_SELECTED:
				return userSelected != null;
		}
		return super.eIsSet(featureID);
	}

} //CodingImpl
