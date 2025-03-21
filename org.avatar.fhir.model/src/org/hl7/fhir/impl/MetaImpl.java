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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MetaImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaImpl extends DataTypeImpl implements Meta {
	/**
	 * The cached value of the '{@link #getVersionId() <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId()
	 * @generated
	 * @ordered
	 */
	protected Id versionId;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected Instant lastUpdated;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> profile;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> security;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMeta();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getVersionId() {
		return versionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionId(Id newVersionId, NotificationChain msgs) {
		Id oldVersionId = versionId;
		versionId = newVersionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.META__VERSION_ID, oldVersionId, newVersionId);
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
	public void setVersionId(Id newVersionId) {
		if (newVersionId != versionId) {
			NotificationChain msgs = null;
			if (versionId != null)
				msgs = ((InternalEObject)versionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__VERSION_ID, null, msgs);
			if (newVersionId != null)
				msgs = ((InternalEObject)newVersionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__VERSION_ID, null, msgs);
			msgs = basicSetVersionId(newVersionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.META__VERSION_ID, newVersionId, newVersionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdated(Instant newLastUpdated, NotificationChain msgs) {
		Instant oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.META__LAST_UPDATED, oldLastUpdated, newLastUpdated);
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
	public void setLastUpdated(Instant newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.META__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.META__SOURCE, oldSource, newSource);
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
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.META__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.META__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.META__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.META__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getTag() {
		if (tag == null) {
			tag = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.META__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.META__VERSION_ID:
				return basicSetVersionId(null, msgs);
			case FHIRPackage.META__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case FHIRPackage.META__SOURCE:
				return basicSetSource(null, msgs);
			case FHIRPackage.META__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FHIRPackage.META__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case FHIRPackage.META__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.META__VERSION_ID:
				return getVersionId();
			case FHIRPackage.META__LAST_UPDATED:
				return getLastUpdated();
			case FHIRPackage.META__SOURCE:
				return getSource();
			case FHIRPackage.META__PROFILE:
				return getProfile();
			case FHIRPackage.META__SECURITY:
				return getSecurity();
			case FHIRPackage.META__TAG:
				return getTag();
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
			case FHIRPackage.META__VERSION_ID:
				setVersionId((Id)newValue);
				return;
			case FHIRPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)newValue);
				return;
			case FHIRPackage.META__SOURCE:
				setSource((Uri)newValue);
				return;
			case FHIRPackage.META__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.META__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.META__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Coding>)newValue);
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
			case FHIRPackage.META__VERSION_ID:
				setVersionId((Id)null);
				return;
			case FHIRPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)null);
				return;
			case FHIRPackage.META__SOURCE:
				setSource((Uri)null);
				return;
			case FHIRPackage.META__PROFILE:
				getProfile().clear();
				return;
			case FHIRPackage.META__SECURITY:
				getSecurity().clear();
				return;
			case FHIRPackage.META__TAG:
				getTag().clear();
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
			case FHIRPackage.META__VERSION_ID:
				return versionId != null;
			case FHIRPackage.META__LAST_UPDATED:
				return lastUpdated != null;
			case FHIRPackage.META__SOURCE:
				return source != null;
			case FHIRPackage.META__PROFILE:
				return profile != null && !profile.isEmpty();
			case FHIRPackage.META__SECURITY:
				return security != null && !security.isEmpty();
			case FHIRPackage.META__TAG:
				return tag != null && !tag.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaImpl
