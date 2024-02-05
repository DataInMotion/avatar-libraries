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

import java.util.Objects;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.avatar.fhir.service.patient.api.PatientSearchService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.document.LuceneIndexService;
import org.hl7.fhir_patient.Patient;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link org.avatar.fhir.service.patient.api.PatientSearchService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "PatientSearchService", immediate = true, scope = ServiceScope.SINGLETON)
public class PatientSearchServiceImpl implements PatientSearchService {
	private static final Logger LOG = LoggerFactory.getLogger(PatientSearchServiceImpl.class);

	@Reference(target = "(id=patient)")
	private LuceneIndexService<EObjectDocumentIndexObjectContext> patientIndex;

	@Reference(target = "(repo_id=fhir.fhir)", cardinality = ReferenceCardinality.MANDATORY)
	private ComponentServiceObjects<EMFRepository> repositoryServiceObjects;

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientSearchService#searchPatientById(java.lang.String)
	 */
	@Override
	public Patient searchPatientById(String patientId) {
		Objects.requireNonNull(patientId, "Patient Id is required!");

		Query query = new TermQuery(new Term(PatientIndexHelper.PATIENT_ID, patientId.trim().toLowerCase()));

		IndexSearcher searcher = patientIndex.aquireSearcher();
		EMFRepository repository = repositoryServiceObjects.getService();
		try {
			TopDocs topDocs = searcher.search(query, 1);

			if (topDocs.scoreDocs.length == 0) {
				return null;
			}

			IndexReader indexReader = searcher.getIndexReader();

			Document doc = indexReader.storedFields().document(topDocs.scoreDocs[0].doc);

			return (Patient) toEObject(doc, repository);

		} catch (Exception e) {
			LOG.error("Exception while search for Patient with query " + query, e);

			return null;

		} finally {
			patientIndex.releaseSearcher(searcher);
			repositoryServiceObjects.ungetService(repository);
		}
	}

	/** TODO: re: {@link org.gecko.search.util.DocumentUtil.toEObject(Document, ResourceSet)} **/
	private EObject toEObject(Document doc, EMFRepository repository) {
		String uri = doc.get(PatientIndexHelper.FIELD__ECLASS_URI);
		if (uri == null) {
			return null;
		}

		URI eClassUri = URI.createURI(uri);

		EObject eObject = repository.getEObject(eClassUri);
		if (eObject == null) {
			return null;
		}

		return repository.getEObject((EClass) eObject, doc.get(PatientIndexHelper.FIELD__ID));
	}
}
