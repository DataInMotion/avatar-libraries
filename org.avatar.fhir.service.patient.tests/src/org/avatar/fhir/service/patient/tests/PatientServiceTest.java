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
package org.avatar.fhir.service.patient.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.avatar.fhir.service.patient.tests.helper.PatientServiceTestHelper.createPatient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.avatar.fhir.service.patient.api.PatientIndexService;
import org.avatar.fhir.service.patient.api.PatientService;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.hl7.fhir_patient.AdministrativeGenderEnum;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Patient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.annotation.Testable;
import org.osgi.framework.ServiceReference;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

/**
 * Tests implementation of
 * {@link org.avatar.fhir.service.patient.api.PatientService}
 * 
 * @author Michal H. Siemaszko
 */
@Testable
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PatientServiceTest {

	@Order(value = -1)
	@Test
	public void testServices(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(component.name=PatientService)") ServiceAware<PatientService> patientServiceAware) {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		ServiceReference<PatientService> patientServiceReference = patientServiceAware.getServiceReference();
		assertThat(patientServiceReference).isNotNull();
	}

	@Test
	public void testSavePatient(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<PatientService> patientServiceAware)
			throws InterruptedException {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		PatientService patientService = patientServiceAware.getService();
		assertThat(patientService).isNotNull();

		String patientId = UUID.randomUUID().toString();
		String patientIdentifier = UUID.randomUUID().toString();
		String patientFirstName = "Henry";
		String patientLastName = "Levin";
		String patientNameSuffix = "The 7th";
		AdministrativeGenderEnum patientGender = AdministrativeGenderEnum.MALE;
		boolean patientIsActive = true;

		// @formatter:off
		Patient patient = createPatient(
				patientId, 
				patientIdentifier, 
				patientFirstName, 
				patientLastName,
				patientNameSuffix, 
				patientGender, 
				patientIsActive);
		// @formatter:on

		patient = patientService.savePatient(patient);
		assertThat(patient).isNotNull();
		assertEquals(patientId, patient.getId().getValue());
	}

	@Test
	public void testGetPatientById(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<PatientService> patientServiceAware)
			throws InterruptedException {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		PatientService patientService = patientServiceAware.getService();
		assertThat(patientService).isNotNull();

		String patientId = UUID.randomUUID().toString();
		String patientIdentifier = UUID.randomUUID().toString();
		String patientFirstName = "Henry";
		String patientLastName = "Levin";
		String patientNameSuffix = "The 7th";
		AdministrativeGenderEnum patientGender = AdministrativeGenderEnum.MALE;
		boolean patientIsActive = true;

		// @formatter:off
		Patient patient = createPatient(
				patientId, 
				patientIdentifier, 
				patientFirstName, 
				patientLastName,
				patientNameSuffix, 
				patientGender, 
				patientIsActive);
		// @formatter:on

		patient = patientService.savePatient(patient);
		assertThat(patient).isNotNull();

		Thread.sleep(2000);

		patient = patientService.getPatientById(patientId);
		assertThat(patient).isNotNull();
		assertEquals(patientId, patient.getId().getValue());
	}

	@Test
	public void testGetPatients(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<PatientService> patientServiceAware)
			throws InterruptedException {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		PatientService patientService = patientServiceAware.getService();
		assertThat(patientService).isNotNull();

		String patient1Id = UUID.randomUUID().toString();
		String patient1Identifier = UUID.randomUUID().toString();
		String patient1FirstName = "Henry";
		String patient1LastName = "Levin";
		String patient1NameSuffix = "The 6th";
		AdministrativeGenderEnum patient1Gender = AdministrativeGenderEnum.MALE;
		boolean patient1IsActive = true;

		// @formatter:off
		Patient patient1 = createPatient(
				patient1Id, 
				patient1Identifier, 
				patient1FirstName, 
				patient1LastName,
				patient1NameSuffix, 
				patient1Gender, 
				patient1IsActive);
		// @formatter:on

		patient1 = patientService.savePatient(patient1);
		assertThat(patient1).isNotNull();

		String patient2Id = UUID.randomUUID().toString();
		String patient2Identifier = UUID.randomUUID().toString();
		String patient2FirstName = "Henry";
		String patient2LastName = "Levin";
		String patient2NameSuffix = "The 7th";
		AdministrativeGenderEnum patient2Gender = AdministrativeGenderEnum.MALE;
		boolean patient2IsActive = true;

		// @formatter:off
		Patient patient2 = createPatient(
				patient2Id, 
				patient2Identifier, 
				patient2FirstName, 
				patient2LastName,
				patient2NameSuffix, 
				patient2Gender, 
				patient2IsActive);
		// @formatter:on

		patient2 = patientService.savePatient(patient2);
		assertThat(patient2).isNotNull();

		List<Patient> patients = patientService.getPatients(Optional.of(10));
		assertThat(patients).isNotNull();
		assertThat(patients).size().isEqualTo(2);
	}

	@Test
	public void testPatientExists(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<PatientService> patientServiceAware)
			throws InterruptedException {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		PatientService patientService = patientServiceAware.getService();
		assertThat(patientService).isNotNull();

		String patientId = UUID.randomUUID().toString();
		String patientIdentifier = UUID.randomUUID().toString();
		String patientFirstName = "Henry";
		String patientLastName = "Levin";
		String patientNameSuffix = "The 7th";
		AdministrativeGenderEnum patientGender = AdministrativeGenderEnum.MALE;
		boolean patientIsActive = true;

		// @formatter:off
		Patient patient = createPatient(
				patientId, 
				patientIdentifier, 
				patientFirstName, 
				patientLastName,
				patientNameSuffix, 
				patientGender, 
				patientIsActive);
		// @formatter:on

		patient = patientService.savePatient(patient);
		assertThat(patient).isNotNull();

		Thread.sleep(2000);

		boolean patientExists = patientService.patientExists(patientId);
		assertTrue(patientExists);
	}

	@Test
	public void testDeletePatient(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<PatientService> patientServiceAware)
			throws InterruptedException {

		assertThat(patientServiceAware.getServices()).hasSize(1);
		PatientService patientService = patientServiceAware.getService();
		assertThat(patientService).isNotNull();

		String patientId = UUID.randomUUID().toString();
		String patientIdentifier = UUID.randomUUID().toString();
		String patientFirstName = "Henry";
		String patientLastName = "Levin";
		String patientNameSuffix = "The 7th";
		AdministrativeGenderEnum patientGender = AdministrativeGenderEnum.MALE;
		boolean patientIsActive = true;

		// @formatter:off
		Patient patient = createPatient(
				patientId, 
				patientIdentifier, 
				patientFirstName, 
				patientLastName,
				patientNameSuffix, 
				patientGender, 
				patientIsActive);
		// @formatter:on

		patient = patientService.savePatient(patient);
		assertThat(patient).isNotNull();

		Thread.sleep(2000);

		boolean patientDeleted = patientService.deletePatient(patientId);
		assertTrue(patientDeleted);
	}

	@BeforeEach
	@AfterEach
	public void clean(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(component.name=PatientIndexService)") ServiceAware<PatientIndexService> patientIndexServiceAware,
			@InjectService(cardinality = 1, timeout = 5000, filter = "(database=fhir)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {

		assertThat(patientIndexServiceAware.getServices()).hasSize(1);
		PatientIndexService patientIndexService = patientIndexServiceAware.getService();
		assertThat(patientIndexService).isNotNull();

		patientIndexService.resetIndex();

		assertThat(dbProviderAware.getServices()).hasSize(1);
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();

		MongoDatabase database = dbProvider.getDatabase();
		try {
			database.getCollection(Fhir_PatientPackage.Literals.PATIENT.getName()).drop();
		} catch (IllegalArgumentException e) {
			System.out.println("Collection does not exist. Nothing to remove.");
		}
	}

	@AfterAll
	public static void brutalClean(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(database=fhir)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {
		assertThat(dbProviderAware.getServices()).hasSize(1);
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();

		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
	}
}