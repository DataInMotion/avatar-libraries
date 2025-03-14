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
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.FHIRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Benefit Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBenefitBalanceImpl#getFinancial <em>Financial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitBenefitBalanceImpl extends BackboneElementImpl implements ExplanationOfBenefitBenefitBalance {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excluded;

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
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getFinancial() <em>Financial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancial()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitFinancial> financial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitBenefitBalanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getExplanationOfBenefitBenefitBalance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluded(org.hl7.fhir.Boolean newExcluded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED, oldExcluded, newExcluded);
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
	public void setExcluded(org.hl7.fhir.Boolean newExcluded) {
		if (newExcluded != excluded) {
			NotificationChain msgs = null;
			if (excluded != null)
				msgs = ((InternalEObject)excluded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED, null, msgs);
			if (newExcluded != null)
				msgs = ((InternalEObject)newExcluded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED, null, msgs);
			msgs = basicSetExcluded(newExcluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED, newExcluded, newExcluded));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(CodeableConcept newNetwork, NotificationChain msgs) {
		CodeableConcept oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(CodeableConcept newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT, oldUnit, newUnit);
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
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(CodeableConcept newTerm, NotificationChain msgs) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM, oldTerm, newTerm);
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
	public void setTerm(CodeableConcept newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitFinancial> getFinancial() {
		if (financial == null) {
			financial = new EObjectContainmentEList<ExplanationOfBenefitFinancial>(ExplanationOfBenefitFinancial.class, this, FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL);
		}
		return financial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED:
				return basicSetExcluded(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT:
				return basicSetUnit(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM:
				return basicSetTerm(null, msgs);
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL:
				return ((InternalEList<?>)getFinancial()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY:
				return getCategory();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED:
				return getExcluded();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME:
				return getName();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION:
				return getDescription();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK:
				return getNetwork();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT:
				return getUnit();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM:
				return getTerm();
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL:
				return getFinancial();
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
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK:
				setNetwork((CodeableConcept)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL:
				getFinancial().clear();
				getFinancial().addAll((Collection<? extends ExplanationOfBenefitFinancial>)newValue);
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
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK:
				setNetwork((CodeableConcept)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM:
				setTerm((CodeableConcept)null);
				return;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL:
				getFinancial().clear();
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
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__CATEGORY:
				return category != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__EXCLUDED:
				return excluded != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NAME:
				return name != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__DESCRIPTION:
				return description != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__NETWORK:
				return network != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__UNIT:
				return unit != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__TERM:
				return term != null;
			case FHIRPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE__FINANCIAL:
				return financial != null && !financial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitBenefitBalanceImpl
