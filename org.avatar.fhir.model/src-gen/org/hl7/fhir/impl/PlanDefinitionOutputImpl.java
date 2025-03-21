/*
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PlanDefinitionOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionOutputImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionOutputImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionOutputImpl#getRelatedData <em>Related Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionOutputImpl extends BackboneElementImpl implements PlanDefinitionOutput {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement requirement;

	/**
	 * The cached value of the '{@link #getRelatedData() <em>Related Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedData()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String relatedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getPlanDefinitionOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(DataRequirement newRequirement, NotificationChain msgs) {
		DataRequirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT, oldRequirement, newRequirement);
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
	public void setRequirement(DataRequirement newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRelatedData() {
		return relatedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedData(org.hl7.fhir.String newRelatedData, NotificationChain msgs) {
		org.hl7.fhir.String oldRelatedData = relatedData;
		relatedData = newRelatedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA, oldRelatedData, newRelatedData);
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
	public void setRelatedData(org.hl7.fhir.String newRelatedData) {
		if (newRelatedData != relatedData) {
			NotificationChain msgs = null;
			if (relatedData != null)
				msgs = ((InternalEObject)relatedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA, null, msgs);
			if (newRelatedData != null)
				msgs = ((InternalEObject)newRelatedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA, null, msgs);
			msgs = basicSetRelatedData(newRelatedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA, newRelatedData, newRelatedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA:
				return basicSetRelatedData(null, msgs);
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
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE:
				return getTitle();
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT:
				return getRequirement();
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA:
				return getRelatedData();
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
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT:
				setRequirement((DataRequirement)newValue);
				return;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA:
				setRelatedData((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT:
				setRequirement((DataRequirement)null);
				return;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA:
				setRelatedData((org.hl7.fhir.String)null);
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
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__TITLE:
				return title != null;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__REQUIREMENT:
				return requirement != null;
			case FHIRPackage.PLAN_DEFINITION_OUTPUT__RELATED_DATA:
				return relatedData != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionOutputImpl
