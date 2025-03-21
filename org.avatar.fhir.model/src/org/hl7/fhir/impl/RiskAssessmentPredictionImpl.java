/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.RiskAssessmentPrediction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getProbabilityDecimal <em>Probability Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getProbabilityRange <em>Probability Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getQualitativeRisk <em>Qualitative Risk</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getWhenPeriod <em>When Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getWhenRange <em>When Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskAssessmentPredictionImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentPredictionImpl extends BackboneElementImpl implements RiskAssessmentPrediction {
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
	 * The cached value of the '{@link #getProbabilityDecimal() <em>Probability Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal probabilityDecimal;

	/**
	 * The cached value of the '{@link #getProbabilityRange() <em>Probability Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityRange()
	 * @generated
	 * @ordered
	 */
	protected Range probabilityRange;

	/**
	 * The cached value of the '{@link #getQualitativeRisk() <em>Qualitative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeRisk()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept qualitativeRisk;

	/**
	 * The cached value of the '{@link #getRelativeRisk() <em>Relative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRisk()
	 * @generated
	 * @ordered
	 */
	protected Decimal relativeRisk;

	/**
	 * The cached value of the '{@link #getWhenPeriod() <em>When Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period whenPeriod;

	/**
	 * The cached value of the '{@link #getWhenRange() <em>When Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenRange()
	 * @generated
	 * @ordered
	 */
	protected Range whenRange;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String rationale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentPredictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getRiskAssessmentPrediction();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getProbabilityDecimal() {
		return probabilityDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilityDecimal(Decimal newProbabilityDecimal, NotificationChain msgs) {
		Decimal oldProbabilityDecimal = probabilityDecimal;
		probabilityDecimal = newProbabilityDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL, oldProbabilityDecimal, newProbabilityDecimal);
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
	public void setProbabilityDecimal(Decimal newProbabilityDecimal) {
		if (newProbabilityDecimal != probabilityDecimal) {
			NotificationChain msgs = null;
			if (probabilityDecimal != null)
				msgs = ((InternalEObject)probabilityDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL, null, msgs);
			if (newProbabilityDecimal != null)
				msgs = ((InternalEObject)newProbabilityDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL, null, msgs);
			msgs = basicSetProbabilityDecimal(newProbabilityDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL, newProbabilityDecimal, newProbabilityDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getProbabilityRange() {
		return probabilityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilityRange(Range newProbabilityRange, NotificationChain msgs) {
		Range oldProbabilityRange = probabilityRange;
		probabilityRange = newProbabilityRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE, oldProbabilityRange, newProbabilityRange);
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
	public void setProbabilityRange(Range newProbabilityRange) {
		if (newProbabilityRange != probabilityRange) {
			NotificationChain msgs = null;
			if (probabilityRange != null)
				msgs = ((InternalEObject)probabilityRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE, null, msgs);
			if (newProbabilityRange != null)
				msgs = ((InternalEObject)newProbabilityRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE, null, msgs);
			msgs = basicSetProbabilityRange(newProbabilityRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE, newProbabilityRange, newProbabilityRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getQualitativeRisk() {
		return qualitativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualitativeRisk(CodeableConcept newQualitativeRisk, NotificationChain msgs) {
		CodeableConcept oldQualitativeRisk = qualitativeRisk;
		qualitativeRisk = newQualitativeRisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, oldQualitativeRisk, newQualitativeRisk);
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
	public void setQualitativeRisk(CodeableConcept newQualitativeRisk) {
		if (newQualitativeRisk != qualitativeRisk) {
			NotificationChain msgs = null;
			if (qualitativeRisk != null)
				msgs = ((InternalEObject)qualitativeRisk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, null, msgs);
			if (newQualitativeRisk != null)
				msgs = ((InternalEObject)newQualitativeRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, null, msgs);
			msgs = basicSetQualitativeRisk(newQualitativeRisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, newQualitativeRisk, newQualitativeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getRelativeRisk() {
		return relativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeRisk(Decimal newRelativeRisk, NotificationChain msgs) {
		Decimal oldRelativeRisk = relativeRisk;
		relativeRisk = newRelativeRisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, oldRelativeRisk, newRelativeRisk);
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
	public void setRelativeRisk(Decimal newRelativeRisk) {
		if (newRelativeRisk != relativeRisk) {
			NotificationChain msgs = null;
			if (relativeRisk != null)
				msgs = ((InternalEObject)relativeRisk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, null, msgs);
			if (newRelativeRisk != null)
				msgs = ((InternalEObject)newRelativeRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, null, msgs);
			msgs = basicSetRelativeRisk(newRelativeRisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, newRelativeRisk, newRelativeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getWhenPeriod() {
		return whenPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPeriod(Period newWhenPeriod, NotificationChain msgs) {
		Period oldWhenPeriod = whenPeriod;
		whenPeriod = newWhenPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD, oldWhenPeriod, newWhenPeriod);
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
	public void setWhenPeriod(Period newWhenPeriod) {
		if (newWhenPeriod != whenPeriod) {
			NotificationChain msgs = null;
			if (whenPeriod != null)
				msgs = ((InternalEObject)whenPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD, null, msgs);
			if (newWhenPeriod != null)
				msgs = ((InternalEObject)newWhenPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD, null, msgs);
			msgs = basicSetWhenPeriod(newWhenPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD, newWhenPeriod, newWhenPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getWhenRange() {
		return whenRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenRange(Range newWhenRange, NotificationChain msgs) {
		Range oldWhenRange = whenRange;
		whenRange = newWhenRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE, oldWhenRange, newWhenRange);
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
	public void setWhenRange(Range newWhenRange) {
		if (newWhenRange != whenRange) {
			NotificationChain msgs = null;
			if (whenRange != null)
				msgs = ((InternalEObject)whenRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE, null, msgs);
			if (newWhenRange != null)
				msgs = ((InternalEObject)newWhenRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE, null, msgs);
			msgs = basicSetWhenRange(newWhenRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE, newWhenRange, newWhenRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(org.hl7.fhir.String newRationale, NotificationChain msgs) {
		org.hl7.fhir.String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, oldRationale, newRationale);
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
	public void setRationale(org.hl7.fhir.String newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL:
				return basicSetProbabilityDecimal(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE:
				return basicSetProbabilityRange(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return basicSetQualitativeRisk(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return basicSetRelativeRisk(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD:
				return basicSetWhenPeriod(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE:
				return basicSetWhenRange(null, msgs);
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return basicSetRationale(null, msgs);
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
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return getOutcome();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL:
				return getProbabilityDecimal();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE:
				return getProbabilityRange();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return getQualitativeRisk();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return getRelativeRisk();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD:
				return getWhenPeriod();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE:
				return getWhenRange();
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return getRationale();
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
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL:
				setProbabilityDecimal((Decimal)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE:
				setProbabilityRange((Range)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				setQualitativeRisk((CodeableConcept)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD:
				setWhenPeriod((Period)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE:
				setWhenRange((Range)newValue);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL:
				setProbabilityDecimal((Decimal)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE:
				setProbabilityRange((Range)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				setQualitativeRisk((CodeableConcept)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD:
				setWhenPeriod((Period)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE:
				setWhenRange((Range)null);
				return;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.hl7.fhir.String)null);
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
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return outcome != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_DECIMAL:
				return probabilityDecimal != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITY_RANGE:
				return probabilityRange != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return qualitativeRisk != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return relativeRisk != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_PERIOD:
				return whenPeriod != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__WHEN_RANGE:
				return whenRange != null;
			case FHIRPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return rationale != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentPredictionImpl
