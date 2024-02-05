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

import org.hl7.fhir_patient.Canonical;
import org.hl7.fhir_patient.Coding;
import org.hl7.fhir_patient.DataRequirementCodeFilter;
import org.hl7.fhir_patient.Fhir_PatientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Code Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementCodeFilterImpl extends DataTypeImpl implements DataRequirementCodeFilter {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String path;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String searchParam;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical valueSet;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementCodeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.DATA_REQUIREMENT_CODE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir_patient.String newPath, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, oldPath, newPath);
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
	public void setPath(org.hl7.fhir_patient.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getSearchParam() {
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParam(org.hl7.fhir_patient.String newSearchParam, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldSearchParam = searchParam;
		searchParam = newSearchParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM, oldSearchParam, newSearchParam);
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
	public void setSearchParam(org.hl7.fhir_patient.String newSearchParam) {
		if (newSearchParam != searchParam) {
			NotificationChain msgs = null;
			if (searchParam != null)
				msgs = ((InternalEObject)searchParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM, null, msgs);
			if (newSearchParam != null)
				msgs = ((InternalEObject)newSearchParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM, null, msgs);
			msgs = basicSetSearchParam(newSearchParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM, newSearchParam, newSearchParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(Canonical newValueSet, NotificationChain msgs) {
		Canonical oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(Canonical newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return basicSetPath(null, msgs);
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM:
				return basicSetSearchParam(null, msgs);
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
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
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return getPath();
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM:
				return getSearchParam();
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET:
				return getValueSet();
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return getCode();
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
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM:
				setSearchParam((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET:
				setValueSet((Canonical)newValue);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
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
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				setPath((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM:
				setSearchParam((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET:
				setValueSet((Canonical)null);
				return;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				getCode().clear();
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
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__PATH:
				return path != null;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM:
				return searchParam != null;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__VALUE_SET:
				return valueSet != null;
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER__CODE:
				return code != null && !code.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementCodeFilterImpl
