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

import org.hl7.fhir_patient.DomainResource;
import org.hl7.fhir_patient.Extension;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Narrative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.DomainResourceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.DomainResourceImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.DomainResourceImpl#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainResourceImpl extends ResourceImpl implements DomainResource {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

	/**
	 * The cached value of the '{@link #getModifierExtension() <em>Modifier Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.DOMAIN_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Narrative getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Narrative newText, NotificationChain msgs) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT, oldText, newText);
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
	public void setText(Narrative newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<Extension>(Extension.class, this, Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extension> getModifierExtension() {
		if (modifierExtension == null) {
			modifierExtension = new EObjectContainmentEList<Extension>(Extension.class, this, Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION);
		}
		return modifierExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT:
				return basicSetText(null, msgs);
			case Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return ((InternalEList<?>)getModifierExtension()).basicRemove(otherEnd, msgs);
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
			case Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT:
				return getText();
			case Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION:
				return getExtension();
			case Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return getModifierExtension();
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
			case Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)newValue);
				return;
			case Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extension>)newValue);
				return;
			case Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtension().clear();
				getModifierExtension().addAll((Collection<? extends Extension>)newValue);
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
			case Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)null);
				return;
			case Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtension().clear();
				return;
			case Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtension().clear();
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
			case Fhir_PatientPackage.DOMAIN_RESOURCE__TEXT:
				return text != null;
			case Fhir_PatientPackage.DOMAIN_RESOURCE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case Fhir_PatientPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return modifierExtension != null && !modifierExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainResourceImpl
