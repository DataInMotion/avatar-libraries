/**
 */
package org.hl7.fhir_patient.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.fhir_patient.Address;
import org.hl7.fhir_patient.AddressType;
import org.hl7.fhir_patient.AddressTypeEnum;
import org.hl7.fhir_patient.AddressUse;
import org.hl7.fhir_patient.AddressUseEnum;
import org.hl7.fhir_patient.AdministrativeGender;
import org.hl7.fhir_patient.AdministrativeGenderEnum;
import org.hl7.fhir_patient.Age;
import org.hl7.fhir_patient.Annotation;
import org.hl7.fhir_patient.Attachment;
import org.hl7.fhir_patient.Availability;
import org.hl7.fhir_patient.AvailabilityAvailableTime;
import org.hl7.fhir_patient.AvailabilityNotAvailableTime;
import org.hl7.fhir_patient.BackboneElement;
import org.hl7.fhir_patient.BackboneType;
import org.hl7.fhir_patient.Base;
import org.hl7.fhir_patient.Base64Binary;
import org.hl7.fhir_patient.Binary;
import org.hl7.fhir_patient.Bundle;
import org.hl7.fhir_patient.BundleEntry;
import org.hl7.fhir_patient.BundleLink;
import org.hl7.fhir_patient.BundleRequest;
import org.hl7.fhir_patient.BundleResponse;
import org.hl7.fhir_patient.BundleSearch;
import org.hl7.fhir_patient.BundleType;
import org.hl7.fhir_patient.BundleTypeEnum;
import org.hl7.fhir_patient.Canonical;
import org.hl7.fhir_patient.Code;
import org.hl7.fhir_patient.CodeableConcept;
import org.hl7.fhir_patient.CodeableReference;
import org.hl7.fhir_patient.Coding;
import org.hl7.fhir_patient.ContactDetail;
import org.hl7.fhir_patient.ContactPoint;
import org.hl7.fhir_patient.ContactPointSystem;
import org.hl7.fhir_patient.ContactPointSystemEnum;
import org.hl7.fhir_patient.ContactPointUse;
import org.hl7.fhir_patient.ContactPointUseEnum;
import org.hl7.fhir_patient.Count;
import org.hl7.fhir_patient.DataRequirement;
import org.hl7.fhir_patient.DataRequirementCodeFilter;
import org.hl7.fhir_patient.DataRequirementDateFilter;
import org.hl7.fhir_patient.DataRequirementSort;
import org.hl7.fhir_patient.DataRequirementValueFilter;
import org.hl7.fhir_patient.DataType;
import org.hl7.fhir_patient.Date;
import org.hl7.fhir_patient.DateTime;
import org.hl7.fhir_patient.Decimal;
import org.hl7.fhir_patient.Distance;
import org.hl7.fhir_patient.DomainResource;
import org.hl7.fhir_patient.Dosage;
import org.hl7.fhir_patient.DosageDoseAndRate;
import org.hl7.fhir_patient.Duration;
import org.hl7.fhir_patient.Element;
import org.hl7.fhir_patient.EventTiming;
import org.hl7.fhir_patient.EventTimingEnum;
import org.hl7.fhir_patient.Expression;
import org.hl7.fhir_patient.ExtendedContactDetail;
import org.hl7.fhir_patient.Extension;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.HTTPVerb;
import org.hl7.fhir_patient.HTTPVerbEnum;
import org.hl7.fhir_patient.HumanName;
import org.hl7.fhir_patient.Id;
import org.hl7.fhir_patient.Identifier;
import org.hl7.fhir_patient.IdentifierUse;
import org.hl7.fhir_patient.IdentifierUseEnum;
import org.hl7.fhir_patient.Instant;
import org.hl7.fhir_patient.Integer64;
import org.hl7.fhir_patient.LinkRelationTypes;
import org.hl7.fhir_patient.LinkRelationTypesEnum;
import org.hl7.fhir_patient.LinkType;
import org.hl7.fhir_patient.LinkTypeEnum;
import org.hl7.fhir_patient.Markdown;
import org.hl7.fhir_patient.Meta;
import org.hl7.fhir_patient.Money;
import org.hl7.fhir_patient.NameUse;
import org.hl7.fhir_patient.NameUseEnum;
import org.hl7.fhir_patient.Narrative;
import org.hl7.fhir_patient.NarrativeStatus;
import org.hl7.fhir_patient.NarrativeStatusEnum;
import org.hl7.fhir_patient.Oid;
import org.hl7.fhir_patient.ParameterDefinition;
import org.hl7.fhir_patient.Patient;
import org.hl7.fhir_patient.PatientCommunication;
import org.hl7.fhir_patient.PatientContact;
import org.hl7.fhir_patient.PatientLink;
import org.hl7.fhir_patient.Period;
import org.hl7.fhir_patient.PositiveInt;
import org.hl7.fhir_patient.Quantity;
import org.hl7.fhir_patient.QuantityComparator;
import org.hl7.fhir_patient.QuantityComparatorEnum;
import org.hl7.fhir_patient.Range;
import org.hl7.fhir_patient.Ratio;
import org.hl7.fhir_patient.RatioRange;
import org.hl7.fhir_patient.Reference;
import org.hl7.fhir_patient.RelatedArtifact;
import org.hl7.fhir_patient.RelatedArtifactType;
import org.hl7.fhir_patient.RelatedArtifactTypeEnum;
import org.hl7.fhir_patient.Resource;
import org.hl7.fhir_patient.SampledData;
import org.hl7.fhir_patient.SampledDataDataType;
import org.hl7.fhir_patient.SearchEntryMode;
import org.hl7.fhir_patient.SearchEntryModeEnum;
import org.hl7.fhir_patient.Signature;
import org.hl7.fhir_patient.SortDirection;
import org.hl7.fhir_patient.SortDirectionEnum;
import org.hl7.fhir_patient.Time;
import org.hl7.fhir_patient.Timing;
import org.hl7.fhir_patient.TimingRepeat;
import org.hl7.fhir_patient.TriggerDefinition;
import org.hl7.fhir_patient.TriggerType;
import org.hl7.fhir_patient.TriggerTypeEnum;
import org.hl7.fhir_patient.UnitsOfTime;
import org.hl7.fhir_patient.UnitsOfTimeEnum;
import org.hl7.fhir_patient.UnsignedInt;
import org.hl7.fhir_patient.Uri;
import org.hl7.fhir_patient.Url;
import org.hl7.fhir_patient.UsageContext;
import org.hl7.fhir_patient.Uuid;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir_patient.Fhir_PatientPackage
 * @generated
 */
public class Fhir_PatientValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Fhir_PatientValidator INSTANCE = new Fhir_PatientValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.fhir_patient";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fhir_PatientValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Fhir_PatientPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Fhir_PatientPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case Fhir_PatientPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case Fhir_PatientPackage.ADDRESS_USE:
				return validateAddressUse((AddressUse)value, diagnostics, context);
			case Fhir_PatientPackage.ADMINISTRATIVE_GENDER:
				return validateAdministrativeGender((AdministrativeGender)value, diagnostics, context);
			case Fhir_PatientPackage.AGE:
				return validateAge((Age)value, diagnostics, context);
			case Fhir_PatientPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case Fhir_PatientPackage.ATTACHMENT:
				return validateAttachment((Attachment)value, diagnostics, context);
			case Fhir_PatientPackage.AVAILABILITY:
				return validateAvailability((Availability)value, diagnostics, context);
			case Fhir_PatientPackage.AVAILABILITY_AVAILABLE_TIME:
				return validateAvailabilityAvailableTime((AvailabilityAvailableTime)value, diagnostics, context);
			case Fhir_PatientPackage.AVAILABILITY_NOT_AVAILABLE_TIME:
				return validateAvailabilityNotAvailableTime((AvailabilityNotAvailableTime)value, diagnostics, context);
			case Fhir_PatientPackage.BACKBONE_ELEMENT:
				return validateBackboneElement((BackboneElement)value, diagnostics, context);
			case Fhir_PatientPackage.BACKBONE_TYPE:
				return validateBackboneType((BackboneType)value, diagnostics, context);
			case Fhir_PatientPackage.BASE:
				return validateBase((Base)value, diagnostics, context);
			case Fhir_PatientPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case Fhir_PatientPackage.BINARY:
				return validateBinary((Binary)value, diagnostics, context);
			case Fhir_PatientPackage.BOOLEAN:
				return validateBoolean((org.hl7.fhir_patient.Boolean)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_ENTRY:
				return validateBundleEntry((BundleEntry)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_LINK:
				return validateBundleLink((BundleLink)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_REQUEST:
				return validateBundleRequest((BundleRequest)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_RESPONSE:
				return validateBundleResponse((BundleResponse)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_SEARCH:
				return validateBundleSearch((BundleSearch)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_TYPE:
				return validateBundleType((BundleType)value, diagnostics, context);
			case Fhir_PatientPackage.CANONICAL:
				return validateCanonical((Canonical)value, diagnostics, context);
			case Fhir_PatientPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case Fhir_PatientPackage.CODEABLE_CONCEPT:
				return validateCodeableConcept((CodeableConcept)value, diagnostics, context);
			case Fhir_PatientPackage.CODEABLE_REFERENCE:
				return validateCodeableReference((CodeableReference)value, diagnostics, context);
			case Fhir_PatientPackage.CODING:
				return validateCoding((Coding)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_DETAIL:
				return validateContactDetail((ContactDetail)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_POINT:
				return validateContactPoint((ContactPoint)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_POINT_SYSTEM:
				return validateContactPointSystem((ContactPointSystem)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_POINT_USE:
				return validateContactPointUse((ContactPointUse)value, diagnostics, context);
			case Fhir_PatientPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_REQUIREMENT:
				return validateDataRequirement((DataRequirement)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER:
				return validateDataRequirementCodeFilter((DataRequirementCodeFilter)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_REQUIREMENT_DATE_FILTER:
				return validateDataRequirementDateFilter((DataRequirementDateFilter)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_REQUIREMENT_SORT:
				return validateDataRequirementSort((DataRequirementSort)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_REQUIREMENT_VALUE_FILTER:
				return validateDataRequirementValueFilter((DataRequirementValueFilter)value, diagnostics, context);
			case Fhir_PatientPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case Fhir_PatientPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case Fhir_PatientPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case Fhir_PatientPackage.DECIMAL:
				return validateDecimal((Decimal)value, diagnostics, context);
			case Fhir_PatientPackage.DISTANCE:
				return validateDistance((Distance)value, diagnostics, context);
			case Fhir_PatientPackage.DOMAIN_RESOURCE:
				return validateDomainResource((DomainResource)value, diagnostics, context);
			case Fhir_PatientPackage.DOSAGE:
				return validateDosage((Dosage)value, diagnostics, context);
			case Fhir_PatientPackage.DOSAGE_DOSE_AND_RATE:
				return validateDosageDoseAndRate((DosageDoseAndRate)value, diagnostics, context);
			case Fhir_PatientPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case Fhir_PatientPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case Fhir_PatientPackage.EVENT_TIMING:
				return validateEventTiming((EventTiming)value, diagnostics, context);
			case Fhir_PatientPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case Fhir_PatientPackage.EXTENDED_CONTACT_DETAIL:
				return validateExtendedContactDetail((ExtendedContactDetail)value, diagnostics, context);
			case Fhir_PatientPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case Fhir_PatientPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case Fhir_PatientPackage.HUMAN_NAME:
				return validateHumanName((HumanName)value, diagnostics, context);
			case Fhir_PatientPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case Fhir_PatientPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case Fhir_PatientPackage.IDENTIFIER_USE:
				return validateIdentifierUse((IdentifierUse)value, diagnostics, context);
			case Fhir_PatientPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER:
				return validateInteger((org.hl7.fhir_patient.Integer)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER64:
				return validateInteger64((Integer64)value, diagnostics, context);
			case Fhir_PatientPackage.LINK_RELATION_TYPES:
				return validateLinkRelationTypes((LinkRelationTypes)value, diagnostics, context);
			case Fhir_PatientPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case Fhir_PatientPackage.MARKDOWN:
				return validateMarkdown((Markdown)value, diagnostics, context);
			case Fhir_PatientPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case Fhir_PatientPackage.MONEY:
				return validateMoney((Money)value, diagnostics, context);
			case Fhir_PatientPackage.NAME_USE:
				return validateNameUse((NameUse)value, diagnostics, context);
			case Fhir_PatientPackage.NARRATIVE:
				return validateNarrative((Narrative)value, diagnostics, context);
			case Fhir_PatientPackage.NARRATIVE_STATUS:
				return validateNarrativeStatus((NarrativeStatus)value, diagnostics, context);
			case Fhir_PatientPackage.OID:
				return validateOid((Oid)value, diagnostics, context);
			case Fhir_PatientPackage.PARAMETER_DEFINITION:
				return validateParameterDefinition((ParameterDefinition)value, diagnostics, context);
			case Fhir_PatientPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case Fhir_PatientPackage.PATIENT_COMMUNICATION:
				return validatePatientCommunication((PatientCommunication)value, diagnostics, context);
			case Fhir_PatientPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact)value, diagnostics, context);
			case Fhir_PatientPackage.PATIENT_LINK:
				return validatePatientLink((PatientLink)value, diagnostics, context);
			case Fhir_PatientPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case Fhir_PatientPackage.POSITIVE_INT:
				return validatePositiveInt((PositiveInt)value, diagnostics, context);
			case Fhir_PatientPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case Fhir_PatientPackage.QUANTITY_COMPARATOR:
				return validateQuantityComparator((QuantityComparator)value, diagnostics, context);
			case Fhir_PatientPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case Fhir_PatientPackage.RATIO:
				return validateRatio((Ratio)value, diagnostics, context);
			case Fhir_PatientPackage.RATIO_RANGE:
				return validateRatioRange((RatioRange)value, diagnostics, context);
			case Fhir_PatientPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case Fhir_PatientPackage.RELATED_ARTIFACT:
				return validateRelatedArtifact((RelatedArtifact)value, diagnostics, context);
			case Fhir_PatientPackage.RELATED_ARTIFACT_TYPE:
				return validateRelatedArtifactType((RelatedArtifactType)value, diagnostics, context);
			case Fhir_PatientPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case Fhir_PatientPackage.SAMPLED_DATA:
				return validateSampledData((SampledData)value, diagnostics, context);
			case Fhir_PatientPackage.SAMPLED_DATA_DATA_TYPE:
				return validateSampledDataDataType((SampledDataDataType)value, diagnostics, context);
			case Fhir_PatientPackage.SEARCH_ENTRY_MODE:
				return validateSearchEntryMode((SearchEntryMode)value, diagnostics, context);
			case Fhir_PatientPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case Fhir_PatientPackage.SORT_DIRECTION:
				return validateSortDirection((SortDirection)value, diagnostics, context);
			case Fhir_PatientPackage.STRING:
				return validateString((org.hl7.fhir_patient.String)value, diagnostics, context);
			case Fhir_PatientPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case Fhir_PatientPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case Fhir_PatientPackage.TIMING_REPEAT:
				return validateTimingRepeat((TimingRepeat)value, diagnostics, context);
			case Fhir_PatientPackage.TRIGGER_DEFINITION:
				return validateTriggerDefinition((TriggerDefinition)value, diagnostics, context);
			case Fhir_PatientPackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case Fhir_PatientPackage.UNITS_OF_TIME:
				return validateUnitsOfTime((UnitsOfTime)value, diagnostics, context);
			case Fhir_PatientPackage.UNSIGNED_INT:
				return validateUnsignedInt((UnsignedInt)value, diagnostics, context);
			case Fhir_PatientPackage.URI:
				return validateUri((Uri)value, diagnostics, context);
			case Fhir_PatientPackage.URL:
				return validateUrl((Url)value, diagnostics, context);
			case Fhir_PatientPackage.USAGE_CONTEXT:
				return validateUsageContext((UsageContext)value, diagnostics, context);
			case Fhir_PatientPackage.UUID:
				return validateUuid((Uuid)value, diagnostics, context);
			case Fhir_PatientPackage.ADDRESS_TYPE_ENUM:
				return validateAddressTypeEnum((AddressTypeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.ADDRESS_USE_ENUM:
				return validateAddressUseEnum((AddressUseEnum)value, diagnostics, context);
			case Fhir_PatientPackage.ADMINISTRATIVE_GENDER_ENUM:
				return validateAdministrativeGenderEnum((AdministrativeGenderEnum)value, diagnostics, context);
			case Fhir_PatientPackage.BUNDLE_TYPE_ENUM:
				return validateBundleTypeEnum((BundleTypeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_POINT_SYSTEM_ENUM:
				return validateContactPointSystemEnum((ContactPointSystemEnum)value, diagnostics, context);
			case Fhir_PatientPackage.CONTACT_POINT_USE_ENUM:
				return validateContactPointUseEnum((ContactPointUseEnum)value, diagnostics, context);
			case Fhir_PatientPackage.EVENT_TIMING_ENUM:
				return validateEventTimingEnum((EventTimingEnum)value, diagnostics, context);
			case Fhir_PatientPackage.HTTP_VERB_ENUM:
				return validateHTTPVerbEnum((HTTPVerbEnum)value, diagnostics, context);
			case Fhir_PatientPackage.IDENTIFIER_USE_ENUM:
				return validateIdentifierUseEnum((IdentifierUseEnum)value, diagnostics, context);
			case Fhir_PatientPackage.LINK_RELATION_TYPES_ENUM:
				return validateLinkRelationTypesEnum((LinkRelationTypesEnum)value, diagnostics, context);
			case Fhir_PatientPackage.LINK_TYPE_ENUM:
				return validateLinkTypeEnum((LinkTypeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.NAME_USE_ENUM:
				return validateNameUseEnum((NameUseEnum)value, diagnostics, context);
			case Fhir_PatientPackage.NARRATIVE_STATUS_ENUM:
				return validateNarrativeStatusEnum((NarrativeStatusEnum)value, diagnostics, context);
			case Fhir_PatientPackage.QUANTITY_COMPARATOR_ENUM:
				return validateQuantityComparatorEnum((QuantityComparatorEnum)value, diagnostics, context);
			case Fhir_PatientPackage.RELATED_ARTIFACT_TYPE_ENUM:
				return validateRelatedArtifactTypeEnum((RelatedArtifactTypeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.SEARCH_ENTRY_MODE_ENUM:
				return validateSearchEntryModeEnum((SearchEntryModeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.SORT_DIRECTION_ENUM:
				return validateSortDirectionEnum((SortDirectionEnum)value, diagnostics, context);
			case Fhir_PatientPackage.TRIGGER_TYPE_ENUM:
				return validateTriggerTypeEnum((TriggerTypeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.UNITS_OF_TIME_ENUM:
				return validateUnitsOfTimeEnum((UnitsOfTimeEnum)value, diagnostics, context);
			case Fhir_PatientPackage.BASE64_BINARY_PRIMITIVE:
				return validateBase64BinaryPrimitive((byte[])value, diagnostics, context);
			case Fhir_PatientPackage.BOOLEAN_PRIMITIVE:
				return validateBooleanPrimitive((Boolean)value, diagnostics, context);
			case Fhir_PatientPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return validateBooleanPrimitiveObject((Boolean)value, diagnostics, context);
			case Fhir_PatientPackage.CANONICAL_PRIMITIVE:
				return validateCanonicalPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.CODE_PRIMITIVE:
				return validateCodePrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.DATE_PRIMITIVE:
				return validateDatePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.DATE_PRIMITIVE_BASE:
				return validateDatePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.DATE_TIME_PRIMITIVE:
				return validateDateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.DATE_TIME_PRIMITIVE_BASE:
				return validateDateTimePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.DECIMAL_PRIMITIVE:
				return validateDecimalPrimitive(value, diagnostics, context);
			case Fhir_PatientPackage.ID_PRIMITIVE:
				return validateIdPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.INSTANT_PRIMITIVE:
				return validateInstantPrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER64_PRIMITIVE:
				return validateInteger64Primitive((Long)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER64_PRIMITIVE_OBJECT:
				return validateInteger64PrimitiveObject((Long)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER_PRIMITIVE:
				return validateIntegerPrimitive((Integer)value, diagnostics, context);
			case Fhir_PatientPackage.INTEGER_PRIMITIVE_OBJECT:
				return validateIntegerPrimitiveObject((Integer)value, diagnostics, context);
			case Fhir_PatientPackage.MARKDOWN_PRIMITIVE:
				return validateMarkdownPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.OID_PRIMITIVE:
				return validateOidPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.POSITIVE_INT_PRIMITIVE:
				return validatePositiveIntPrimitive((BigInteger)value, diagnostics, context);
			case Fhir_PatientPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return validateSampledDataDataTypePrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.STRING_PRIMITIVE:
				return validateStringPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.TIME_PRIMITIVE:
				return validateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case Fhir_PatientPackage.UNSIGNED_INT_PRIMITIVE:
				return validateUnsignedIntPrimitive((BigInteger)value, diagnostics, context);
			case Fhir_PatientPackage.URI_PRIMITIVE:
				return validateUriPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.URL_PRIMITIVE:
				return validateUrlPrimitive((String)value, diagnostics, context);
			case Fhir_PatientPackage.UUID_PRIMITIVE:
				return validateUuidPrimitive((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUse(AddressUse addressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGender(AdministrativeGender administrativeGender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrativeGender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAge(Age age, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(age, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachment(Attachment attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailability(Availability availability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityAvailableTime(AvailabilityAvailableTime availabilityAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availabilityAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityNotAvailableTime(AvailabilityNotAvailableTime availabilityNotAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availabilityNotAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneElement(BackboneElement backboneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneType(BackboneType backboneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase(Base base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(Binary binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.hl7.fhir_patient.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleEntry(BundleEntry bundleEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleLink(BundleLink bundleLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleRequest(BundleRequest bundleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResponse(BundleResponse bundleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleSearch(BundleSearch bundleSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleSearch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleType(BundleType bundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonical(Canonical canonical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(canonical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableConcept(CodeableConcept codeableConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableReference(CodeableReference codeableReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoding(Coding coding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactDetail(ContactDetail contactDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPoint(ContactPoint contactPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystem(ContactPointSystem contactPointSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUse(ContactPointUse contactPointUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirement(DataRequirement dataRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementCodeFilter(DataRequirementCodeFilter dataRequirementCodeFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementCodeFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementDateFilter(DataRequirementDateFilter dataRequirementDateFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementDateFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementSort(DataRequirementSort dataRequirementSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementValueFilter(DataRequirementValueFilter dataRequirementValueFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementValueFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(Decimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainResource(DomainResource domainResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDosage(Dosage dosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDosageDoseAndRate(DosageDoseAndRate dosageDoseAndRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dosageDoseAndRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(duration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTiming(EventTiming eventTiming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTiming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedContactDetail(ExtendedContactDetail extendedContactDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedContactDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpVerb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanName(HumanName humanName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humanName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(id, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUse(IdentifierUse identifierUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(org.hl7.fhir_patient.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger64(Integer64 integer64, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer64, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkRelationTypes(LinkRelationTypes linkRelationTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkRelationTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdown(Markdown markdown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markdown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Money money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(money, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUse(NameUse nameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrative(Narrative narrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatus(NarrativeStatus narrativeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(Oid oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDefinition(ParameterDefinition parameterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCommunication(PatientCommunication patientCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLink(PatientLink patientLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(period, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(PositiveInt positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparator(QuantityComparator quantityComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatio(Ratio ratio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatioRange(RatioRange ratioRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratioRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifact(RelatedArtifact relatedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactType(RelatedArtifactType relatedArtifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledData(SampledData sampledData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataType(SampledDataDataType sampledDataDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledDataDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryMode(SearchEntryMode searchEntryMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchEntryMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDirection(SortDirection sortDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortDirection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.hl7.fhir_patient.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingRepeat(TimingRepeat timingRepeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingRepeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerDefinition(TriggerDefinition triggerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTime(UnitsOfTime unitsOfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsOfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInt(UnsignedInt unsignedInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(Uri uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrl(Url url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(url, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageContext(UsageContext usageContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(Uuid uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeEnum(AddressTypeEnum addressTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseEnum(AddressUseEnum addressUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderEnum(AdministrativeGenderEnum administrativeGenderEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeEnum(BundleTypeEnum bundleTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemEnum(ContactPointSystemEnum contactPointSystemEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseEnum(ContactPointUseEnum contactPointUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingEnum(EventTimingEnum eventTimingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbEnum(HTTPVerbEnum httpVerbEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseEnum(IdentifierUseEnum identifierUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkRelationTypesEnum(LinkRelationTypesEnum linkRelationTypesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeEnum(LinkTypeEnum linkTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseEnum(NameUseEnum nameUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusEnum(NarrativeStatusEnum narrativeStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorEnum(QuantityComparatorEnum quantityComparatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactTypeEnum(RelatedArtifactTypeEnum relatedArtifactTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeEnum(SearchEntryModeEnum searchEntryModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDirectionEnum(SortDirectionEnum sortDirectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeEnum(TriggerTypeEnum triggerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeEnum(UnitsOfTimeEnum unitsOfTimeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBase64BinaryPrimitive_Pattern(base64BinaryPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBase64BinaryPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] BASE64_BINARY_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Base64 Binary Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive_Pattern(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.BASE64_BINARY_PRIMITIVE, base64BinaryPrimitive, BASE64_BINARY_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanPrimitive_Pattern(booleanPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBooleanPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] BOOLEAN_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("true|false")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Boolean Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive_Pattern(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.BOOLEAN_PRIMITIVE, booleanPrimitive, BOOLEAN_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitiveObject(Boolean booleanPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanPrimitive_Pattern(booleanPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCanonicalPrimitive_Pattern(canonicalPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCanonicalPrimitive_MinLength(canonicalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCanonicalPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CANONICAL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Canonical Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive_Pattern(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.CANONICAL_PRIMITIVE, canonicalPrimitive, CANONICAL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Canonical Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive_MinLength(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = canonicalPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.CANONICAL_PRIMITIVE, canonicalPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodePrimitive_Pattern(codePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodePrimitive_MinLength(codePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CODE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+( [^\\s]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_Pattern(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.CODE_PRIMITIVE, codePrimitive, CODE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_MinLength(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codePrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.CODE_PRIMITIVE, codePrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePrimitive_Pattern(datePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive_Pattern(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.DATE_PRIMITIVE, datePrimitive, DATE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase_MemberTypes(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePrimitive_Pattern(dateTimePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive_Pattern(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.DATE_TIME_PRIMITIVE, dateTimePrimitive, DATE_TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase_MemberTypes(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive(Object decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPrimitive_MemberTypes(decimalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Decimal Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive_MemberTypes(Object decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DECIMAL.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)decimalPrimitive, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDouble((Double)decimalPrimitive, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DECIMAL.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)decimalPrimitive, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDouble((Double)decimalPrimitive, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdPrimitive_Pattern(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MinLength(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MaxLength(idPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] ID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9\\-\\.]{1,64}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_Pattern(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.ID_PRIMITIVE, idPrimitive, ID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MinLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.ID_PRIMITIVE, idPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MaxLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length <= 64;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Fhir_PatientPackage.Literals.ID_PRIMITIVE, idPrimitive, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstantPrimitive_Pattern(instantPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInstantPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INSTANT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]{1,9})?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Instant Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive_Pattern(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.INSTANT_PRIMITIVE, instantPrimitive, INSTANT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger64Primitive(long integer64Primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInteger64Primitive_Pattern(integer64Primitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInteger64Primitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER64_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|[-+]?[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer64 Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger64Primitive_Pattern(long integer64Primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.INTEGER64_PRIMITIVE, integer64Primitive, INTEGER64_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger64PrimitiveObject(Long integer64PrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInteger64Primitive_Pattern(integer64PrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|[-+]?[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive_Pattern(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.INTEGER_PRIMITIVE, integerPrimitive, INTEGER_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitiveObject(Integer integerPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkdownPrimitive_Pattern(markdownPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkdownPrimitive_MinLength(markdownPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMarkdownPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] MARKDOWN_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\s\\S]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_Pattern(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.MARKDOWN_PRIMITIVE, markdownPrimitive, MARKDOWN_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_MinLength(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markdownPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.MARKDOWN_PRIMITIVE, markdownPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOidPrimitive_Pattern(oidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateOidPrimitive_MinLength(oidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] OID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:oid:[0-2](\\.(0|[1-9][0-9]*))+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_Pattern(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.OID_PRIMITIVE, oidPrimitive, OID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_MinLength(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.OID_PRIMITIVE, oidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntPrimitive_Pattern(positiveIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive_Pattern(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.POSITIVE_INT_PRIMITIVE, positiveIntPrimitive, POSITIVE_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSampledDataDataTypePrimitive_Pattern(sampledDataDataTypePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSampledDataDataTypePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])( ((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sampled Data Data Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive_Pattern(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.SAMPLED_DATA_DATA_TYPE_PRIMITIVE, sampledDataDataTypePrimitive, SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringPrimitive_MinLength(stringPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>String Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive_MinLength(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.STRING_PRIMITIVE, stringPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePrimitive_Pattern(timePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive_Pattern(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.TIME_PRIMITIVE, timePrimitive, TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(unsignedIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnsignedIntPrimitive_Pattern(unsignedIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|([1-9][0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unsigned Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive_Pattern(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.UNSIGNED_INT_PRIMITIVE, unsignedIntPrimitive, UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUriPrimitive_Pattern(uriPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUriPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] URI_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uri Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive_Pattern(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.URI_PRIMITIVE, uriPrimitive, URI_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlPrimitive_Pattern(urlPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUrlPrimitive_MinLength(urlPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUrlPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] URL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Url Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive_Pattern(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.URL_PRIMITIVE, urlPrimitive, URL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Url Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive_MinLength(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = urlPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.URL_PRIMITIVE, urlPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidPrimitive_Pattern(uuidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuidPrimitive_MinLength(uuidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UUID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_Pattern(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Fhir_PatientPackage.Literals.UUID_PRIMITIVE, uuidPrimitive, UUID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_MinLength(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Fhir_PatientPackage.Literals.UUID_PRIMITIVE, uuidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Fhir_PatientValidator
