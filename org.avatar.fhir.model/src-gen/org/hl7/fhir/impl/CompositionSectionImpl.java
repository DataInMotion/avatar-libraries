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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionSectionImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionSectionImpl extends BackboneElementImpl implements CompositionSection {
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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

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
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> entry;

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
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionSection> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCompositionSection();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMPOSITION_SECTION__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Reference newFocus, NotificationChain msgs) {
		Reference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__FOCUS, oldFocus, newFocus);
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
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__FOCUS, newFocus, newFocus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__TEXT, newText, newText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__ORDERED_BY, oldOrderedBy, newOrderedBy);
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
				msgs = ((InternalEObject)orderedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__ORDERED_BY, null, msgs);
			if (newOrderedBy != null)
				msgs = ((InternalEObject)newOrderedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__ORDERED_BY, null, msgs);
			msgs = basicSetOrderedBy(newOrderedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__ORDERED_BY, newOrderedBy, newOrderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.COMPOSITION_SECTION__ENTRY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON, oldEmptyReason, newEmptyReason);
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
				msgs = ((InternalEObject)emptyReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON, null, msgs);
			if (newEmptyReason != null)
				msgs = ((InternalEObject)newEmptyReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON, null, msgs);
			msgs = basicSetEmptyReason(newEmptyReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON, newEmptyReason, newEmptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositionSection> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<CompositionSection>(CompositionSection.class, this, FHIRPackage.COMPOSITION_SECTION__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.COMPOSITION_SECTION__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMPOSITION_SECTION__FOCUS:
				return basicSetFocus(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__TEXT:
				return basicSetText(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__ORDERED_BY:
				return basicSetOrderedBy(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return basicSetEmptyReason(null, msgs);
			case FHIRPackage.COMPOSITION_SECTION__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.COMPOSITION_SECTION__TITLE:
				return getTitle();
			case FHIRPackage.COMPOSITION_SECTION__CODE:
				return getCode();
			case FHIRPackage.COMPOSITION_SECTION__AUTHOR:
				return getAuthor();
			case FHIRPackage.COMPOSITION_SECTION__FOCUS:
				return getFocus();
			case FHIRPackage.COMPOSITION_SECTION__TEXT:
				return getText();
			case FHIRPackage.COMPOSITION_SECTION__ORDERED_BY:
				return getOrderedBy();
			case FHIRPackage.COMPOSITION_SECTION__ENTRY:
				return getEntry();
			case FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return getEmptyReason();
			case FHIRPackage.COMPOSITION_SECTION__SECTION:
				return getSection();
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
			case FHIRPackage.COMPOSITION_SECTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__FOCUS:
				setFocus((Reference)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
				return;
			case FHIRPackage.COMPOSITION_SECTION__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends CompositionSection>)newValue);
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
			case FHIRPackage.COMPOSITION_SECTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__AUTHOR:
				getAuthor().clear();
				return;
			case FHIRPackage.COMPOSITION_SECTION__FOCUS:
				setFocus((Reference)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__ENTRY:
				getEntry().clear();
				return;
			case FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
				return;
			case FHIRPackage.COMPOSITION_SECTION__SECTION:
				getSection().clear();
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
			case FHIRPackage.COMPOSITION_SECTION__TITLE:
				return title != null;
			case FHIRPackage.COMPOSITION_SECTION__CODE:
				return code != null;
			case FHIRPackage.COMPOSITION_SECTION__AUTHOR:
				return author != null && !author.isEmpty();
			case FHIRPackage.COMPOSITION_SECTION__FOCUS:
				return focus != null;
			case FHIRPackage.COMPOSITION_SECTION__TEXT:
				return text != null;
			case FHIRPackage.COMPOSITION_SECTION__ORDERED_BY:
				return orderedBy != null;
			case FHIRPackage.COMPOSITION_SECTION__ENTRY:
				return entry != null && !entry.isEmpty();
			case FHIRPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return emptyReason != null;
			case FHIRPackage.COMPOSITION_SECTION__SECTION:
				return section != null && !section.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionSectionImpl
