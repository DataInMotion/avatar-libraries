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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoiceParticipant;
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MonetaryComponent;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getCancelledReason <em>Cancelled Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getPeriodDate <em>Period Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getPeriodPeriod <em>Period Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getTotalPriceComponent <em>Total Price Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getTotalNet <em>Total Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getTotalGross <em>Total Gross</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends DomainResourceImpl implements Invoice {
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
	protected InvoiceStatus status;

	/**
	 * The cached value of the '{@link #getCancelledReason() <em>Cancelled Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelledReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cancelledReason;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Reference recipient;

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
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected DateTime creation;

	/**
	 * The cached value of the '{@link #getPeriodDate() <em>Period Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodDate()
	 * @generated
	 * @ordered
	 */
	protected Date periodDate;

	/**
	 * The cached value of the '{@link #getPeriodPeriod() <em>Period Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period periodPeriod;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceParticipant> participant;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected Reference issuer;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Reference account;

	/**
	 * The cached value of the '{@link #getLineItem() <em>Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItem()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceLineItem> lineItem;

	/**
	 * The cached value of the '{@link #getTotalPriceComponent() <em>Total Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPriceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MonetaryComponent> totalPriceComponent;

	/**
	 * The cached value of the '{@link #getTotalNet() <em>Total Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalNet()
	 * @generated
	 * @ordered
	 */
	protected Money totalNet;

	/**
	 * The cached value of the '{@link #getTotalGross() <em>Total Gross</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGross()
	 * @generated
	 * @ordered
	 */
	protected Money totalGross;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected Markdown paymentTerms;

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
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getInvoice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.INVOICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(InvoiceStatus newStatus, NotificationChain msgs) {
		InvoiceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__STATUS, oldStatus, newStatus);
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
	public void setStatus(InvoiceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCancelledReason() {
		return cancelledReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelledReason(org.hl7.fhir.String newCancelledReason, NotificationChain msgs) {
		org.hl7.fhir.String oldCancelledReason = cancelledReason;
		cancelledReason = newCancelledReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__CANCELLED_REASON, oldCancelledReason, newCancelledReason);
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
	public void setCancelledReason(org.hl7.fhir.String newCancelledReason) {
		if (newCancelledReason != cancelledReason) {
			NotificationChain msgs = null;
			if (cancelledReason != null)
				msgs = ((InternalEObject)cancelledReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__CANCELLED_REASON, null, msgs);
			if (newCancelledReason != null)
				msgs = ((InternalEObject)newCancelledReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__CANCELLED_REASON, null, msgs);
			msgs = basicSetCancelledReason(newCancelledReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__CANCELLED_REASON, newCancelledReason, newCancelledReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(Reference newRecipient, NotificationChain msgs) {
		Reference oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__RECIPIENT, oldRecipient, newRecipient);
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
	public void setRecipient(Reference newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__RECIPIENT, newRecipient, newRecipient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreation(DateTime newCreation, NotificationChain msgs) {
		DateTime oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__CREATION, oldCreation, newCreation);
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
	public void setCreation(DateTime newCreation) {
		if (newCreation != creation) {
			NotificationChain msgs = null;
			if (creation != null)
				msgs = ((InternalEObject)creation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__CREATION, null, msgs);
			if (newCreation != null)
				msgs = ((InternalEObject)newCreation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__CREATION, null, msgs);
			msgs = basicSetCreation(newCreation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__CREATION, newCreation, newCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPeriodDate() {
		return periodDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodDate(Date newPeriodDate, NotificationChain msgs) {
		Date oldPeriodDate = periodDate;
		periodDate = newPeriodDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PERIOD_DATE, oldPeriodDate, newPeriodDate);
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
	public void setPeriodDate(Date newPeriodDate) {
		if (newPeriodDate != periodDate) {
			NotificationChain msgs = null;
			if (periodDate != null)
				msgs = ((InternalEObject)periodDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PERIOD_DATE, null, msgs);
			if (newPeriodDate != null)
				msgs = ((InternalEObject)newPeriodDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PERIOD_DATE, null, msgs);
			msgs = basicSetPeriodDate(newPeriodDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PERIOD_DATE, newPeriodDate, newPeriodDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriodPeriod() {
		return periodPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodPeriod(Period newPeriodPeriod, NotificationChain msgs) {
		Period oldPeriodPeriod = periodPeriod;
		periodPeriod = newPeriodPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PERIOD_PERIOD, oldPeriodPeriod, newPeriodPeriod);
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
	public void setPeriodPeriod(Period newPeriodPeriod) {
		if (newPeriodPeriod != periodPeriod) {
			NotificationChain msgs = null;
			if (periodPeriod != null)
				msgs = ((InternalEObject)periodPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PERIOD_PERIOD, null, msgs);
			if (newPeriodPeriod != null)
				msgs = ((InternalEObject)newPeriodPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PERIOD_PERIOD, null, msgs);
			msgs = basicSetPeriodPeriod(newPeriodPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PERIOD_PERIOD, newPeriodPeriod, newPeriodPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<InvoiceParticipant>(InvoiceParticipant.class, this, FHIRPackage.INVOICE__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(Reference newIssuer, NotificationChain msgs) {
		Reference oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__ISSUER, oldIssuer, newIssuer);
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
	public void setIssuer(Reference newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Reference newAccount, NotificationChain msgs) {
		Reference oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__ACCOUNT, oldAccount, newAccount);
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
	public void setAccount(Reference newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject)account).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__ACCOUNT, null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__ACCOUNT, null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceLineItem> getLineItem() {
		if (lineItem == null) {
			lineItem = new EObjectContainmentEList<InvoiceLineItem>(InvoiceLineItem.class, this, FHIRPackage.INVOICE__LINE_ITEM);
		}
		return lineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonetaryComponent> getTotalPriceComponent() {
		if (totalPriceComponent == null) {
			totalPriceComponent = new EObjectContainmentEList<MonetaryComponent>(MonetaryComponent.class, this, FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT);
		}
		return totalPriceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTotalNet() {
		return totalNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalNet(Money newTotalNet, NotificationChain msgs) {
		Money oldTotalNet = totalNet;
		totalNet = newTotalNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TOTAL_NET, oldTotalNet, newTotalNet);
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
	public void setTotalNet(Money newTotalNet) {
		if (newTotalNet != totalNet) {
			NotificationChain msgs = null;
			if (totalNet != null)
				msgs = ((InternalEObject)totalNet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TOTAL_NET, null, msgs);
			if (newTotalNet != null)
				msgs = ((InternalEObject)newTotalNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TOTAL_NET, null, msgs);
			msgs = basicSetTotalNet(newTotalNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TOTAL_NET, newTotalNet, newTotalNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTotalGross() {
		return totalGross;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalGross(Money newTotalGross, NotificationChain msgs) {
		Money oldTotalGross = totalGross;
		totalGross = newTotalGross;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TOTAL_GROSS, oldTotalGross, newTotalGross);
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
	public void setTotalGross(Money newTotalGross) {
		if (newTotalGross != totalGross) {
			NotificationChain msgs = null;
			if (totalGross != null)
				msgs = ((InternalEObject)totalGross).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TOTAL_GROSS, null, msgs);
			if (newTotalGross != null)
				msgs = ((InternalEObject)newTotalGross).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__TOTAL_GROSS, null, msgs);
			msgs = basicSetTotalGross(newTotalGross, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__TOTAL_GROSS, newTotalGross, newTotalGross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentTerms(Markdown newPaymentTerms, NotificationChain msgs) {
		Markdown oldPaymentTerms = paymentTerms;
		paymentTerms = newPaymentTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PAYMENT_TERMS, oldPaymentTerms, newPaymentTerms);
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
	public void setPaymentTerms(Markdown newPaymentTerms) {
		if (newPaymentTerms != paymentTerms) {
			NotificationChain msgs = null;
			if (paymentTerms != null)
				msgs = ((InternalEObject)paymentTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PAYMENT_TERMS, null, msgs);
			if (newPaymentTerms != null)
				msgs = ((InternalEObject)newPaymentTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.INVOICE__PAYMENT_TERMS, null, msgs);
			msgs = basicSetPaymentTerms(newPaymentTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.INVOICE__PAYMENT_TERMS, newPaymentTerms, newPaymentTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.INVOICE__NOTE);
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
			case FHIRPackage.INVOICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVOICE__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.INVOICE__CANCELLED_REASON:
				return basicSetCancelledReason(null, msgs);
			case FHIRPackage.INVOICE__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.INVOICE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FHIRPackage.INVOICE__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case FHIRPackage.INVOICE__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.INVOICE__CREATION:
				return basicSetCreation(null, msgs);
			case FHIRPackage.INVOICE__PERIOD_DATE:
				return basicSetPeriodDate(null, msgs);
			case FHIRPackage.INVOICE__PERIOD_PERIOD:
				return basicSetPeriodPeriod(null, msgs);
			case FHIRPackage.INVOICE__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVOICE__ISSUER:
				return basicSetIssuer(null, msgs);
			case FHIRPackage.INVOICE__ACCOUNT:
				return basicSetAccount(null, msgs);
			case FHIRPackage.INVOICE__LINE_ITEM:
				return ((InternalEList<?>)getLineItem()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return ((InternalEList<?>)getTotalPriceComponent()).basicRemove(otherEnd, msgs);
			case FHIRPackage.INVOICE__TOTAL_NET:
				return basicSetTotalNet(null, msgs);
			case FHIRPackage.INVOICE__TOTAL_GROSS:
				return basicSetTotalGross(null, msgs);
			case FHIRPackage.INVOICE__PAYMENT_TERMS:
				return basicSetPaymentTerms(null, msgs);
			case FHIRPackage.INVOICE__NOTE:
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
			case FHIRPackage.INVOICE__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.INVOICE__STATUS:
				return getStatus();
			case FHIRPackage.INVOICE__CANCELLED_REASON:
				return getCancelledReason();
			case FHIRPackage.INVOICE__TYPE:
				return getType();
			case FHIRPackage.INVOICE__SUBJECT:
				return getSubject();
			case FHIRPackage.INVOICE__RECIPIENT:
				return getRecipient();
			case FHIRPackage.INVOICE__DATE:
				return getDate();
			case FHIRPackage.INVOICE__CREATION:
				return getCreation();
			case FHIRPackage.INVOICE__PERIOD_DATE:
				return getPeriodDate();
			case FHIRPackage.INVOICE__PERIOD_PERIOD:
				return getPeriodPeriod();
			case FHIRPackage.INVOICE__PARTICIPANT:
				return getParticipant();
			case FHIRPackage.INVOICE__ISSUER:
				return getIssuer();
			case FHIRPackage.INVOICE__ACCOUNT:
				return getAccount();
			case FHIRPackage.INVOICE__LINE_ITEM:
				return getLineItem();
			case FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return getTotalPriceComponent();
			case FHIRPackage.INVOICE__TOTAL_NET:
				return getTotalNet();
			case FHIRPackage.INVOICE__TOTAL_GROSS:
				return getTotalGross();
			case FHIRPackage.INVOICE__PAYMENT_TERMS:
				return getPaymentTerms();
			case FHIRPackage.INVOICE__NOTE:
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
			case FHIRPackage.INVOICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.INVOICE__STATUS:
				setStatus((InvoiceStatus)newValue);
				return;
			case FHIRPackage.INVOICE__CANCELLED_REASON:
				setCancelledReason((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.INVOICE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.INVOICE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FHIRPackage.INVOICE__RECIPIENT:
				setRecipient((Reference)newValue);
				return;
			case FHIRPackage.INVOICE__DATE:
				setDate((DateTime)newValue);
				return;
			case FHIRPackage.INVOICE__CREATION:
				setCreation((DateTime)newValue);
				return;
			case FHIRPackage.INVOICE__PERIOD_DATE:
				setPeriodDate((Date)newValue);
				return;
			case FHIRPackage.INVOICE__PERIOD_PERIOD:
				setPeriodPeriod((Period)newValue);
				return;
			case FHIRPackage.INVOICE__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends InvoiceParticipant>)newValue);
				return;
			case FHIRPackage.INVOICE__ISSUER:
				setIssuer((Reference)newValue);
				return;
			case FHIRPackage.INVOICE__ACCOUNT:
				setAccount((Reference)newValue);
				return;
			case FHIRPackage.INVOICE__LINE_ITEM:
				getLineItem().clear();
				getLineItem().addAll((Collection<? extends InvoiceLineItem>)newValue);
				return;
			case FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				getTotalPriceComponent().clear();
				getTotalPriceComponent().addAll((Collection<? extends MonetaryComponent>)newValue);
				return;
			case FHIRPackage.INVOICE__TOTAL_NET:
				setTotalNet((Money)newValue);
				return;
			case FHIRPackage.INVOICE__TOTAL_GROSS:
				setTotalGross((Money)newValue);
				return;
			case FHIRPackage.INVOICE__PAYMENT_TERMS:
				setPaymentTerms((Markdown)newValue);
				return;
			case FHIRPackage.INVOICE__NOTE:
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
			case FHIRPackage.INVOICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.INVOICE__STATUS:
				setStatus((InvoiceStatus)null);
				return;
			case FHIRPackage.INVOICE__CANCELLED_REASON:
				setCancelledReason((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.INVOICE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.INVOICE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FHIRPackage.INVOICE__RECIPIENT:
				setRecipient((Reference)null);
				return;
			case FHIRPackage.INVOICE__DATE:
				setDate((DateTime)null);
				return;
			case FHIRPackage.INVOICE__CREATION:
				setCreation((DateTime)null);
				return;
			case FHIRPackage.INVOICE__PERIOD_DATE:
				setPeriodDate((Date)null);
				return;
			case FHIRPackage.INVOICE__PERIOD_PERIOD:
				setPeriodPeriod((Period)null);
				return;
			case FHIRPackage.INVOICE__PARTICIPANT:
				getParticipant().clear();
				return;
			case FHIRPackage.INVOICE__ISSUER:
				setIssuer((Reference)null);
				return;
			case FHIRPackage.INVOICE__ACCOUNT:
				setAccount((Reference)null);
				return;
			case FHIRPackage.INVOICE__LINE_ITEM:
				getLineItem().clear();
				return;
			case FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				getTotalPriceComponent().clear();
				return;
			case FHIRPackage.INVOICE__TOTAL_NET:
				setTotalNet((Money)null);
				return;
			case FHIRPackage.INVOICE__TOTAL_GROSS:
				setTotalGross((Money)null);
				return;
			case FHIRPackage.INVOICE__PAYMENT_TERMS:
				setPaymentTerms((Markdown)null);
				return;
			case FHIRPackage.INVOICE__NOTE:
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
			case FHIRPackage.INVOICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.INVOICE__STATUS:
				return status != null;
			case FHIRPackage.INVOICE__CANCELLED_REASON:
				return cancelledReason != null;
			case FHIRPackage.INVOICE__TYPE:
				return type != null;
			case FHIRPackage.INVOICE__SUBJECT:
				return subject != null;
			case FHIRPackage.INVOICE__RECIPIENT:
				return recipient != null;
			case FHIRPackage.INVOICE__DATE:
				return date != null;
			case FHIRPackage.INVOICE__CREATION:
				return creation != null;
			case FHIRPackage.INVOICE__PERIOD_DATE:
				return periodDate != null;
			case FHIRPackage.INVOICE__PERIOD_PERIOD:
				return periodPeriod != null;
			case FHIRPackage.INVOICE__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FHIRPackage.INVOICE__ISSUER:
				return issuer != null;
			case FHIRPackage.INVOICE__ACCOUNT:
				return account != null;
			case FHIRPackage.INVOICE__LINE_ITEM:
				return lineItem != null && !lineItem.isEmpty();
			case FHIRPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return totalPriceComponent != null && !totalPriceComponent.isEmpty();
			case FHIRPackage.INVOICE__TOTAL_NET:
				return totalNet != null;
			case FHIRPackage.INVOICE__TOTAL_GROSS:
				return totalGross != null;
			case FHIRPackage.INVOICE__PAYMENT_TERMS:
				return paymentTerms != null;
			case FHIRPackage.INVOICE__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvoiceImpl
