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

import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryConditionImpl extends BackboneElementImpl implements FamilyMemberHistoryCondition {
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
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getContributedToDeath() <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributedToDeath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean contributedToDeath;

	/**
	 * The cached value of the '{@link #getOnsetAge() <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetAge()
	 * @generated
	 * @ordered
	 */
	protected Age onsetAge;

	/**
	 * The cached value of the '{@link #getOnsetRange() <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range onsetRange;

	/**
	 * The cached value of the '{@link #getOnsetPeriod() <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period onsetPeriod;

	/**
	 * The cached value of the '{@link #getOnsetString() <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String onsetString;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getFamilyMemberHistoryCondition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getContributedToDeath() {
		return contributedToDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributedToDeath(org.hl7.fhir.Boolean newContributedToDeath, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldContributedToDeath = contributedToDeath;
		contributedToDeath = newContributedToDeath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, oldContributedToDeath, newContributedToDeath);
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
	public void setContributedToDeath(org.hl7.fhir.Boolean newContributedToDeath) {
		if (newContributedToDeath != contributedToDeath) {
			NotificationChain msgs = null;
			if (contributedToDeath != null)
				msgs = ((InternalEObject)contributedToDeath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, null, msgs);
			if (newContributedToDeath != null)
				msgs = ((InternalEObject)newContributedToDeath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, null, msgs);
			msgs = basicSetContributedToDeath(newContributedToDeath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, newContributedToDeath, newContributedToDeath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getOnsetAge() {
		return onsetAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetAge(Age newOnsetAge, NotificationChain msgs) {
		Age oldOnsetAge = onsetAge;
		onsetAge = newOnsetAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE, oldOnsetAge, newOnsetAge);
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
	public void setOnsetAge(Age newOnsetAge) {
		if (newOnsetAge != onsetAge) {
			NotificationChain msgs = null;
			if (onsetAge != null)
				msgs = ((InternalEObject)onsetAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE, null, msgs);
			if (newOnsetAge != null)
				msgs = ((InternalEObject)newOnsetAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE, null, msgs);
			msgs = basicSetOnsetAge(newOnsetAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE, newOnsetAge, newOnsetAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getOnsetRange() {
		return onsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetRange(Range newOnsetRange, NotificationChain msgs) {
		Range oldOnsetRange = onsetRange;
		onsetRange = newOnsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, oldOnsetRange, newOnsetRange);
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
	public void setOnsetRange(Range newOnsetRange) {
		if (newOnsetRange != onsetRange) {
			NotificationChain msgs = null;
			if (onsetRange != null)
				msgs = ((InternalEObject)onsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, null, msgs);
			if (newOnsetRange != null)
				msgs = ((InternalEObject)newOnsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, null, msgs);
			msgs = basicSetOnsetRange(newOnsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, newOnsetRange, newOnsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOnsetPeriod() {
		return onsetPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetPeriod(Period newOnsetPeriod, NotificationChain msgs) {
		Period oldOnsetPeriod = onsetPeriod;
		onsetPeriod = newOnsetPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, oldOnsetPeriod, newOnsetPeriod);
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
	public void setOnsetPeriod(Period newOnsetPeriod) {
		if (newOnsetPeriod != onsetPeriod) {
			NotificationChain msgs = null;
			if (onsetPeriod != null)
				msgs = ((InternalEObject)onsetPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, null, msgs);
			if (newOnsetPeriod != null)
				msgs = ((InternalEObject)newOnsetPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, null, msgs);
			msgs = basicSetOnsetPeriod(newOnsetPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, newOnsetPeriod, newOnsetPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOnsetString() {
		return onsetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetString(org.hl7.fhir.String newOnsetString, NotificationChain msgs) {
		org.hl7.fhir.String oldOnsetString = onsetString;
		onsetString = newOnsetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, oldOnsetString, newOnsetString);
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
	public void setOnsetString(org.hl7.fhir.String newOnsetString) {
		if (newOnsetString != onsetString) {
			NotificationChain msgs = null;
			if (onsetString != null)
				msgs = ((InternalEObject)onsetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, null, msgs);
			if (newOnsetString != null)
				msgs = ((InternalEObject)newOnsetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, null, msgs);
			msgs = basicSetOnsetString(newOnsetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, newOnsetString, newOnsetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return basicSetContributedToDeath(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE:
				return basicSetOnsetAge(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return basicSetOnsetRange(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return basicSetOnsetPeriod(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return basicSetOnsetString(null, msgs);
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return getCode();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return getOutcome();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return getContributedToDeath();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE:
				return getOnsetAge();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return getOnsetRange();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return getOnsetPeriod();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return getOnsetString();
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return getNote();
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
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE:
				setOnsetAge((Age)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				setOnsetRange((Range)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE:
				setOnsetAge((Age)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				setOnsetRange((Range)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				getNote().clear();
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
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return code != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return outcome != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return contributedToDeath != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_AGE:
				return onsetAge != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return onsetRange != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return onsetPeriod != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return onsetString != null;
			case FHIRPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryConditionImpl
