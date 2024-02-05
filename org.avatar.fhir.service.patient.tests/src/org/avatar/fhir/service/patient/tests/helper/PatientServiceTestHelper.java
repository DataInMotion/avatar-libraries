/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.avatar.fhir.service.patient.tests.helper;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir_patient.AdministrativeGender;
import org.hl7.fhir_patient.AdministrativeGenderEnum;
import org.hl7.fhir_patient.Code;
import org.hl7.fhir_patient.CodeableConcept;
import org.hl7.fhir_patient.Coding;
import org.hl7.fhir_patient.Extension;
import org.hl7.fhir_patient.Fhir_PatientFactory;
import org.hl7.fhir_patient.HumanName;
import org.hl7.fhir_patient.Id;
import org.hl7.fhir_patient.Identifier;
import org.hl7.fhir_patient.IdentifierUse;
import org.hl7.fhir_patient.IdentifierUseEnum;
import org.hl7.fhir_patient.Meta;
import org.hl7.fhir_patient.Narrative;
import org.hl7.fhir_patient.NarrativeStatus;
import org.hl7.fhir_patient.NarrativeStatusEnum;
import org.hl7.fhir_patient.Patient;
import org.hl7.fhir_patient.Uri;

/**
 * Helper for {@link org.avatar.fhir.service.patient.tests.PatientServiceTest}
 * 
 * @author Michal H. Siemaszko
 */
public class PatientServiceTestHelper {

	public static Patient createPatient(String id, String identifier, String firstName, String lastName,
			String nameSuffix, AdministrativeGenderEnum gender, boolean isActive) {
		Patient patient = Fhir_PatientFactory.eINSTANCE.createPatient();

		// FIXME: `AbstractEMFMongoRepository` expects id field directly on entity being saved, it does not take into consideration attributes marked as such in types inherited from, i.e. 
		// 	even though `org.hl7.fhir_patient.Id` attribute is marked as ID, it is referenced from super type, not defined directly on `Patient` EClass, and this results in following error:
		//		java.lang.IllegalStateException: The given EObject of EClass Patient doesn't contain a id attribute but should have one
		// .. so, this is a temporary work-around until this underlying issue is fixed;
		patient.setFakeId(id);

		// "id"
		Id patientId = createPatientId(id);
		patient.setId(patientId);

		// "meta"
		Meta patientMeta = createPatientMeta();
		patient.setMeta(patientMeta);

		// "text"
		Narrative patientNarrative = createPatientNarrative();
		patient.setText(patientNarrative);

		// "extension"
		Extension patientExtension = createPatientExtension();
		patient.getExtension().add(patientExtension);

		// "identifier"
		Identifier patientIdentifier = createPatientIdentifier(identifier);
		patient.getIdentifier().add(patientIdentifier);

		// "active"
		org.hl7.fhir_patient.Boolean patientActive = createPatientActive(isActive);
		patient.setActive(patientActive);

		// "name"
		HumanName patientHumanName = createPatientHumanName(firstName, lastName, nameSuffix);
		patient.getName().add(patientHumanName);

		// "gender"
		AdministrativeGender patientAdministrativeGender = createPatientGender(gender);
		patient.setGender(patientAdministrativeGender);

		// "birthDate"
		org.hl7.fhir_patient.Date patientBirthDate = createPatientBirthDate();
		patient.setBirthDate(patientBirthDate);

		return patient;
	}

	private static Id createPatientId(String patientId) {
		Id id = Fhir_PatientFactory.eINSTANCE.createId();
		id.setValue(patientId);
		return id;
	}

	private static Meta createPatientMeta() {
		Meta patientMeta = Fhir_PatientFactory.eINSTANCE.createMeta();

		org.hl7.fhir_patient.Instant patientMetaLastUpdated = Fhir_PatientFactory.eINSTANCE.createInstant();
		String dateTimeString = java.time.Instant.now().toString();
		try {
			XMLGregorianCalendar dateTimeXMLGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTimeString);
			patientMetaLastUpdated.setValue(dateTimeXMLGC);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		patientMeta.setLastUpdated(patientMetaLastUpdated);
		return patientMeta;
	}

	private static Narrative createPatientNarrative() {
		Narrative patientNarrative = Fhir_PatientFactory.eINSTANCE.createNarrative();

		NarrativeStatus patientNarrativeStatus = Fhir_PatientFactory.eINSTANCE.createNarrativeStatus();
		patientNarrativeStatus.setValue(NarrativeStatusEnum.EMPTY);
		patientNarrative.setStatus(patientNarrativeStatus);
		return patientNarrative;
	}

	private static Extension createPatientExtension() {
		Extension patientExtension = Fhir_PatientFactory.eINSTANCE.createExtension();
		patientExtension.setUrl("http://example.org/consent#trials");

		Code patientExtensionCode = Fhir_PatientFactory.eINSTANCE.createCode();
		patientExtensionCode.setValue("renal");
		patientExtension.setValueCode(patientExtensionCode);
		return patientExtension;
	}

	private static Identifier createPatientIdentifier(String identifier) {
		Identifier patientIdentifier = Fhir_PatientFactory.eINSTANCE.createIdentifier();

		IdentifierUse patientIdentifierUse = Fhir_PatientFactory.eINSTANCE.createIdentifierUse();
		patientIdentifierUse.setValue(IdentifierUseEnum.USUAL);
		patientIdentifier.setUse(patientIdentifierUse);

		CodeableConcept patientIdentifierType = Fhir_PatientFactory.eINSTANCE.createCodeableConcept();

		Coding patientIdentifierTypeCoding = Fhir_PatientFactory.eINSTANCE.createCoding();

		Uri patientIdentifierTypeCodingUri = Fhir_PatientFactory.eINSTANCE.createUri();
		patientIdentifierTypeCodingUri.setValue("http://h17.org/fhir/v2/0203");
		patientIdentifierTypeCoding.setSystem(patientIdentifierTypeCodingUri);

		Code patientIdentifierTypeCodingCode = Fhir_PatientFactory.eINSTANCE.createCode();
		patientIdentifierTypeCodingCode.setValue("MR");
		patientIdentifierTypeCoding.setCode(patientIdentifierTypeCodingCode);

		patientIdentifierType.getCoding().add(patientIdentifierTypeCoding);

		patientIdentifier.setType(patientIdentifierType);

		Uri patientIdentifierSystemUri = Fhir_PatientFactory.eINSTANCE.createUri();
		patientIdentifierSystemUri.setValue("http://www.goodhealth.org/identifiers/mrn");
		patientIdentifier.setSystem(patientIdentifierSystemUri);

		org.hl7.fhir_patient.String patientIdentifierValue = Fhir_PatientFactory.eINSTANCE.createString();
		patientIdentifierValue.setValue(identifier);
		patientIdentifier.setValue(patientIdentifierValue);
		return patientIdentifier;
	}

	private static org.hl7.fhir_patient.Boolean createPatientActive(boolean isActive) {
		org.hl7.fhir_patient.Boolean patientActive = Fhir_PatientFactory.eINSTANCE.createBoolean();
		patientActive.setValue(isActive);
		return patientActive;
	}

	private static HumanName createPatientHumanName(String patientFirstName, String patientLastName,
			String patientNameSuffix) {
		HumanName patientHumanName = Fhir_PatientFactory.eINSTANCE.createHumanName();
		org.hl7.fhir_patient.String patientHumanNameFamily = Fhir_PatientFactory.eINSTANCE.createString();
		patientHumanNameFamily.setValue(patientLastName);
		patientHumanName.setFamily(patientHumanNameFamily);

		org.hl7.fhir_patient.String patientHumanNameGiven = Fhir_PatientFactory.eINSTANCE.createString();
		patientHumanNameGiven.setValue(patientFirstName);
		patientHumanName.getGiven().add(patientHumanNameGiven);

		if (patientNameSuffix != null) {
			org.hl7.fhir_patient.String patientHumanNameSuffix = Fhir_PatientFactory.eINSTANCE.createString();
			patientHumanNameSuffix.setValue(patientNameSuffix);
			patientHumanName.getSuffix().add(patientHumanNameSuffix);
		}
		return patientHumanName;
	}

	private static AdministrativeGender createPatientGender(AdministrativeGenderEnum patientGender) {
		AdministrativeGender patientAdministrativeGender = Fhir_PatientFactory.eINSTANCE.createAdministrativeGender();
		patientAdministrativeGender.setValue(patientGender);
		return patientAdministrativeGender;
	}

	private static org.hl7.fhir_patient.Date createPatientBirthDate() {
		org.hl7.fhir_patient.Date patientBirthDate = Fhir_PatientFactory.eINSTANCE.createDate();

		try {
			XMLGregorianCalendar patientBirthDateXMLGC = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(java.time.Instant.now().toString());
			patientBirthDate.setValue(patientBirthDateXMLGC);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return patientBirthDate;
	}
}
