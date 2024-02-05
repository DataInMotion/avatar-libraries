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

import java.util.Collections;
import java.util.Objects;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;
import org.gecko.search.document.context.ObjectContextObject;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Patient;

/**
 * Helper for
 * {@link org.avatar.fhir.service.patient.impl.PatientIndexServiceImpl}
 * 
 * @author Michal H. Siemaszko
 */
public class PatientIndexHelper {
	// FIXME: make 'org.gecko.search.util.DocumentUtil.ECLASS_URI' public, so this
	// does not have to be re-defined
	public static final String FIELD__ECLASS_URI = "_eClassUri";
	public static final String FIELD__ID = "id";

	public static final String PATIENT_ID = "patient_id";

	public static EObjectDocumentIndexObjectContext mapPatientNew(Patient patient) {
		return mapPatient(patient, IndexActionType.ADD);
	}

	public static EObjectDocumentIndexObjectContext mapPatientUpdate(Patient patient) {
		return mapPatient(patient, IndexActionType.MODIFY);
	}

	/**
	 * Maps a given {@link Patient} to {@link ObjectContextObject} with a given
	 * {@link IndexActionType}
	 * 
	 * @param patient     the patient to index
	 * @param indexAction the index action (ADD, UPDATE, REMOVE)
	 * @return the {@link ObjectContextObject}
	 */
	public static EObjectDocumentIndexObjectContext mapPatient(Patient patient, IndexActionType indexAction) {
		Objects.requireNonNull(patient.getId().getValue(), "Patient Id is required!");

		Document doc = new Document();

		doc.add(new StringField(FIELD__ECLASS_URI, constructEClassUri(), Store.YES));
		doc.add(new StringField(FIELD__ID, patient.getId().getValue(), Store.YES));

		doc.add(new StringField(PATIENT_ID, patient.getId().getValue(), Store.YES));

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(patient)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", patient.getId().getValue()));
		}

		return builder.build();
	}

	private static String constructEClassUri() {
		return EcoreUtil.getURI(Fhir_PatientPackage.Literals.PATIENT).toString();
	}
}