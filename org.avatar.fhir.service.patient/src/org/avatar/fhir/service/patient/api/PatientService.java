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
package org.avatar.fhir.service.patient.api;

import java.util.List;
import java.util.Optional;

import org.hl7.fhir_patient.Patient;
import org.osgi.annotation.versioning.ProviderType;

/**
 * CRUD service for {@link org.hl7.fhir_patient.Patient} EObjects.
 * 
 * @author Michal H. Siemaszko
 */
@ProviderType
public interface PatientService {

	Patient savePatient(Patient patient);

	Patient getPatientById(String patientId);

	List<Patient> getPatients(Optional<Integer> maxResultsOptional);

	boolean deletePatient(String patientId);

	boolean patientExists(String patientId);
}
