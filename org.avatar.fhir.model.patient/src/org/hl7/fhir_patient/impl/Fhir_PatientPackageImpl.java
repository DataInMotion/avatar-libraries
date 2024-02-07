/**
 */
package org.hl7.fhir_patient.impl;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.hl7.fhir_patient.Fhir_PatientFactory;
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

import org.hl7.fhir_patient.util.Fhir_PatientValidator;

import org.w3._1999.xhtml.XhtmlPackage;

import org.w3.xml._1998.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fhir_PatientPackageImpl extends EPackageImpl implements Fhir_PatientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeGenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityNotAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backboneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backboneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeableConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementCodeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementDateFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementValueFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dosageDoseAndRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTimingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedContactDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpVerbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkRelationTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityComparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedArtifactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledDataDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEntryModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingRepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitsOfTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressUseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrativeGenderEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bundleTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointSystemEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointUseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTimingEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierUseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkRelationTypesEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameUseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum narrativeStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantityComparatorEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relatedArtifactTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchEntryModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsOfTimeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64BinaryPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanPrimitiveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType canonicalPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datePrimitiveBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimePrimitiveBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integer64PrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integer64PrimitiveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerPrimitiveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markdownPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oidPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sampledDataDataTypePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedIntPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidPrimitiveEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hl7.fhir_patient.Fhir_PatientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fhir_PatientPackageImpl() {
		super(eNS_URI, Fhir_PatientFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Fhir_PatientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fhir_PatientPackage init() {
		if (isInited) return (Fhir_PatientPackage)EPackage.Registry.INSTANCE.getEPackage(Fhir_PatientPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFhir_PatientPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Fhir_PatientPackageImpl theFhir_PatientPackage = registeredFhir_PatientPackage instanceof Fhir_PatientPackageImpl ? (Fhir_PatientPackageImpl)registeredFhir_PatientPackage : new Fhir_PatientPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		NamespacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFhir_PatientPackage.createPackageContents();

		// Initialize created meta-data
		theFhir_PatientPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFhir_PatientPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Fhir_PatientValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFhir_PatientPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fhir_PatientPackage.eNS_URI, theFhir_PatientPackage);
		return theFhir_PatientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Use() {
		return (EReference)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Type() {
		return (EReference)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Text() {
		return (EReference)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Line() {
		return (EReference)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_City() {
		return (EReference)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_District() {
		return (EReference)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_State() {
		return (EReference)addressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_PostalCode() {
		return (EReference)addressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Country() {
		return (EReference)addressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Period() {
		return (EReference)addressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Value() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressUse() {
		return addressUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressUse_Value() {
		return (EAttribute)addressUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrativeGender() {
		return administrativeGenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeGender_Value() {
		return (EAttribute)administrativeGenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAge() {
		return ageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AuthorReference() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AuthorString() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Time() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Text() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_ContentType() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Language() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Data() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Url() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Size() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Hash() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Title() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Creation() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Height() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Width() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Frames() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Duration() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Pages() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailability_AvailableTime() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailability_NotAvailableTime() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailabilityAvailableTime() {
		return availabilityAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityAvailableTime_DaysOfWeek() {
		return (EReference)availabilityAvailableTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityAvailableTime_AllDay() {
		return (EReference)availabilityAvailableTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityAvailableTime_AvailableStartTime() {
		return (EReference)availabilityAvailableTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityAvailableTime_AvailableEndTime() {
		return (EReference)availabilityAvailableTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailabilityNotAvailableTime() {
		return availabilityNotAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityNotAvailableTime_Description() {
		return (EReference)availabilityNotAvailableTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAvailabilityNotAvailableTime_During() {
		return (EReference)availabilityNotAvailableTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackboneElement() {
		return backboneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackboneElement_ModifierExtension() {
		return (EReference)backboneElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackboneType() {
		return backboneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackboneType_ModifierExtension() {
		return (EReference)backboneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase() {
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64Binary() {
		return base64BinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64Binary_Value() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinary_ContentType() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinary_SecurityContext() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinary_Data() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolean_Value() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Identifier() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Type() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Timestamp() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Total() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Link() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Entry() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Signature() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleEntry() {
		return bundleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleEntry_Link() {
		return (EReference)bundleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleEntry_FullUrl() {
		return (EReference)bundleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleEntry_Search() {
		return (EReference)bundleEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleEntry_Request() {
		return (EReference)bundleEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleEntry_Response() {
		return (EReference)bundleEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleLink() {
		return bundleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleLink_Relation() {
		return (EReference)bundleLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleLink_Url() {
		return (EReference)bundleLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleRequest() {
		return bundleRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_Method() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_Url() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_IfNoneMatch() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_IfModifiedSince() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_IfMatch() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleRequest_IfNoneExist() {
		return (EReference)bundleRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleResponse() {
		return bundleResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleResponse_Status() {
		return (EReference)bundleResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleResponse_Location() {
		return (EReference)bundleResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleResponse_Etag() {
		return (EReference)bundleResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleResponse_LastModified() {
		return (EReference)bundleResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleSearch() {
		return bundleSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleSearch_Mode() {
		return (EReference)bundleSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleSearch_Score() {
		return (EReference)bundleSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleType() {
		return bundleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleType_Value() {
		return (EAttribute)bundleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCanonical() {
		return canonicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCanonical_Value() {
		return (EAttribute)canonicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCode_Value() {
		return (EAttribute)codeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeableConcept() {
		return codeableConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableConcept_Coding() {
		return (EReference)codeableConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableConcept_Text() {
		return (EReference)codeableConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeableReference() {
		return codeableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableReference_Concept() {
		return (EReference)codeableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableReference_Reference() {
		return (EReference)codeableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoding() {
		return codingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_System() {
		return (EReference)codingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Version() {
		return (EReference)codingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Code() {
		return (EReference)codingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Display() {
		return (EReference)codingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_UserSelected() {
		return (EReference)codingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactDetail() {
		return contactDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactDetail_Name() {
		return (EReference)contactDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactDetail_Telecom() {
		return (EReference)contactDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPoint() {
		return contactPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_System() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Value() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Use() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Rank() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Period() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPointSystem() {
		return contactPointSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPointSystem_Value() {
		return (EAttribute)contactPointSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPointUse() {
		return contactPointUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPointUse_Value() {
		return (EAttribute)contactPointUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirement() {
		return dataRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Type() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Profile() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_SubjectCodeableConcept() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_SubjectReference() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_MustSupport() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_CodeFilter() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_DateFilter() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_ValueFilter() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Limit() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Sort() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementCodeFilter() {
		return dataRequirementCodeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementCodeFilter_Path() {
		return (EReference)dataRequirementCodeFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementCodeFilter_SearchParam() {
		return (EReference)dataRequirementCodeFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementCodeFilter_ValueSet() {
		return (EReference)dataRequirementCodeFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementCodeFilter_Code() {
		return (EReference)dataRequirementCodeFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementDateFilter() {
		return dataRequirementDateFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementDateFilter_Path() {
		return (EReference)dataRequirementDateFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementDateFilter_SearchParam() {
		return (EReference)dataRequirementDateFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementDateFilter_ValueDateTime() {
		return (EReference)dataRequirementDateFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementDateFilter_ValuePeriod() {
		return (EReference)dataRequirementDateFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementDateFilter_ValueDuration() {
		return (EReference)dataRequirementDateFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementSort() {
		return dataRequirementSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementSort_Path() {
		return (EReference)dataRequirementSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementSort_Direction() {
		return (EReference)dataRequirementSortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementValueFilter() {
		return dataRequirementValueFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_Path() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_SearchParam() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_Comparator() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_ValueDateTime() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_ValuePeriod() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementValueFilter_ValueDuration() {
		return (EReference)dataRequirementValueFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDate_Value() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Value() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimal_Value() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistance() {
		return distanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainResource() {
		return domainResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainResource_Text() {
		return (EReference)domainResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainResource_Extension() {
		return (EReference)domainResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainResource_ModifierExtension() {
		return (EReference)domainResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDosage() {
		return dosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Sequence() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Text() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_AdditionalInstruction() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_PatientInstruction() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Timing() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_AsNeeded() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_AsNeededFor() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Site() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Route() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Method() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_DoseAndRate() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerPeriod() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerAdministration() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerLifetime() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDosageDoseAndRate() {
		return dosageDoseAndRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_Type() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_DoseRange() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_DoseQuantity() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_RateRatio() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_RateRange() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageDoseAndRate_RateQuantity() {
		return (EReference)dosageDoseAndRateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Extension() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventTiming() {
		return eventTimingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventTiming_Value() {
		return (EAttribute)eventTimingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Description() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Name() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Language() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Expression() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Reference() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendedContactDetail() {
		return extendedContactDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Purpose() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Name() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Telecom() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Address() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Organization() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedContactDetail_Period() {
		return (EReference)extendedContactDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueBase64Binary() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueBoolean() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCanonical() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCode() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDate() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDateTime() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDecimal() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueId() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueInstant() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueInteger() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueInteger64() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueMarkdown() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueOid() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValuePositiveInt() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueString() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueTime() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueUnsignedInt() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueUri() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueUrl() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueUuid() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueAddress() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueAge() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueAnnotation() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueAttachment() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCodeableConcept() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCodeableReference() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCoding() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueContactPoint() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueCount() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDistance() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDuration() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueHumanName() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueIdentifier() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueMoney() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValuePeriod() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueQuantity() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueRange() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueRatio() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueRatioRange() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueReference() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueSampledData() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueSignature() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueTiming() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueContactDetail() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDataRequirement() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueExpression() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueParameterDefinition() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueRelatedArtifact() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueTriggerDefinition() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueUsageContext() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueAvailability() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueExtendedContactDetail() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueDosage() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_ValueMeta() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Url() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTTPVerb() {
		return httpVerbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTTPVerb_Value() {
		return (EAttribute)httpVerbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanName() {
		return humanNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Use() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Text() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Family() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Given() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Prefix() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Suffix() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Period() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getId() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getId_Value() {
		return (EAttribute)idEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Use() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Type() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_System() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Value() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Period() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Assigner() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifierUse() {
		return identifierUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierUse_Value() {
		return (EAttribute)identifierUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstant() {
		return instantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstant_Value() {
		return (EAttribute)instantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteger64() {
		return integer64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteger64_Value() {
		return (EAttribute)integer64EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkRelationTypes() {
		return linkRelationTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkRelationTypes_Value() {
		return (EAttribute)linkRelationTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Value() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdown() {
		return markdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdown_Value() {
		return (EAttribute)markdownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_VersionId() {
		return (EReference)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_LastUpdated() {
		return (EReference)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Source() {
		return (EReference)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Profile() {
		return (EReference)metaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Security() {
		return (EReference)metaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Tag() {
		return (EReference)metaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoney() {
		return moneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoney_Value() {
		return (EReference)moneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoney_Currency() {
		return (EReference)moneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameUse() {
		return nameUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameUse_Value() {
		return (EAttribute)nameUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNarrative() {
		return narrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNarrative_Status() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNarrative_Div() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNarrativeStatus() {
		return narrativeStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNarrativeStatus_Value() {
		return (EAttribute)narrativeStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOid() {
		return oidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOid_Value() {
		return (EAttribute)oidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Name() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Use() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Min() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Max() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Documentation() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Type() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Profile() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Identifier() {
		return (EReference)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Active() {
		return (EReference)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Name() {
		return (EReference)patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Telecom() {
		return (EReference)patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Gender() {
		return (EReference)patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_BirthDate() {
		return (EReference)patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_DeceasedBoolean() {
		return (EReference)patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_DeceasedDateTime() {
		return (EReference)patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Address() {
		return (EReference)patientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_MaritalStatus() {
		return (EReference)patientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_MultipleBirthBoolean() {
		return (EReference)patientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_MultipleBirthInteger() {
		return (EReference)patientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Photo() {
		return (EReference)patientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Contact() {
		return (EReference)patientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Communication() {
		return (EReference)patientEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_GeneralPractitioner() {
		return (EReference)patientEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_ManagingOrganization() {
		return (EReference)patientEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Link() {
		return (EReference)patientEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_FakeId() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientCommunication() {
		return patientCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientCommunication_Language() {
		return (EReference)patientCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientCommunication_Preferred() {
		return (EReference)patientCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientContact() {
		return patientContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Relationship() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Name() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Telecom() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Address() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Gender() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Organization() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientContact_Period() {
		return (EReference)patientContactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientLink() {
		return patientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientLink_Other() {
		return (EReference)patientLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientLink_Type() {
		return (EReference)patientLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriod() {
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_Start() {
		return (EReference)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_End() {
		return (EReference)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveInt() {
		return positiveIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositiveInt_Value() {
		return (EAttribute)positiveIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Value() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Comparator() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Unit() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_System() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Code() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityComparator() {
		return quantityComparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityComparator_Value() {
		return (EAttribute)quantityComparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_Low() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_High() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatio() {
		return ratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatio_Numerator() {
		return (EReference)ratioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatio_Denominator() {
		return (EReference)ratioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatioRange() {
		return ratioRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatioRange_LowNumerator() {
		return (EReference)ratioRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatioRange_HighNumerator() {
		return (EReference)ratioRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatioRange_Denominator() {
		return (EReference)ratioRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Reference() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Type() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Identifier() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Display() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedArtifact() {
		return relatedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Type() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Classifier() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Label() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Display() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Citation() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Document() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Resource() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_ResourceReference() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_PublicationStatus() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_PublicationDate() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedArtifactType() {
		return relatedArtifactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedArtifactType_Value() {
		return (EAttribute)relatedArtifactTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Id() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Meta() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_ImplicitRules() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Language() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampledData() {
		return sampledDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Origin() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Interval() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_IntervalUnit() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Factor() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_LowerLimit() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_UpperLimit() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Dimensions() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_CodeMap() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Offsets() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Data() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampledDataDataType() {
		return sampledDataDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledDataDataType_Value() {
		return (EAttribute)sampledDataDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSearchEntryMode() {
		return searchEntryModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSearchEntryMode_Value() {
		return (EAttribute)searchEntryModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Type() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_When() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Who() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_OnBehalfOf() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_TargetFormat() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_SigFormat() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Data() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortDirection() {
		return sortDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortDirection_Value() {
		return (EAttribute)sortDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getString_Value() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTiming() {
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Event() {
		return (EReference)timingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Repeat() {
		return (EReference)timingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Code() {
		return (EReference)timingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingRepeat() {
		return timingRepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_BoundsDuration() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_BoundsRange() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_BoundsPeriod() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_Count() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_CountMax() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_Duration() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_DurationMax() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_DurationUnit() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_Frequency() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_FrequencyMax() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_Period() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_PeriodMax() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_PeriodUnit() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_DayOfWeek() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_TimeOfDay() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_When() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingRepeat_Offset() {
		return (EReference)timingRepeatEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerDefinition() {
		return triggerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Type() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Name() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Code() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_SubscriptionTopic() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_TimingTiming() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_TimingReference() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_TimingDate() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_TimingDateTime() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Data() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Condition() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerType() {
		return triggerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Value() {
		return (EAttribute)triggerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitsOfTime() {
		return unitsOfTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitsOfTime_Value() {
		return (EAttribute)unitsOfTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsignedInt() {
		return unsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsignedInt_Value() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUri() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUri_Value() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrl() {
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUrl_Value() {
		return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageContext() {
		return usageContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_Code() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueCodeableConcept() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueQuantity() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueRange() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueReference() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUuid() {
		return uuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUuid_Value() {
		return (EAttribute)uuidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAddressTypeEnum() {
		return addressTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAddressUseEnum() {
		return addressUseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdministrativeGenderEnum() {
		return administrativeGenderEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBundleTypeEnum() {
		return bundleTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContactPointSystemEnum() {
		return contactPointSystemEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContactPointUseEnum() {
		return contactPointUseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEventTimingEnum() {
		return eventTimingEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHTTPVerbEnum() {
		return httpVerbEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierUseEnum() {
		return identifierUseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinkRelationTypesEnum() {
		return linkRelationTypesEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinkTypeEnum() {
		return linkTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameUseEnum() {
		return nameUseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNarrativeStatusEnum() {
		return narrativeStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuantityComparatorEnum() {
		return quantityComparatorEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelatedArtifactTypeEnum() {
		return relatedArtifactTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSearchEntryModeEnum() {
		return searchEntryModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSortDirectionEnum() {
		return sortDirectionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerTypeEnum() {
		return triggerTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsOfTimeEnum() {
		return unitsOfTimeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBase64BinaryPrimitive() {
		return base64BinaryPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBooleanPrimitive() {
		return booleanPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBooleanPrimitiveObject() {
		return booleanPrimitiveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCanonicalPrimitive() {
		return canonicalPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCodePrimitive() {
		return codePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatePrimitive() {
		return datePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatePrimitiveBase() {
		return datePrimitiveBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimePrimitive() {
		return dateTimePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimePrimitiveBase() {
		return dateTimePrimitiveBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecimalPrimitive() {
		return decimalPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdPrimitive() {
		return idPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstantPrimitive() {
		return instantPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInteger64Primitive() {
		return integer64PrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInteger64PrimitiveObject() {
		return integer64PrimitiveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIntegerPrimitive() {
		return integerPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIntegerPrimitiveObject() {
		return integerPrimitiveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkdownPrimitive() {
		return markdownPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOidPrimitive() {
		return oidPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveIntPrimitive() {
		return positiveIntPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSampledDataDataTypePrimitive() {
		return sampledDataDataTypePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringPrimitive() {
		return stringPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimePrimitive() {
		return timePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnsignedIntPrimitive() {
		return unsignedIntPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUriPrimitive() {
		return uriPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrlPrimitive() {
		return urlPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUuidPrimitive() {
		return uuidPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fhir_PatientFactory getFhir_PatientFactory() {
		return (Fhir_PatientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEReference(addressEClass, ADDRESS__USE);
		createEReference(addressEClass, ADDRESS__TYPE);
		createEReference(addressEClass, ADDRESS__TEXT);
		createEReference(addressEClass, ADDRESS__LINE);
		createEReference(addressEClass, ADDRESS__CITY);
		createEReference(addressEClass, ADDRESS__DISTRICT);
		createEReference(addressEClass, ADDRESS__STATE);
		createEReference(addressEClass, ADDRESS__POSTAL_CODE);
		createEReference(addressEClass, ADDRESS__COUNTRY);
		createEReference(addressEClass, ADDRESS__PERIOD);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__VALUE);

		addressUseEClass = createEClass(ADDRESS_USE);
		createEAttribute(addressUseEClass, ADDRESS_USE__VALUE);

		administrativeGenderEClass = createEClass(ADMINISTRATIVE_GENDER);
		createEAttribute(administrativeGenderEClass, ADMINISTRATIVE_GENDER__VALUE);

		ageEClass = createEClass(AGE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__AUTHOR_REFERENCE);
		createEReference(annotationEClass, ANNOTATION__AUTHOR_STRING);
		createEReference(annotationEClass, ANNOTATION__TIME);
		createEReference(annotationEClass, ANNOTATION__TEXT);

		attachmentEClass = createEClass(ATTACHMENT);
		createEReference(attachmentEClass, ATTACHMENT__CONTENT_TYPE);
		createEReference(attachmentEClass, ATTACHMENT__LANGUAGE);
		createEReference(attachmentEClass, ATTACHMENT__DATA);
		createEReference(attachmentEClass, ATTACHMENT__URL);
		createEReference(attachmentEClass, ATTACHMENT__SIZE);
		createEReference(attachmentEClass, ATTACHMENT__HASH);
		createEReference(attachmentEClass, ATTACHMENT__TITLE);
		createEReference(attachmentEClass, ATTACHMENT__CREATION);
		createEReference(attachmentEClass, ATTACHMENT__HEIGHT);
		createEReference(attachmentEClass, ATTACHMENT__WIDTH);
		createEReference(attachmentEClass, ATTACHMENT__FRAMES);
		createEReference(attachmentEClass, ATTACHMENT__DURATION);
		createEReference(attachmentEClass, ATTACHMENT__PAGES);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__AVAILABLE_TIME);
		createEReference(availabilityEClass, AVAILABILITY__NOT_AVAILABLE_TIME);

		availabilityAvailableTimeEClass = createEClass(AVAILABILITY_AVAILABLE_TIME);
		createEReference(availabilityAvailableTimeEClass, AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK);
		createEReference(availabilityAvailableTimeEClass, AVAILABILITY_AVAILABLE_TIME__ALL_DAY);
		createEReference(availabilityAvailableTimeEClass, AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME);
		createEReference(availabilityAvailableTimeEClass, AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME);

		availabilityNotAvailableTimeEClass = createEClass(AVAILABILITY_NOT_AVAILABLE_TIME);
		createEReference(availabilityNotAvailableTimeEClass, AVAILABILITY_NOT_AVAILABLE_TIME__DESCRIPTION);
		createEReference(availabilityNotAvailableTimeEClass, AVAILABILITY_NOT_AVAILABLE_TIME__DURING);

		backboneElementEClass = createEClass(BACKBONE_ELEMENT);
		createEReference(backboneElementEClass, BACKBONE_ELEMENT__MODIFIER_EXTENSION);

		backboneTypeEClass = createEClass(BACKBONE_TYPE);
		createEReference(backboneTypeEClass, BACKBONE_TYPE__MODIFIER_EXTENSION);

		baseEClass = createEClass(BASE);

		base64BinaryEClass = createEClass(BASE64_BINARY);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__VALUE);

		binaryEClass = createEClass(BINARY);
		createEReference(binaryEClass, BINARY__CONTENT_TYPE);
		createEReference(binaryEClass, BINARY__SECURITY_CONTEXT);
		createEReference(binaryEClass, BINARY__DATA);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		bundleEClass = createEClass(BUNDLE);
		createEReference(bundleEClass, BUNDLE__IDENTIFIER);
		createEReference(bundleEClass, BUNDLE__TYPE);
		createEReference(bundleEClass, BUNDLE__TIMESTAMP);
		createEReference(bundleEClass, BUNDLE__TOTAL);
		createEReference(bundleEClass, BUNDLE__LINK);
		createEReference(bundleEClass, BUNDLE__ENTRY);
		createEReference(bundleEClass, BUNDLE__SIGNATURE);

		bundleEntryEClass = createEClass(BUNDLE_ENTRY);
		createEReference(bundleEntryEClass, BUNDLE_ENTRY__LINK);
		createEReference(bundleEntryEClass, BUNDLE_ENTRY__FULL_URL);
		createEReference(bundleEntryEClass, BUNDLE_ENTRY__SEARCH);
		createEReference(bundleEntryEClass, BUNDLE_ENTRY__REQUEST);
		createEReference(bundleEntryEClass, BUNDLE_ENTRY__RESPONSE);

		bundleLinkEClass = createEClass(BUNDLE_LINK);
		createEReference(bundleLinkEClass, BUNDLE_LINK__RELATION);
		createEReference(bundleLinkEClass, BUNDLE_LINK__URL);

		bundleRequestEClass = createEClass(BUNDLE_REQUEST);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__METHOD);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__URL);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__IF_NONE_MATCH);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__IF_MODIFIED_SINCE);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__IF_MATCH);
		createEReference(bundleRequestEClass, BUNDLE_REQUEST__IF_NONE_EXIST);

		bundleResponseEClass = createEClass(BUNDLE_RESPONSE);
		createEReference(bundleResponseEClass, BUNDLE_RESPONSE__STATUS);
		createEReference(bundleResponseEClass, BUNDLE_RESPONSE__LOCATION);
		createEReference(bundleResponseEClass, BUNDLE_RESPONSE__ETAG);
		createEReference(bundleResponseEClass, BUNDLE_RESPONSE__LAST_MODIFIED);

		bundleSearchEClass = createEClass(BUNDLE_SEARCH);
		createEReference(bundleSearchEClass, BUNDLE_SEARCH__MODE);
		createEReference(bundleSearchEClass, BUNDLE_SEARCH__SCORE);

		bundleTypeEClass = createEClass(BUNDLE_TYPE);
		createEAttribute(bundleTypeEClass, BUNDLE_TYPE__VALUE);

		canonicalEClass = createEClass(CANONICAL);
		createEAttribute(canonicalEClass, CANONICAL__VALUE);

		codeEClass = createEClass(CODE);
		createEAttribute(codeEClass, CODE__VALUE);

		codeableConceptEClass = createEClass(CODEABLE_CONCEPT);
		createEReference(codeableConceptEClass, CODEABLE_CONCEPT__CODING);
		createEReference(codeableConceptEClass, CODEABLE_CONCEPT__TEXT);

		codeableReferenceEClass = createEClass(CODEABLE_REFERENCE);
		createEReference(codeableReferenceEClass, CODEABLE_REFERENCE__CONCEPT);
		createEReference(codeableReferenceEClass, CODEABLE_REFERENCE__REFERENCE);

		codingEClass = createEClass(CODING);
		createEReference(codingEClass, CODING__SYSTEM);
		createEReference(codingEClass, CODING__VERSION);
		createEReference(codingEClass, CODING__CODE);
		createEReference(codingEClass, CODING__DISPLAY);
		createEReference(codingEClass, CODING__USER_SELECTED);

		contactDetailEClass = createEClass(CONTACT_DETAIL);
		createEReference(contactDetailEClass, CONTACT_DETAIL__NAME);
		createEReference(contactDetailEClass, CONTACT_DETAIL__TELECOM);

		contactPointEClass = createEClass(CONTACT_POINT);
		createEReference(contactPointEClass, CONTACT_POINT__SYSTEM);
		createEReference(contactPointEClass, CONTACT_POINT__VALUE);
		createEReference(contactPointEClass, CONTACT_POINT__USE);
		createEReference(contactPointEClass, CONTACT_POINT__RANK);
		createEReference(contactPointEClass, CONTACT_POINT__PERIOD);

		contactPointSystemEClass = createEClass(CONTACT_POINT_SYSTEM);
		createEAttribute(contactPointSystemEClass, CONTACT_POINT_SYSTEM__VALUE);

		contactPointUseEClass = createEClass(CONTACT_POINT_USE);
		createEAttribute(contactPointUseEClass, CONTACT_POINT_USE__VALUE);

		countEClass = createEClass(COUNT);

		dataRequirementEClass = createEClass(DATA_REQUIREMENT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__TYPE);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__PROFILE);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__SUBJECT_REFERENCE);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__MUST_SUPPORT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__CODE_FILTER);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__DATE_FILTER);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__VALUE_FILTER);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__LIMIT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__SORT);

		dataRequirementCodeFilterEClass = createEClass(DATA_REQUIREMENT_CODE_FILTER);
		createEReference(dataRequirementCodeFilterEClass, DATA_REQUIREMENT_CODE_FILTER__PATH);
		createEReference(dataRequirementCodeFilterEClass, DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM);
		createEReference(dataRequirementCodeFilterEClass, DATA_REQUIREMENT_CODE_FILTER__VALUE_SET);
		createEReference(dataRequirementCodeFilterEClass, DATA_REQUIREMENT_CODE_FILTER__CODE);

		dataRequirementDateFilterEClass = createEClass(DATA_REQUIREMENT_DATE_FILTER);
		createEReference(dataRequirementDateFilterEClass, DATA_REQUIREMENT_DATE_FILTER__PATH);
		createEReference(dataRequirementDateFilterEClass, DATA_REQUIREMENT_DATE_FILTER__SEARCH_PARAM);
		createEReference(dataRequirementDateFilterEClass, DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME);
		createEReference(dataRequirementDateFilterEClass, DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD);
		createEReference(dataRequirementDateFilterEClass, DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION);

		dataRequirementSortEClass = createEClass(DATA_REQUIREMENT_SORT);
		createEReference(dataRequirementSortEClass, DATA_REQUIREMENT_SORT__PATH);
		createEReference(dataRequirementSortEClass, DATA_REQUIREMENT_SORT__DIRECTION);

		dataRequirementValueFilterEClass = createEClass(DATA_REQUIREMENT_VALUE_FILTER);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__PATH);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD);
		createEReference(dataRequirementValueFilterEClass, DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION);

		dataTypeEClass = createEClass(DATA_TYPE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__VALUE);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__VALUE);

		decimalEClass = createEClass(DECIMAL);
		createEAttribute(decimalEClass, DECIMAL__VALUE);

		distanceEClass = createEClass(DISTANCE);

		domainResourceEClass = createEClass(DOMAIN_RESOURCE);
		createEReference(domainResourceEClass, DOMAIN_RESOURCE__TEXT);
		createEReference(domainResourceEClass, DOMAIN_RESOURCE__EXTENSION);
		createEReference(domainResourceEClass, DOMAIN_RESOURCE__MODIFIER_EXTENSION);

		dosageEClass = createEClass(DOSAGE);
		createEReference(dosageEClass, DOSAGE__SEQUENCE);
		createEReference(dosageEClass, DOSAGE__TEXT);
		createEReference(dosageEClass, DOSAGE__ADDITIONAL_INSTRUCTION);
		createEReference(dosageEClass, DOSAGE__PATIENT_INSTRUCTION);
		createEReference(dosageEClass, DOSAGE__TIMING);
		createEReference(dosageEClass, DOSAGE__AS_NEEDED);
		createEReference(dosageEClass, DOSAGE__AS_NEEDED_FOR);
		createEReference(dosageEClass, DOSAGE__SITE);
		createEReference(dosageEClass, DOSAGE__ROUTE);
		createEReference(dosageEClass, DOSAGE__METHOD);
		createEReference(dosageEClass, DOSAGE__DOSE_AND_RATE);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_PERIOD);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_ADMINISTRATION);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_LIFETIME);

		dosageDoseAndRateEClass = createEClass(DOSAGE_DOSE_AND_RATE);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__TYPE);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__DOSE_RANGE);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__RATE_RATIO);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__RATE_RANGE);
		createEReference(dosageDoseAndRateEClass, DOSAGE_DOSE_AND_RATE__RATE_QUANTITY);

		durationEClass = createEClass(DURATION);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__EXTENSION);
		createEAttribute(elementEClass, ELEMENT__ID);

		eventTimingEClass = createEClass(EVENT_TIMING);
		createEAttribute(eventTimingEClass, EVENT_TIMING__VALUE);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__DESCRIPTION);
		createEReference(expressionEClass, EXPRESSION__NAME);
		createEReference(expressionEClass, EXPRESSION__LANGUAGE);
		createEReference(expressionEClass, EXPRESSION__EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__REFERENCE);

		extendedContactDetailEClass = createEClass(EXTENDED_CONTACT_DETAIL);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__PURPOSE);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__NAME);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__TELECOM);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__ADDRESS);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__ORGANIZATION);
		createEReference(extendedContactDetailEClass, EXTENDED_CONTACT_DETAIL__PERIOD);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__VALUE_BASE64_BINARY);
		createEReference(extensionEClass, EXTENSION__VALUE_BOOLEAN);
		createEReference(extensionEClass, EXTENSION__VALUE_CANONICAL);
		createEReference(extensionEClass, EXTENSION__VALUE_CODE);
		createEReference(extensionEClass, EXTENSION__VALUE_DATE);
		createEReference(extensionEClass, EXTENSION__VALUE_DATE_TIME);
		createEReference(extensionEClass, EXTENSION__VALUE_DECIMAL);
		createEReference(extensionEClass, EXTENSION__VALUE_ID);
		createEReference(extensionEClass, EXTENSION__VALUE_INSTANT);
		createEReference(extensionEClass, EXTENSION__VALUE_INTEGER);
		createEReference(extensionEClass, EXTENSION__VALUE_INTEGER64);
		createEReference(extensionEClass, EXTENSION__VALUE_MARKDOWN);
		createEReference(extensionEClass, EXTENSION__VALUE_OID);
		createEReference(extensionEClass, EXTENSION__VALUE_POSITIVE_INT);
		createEReference(extensionEClass, EXTENSION__VALUE_STRING);
		createEReference(extensionEClass, EXTENSION__VALUE_TIME);
		createEReference(extensionEClass, EXTENSION__VALUE_UNSIGNED_INT);
		createEReference(extensionEClass, EXTENSION__VALUE_URI);
		createEReference(extensionEClass, EXTENSION__VALUE_URL);
		createEReference(extensionEClass, EXTENSION__VALUE_UUID);
		createEReference(extensionEClass, EXTENSION__VALUE_ADDRESS);
		createEReference(extensionEClass, EXTENSION__VALUE_AGE);
		createEReference(extensionEClass, EXTENSION__VALUE_ANNOTATION);
		createEReference(extensionEClass, EXTENSION__VALUE_ATTACHMENT);
		createEReference(extensionEClass, EXTENSION__VALUE_CODEABLE_CONCEPT);
		createEReference(extensionEClass, EXTENSION__VALUE_CODEABLE_REFERENCE);
		createEReference(extensionEClass, EXTENSION__VALUE_CODING);
		createEReference(extensionEClass, EXTENSION__VALUE_CONTACT_POINT);
		createEReference(extensionEClass, EXTENSION__VALUE_COUNT);
		createEReference(extensionEClass, EXTENSION__VALUE_DISTANCE);
		createEReference(extensionEClass, EXTENSION__VALUE_DURATION);
		createEReference(extensionEClass, EXTENSION__VALUE_HUMAN_NAME);
		createEReference(extensionEClass, EXTENSION__VALUE_IDENTIFIER);
		createEReference(extensionEClass, EXTENSION__VALUE_MONEY);
		createEReference(extensionEClass, EXTENSION__VALUE_PERIOD);
		createEReference(extensionEClass, EXTENSION__VALUE_QUANTITY);
		createEReference(extensionEClass, EXTENSION__VALUE_RANGE);
		createEReference(extensionEClass, EXTENSION__VALUE_RATIO);
		createEReference(extensionEClass, EXTENSION__VALUE_RATIO_RANGE);
		createEReference(extensionEClass, EXTENSION__VALUE_REFERENCE);
		createEReference(extensionEClass, EXTENSION__VALUE_SAMPLED_DATA);
		createEReference(extensionEClass, EXTENSION__VALUE_SIGNATURE);
		createEReference(extensionEClass, EXTENSION__VALUE_TIMING);
		createEReference(extensionEClass, EXTENSION__VALUE_CONTACT_DETAIL);
		createEReference(extensionEClass, EXTENSION__VALUE_DATA_REQUIREMENT);
		createEReference(extensionEClass, EXTENSION__VALUE_EXPRESSION);
		createEReference(extensionEClass, EXTENSION__VALUE_PARAMETER_DEFINITION);
		createEReference(extensionEClass, EXTENSION__VALUE_RELATED_ARTIFACT);
		createEReference(extensionEClass, EXTENSION__VALUE_TRIGGER_DEFINITION);
		createEReference(extensionEClass, EXTENSION__VALUE_USAGE_CONTEXT);
		createEReference(extensionEClass, EXTENSION__VALUE_AVAILABILITY);
		createEReference(extensionEClass, EXTENSION__VALUE_EXTENDED_CONTACT_DETAIL);
		createEReference(extensionEClass, EXTENSION__VALUE_DOSAGE);
		createEReference(extensionEClass, EXTENSION__VALUE_META);
		createEAttribute(extensionEClass, EXTENSION__URL);

		httpVerbEClass = createEClass(HTTP_VERB);
		createEAttribute(httpVerbEClass, HTTP_VERB__VALUE);

		humanNameEClass = createEClass(HUMAN_NAME);
		createEReference(humanNameEClass, HUMAN_NAME__USE);
		createEReference(humanNameEClass, HUMAN_NAME__TEXT);
		createEReference(humanNameEClass, HUMAN_NAME__FAMILY);
		createEReference(humanNameEClass, HUMAN_NAME__GIVEN);
		createEReference(humanNameEClass, HUMAN_NAME__PREFIX);
		createEReference(humanNameEClass, HUMAN_NAME__SUFFIX);
		createEReference(humanNameEClass, HUMAN_NAME__PERIOD);

		idEClass = createEClass(ID);
		createEAttribute(idEClass, ID__VALUE);

		identifierEClass = createEClass(IDENTIFIER);
		createEReference(identifierEClass, IDENTIFIER__USE);
		createEReference(identifierEClass, IDENTIFIER__TYPE);
		createEReference(identifierEClass, IDENTIFIER__SYSTEM);
		createEReference(identifierEClass, IDENTIFIER__VALUE);
		createEReference(identifierEClass, IDENTIFIER__PERIOD);
		createEReference(identifierEClass, IDENTIFIER__ASSIGNER);

		identifierUseEClass = createEClass(IDENTIFIER_USE);
		createEAttribute(identifierUseEClass, IDENTIFIER_USE__VALUE);

		instantEClass = createEClass(INSTANT);
		createEAttribute(instantEClass, INSTANT__VALUE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		integer64EClass = createEClass(INTEGER64);
		createEAttribute(integer64EClass, INTEGER64__VALUE);

		linkRelationTypesEClass = createEClass(LINK_RELATION_TYPES);
		createEAttribute(linkRelationTypesEClass, LINK_RELATION_TYPES__VALUE);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__VALUE);

		markdownEClass = createEClass(MARKDOWN);
		createEAttribute(markdownEClass, MARKDOWN__VALUE);

		metaEClass = createEClass(META);
		createEReference(metaEClass, META__VERSION_ID);
		createEReference(metaEClass, META__LAST_UPDATED);
		createEReference(metaEClass, META__SOURCE);
		createEReference(metaEClass, META__PROFILE);
		createEReference(metaEClass, META__SECURITY);
		createEReference(metaEClass, META__TAG);

		moneyEClass = createEClass(MONEY);
		createEReference(moneyEClass, MONEY__VALUE);
		createEReference(moneyEClass, MONEY__CURRENCY);

		nameUseEClass = createEClass(NAME_USE);
		createEAttribute(nameUseEClass, NAME_USE__VALUE);

		narrativeEClass = createEClass(NARRATIVE);
		createEReference(narrativeEClass, NARRATIVE__STATUS);
		createEReference(narrativeEClass, NARRATIVE__DIV);

		narrativeStatusEClass = createEClass(NARRATIVE_STATUS);
		createEAttribute(narrativeStatusEClass, NARRATIVE_STATUS__VALUE);

		oidEClass = createEClass(OID);
		createEAttribute(oidEClass, OID__VALUE);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__USE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__MIN);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__MAX);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__DOCUMENTATION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__PROFILE);

		patientEClass = createEClass(PATIENT);
		createEReference(patientEClass, PATIENT__IDENTIFIER);
		createEReference(patientEClass, PATIENT__ACTIVE);
		createEReference(patientEClass, PATIENT__NAME);
		createEReference(patientEClass, PATIENT__TELECOM);
		createEReference(patientEClass, PATIENT__GENDER);
		createEReference(patientEClass, PATIENT__BIRTH_DATE);
		createEReference(patientEClass, PATIENT__DECEASED_BOOLEAN);
		createEReference(patientEClass, PATIENT__DECEASED_DATE_TIME);
		createEReference(patientEClass, PATIENT__ADDRESS);
		createEReference(patientEClass, PATIENT__MARITAL_STATUS);
		createEReference(patientEClass, PATIENT__MULTIPLE_BIRTH_BOOLEAN);
		createEReference(patientEClass, PATIENT__MULTIPLE_BIRTH_INTEGER);
		createEReference(patientEClass, PATIENT__PHOTO);
		createEReference(patientEClass, PATIENT__CONTACT);
		createEReference(patientEClass, PATIENT__COMMUNICATION);
		createEReference(patientEClass, PATIENT__GENERAL_PRACTITIONER);
		createEReference(patientEClass, PATIENT__MANAGING_ORGANIZATION);
		createEReference(patientEClass, PATIENT__LINK);
		createEAttribute(patientEClass, PATIENT__FAKE_ID);

		patientCommunicationEClass = createEClass(PATIENT_COMMUNICATION);
		createEReference(patientCommunicationEClass, PATIENT_COMMUNICATION__LANGUAGE);
		createEReference(patientCommunicationEClass, PATIENT_COMMUNICATION__PREFERRED);

		patientContactEClass = createEClass(PATIENT_CONTACT);
		createEReference(patientContactEClass, PATIENT_CONTACT__RELATIONSHIP);
		createEReference(patientContactEClass, PATIENT_CONTACT__NAME);
		createEReference(patientContactEClass, PATIENT_CONTACT__TELECOM);
		createEReference(patientContactEClass, PATIENT_CONTACT__ADDRESS);
		createEReference(patientContactEClass, PATIENT_CONTACT__GENDER);
		createEReference(patientContactEClass, PATIENT_CONTACT__ORGANIZATION);
		createEReference(patientContactEClass, PATIENT_CONTACT__PERIOD);

		patientLinkEClass = createEClass(PATIENT_LINK);
		createEReference(patientLinkEClass, PATIENT_LINK__OTHER);
		createEReference(patientLinkEClass, PATIENT_LINK__TYPE);

		periodEClass = createEClass(PERIOD);
		createEReference(periodEClass, PERIOD__START);
		createEReference(periodEClass, PERIOD__END);

		positiveIntEClass = createEClass(POSITIVE_INT);
		createEAttribute(positiveIntEClass, POSITIVE_INT__VALUE);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__VALUE);
		createEReference(quantityEClass, QUANTITY__COMPARATOR);
		createEReference(quantityEClass, QUANTITY__UNIT);
		createEReference(quantityEClass, QUANTITY__SYSTEM);
		createEReference(quantityEClass, QUANTITY__CODE);

		quantityComparatorEClass = createEClass(QUANTITY_COMPARATOR);
		createEAttribute(quantityComparatorEClass, QUANTITY_COMPARATOR__VALUE);

		rangeEClass = createEClass(RANGE);
		createEReference(rangeEClass, RANGE__LOW);
		createEReference(rangeEClass, RANGE__HIGH);

		ratioEClass = createEClass(RATIO);
		createEReference(ratioEClass, RATIO__NUMERATOR);
		createEReference(ratioEClass, RATIO__DENOMINATOR);

		ratioRangeEClass = createEClass(RATIO_RANGE);
		createEReference(ratioRangeEClass, RATIO_RANGE__LOW_NUMERATOR);
		createEReference(ratioRangeEClass, RATIO_RANGE__HIGH_NUMERATOR);
		createEReference(ratioRangeEClass, RATIO_RANGE__DENOMINATOR);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERENCE);
		createEReference(referenceEClass, REFERENCE__TYPE);
		createEReference(referenceEClass, REFERENCE__IDENTIFIER);
		createEReference(referenceEClass, REFERENCE__DISPLAY);

		relatedArtifactEClass = createEClass(RELATED_ARTIFACT);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__TYPE);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__CLASSIFIER);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__LABEL);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__DISPLAY);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__CITATION);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__DOCUMENT);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__RESOURCE);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__RESOURCE_REFERENCE);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__PUBLICATION_STATUS);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__PUBLICATION_DATE);

		relatedArtifactTypeEClass = createEClass(RELATED_ARTIFACT_TYPE);
		createEAttribute(relatedArtifactTypeEClass, RELATED_ARTIFACT_TYPE__VALUE);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__ID);
		createEReference(resourceEClass, RESOURCE__META);
		createEReference(resourceEClass, RESOURCE__IMPLICIT_RULES);
		createEReference(resourceEClass, RESOURCE__LANGUAGE);

		sampledDataEClass = createEClass(SAMPLED_DATA);
		createEReference(sampledDataEClass, SAMPLED_DATA__ORIGIN);
		createEReference(sampledDataEClass, SAMPLED_DATA__INTERVAL);
		createEReference(sampledDataEClass, SAMPLED_DATA__INTERVAL_UNIT);
		createEReference(sampledDataEClass, SAMPLED_DATA__FACTOR);
		createEReference(sampledDataEClass, SAMPLED_DATA__LOWER_LIMIT);
		createEReference(sampledDataEClass, SAMPLED_DATA__UPPER_LIMIT);
		createEReference(sampledDataEClass, SAMPLED_DATA__DIMENSIONS);
		createEReference(sampledDataEClass, SAMPLED_DATA__CODE_MAP);
		createEReference(sampledDataEClass, SAMPLED_DATA__OFFSETS);
		createEReference(sampledDataEClass, SAMPLED_DATA__DATA);

		sampledDataDataTypeEClass = createEClass(SAMPLED_DATA_DATA_TYPE);
		createEAttribute(sampledDataDataTypeEClass, SAMPLED_DATA_DATA_TYPE__VALUE);

		searchEntryModeEClass = createEClass(SEARCH_ENTRY_MODE);
		createEAttribute(searchEntryModeEClass, SEARCH_ENTRY_MODE__VALUE);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__TYPE);
		createEReference(signatureEClass, SIGNATURE__WHEN);
		createEReference(signatureEClass, SIGNATURE__WHO);
		createEReference(signatureEClass, SIGNATURE__ON_BEHALF_OF);
		createEReference(signatureEClass, SIGNATURE__TARGET_FORMAT);
		createEReference(signatureEClass, SIGNATURE__SIG_FORMAT);
		createEReference(signatureEClass, SIGNATURE__DATA);

		sortDirectionEClass = createEClass(SORT_DIRECTION);
		createEAttribute(sortDirectionEClass, SORT_DIRECTION__VALUE);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);

		timingEClass = createEClass(TIMING);
		createEReference(timingEClass, TIMING__EVENT);
		createEReference(timingEClass, TIMING__REPEAT);
		createEReference(timingEClass, TIMING__CODE);

		timingRepeatEClass = createEClass(TIMING_REPEAT);
		createEReference(timingRepeatEClass, TIMING_REPEAT__BOUNDS_DURATION);
		createEReference(timingRepeatEClass, TIMING_REPEAT__BOUNDS_RANGE);
		createEReference(timingRepeatEClass, TIMING_REPEAT__BOUNDS_PERIOD);
		createEReference(timingRepeatEClass, TIMING_REPEAT__COUNT);
		createEReference(timingRepeatEClass, TIMING_REPEAT__COUNT_MAX);
		createEReference(timingRepeatEClass, TIMING_REPEAT__DURATION);
		createEReference(timingRepeatEClass, TIMING_REPEAT__DURATION_MAX);
		createEReference(timingRepeatEClass, TIMING_REPEAT__DURATION_UNIT);
		createEReference(timingRepeatEClass, TIMING_REPEAT__FREQUENCY);
		createEReference(timingRepeatEClass, TIMING_REPEAT__FREQUENCY_MAX);
		createEReference(timingRepeatEClass, TIMING_REPEAT__PERIOD);
		createEReference(timingRepeatEClass, TIMING_REPEAT__PERIOD_MAX);
		createEReference(timingRepeatEClass, TIMING_REPEAT__PERIOD_UNIT);
		createEReference(timingRepeatEClass, TIMING_REPEAT__DAY_OF_WEEK);
		createEReference(timingRepeatEClass, TIMING_REPEAT__TIME_OF_DAY);
		createEReference(timingRepeatEClass, TIMING_REPEAT__WHEN);
		createEReference(timingRepeatEClass, TIMING_REPEAT__OFFSET);

		triggerDefinitionEClass = createEClass(TRIGGER_DEFINITION);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TYPE);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__NAME);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__CODE);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__SUBSCRIPTION_TOPIC);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TIMING_TIMING);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TIMING_REFERENCE);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TIMING_DATE);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TIMING_DATE_TIME);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__DATA);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__CONDITION);

		triggerTypeEClass = createEClass(TRIGGER_TYPE);
		createEAttribute(triggerTypeEClass, TRIGGER_TYPE__VALUE);

		unitsOfTimeEClass = createEClass(UNITS_OF_TIME);
		createEAttribute(unitsOfTimeEClass, UNITS_OF_TIME__VALUE);

		unsignedIntEClass = createEClass(UNSIGNED_INT);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__VALUE);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__VALUE);

		urlEClass = createEClass(URL);
		createEAttribute(urlEClass, URL__VALUE);

		usageContextEClass = createEClass(USAGE_CONTEXT);
		createEReference(usageContextEClass, USAGE_CONTEXT__CODE);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_QUANTITY);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_RANGE);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_REFERENCE);

		uuidEClass = createEClass(UUID);
		createEAttribute(uuidEClass, UUID__VALUE);

		// Create enums
		addressTypeEnumEEnum = createEEnum(ADDRESS_TYPE_ENUM);
		addressUseEnumEEnum = createEEnum(ADDRESS_USE_ENUM);
		administrativeGenderEnumEEnum = createEEnum(ADMINISTRATIVE_GENDER_ENUM);
		bundleTypeEnumEEnum = createEEnum(BUNDLE_TYPE_ENUM);
		contactPointSystemEnumEEnum = createEEnum(CONTACT_POINT_SYSTEM_ENUM);
		contactPointUseEnumEEnum = createEEnum(CONTACT_POINT_USE_ENUM);
		eventTimingEnumEEnum = createEEnum(EVENT_TIMING_ENUM);
		httpVerbEnumEEnum = createEEnum(HTTP_VERB_ENUM);
		identifierUseEnumEEnum = createEEnum(IDENTIFIER_USE_ENUM);
		linkRelationTypesEnumEEnum = createEEnum(LINK_RELATION_TYPES_ENUM);
		linkTypeEnumEEnum = createEEnum(LINK_TYPE_ENUM);
		nameUseEnumEEnum = createEEnum(NAME_USE_ENUM);
		narrativeStatusEnumEEnum = createEEnum(NARRATIVE_STATUS_ENUM);
		quantityComparatorEnumEEnum = createEEnum(QUANTITY_COMPARATOR_ENUM);
		relatedArtifactTypeEnumEEnum = createEEnum(RELATED_ARTIFACT_TYPE_ENUM);
		searchEntryModeEnumEEnum = createEEnum(SEARCH_ENTRY_MODE_ENUM);
		sortDirectionEnumEEnum = createEEnum(SORT_DIRECTION_ENUM);
		triggerTypeEnumEEnum = createEEnum(TRIGGER_TYPE_ENUM);
		unitsOfTimeEnumEEnum = createEEnum(UNITS_OF_TIME_ENUM);

		// Create data types
		base64BinaryPrimitiveEDataType = createEDataType(BASE64_BINARY_PRIMITIVE);
		booleanPrimitiveEDataType = createEDataType(BOOLEAN_PRIMITIVE);
		booleanPrimitiveObjectEDataType = createEDataType(BOOLEAN_PRIMITIVE_OBJECT);
		canonicalPrimitiveEDataType = createEDataType(CANONICAL_PRIMITIVE);
		codePrimitiveEDataType = createEDataType(CODE_PRIMITIVE);
		datePrimitiveEDataType = createEDataType(DATE_PRIMITIVE);
		datePrimitiveBaseEDataType = createEDataType(DATE_PRIMITIVE_BASE);
		dateTimePrimitiveEDataType = createEDataType(DATE_TIME_PRIMITIVE);
		dateTimePrimitiveBaseEDataType = createEDataType(DATE_TIME_PRIMITIVE_BASE);
		decimalPrimitiveEDataType = createEDataType(DECIMAL_PRIMITIVE);
		idPrimitiveEDataType = createEDataType(ID_PRIMITIVE);
		instantPrimitiveEDataType = createEDataType(INSTANT_PRIMITIVE);
		integer64PrimitiveEDataType = createEDataType(INTEGER64_PRIMITIVE);
		integer64PrimitiveObjectEDataType = createEDataType(INTEGER64_PRIMITIVE_OBJECT);
		integerPrimitiveEDataType = createEDataType(INTEGER_PRIMITIVE);
		integerPrimitiveObjectEDataType = createEDataType(INTEGER_PRIMITIVE_OBJECT);
		markdownPrimitiveEDataType = createEDataType(MARKDOWN_PRIMITIVE);
		oidPrimitiveEDataType = createEDataType(OID_PRIMITIVE);
		positiveIntPrimitiveEDataType = createEDataType(POSITIVE_INT_PRIMITIVE);
		sampledDataDataTypePrimitiveEDataType = createEDataType(SAMPLED_DATA_DATA_TYPE_PRIMITIVE);
		stringPrimitiveEDataType = createEDataType(STRING_PRIMITIVE);
		timePrimitiveEDataType = createEDataType(TIME_PRIMITIVE);
		unsignedIntPrimitiveEDataType = createEDataType(UNSIGNED_INT_PRIMITIVE);
		uriPrimitiveEDataType = createEDataType(URI_PRIMITIVE);
		urlPrimitiveEDataType = createEDataType(URL_PRIMITIVE);
		uuidPrimitiveEDataType = createEDataType(UUID_PRIMITIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XhtmlPackage theXhtmlPackage = (XhtmlPackage)EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressEClass.getESuperTypes().add(this.getDataType());
		addressTypeEClass.getESuperTypes().add(this.getElement());
		addressUseEClass.getESuperTypes().add(this.getElement());
		administrativeGenderEClass.getESuperTypes().add(this.getElement());
		ageEClass.getESuperTypes().add(this.getQuantity());
		annotationEClass.getESuperTypes().add(this.getDataType());
		attachmentEClass.getESuperTypes().add(this.getDataType());
		availabilityEClass.getESuperTypes().add(this.getDataType());
		availabilityAvailableTimeEClass.getESuperTypes().add(this.getDataType());
		availabilityNotAvailableTimeEClass.getESuperTypes().add(this.getDataType());
		backboneElementEClass.getESuperTypes().add(this.getElement());
		backboneTypeEClass.getESuperTypes().add(this.getDataType());
		base64BinaryEClass.getESuperTypes().add(this.getElement());
		binaryEClass.getESuperTypes().add(this.getResource());
		booleanEClass.getESuperTypes().add(this.getElement());
		bundleEClass.getESuperTypes().add(this.getResource());
		bundleEntryEClass.getESuperTypes().add(this.getBackboneElement());
		bundleLinkEClass.getESuperTypes().add(this.getBackboneElement());
		bundleRequestEClass.getESuperTypes().add(this.getBackboneElement());
		bundleResponseEClass.getESuperTypes().add(this.getBackboneElement());
		bundleSearchEClass.getESuperTypes().add(this.getBackboneElement());
		bundleTypeEClass.getESuperTypes().add(this.getElement());
		canonicalEClass.getESuperTypes().add(this.getElement());
		codeEClass.getESuperTypes().add(this.getElement());
		codeableConceptEClass.getESuperTypes().add(this.getDataType());
		codeableReferenceEClass.getESuperTypes().add(this.getDataType());
		codingEClass.getESuperTypes().add(this.getDataType());
		contactDetailEClass.getESuperTypes().add(this.getDataType());
		contactPointEClass.getESuperTypes().add(this.getDataType());
		contactPointSystemEClass.getESuperTypes().add(this.getElement());
		contactPointUseEClass.getESuperTypes().add(this.getElement());
		countEClass.getESuperTypes().add(this.getQuantity());
		dataRequirementEClass.getESuperTypes().add(this.getDataType());
		dataRequirementCodeFilterEClass.getESuperTypes().add(this.getDataType());
		dataRequirementDateFilterEClass.getESuperTypes().add(this.getDataType());
		dataRequirementSortEClass.getESuperTypes().add(this.getDataType());
		dataRequirementValueFilterEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(this.getElement());
		dateEClass.getESuperTypes().add(this.getElement());
		dateTimeEClass.getESuperTypes().add(this.getElement());
		decimalEClass.getESuperTypes().add(this.getElement());
		distanceEClass.getESuperTypes().add(this.getQuantity());
		domainResourceEClass.getESuperTypes().add(this.getResource());
		dosageEClass.getESuperTypes().add(this.getBackboneType());
		dosageDoseAndRateEClass.getESuperTypes().add(this.getBackboneType());
		durationEClass.getESuperTypes().add(this.getQuantity());
		elementEClass.getESuperTypes().add(this.getBase());
		eventTimingEClass.getESuperTypes().add(this.getElement());
		expressionEClass.getESuperTypes().add(this.getDataType());
		extendedContactDetailEClass.getESuperTypes().add(this.getDataType());
		extensionEClass.getESuperTypes().add(this.getDataType());
		httpVerbEClass.getESuperTypes().add(this.getElement());
		humanNameEClass.getESuperTypes().add(this.getDataType());
		idEClass.getESuperTypes().add(this.getElement());
		identifierEClass.getESuperTypes().add(this.getDataType());
		identifierUseEClass.getESuperTypes().add(this.getElement());
		instantEClass.getESuperTypes().add(this.getElement());
		integerEClass.getESuperTypes().add(this.getElement());
		integer64EClass.getESuperTypes().add(this.getElement());
		linkRelationTypesEClass.getESuperTypes().add(this.getElement());
		linkTypeEClass.getESuperTypes().add(this.getElement());
		markdownEClass.getESuperTypes().add(this.getElement());
		metaEClass.getESuperTypes().add(this.getDataType());
		moneyEClass.getESuperTypes().add(this.getDataType());
		nameUseEClass.getESuperTypes().add(this.getElement());
		narrativeEClass.getESuperTypes().add(this.getDataType());
		narrativeStatusEClass.getESuperTypes().add(this.getElement());
		oidEClass.getESuperTypes().add(this.getElement());
		parameterDefinitionEClass.getESuperTypes().add(this.getDataType());
		patientEClass.getESuperTypes().add(this.getDomainResource());
		patientCommunicationEClass.getESuperTypes().add(this.getBackboneElement());
		patientContactEClass.getESuperTypes().add(this.getBackboneElement());
		patientLinkEClass.getESuperTypes().add(this.getBackboneElement());
		periodEClass.getESuperTypes().add(this.getDataType());
		positiveIntEClass.getESuperTypes().add(this.getElement());
		quantityEClass.getESuperTypes().add(this.getDataType());
		quantityComparatorEClass.getESuperTypes().add(this.getElement());
		rangeEClass.getESuperTypes().add(this.getDataType());
		ratioEClass.getESuperTypes().add(this.getDataType());
		ratioRangeEClass.getESuperTypes().add(this.getDataType());
		referenceEClass.getESuperTypes().add(this.getDataType());
		relatedArtifactEClass.getESuperTypes().add(this.getDataType());
		relatedArtifactTypeEClass.getESuperTypes().add(this.getElement());
		resourceEClass.getESuperTypes().add(this.getBase());
		sampledDataEClass.getESuperTypes().add(this.getDataType());
		sampledDataDataTypeEClass.getESuperTypes().add(this.getElement());
		searchEntryModeEClass.getESuperTypes().add(this.getElement());
		signatureEClass.getESuperTypes().add(this.getDataType());
		sortDirectionEClass.getESuperTypes().add(this.getElement());
		stringEClass.getESuperTypes().add(this.getElement());
		timeEClass.getESuperTypes().add(this.getElement());
		timingEClass.getESuperTypes().add(this.getBackboneType());
		timingRepeatEClass.getESuperTypes().add(this.getBackboneType());
		triggerDefinitionEClass.getESuperTypes().add(this.getDataType());
		triggerTypeEClass.getESuperTypes().add(this.getElement());
		unitsOfTimeEClass.getESuperTypes().add(this.getElement());
		unsignedIntEClass.getESuperTypes().add(this.getElement());
		uriEClass.getESuperTypes().add(this.getElement());
		urlEClass.getESuperTypes().add(this.getElement());
		usageContextEClass.getESuperTypes().add(this.getDataType());
		uuidEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddress_Use(), this.getAddressUse(), null, "use", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Type(), this.getAddressType(), null, "type", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Text(), this.getString(), null, "text", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Line(), this.getString(), null, "line", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_City(), this.getString(), null, "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_District(), this.getString(), null, "district", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_State(), this.getString(), null, "state", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_PostalCode(), this.getString(), null, "postalCode", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Country(), this.getString(), null, "country", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Period(), this.getPeriod(), null, "period", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_Value(), this.getAddressTypeEnum(), "value", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressUseEClass, AddressUse.class, "AddressUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressUse_Value(), this.getAddressUseEnum(), "value", null, 0, 1, AddressUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrativeGenderEClass, AdministrativeGender.class, "AdministrativeGender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrativeGender_Value(), this.getAdministrativeGenderEnum(), "value", null, 0, 1, AdministrativeGender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageEClass, Age.class, "Age", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_AuthorReference(), this.getReference(), null, "authorReference", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_AuthorString(), this.getString(), null, "authorString", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Time(), this.getDateTime(), null, "time", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Text(), this.getMarkdown(), null, "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_ContentType(), this.getCode(), null, "contentType", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Language(), this.getCode(), null, "language", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Data(), this.getBase64Binary(), null, "data", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Url(), this.getUrl(), null, "url", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Size(), this.getInteger64(), null, "size", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Hash(), this.getBase64Binary(), null, "hash", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Title(), this.getString(), null, "title", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Creation(), this.getDateTime(), null, "creation", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Height(), this.getPositiveInt(), null, "height", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Width(), this.getPositiveInt(), null, "width", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Frames(), this.getPositiveInt(), null, "frames", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Duration(), this.getDecimal(), null, "duration", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Pages(), this.getPositiveInt(), null, "pages", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailability_AvailableTime(), this.getAvailabilityAvailableTime(), null, "availableTime", null, 0, -1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvailability_NotAvailableTime(), this.getAvailabilityNotAvailableTime(), null, "notAvailableTime", null, 0, -1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityAvailableTimeEClass, AvailabilityAvailableTime.class, "AvailabilityAvailableTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailabilityAvailableTime_DaysOfWeek(), this.getCode(), null, "daysOfWeek", null, 0, -1, AvailabilityAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvailabilityAvailableTime_AllDay(), this.getBoolean(), null, "allDay", null, 0, 1, AvailabilityAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvailabilityAvailableTime_AvailableStartTime(), this.getTime(), null, "availableStartTime", null, 0, 1, AvailabilityAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvailabilityAvailableTime_AvailableEndTime(), this.getTime(), null, "availableEndTime", null, 0, 1, AvailabilityAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityNotAvailableTimeEClass, AvailabilityNotAvailableTime.class, "AvailabilityNotAvailableTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailabilityNotAvailableTime_Description(), this.getString(), null, "description", null, 0, 1, AvailabilityNotAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvailabilityNotAvailableTime_During(), this.getPeriod(), null, "during", null, 0, 1, AvailabilityNotAvailableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backboneElementEClass, BackboneElement.class, "BackboneElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackboneElement_ModifierExtension(), this.getExtension(), null, "modifierExtension", null, 0, -1, BackboneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backboneTypeEClass, BackboneType.class, "BackboneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackboneType_ModifierExtension(), this.getExtension(), null, "modifierExtension", null, 0, -1, BackboneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(base64BinaryEClass, Base64Binary.class, "Base64Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Binary_Value(), this.getBase64BinaryPrimitive(), "value", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinary_ContentType(), this.getCode(), null, "contentType", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_SecurityContext(), this.getReference(), null, "securityContext", null, 0, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Data(), this.getBase64Binary(), null, "data", null, 0, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, org.hl7.fhir_patient.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), this.getBooleanPrimitive(), "value", null, 0, 1, org.hl7.fhir_patient.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundle_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Type(), this.getBundleType(), null, "type", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Timestamp(), this.getInstant(), null, "timestamp", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Total(), this.getUnsignedInt(), null, "total", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Link(), this.getBundleLink(), null, "link", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Entry(), this.getBundleEntry(), null, "entry", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Signature(), this.getSignature(), null, "signature", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEntryEClass, BundleEntry.class, "BundleEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleEntry_Link(), this.getBundleLink(), null, "link", null, 0, -1, BundleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleEntry_FullUrl(), this.getUri(), null, "fullUrl", null, 0, 1, BundleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleEntry_Search(), this.getBundleSearch(), null, "search", null, 0, 1, BundleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleEntry_Request(), this.getBundleRequest(), null, "request", null, 0, 1, BundleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleEntry_Response(), this.getBundleResponse(), null, "response", null, 0, 1, BundleEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleLinkEClass, BundleLink.class, "BundleLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleLink_Relation(), this.getLinkRelationTypes(), null, "relation", null, 1, 1, BundleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleLink_Url(), this.getUri(), null, "url", null, 1, 1, BundleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleRequestEClass, BundleRequest.class, "BundleRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleRequest_Method(), this.getHTTPVerb(), null, "method", null, 1, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleRequest_Url(), this.getUri(), null, "url", null, 1, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleRequest_IfNoneMatch(), this.getString(), null, "ifNoneMatch", null, 0, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleRequest_IfModifiedSince(), this.getInstant(), null, "ifModifiedSince", null, 0, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleRequest_IfMatch(), this.getString(), null, "ifMatch", null, 0, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleRequest_IfNoneExist(), this.getString(), null, "ifNoneExist", null, 0, 1, BundleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleResponseEClass, BundleResponse.class, "BundleResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleResponse_Status(), this.getString(), null, "status", null, 1, 1, BundleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleResponse_Location(), this.getUri(), null, "location", null, 0, 1, BundleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleResponse_Etag(), this.getString(), null, "etag", null, 0, 1, BundleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleResponse_LastModified(), this.getInstant(), null, "lastModified", null, 0, 1, BundleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleSearchEClass, BundleSearch.class, "BundleSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleSearch_Mode(), this.getSearchEntryMode(), null, "mode", null, 0, 1, BundleSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleSearch_Score(), this.getDecimal(), null, "score", null, 0, 1, BundleSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleTypeEClass, BundleType.class, "BundleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleType_Value(), this.getBundleTypeEnum(), "value", null, 0, 1, BundleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canonicalEClass, Canonical.class, "Canonical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanonical_Value(), this.getCanonicalPrimitive(), "value", null, 0, 1, Canonical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCode_Value(), this.getCodePrimitive(), "value", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeableConceptEClass, CodeableConcept.class, "CodeableConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeableConcept_Coding(), this.getCoding(), null, "coding", null, 0, -1, CodeableConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeableConcept_Text(), this.getString(), null, "text", null, 0, 1, CodeableConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeableReferenceEClass, CodeableReference.class, "CodeableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeableReference_Concept(), this.getCodeableConcept(), null, "concept", null, 0, 1, CodeableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeableReference_Reference(), this.getReference(), null, "reference", null, 0, 1, CodeableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codingEClass, Coding.class, "Coding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoding_System(), this.getUri(), null, "system", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Version(), this.getString(), null, "version", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Code(), this.getCode(), null, "code", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Display(), this.getString(), null, "display", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_UserSelected(), this.getBoolean(), null, "userSelected", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactDetailEClass, ContactDetail.class, "ContactDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactDetail_Name(), this.getString(), null, "name", null, 0, 1, ContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactDetail_Telecom(), this.getContactPoint(), null, "telecom", null, 0, -1, ContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPointEClass, ContactPoint.class, "ContactPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactPoint_System(), this.getContactPointSystem(), null, "system", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Value(), this.getString(), null, "value", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Use(), this.getContactPointUse(), null, "use", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Rank(), this.getPositiveInt(), null, "rank", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Period(), this.getPeriod(), null, "period", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPointSystemEClass, ContactPointSystem.class, "ContactPointSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactPointSystem_Value(), this.getContactPointSystemEnum(), "value", null, 0, 1, ContactPointSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPointUseEClass, ContactPointUse.class, "ContactPointUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactPointUse_Value(), this.getContactPointUseEnum(), "value", null, 0, 1, ContactPointUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRequirementEClass, DataRequirement.class, "DataRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirement_Type(), this.getCode(), null, "type", null, 1, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Profile(), this.getCanonical(), null, "profile", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_SubjectCodeableConcept(), this.getCodeableConcept(), null, "subjectCodeableConcept", null, 0, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_SubjectReference(), this.getReference(), null, "subjectReference", null, 0, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_MustSupport(), this.getString(), null, "mustSupport", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_CodeFilter(), this.getDataRequirementCodeFilter(), null, "codeFilter", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_DateFilter(), this.getDataRequirementDateFilter(), null, "dateFilter", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_ValueFilter(), this.getDataRequirementValueFilter(), null, "valueFilter", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Limit(), this.getPositiveInt(), null, "limit", null, 0, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Sort(), this.getDataRequirementSort(), null, "sort", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementCodeFilterEClass, DataRequirementCodeFilter.class, "DataRequirementCodeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementCodeFilter_Path(), this.getString(), null, "path", null, 0, 1, DataRequirementCodeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementCodeFilter_SearchParam(), this.getString(), null, "searchParam", null, 0, 1, DataRequirementCodeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementCodeFilter_ValueSet(), this.getCanonical(), null, "valueSet", null, 0, 1, DataRequirementCodeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementCodeFilter_Code(), this.getCoding(), null, "code", null, 0, -1, DataRequirementCodeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementDateFilterEClass, DataRequirementDateFilter.class, "DataRequirementDateFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementDateFilter_Path(), this.getString(), null, "path", null, 0, 1, DataRequirementDateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementDateFilter_SearchParam(), this.getString(), null, "searchParam", null, 0, 1, DataRequirementDateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementDateFilter_ValueDateTime(), this.getDateTime(), null, "valueDateTime", null, 0, 1, DataRequirementDateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementDateFilter_ValuePeriod(), this.getPeriod(), null, "valuePeriod", null, 0, 1, DataRequirementDateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementDateFilter_ValueDuration(), this.getDuration(), null, "valueDuration", null, 0, 1, DataRequirementDateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementSortEClass, DataRequirementSort.class, "DataRequirementSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementSort_Path(), this.getString(), null, "path", null, 1, 1, DataRequirementSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementSort_Direction(), this.getSortDirection(), null, "direction", null, 1, 1, DataRequirementSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementValueFilterEClass, DataRequirementValueFilter.class, "DataRequirementValueFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementValueFilter_Path(), this.getString(), null, "path", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementValueFilter_SearchParam(), this.getString(), null, "searchParam", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementValueFilter_Comparator(), this.getCode(), null, "comparator", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementValueFilter_ValueDateTime(), this.getDateTime(), null, "valueDateTime", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementValueFilter_ValuePeriod(), this.getPeriod(), null, "valuePeriod", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementValueFilter_ValueDuration(), this.getDuration(), null, "valueDuration", null, 0, 1, DataRequirementValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Value(), this.getDatePrimitive(), "value", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Value(), this.getDateTimePrimitive(), "value", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimal_Value(), this.getDecimalPrimitive(), "value", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceEClass, Distance.class, "Distance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainResourceEClass, DomainResource.class, "DomainResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainResource_Text(), this.getNarrative(), null, "text", null, 0, 1, DomainResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainResource_Extension(), this.getExtension(), null, "extension", null, 0, -1, DomainResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainResource_ModifierExtension(), this.getExtension(), null, "modifierExtension", null, 0, -1, DomainResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dosageEClass, Dosage.class, "Dosage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDosage_Sequence(), this.getInteger(), null, "sequence", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Text(), this.getString(), null, "text", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_AdditionalInstruction(), this.getCodeableConcept(), null, "additionalInstruction", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_PatientInstruction(), this.getString(), null, "patientInstruction", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Timing(), this.getTiming(), null, "timing", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_AsNeeded(), this.getBoolean(), null, "asNeeded", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_AsNeededFor(), this.getCodeableConcept(), null, "asNeededFor", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Site(), this.getCodeableConcept(), null, "site", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Route(), this.getCodeableConcept(), null, "route", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Method(), this.getCodeableConcept(), null, "method", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_DoseAndRate(), this.getDosageDoseAndRate(), null, "doseAndRate", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerPeriod(), this.getRatio(), null, "maxDosePerPeriod", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerAdministration(), this.getQuantity(), null, "maxDosePerAdministration", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerLifetime(), this.getQuantity(), null, "maxDosePerLifetime", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dosageDoseAndRateEClass, DosageDoseAndRate.class, "DosageDoseAndRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDosageDoseAndRate_Type(), this.getCodeableConcept(), null, "type", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageDoseAndRate_DoseRange(), this.getRange(), null, "doseRange", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageDoseAndRate_DoseQuantity(), this.getQuantity(), null, "doseQuantity", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageDoseAndRate_RateRatio(), this.getRatio(), null, "rateRatio", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageDoseAndRate_RateRange(), this.getRange(), null, "rateRange", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageDoseAndRate_RateQuantity(), this.getQuantity(), null, "rateQuantity", null, 0, 1, DosageDoseAndRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Extension(), this.getExtension(), null, "extension", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), this.getStringPrimitive(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTimingEClass, EventTiming.class, "EventTiming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventTiming_Value(), this.getEventTimingEnum(), "value", null, 0, 1, EventTiming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Description(), this.getString(), null, "description", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Name(), this.getCode(), null, "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Language(), this.getCode(), null, "language", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Expression(), this.getString(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Reference(), this.getUri(), null, "reference", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedContactDetailEClass, ExtendedContactDetail.class, "ExtendedContactDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedContactDetail_Purpose(), this.getCodeableConcept(), null, "purpose", null, 0, 1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedContactDetail_Name(), this.getHumanName(), null, "name", null, 0, -1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedContactDetail_Telecom(), this.getContactPoint(), null, "telecom", null, 0, -1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedContactDetail_Address(), this.getAddress(), null, "address", null, 0, 1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedContactDetail_Organization(), this.getReference(), null, "organization", null, 0, 1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedContactDetail_Period(), this.getPeriod(), null, "period", null, 0, 1, ExtendedContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_ValueBase64Binary(), this.getBase64Binary(), null, "valueBase64Binary", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueBoolean(), this.getBoolean(), null, "valueBoolean", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCanonical(), this.getCanonical(), null, "valueCanonical", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCode(), this.getCode(), null, "valueCode", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDate(), this.getDate(), null, "valueDate", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDateTime(), this.getDateTime(), null, "valueDateTime", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDecimal(), this.getDecimal(), null, "valueDecimal", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueId(), this.getId(), null, "valueId", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueInstant(), this.getInstant(), null, "valueInstant", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueInteger(), this.getInteger(), null, "valueInteger", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueInteger64(), this.getInteger64(), null, "valueInteger64", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueMarkdown(), this.getMarkdown(), null, "valueMarkdown", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueOid(), this.getOid(), null, "valueOid", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValuePositiveInt(), this.getPositiveInt(), null, "valuePositiveInt", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueString(), this.getString(), null, "valueString", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueTime(), this.getTime(), null, "valueTime", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueUnsignedInt(), this.getUnsignedInt(), null, "valueUnsignedInt", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueUri(), this.getUri(), null, "valueUri", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueUrl(), this.getUrl(), null, "valueUrl", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueUuid(), this.getUuid(), null, "valueUuid", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueAddress(), this.getAddress(), null, "valueAddress", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueAge(), this.getAge(), null, "valueAge", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueAnnotation(), this.getAnnotation(), null, "valueAnnotation", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueAttachment(), this.getAttachment(), null, "valueAttachment", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCodeableConcept(), this.getCodeableConcept(), null, "valueCodeableConcept", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCodeableReference(), this.getCodeableReference(), null, "valueCodeableReference", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCoding(), this.getCoding(), null, "valueCoding", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueContactPoint(), this.getContactPoint(), null, "valueContactPoint", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueCount(), this.getCount(), null, "valueCount", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDistance(), this.getDistance(), null, "valueDistance", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDuration(), this.getDuration(), null, "valueDuration", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueHumanName(), this.getHumanName(), null, "valueHumanName", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueIdentifier(), this.getIdentifier(), null, "valueIdentifier", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueMoney(), this.getMoney(), null, "valueMoney", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValuePeriod(), this.getPeriod(), null, "valuePeriod", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueQuantity(), this.getQuantity(), null, "valueQuantity", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueRange(), this.getRange(), null, "valueRange", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueRatio(), this.getRatio(), null, "valueRatio", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueRatioRange(), this.getRatioRange(), null, "valueRatioRange", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueReference(), this.getReference(), null, "valueReference", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueSampledData(), this.getSampledData(), null, "valueSampledData", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueSignature(), this.getSignature(), null, "valueSignature", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueTiming(), this.getTiming(), null, "valueTiming", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueContactDetail(), this.getContactDetail(), null, "valueContactDetail", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDataRequirement(), this.getDataRequirement(), null, "valueDataRequirement", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueExpression(), this.getExpression(), null, "valueExpression", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueParameterDefinition(), this.getParameterDefinition(), null, "valueParameterDefinition", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueRelatedArtifact(), this.getRelatedArtifact(), null, "valueRelatedArtifact", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueTriggerDefinition(), this.getTriggerDefinition(), null, "valueTriggerDefinition", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueUsageContext(), this.getUsageContext(), null, "valueUsageContext", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueAvailability(), this.getAvailability(), null, "valueAvailability", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueExtendedContactDetail(), this.getExtendedContactDetail(), null, "valueExtendedContactDetail", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueDosage(), this.getDosage(), null, "valueDosage", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ValueMeta(), this.getMeta(), null, "valueMeta", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Url(), this.getUriPrimitive(), "url", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpVerbEClass, HTTPVerb.class, "HTTPVerb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPVerb_Value(), this.getHTTPVerbEnum(), "value", null, 0, 1, HTTPVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanNameEClass, HumanName.class, "HumanName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanName_Use(), this.getNameUse(), null, "use", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Text(), this.getString(), null, "text", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Family(), this.getString(), null, "family", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Given(), this.getString(), null, "given", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Prefix(), this.getString(), null, "prefix", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Suffix(), this.getString(), null, "suffix", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Period(), this.getPeriod(), null, "period", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getId_Value(), this.getIdPrimitive(), "value", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifier_Use(), this.getIdentifierUse(), null, "use", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Type(), this.getCodeableConcept(), null, "type", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_System(), this.getUri(), null, "system", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Value(), this.getString(), null, "value", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Period(), this.getPeriod(), null, "period", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Assigner(), this.getReference(), null, "assigner", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierUseEClass, IdentifierUse.class, "IdentifierUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierUse_Value(), this.getIdentifierUseEnum(), "value", null, 0, 1, IdentifierUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantEClass, Instant.class, "Instant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstant_Value(), this.getInstantPrimitive(), "value", null, 0, 1, Instant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, org.hl7.fhir_patient.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), this.getIntegerPrimitive(), "value", null, 0, 1, org.hl7.fhir_patient.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integer64EClass, Integer64.class, "Integer64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger64_Value(), this.getInteger64Primitive(), "value", null, 0, 1, Integer64.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkRelationTypesEClass, LinkRelationTypes.class, "LinkRelationTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkRelationTypes_Value(), this.getLinkRelationTypesEnum(), "value", null, 0, 1, LinkRelationTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Value(), this.getLinkTypeEnum(), "value", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markdownEClass, Markdown.class, "Markdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkdown_Value(), this.getMarkdownPrimitive(), "value", null, 0, 1, Markdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeta_VersionId(), this.getId(), null, "versionId", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_LastUpdated(), this.getInstant(), null, "lastUpdated", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Source(), this.getUri(), null, "source", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Profile(), this.getCanonical(), null, "profile", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Security(), this.getCoding(), null, "security", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Tag(), this.getCoding(), null, "tag", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moneyEClass, Money.class, "Money", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoney_Value(), this.getDecimal(), null, "value", null, 0, 1, Money.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoney_Currency(), this.getCode(), null, "currency", null, 0, 1, Money.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameUseEClass, NameUse.class, "NameUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameUse_Value(), this.getNameUseEnum(), "value", null, 0, 1, NameUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(narrativeEClass, Narrative.class, "Narrative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNarrative_Status(), this.getNarrativeStatus(), null, "status", null, 1, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNarrative_Div(), theXhtmlPackage.getDivType(), null, "div", null, 1, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(narrativeStatusEClass, NarrativeStatus.class, "NarrativeStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNarrativeStatus_Value(), this.getNarrativeStatusEnum(), "value", null, 0, 1, NarrativeStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oidEClass, Oid.class, "Oid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOid_Value(), this.getOidPrimitive(), "value", null, 0, 1, Oid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterDefinition_Name(), this.getCode(), null, "name", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Use(), this.getCode(), null, "use", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Min(), this.getInteger(), null, "min", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Max(), this.getString(), null, "max", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Documentation(), this.getString(), null, "documentation", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Type(), this.getCode(), null, "type", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Profile(), this.getCanonical(), null, "profile", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatient_Identifier(), this.getIdentifier(), null, "identifier", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Active(), this.getBoolean(), null, "active", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Name(), this.getHumanName(), null, "name", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Telecom(), this.getContactPoint(), null, "telecom", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Gender(), this.getAdministrativeGender(), null, "gender", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_BirthDate(), this.getDate(), null, "birthDate", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_DeceasedBoolean(), this.getBoolean(), null, "deceasedBoolean", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_DeceasedDateTime(), this.getDateTime(), null, "deceasedDateTime", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Address(), this.getAddress(), null, "address", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_MaritalStatus(), this.getCodeableConcept(), null, "maritalStatus", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_MultipleBirthBoolean(), this.getBoolean(), null, "multipleBirthBoolean", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_MultipleBirthInteger(), this.getInteger(), null, "multipleBirthInteger", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Photo(), this.getAttachment(), null, "photo", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Contact(), this.getPatientContact(), null, "contact", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Communication(), this.getPatientCommunication(), null, "communication", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_GeneralPractitioner(), this.getReference(), null, "generalPractitioner", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_ManagingOrganization(), this.getReference(), null, "managingOrganization", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Link(), this.getPatientLink(), null, "link", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_FakeId(), ecorePackage.getEString(), "fakeId", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientCommunicationEClass, PatientCommunication.class, "PatientCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientCommunication_Language(), this.getCodeableConcept(), null, "language", null, 1, 1, PatientCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientCommunication_Preferred(), this.getBoolean(), null, "preferred", null, 0, 1, PatientCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientContactEClass, PatientContact.class, "PatientContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientContact_Relationship(), this.getCodeableConcept(), null, "relationship", null, 0, -1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Name(), this.getHumanName(), null, "name", null, 0, 1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Telecom(), this.getContactPoint(), null, "telecom", null, 0, -1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Address(), this.getAddress(), null, "address", null, 0, 1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Gender(), this.getAdministrativeGender(), null, "gender", null, 0, 1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Organization(), this.getReference(), null, "organization", null, 0, 1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientContact_Period(), this.getPeriod(), null, "period", null, 0, 1, PatientContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientLinkEClass, PatientLink.class, "PatientLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientLink_Other(), this.getReference(), null, "other", null, 1, 1, PatientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientLink_Type(), this.getLinkType(), null, "type", null, 1, 1, PatientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriod_Start(), this.getDateTime(), null, "start", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriod_End(), this.getDateTime(), null, "end", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positiveIntEClass, PositiveInt.class, "PositiveInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositiveInt_Value(), this.getPositiveIntPrimitive(), "value", null, 0, 1, PositiveInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_Value(), this.getDecimal(), null, "value", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Comparator(), this.getQuantityComparator(), null, "comparator", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Unit(), this.getString(), null, "unit", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_System(), this.getUri(), null, "system", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Code(), this.getCode(), null, "code", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityComparatorEClass, QuantityComparator.class, "QuantityComparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantityComparator_Value(), this.getQuantityComparatorEnum(), "value", null, 0, 1, QuantityComparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRange_Low(), this.getQuantity(), null, "low", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRange_High(), this.getQuantity(), null, "high", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioEClass, Ratio.class, "Ratio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRatio_Numerator(), this.getQuantity(), null, "numerator", null, 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRatio_Denominator(), this.getQuantity(), null, "denominator", null, 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioRangeEClass, RatioRange.class, "RatioRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRatioRange_LowNumerator(), this.getQuantity(), null, "lowNumerator", null, 0, 1, RatioRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRatioRange_HighNumerator(), this.getQuantity(), null, "highNumerator", null, 0, 1, RatioRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRatioRange_Denominator(), this.getQuantity(), null, "denominator", null, 0, 1, RatioRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Reference(), this.getString(), null, "reference", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Type(), this.getUri(), null, "type", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Display(), this.getString(), null, "display", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedArtifactEClass, RelatedArtifact.class, "RelatedArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedArtifact_Type(), this.getRelatedArtifactType(), null, "type", null, 1, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Classifier(), this.getCodeableConcept(), null, "classifier", null, 0, -1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Label(), this.getString(), null, "label", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Display(), this.getString(), null, "display", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Citation(), this.getMarkdown(), null, "citation", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Document(), this.getAttachment(), null, "document", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Resource(), this.getCanonical(), null, "resource", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_ResourceReference(), this.getReference(), null, "resourceReference", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_PublicationStatus(), this.getCode(), null, "publicationStatus", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_PublicationDate(), this.getDate(), null, "publicationDate", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedArtifactTypeEClass, RelatedArtifactType.class, "RelatedArtifactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatedArtifactType_Value(), this.getRelatedArtifactTypeEnum(), "value", null, 0, 1, RelatedArtifactType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Id(), this.getId(), null, "id", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Meta(), this.getMeta(), null, "meta", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ImplicitRules(), this.getUri(), null, "implicitRules", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Language(), this.getCode(), null, "language", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampledDataEClass, SampledData.class, "SampledData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampledData_Origin(), this.getQuantity(), null, "origin", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Interval(), this.getDecimal(), null, "interval", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_IntervalUnit(), this.getCode(), null, "intervalUnit", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Factor(), this.getDecimal(), null, "factor", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_LowerLimit(), this.getDecimal(), null, "lowerLimit", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_UpperLimit(), this.getDecimal(), null, "upperLimit", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Dimensions(), this.getPositiveInt(), null, "dimensions", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_CodeMap(), this.getCanonical(), null, "codeMap", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Offsets(), this.getString(), null, "offsets", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Data(), this.getSampledDataDataType(), null, "data", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampledDataDataTypeEClass, SampledDataDataType.class, "SampledDataDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampledDataDataType_Value(), this.getSampledDataDataTypePrimitive(), "value", null, 0, 1, SampledDataDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchEntryModeEClass, SearchEntryMode.class, "SearchEntryMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchEntryMode_Value(), this.getSearchEntryModeEnum(), "value", null, 0, 1, SearchEntryMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Type(), this.getCoding(), null, "type", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_When(), this.getInstant(), null, "when", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Who(), this.getReference(), null, "who", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_OnBehalfOf(), this.getReference(), null, "onBehalfOf", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_TargetFormat(), this.getCode(), null, "targetFormat", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_SigFormat(), this.getCode(), null, "sigFormat", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Data(), this.getBase64Binary(), null, "data", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortDirectionEClass, SortDirection.class, "SortDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortDirection_Value(), this.getSortDirectionEnum(), "value", null, 0, 1, SortDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, org.hl7.fhir_patient.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), this.getStringPrimitive(), "value", null, 0, 1, org.hl7.fhir_patient.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), this.getTimePrimitive(), "value", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTiming_Event(), this.getDateTime(), null, "event", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Repeat(), this.getTimingRepeat(), null, "repeat", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Code(), this.getCodeableConcept(), null, "code", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingRepeatEClass, TimingRepeat.class, "TimingRepeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingRepeat_BoundsDuration(), this.getDuration(), null, "boundsDuration", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_BoundsRange(), this.getRange(), null, "boundsRange", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_BoundsPeriod(), this.getPeriod(), null, "boundsPeriod", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_Count(), this.getPositiveInt(), null, "count", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_CountMax(), this.getPositiveInt(), null, "countMax", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_Duration(), this.getDecimal(), null, "duration", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_DurationMax(), this.getDecimal(), null, "durationMax", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_DurationUnit(), this.getUnitsOfTime(), null, "durationUnit", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_Frequency(), this.getPositiveInt(), null, "frequency", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_FrequencyMax(), this.getPositiveInt(), null, "frequencyMax", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_Period(), this.getDecimal(), null, "period", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_PeriodMax(), this.getDecimal(), null, "periodMax", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_PeriodUnit(), this.getUnitsOfTime(), null, "periodUnit", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_DayOfWeek(), this.getCode(), null, "dayOfWeek", null, 0, -1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_TimeOfDay(), this.getTime(), null, "timeOfDay", null, 0, -1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_When(), this.getEventTiming(), null, "when", null, 0, -1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingRepeat_Offset(), this.getUnsignedInt(), null, "offset", null, 0, 1, TimingRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerDefinitionEClass, TriggerDefinition.class, "TriggerDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerDefinition_Type(), this.getTriggerType(), null, "type", null, 1, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Name(), this.getString(), null, "name", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Code(), this.getCodeableConcept(), null, "code", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_SubscriptionTopic(), this.getCanonical(), null, "subscriptionTopic", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_TimingTiming(), this.getTiming(), null, "timingTiming", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_TimingReference(), this.getReference(), null, "timingReference", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_TimingDate(), this.getDate(), null, "timingDate", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_TimingDateTime(), this.getDateTime(), null, "timingDateTime", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Data(), this.getDataRequirement(), null, "data", null, 0, -1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Condition(), this.getExpression(), null, "condition", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerTypeEClass, TriggerType.class, "TriggerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerType_Value(), this.getTriggerTypeEnum(), "value", null, 0, 1, TriggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitsOfTimeEClass, UnitsOfTime.class, "UnitsOfTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitsOfTime_Value(), this.getUnitsOfTimeEnum(), "value", null, 0, 1, UnitsOfTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedIntEClass, UnsignedInt.class, "UnsignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedInt_Value(), this.getUnsignedIntPrimitive(), "value", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriEClass, Uri.class, "Uri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUri_Value(), this.getUriPrimitive(), "value", null, 0, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrl_Value(), this.getUrlPrimitive(), "value", null, 0, 1, Url.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageContextEClass, UsageContext.class, "UsageContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageContext_Code(), this.getCoding(), null, "code", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueCodeableConcept(), this.getCodeableConcept(), null, "valueCodeableConcept", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueQuantity(), this.getQuantity(), null, "valueQuantity", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueRange(), this.getRange(), null, "valueRange", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueReference(), this.getReference(), null, "valueReference", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uuidEClass, Uuid.class, "Uuid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUuid_Value(), this.getUuidPrimitive(), "value", null, 0, 1, Uuid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(addressTypeEnumEEnum, AddressTypeEnum.class, "AddressTypeEnum");
		addEEnumLiteral(addressTypeEnumEEnum, AddressTypeEnum.POSTAL);
		addEEnumLiteral(addressTypeEnumEEnum, AddressTypeEnum.PHYSICAL);
		addEEnumLiteral(addressTypeEnumEEnum, AddressTypeEnum.BOTH);

		initEEnum(addressUseEnumEEnum, AddressUseEnum.class, "AddressUseEnum");
		addEEnumLiteral(addressUseEnumEEnum, AddressUseEnum.HOME);
		addEEnumLiteral(addressUseEnumEEnum, AddressUseEnum.WORK);
		addEEnumLiteral(addressUseEnumEEnum, AddressUseEnum.TEMP);
		addEEnumLiteral(addressUseEnumEEnum, AddressUseEnum.OLD);
		addEEnumLiteral(addressUseEnumEEnum, AddressUseEnum.BILLING);

		initEEnum(administrativeGenderEnumEEnum, AdministrativeGenderEnum.class, "AdministrativeGenderEnum");
		addEEnumLiteral(administrativeGenderEnumEEnum, AdministrativeGenderEnum.MALE);
		addEEnumLiteral(administrativeGenderEnumEEnum, AdministrativeGenderEnum.FEMALE);
		addEEnumLiteral(administrativeGenderEnumEEnum, AdministrativeGenderEnum.OTHER);
		addEEnumLiteral(administrativeGenderEnumEEnum, AdministrativeGenderEnum.UNKNOWN);

		initEEnum(bundleTypeEnumEEnum, BundleTypeEnum.class, "BundleTypeEnum");
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.DOCUMENT);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.MESSAGE);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.TRANSACTION);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.TRANSACTION_RESPONSE);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.BATCH);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.BATCH_RESPONSE);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.HISTORY);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.SEARCHSET);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.COLLECTION);
		addEEnumLiteral(bundleTypeEnumEEnum, BundleTypeEnum.SUBSCRIPTION_NOTIFICATION);

		initEEnum(contactPointSystemEnumEEnum, ContactPointSystemEnum.class, "ContactPointSystemEnum");
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.PHONE);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.FAX);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.EMAIL);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.PAGER);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.URL);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.SMS);
		addEEnumLiteral(contactPointSystemEnumEEnum, ContactPointSystemEnum.OTHER);

		initEEnum(contactPointUseEnumEEnum, ContactPointUseEnum.class, "ContactPointUseEnum");
		addEEnumLiteral(contactPointUseEnumEEnum, ContactPointUseEnum.HOME);
		addEEnumLiteral(contactPointUseEnumEEnum, ContactPointUseEnum.WORK);
		addEEnumLiteral(contactPointUseEnumEEnum, ContactPointUseEnum.TEMP);
		addEEnumLiteral(contactPointUseEnumEEnum, ContactPointUseEnum.OLD);
		addEEnumLiteral(contactPointUseEnumEEnum, ContactPointUseEnum.MOBILE);

		initEEnum(eventTimingEnumEEnum, EventTimingEnum.class, "EventTimingEnum");
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.MORN);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.MORN_EARLY);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.MORN_LATE);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.NOON);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.AFT);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.AFT_EARLY);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.AFT_LATE);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.EVE);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.EVE_EARLY);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.EVE_LATE);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.NIGHT);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.PHS);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.IMD);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.HS);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.WAKE);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.C);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.CM);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.CD);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.CV);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.AC);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.ACM);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.ACD);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.ACV);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.PC);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.PCM);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.PCD);
		addEEnumLiteral(eventTimingEnumEEnum, EventTimingEnum.PCV);

		initEEnum(httpVerbEnumEEnum, HTTPVerbEnum.class, "HTTPVerbEnum");
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.GET);
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.HEAD);
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.POST);
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.PUT);
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.DELETE);
		addEEnumLiteral(httpVerbEnumEEnum, HTTPVerbEnum.PATCH);

		initEEnum(identifierUseEnumEEnum, IdentifierUseEnum.class, "IdentifierUseEnum");
		addEEnumLiteral(identifierUseEnumEEnum, IdentifierUseEnum.USUAL);
		addEEnumLiteral(identifierUseEnumEEnum, IdentifierUseEnum.OFFICIAL);
		addEEnumLiteral(identifierUseEnumEEnum, IdentifierUseEnum.TEMP);
		addEEnumLiteral(identifierUseEnumEEnum, IdentifierUseEnum.SECONDARY);
		addEEnumLiteral(identifierUseEnumEEnum, IdentifierUseEnum.OLD);

		initEEnum(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.class, "LinkRelationTypesEnum");
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ABOUT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ACL);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ALTERNATE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.AMPHTML);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.APPENDIX);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.APPLE_TOUCH_ICON);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.APPLE_TOUCH_STARTUP_IMAGE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ARCHIVES);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.AUTHOR);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.BLOCKED_BY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.BOOKMARK);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CANONICAL);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CHAPTER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CITE_AS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.COLLECTION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CONTENTS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CONVERTED_FROM);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.COPYRIGHT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CREATE_FORM);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.CURRENT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.DESCRIBEDBY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.DESCRIBES);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.DISCLOSURE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.DNS_PREFETCH);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.DUPLICATE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.EDIT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.EDIT_FORM);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.EDIT_MEDIA);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ENCLOSURE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.EXTERNAL);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.FIRST);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.GLOSSARY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.HELP);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.HOSTS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.HUB);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ICON);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INDEX);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_AFTER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_BEFORE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_CONTAINS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_DISJOINT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_DURING);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_EQUALS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_FINISHED_BY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_FINISHES);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_IN);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_MEETS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_MET_BY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_OVERLAPPED_BY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_OVERLAPS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_STARTED_BY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.INTERVAL_STARTS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ITEM);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.LAST);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.LATEST_VERSION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.LICENSE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.LINKSET);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.LRDD);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MANIFEST);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MASK_ICON);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MEDIA_FEED);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MEMENTO);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MICROPUB);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MODULEPRELOAD);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MONITOR);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.MONITOR_GROUP);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.NEXT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.NEXT_ARCHIVE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.NOFOLLOW);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.NOOPENER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.NOREFERRER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.OPENER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.OPENID2_LOCAL_ID);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.OPENID2_PROVIDER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.ORIGINAL);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.P3_PV1);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PAYMENT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PINGBACK);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PRECONNECT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREDECESSOR_VERSION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREFETCH);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PRELOAD);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PRERENDER);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREV);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREVIEW);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREVIOUS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PREV_ARCHIVE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PRIVACY_POLICY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PROFILE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.PUBLICATION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.RELATED);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.RESTCONF);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.REPLIES);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.RULEINPUT);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SEARCH);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SECTION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SELF);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SERVICE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SERVICE_DESC);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SERVICE_DOC);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SERVICE_META);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SPONSORED);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.START);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.STATUS);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.STYLESHEET);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SUBSECTION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SUCCESSOR_VERSION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.SUNSET);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.TAG);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.TERMS_OF_SERVICE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.TIMEGATE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.TIMEMAP);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.TYPE);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.UGC);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.UP);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.VERSION_HISTORY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.VIA);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.WEBMENTION);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.WORKING_COPY);
		addEEnumLiteral(linkRelationTypesEnumEEnum, LinkRelationTypesEnum.WORKING_COPY_OF);

		initEEnum(linkTypeEnumEEnum, LinkTypeEnum.class, "LinkTypeEnum");
		addEEnumLiteral(linkTypeEnumEEnum, LinkTypeEnum.REPLACED_BY);
		addEEnumLiteral(linkTypeEnumEEnum, LinkTypeEnum.REPLACES);
		addEEnumLiteral(linkTypeEnumEEnum, LinkTypeEnum.REFER);
		addEEnumLiteral(linkTypeEnumEEnum, LinkTypeEnum.SEEALSO);

		initEEnum(nameUseEnumEEnum, NameUseEnum.class, "NameUseEnum");
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.USUAL);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.OFFICIAL);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.TEMP);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.NICKNAME);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.ANONYMOUS);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.OLD);
		addEEnumLiteral(nameUseEnumEEnum, NameUseEnum.MAIDEN);

		initEEnum(narrativeStatusEnumEEnum, NarrativeStatusEnum.class, "NarrativeStatusEnum");
		addEEnumLiteral(narrativeStatusEnumEEnum, NarrativeStatusEnum.GENERATED);
		addEEnumLiteral(narrativeStatusEnumEEnum, NarrativeStatusEnum.EXTENSIONS);
		addEEnumLiteral(narrativeStatusEnumEEnum, NarrativeStatusEnum.ADDITIONAL);
		addEEnumLiteral(narrativeStatusEnumEEnum, NarrativeStatusEnum.EMPTY);

		initEEnum(quantityComparatorEnumEEnum, QuantityComparatorEnum.class, "QuantityComparatorEnum");
		addEEnumLiteral(quantityComparatorEnumEEnum, QuantityComparatorEnum.__);
		addEEnumLiteral(quantityComparatorEnumEEnum, QuantityComparatorEnum._1);
		addEEnumLiteral(quantityComparatorEnumEEnum, QuantityComparatorEnum._2);
		addEEnumLiteral(quantityComparatorEnumEEnum, QuantityComparatorEnum._3);
		addEEnumLiteral(quantityComparatorEnumEEnum, QuantityComparatorEnum.AD);

		initEEnum(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.class, "RelatedArtifactTypeEnum");
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.DOCUMENTATION);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.JUSTIFICATION);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CITATION);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.PREDECESSOR);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SUCCESSOR);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.DERIVED_FROM);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.DEPENDS_ON);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.COMPOSED_OF);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.PART_OF);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.AMENDS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.AMENDED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.APPENDS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.APPENDED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CITES);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CITED_BY);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.COMMENTS_ON);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.COMMENT_IN);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CONTAINS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CONTAINED_IN);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CORRECTS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CORRECTION_IN);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.REPLACES);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.REPLACED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.RETRACTS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.RETRACTED_BY);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SIGNS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SIMILAR_TO);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SUPPORTS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SUPPORTED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.TRANSFORMS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.TRANSFORMED_INTO);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.TRANSFORMED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.DOCUMENTS);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.SPECIFICATION_OF);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CREATED_WITH);
		addEEnumLiteral(relatedArtifactTypeEnumEEnum, RelatedArtifactTypeEnum.CITE_AS);

		initEEnum(searchEntryModeEnumEEnum, SearchEntryModeEnum.class, "SearchEntryModeEnum");
		addEEnumLiteral(searchEntryModeEnumEEnum, SearchEntryModeEnum.MATCH);
		addEEnumLiteral(searchEntryModeEnumEEnum, SearchEntryModeEnum.INCLUDE);
		addEEnumLiteral(searchEntryModeEnumEEnum, SearchEntryModeEnum.OUTCOME);

		initEEnum(sortDirectionEnumEEnum, SortDirectionEnum.class, "SortDirectionEnum");
		addEEnumLiteral(sortDirectionEnumEEnum, SortDirectionEnum.ASCENDING);
		addEEnumLiteral(sortDirectionEnumEEnum, SortDirectionEnum.DESCENDING);

		initEEnum(triggerTypeEnumEEnum, TriggerTypeEnum.class, "TriggerTypeEnum");
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.NAMED_EVENT);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.PERIODIC);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_CHANGED);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_ADDED);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_MODIFIED);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_REMOVED);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_ACCESSED);
		addEEnumLiteral(triggerTypeEnumEEnum, TriggerTypeEnum.DATA_ACCESS_ENDED);

		initEEnum(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.class, "UnitsOfTimeEnum");
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.S);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.MIN);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.H);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.D);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.WK);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.MO);
		addEEnumLiteral(unitsOfTimeEnumEEnum, UnitsOfTimeEnum.A);

		// Initialize data types
		initEDataType(base64BinaryPrimitiveEDataType, byte[].class, "Base64BinaryPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanPrimitiveEDataType, boolean.class, "BooleanPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanPrimitiveObjectEDataType, Boolean.class, "BooleanPrimitiveObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(canonicalPrimitiveEDataType, String.class, "CanonicalPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(codePrimitiveEDataType, String.class, "CodePrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datePrimitiveEDataType, XMLGregorianCalendar.class, "DatePrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datePrimitiveBaseEDataType, XMLGregorianCalendar.class, "DatePrimitiveBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimePrimitiveEDataType, XMLGregorianCalendar.class, "DateTimePrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimePrimitiveBaseEDataType, XMLGregorianCalendar.class, "DateTimePrimitiveBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalPrimitiveEDataType, Object.class, "DecimalPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idPrimitiveEDataType, String.class, "IdPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instantPrimitiveEDataType, XMLGregorianCalendar.class, "InstantPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integer64PrimitiveEDataType, long.class, "Integer64Primitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integer64PrimitiveObjectEDataType, Long.class, "Integer64PrimitiveObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerPrimitiveEDataType, int.class, "IntegerPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerPrimitiveObjectEDataType, Integer.class, "IntegerPrimitiveObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(markdownPrimitiveEDataType, String.class, "MarkdownPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oidPrimitiveEDataType, String.class, "OidPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntPrimitiveEDataType, BigInteger.class, "PositiveIntPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sampledDataDataTypePrimitiveEDataType, String.class, "SampledDataDataTypePrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringPrimitiveEDataType, String.class, "StringPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timePrimitiveEDataType, XMLGregorianCalendar.class, "TimePrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedIntPrimitiveEDataType, BigInteger.class, "UnsignedIntPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriPrimitiveEDataType, String.class, "UriPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlPrimitiveEDataType, String.class, "UrlPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidPrimitiveEDataType, String.class, "UuidPrimitive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "5.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (addressEClass,
		   source,
		   new String[] {
			   "documentation", "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.\nThe ISO21090-codedString may be used to provide a coded representation of the contents of strings in an Address.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAddress_Use(),
		   source,
		   new String[] {
			   "documentation", "The purpose of this address."
		   });
		addAnnotation
		  (getAddress_Type(),
		   source,
		   new String[] {
			   "documentation", "Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both."
		   });
		addAnnotation
		  (getAddress_Text(),
		   source,
		   new String[] {
			   "documentation", "Specifies the entire address as it should be displayed e.g. on a postal label. This may be provided instead of or as well as the specific parts."
		   });
		addAnnotation
		  (getAddress_Line(),
		   source,
		   new String[] {
			   "documentation", "This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information."
		   });
		addAnnotation
		  (getAddress_City(),
		   source,
		   new String[] {
			   "documentation", "The name of the city, town, suburb, village or other community or delivery center."
		   });
		addAnnotation
		  (getAddress_District(),
		   source,
		   new String[] {
			   "documentation", "The name of the administrative area (county)."
		   });
		addAnnotation
		  (getAddress_State(),
		   source,
		   new String[] {
			   "documentation", "Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (e.g. US 2 letter state codes)."
		   });
		addAnnotation
		  (getAddress_PostalCode(),
		   source,
		   new String[] {
			   "documentation", "A postal code designating a region defined by the postal service."
		   });
		addAnnotation
		  (getAddress_Country(),
		   source,
		   new String[] {
			   "documentation", "Country - a nation as commonly understood or generally accepted."
		   });
		addAnnotation
		  (getAddress_Period(),
		   source,
		   new String[] {
			   "documentation", "Time period when address was/is in use."
		   });
		addAnnotation
		  (addressTypeEClass,
		   source,
		   new String[] {
			   "documentation", "The type of an address (physical / postal).\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (addressTypeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Postal"
		   });
		addAnnotation
		  (addressTypeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Physical"
		   });
		addAnnotation
		  (addressTypeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Postal & Physical"
		   });
		addAnnotation
		  (addressUseEClass,
		   source,
		   new String[] {
			   "documentation", "The use of an address.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (addressUseEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Home"
		   });
		addAnnotation
		  (addressUseEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Work"
		   });
		addAnnotation
		  (addressUseEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Temporary"
		   });
		addAnnotation
		  (addressUseEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Old / Incorrect"
		   });
		addAnnotation
		  (addressUseEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Billing"
		   });
		addAnnotation
		  (administrativeGenderEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (administrativeGenderEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Male"
		   });
		addAnnotation
		  (administrativeGenderEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Female"
		   });
		addAnnotation
		  (administrativeGenderEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Other"
		   });
		addAnnotation
		  (administrativeGenderEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Unknown"
		   });
		addAnnotation
		  (ageEClass,
		   source,
		   new String[] {
			   "documentation", "A duration of time during which an organism (or a process) has existed.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (annotationEClass,
		   source,
		   new String[] {
			   "documentation", "A  text note which also  contains information about who made the statement and when.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAnnotation_AuthorReference(),
		   source,
		   new String[] {
			   "documentation", "The individual responsible for making the annotation. (choose any one of author*, but only one)"
		   });
		addAnnotation
		  (getAnnotation_AuthorString(),
		   source,
		   new String[] {
			   "documentation", "The individual responsible for making the annotation. (choose any one of author*, but only one)"
		   });
		addAnnotation
		  (getAnnotation_Time(),
		   source,
		   new String[] {
			   "documentation", "Indicates when this particular annotation was made."
		   });
		addAnnotation
		  (getAnnotation_Text(),
		   source,
		   new String[] {
			   "documentation", "The text of the annotation in markdown format."
		   });
		addAnnotation
		  (attachmentEClass,
		   source,
		   new String[] {
			   "documentation", "For referring to data content defined in other formats.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAttachment_ContentType(),
		   source,
		   new String[] {
			   "documentation", "Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate."
		   });
		addAnnotation
		  (getAttachment_Language(),
		   source,
		   new String[] {
			   "documentation", "The human language of the content. The value can be any valid value according to BCP 47."
		   });
		addAnnotation
		  (getAttachment_Data(),
		   source,
		   new String[] {
			   "documentation", "The actual data of the attachment - a sequence of bytes, base64 encoded."
		   });
		addAnnotation
		  (getAttachment_Url(),
		   source,
		   new String[] {
			   "documentation", "A location where the data can be accessed."
		   });
		addAnnotation
		  (getAttachment_Size(),
		   source,
		   new String[] {
			   "documentation", "The number of bytes of data that make up this attachment (before base64 encoding, if that is done)."
		   });
		addAnnotation
		  (getAttachment_Hash(),
		   source,
		   new String[] {
			   "documentation", "The calculated hash of the data using SHA-1. Represented using base64."
		   });
		addAnnotation
		  (getAttachment_Title(),
		   source,
		   new String[] {
			   "documentation", "A label or set of text to display in place of the data."
		   });
		addAnnotation
		  (getAttachment_Creation(),
		   source,
		   new String[] {
			   "documentation", "The date that the attachment was first created."
		   });
		addAnnotation
		  (getAttachment_Height(),
		   source,
		   new String[] {
			   "documentation", "Height of the image in pixels (photo/video)."
		   });
		addAnnotation
		  (getAttachment_Width(),
		   source,
		   new String[] {
			   "documentation", "Width of the image in pixels (photo/video)."
		   });
		addAnnotation
		  (getAttachment_Frames(),
		   source,
		   new String[] {
			   "documentation", "The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required."
		   });
		addAnnotation
		  (getAttachment_Duration(),
		   source,
		   new String[] {
			   "documentation", "The duration of the recording in seconds - for audio and video."
		   });
		addAnnotation
		  (getAttachment_Pages(),
		   source,
		   new String[] {
			   "documentation", "The number of pages when printed."
		   });
		addAnnotation
		  (availabilityEClass,
		   source,
		   new String[] {
			   "documentation", "Availability data for an {item}.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAvailability_AvailableTime(),
		   source,
		   new String[] {
			   "documentation", "Times the {item} is available."
		   });
		addAnnotation
		  (getAvailability_NotAvailableTime(),
		   source,
		   new String[] {
			   "documentation", "Not available during this time due to provided reason."
		   });
		addAnnotation
		  (availabilityAvailableTimeEClass,
		   source,
		   new String[] {
			   "documentation", "Availability data for an {item}.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_DaysOfWeek(),
		   source,
		   new String[] {
			   "documentation", "mon | tue | wed | thu | fri | sat | sun."
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AllDay(),
		   source,
		   new String[] {
			   "documentation", "Always available? i.e. 24 hour service."
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AvailableStartTime(),
		   source,
		   new String[] {
			   "documentation", "Opening time of day (ignored if allDay = true)."
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AvailableEndTime(),
		   source,
		   new String[] {
			   "documentation", "Closing time of day (ignored if allDay = true)."
		   });
		addAnnotation
		  (availabilityNotAvailableTimeEClass,
		   source,
		   new String[] {
			   "documentation", "Availability data for an {item}.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getAvailabilityNotAvailableTime_Description(),
		   source,
		   new String[] {
			   "documentation", "Reason presented to the user explaining why time not available."
		   });
		addAnnotation
		  (getAvailabilityNotAvailableTime_During(),
		   source,
		   new String[] {
			   "documentation", "Service not available during this period."
		   });
		addAnnotation
		  (backboneElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base definition for all elements that are defined inside a resource - but not those in a data type.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getBackboneElement_ModifierExtension(),
		   source,
		   new String[] {
			   "documentation", "May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element\'s descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself)."
		   });
		addAnnotation
		  (backboneTypeEClass,
		   source,
		   new String[] {
			   "documentation", "Base definition for the few data types that are allowed to carry modifier extensions.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getBackboneType_ModifierExtension(),
		   source,
		   new String[] {
			   "documentation", "May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element\'s descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself)."
		   });
		addAnnotation
		  (baseEClass,
		   source,
		   new String[] {
			   "documentation", "Base definition for all types defined in FHIR type system.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (base64BinaryEClass,
		   source,
		   new String[] {
			   "documentation", "A stream of bytes\nA stream of bytes, base64 encoded\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (binaryEClass,
		   source,
		   new String[] {
			   "documentation", "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (getBinary_ContentType(),
		   source,
		   new String[] {
			   "documentation", "MimeType of the binary content represented as a standard MimeType (BCP 13)."
		   });
		addAnnotation
		  (getBinary_SecurityContext(),
		   source,
		   new String[] {
			   "documentation", "This element identifies another resource that can be used as a proxy of the security sensitivity to use when deciding and enforcing access control rules for the Binary resource. Given that the Binary resource contains very few elements that can be used to determine the sensitivity of the data and relationships to individuals, the referenced resource stands in as a proxy equivalent for this purpose. This referenced resource may be related to the Binary (e.g. DocumentReference), or may be some non-related Resource purely as a security proxy. E.g. to identify that the binary resource relates to a patient, and access should only be granted to applications that have access to the patient."
		   });
		addAnnotation
		  (getBinary_Data(),
		   source,
		   new String[] {
			   "documentation", "The actual content, base64 encoded."
		   });
		addAnnotation
		  (booleanEClass,
		   source,
		   new String[] {
			   "documentation", "Value of \"true\" or \"false\"\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (bundleEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (getBundle_Identifier(),
		   source,
		   new String[] {
			   "documentation", "A persistent identifier for the bundle that won\'t change as a bundle is copied from server to server."
		   });
		addAnnotation
		  (getBundle_Type(),
		   source,
		   new String[] {
			   "documentation", "Indicates the purpose of this bundle - how it is intended to be used."
		   });
		addAnnotation
		  (getBundle_Timestamp(),
		   source,
		   new String[] {
			   "documentation", "The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle."
		   });
		addAnnotation
		  (getBundle_Total(),
		   source,
		   new String[] {
			   "documentation", "If a set of search matches, this is the (potentially estimated) total number of entries of type \'match\' across all pages in the search.  It does not include search.mode = \'include\' or \'outcome\' entries and it does not provide a count of the number of entries in the Bundle."
		   });
		addAnnotation
		  (getBundle_Link(),
		   source,
		   new String[] {
			   "documentation", "A series of links that provide context to this bundle."
		   });
		addAnnotation
		  (getBundle_Entry(),
		   source,
		   new String[] {
			   "documentation", "An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only)."
		   });
		addAnnotation
		  (getBundle_Signature(),
		   source,
		   new String[] {
			   "documentation", "Digital Signature - base64 encoded. XML-DSig or a JWS."
		   });
		addAnnotation
		  (bundleEntryEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources."
		   });
		addAnnotation
		  (getBundleEntry_Link(),
		   source,
		   new String[] {
			   "documentation", "A series of links that provide context to this entry."
		   });
		addAnnotation
		  (getBundleEntry_FullUrl(),
		   source,
		   new String[] {
			   "documentation", "The Absolute URL for the resource. Except for transactions and batches, each entry in a Bundle must have a fullUrl. The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. Even when not required, fullUrl MAY be set to a urn:uuid to allow referencing entries in a transaction. The fullUrl can be an arbitrary URI and is not limited to urn:uuid, urn:oid, http, and https. The fullUrl element SHALL have a value except when: \n* invoking a create\n* invoking or responding to an operation where the body is not a single identified resource\n* invoking or returning the results of a search or history operation."
		   });
		addAnnotation
		  (getBundleEntry_Search(),
		   source,
		   new String[] {
			   "documentation", "Information about the search process that lead to the creation of this entry."
		   });
		addAnnotation
		  (getBundleEntry_Request(),
		   source,
		   new String[] {
			   "documentation", "Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry."
		   });
		addAnnotation
		  (getBundleEntry_Response(),
		   source,
		   new String[] {
			   "documentation", "Indicates the results of processing the corresponding \'request\' entry in the batch or transaction being responded to or what the results of an operation where when returning history."
		   });
		addAnnotation
		  (bundleLinkEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources."
		   });
		addAnnotation
		  (getBundleLink_Relation(),
		   source,
		   new String[] {
			   "documentation", "A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1)."
		   });
		addAnnotation
		  (getBundleLink_Url(),
		   source,
		   new String[] {
			   "documentation", "The reference details for the link."
		   });
		addAnnotation
		  (bundleRequestEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources."
		   });
		addAnnotation
		  (getBundleRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred."
		   });
		addAnnotation
		  (getBundleRequest_Url(),
		   source,
		   new String[] {
			   "documentation", "The URL for this entry, relative to the root (the address to which the request is posted)."
		   });
		addAnnotation
		  (getBundleRequest_IfNoneMatch(),
		   source,
		   new String[] {
			   "documentation", "If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread)."
		   });
		addAnnotation
		  (getBundleRequest_IfModifiedSince(),
		   source,
		   new String[] {
			   "documentation", "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread)."
		   });
		addAnnotation
		  (getBundleRequest_IfMatch(),
		   source,
		   new String[] {
			   "documentation", "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency)."
		   });
		addAnnotation
		  (getBundleRequest_IfNoneExist(),
		   source,
		   new String[] {
			   "documentation", "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\")."
		   });
		addAnnotation
		  (bundleResponseEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources."
		   });
		addAnnotation
		  (getBundleResponse_Status(),
		   source,
		   new String[] {
			   "documentation", "The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code."
		   });
		addAnnotation
		  (getBundleResponse_Location(),
		   source,
		   new String[] {
			   "documentation", "The location header created by processing this operation, populated if the operation returns a location."
		   });
		addAnnotation
		  (getBundleResponse_Etag(),
		   source,
		   new String[] {
			   "documentation", "The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency))."
		   });
		addAnnotation
		  (getBundleResponse_LastModified(),
		   source,
		   new String[] {
			   "documentation", "The date/time that the resource was modified on the server."
		   });
		addAnnotation
		  (bundleSearchEClass,
		   source,
		   new String[] {
			   "documentation", "A container for a collection of resources."
		   });
		addAnnotation
		  (getBundleSearch_Mode(),
		   source,
		   new String[] {
			   "documentation", "Why this entry is in the result set - whether it\'s included as a match or because of an _include requirement, or to convey information or warning information about the search process."
		   });
		addAnnotation
		  (getBundleSearch_Score(),
		   source,
		   new String[] {
			   "documentation", "When searching, the server\'s search ranking score for the entry."
		   });
		addAnnotation
		  (bundleTypeEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Document"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Message"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Transaction"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Transaction Response"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Batch"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Batch Response"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "History List"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Search Results"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Collection"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Subscription Notification"
		   });
		addAnnotation
		  (canonicalEClass,
		   source,
		   new String[] {
			   "documentation", "A URI that is a reference to a canonical URL on a FHIR resource\nsee [Canonical References](references.html#canonical)\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (codeEClass,
		   source,
		   new String[] {
			   "documentation", "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (codeableConceptEClass,
		   source,
		   new String[] {
			   "documentation", "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getCodeableConcept_Coding(),
		   source,
		   new String[] {
			   "documentation", "A reference to a code defined by a terminology system."
		   });
		addAnnotation
		  (getCodeableConcept_Text(),
		   source,
		   new String[] {
			   "documentation", "A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user."
		   });
		addAnnotation
		  (codeableReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "A reference to a resource (by instance), or instead, a reference to a concept defined in a terminology or ontology (by class).\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getCodeableReference_Concept(),
		   source,
		   new String[] {
			   "documentation", "A reference to a concept - e.g. the information is identified by its general class to the degree of precision found in the terminology."
		   });
		addAnnotation
		  (getCodeableReference_Reference(),
		   source,
		   new String[] {
			   "documentation", "A reference to a resource the provides exact details about the information being referenced."
		   });
		addAnnotation
		  (codingEClass,
		   source,
		   new String[] {
			   "documentation", "A reference to a code defined by a terminology system.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getCoding_System(),
		   source,
		   new String[] {
			   "documentation", "The identification of the code system that defines the meaning of the symbol in the code."
		   });
		addAnnotation
		  (getCoding_Version(),
		   source,
		   new String[] {
			   "documentation", "The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured, and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged."
		   });
		addAnnotation
		  (getCoding_Code(),
		   source,
		   new String[] {
			   "documentation", "A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination)."
		   });
		addAnnotation
		  (getCoding_Display(),
		   source,
		   new String[] {
			   "documentation", "A representation of the meaning of the code in the system, following the rules of the system."
		   });
		addAnnotation
		  (getCoding_UserSelected(),
		   source,
		   new String[] {
			   "documentation", "Indicates that this coding was chosen by a user directly - e.g. off a pick list of available items (codes or displays)."
		   });
		addAnnotation
		  (contactDetailEClass,
		   source,
		   new String[] {
			   "documentation", "Specifies contact information for a person or organization.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getContactDetail_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of an individual to contact."
		   });
		addAnnotation
		  (getContactDetail_Telecom(),
		   source,
		   new String[] {
			   "documentation", "The contact details for the individual (if a name was provided) or the organization."
		   });
		addAnnotation
		  (contactPointEClass,
		   source,
		   new String[] {
			   "documentation", "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getContactPoint_System(),
		   source,
		   new String[] {
			   "documentation", "Telecommunications form for contact point - what communications system is required to make use of the contact."
		   });
		addAnnotation
		  (getContactPoint_Value(),
		   source,
		   new String[] {
			   "documentation", "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address)."
		   });
		addAnnotation
		  (getContactPoint_Use(),
		   source,
		   new String[] {
			   "documentation", "Identifies the purpose for the contact point."
		   });
		addAnnotation
		  (getContactPoint_Rank(),
		   source,
		   new String[] {
			   "documentation", "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values."
		   });
		addAnnotation
		  (getContactPoint_Period(),
		   source,
		   new String[] {
			   "documentation", "Time period when the contact point was/is in use."
		   });
		addAnnotation
		  (contactPointSystemEClass,
		   source,
		   new String[] {
			   "documentation", "Telecommunications form for contact point.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Phone"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Fax"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Email"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Pager"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "URL"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "SMS"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Other"
		   });
		addAnnotation
		  (contactPointUseEClass,
		   source,
		   new String[] {
			   "documentation", "Use of contact point.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Home"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Work"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Temp"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Old"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Mobile"
		   });
		addAnnotation
		  (countEClass,
		   source,
		   new String[] {
			   "documentation", "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (dataRequirementEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDataRequirement_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile."
		   });
		addAnnotation
		  (getDataRequirement_Profile(),
		   source,
		   new String[] {
			   "documentation", "The profile of the required data, specified as the uri of the profile definition."
		   });
		addAnnotation
		  (getDataRequirement_SubjectCodeableConcept(),
		   source,
		   new String[] {
			   "documentation", "The intended subjects of the data requirement. If this element is not provided, a Patient subject is assumed. (choose any one of subject*, but only one)"
		   });
		addAnnotation
		  (getDataRequirement_SubjectReference(),
		   source,
		   new String[] {
			   "documentation", "The intended subjects of the data requirement. If this element is not provided, a Patient subject is assumed. (choose any one of subject*, but only one)"
		   });
		addAnnotation
		  (getDataRequirement_MustSupport(),
		   source,
		   new String[] {
			   "documentation", "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. \n\nThe value of mustSupport SHALL be a FHIRPath resolvable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details)."
		   });
		addAnnotation
		  (getDataRequirement_CodeFilter(),
		   source,
		   new String[] {
			   "documentation", "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND\'ed, not OR\'ed."
		   });
		addAnnotation
		  (getDataRequirement_DateFilter(),
		   source,
		   new String[] {
			   "documentation", "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND\'ed, not OR\'ed."
		   });
		addAnnotation
		  (getDataRequirement_ValueFilter(),
		   source,
		   new String[] {
			   "documentation", "Value filters specify additional constraints on the data for elements other than code-valued or date-valued. Each value filter specifies an additional constraint on the data (i.e. valueFilters are AND\'ed, not OR\'ed)."
		   });
		addAnnotation
		  (getDataRequirement_Limit(),
		   source,
		   new String[] {
			   "documentation", "Specifies a maximum number of results that are required (uses the _count search parameter)."
		   });
		addAnnotation
		  (getDataRequirement_Sort(),
		   source,
		   new String[] {
			   "documentation", "Specifies the order of the results to be returned."
		   });
		addAnnotation
		  (dataRequirementCodeFilterEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_Path(),
		   source,
		   new String[] {
			   "documentation", "The code-valued attribute of the filter. The specified path SHALL be a FHIRPath resolvable on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept."
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_SearchParam(),
		   source,
		   new String[] {
			   "documentation", "A token parameter that refers to a search parameter defined on the specified type of the DataRequirement, and which searches on elements of type code, Coding, or CodeableConcept."
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_ValueSet(),
		   source,
		   new String[] {
			   "documentation", "The valueset for the code filter. The valueSet and code elements are additive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset."
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_Code(),
		   source,
		   new String[] {
			   "documentation", "The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes."
		   });
		addAnnotation
		  (dataRequirementDateFilterEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_Path(),
		   source,
		   new String[] {
			   "documentation", "The date-valued attribute of the filter. The specified path SHALL be a FHIRPath resolvable on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index must be an integer constant. The path must resolve to an element of type date, dateTime, Period, Schedule, or Timing."
		   });
		addAnnotation
		  (getDataRequirementDateFilter_SearchParam(),
		   source,
		   new String[] {
			   "documentation", "A date parameter that refers to a search parameter defined on the specified type of the DataRequirement, and which searches on elements of type date, dateTime, Period, Schedule, or Timing."
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValueDateTime(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValuePeriod(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValueDuration(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (dataRequirementSortEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDataRequirementSort_Path(),
		   source,
		   new String[] {
			   "documentation", "The attribute of the sort. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant."
		   });
		addAnnotation
		  (getDataRequirementSort_Direction(),
		   source,
		   new String[] {
			   "documentation", "The direction of the sort, ascending or descending."
		   });
		addAnnotation
		  (dataRequirementValueFilterEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_Path(),
		   source,
		   new String[] {
			   "documentation", "The attribute of the filter. The specified path SHALL be a FHIRPath resolvable on the specified type of the DataRequirement, and SHALL consist only of identifiers, constant indexers, and .resolve(). The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details). Note that the index must be an integer constant. The path must resolve to an element of a type that is comparable to the valueFilter.value[x] element for the filter."
		   });
		addAnnotation
		  (getDataRequirementValueFilter_SearchParam(),
		   source,
		   new String[] {
			   "documentation", "A search parameter defined on the specified type of the DataRequirement, and which searches on elements of a type compatible with the type of the valueFilter.value[x] for the filter."
		   });
		addAnnotation
		  (getDataRequirementValueFilter_Comparator(),
		   source,
		   new String[] {
			   "documentation", "The comparator to be used to determine whether the value is matching."
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValueDateTime(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValuePeriod(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValueDuration(),
		   source,
		   new String[] {
			   "documentation", "The value of the filter. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "documentation", "The base class for all re-useable types defined as part of the FHIR Specification.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (dateEClass,
		   source,
		   new String[] {
			   "documentation", "A date or partial date (e.g. just year or year + month). There is no UTC offset. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (dateTimeEClass,
		   source,
		   new String[] {
			   "documentation", "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a UTC offset SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.\nUTC offset is allowed for dates and partial dates\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (decimalEClass,
		   source,
		   new String[] {
			   "documentation", "A rational number with implicit precision\nDo not use an IEEE type floating point type, instead use something that works like a true decimal, with inbuilt precision (e.g. Java BigInteger)\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (distanceEClass,
		   source,
		   new String[] {
			   "documentation", "A length - a value with a unit that is a physical distance.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (domainResourceEClass,
		   source,
		   new String[] {
			   "documentation", "A resource that includes narrative, extensions, and contained resources."
		   });
		addAnnotation
		  (getDomainResource_Text(),
		   source,
		   new String[] {
			   "documentation", "A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
		   });
		addAnnotation
		  (getDomainResource_Extension(),
		   source,
		   new String[] {
			   "documentation", "May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
		   });
		addAnnotation
		  (getDomainResource_ModifierExtension(),
		   source,
		   new String[] {
			   "documentation", "May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element\'s descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself)."
		   });
		addAnnotation
		  (dosageEClass,
		   source,
		   new String[] {
			   "documentation", "Indicates how the medication is/was taken or should be taken by the patient.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDosage_Sequence(),
		   source,
		   new String[] {
			   "documentation", "Indicates the order in which the dosage instructions should be applied or interpreted."
		   });
		addAnnotation
		  (getDosage_Text(),
		   source,
		   new String[] {
			   "documentation", "Free text dosage instructions e.g. SIG."
		   });
		addAnnotation
		  (getDosage_AdditionalInstruction(),
		   source,
		   new String[] {
			   "documentation", "Supplemental instructions to the patient on how to take the medication  (e.g. \"with meals\" or\"take half to one hour before food\") or warnings for the patient about the medication (e.g. \"may cause drowsiness\" or \"avoid exposure of skin to direct sunlight or sunlamps\")."
		   });
		addAnnotation
		  (getDosage_PatientInstruction(),
		   source,
		   new String[] {
			   "documentation", "Instructions in terms that are understood by the patient or consumer."
		   });
		addAnnotation
		  (getDosage_Timing(),
		   source,
		   new String[] {
			   "documentation", "When medication should be administered."
		   });
		addAnnotation
		  (getDosage_AsNeeded(),
		   source,
		   new String[] {
			   "documentation", "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option)."
		   });
		addAnnotation
		  (getDosage_AsNeededFor(),
		   source,
		   new String[] {
			   "documentation", "Indicates whether the Medication is only taken based on a precondition for taking the Medication (CodeableConcept)."
		   });
		addAnnotation
		  (getDosage_Site(),
		   source,
		   new String[] {
			   "documentation", "Body site to administer to."
		   });
		addAnnotation
		  (getDosage_Route(),
		   source,
		   new String[] {
			   "documentation", "How drug should enter body."
		   });
		addAnnotation
		  (getDosage_Method(),
		   source,
		   new String[] {
			   "documentation", "Technique for administering medication."
		   });
		addAnnotation
		  (getDosage_DoseAndRate(),
		   source,
		   new String[] {
			   "documentation", "Depending on the resource,this is the amount of medication administered, to  be administered or typical amount to be administered."
		   });
		addAnnotation
		  (getDosage_MaxDosePerPeriod(),
		   source,
		   new String[] {
			   "documentation", "Upper limit on medication per unit of time."
		   });
		addAnnotation
		  (getDosage_MaxDosePerAdministration(),
		   source,
		   new String[] {
			   "documentation", "Upper limit on medication per administration."
		   });
		addAnnotation
		  (getDosage_MaxDosePerLifetime(),
		   source,
		   new String[] {
			   "documentation", "Upper limit on medication per lifetime of the patient."
		   });
		addAnnotation
		  (dosageDoseAndRateEClass,
		   source,
		   new String[] {
			   "documentation", "Indicates how the medication is/was taken or should be taken by the patient.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getDosageDoseAndRate_Type(),
		   source,
		   new String[] {
			   "documentation", "The kind of dose or rate specified, for example, ordered or calculated."
		   });
		addAnnotation
		  (getDosageDoseAndRate_DoseRange(),
		   source,
		   new String[] {
			   "documentation", "Amount of medication per dose. (choose any one of dose*, but only one)"
		   });
		addAnnotation
		  (getDosageDoseAndRate_DoseQuantity(),
		   source,
		   new String[] {
			   "documentation", "Amount of medication per dose. (choose any one of dose*, but only one)"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateRatio(),
		   source,
		   new String[] {
			   "documentation", "Amount of medication per unit of time. (choose any one of rate*, but only one)"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateRange(),
		   source,
		   new String[] {
			   "documentation", "Amount of medication per unit of time. (choose any one of rate*, but only one)"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateQuantity(),
		   source,
		   new String[] {
			   "documentation", "Amount of medication per unit of time. (choose any one of rate*, but only one)"
		   });
		addAnnotation
		  (durationEClass,
		   source,
		   new String[] {
			   "documentation", "A length of time.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "documentation", "Base definition for all elements in a resource.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getElement_Extension(),
		   source,
		   new String[] {
			   "documentation", "May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
		   });
		addAnnotation
		  (eventTimingEClass,
		   source,
		   new String[] {
			   "documentation", "Real-world event relating to the schedule.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Morning"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Early Morning"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Late Morning"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Noon"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Afternoon"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Early Afternoon"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Late Afternoon"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Evening"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Early Evening"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Late Evening"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Night"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "After Sleep"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "Immediate"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "HS"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "documentation", "WAKE"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "documentation", "C"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "documentation", "CM"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "documentation", "CD"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "documentation", "CV"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "documentation", "AC"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "documentation", "ACM"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "documentation", "ACD"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "documentation", "ACV"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "documentation", "PC"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "documentation", "PCM"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "documentation", "PCD"
		   });
		addAnnotation
		  (eventTimingEnumEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "documentation", "PCV"
		   });
		addAnnotation
		  (expressionEClass,
		   source,
		   new String[] {
			   "documentation", "A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getExpression_Description(),
		   source,
		   new String[] {
			   "documentation", "A brief, natural language description of the condition that effectively communicates the intended semantics."
		   });
		addAnnotation
		  (getExpression_Name(),
		   source,
		   new String[] {
			   "documentation", "A short name assigned to the expression to allow for multiple reuse of the expression in the context where it is defined."
		   });
		addAnnotation
		  (getExpression_Language(),
		   source,
		   new String[] {
			   "documentation", "The media type of the language for the expression."
		   });
		addAnnotation
		  (getExpression_Expression(),
		   source,
		   new String[] {
			   "documentation", "An expression in the specified language that returns a value."
		   });
		addAnnotation
		  (getExpression_Reference(),
		   source,
		   new String[] {
			   "documentation", "A URI that defines where the expression is found."
		   });
		addAnnotation
		  (extendedContactDetailEClass,
		   source,
		   new String[] {
			   "documentation", "Specifies contact information for a specific purpose over a period of time, might be handled/monitored by a specific named person or organization.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getExtendedContactDetail_Purpose(),
		   source,
		   new String[] {
			   "documentation", "The purpose/type of contact."
		   });
		addAnnotation
		  (getExtendedContactDetail_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of an individual to contact, some types of contact detail are usually blank."
		   });
		addAnnotation
		  (getExtendedContactDetail_Telecom(),
		   source,
		   new String[] {
			   "documentation", "The contact details application for the purpose defined."
		   });
		addAnnotation
		  (getExtendedContactDetail_Address(),
		   source,
		   new String[] {
			   "documentation", "Address for the contact."
		   });
		addAnnotation
		  (getExtendedContactDetail_Organization(),
		   source,
		   new String[] {
			   "documentation", "This contact detail is handled/monitored by a specific organization. If the name is provided in the contact, then it is referring to the named individual within this organization."
		   });
		addAnnotation
		  (getExtendedContactDetail_Period(),
		   source,
		   new String[] {
			   "documentation", "Period that this contact was valid for usage."
		   });
		addAnnotation
		  (extensionEClass,
		   source,
		   new String[] {
			   "documentation", "Optional Extension Element - found in all resources.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getExtension_ValueBase64Binary(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueBoolean(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCanonical(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCode(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDate(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDateTime(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDecimal(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueId(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueInstant(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueInteger(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueInteger64(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueMarkdown(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueOid(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValuePositiveInt(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueString(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueTime(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueUnsignedInt(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueUri(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueUrl(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueUuid(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueAddress(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueAge(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueAnnotation(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueAttachment(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCodeableConcept(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCodeableReference(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCoding(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueContactPoint(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueCount(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDistance(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDuration(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueHumanName(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueIdentifier(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueMoney(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValuePeriod(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueQuantity(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueRange(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueRatio(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueRatioRange(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueReference(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueSampledData(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueSignature(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueTiming(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueContactDetail(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDataRequirement(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueExpression(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueParameterDefinition(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueRelatedArtifact(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueTriggerDefinition(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueUsageContext(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueAvailability(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueExtendedContactDetail(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueDosage(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (getExtension_ValueMeta(),
		   source,
		   new String[] {
			   "documentation", "Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list). (choose any one of the elements, but only one)"
		   });
		addAnnotation
		  (httpVerbEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "GET"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "HEAD"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "POST"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "PUT"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "DELETE"
		   });
		addAnnotation
		  (httpVerbEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "PATCH"
		   });
		addAnnotation
		  (humanNameEClass,
		   source,
		   new String[] {
			   "documentation", "A name, normally of a human, that can be used for other living entities (e.g. animals but not organizations) that have been assigned names by a human and may need the use of name parts or the need for usage information.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getHumanName_Use(),
		   source,
		   new String[] {
			   "documentation", "Identifies the purpose for this name."
		   });
		addAnnotation
		  (getHumanName_Text(),
		   source,
		   new String[] {
			   "documentation", "Specifies the entire name as it should be displayed e.g. on an application UI. This may be provided instead of or as well as the specific parts."
		   });
		addAnnotation
		  (getHumanName_Family(),
		   source,
		   new String[] {
			   "documentation", "The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father."
		   });
		addAnnotation
		  (getHumanName_Given(),
		   source,
		   new String[] {
			   "documentation", "Given name."
		   });
		addAnnotation
		  (getHumanName_Prefix(),
		   source,
		   new String[] {
			   "documentation", "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name."
		   });
		addAnnotation
		  (getHumanName_Suffix(),
		   source,
		   new String[] {
			   "documentation", "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name."
		   });
		addAnnotation
		  (getHumanName_Period(),
		   source,
		   new String[] {
			   "documentation", "Indicates the period of time when this name was valid for the named person."
		   });
		addAnnotation
		  (idEClass,
		   source,
		   new String[] {
			   "documentation", "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.\nRFC 4122\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (identifierEClass,
		   source,
		   new String[] {
			   "documentation", "An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getIdentifier_Use(),
		   source,
		   new String[] {
			   "documentation", "The purpose of this identifier."
		   });
		addAnnotation
		  (getIdentifier_Type(),
		   source,
		   new String[] {
			   "documentation", "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose."
		   });
		addAnnotation
		  (getIdentifier_System(),
		   source,
		   new String[] {
			   "documentation", "Establishes the namespace for the value - that is, an absolute URL that describes a set values that are unique."
		   });
		addAnnotation
		  (getIdentifier_Value(),
		   source,
		   new String[] {
			   "documentation", "The portion of the identifier typically relevant to the user and which is unique within the context of the system."
		   });
		addAnnotation
		  (getIdentifier_Period(),
		   source,
		   new String[] {
			   "documentation", "Time period during which identifier is/was valid for use."
		   });
		addAnnotation
		  (getIdentifier_Assigner(),
		   source,
		   new String[] {
			   "documentation", "Organization that issued/manages the identifier."
		   });
		addAnnotation
		  (identifierUseEClass,
		   source,
		   new String[] {
			   "documentation", "Identifies the purpose for this identifier, if known .\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (identifierUseEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Usual"
		   });
		addAnnotation
		  (identifierUseEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Official"
		   });
		addAnnotation
		  (identifierUseEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Temp"
		   });
		addAnnotation
		  (identifierUseEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Secondary"
		   });
		addAnnotation
		  (identifierUseEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Old"
		   });
		addAnnotation
		  (instantEClass,
		   source,
		   new String[] {
			   "documentation", "An instant in time - known at least to the second\nNote: This is intended for where precisely observed times are required, typically system logs etc., and not human-reported times - for them, see date and dateTime (which can be as precise as instant, but is not required to be) below. UTC offset is always required\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (integerEClass,
		   source,
		   new String[] {
			   "documentation", "A whole number\n32 bit number; for values larger than this, use decimal\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (integer64EClass,
		   source,
		   new String[] {
			   "documentation", "A very large whole number\nTypically this is used for record counters (e.g. database keys)\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (linkRelationTypesEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that is the subject of the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Asserts that the link target provides an access control description for the link context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Refers to a substitute for this context"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Used to reference alternative content that uses the AMP profile of the HTML format."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Refers to an appendix."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Refers to an icon for the context. Synonym for icon."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Refers to a launch screen for the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Refers to a collection of records, documents, or other\n      materials of historical interest."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Refers to the context\'s author."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Identifies the entity that blocks access to a resource\n      following receipt of a legal demand."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Gives a permanent link to use for bookmarking purposes."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "Designates the preferred version of a resource (the IRI and its contents)."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "Refers to a chapter in a collection of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "Indicates that the link target is preferred over the link context for the purpose of permanent citation."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "documentation", "The target IRI points to a resource which represents the collection resource for the context IRI."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "documentation", "Refers to a table of contents."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "documentation", "The document linked to was later converted to the\n      document that contains this link relation.  For example, an RFC can\n      have a link to the Internet-Draft that became the RFC; in that case,\n      the link relation would be \"convertedFrom\"."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "documentation", "Refers to a copyright statement that applies to the\n    link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "documentation", "The target IRI points to a resource where a submission form can be obtained."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource containing the most recent\n      item(s) in a collection of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource providing information about the\n      link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "documentation", "The relationship A \'describes\' B asserts that\n      resource A provides a description of resource B. There are no\n      constraints on the format or representation of either A or B,\n      neither are there any further constraints on either resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "documentation", "Refers to a list of patent disclosures made with respect to \n      material for which \'disclosure\' relation is specified."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "documentation", "Used to indicate an origin that will be used to fetch required \n      resources for the link context, and that the user agent ought to resolve \n      as early as possible."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource whose available representations\n      are byte-for-byte identical with the corresponding representations of\n      the context IRI."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that can be used to edit the\n      link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "documentation", "The target IRI points to a resource where a submission form for\n      editing associated resource can be obtained."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that can be used to edit media\n      associated with the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "documentation", "Identifies a related resource that is potentially\n      large and might require special handling."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that is not part of the same site as the current context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "documentation", "An IRI that refers to the furthest preceding resource\n    in a series of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "documentation", "Refers to a glossary of terms."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "documentation", "Refers to context-sensitive help."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource hosted by the server indicated by\n      the link context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "documentation", "Refers to a hub that enables registration for\n    notification of updates to the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "documentation", "Refers to an icon representing the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(36),
		   source,
		   new String[] {
			   "documentation", "Refers to an index."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(37),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that ends before the beginning of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(38),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(39),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(40),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource, or ends before the beginning of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(41),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(42),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(43),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(44),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(45),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins before or is coincident with the beginning of the time interval associated with the context resource, and ends after or is coincident with the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(46),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval whose beginning coincides with the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(47),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval whose end coincides with the beginning of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(48),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the beginning of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(49),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval that begins before the end of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(50),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(51),
		   source,
		   new String[] {
			   "documentation", "refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(52),
		   source,
		   new String[] {
			   "documentation", "The target IRI points to a resource that is a member of the collection represented by the context IRI."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(53),
		   source,
		   new String[] {
			   "documentation", "An IRI that refers to the furthest following resource\n      in a series of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(54),
		   source,
		   new String[] {
			   "documentation", "Points to a resource containing the latest (e.g.,\n      current) version of the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(55),
		   source,
		   new String[] {
			   "documentation", "Refers to a license associated with this context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(56),
		   source,
		   new String[] {
			   "documentation", "The link target of a link with the \"linkset\" relation\n      type provides a set of links, including links in which the link\n      context of the link participates.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(57),
		   source,
		   new String[] {
			   "documentation", "Refers to further information about the link\'s context,\n      expressed as a LRDD (\"Link-based Resource Descriptor Document\")\n      resource.  See  for information about\n      processing this relation type in host-meta documents. When used\n      elsewhere, it refers to additional links and other metadata.\n      Multiple instances indicate additional LRDD resources. LRDD\n      resources MUST have an \"application/xrd+xml\" representation, and\n      MAY have others."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(58),
		   source,
		   new String[] {
			   "documentation", "Links to a manifest file for the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(59),
		   source,
		   new String[] {
			   "documentation", "Refers to a mask that can be applied to the icon for the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(60),
		   source,
		   new String[] {
			   "documentation", "Refers to a feed of personalised media recommendations relevant to the link context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(61),
		   source,
		   new String[] {
			   "documentation", "The Target IRI points to a Memento, a fixed resource that will not change state anymore."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(62),
		   source,
		   new String[] {
			   "documentation", "Links to the context\'s Micropub endpoint."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(63),
		   source,
		   new String[] {
			   "documentation", "Refers to a module that the user agent is to preemptively fetch and store for use in the current context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(64),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that can be used to monitor changes in an HTTP resource.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(65),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that can be used to monitor changes in a specified group of HTTP resources.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(66),
		   source,
		   new String[] {
			   "documentation", "Indicates that the link\'s context is a part of a series, and\n      that the next in the series is the link target.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(67),
		   source,
		   new String[] {
			   "documentation", "Refers to the immediately following archive resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(68),
		   source,
		   new String[] {
			   "documentation", "Indicates that the context\u2019s original author or publisher does not endorse the link target."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(69),
		   source,
		   new String[] {
			   "documentation", "Indicates that any newly created top-level browsing context which results from following the link will not be an auxiliary browsing context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(70),
		   source,
		   new String[] {
			   "documentation", "Indicates that no referrer information is to be leaked when following the link."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(71),
		   source,
		   new String[] {
			   "documentation", "Indicates that any newly created top-level browsing context which results from following the link will be an auxiliary browsing context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(72),
		   source,
		   new String[] {
			   "documentation", "Refers to an OpenID Authentication server on which the context relies for an assertion that the end user controls an Identifier."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(73),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource which accepts OpenID Authentication protocol messages for the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(74),
		   source,
		   new String[] {
			   "documentation", "The Target IRI points to an Original Resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(75),
		   source,
		   new String[] {
			   "documentation", "Refers to a P3P privacy policy for the context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(76),
		   source,
		   new String[] {
			   "documentation", "Indicates a resource where payment is accepted."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(77),
		   source,
		   new String[] {
			   "documentation", "Gives the address of the pingback resource for the link context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(78),
		   source,
		   new String[] {
			   "documentation", "Used to indicate an origin that will be used to fetch required \n      resources for the link context. Initiating an early connection, which \n      includes the DNS lookup, TCP handshake, and optional TLS negotiation, \n      allows the user agent to mask the high latency costs of establishing a \n      connection."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(79),
		   source,
		   new String[] {
			   "documentation", "Points to a resource containing the predecessor\n      version in the version history.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(80),
		   source,
		   new String[] {
			   "documentation", "The prefetch link relation type is used to identify a resource \n      that might be required by the next navigation from the link context, and \n      that the user agent ought to fetch, such that the user agent can deliver a \n      faster response once the resource is requested in the future."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(81),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that should be loaded early in the \n      processing of the link\'s context, without blocking rendering."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(82),
		   source,
		   new String[] {
			   "documentation", "Used to identify a resource that might be required by the next \n      navigation from the link context, and that the user agent ought to fetch \n      and execute, such that the user agent can deliver a faster response once \n      the resource is requested in the future."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(83),
		   source,
		   new String[] {
			   "documentation", "Indicates that the link\'s context is a part of a series, and\n      that the previous in the series is the link target.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(84),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that provides a preview of the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(85),
		   source,
		   new String[] {
			   "documentation", "Refers to the previous resource in an ordered series\n      of resources.  Synonym for \"prev\"."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(86),
		   source,
		   new String[] {
			   "documentation", "Refers to the immediately preceding archive resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(87),
		   source,
		   new String[] {
			   "documentation", "Refers to a privacy policy associated with the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(88),
		   source,
		   new String[] {
			   "documentation", "Identifying that a resource representation conforms\nto a certain profile, without affecting the non-profile semantics\nof the resource representation."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(89),
		   source,
		   new String[] {
			   "documentation", "Links to a publication manifest. A manifest represents \n      structured information about a publication, such as informative metadata, \n      a list of resources, and a default reading order."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(90),
		   source,
		   new String[] {
			   "documentation", "Identifies a related resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(91),
		   source,
		   new String[] {
			   "documentation", "Identifies the root of RESTCONF API as configured on this HTTP server.\n      The \"restconf\" relation defines the root of the API defined in RFC8040.\n      Subsequent revisions of RESTCONF will use alternate relation values to support \n      protocol versioning."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(92),
		   source,
		   new String[] {
			   "documentation", "Identifies a resource that is a reply to the context\n      of the link.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(93),
		   source,
		   new String[] {
			   "documentation", "The resource identified by the link target provides an input value to an \n    instance of a rule, where the resource which represents the rule instance is \n    identified by the link context.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(94),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that can be used to search through\n      the link\'s context and related resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(95),
		   source,
		   new String[] {
			   "documentation", "Refers to a section in a collection of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(96),
		   source,
		   new String[] {
			   "documentation", "Conveys an identifier for the link\'s context.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(97),
		   source,
		   new String[] {
			   "documentation", "Indicates a URI that can be used to retrieve a\n      service document."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(98),
		   source,
		   new String[] {
			   "documentation", "Identifies service description for the context that\n      is primarily intended for consumption by machines."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(99),
		   source,
		   new String[] {
			   "documentation", "Identifies service documentation for the context that\n      is primarily intended for human consumption."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(100),
		   source,
		   new String[] {
			   "documentation", "Identifies general metadata for the context that is\n      primarily intended for consumption by machines."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(101),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that is within a context that is \n\t\tsponsored (such as advertising or another compensation agreement)."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(102),
		   source,
		   new String[] {
			   "documentation", "Refers to the first resource in a collection of\n      resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(103),
		   source,
		   new String[] {
			   "documentation", "Identifies a resource that represents the context\'s\n      status."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(104),
		   source,
		   new String[] {
			   "documentation", "Refers to a stylesheet."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(105),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource serving as a subsection in a\n      collection of resources."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(106),
		   source,
		   new String[] {
			   "documentation", "Points to a resource containing the successor version\n      in the version history.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(107),
		   source,
		   new String[] {
			   "documentation", "Identifies a resource that provides information about\n      the context\'s retirement policy.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(108),
		   source,
		   new String[] {
			   "documentation", "Gives a tag (identified by the given address) that applies to\n      the current document.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(109),
		   source,
		   new String[] {
			   "documentation", "Refers to the terms of service associated with the link\'s context."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(110),
		   source,
		   new String[] {
			   "documentation", "The Target IRI points to a TimeGate for an Original Resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(111),
		   source,
		   new String[] {
			   "documentation", "The Target IRI points to a TimeMap for an Original Resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(112),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource identifying the abstract semantic type of which the link\'s context is considered to be an instance."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(113),
		   source,
		   new String[] {
			   "documentation", "Refers to a resource that is within a context that is User Generated Content.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(114),
		   source,
		   new String[] {
			   "documentation", "Refers to a parent document in a hierarchy of\n      documents.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(115),
		   source,
		   new String[] {
			   "documentation", "Points to a resource containing the version history\n      for the context.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(116),
		   source,
		   new String[] {
			   "documentation", "Identifies a resource that is the source of the\n      information in the link\'s context.\n    "
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(117),
		   source,
		   new String[] {
			   "documentation", "Identifies a target URI that supports the Webmention protocol.\n    This allows clients that mention a resource in some form of publishing process\n    to contact that endpoint and inform it that this resource has been mentioned."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(118),
		   source,
		   new String[] {
			   "documentation", "Points to a working copy for this resource."
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum.getELiterals().get(119),
		   source,
		   new String[] {
			   "documentation", "Points to the versioned resource from which this\n      working copy was obtained.\n    "
		   });
		addAnnotation
		  (linkTypeEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (linkTypeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Replaced-by\nVervangen door"
		   });
		addAnnotation
		  (linkTypeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Replaces\nVervangt"
		   });
		addAnnotation
		  (linkTypeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Refer\nVerwijzing"
		   });
		addAnnotation
		  (linkTypeEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "See also\nZie ook"
		   });
		addAnnotation
		  (markdownEClass,
		   source,
		   new String[] {
			   "documentation", "A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine\nSystems are not required to have markdown support, so the text should be readable without markdown processing. The markdown syntax is GFM - see https://github.github.com/gfm/\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (metaEClass,
		   source,
		   new String[] {
			   "documentation", "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getMeta_VersionId(),
		   source,
		   new String[] {
			   "documentation", "The version specific identifier, as it appears in the version portion of the URL. This value changes when the resource is created, updated, or deleted."
		   });
		addAnnotation
		  (getMeta_LastUpdated(),
		   source,
		   new String[] {
			   "documentation", "When the resource last changed - e.g. when the version changed."
		   });
		addAnnotation
		  (getMeta_Source(),
		   source,
		   new String[] {
			   "documentation", "A uri that identifies the source system of the resource. This provides a minimal amount of [[[Provenance]]] information that can be used to track or differentiate the source of information in the resource. The source may identify another FHIR server, document, message, database, etc."
		   });
		addAnnotation
		  (getMeta_Profile(),
		   source,
		   new String[] {
			   "documentation", "A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]."
		   });
		addAnnotation
		  (getMeta_Security(),
		   source,
		   new String[] {
			   "documentation", "Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure."
		   });
		addAnnotation
		  (getMeta_Tag(),
		   source,
		   new String[] {
			   "documentation", "Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource."
		   });
		addAnnotation
		  (moneyEClass,
		   source,
		   new String[] {
			   "documentation", "An amount of economic utility in some recognized currency.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getMoney_Value(),
		   source,
		   new String[] {
			   "documentation", "Numerical value (with implicit precision)."
		   });
		addAnnotation
		  (getMoney_Currency(),
		   source,
		   new String[] {
			   "documentation", "ISO 4217 Currency Code."
		   });
		addAnnotation
		  (nameUseEClass,
		   source,
		   new String[] {
			   "documentation", "The use of a human name.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Usual"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Official"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Temp"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Nickname"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Anonymous"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Old"
		   });
		addAnnotation
		  (nameUseEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Name changed for Marriage"
		   });
		addAnnotation
		  (narrativeEClass,
		   source,
		   new String[] {
			   "documentation", "A human-readable summary of the resource conveying the essential clinical and business information for the resource.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getNarrative_Status(),
		   source,
		   new String[] {
			   "documentation", "The status of the narrative - whether it\'s entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data."
		   });
		addAnnotation
		  (getNarrative_Div(),
		   source,
		   new String[] {
			   "documentation", "The actual narrative content, a stripped down version of XHTML."
		   });
		addAnnotation
		  (narrativeStatusEClass,
		   source,
		   new String[] {
			   "documentation", "The status of a resource narrative.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (narrativeStatusEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Generated"
		   });
		addAnnotation
		  (narrativeStatusEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Extensions"
		   });
		addAnnotation
		  (narrativeStatusEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Additional"
		   });
		addAnnotation
		  (narrativeStatusEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Empty"
		   });
		addAnnotation
		  (oidEClass,
		   source,
		   new String[] {
			   "documentation", "An OID represented as a URI\nRFC 3001. See also ISO/IEC 8824:1990 \u20ac\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (parameterDefinitionEClass,
		   source,
		   new String[] {
			   "documentation", "The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getParameterDefinition_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of the parameter used to allow access to the value of the parameter in evaluation contexts."
		   });
		addAnnotation
		  (getParameterDefinition_Use(),
		   source,
		   new String[] {
			   "documentation", "Whether the parameter is input or output for the module."
		   });
		addAnnotation
		  (getParameterDefinition_Min(),
		   source,
		   new String[] {
			   "documentation", "The minimum number of times this parameter SHALL appear in the request or response."
		   });
		addAnnotation
		  (getParameterDefinition_Max(),
		   source,
		   new String[] {
			   "documentation", "The maximum number of times this element is permitted to appear in the request or response."
		   });
		addAnnotation
		  (getParameterDefinition_Documentation(),
		   source,
		   new String[] {
			   "documentation", "A brief discussion of what the parameter is for and how it is used by the module."
		   });
		addAnnotation
		  (getParameterDefinition_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of the parameter."
		   });
		addAnnotation
		  (getParameterDefinition_Profile(),
		   source,
		   new String[] {
			   "documentation", "If specified, this indicates a profile that the input data must conform to, or that the output data will conform to."
		   });
		addAnnotation
		  (patientEClass,
		   source,
		   new String[] {
			   "documentation", "Demographics and other administrative information about an individual or animal receiving care or other health-related services.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (getPatient_Identifier(),
		   source,
		   new String[] {
			   "documentation", "An identifier for this patient."
		   });
		addAnnotation
		  (getPatient_Active(),
		   source,
		   new String[] {
			   "documentation", "Whether this patient record is in active use. \nMany systems use this property to mark as non-current patients, such as those that have not been seen for a period of time based on an organization\'s business rules.\n\nIt is often used to filter patient lists to exclude inactive patients\n\nDeceased patients may also be marked as inactive for the same reasons, but may be active for some time after death."
		   });
		addAnnotation
		  (getPatient_Name(),
		   source,
		   new String[] {
			   "documentation", "A name associated with the individual."
		   });
		addAnnotation
		  (getPatient_Telecom(),
		   source,
		   new String[] {
			   "documentation", "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
		   });
		addAnnotation
		  (getPatient_Gender(),
		   source,
		   new String[] {
			   "documentation", "Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes."
		   });
		addAnnotation
		  (getPatient_BirthDate(),
		   source,
		   new String[] {
			   "documentation", "The date of birth for the individual."
		   });
		addAnnotation
		  (getPatient_DeceasedBoolean(),
		   source,
		   new String[] {
			   "documentation", "Indicates if the individual is deceased or not. (choose any one of deceased*, but only one)"
		   });
		addAnnotation
		  (getPatient_DeceasedDateTime(),
		   source,
		   new String[] {
			   "documentation", "Indicates if the individual is deceased or not. (choose any one of deceased*, but only one)"
		   });
		addAnnotation
		  (getPatient_Address(),
		   source,
		   new String[] {
			   "documentation", "An address for the individual."
		   });
		addAnnotation
		  (getPatient_MaritalStatus(),
		   source,
		   new String[] {
			   "documentation", "This field contains a patient\'s most recent marital (civil) status."
		   });
		addAnnotation
		  (getPatient_MultipleBirthBoolean(),
		   source,
		   new String[] {
			   "documentation", "Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer). (choose any one of multipleBirth*, but only one)"
		   });
		addAnnotation
		  (getPatient_MultipleBirthInteger(),
		   source,
		   new String[] {
			   "documentation", "Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer). (choose any one of multipleBirth*, but only one)"
		   });
		addAnnotation
		  (getPatient_Photo(),
		   source,
		   new String[] {
			   "documentation", "Image of the patient."
		   });
		addAnnotation
		  (getPatient_Contact(),
		   source,
		   new String[] {
			   "documentation", "A contact party (e.g. guardian, partner, friend) for the patient."
		   });
		addAnnotation
		  (getPatient_Communication(),
		   source,
		   new String[] {
			   "documentation", "A language which may be used to communicate with the patient about his or her health."
		   });
		addAnnotation
		  (getPatient_GeneralPractitioner(),
		   source,
		   new String[] {
			   "documentation", "Patient\'s nominated care provider."
		   });
		addAnnotation
		  (getPatient_ManagingOrganization(),
		   source,
		   new String[] {
			   "documentation", "Organization that is the custodian of the patient record."
		   });
		addAnnotation
		  (getPatient_Link(),
		   source,
		   new String[] {
			   "documentation", "Link to a Patient or RelatedPerson resource that concerns the same actual individual."
		   });
		addAnnotation
		  (patientCommunicationEClass,
		   source,
		   new String[] {
			   "documentation", "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
		   });
		addAnnotation
		  (getPatientCommunication_Language(),
		   source,
		   new String[] {
			   "documentation", "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-AU\" for Australian English."
		   });
		addAnnotation
		  (getPatientCommunication_Preferred(),
		   source,
		   new String[] {
			   "documentation", "Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)."
		   });
		addAnnotation
		  (patientContactEClass,
		   source,
		   new String[] {
			   "documentation", "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
		   });
		addAnnotation
		  (getPatientContact_Relationship(),
		   source,
		   new String[] {
			   "documentation", "The nature of the relationship between the patient and the contact person."
		   });
		addAnnotation
		  (getPatientContact_Name(),
		   source,
		   new String[] {
			   "documentation", "A name associated with the contact person."
		   });
		addAnnotation
		  (getPatientContact_Telecom(),
		   source,
		   new String[] {
			   "documentation", "A contact detail for the person, e.g. a telephone number or an email address."
		   });
		addAnnotation
		  (getPatientContact_Address(),
		   source,
		   new String[] {
			   "documentation", "Address for the contact person."
		   });
		addAnnotation
		  (getPatientContact_Gender(),
		   source,
		   new String[] {
			   "documentation", "Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes."
		   });
		addAnnotation
		  (getPatientContact_Organization(),
		   source,
		   new String[] {
			   "documentation", "Organization on behalf of which the contact is acting or for which the contact is working."
		   });
		addAnnotation
		  (getPatientContact_Period(),
		   source,
		   new String[] {
			   "documentation", "The period during which this contact person or organization is valid to be contacted relating to this patient."
		   });
		addAnnotation
		  (patientLinkEClass,
		   source,
		   new String[] {
			   "documentation", "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
		   });
		addAnnotation
		  (getPatientLink_Other(),
		   source,
		   new String[] {
			   "documentation", "Link to a Patient or RelatedPerson resource that concerns the same actual individual."
		   });
		addAnnotation
		  (getPatientLink_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of link between this patient resource and another patient resource."
		   });
		addAnnotation
		  (periodEClass,
		   source,
		   new String[] {
			   "documentation", "A time period defined by a start and end date and optionally time.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getPeriod_Start(),
		   source,
		   new String[] {
			   "documentation", "The start of the period. The boundary is inclusive."
		   });
		addAnnotation
		  (getPeriod_End(),
		   source,
		   new String[] {
			   "documentation", "The end of the period. If the end of the period is missing, it means no end was known or planned at the time the instance was created. The start may be in the past, and the end date in the future, which means that period is expected/planned to end at that time."
		   });
		addAnnotation
		  (positiveIntEClass,
		   source,
		   new String[] {
			   "documentation", "An integer with a value that is positive (e.g. >0)\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (quantityEClass,
		   source,
		   new String[] {
			   "documentation", "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getQuantity_Value(),
		   source,
		   new String[] {
			   "documentation", "The value of the measured amount. The value includes an implicit precision in the presentation of the value."
		   });
		addAnnotation
		  (getQuantity_Comparator(),
		   source,
		   new String[] {
			   "documentation", "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value."
		   });
		addAnnotation
		  (getQuantity_Unit(),
		   source,
		   new String[] {
			   "documentation", "A human-readable form of the unit."
		   });
		addAnnotation
		  (getQuantity_System(),
		   source,
		   new String[] {
			   "documentation", "The identification of the system that provides the coded form of the unit."
		   });
		addAnnotation
		  (getQuantity_Code(),
		   source,
		   new String[] {
			   "documentation", "A computer processable form of the unit in some unit representation system."
		   });
		addAnnotation
		  (quantityComparatorEClass,
		   source,
		   new String[] {
			   "documentation", "How the Quantity should be understood and represented.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Less than"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Less or Equal to"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Greater or Equal to"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Greater than"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Sufficient to achieve this total quantity"
		   });
		addAnnotation
		  (rangeEClass,
		   source,
		   new String[] {
			   "documentation", "A set of ordered Quantities defined by a low and high limit.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getRange_Low(),
		   source,
		   new String[] {
			   "documentation", "The low limit. The boundary is inclusive."
		   });
		addAnnotation
		  (getRange_High(),
		   source,
		   new String[] {
			   "documentation", "The high limit. The boundary is inclusive."
		   });
		addAnnotation
		  (ratioEClass,
		   source,
		   new String[] {
			   "documentation", "A relationship of two Quantity values - expressed as a numerator and a denominator.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getRatio_Numerator(),
		   source,
		   new String[] {
			   "documentation", "The value of the numerator."
		   });
		addAnnotation
		  (getRatio_Denominator(),
		   source,
		   new String[] {
			   "documentation", "The value of the denominator."
		   });
		addAnnotation
		  (ratioRangeEClass,
		   source,
		   new String[] {
			   "documentation", "A range of ratios expressed as a low and high numerator and a denominator.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getRatioRange_LowNumerator(),
		   source,
		   new String[] {
			   "documentation", "The value of the low limit numerator."
		   });
		addAnnotation
		  (getRatioRange_HighNumerator(),
		   source,
		   new String[] {
			   "documentation", "The value of the high limit numerator."
		   });
		addAnnotation
		  (getRatioRange_Denominator(),
		   source,
		   new String[] {
			   "documentation", "The value of the denominator."
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "documentation", "A reference from one resource to another.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getReference_Reference(),
		   source,
		   new String[] {
			   "documentation", "A reference to a location at which the other resource is found. The reference may be a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with \'#\') refer to contained resources."
		   });
		addAnnotation
		  (getReference_Type(),
		   source,
		   new String[] {
			   "documentation", "The expected type of the target of the reference. If both Reference.type and Reference.reference are populated and Reference.reference is a FHIR URL, both SHALL be consistent.\n\nThe type is the Canonical URL of Resource Definition that is the type this reference refers to. References are URLs that are relative to http://hl7.org/fhir/StructureDefinition/ e.g. \"Patient\" is a reference to http://hl7.org/fhir/StructureDefinition/Patient. Absolute URLs are only allowed for logical models (and can only be used in references in logical models, not resources)."
		   });
		addAnnotation
		  (getReference_Identifier(),
		   source,
		   new String[] {
			   "documentation", "An identifier for the target resource. This is used when there is no way to reference the other resource directly, either because the entity it represents is not available through a FHIR server, or because there is no way for the author of the resource to convert a known identifier to an actual location. There is no requirement that a Reference.identifier point to something that is actually exposed as a FHIR instance, but it SHALL point to a business concept that would be expected to be exposed as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by the reference."
		   });
		addAnnotation
		  (getReference_Display(),
		   source,
		   new String[] {
			   "documentation", "Plain text narrative that identifies the resource in addition to the resource reference."
		   });
		addAnnotation
		  (relatedArtifactEClass,
		   source,
		   new String[] {
			   "documentation", "Related artifacts such as additional documentation, justification, or bibliographic references.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getRelatedArtifact_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of relationship to the related artifact."
		   });
		addAnnotation
		  (getRelatedArtifact_Classifier(),
		   source,
		   new String[] {
			   "documentation", "Provides additional classifiers of the related artifact."
		   });
		addAnnotation
		  (getRelatedArtifact_Label(),
		   source,
		   new String[] {
			   "documentation", "A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote index."
		   });
		addAnnotation
		  (getRelatedArtifact_Display(),
		   source,
		   new String[] {
			   "documentation", "A brief description of the document or knowledge resource being referenced, suitable for display to a consumer."
		   });
		addAnnotation
		  (getRelatedArtifact_Citation(),
		   source,
		   new String[] {
			   "documentation", "A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format."
		   });
		addAnnotation
		  (getRelatedArtifact_Document(),
		   source,
		   new String[] {
			   "documentation", "The document being referenced, represented as an attachment. This is exclusive with the resource element."
		   });
		addAnnotation
		  (getRelatedArtifact_Resource(),
		   source,
		   new String[] {
			   "documentation", "The related artifact, such as a library, value set, profile, or other knowledge resource."
		   });
		addAnnotation
		  (getRelatedArtifact_ResourceReference(),
		   source,
		   new String[] {
			   "documentation", "The related artifact, if the artifact is not a canonical resource, or a resource reference to a canonical resource."
		   });
		addAnnotation
		  (getRelatedArtifact_PublicationStatus(),
		   source,
		   new String[] {
			   "documentation", "The publication status of the artifact being referred to."
		   });
		addAnnotation
		  (getRelatedArtifact_PublicationDate(),
		   source,
		   new String[] {
			   "documentation", "The date of publication of the artifact being referred to."
		   });
		addAnnotation
		  (relatedArtifactTypeEClass,
		   source,
		   new String[] {
			   "documentation", "The type of relationship to the related artifact.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Documentation"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Justification"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Citation"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Predecessor"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Successor"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Derived From"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Depends On"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Composed Of"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Part Of"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Amends"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Amended With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "Appends"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "Appended With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "Cites"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "documentation", "Cited By"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "documentation", "Is Comment On"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "documentation", "Has Comment In"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "documentation", "Contains"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "documentation", "Contained In"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "documentation", "Corrects"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "documentation", "Correction In"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "documentation", "Replaces"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "documentation", "Replaced With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "documentation", "Retracts"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "documentation", "Retracted By"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "documentation", "Signs"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "documentation", "Similar To"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "documentation", "Supports"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "documentation", "Supported With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "documentation", "Transforms"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "documentation", "Transformed Into"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "documentation", "Transformed With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "documentation", "Documents"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "documentation", "Specification Of"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "documentation", "Created With"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "documentation", "Cite As"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "This is the base resource type for everything."
		   });
		addAnnotation
		  (getResource_Id(),
		   source,
		   new String[] {
			   "documentation", "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
		   });
		addAnnotation
		  (getResource_Meta(),
		   source,
		   new String[] {
			   "documentation", "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource."
		   });
		addAnnotation
		  (getResource_ImplicitRules(),
		   source,
		   new String[] {
			   "documentation", "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc."
		   });
		addAnnotation
		  (getResource_Language(),
		   source,
		   new String[] {
			   "documentation", "The base language in which the resource is written."
		   });
		addAnnotation
		  (sampledDataEClass,
		   source,
		   new String[] {
			   "documentation", "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getSampledData_Origin(),
		   source,
		   new String[] {
			   "documentation", "The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series."
		   });
		addAnnotation
		  (getSampledData_Interval(),
		   source,
		   new String[] {
			   "documentation", "Amount of intervalUnits between samples, e.g. milliseconds for time-based sampling."
		   });
		addAnnotation
		  (getSampledData_IntervalUnit(),
		   source,
		   new String[] {
			   "documentation", "The measurement unit in which the sample interval is expressed."
		   });
		addAnnotation
		  (getSampledData_Factor(),
		   source,
		   new String[] {
			   "documentation", "A correction factor that is applied to the sampled data points before they are added to the origin."
		   });
		addAnnotation
		  (getSampledData_LowerLimit(),
		   source,
		   new String[] {
			   "documentation", "The lower limit of detection of the measured points. This is needed if any of the data points have the value \"L\" (lower than detection limit)."
		   });
		addAnnotation
		  (getSampledData_UpperLimit(),
		   source,
		   new String[] {
			   "documentation", "The upper limit of detection of the measured points. This is needed if any of the data points have the value \"U\" (higher than detection limit)."
		   });
		addAnnotation
		  (getSampledData_Dimensions(),
		   source,
		   new String[] {
			   "documentation", "The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once."
		   });
		addAnnotation
		  (getSampledData_CodeMap(),
		   source,
		   new String[] {
			   "documentation", "Reference to ConceptMap that defines the codes used in the data."
		   });
		addAnnotation
		  (getSampledData_Offsets(),
		   source,
		   new String[] {
			   "documentation", "A series of data points which are decimal values separated by a single space (character u20).  The units in which the offsets are expressed are found in intervalUnit.  The absolute point at which the measurements begin SHALL be conveyed outside the scope of this datatype, e.g. Observation.effectiveDateTime for a timing offset."
		   });
		addAnnotation
		  (getSampledData_Data(),
		   source,
		   new String[] {
			   "documentation", "A series of data points which are decimal values or codes separated by a single space (character u20). The special codes \"E\" (error), \"L\" (below detection limit) and \"U\" (above detection limit) are also defined for used in place of decimal values."
		   });
		addAnnotation
		  (searchEntryModeEClass,
		   source,
		   new String[] {
			   "documentation", "\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (searchEntryModeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Match"
		   });
		addAnnotation
		  (searchEntryModeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Include"
		   });
		addAnnotation
		  (searchEntryModeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Outcome"
		   });
		addAnnotation
		  (signatureEClass,
		   source,
		   new String[] {
			   "documentation", "A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getSignature_Type(),
		   source,
		   new String[] {
			   "documentation", "An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document."
		   });
		addAnnotation
		  (getSignature_When(),
		   source,
		   new String[] {
			   "documentation", "When the digital signature was signed."
		   });
		addAnnotation
		  (getSignature_Who(),
		   source,
		   new String[] {
			   "documentation", "A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key)."
		   });
		addAnnotation
		  (getSignature_OnBehalfOf(),
		   source,
		   new String[] {
			   "documentation", "A reference to an application-usable description of the identity that is represented by the signature."
		   });
		addAnnotation
		  (getSignature_TargetFormat(),
		   source,
		   new String[] {
			   "documentation", "A mime type that indicates the technical format of the target resources signed by the signature."
		   });
		addAnnotation
		  (getSignature_SigFormat(),
		   source,
		   new String[] {
			   "documentation", "A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jose for JWS, and image/* for a graphical image of a signature, etc."
		   });
		addAnnotation
		  (getSignature_Data(),
		   source,
		   new String[] {
			   "documentation", "The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty."
		   });
		addAnnotation
		  (sortDirectionEClass,
		   source,
		   new String[] {
			   "documentation", "The possible sort directions, ascending or descending.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (sortDirectionEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Ascending"
		   });
		addAnnotation
		  (sortDirectionEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Descending"
		   });
		addAnnotation
		  (stringEClass,
		   source,
		   new String[] {
			   "documentation", "A sequence of Unicode characters\nNote that FHIR strings SHALL NOT exceed 1,048,576 (1024*1024) characters in size\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (timeEClass,
		   source,
		   new String[] {
			   "documentation", "A time during the day, with no date specified\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (timingEClass,
		   source,
		   new String[] {
			   "documentation", "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getTiming_Event(),
		   source,
		   new String[] {
			   "documentation", "Identifies specific times when the event occurs."
		   });
		addAnnotation
		  (getTiming_Repeat(),
		   source,
		   new String[] {
			   "documentation", "A set of rules that describe when the event is scheduled."
		   });
		addAnnotation
		  (getTiming_Code(),
		   source,
		   new String[] {
			   "documentation", "A code for the timing schedule (or just text in code.text). Some codes such as BID are ubiquitous, but many institutions define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the exception that .repeat.bounds still applies over the code (and is not contained in the code)."
		   });
		addAnnotation
		  (timingRepeatEClass,
		   source,
		   new String[] {
			   "documentation", "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsDuration(),
		   source,
		   new String[] {
			   "documentation", "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsRange(),
		   source,
		   new String[] {
			   "documentation", "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsPeriod(),
		   source,
		   new String[] {
			   "documentation", "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)"
		   });
		addAnnotation
		  (getTimingRepeat_Count(),
		   source,
		   new String[] {
			   "documentation", "A total count of the desired number of repetitions across the duration of the entire timing specification. If countMax is present, this element indicates the lower bound of the allowed range of count values."
		   });
		addAnnotation
		  (getTimingRepeat_CountMax(),
		   source,
		   new String[] {
			   "documentation", "If present, indicates that the count is a range - so to perform the action between [count] and [countMax] times."
		   });
		addAnnotation
		  (getTimingRepeat_Duration(),
		   source,
		   new String[] {
			   "documentation", "How long this thing happens for when it happens. If durationMax is present, this element indicates the lower bound of the allowed range of the duration."
		   });
		addAnnotation
		  (getTimingRepeat_DurationMax(),
		   source,
		   new String[] {
			   "documentation", "If present, indicates that the duration is a range - so to perform the action between [duration] and [durationMax] time length."
		   });
		addAnnotation
		  (getTimingRepeat_DurationUnit(),
		   source,
		   new String[] {
			   "documentation", "The units of time for the duration, in UCUM units\nNormal practice is to use the \'mo\' code as a calendar month when calculating the next occurrence."
		   });
		addAnnotation
		  (getTimingRepeat_Frequency(),
		   source,
		   new String[] {
			   "documentation", "The number of times to repeat the action within the specified period. If frequencyMax is present, this element indicates the lower bound of the allowed range of the frequency."
		   });
		addAnnotation
		  (getTimingRepeat_FrequencyMax(),
		   source,
		   new String[] {
			   "documentation", "If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range."
		   });
		addAnnotation
		  (getTimingRepeat_Period(),
		   source,
		   new String[] {
			   "documentation", "Indicates the duration of time over which repetitions are to occur; e.g. to express \"3 times per day\", 3 would be the frequency and \"1 day\" would be the period. If periodMax is present, this element indicates the lower bound of the allowed range of the period length."
		   });
		addAnnotation
		  (getTimingRepeat_PeriodMax(),
		   source,
		   new String[] {
			   "documentation", "If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \"do this once every 3-5 days."
		   });
		addAnnotation
		  (getTimingRepeat_PeriodUnit(),
		   source,
		   new String[] {
			   "documentation", "The units of time for the period in UCUM units\nNormal practice is to use the \'mo\' code as a calendar month when calculating the next occurrence."
		   });
		addAnnotation
		  (getTimingRepeat_DayOfWeek(),
		   source,
		   new String[] {
			   "documentation", "If one or more days of week is provided, then the action happens only on the specified day(s)."
		   });
		addAnnotation
		  (getTimingRepeat_TimeOfDay(),
		   source,
		   new String[] {
			   "documentation", "Specified time of day for action to take place."
		   });
		addAnnotation
		  (getTimingRepeat_When(),
		   source,
		   new String[] {
			   "documentation", "An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur."
		   });
		addAnnotation
		  (getTimingRepeat_Offset(),
		   source,
		   new String[] {
			   "documentation", "The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event."
		   });
		addAnnotation
		  (triggerDefinitionEClass,
		   source,
		   new String[] {
			   "documentation", "A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getTriggerDefinition_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of triggering event."
		   });
		addAnnotation
		  (getTriggerDefinition_Name(),
		   source,
		   new String[] {
			   "documentation", "A formal name for the event. This may be an absolute URI that identifies the event formally (e.g. from a trigger registry), or a simple relative URI that identifies the event in a local context."
		   });
		addAnnotation
		  (getTriggerDefinition_Code(),
		   source,
		   new String[] {
			   "documentation", "A code that identifies the event."
		   });
		addAnnotation
		  (getTriggerDefinition_SubscriptionTopic(),
		   source,
		   new String[] {
			   "documentation", "A reference to a SubscriptionTopic resource that defines the event. If this element is provided, no other information about the trigger definition may be supplied."
		   });
		addAnnotation
		  (getTriggerDefinition_TimingTiming(),
		   source,
		   new String[] {
			   "documentation", "The timing of the event (if this is a periodic trigger). (choose any one of timing*, but only one)"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingReference(),
		   source,
		   new String[] {
			   "documentation", "The timing of the event (if this is a periodic trigger). (choose any one of timing*, but only one)"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingDate(),
		   source,
		   new String[] {
			   "documentation", "The timing of the event (if this is a periodic trigger). (choose any one of timing*, but only one)"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingDateTime(),
		   source,
		   new String[] {
			   "documentation", "The timing of the event (if this is a periodic trigger). (choose any one of timing*, but only one)"
		   });
		addAnnotation
		  (getTriggerDefinition_Data(),
		   source,
		   new String[] {
			   "documentation", "The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true."
		   });
		addAnnotation
		  (getTriggerDefinition_Condition(),
		   source,
		   new String[] {
			   "documentation", "A boolean-valued expression that is evaluated in the context of the container of the trigger definition and returns whether or not the trigger fires."
		   });
		addAnnotation
		  (triggerTypeEClass,
		   source,
		   new String[] {
			   "documentation", "The type of trigger.\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Named Event"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Periodic"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Data Changed"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Data Added"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Data Updated"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Data Removed"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Data Accessed"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Data Access Ended"
		   });
		addAnnotation
		  (unitsOfTimeEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of time (units from UCUM).\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "\u79d2"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "\u5206\u949f"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "\u5c0f\u65f6"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "\u5929"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "\u661f\u671f"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "\u6708"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "\u5e74"
		   });
		addAnnotation
		  (unsignedIntEClass,
		   source,
		   new String[] {
			   "documentation", "An integer with a value that is not negative (e.g. >= 0)\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (uriEClass,
		   source,
		   new String[] {
			   "documentation", "String of characters used to identify a name or a resource\nsee http://en.wikipedia.org/wiki/Uniform_resource_identifier\nIf the element is present, it must have either a @value, an @id, or extensions"
		   });
		addAnnotation
		  (urlEClass,
		   source,
		   new String[] {
			   "documentation", "A URI that is a literal reference\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (usageContextEClass,
		   source,
		   new String[] {
			   "documentation", "Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).\nIf the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions"
		   });
		addAnnotation
		  (getUsageContext_Code(),
		   source,
		   new String[] {
			   "documentation", "A code that identifies the type of context being specified by this usage context."
		   });
		addAnnotation
		  (getUsageContext_ValueCodeableConcept(),
		   source,
		   new String[] {
			   "documentation", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getUsageContext_ValueQuantity(),
		   source,
		   new String[] {
			   "documentation", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getUsageContext_ValueRange(),
		   source,
		   new String[] {
			   "documentation", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (getUsageContext_ValueReference(),
		   source,
		   new String[] {
			   "documentation", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code. (choose any one of value*, but only one)"
		   });
		addAnnotation
		  (uuidEClass,
		   source,
		   new String[] {
			   "documentation", "A UUID, represented as a URI\nSee The Open Group, CDE 1.1 Remote Procedure Call specification, Appendix A.\nIf the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (addressEClass,
		   source,
		   new String[] {
			   "name", "Address",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddress_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_Line(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "line",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_City(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "city",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_District(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "district",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_State(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "state",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_PostalCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postalCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_Country(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "country",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddress_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (addressTypeEClass,
		   source,
		   new String[] {
			   "name", "AddressType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (addressTypeEnumEEnum,
		   source,
		   new String[] {
			   "name", "AddressTypeEnum"
		   });
		addAnnotation
		  (addressUseEClass,
		   source,
		   new String[] {
			   "name", "AddressUse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressUse_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (addressUseEnumEEnum,
		   source,
		   new String[] {
			   "name", "AddressUseEnum"
		   });
		addAnnotation
		  (administrativeGenderEClass,
		   source,
		   new String[] {
			   "name", "AdministrativeGender",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdministrativeGender_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (administrativeGenderEnumEEnum,
		   source,
		   new String[] {
			   "name", "AdministrativeGenderEnum"
		   });
		addAnnotation
		  (ageEClass,
		   source,
		   new String[] {
			   "name", "Age",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (annotationEClass,
		   source,
		   new String[] {
			   "name", "Annotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnotation_AuthorReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnotation_AuthorString(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorString",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnotation_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnotation_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (attachmentEClass,
		   source,
		   new String[] {
			   "name", "Attachment",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttachment_ContentType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contentType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Url(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Size(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Hash(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hash",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Creation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Height(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "height",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Width(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "width",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Frames(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "frames",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttachment_Pages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pages",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (availabilityEClass,
		   source,
		   new String[] {
			   "name", "Availability",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAvailability_AvailableTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "availableTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAvailability_NotAvailableTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "notAvailableTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (availabilityAvailableTimeEClass,
		   source,
		   new String[] {
			   "name", "Availability.AvailableTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_DaysOfWeek(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "daysOfWeek",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AllDay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allDay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AvailableStartTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "availableStartTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAvailabilityAvailableTime_AvailableEndTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "availableEndTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (availabilityNotAvailableTimeEClass,
		   source,
		   new String[] {
			   "name", "Availability.NotAvailableTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAvailabilityNotAvailableTime_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAvailabilityNotAvailableTime_During(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "during",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (backboneElementEClass,
		   source,
		   new String[] {
			   "name", "BackboneElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBackboneElement_ModifierExtension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modifierExtension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (backboneTypeEClass,
		   source,
		   new String[] {
			   "name", "BackboneType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBackboneType_ModifierExtension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modifierExtension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (baseEClass,
		   source,
		   new String[] {
			   "name", "Base",
			   "kind", "empty"
		   });
		addAnnotation
		  (base64BinaryEClass,
		   source,
		   new String[] {
			   "name", "base64Binary",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBase64Binary_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (base64BinaryPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "base64Binary-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary",
			   "pattern", "([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?"
		   });
		addAnnotation
		  (binaryEClass,
		   source,
		   new String[] {
			   "name", "Binary",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBinary_ContentType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contentType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinary_SecurityContext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "securityContext",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBinary_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (booleanEClass,
		   source,
		   new String[] {
			   "name", "boolean",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBoolean_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (booleanPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "boolean-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean",
			   "pattern", "true|false"
		   });
		addAnnotation
		  (booleanPrimitiveObjectEDataType,
		   source,
		   new String[] {
			   "name", "boolean-primitive:Object",
			   "baseType", "boolean-primitive"
		   });
		addAnnotation
		  (bundleEClass,
		   source,
		   new String[] {
			   "name", "Bundle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundle_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Timestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Total(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "total",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundle_Signature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleEntryEClass,
		   source,
		   new String[] {
			   "name", "Bundle.Entry",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleEntry_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleEntry_FullUrl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fullUrl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleEntry_Search(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "search",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleEntry_Request(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "request",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleEntry_Response(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "response",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleLinkEClass,
		   source,
		   new String[] {
			   "name", "Bundle.Link",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleLink_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleLink_Url(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleRequestEClass,
		   source,
		   new String[] {
			   "name", "Bundle.Request",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleRequest_Method(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "method",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleRequest_Url(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleRequest_IfNoneMatch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifNoneMatch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleRequest_IfModifiedSince(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifModifiedSince",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleRequest_IfMatch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifMatch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleRequest_IfNoneExist(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifNoneExist",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleResponseEClass,
		   source,
		   new String[] {
			   "name", "Bundle.Response",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleResponse_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleResponse_Etag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "etag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleResponse_LastModified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lastModified",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleSearchEClass,
		   source,
		   new String[] {
			   "name", "Bundle.Search",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleSearch_Mode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBundleSearch_Score(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "score",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleTypeEClass,
		   source,
		   new String[] {
			   "name", "BundleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (bundleTypeEnumEEnum,
		   source,
		   new String[] {
			   "name", "BundleTypeEnum"
		   });
		addAnnotation
		  (canonicalEClass,
		   source,
		   new String[] {
			   "name", "canonical",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCanonical_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (canonicalPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "canonical-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "minLength", "1",
			   "pattern", "\\S*"
		   });
		addAnnotation
		  (codeEClass,
		   source,
		   new String[] {
			   "name", "code",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCode_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (codeableConceptEClass,
		   source,
		   new String[] {
			   "name", "CodeableConcept",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCodeableConcept_Coding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "coding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCodeableConcept_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codeableReferenceEClass,
		   source,
		   new String[] {
			   "name", "CodeableReference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCodeableReference_Concept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "concept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCodeableReference_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (codePrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "code-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			   "minLength", "1",
			   "pattern", "[^\\s]+(%20[^\\s]+)*"
		   });
		addAnnotation
		  (codingEClass,
		   source,
		   new String[] {
			   "name", "Coding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCoding_System(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "system",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCoding_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCoding_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCoding_Display(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "display",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCoding_UserSelected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "userSelected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactDetailEClass,
		   source,
		   new String[] {
			   "name", "ContactDetail",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactDetail_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactDetail_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactPointEClass,
		   source,
		   new String[] {
			   "name", "ContactPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactPoint_System(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "system",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactPoint_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactPoint_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactPoint_Rank(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rank",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactPoint_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactPointSystemEClass,
		   source,
		   new String[] {
			   "name", "ContactPointSystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactPointSystem_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (contactPointSystemEnumEEnum,
		   source,
		   new String[] {
			   "name", "ContactPointSystemEnum"
		   });
		addAnnotation
		  (contactPointUseEClass,
		   source,
		   new String[] {
			   "name", "ContactPointUse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactPointUse_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (contactPointUseEnumEEnum,
		   source,
		   new String[] {
			   "name", "ContactPointUseEnum"
		   });
		addAnnotation
		  (countEClass,
		   source,
		   new String[] {
			   "name", "Count",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dataRequirementEClass,
		   source,
		   new String[] {
			   "name", "DataRequirement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataRequirement_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_Profile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "profile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_SubjectCodeableConcept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subjectCodeableConcept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_SubjectReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subjectReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_MustSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mustSupport",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_CodeFilter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "codeFilter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_DateFilter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateFilter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_ValueFilter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueFilter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_Limit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "limit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirement_Sort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataRequirementCodeFilterEClass,
		   source,
		   new String[] {
			   "name", "DataRequirement.CodeFilter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_Path(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_SearchParam(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "searchParam",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_ValueSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementCodeFilter_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataRequirementDateFilterEClass,
		   source,
		   new String[] {
			   "name", "DataRequirement.DateFilter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_Path(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_SearchParam(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "searchParam",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValueDateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValuePeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valuePeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementDateFilter_ValueDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataRequirementSortEClass,
		   source,
		   new String[] {
			   "name", "DataRequirement.Sort",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataRequirementSort_Path(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementSort_Direction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "direction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataRequirementValueFilterEClass,
		   source,
		   new String[] {
			   "name", "DataRequirement.ValueFilter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_Path(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_SearchParam(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "searchParam",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_Comparator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValueDateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValuePeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valuePeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataRequirementValueFilter_ValueDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "name", "DataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dateEClass,
		   source,
		   new String[] {
			   "name", "date",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDate_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (datePrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "date-primitive",
			   "baseType", "date-primitive_._base",
			   "pattern", "([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?"
		   });
		addAnnotation
		  (datePrimitiveBaseEDataType,
		   source,
		   new String[] {
			   "name", "date-primitive_._base",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date"
		   });
		addAnnotation
		  (dateTimeEClass,
		   source,
		   new String[] {
			   "name", "dateTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDateTime_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (dateTimePrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "dateTime-primitive",
			   "baseType", "dateTime-primitive_._base",
			   "pattern", "([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?"
		   });
		addAnnotation
		  (dateTimePrimitiveBaseEDataType,
		   source,
		   new String[] {
			   "name", "dateTime-primitive_._base",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
		addAnnotation
		  (decimalEClass,
		   source,
		   new String[] {
			   "name", "decimal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDecimal_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (decimalPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "decimal-primitive",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#decimal http://www.eclipse.org/emf/2003/XMLType#double"
		   });
		addAnnotation
		  (distanceEClass,
		   source,
		   new String[] {
			   "name", "Distance",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (domainResourceEClass,
		   source,
		   new String[] {
			   "name", "DomainResource",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDomainResource_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDomainResource_Extension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDomainResource_ModifierExtension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modifierExtension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dosageEClass,
		   source,
		   new String[] {
			   "name", "Dosage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDosage_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_AdditionalInstruction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "additionalInstruction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_PatientInstruction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patientInstruction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_Timing(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timing",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_AsNeeded(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "asNeeded",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_AsNeededFor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "asNeededFor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_Site(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "site",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_Route(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "route",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_Method(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "method",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_DoseAndRate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "doseAndRate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_MaxDosePerPeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxDosePerPeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_MaxDosePerAdministration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxDosePerAdministration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosage_MaxDosePerLifetime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxDosePerLifetime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dosageDoseAndRateEClass,
		   source,
		   new String[] {
			   "name", "Dosage.DoseAndRate",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDosageDoseAndRate_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosageDoseAndRate_DoseRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "doseRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosageDoseAndRate_DoseQuantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "doseQuantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateRatio(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rateRatio",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rateRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDosageDoseAndRate_RateQuantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rateQuantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (durationEClass,
		   source,
		   new String[] {
			   "name", "Duration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "name", "Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Extension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getElement_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (eventTimingEClass,
		   source,
		   new String[] {
			   "name", "EventTiming",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEventTiming_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (eventTimingEnumEEnum,
		   source,
		   new String[] {
			   "name", "EventTimingEnum"
		   });
		addAnnotation
		  (expressionEClass,
		   source,
		   new String[] {
			   "name", "Expression",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExpression_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExpression_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExpression_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExpression_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExpression_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (extendedContactDetailEClass,
		   source,
		   new String[] {
			   "name", "ExtendedContactDetail",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtendedContactDetail_Purpose(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "purpose",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedContactDetail_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedContactDetail_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedContactDetail_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedContactDetail_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtendedContactDetail_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (extensionEClass,
		   source,
		   new String[] {
			   "name", "Extension",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtension_ValueBase64Binary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueBase64Binary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueBoolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueBoolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCanonical(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCanonical",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDecimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDecimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueInstant(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueInstant",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueInteger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueInteger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueInteger64(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueInteger64",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueMarkdown(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueMarkdown",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueOid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueOid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValuePositiveInt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valuePositiveInt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueString(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueString",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueUnsignedInt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueUnsignedInt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueUri(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueUri",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueUrl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueUrl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueUuid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueUuid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueAge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueAge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueAnnotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueAnnotation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueAttachment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueAttachment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCodeableConcept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCodeableConcept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCodeableReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCodeableReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCoding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCoding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueContactPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueContactPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueCount(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCount",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDistance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDistance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueHumanName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueHumanName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueIdentifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueIdentifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueMoney(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueMoney",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValuePeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valuePeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueQuantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueQuantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueRatio(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueRatio",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueRatioRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueRatioRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueSampledData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueSampledData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueSignature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueSignature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueTiming(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueTiming",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueContactDetail(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueContactDetail",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDataRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDataRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueParameterDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueParameterDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueRelatedArtifact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueRelatedArtifact",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueTriggerDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueTriggerDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueUsageContext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueUsageContext",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueAvailability(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueAvailability",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueExtendedContactDetail(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueExtendedContactDetail",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueDosage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueDosage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_ValueMeta(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueMeta",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtension_Url(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "url"
		   });
		addAnnotation
		  (httpVerbEClass,
		   source,
		   new String[] {
			   "name", "HTTPVerb",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHTTPVerb_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (httpVerbEnumEEnum,
		   source,
		   new String[] {
			   "name", "HTTPVerbEnum"
		   });
		addAnnotation
		  (humanNameEClass,
		   source,
		   new String[] {
			   "name", "HumanName",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHumanName_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Family(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "family",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Given(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "given",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Prefix(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "prefix",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Suffix(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "suffix",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHumanName_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idEClass,
		   source,
		   new String[] {
			   "name", "id",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getId_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (identifierEClass,
		   source,
		   new String[] {
			   "name", "Identifier",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifier_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifier_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifier_System(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "system",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifier_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifier_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifier_Assigner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assigner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierUseEClass,
		   source,
		   new String[] {
			   "name", "IdentifierUse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifierUse_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (identifierUseEnumEEnum,
		   source,
		   new String[] {
			   "name", "IdentifierUseEnum"
		   });
		addAnnotation
		  (idPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "id-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "minLength", "1",
			   "maxLength", "64",
			   "pattern", "[A-Za-z0-9\\-\\.]{1,64}"
		   });
		addAnnotation
		  (instantEClass,
		   source,
		   new String[] {
			   "name", "instant",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInstant_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (instantPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "instant-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime",
			   "pattern", "([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]{1,9})?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))"
		   });
		addAnnotation
		  (integerEClass,
		   source,
		   new String[] {
			   "name", "integer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInteger_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (integer64EClass,
		   source,
		   new String[] {
			   "name", "integer64",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInteger64_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (integer64PrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "integer64-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#long",
			   "pattern", "[0]|[-+]?[1-9][0-9]*"
		   });
		addAnnotation
		  (integer64PrimitiveObjectEDataType,
		   source,
		   new String[] {
			   "name", "integer64-primitive:Object",
			   "baseType", "integer64-primitive"
		   });
		addAnnotation
		  (integerPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "integer-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			   "pattern", "[0]|[-+]?[1-9][0-9]*"
		   });
		addAnnotation
		  (integerPrimitiveObjectEDataType,
		   source,
		   new String[] {
			   "name", "integer-primitive:Object",
			   "baseType", "integer-primitive"
		   });
		addAnnotation
		  (linkRelationTypesEClass,
		   source,
		   new String[] {
			   "name", "LinkRelationTypes",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinkRelationTypes_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (linkRelationTypesEnumEEnum,
		   source,
		   new String[] {
			   "name", "LinkRelationTypesEnum"
		   });
		addAnnotation
		  (linkTypeEClass,
		   source,
		   new String[] {
			   "name", "LinkType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinkType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (linkTypeEnumEEnum,
		   source,
		   new String[] {
			   "name", "LinkTypeEnum"
		   });
		addAnnotation
		  (markdownEClass,
		   source,
		   new String[] {
			   "name", "markdown",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMarkdown_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (markdownPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "markdown-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "minLength", "1",
			   "pattern", "[\\s\\S]+"
		   });
		addAnnotation
		  (metaEClass,
		   source,
		   new String[] {
			   "name", "Meta",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeta_VersionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeta_LastUpdated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lastUpdated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeta_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeta_Profile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "profile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeta_Security(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "security",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeta_Tag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (moneyEClass,
		   source,
		   new String[] {
			   "name", "Money",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMoney_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMoney_Currency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "currency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameUseEClass,
		   source,
		   new String[] {
			   "name", "NameUse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameUse_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (nameUseEnumEEnum,
		   source,
		   new String[] {
			   "name", "NameUseEnum"
		   });
		addAnnotation
		  (narrativeEClass,
		   source,
		   new String[] {
			   "name", "Narrative",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNarrative_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNarrative_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "div",
			   "namespace", "http://www.w3.org/1999/xhtml"
		   });
		addAnnotation
		  (narrativeStatusEClass,
		   source,
		   new String[] {
			   "name", "NarrativeStatus",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNarrativeStatus_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (narrativeStatusEnumEEnum,
		   source,
		   new String[] {
			   "name", "NarrativeStatusEnum"
		   });
		addAnnotation
		  (oidEClass,
		   source,
		   new String[] {
			   "name", "oid",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOid_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (oidPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "oid-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "minLength", "1",
			   "pattern", "urn:oid:[0-2](\\.(0|[1-9][0-9]*))+"
		   });
		addAnnotation
		  (parameterDefinitionEClass,
		   source,
		   new String[] {
			   "name", "ParameterDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getParameterDefinition_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Min(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "min",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Max(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "max",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParameterDefinition_Profile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "profile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (patientEClass,
		   source,
		   new String[] {
			   "name", "Patient",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatient_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Active(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "active",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Gender(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gender",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_BirthDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "birthDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_DeceasedBoolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deceasedBoolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_DeceasedDateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deceasedDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_MaritalStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maritalStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_MultipleBirthBoolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "multipleBirthBoolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_MultipleBirthInteger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "multipleBirthInteger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Photo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "photo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Contact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contact",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Communication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "communication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_GeneralPractitioner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "generalPractitioner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_ManagingOrganization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "managingOrganization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (patientCommunicationEClass,
		   source,
		   new String[] {
			   "name", "Patient.Communication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatientCommunication_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientCommunication_Preferred(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "preferred",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (patientContactEClass,
		   source,
		   new String[] {
			   "name", "Patient.Contact",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatientContact_Relationship(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relationship",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Gender(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gender",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientContact_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (patientLinkEClass,
		   source,
		   new String[] {
			   "name", "Patient.Link",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatientLink_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "other",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatientLink_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (periodEClass,
		   source,
		   new String[] {
			   "name", "Period",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPeriod_Start(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "start",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPeriod_End(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "end",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (positiveIntEClass,
		   source,
		   new String[] {
			   "name", "positiveInt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPositiveInt_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (positiveIntPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "positiveInt-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger",
			   "pattern", "[1-9][0-9]*"
		   });
		addAnnotation
		  (quantityEClass,
		   source,
		   new String[] {
			   "name", "Quantity",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQuantity_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQuantity_Comparator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "comparator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQuantity_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQuantity_System(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "system",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQuantity_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (quantityComparatorEClass,
		   source,
		   new String[] {
			   "name", "QuantityComparator",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQuantityComparator_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (quantityComparatorEnumEEnum,
		   source,
		   new String[] {
			   "name", "QuantityComparatorEnum"
		   });
		addAnnotation
		  (rangeEClass,
		   source,
		   new String[] {
			   "name", "Range",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRange_Low(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "low",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRange_High(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "high",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ratioEClass,
		   source,
		   new String[] {
			   "name", "Ratio",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRatio_Numerator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "numerator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRatio_Denominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "denominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ratioRangeEClass,
		   source,
		   new String[] {
			   "name", "RatioRange",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRatioRange_LowNumerator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lowNumerator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRatioRange_HighNumerator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "highNumerator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRatioRange_Denominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "denominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "name", "Reference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReference_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReference_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReference_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReference_Display(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "display",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relatedArtifactEClass,
		   source,
		   new String[] {
			   "name", "RelatedArtifact",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelatedArtifact_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Classifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "classifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Display(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "display",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Citation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "citation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Document(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "document",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_Resource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_ResourceReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "resourceReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_PublicationStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicationStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedArtifact_PublicationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicationDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relatedArtifactTypeEClass,
		   source,
		   new String[] {
			   "name", "RelatedArtifactType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelatedArtifactType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (relatedArtifactTypeEnumEEnum,
		   source,
		   new String[] {
			   "name", "RelatedArtifactTypeEnum"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "name", "Resource",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResource_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResource_Meta(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meta",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResource_ImplicitRules(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "implicitRules",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResource_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sampledDataEClass,
		   source,
		   new String[] {
			   "name", "SampledData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSampledData_Origin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "origin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_Interval(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "interval",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_IntervalUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intervalUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_Factor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "factor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_LowerLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lowerLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_UpperLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "upperLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_Dimensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dimensions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_CodeMap(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "codeMap",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_Offsets(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "offsets",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledData_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sampledDataDataTypeEClass,
		   source,
		   new String[] {
			   "name", "SampledDataDataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSampledDataDataType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (sampledDataDataTypePrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "SampledDataDataType-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])(%20((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*"
		   });
		addAnnotation
		  (searchEntryModeEClass,
		   source,
		   new String[] {
			   "name", "SearchEntryMode",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSearchEntryMode_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (searchEntryModeEnumEEnum,
		   source,
		   new String[] {
			   "name", "SearchEntryModeEnum"
		   });
		addAnnotation
		  (signatureEClass,
		   source,
		   new String[] {
			   "name", "Signature",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignature_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_When(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "when",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_Who(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "who",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_OnBehalfOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onBehalfOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_TargetFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "targetFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_SigFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sigFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignature_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sortDirectionEClass,
		   source,
		   new String[] {
			   "name", "SortDirection",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSortDirection_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (sortDirectionEnumEEnum,
		   source,
		   new String[] {
			   "name", "SortDirectionEnum"
		   });
		addAnnotation
		  (stringEClass,
		   source,
		   new String[] {
			   "name", "string",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getString_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (stringPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "string-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "minLength", "1"
		   });
		addAnnotation
		  (timeEClass,
		   source,
		   new String[] {
			   "name", "time",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTime_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (timePrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "time-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#time",
			   "pattern", "([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?"
		   });
		addAnnotation
		  (timingEClass,
		   source,
		   new String[] {
			   "name", "Timing",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTiming_Event(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "event",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTiming_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTiming_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (timingRepeatEClass,
		   source,
		   new String[] {
			   "name", "Timing.Repeat",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "boundsDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "boundsRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_BoundsPeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "boundsPeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_Count(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "count",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_CountMax(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "countMax",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_DurationMax(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "durationMax",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_DurationUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "durationUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_FrequencyMax(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "frequencyMax",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_Period(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "period",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_PeriodMax(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "periodMax",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_PeriodUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "periodUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_DayOfWeek(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dayOfWeek",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_TimeOfDay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timeOfDay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_When(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "when",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingRepeat_Offset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "offset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (triggerDefinitionEClass,
		   source,
		   new String[] {
			   "name", "TriggerDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTriggerDefinition_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_SubscriptionTopic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subscriptionTopic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingTiming(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timingTiming",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timingReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timingDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_TimingDateTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timingDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerDefinition_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (triggerTypeEClass,
		   source,
		   new String[] {
			   "name", "TriggerType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTriggerType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (triggerTypeEnumEEnum,
		   source,
		   new String[] {
			   "name", "TriggerTypeEnum"
		   });
		addAnnotation
		  (unitsOfTimeEClass,
		   source,
		   new String[] {
			   "name", "UnitsOfTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnitsOfTime_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (unitsOfTimeEnumEEnum,
		   source,
		   new String[] {
			   "name", "UnitsOfTimeEnum"
		   });
		addAnnotation
		  (unsignedIntEClass,
		   source,
		   new String[] {
			   "name", "unsignedInt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnsignedInt_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (unsignedIntPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "unsignedInt-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			   "pattern", "[0]|([1-9][0-9]*)"
		   });
		addAnnotation
		  (uriEClass,
		   source,
		   new String[] {
			   "name", "uri",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUri_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (uriPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "uri-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "pattern", "\\S*"
		   });
		addAnnotation
		  (urlEClass,
		   source,
		   new String[] {
			   "name", "url",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUrl_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (urlPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "url-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "minLength", "1",
			   "pattern", "\\S*"
		   });
		addAnnotation
		  (usageContextEClass,
		   source,
		   new String[] {
			   "name", "UsageContext",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUsageContext_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsageContext_ValueCodeableConcept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueCodeableConcept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsageContext_ValueQuantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueQuantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsageContext_ValueRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueRange",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsageContext_ValueReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valueReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (uuidEClass,
		   source,
		   new String[] {
			   "name", "uuid",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUuid_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (uuidPrimitiveEDataType,
		   source,
		   new String[] {
			   "name", "uuid-primitive",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "minLength", "1",
			   "pattern", "urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"
		   });
	}

} //Fhir_PatientPackageImpl
