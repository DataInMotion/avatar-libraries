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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListImpl#getEmptyReason <em>Empty Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends DomainResourceImpl implements List {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ListStatus status;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ListMode mode;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ListEntry> entry;

	/**
	 * The cached value of the '{@link #getEmptyReason() <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept emptyReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.LIST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ListStatus newStatus, NotificationChain msgs) {
		ListStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__STATUS, oldStatus, newStatus);
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
	public void setStatus(ListStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(ListMode newMode, NotificationChain msgs) {
		ListMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__MODE, oldMode, newMode);
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
	public void setMode(ListMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__MODE, newMode, newMode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.LIST__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__SOURCE, oldSource, newSource);
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
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrderedBy() {
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedBy(CodeableConcept newOrderedBy, NotificationChain msgs) {
		CodeableConcept oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__ORDERED_BY, oldOrderedBy, newOrderedBy);
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
	public void setOrderedBy(CodeableConcept newOrderedBy) {
		if (newOrderedBy != orderedBy) {
			NotificationChain msgs = null;
			if (orderedBy != null)
				msgs = ((InternalEObject)orderedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__ORDERED_BY, null, msgs);
			if (newOrderedBy != null)
				msgs = ((InternalEObject)newOrderedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__ORDERED_BY, null, msgs);
			msgs = basicSetOrderedBy(newOrderedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__ORDERED_BY, newOrderedBy, newOrderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.LIST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<ListEntry>(ListEntry.class, this, FHIRPackage.LIST__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getEmptyReason() {
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyReason(CodeableConcept newEmptyReason, NotificationChain msgs) {
		CodeableConcept oldEmptyReason = emptyReason;
		emptyReason = newEmptyReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__EMPTY_REASON, oldEmptyReason, newEmptyReason);
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
	public void setEmptyReason(CodeableConcept newEmptyReason) {
		if (newEmptyReason != emptyReason) {
			NotificationChain msgs = null;
			if (emptyReason != null)
				msgs = ((InternalEObject)emptyReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__EMPTY_REASON, null, msgs);
			if (newEmptyReason != null)
				msgs = ((InternalEObject)newEmptyReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.LIST__EMPTY_REASON, null, msgs);
			msgs = basicSetEmptyReason(newEmptyReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.LIST__EMPTY_REASON, newEmptyReason, newEmptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.LIST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.LIST__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.LIST__MODE:
				return basicSetMode(null, msgs);
			case FHIRPackage.LIST__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.LIST__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.LIST__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FHIRPackage.LIST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.LIST__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.LIST__SOURCE:
				return basicSetSource(null, msgs);
			case FHIRPackage.LIST__ORDERED_BY:
				return basicSetOrderedBy(null, msgs);
			case FHIRPackage.LIST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.LIST__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case FHIRPackage.LIST__EMPTY_REASON:
				return basicSetEmptyReason(null, msgs);
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
			case FHIRPackage.LIST__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.LIST__STATUS:
				return getStatus();
			case FHIRPackage.LIST__MODE:
				return getMode();
			case FHIRPackage.LIST__TITLE:
				return getTitle();
			case FHIRPackage.LIST__CODE:
				return getCode();
			case FHIRPackage.LIST__SUBJECT:
				return getSubject();
			case FHIRPackage.LIST__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.LIST__DATE:
				return getDate();
			case FHIRPackage.LIST__SOURCE:
				return getSource();
			case FHIRPackage.LIST__ORDERED_BY:
				return getOrderedBy();
			case FHIRPackage.LIST__NOTE:
				return getNote();
			case FHIRPackage.LIST__ENTRY:
				return getEntry();
			case FHIRPackage.LIST__EMPTY_REASON:
				return getEmptyReason();
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
			case FHIRPackage.LIST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.LIST__STATUS:
				setStatus((ListStatus)newValue);
				return;
			case FHIRPackage.LIST__MODE:
				setMode((ListMode)newValue);
				return;
			case FHIRPackage.LIST__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.LIST__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.LIST__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.LIST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.LIST__DATE:
				setDate((DateTime)newValue);
				return;
			case FHIRPackage.LIST__SOURCE:
				setSource((Reference)newValue);
				return;
			case FHIRPackage.LIST__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case FHIRPackage.LIST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.LIST__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends ListEntry>)newValue);
				return;
			case FHIRPackage.LIST__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
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
			case FHIRPackage.LIST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.LIST__STATUS:
				setStatus((ListStatus)null);
				return;
			case FHIRPackage.LIST__MODE:
				setMode((ListMode)null);
				return;
			case FHIRPackage.LIST__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.LIST__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.LIST__SUBJECT:
				getSubject().clear();
				return;
			case FHIRPackage.LIST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.LIST__DATE:
				setDate((DateTime)null);
				return;
			case FHIRPackage.LIST__SOURCE:
				setSource((Reference)null);
				return;
			case FHIRPackage.LIST__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case FHIRPackage.LIST__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.LIST__ENTRY:
				getEntry().clear();
				return;
			case FHIRPackage.LIST__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
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
			case FHIRPackage.LIST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.LIST__STATUS:
				return status != null;
			case FHIRPackage.LIST__MODE:
				return mode != null;
			case FHIRPackage.LIST__TITLE:
				return title != null;
			case FHIRPackage.LIST__CODE:
				return code != null;
			case FHIRPackage.LIST__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FHIRPackage.LIST__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.LIST__DATE:
				return date != null;
			case FHIRPackage.LIST__SOURCE:
				return source != null;
			case FHIRPackage.LIST__ORDERED_BY:
				return orderedBy != null;
			case FHIRPackage.LIST__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.LIST__ENTRY:
				return entry != null && !entry.isEmpty();
			case FHIRPackage.LIST__EMPTY_REASON:
				return emptyReason != null;
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
