/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Report Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestReportActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportActionImpl#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReportActionImpl extends BackboneElementImpl implements TestReportAction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TestReportOperation operation;

	/**
	 * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssert()
	 * @generated
	 * @ordered
	 */
	protected TestReportAssert assert_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTestReportAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(TestReportOperation newOperation, NotificationChain msgs) {
		TestReportOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ACTION__OPERATION, oldOperation, newOperation);
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
	public void setOperation(TestReportOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ACTION__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ACTION__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ACTION__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportAssert getAssert() {
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssert(TestReportAssert newAssert, NotificationChain msgs) {
		TestReportAssert oldAssert = assert_;
		assert_ = newAssert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ACTION__ASSERT, oldAssert, newAssert);
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
	public void setAssert(TestReportAssert newAssert) {
		if (newAssert != assert_) {
			NotificationChain msgs = null;
			if (assert_ != null)
				msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ACTION__ASSERT, null, msgs);
			if (newAssert != null)
				msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ACTION__ASSERT, null, msgs);
			msgs = basicSetAssert(newAssert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ACTION__ASSERT, newAssert, newAssert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TEST_REPORT_ACTION__OPERATION:
				return basicSetOperation(null, msgs);
			case FHIRPackage.TEST_REPORT_ACTION__ASSERT:
				return basicSetAssert(null, msgs);
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
			case FHIRPackage.TEST_REPORT_ACTION__OPERATION:
				return getOperation();
			case FHIRPackage.TEST_REPORT_ACTION__ASSERT:
				return getAssert();
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
			case FHIRPackage.TEST_REPORT_ACTION__OPERATION:
				setOperation((TestReportOperation)newValue);
				return;
			case FHIRPackage.TEST_REPORT_ACTION__ASSERT:
				setAssert((TestReportAssert)newValue);
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
			case FHIRPackage.TEST_REPORT_ACTION__OPERATION:
				setOperation((TestReportOperation)null);
				return;
			case FHIRPackage.TEST_REPORT_ACTION__ASSERT:
				setAssert((TestReportAssert)null);
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
			case FHIRPackage.TEST_REPORT_ACTION__OPERATION:
				return operation != null;
			case FHIRPackage.TEST_REPORT_ACTION__ASSERT:
				return assert_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TestReportActionImpl
