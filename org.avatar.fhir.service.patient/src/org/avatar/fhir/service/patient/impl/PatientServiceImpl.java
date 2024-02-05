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
package org.avatar.fhir.service.patient.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.avatar.fhir.service.patient.api.PatientIndexService;
import org.avatar.fhir.service.patient.api.PatientSearchService;
import org.avatar.fhir.service.patient.api.PatientService;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Patient;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link org.avatar.fhir.service.patient.api.PatientService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "PatientService", scope = ServiceScope.PROTOTYPE)
public class PatientServiceImpl implements PatientService {
	private static final Logger LOG = LoggerFactory.getLogger(PatientServiceImpl.class);

	@Reference(target = "(repo_id=fhir.fhir)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private EMFRepository emfRepository;

	@Reference
	private PatientIndexService patientIndexService;

	@Reference
	private PatientSearchService patientSearchService;

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientService#savePatient(org.hl7.fhir_patient.Patient)
	 */
	@Override
	public Patient savePatient(Patient patient) {
		Objects.requireNonNull(patient, "Patient is required!");
		Objects.requireNonNull(patient.getId().getValue(), "Patient Id is required!");

		boolean isFirstSave = !patientExists(patient.getId().getValue());

		emfRepository.save(patient);

		patientIndexService.indexPatient(patient, isFirstSave);

		return patient;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientService#getPatientById(java.lang.String)
	 */
	@Override
	public Patient getPatientById(String patientId) {
		Objects.requireNonNull(patientId, "Patient Id is required!");

		return patientSearchService.searchPatientById(patientId);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientService#getPatients(java.util.Optional)
	 */
	@Override
	public List<Patient> getPatients(Optional<Integer> maxResultsOptional) {
		QueryRepository queryRepo = (QueryRepository) emfRepository.getAdapter(QueryRepository.class);

		// @formatter:off
		IQueryBuilder queryBuilder = queryRepo.createQueryBuilder().allQuery();
		
		IQuery query = (maxResultsOptional.isPresent()) ? 
				queryBuilder.limit(maxResultsOptional.get().intValue()).build() : 
					queryBuilder.build();
		// @formatter:on

		return queryRepo.getEObjectsByQuery(Fhir_PatientPackage.Literals.PATIENT, query);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientService#deletePatient(java.lang.String)
	 */
	@Override
	public boolean deletePatient(String patientId) {
		Objects.requireNonNull(patientId, "Patient Id is required!");

		Patient patient = getPatientById(patientId);

		if (patient != null) {

			emfRepository.delete(patient);

			patientIndexService.deletePatient(patient);

			return true;
		}

		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientService#patientExists(java.lang.String)
	 */
	@Override
	public boolean patientExists(String patientId) {
		Objects.requireNonNull(patientId, "Patient Id is required!");

		return (patientSearchService.searchPatientById(patientId) != null);
	}
}
