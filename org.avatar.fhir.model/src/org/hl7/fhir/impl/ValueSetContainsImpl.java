/**
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

import org.hl7.fhir.Code;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetProperty1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetContainsImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetContainsImpl extends BackboneElementImpl implements ValueSetContains {
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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean inactive;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

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
	protected org.hl7.fhir.String display;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetDesignation> designation;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetProperty1> property;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetContains> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetContainsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getValueSetContains();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__SYSTEM, oldSystem, newSystem);
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
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(org.hl7.fhir.Boolean newAbstract, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT, oldAbstract, newAbstract);
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
	public void setAbstract(org.hl7.fhir.Boolean newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(org.hl7.fhir.Boolean newInactive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__INACTIVE, oldInactive, newInactive);
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
	public void setInactive(org.hl7.fhir.Boolean newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_CONTAINS__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_CONTAINS__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetDesignation> getDesignation() {
		if (designation == null) {
			designation = new EObjectContainmentEList<ValueSetDesignation>(ValueSetDesignation.class, this, FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetProperty1> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ValueSetProperty1>(ValueSetProperty1.class, this, FHIRPackage.VALUE_SET_CONTAINS__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetContains>(ValueSetContains.class, this, FHIRPackage.VALUE_SET_CONTAINS__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.VALUE_SET_CONTAINS__SYSTEM:
				return basicSetSystem(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__INACTIVE:
				return basicSetInactive(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__VERSION:
				return basicSetVersion(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION:
				return ((InternalEList<?>)getDesignation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_CONTAINS__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.VALUE_SET_CONTAINS__SYSTEM:
				return getSystem();
			case FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT:
				return getAbstract();
			case FHIRPackage.VALUE_SET_CONTAINS__INACTIVE:
				return getInactive();
			case FHIRPackage.VALUE_SET_CONTAINS__VERSION:
				return getVersion();
			case FHIRPackage.VALUE_SET_CONTAINS__CODE:
				return getCode();
			case FHIRPackage.VALUE_SET_CONTAINS__DISPLAY:
				return getDisplay();
			case FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION:
				return getDesignation();
			case FHIRPackage.VALUE_SET_CONTAINS__PROPERTY:
				return getProperty();
			case FHIRPackage.VALUE_SET_CONTAINS__CONTAINS:
				return getContains();
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
			case FHIRPackage.VALUE_SET_CONTAINS__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__CODE:
				setCode((Code)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends ValueSetDesignation>)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ValueSetProperty1>)newValue);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ValueSetContains>)newValue);
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
			case FHIRPackage.VALUE_SET_CONTAINS__SYSTEM:
				setSystem((Uri)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__INACTIVE:
				setInactive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__CODE:
				setCode((Code)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION:
				getDesignation().clear();
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__PROPERTY:
				getProperty().clear();
				return;
			case FHIRPackage.VALUE_SET_CONTAINS__CONTAINS:
				getContains().clear();
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
			case FHIRPackage.VALUE_SET_CONTAINS__SYSTEM:
				return system != null;
			case FHIRPackage.VALUE_SET_CONTAINS__ABSTRACT:
				return abstract_ != null;
			case FHIRPackage.VALUE_SET_CONTAINS__INACTIVE:
				return inactive != null;
			case FHIRPackage.VALUE_SET_CONTAINS__VERSION:
				return version != null;
			case FHIRPackage.VALUE_SET_CONTAINS__CODE:
				return code != null;
			case FHIRPackage.VALUE_SET_CONTAINS__DISPLAY:
				return display != null;
			case FHIRPackage.VALUE_SET_CONTAINS__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case FHIRPackage.VALUE_SET_CONTAINS__PROPERTY:
				return property != null && !property.isEmpty();
			case FHIRPackage.VALUE_SET_CONTAINS__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetContainsImpl
