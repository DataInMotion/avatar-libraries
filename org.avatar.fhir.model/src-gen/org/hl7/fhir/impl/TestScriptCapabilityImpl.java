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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilityImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptCapabilityImpl extends BackboneElementImpl implements TestScriptCapability {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean validated;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Integer> origin;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer destination;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> link;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected Canonical capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTestScriptCapability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidated(org.hl7.fhir.Boolean newValidated, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED, oldValidated, newValidated);
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
	public void setValidated(org.hl7.fhir.Boolean newValidated) {
		if (newValidated != validated) {
			NotificationChain msgs = null;
			if (validated != null)
				msgs = ((InternalEObject)validated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED, null, msgs);
			if (newValidated != null)
				msgs = ((InternalEObject)newValidated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED, null, msgs);
			msgs = basicSetValidated(newValidated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED, newValidated, newValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.Integer> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<org.hl7.fhir.Integer>(org.hl7.fhir.Integer.class, this, FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(org.hl7.fhir.Integer newDestination, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(org.hl7.fhir.Integer newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Uri>(Uri.class, this, FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(Canonical newCapabilities, NotificationChain msgs) {
		Canonical oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES, oldCapabilities, newCapabilities);
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
	public void setCapabilities(Canonical newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED:
				return basicSetRequired(null, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED:
				return basicSetValidated(null, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION:
				return basicSetDestination(null, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
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
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED:
				return getRequired();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED:
				return getValidated();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION:
				return getDescription();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN:
				return getOrigin();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION:
				return getDestination();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK:
				return getLink();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES:
				return getCapabilities();
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
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED:
				setValidated((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends org.hl7.fhir.Integer>)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION:
				setDestination((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Uri>)newValue);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES:
				setCapabilities((Canonical)newValue);
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
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED:
				setValidated((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN:
				getOrigin().clear();
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION:
				setDestination((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK:
				getLink().clear();
				return;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES:
				setCapabilities((Canonical)null);
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
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__REQUIRED:
				return required != null;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__VALIDATED:
				return validated != null;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESCRIPTION:
				return description != null;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__ORIGIN:
				return origin != null && !origin.isEmpty();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__DESTINATION:
				return destination != null;
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__LINK:
				return link != null && !link.isEmpty();
			case FHIRPackage.TEST_SCRIPT_CAPABILITY__CAPABILITIES:
				return capabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptCapabilityImpl
