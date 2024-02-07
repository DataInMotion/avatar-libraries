/**
 */
package org.hl7.fhir_patient.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.fhir_patient.Address;
import org.hl7.fhir_patient.AddressType;
import org.hl7.fhir_patient.AddressUse;
import org.hl7.fhir_patient.AdministrativeGender;
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
import org.hl7.fhir_patient.Canonical;
import org.hl7.fhir_patient.Code;
import org.hl7.fhir_patient.CodeableConcept;
import org.hl7.fhir_patient.CodeableReference;
import org.hl7.fhir_patient.Coding;
import org.hl7.fhir_patient.ContactDetail;
import org.hl7.fhir_patient.ContactPoint;
import org.hl7.fhir_patient.ContactPointSystem;
import org.hl7.fhir_patient.ContactPointUse;
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
import org.hl7.fhir_patient.Expression;
import org.hl7.fhir_patient.ExtendedContactDetail;
import org.hl7.fhir_patient.Extension;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.HTTPVerb;
import org.hl7.fhir_patient.HumanName;
import org.hl7.fhir_patient.Id;
import org.hl7.fhir_patient.Identifier;
import org.hl7.fhir_patient.IdentifierUse;
import org.hl7.fhir_patient.Instant;
import org.hl7.fhir_patient.Integer64;
import org.hl7.fhir_patient.LinkRelationTypes;
import org.hl7.fhir_patient.LinkType;
import org.hl7.fhir_patient.Markdown;
import org.hl7.fhir_patient.Meta;
import org.hl7.fhir_patient.Money;
import org.hl7.fhir_patient.NameUse;
import org.hl7.fhir_patient.Narrative;
import org.hl7.fhir_patient.NarrativeStatus;
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
import org.hl7.fhir_patient.Range;
import org.hl7.fhir_patient.Ratio;
import org.hl7.fhir_patient.RatioRange;
import org.hl7.fhir_patient.Reference;
import org.hl7.fhir_patient.RelatedArtifact;
import org.hl7.fhir_patient.RelatedArtifactType;
import org.hl7.fhir_patient.Resource;
import org.hl7.fhir_patient.SampledData;
import org.hl7.fhir_patient.SampledDataDataType;
import org.hl7.fhir_patient.SearchEntryMode;
import org.hl7.fhir_patient.Signature;
import org.hl7.fhir_patient.SortDirection;
import org.hl7.fhir_patient.Time;
import org.hl7.fhir_patient.Timing;
import org.hl7.fhir_patient.TimingRepeat;
import org.hl7.fhir_patient.TriggerDefinition;
import org.hl7.fhir_patient.TriggerType;
import org.hl7.fhir_patient.UnitsOfTime;
import org.hl7.fhir_patient.UnsignedInt;
import org.hl7.fhir_patient.Uri;
import org.hl7.fhir_patient.Url;
import org.hl7.fhir_patient.UsageContext;
import org.hl7.fhir_patient.Uuid;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir_patient.Fhir_PatientPackage
 * @generated
 */
public class Fhir_PatientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fhir_PatientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fhir_PatientSwitch() {
		if (modelPackage == null) {
			modelPackage = Fhir_PatientPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Fhir_PatientPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseDataType(address);
				if (result == null) result = caseElement(address);
				if (result == null) result = caseBase(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseElement(addressType);
				if (result == null) result = caseBase(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ADDRESS_USE: {
				AddressUse addressUse = (AddressUse)theEObject;
				T result = caseAddressUse(addressUse);
				if (result == null) result = caseElement(addressUse);
				if (result == null) result = caseBase(addressUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ADMINISTRATIVE_GENDER: {
				AdministrativeGender administrativeGender = (AdministrativeGender)theEObject;
				T result = caseAdministrativeGender(administrativeGender);
				if (result == null) result = caseElement(administrativeGender);
				if (result == null) result = caseBase(administrativeGender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.AGE: {
				Age age = (Age)theEObject;
				T result = caseAge(age);
				if (result == null) result = caseQuantity(age);
				if (result == null) result = caseDataType(age);
				if (result == null) result = caseElement(age);
				if (result == null) result = caseBase(age);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseDataType(annotation);
				if (result == null) result = caseElement(annotation);
				if (result == null) result = caseBase(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseDataType(attachment);
				if (result == null) result = caseElement(attachment);
				if (result == null) result = caseBase(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.AVAILABILITY: {
				Availability availability = (Availability)theEObject;
				T result = caseAvailability(availability);
				if (result == null) result = caseDataType(availability);
				if (result == null) result = caseElement(availability);
				if (result == null) result = caseBase(availability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.AVAILABILITY_AVAILABLE_TIME: {
				AvailabilityAvailableTime availabilityAvailableTime = (AvailabilityAvailableTime)theEObject;
				T result = caseAvailabilityAvailableTime(availabilityAvailableTime);
				if (result == null) result = caseDataType(availabilityAvailableTime);
				if (result == null) result = caseElement(availabilityAvailableTime);
				if (result == null) result = caseBase(availabilityAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.AVAILABILITY_NOT_AVAILABLE_TIME: {
				AvailabilityNotAvailableTime availabilityNotAvailableTime = (AvailabilityNotAvailableTime)theEObject;
				T result = caseAvailabilityNotAvailableTime(availabilityNotAvailableTime);
				if (result == null) result = caseDataType(availabilityNotAvailableTime);
				if (result == null) result = caseElement(availabilityNotAvailableTime);
				if (result == null) result = caseBase(availabilityNotAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BACKBONE_ELEMENT: {
				BackboneElement backboneElement = (BackboneElement)theEObject;
				T result = caseBackboneElement(backboneElement);
				if (result == null) result = caseElement(backboneElement);
				if (result == null) result = caseBase(backboneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BACKBONE_TYPE: {
				BackboneType backboneType = (BackboneType)theEObject;
				T result = caseBackboneType(backboneType);
				if (result == null) result = caseDataType(backboneType);
				if (result == null) result = caseElement(backboneType);
				if (result == null) result = caseBase(backboneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = caseElement(base64Binary);
				if (result == null) result = caseBase(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = caseBase(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BOOLEAN: {
				org.hl7.fhir_patient.Boolean boolean_ = (org.hl7.fhir_patient.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = caseBase(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = caseBase(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = caseBase(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = caseBase(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_REQUEST: {
				BundleRequest bundleRequest = (BundleRequest)theEObject;
				T result = caseBundleRequest(bundleRequest);
				if (result == null) result = caseBackboneElement(bundleRequest);
				if (result == null) result = caseElement(bundleRequest);
				if (result == null) result = caseBase(bundleRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_RESPONSE: {
				BundleResponse bundleResponse = (BundleResponse)theEObject;
				T result = caseBundleResponse(bundleResponse);
				if (result == null) result = caseBackboneElement(bundleResponse);
				if (result == null) result = caseElement(bundleResponse);
				if (result == null) result = caseBase(bundleResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_SEARCH: {
				BundleSearch bundleSearch = (BundleSearch)theEObject;
				T result = caseBundleSearch(bundleSearch);
				if (result == null) result = caseBackboneElement(bundleSearch);
				if (result == null) result = caseElement(bundleSearch);
				if (result == null) result = caseBase(bundleSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.BUNDLE_TYPE: {
				BundleType bundleType = (BundleType)theEObject;
				T result = caseBundleType(bundleType);
				if (result == null) result = caseElement(bundleType);
				if (result == null) result = caseBase(bundleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CANONICAL: {
				Canonical canonical = (Canonical)theEObject;
				T result = caseCanonical(canonical);
				if (result == null) result = caseElement(canonical);
				if (result == null) result = caseBase(canonical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = caseBase(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CODEABLE_CONCEPT: {
				CodeableConcept codeableConcept = (CodeableConcept)theEObject;
				T result = caseCodeableConcept(codeableConcept);
				if (result == null) result = caseDataType(codeableConcept);
				if (result == null) result = caseElement(codeableConcept);
				if (result == null) result = caseBase(codeableConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CODEABLE_REFERENCE: {
				CodeableReference codeableReference = (CodeableReference)theEObject;
				T result = caseCodeableReference(codeableReference);
				if (result == null) result = caseDataType(codeableReference);
				if (result == null) result = caseElement(codeableReference);
				if (result == null) result = caseBase(codeableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CODING: {
				Coding coding = (Coding)theEObject;
				T result = caseCoding(coding);
				if (result == null) result = caseDataType(coding);
				if (result == null) result = caseElement(coding);
				if (result == null) result = caseBase(coding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CONTACT_DETAIL: {
				ContactDetail contactDetail = (ContactDetail)theEObject;
				T result = caseContactDetail(contactDetail);
				if (result == null) result = caseDataType(contactDetail);
				if (result == null) result = caseElement(contactDetail);
				if (result == null) result = caseBase(contactDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CONTACT_POINT: {
				ContactPoint contactPoint = (ContactPoint)theEObject;
				T result = caseContactPoint(contactPoint);
				if (result == null) result = caseDataType(contactPoint);
				if (result == null) result = caseElement(contactPoint);
				if (result == null) result = caseBase(contactPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CONTACT_POINT_SYSTEM: {
				ContactPointSystem contactPointSystem = (ContactPointSystem)theEObject;
				T result = caseContactPointSystem(contactPointSystem);
				if (result == null) result = caseElement(contactPointSystem);
				if (result == null) result = caseBase(contactPointSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.CONTACT_POINT_USE: {
				ContactPointUse contactPointUse = (ContactPointUse)theEObject;
				T result = caseContactPointUse(contactPointUse);
				if (result == null) result = caseElement(contactPointUse);
				if (result == null) result = caseBase(contactPointUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseQuantity(count);
				if (result == null) result = caseDataType(count);
				if (result == null) result = caseElement(count);
				if (result == null) result = caseBase(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_REQUIREMENT: {
				DataRequirement dataRequirement = (DataRequirement)theEObject;
				T result = caseDataRequirement(dataRequirement);
				if (result == null) result = caseDataType(dataRequirement);
				if (result == null) result = caseElement(dataRequirement);
				if (result == null) result = caseBase(dataRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_REQUIREMENT_CODE_FILTER: {
				DataRequirementCodeFilter dataRequirementCodeFilter = (DataRequirementCodeFilter)theEObject;
				T result = caseDataRequirementCodeFilter(dataRequirementCodeFilter);
				if (result == null) result = caseDataType(dataRequirementCodeFilter);
				if (result == null) result = caseElement(dataRequirementCodeFilter);
				if (result == null) result = caseBase(dataRequirementCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_REQUIREMENT_DATE_FILTER: {
				DataRequirementDateFilter dataRequirementDateFilter = (DataRequirementDateFilter)theEObject;
				T result = caseDataRequirementDateFilter(dataRequirementDateFilter);
				if (result == null) result = caseDataType(dataRequirementDateFilter);
				if (result == null) result = caseElement(dataRequirementDateFilter);
				if (result == null) result = caseBase(dataRequirementDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_REQUIREMENT_SORT: {
				DataRequirementSort dataRequirementSort = (DataRequirementSort)theEObject;
				T result = caseDataRequirementSort(dataRequirementSort);
				if (result == null) result = caseDataType(dataRequirementSort);
				if (result == null) result = caseElement(dataRequirementSort);
				if (result == null) result = caseBase(dataRequirementSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_REQUIREMENT_VALUE_FILTER: {
				DataRequirementValueFilter dataRequirementValueFilter = (DataRequirementValueFilter)theEObject;
				T result = caseDataRequirementValueFilter(dataRequirementValueFilter);
				if (result == null) result = caseDataType(dataRequirementValueFilter);
				if (result == null) result = caseElement(dataRequirementValueFilter);
				if (result == null) result = caseBase(dataRequirementValueFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = caseBase(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseElement(date);
				if (result == null) result = caseBase(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseElement(dateTime);
				if (result == null) result = caseBase(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseElement(decimal);
				if (result == null) result = caseBase(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DISTANCE: {
				Distance distance = (Distance)theEObject;
				T result = caseDistance(distance);
				if (result == null) result = caseQuantity(distance);
				if (result == null) result = caseDataType(distance);
				if (result == null) result = caseElement(distance);
				if (result == null) result = caseBase(distance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = caseBase(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DOSAGE: {
				Dosage dosage = (Dosage)theEObject;
				T result = caseDosage(dosage);
				if (result == null) result = caseBackboneType(dosage);
				if (result == null) result = caseDataType(dosage);
				if (result == null) result = caseElement(dosage);
				if (result == null) result = caseBase(dosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DOSAGE_DOSE_AND_RATE: {
				DosageDoseAndRate dosageDoseAndRate = (DosageDoseAndRate)theEObject;
				T result = caseDosageDoseAndRate(dosageDoseAndRate);
				if (result == null) result = caseBackboneType(dosageDoseAndRate);
				if (result == null) result = caseDataType(dosageDoseAndRate);
				if (result == null) result = caseElement(dosageDoseAndRate);
				if (result == null) result = caseBase(dosageDoseAndRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseQuantity(duration);
				if (result == null) result = caseDataType(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = caseBase(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseBase(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.EVENT_TIMING: {
				EventTiming eventTiming = (EventTiming)theEObject;
				T result = caseEventTiming(eventTiming);
				if (result == null) result = caseElement(eventTiming);
				if (result == null) result = caseBase(eventTiming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseDataType(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = caseBase(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.EXTENDED_CONTACT_DETAIL: {
				ExtendedContactDetail extendedContactDetail = (ExtendedContactDetail)theEObject;
				T result = caseExtendedContactDetail(extendedContactDetail);
				if (result == null) result = caseDataType(extendedContactDetail);
				if (result == null) result = caseElement(extendedContactDetail);
				if (result == null) result = caseBase(extendedContactDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseDataType(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = caseBase(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.HTTP_VERB: {
				HTTPVerb httpVerb = (HTTPVerb)theEObject;
				T result = caseHTTPVerb(httpVerb);
				if (result == null) result = caseElement(httpVerb);
				if (result == null) result = caseBase(httpVerb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.HUMAN_NAME: {
				HumanName humanName = (HumanName)theEObject;
				T result = caseHumanName(humanName);
				if (result == null) result = caseDataType(humanName);
				if (result == null) result = caseElement(humanName);
				if (result == null) result = caseBase(humanName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = caseElement(id);
				if (result == null) result = caseBase(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseDataType(identifier);
				if (result == null) result = caseElement(identifier);
				if (result == null) result = caseBase(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.IDENTIFIER_USE: {
				IdentifierUse identifierUse = (IdentifierUse)theEObject;
				T result = caseIdentifierUse(identifierUse);
				if (result == null) result = caseElement(identifierUse);
				if (result == null) result = caseBase(identifierUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.INSTANT: {
				Instant instant = (Instant)theEObject;
				T result = caseInstant(instant);
				if (result == null) result = caseElement(instant);
				if (result == null) result = caseBase(instant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.INTEGER: {
				org.hl7.fhir_patient.Integer integer = (org.hl7.fhir_patient.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = caseBase(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.INTEGER64: {
				Integer64 integer64 = (Integer64)theEObject;
				T result = caseInteger64(integer64);
				if (result == null) result = caseElement(integer64);
				if (result == null) result = caseBase(integer64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.LINK_RELATION_TYPES: {
				LinkRelationTypes linkRelationTypes = (LinkRelationTypes)theEObject;
				T result = caseLinkRelationTypes(linkRelationTypes);
				if (result == null) result = caseElement(linkRelationTypes);
				if (result == null) result = caseBase(linkRelationTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = caseElement(linkType);
				if (result == null) result = caseBase(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.MARKDOWN: {
				Markdown markdown = (Markdown)theEObject;
				T result = caseMarkdown(markdown);
				if (result == null) result = caseElement(markdown);
				if (result == null) result = caseBase(markdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = caseDataType(meta);
				if (result == null) result = caseElement(meta);
				if (result == null) result = caseBase(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.MONEY: {
				Money money = (Money)theEObject;
				T result = caseMoney(money);
				if (result == null) result = caseDataType(money);
				if (result == null) result = caseElement(money);
				if (result == null) result = caseBase(money);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.NAME_USE: {
				NameUse nameUse = (NameUse)theEObject;
				T result = caseNameUse(nameUse);
				if (result == null) result = caseElement(nameUse);
				if (result == null) result = caseBase(nameUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.NARRATIVE: {
				Narrative narrative = (Narrative)theEObject;
				T result = caseNarrative(narrative);
				if (result == null) result = caseDataType(narrative);
				if (result == null) result = caseElement(narrative);
				if (result == null) result = caseBase(narrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.NARRATIVE_STATUS: {
				NarrativeStatus narrativeStatus = (NarrativeStatus)theEObject;
				T result = caseNarrativeStatus(narrativeStatus);
				if (result == null) result = caseElement(narrativeStatus);
				if (result == null) result = caseBase(narrativeStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.OID: {
				Oid oid = (Oid)theEObject;
				T result = caseOid(oid);
				if (result == null) result = caseElement(oid);
				if (result == null) result = caseBase(oid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PARAMETER_DEFINITION: {
				ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
				T result = caseParameterDefinition(parameterDefinition);
				if (result == null) result = caseDataType(parameterDefinition);
				if (result == null) result = caseElement(parameterDefinition);
				if (result == null) result = caseBase(parameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = caseBase(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = caseBase(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = caseBase(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = caseBase(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.PERIOD: {
				Period period = (Period)theEObject;
				T result = casePeriod(period);
				if (result == null) result = caseDataType(period);
				if (result == null) result = caseElement(period);
				if (result == null) result = caseBase(period);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.POSITIVE_INT: {
				PositiveInt positiveInt = (PositiveInt)theEObject;
				T result = casePositiveInt(positiveInt);
				if (result == null) result = caseElement(positiveInt);
				if (result == null) result = caseBase(positiveInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseDataType(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = caseBase(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.QUANTITY_COMPARATOR: {
				QuantityComparator quantityComparator = (QuantityComparator)theEObject;
				T result = caseQuantityComparator(quantityComparator);
				if (result == null) result = caseElement(quantityComparator);
				if (result == null) result = caseBase(quantityComparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseDataType(range);
				if (result == null) result = caseElement(range);
				if (result == null) result = caseBase(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = caseDataType(ratio);
				if (result == null) result = caseElement(ratio);
				if (result == null) result = caseBase(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RATIO_RANGE: {
				RatioRange ratioRange = (RatioRange)theEObject;
				T result = caseRatioRange(ratioRange);
				if (result == null) result = caseDataType(ratioRange);
				if (result == null) result = caseElement(ratioRange);
				if (result == null) result = caseBase(ratioRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseDataType(reference);
				if (result == null) result = caseElement(reference);
				if (result == null) result = caseBase(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RELATED_ARTIFACT: {
				RelatedArtifact relatedArtifact = (RelatedArtifact)theEObject;
				T result = caseRelatedArtifact(relatedArtifact);
				if (result == null) result = caseDataType(relatedArtifact);
				if (result == null) result = caseElement(relatedArtifact);
				if (result == null) result = caseBase(relatedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RELATED_ARTIFACT_TYPE: {
				RelatedArtifactType relatedArtifactType = (RelatedArtifactType)theEObject;
				T result = caseRelatedArtifactType(relatedArtifactType);
				if (result == null) result = caseElement(relatedArtifactType);
				if (result == null) result = caseBase(relatedArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseBase(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.SAMPLED_DATA: {
				SampledData sampledData = (SampledData)theEObject;
				T result = caseSampledData(sampledData);
				if (result == null) result = caseDataType(sampledData);
				if (result == null) result = caseElement(sampledData);
				if (result == null) result = caseBase(sampledData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.SAMPLED_DATA_DATA_TYPE: {
				SampledDataDataType sampledDataDataType = (SampledDataDataType)theEObject;
				T result = caseSampledDataDataType(sampledDataDataType);
				if (result == null) result = caseElement(sampledDataDataType);
				if (result == null) result = caseBase(sampledDataDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.SEARCH_ENTRY_MODE: {
				SearchEntryMode searchEntryMode = (SearchEntryMode)theEObject;
				T result = caseSearchEntryMode(searchEntryMode);
				if (result == null) result = caseElement(searchEntryMode);
				if (result == null) result = caseBase(searchEntryMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseDataType(signature);
				if (result == null) result = caseElement(signature);
				if (result == null) result = caseBase(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.SORT_DIRECTION: {
				SortDirection sortDirection = (SortDirection)theEObject;
				T result = caseSortDirection(sortDirection);
				if (result == null) result = caseElement(sortDirection);
				if (result == null) result = caseBase(sortDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.STRING: {
				org.hl7.fhir_patient.String string = (org.hl7.fhir_patient.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = caseBase(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseElement(time);
				if (result == null) result = caseBase(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseBackboneType(timing);
				if (result == null) result = caseDataType(timing);
				if (result == null) result = caseElement(timing);
				if (result == null) result = caseBase(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.TIMING_REPEAT: {
				TimingRepeat timingRepeat = (TimingRepeat)theEObject;
				T result = caseTimingRepeat(timingRepeat);
				if (result == null) result = caseBackboneType(timingRepeat);
				if (result == null) result = caseDataType(timingRepeat);
				if (result == null) result = caseElement(timingRepeat);
				if (result == null) result = caseBase(timingRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.TRIGGER_DEFINITION: {
				TriggerDefinition triggerDefinition = (TriggerDefinition)theEObject;
				T result = caseTriggerDefinition(triggerDefinition);
				if (result == null) result = caseDataType(triggerDefinition);
				if (result == null) result = caseElement(triggerDefinition);
				if (result == null) result = caseBase(triggerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.TRIGGER_TYPE: {
				TriggerType triggerType = (TriggerType)theEObject;
				T result = caseTriggerType(triggerType);
				if (result == null) result = caseElement(triggerType);
				if (result == null) result = caseBase(triggerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.UNITS_OF_TIME: {
				UnitsOfTime unitsOfTime = (UnitsOfTime)theEObject;
				T result = caseUnitsOfTime(unitsOfTime);
				if (result == null) result = caseElement(unitsOfTime);
				if (result == null) result = caseBase(unitsOfTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.UNSIGNED_INT: {
				UnsignedInt unsignedInt = (UnsignedInt)theEObject;
				T result = caseUnsignedInt(unsignedInt);
				if (result == null) result = caseElement(unsignedInt);
				if (result == null) result = caseBase(unsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.URI: {
				Uri uri = (Uri)theEObject;
				T result = caseUri(uri);
				if (result == null) result = caseElement(uri);
				if (result == null) result = caseBase(uri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.URL: {
				Url url = (Url)theEObject;
				T result = caseUrl(url);
				if (result == null) result = caseElement(url);
				if (result == null) result = caseBase(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.USAGE_CONTEXT: {
				UsageContext usageContext = (UsageContext)theEObject;
				T result = caseUsageContext(usageContext);
				if (result == null) result = caseDataType(usageContext);
				if (result == null) result = caseElement(usageContext);
				if (result == null) result = caseBase(usageContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fhir_PatientPackage.UUID: {
				Uuid uuid = (Uuid)theEObject;
				T result = caseUuid(uuid);
				if (result == null) result = caseElement(uuid);
				if (result == null) result = caseBase(uuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressUse(AddressUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeGender(AdministrativeGender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAge(Age object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailability(Availability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityAvailableTime(AvailabilityAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability Not Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability Not Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityNotAvailableTime(AvailabilityNotAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneElement(BackboneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneType(BackboneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.hl7.fhir_patient.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntry(BundleEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleLink(BundleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleRequest(BundleRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleResponse(BundleResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleSearch(BundleSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleType(BundleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanonical(Canonical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableConcept(CodeableConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableReference(CodeableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactDetail(ContactDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPoint(ContactPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointSystem(ContactPointSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointUse(ContactPointUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirement(DataRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementCodeFilter(DataRequirementCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementDateFilter(DataRequirementDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementSort(DataRequirementSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Value Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Value Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementValueFilter(DataRequirementValueFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistance(Distance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainResource(DomainResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosage(Dosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage Dose And Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage Dose And Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosageDoseAndRate(DosageDoseAndRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTiming(EventTiming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Contact Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedContactDetail(ExtendedContactDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPVerb(HTTPVerb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanName(HumanName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierUse(IdentifierUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstant(Instant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.hl7.fhir_patient.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger64(Integer64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Relation Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Relation Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkRelationTypes(LinkRelationTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdown(Markdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoney(Money object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameUse(NameUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrative(Narrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrativeStatus(NarrativeStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOid(Oid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientCommunication(PatientCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContact(PatientContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientLink(PatientLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInt(PositiveInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityComparator(QuantityComparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioRange(RatioRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArtifact(RelatedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Artifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArtifactType(RelatedArtifactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledData(SampledData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledDataDataType(SampledDataDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchEntryMode(SearchEntryMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortDirection(SortDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.hl7.fhir_patient.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingRepeat(TimingRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDefinition(TriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerType(TriggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitsOfTime(UnitsOfTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInt(UnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUri(Uri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageContext(UsageContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuid(Uuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Fhir_PatientSwitch
