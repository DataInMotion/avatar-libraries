/*
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ValueSetSubProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Sub Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetSubPropertyImpl#getValueDecimal <em>Value Decimal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetSubPropertyImpl extends BackboneElementImpl implements ValueSetSubProperty {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code valueCode;

	/**
	 * The cached value of the '{@link #getValueCoding() <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding valueCoding;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueDecimal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetSubPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getValueSetSubProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getValueCode() {
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCode(Code newValueCode, NotificationChain msgs) {
		Code oldValueCode = valueCode;
		valueCode = newValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE, oldValueCode, newValueCode);
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
	public void setValueCode(Code newValueCode) {
		if (newValueCode != valueCode) {
			NotificationChain msgs = null;
			if (valueCode != null)
				msgs = ((InternalEObject)valueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE, null, msgs);
			if (newValueCode != null)
				msgs = ((InternalEObject)newValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE, null, msgs);
			msgs = basicSetValueCode(newValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE, newValueCode, newValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getValueCoding() {
		return valueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCoding(Coding newValueCoding, NotificationChain msgs) {
		Coding oldValueCoding = valueCoding;
		valueCoding = newValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING, oldValueCoding, newValueCoding);
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
	public void setValueCoding(Coding newValueCoding) {
		if (newValueCoding != valueCoding) {
			NotificationChain msgs = null;
			if (valueCoding != null)
				msgs = ((InternalEObject)valueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING, null, msgs);
			if (newValueCoding != null)
				msgs = ((InternalEObject)newValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING, null, msgs);
			msgs = basicSetValueCoding(newValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING, newValueCoding, newValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING, oldValueString, newValueString);
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
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER, oldValueInteger, newValueInteger);
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
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
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
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getValueDecimal() {
		return valueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDecimal(Decimal newValueDecimal, NotificationChain msgs) {
		Decimal oldValueDecimal = valueDecimal;
		valueDecimal = newValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL, oldValueDecimal, newValueDecimal);
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
	public void setValueDecimal(Decimal newValueDecimal) {
		if (newValueDecimal != valueDecimal) {
			NotificationChain msgs = null;
			if (valueDecimal != null)
				msgs = ((InternalEObject)valueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL, null, msgs);
			if (newValueDecimal != null)
				msgs = ((InternalEObject)newValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL, null, msgs);
			msgs = basicSetValueDecimal(newValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL, newValueDecimal, newValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE:
				return basicSetValueCode(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING:
				return basicSetValueCoding(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL:
				return basicSetValueDecimal(null, msgs);
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
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE:
				return getCode();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE:
				return getValueCode();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING:
				return getValueCoding();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING:
				return getValueString();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER:
				return getValueInteger();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN:
				return getValueBoolean();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME:
				return getValueDateTime();
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL:
				return getValueDecimal();
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
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE:
				setCode((Code)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE:
				setValueCode((Code)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING:
				setValueCoding((Coding)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL:
				setValueDecimal((Decimal)newValue);
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
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE:
				setCode((Code)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE:
				setValueCode((Code)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING:
				setValueCoding((Coding)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL:
				setValueDecimal((Decimal)null);
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
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__CODE:
				return code != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODE:
				return valueCode != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_CODING:
				return valueCoding != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_STRING:
				return valueString != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_INTEGER:
				return valueInteger != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FHIRPackage.VALUE_SET_SUB_PROPERTY__VALUE_DECIMAL:
				return valueDecimal != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetSubPropertyImpl
