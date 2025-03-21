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

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getTypeMode <em>Type Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapGroupImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupImpl extends BackboneElementImpl implements StructureMapGroup {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Id name;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Id extends_;

	/**
	 * The cached value of the '{@link #getTypeMode() <em>Type Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMode()
	 * @generated
	 * @ordered
	 */
	protected StructureMapGroupTypeMode typeMode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapInput> input;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapRule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getStructureMapGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Id newName, NotificationChain msgs) {
		Id oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__NAME, oldName, newName);
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
	public void setName(Id newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Id newExtends, NotificationChain msgs) {
		Id oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS, oldExtends, newExtends);
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
	public void setExtends(Id newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupTypeMode getTypeMode() {
		return typeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMode(StructureMapGroupTypeMode newTypeMode, NotificationChain msgs) {
		StructureMapGroupTypeMode oldTypeMode = typeMode;
		typeMode = newTypeMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, oldTypeMode, newTypeMode);
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
	public void setTypeMode(StructureMapGroupTypeMode newTypeMode) {
		if (newTypeMode != typeMode) {
			NotificationChain msgs = null;
			if (typeMode != null)
				msgs = ((InternalEObject)typeMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, null, msgs);
			if (newTypeMode != null)
				msgs = ((InternalEObject)newTypeMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, null, msgs);
			msgs = basicSetTypeMode(newTypeMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, newTypeMode, newTypeMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructureMapInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<StructureMapInput>(StructureMapInput.class, this, FHIRPackage.STRUCTURE_MAP_GROUP__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructureMapRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<StructureMapRule>(StructureMapRule.class, this, FHIRPackage.STRUCTURE_MAP_GROUP__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.STRUCTURE_MAP_GROUP__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return basicSetExtends(null, msgs);
			case FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return basicSetTypeMode(null, msgs);
			case FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FHIRPackage.STRUCTURE_MAP_GROUP__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FHIRPackage.STRUCTURE_MAP_GROUP__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.STRUCTURE_MAP_GROUP__NAME:
				return getName();
			case FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return getExtends();
			case FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return getTypeMode();
			case FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return getDocumentation();
			case FHIRPackage.STRUCTURE_MAP_GROUP__INPUT:
				return getInput();
			case FHIRPackage.STRUCTURE_MAP_GROUP__RULE:
				return getRule();
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
			case FHIRPackage.STRUCTURE_MAP_GROUP__NAME:
				setName((Id)newValue);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				setExtends((Id)newValue);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				setTypeMode((StructureMapGroupTypeMode)newValue);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends StructureMapInput>)newValue);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends StructureMapRule>)newValue);
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
			case FHIRPackage.STRUCTURE_MAP_GROUP__NAME:
				setName((Id)null);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				setExtends((Id)null);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				setTypeMode((StructureMapGroupTypeMode)null);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__INPUT:
				getInput().clear();
				return;
			case FHIRPackage.STRUCTURE_MAP_GROUP__RULE:
				getRule().clear();
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
			case FHIRPackage.STRUCTURE_MAP_GROUP__NAME:
				return name != null;
			case FHIRPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return extends_ != null;
			case FHIRPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return typeMode != null;
			case FHIRPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return documentation != null;
			case FHIRPackage.STRUCTURE_MAP_GROUP__INPUT:
				return input != null && !input.isEmpty();
			case FHIRPackage.STRUCTURE_MAP_GROUP__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupImpl
