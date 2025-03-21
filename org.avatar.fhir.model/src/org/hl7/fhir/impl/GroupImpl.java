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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupMembershipBasis;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getManagingEntity <em>Managing Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GroupImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends DomainResourceImpl implements Group {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GroupType type;

	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected GroupMembershipBasis membership;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt quantity;

	/**
	 * The cached value of the '{@link #getManagingEntity() <em>Managing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingEntity()
	 * @generated
	 * @ordered
	 */
	protected Reference managingEntity;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupCharacteristic> characteristic;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupMember> member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.GROUP__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__ACTIVE, oldActive, newActive);
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
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(GroupType newType, NotificationChain msgs) {
		GroupType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__TYPE, oldType, newType);
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
	public void setType(GroupType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMembershipBasis getMembership() {
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembership(GroupMembershipBasis newMembership, NotificationChain msgs) {
		GroupMembershipBasis oldMembership = membership;
		membership = newMembership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__MEMBERSHIP, oldMembership, newMembership);
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
	public void setMembership(GroupMembershipBasis newMembership) {
		if (newMembership != membership) {
			NotificationChain msgs = null;
			if (membership != null)
				msgs = ((InternalEObject)membership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__MEMBERSHIP, null, msgs);
			if (newMembership != null)
				msgs = ((InternalEObject)newMembership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__MEMBERSHIP, null, msgs);
			msgs = basicSetMembership(newMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__MEMBERSHIP, newMembership, newMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(UnsignedInt newQuantity, NotificationChain msgs) {
		UnsignedInt oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(UnsignedInt newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingEntity() {
		return managingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingEntity(Reference newManagingEntity, NotificationChain msgs) {
		Reference oldManagingEntity = managingEntity;
		managingEntity = newManagingEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__MANAGING_ENTITY, oldManagingEntity, newManagingEntity);
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
	public void setManagingEntity(Reference newManagingEntity) {
		if (newManagingEntity != managingEntity) {
			NotificationChain msgs = null;
			if (managingEntity != null)
				msgs = ((InternalEObject)managingEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__MANAGING_ENTITY, null, msgs);
			if (newManagingEntity != null)
				msgs = ((InternalEObject)newManagingEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.GROUP__MANAGING_ENTITY, null, msgs);
			msgs = basicSetManagingEntity(newManagingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.GROUP__MANAGING_ENTITY, newManagingEntity, newManagingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GroupCharacteristic> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<GroupCharacteristic>(GroupCharacteristic.class, this, FHIRPackage.GROUP__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GroupMember> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<GroupMember>(GroupMember.class, this, FHIRPackage.GROUP__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.GROUP__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GROUP__ACTIVE:
				return basicSetActive(null, msgs);
			case FHIRPackage.GROUP__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.GROUP__MEMBERSHIP:
				return basicSetMembership(null, msgs);
			case FHIRPackage.GROUP__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.GROUP__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.GROUP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.GROUP__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.GROUP__MANAGING_ENTITY:
				return basicSetManagingEntity(null, msgs);
			case FHIRPackage.GROUP__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FHIRPackage.GROUP__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.GROUP__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.GROUP__ACTIVE:
				return getActive();
			case FHIRPackage.GROUP__TYPE:
				return getType();
			case FHIRPackage.GROUP__MEMBERSHIP:
				return getMembership();
			case FHIRPackage.GROUP__CODE:
				return getCode();
			case FHIRPackage.GROUP__NAME:
				return getName();
			case FHIRPackage.GROUP__DESCRIPTION:
				return getDescription();
			case FHIRPackage.GROUP__QUANTITY:
				return getQuantity();
			case FHIRPackage.GROUP__MANAGING_ENTITY:
				return getManagingEntity();
			case FHIRPackage.GROUP__CHARACTERISTIC:
				return getCharacteristic();
			case FHIRPackage.GROUP__MEMBER:
				return getMember();
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
			case FHIRPackage.GROUP__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.GROUP__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.GROUP__TYPE:
				setType((GroupType)newValue);
				return;
			case FHIRPackage.GROUP__MEMBERSHIP:
				setMembership((GroupMembershipBasis)newValue);
				return;
			case FHIRPackage.GROUP__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.GROUP__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.GROUP__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.GROUP__QUANTITY:
				setQuantity((UnsignedInt)newValue);
				return;
			case FHIRPackage.GROUP__MANAGING_ENTITY:
				setManagingEntity((Reference)newValue);
				return;
			case FHIRPackage.GROUP__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends GroupCharacteristic>)newValue);
				return;
			case FHIRPackage.GROUP__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends GroupMember>)newValue);
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
			case FHIRPackage.GROUP__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.GROUP__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.GROUP__TYPE:
				setType((GroupType)null);
				return;
			case FHIRPackage.GROUP__MEMBERSHIP:
				setMembership((GroupMembershipBasis)null);
				return;
			case FHIRPackage.GROUP__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.GROUP__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.GROUP__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.GROUP__QUANTITY:
				setQuantity((UnsignedInt)null);
				return;
			case FHIRPackage.GROUP__MANAGING_ENTITY:
				setManagingEntity((Reference)null);
				return;
			case FHIRPackage.GROUP__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FHIRPackage.GROUP__MEMBER:
				getMember().clear();
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
			case FHIRPackage.GROUP__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.GROUP__ACTIVE:
				return active != null;
			case FHIRPackage.GROUP__TYPE:
				return type != null;
			case FHIRPackage.GROUP__MEMBERSHIP:
				return membership != null;
			case FHIRPackage.GROUP__CODE:
				return code != null;
			case FHIRPackage.GROUP__NAME:
				return name != null;
			case FHIRPackage.GROUP__DESCRIPTION:
				return description != null;
			case FHIRPackage.GROUP__QUANTITY:
				return quantity != null;
			case FHIRPackage.GROUP__MANAGING_ENTITY:
				return managingEntity != null;
			case FHIRPackage.GROUP__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FHIRPackage.GROUP__MEMBER:
				return member != null && !member.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
