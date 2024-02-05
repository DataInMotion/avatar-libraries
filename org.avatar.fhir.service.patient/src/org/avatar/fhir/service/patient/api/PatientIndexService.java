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

import org.hl7.fhir_patient.Patient;
import org.osgi.annotation.versioning.ProviderType;

/**
 * Index service for {@link org.hl7.fhir_patient.Patient} EObjects.
 * 
 * @author Michal H. Siemaszko
 */
@ProviderType
public interface PatientIndexService {

	void indexPatient(Patient patient, boolean isFirstSave);

	void deletePatient(Patient patient);

	void resetIndex();
}
