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

import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.HumanName;
import org.hl7.fhir_patient.NameUse;
import org.hl7.fhir_patient.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.hl7.fhir_patient.impl.HumanNameImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumanNameImpl extends DataTypeImpl implements HumanName {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected NameUse use;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String text;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir_patient.String family;

	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir_patient.String> given;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir_patient.String> prefix;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir_patient.String> suffix;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fhir_PatientPackage.Literals.HUMAN_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameUse getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(NameUse newUse, NotificationChain msgs) {
		NameUse oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__USE, oldUse, newUse);
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
	public void setUse(NameUse newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir_patient.String newText, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__TEXT, oldText, newText);
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
	public void setText(org.hl7.fhir_patient.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir_patient.String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily(org.hl7.fhir_patient.String newFamily, NotificationChain msgs) {
		org.hl7.fhir_patient.String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__FAMILY, oldFamily, newFamily);
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
	public void setFamily(org.hl7.fhir_patient.String newFamily) {
		if (newFamily != family) {
			NotificationChain msgs = null;
			if (family != null)
				msgs = ((InternalEObject)family).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__FAMILY, null, msgs);
			if (newFamily != null)
				msgs = ((InternalEObject)newFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__FAMILY, null, msgs);
			msgs = basicSetFamily(newFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__FAMILY, newFamily, newFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir_patient.String> getGiven() {
		if (given == null) {
			given = new EObjectContainmentEList<org.hl7.fhir_patient.String>(org.hl7.fhir_patient.String.class, this, Fhir_PatientPackage.HUMAN_NAME__GIVEN);
		}
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir_patient.String> getPrefix() {
		if (prefix == null) {
			prefix = new EObjectContainmentEList<org.hl7.fhir_patient.String>(org.hl7.fhir_patient.String.class, this, Fhir_PatientPackage.HUMAN_NAME__PREFIX);
		}
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir_patient.String> getSuffix() {
		if (suffix == null) {
			suffix = new EObjectContainmentEList<org.hl7.fhir_patient.String>(org.hl7.fhir_patient.String.class, this, Fhir_PatientPackage.HUMAN_NAME__SUFFIX);
		}
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fhir_PatientPackage.HUMAN_NAME__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fhir_PatientPackage.HUMAN_NAME__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fhir_PatientPackage.HUMAN_NAME__USE:
				return basicSetUse(null, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__TEXT:
				return basicSetText(null, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__FAMILY:
				return basicSetFamily(null, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__GIVEN:
				return ((InternalEList<?>)getGiven()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__PREFIX:
				return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__SUFFIX:
				return ((InternalEList<?>)getSuffix()).basicRemove(otherEnd, msgs);
			case Fhir_PatientPackage.HUMAN_NAME__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case Fhir_PatientPackage.HUMAN_NAME__USE:
				return getUse();
			case Fhir_PatientPackage.HUMAN_NAME__TEXT:
				return getText();
			case Fhir_PatientPackage.HUMAN_NAME__FAMILY:
				return getFamily();
			case Fhir_PatientPackage.HUMAN_NAME__GIVEN:
				return getGiven();
			case Fhir_PatientPackage.HUMAN_NAME__PREFIX:
				return getPrefix();
			case Fhir_PatientPackage.HUMAN_NAME__SUFFIX:
				return getSuffix();
			case Fhir_PatientPackage.HUMAN_NAME__PERIOD:
				return getPeriod();
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
			case Fhir_PatientPackage.HUMAN_NAME__USE:
				setUse((NameUse)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__TEXT:
				setText((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__FAMILY:
				setFamily((org.hl7.fhir_patient.String)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__GIVEN:
				getGiven().clear();
				getGiven().addAll((Collection<? extends org.hl7.fhir_patient.String>)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__PREFIX:
				getPrefix().clear();
				getPrefix().addAll((Collection<? extends org.hl7.fhir_patient.String>)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__SUFFIX:
				getSuffix().clear();
				getSuffix().addAll((Collection<? extends org.hl7.fhir_patient.String>)newValue);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__PERIOD:
				setPeriod((Period)newValue);
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
			case Fhir_PatientPackage.HUMAN_NAME__USE:
				setUse((NameUse)null);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__TEXT:
				setText((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__FAMILY:
				setFamily((org.hl7.fhir_patient.String)null);
				return;
			case Fhir_PatientPackage.HUMAN_NAME__GIVEN:
				getGiven().clear();
				return;
			case Fhir_PatientPackage.HUMAN_NAME__PREFIX:
				getPrefix().clear();
				return;
			case Fhir_PatientPackage.HUMAN_NAME__SUFFIX:
				getSuffix().clear();
				return;
			case Fhir_PatientPackage.HUMAN_NAME__PERIOD:
				setPeriod((Period)null);
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
			case Fhir_PatientPackage.HUMAN_NAME__USE:
				return use != null;
			case Fhir_PatientPackage.HUMAN_NAME__TEXT:
				return text != null;
			case Fhir_PatientPackage.HUMAN_NAME__FAMILY:
				return family != null;
			case Fhir_PatientPackage.HUMAN_NAME__GIVEN:
				return given != null && !given.isEmpty();
			case Fhir_PatientPackage.HUMAN_NAME__PREFIX:
				return prefix != null && !prefix.isEmpty();
			case Fhir_PatientPackage.HUMAN_NAME__SUFFIX:
				return suffix != null && !suffix.isEmpty();
			case Fhir_PatientPackage.HUMAN_NAME__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //HumanNameImpl
