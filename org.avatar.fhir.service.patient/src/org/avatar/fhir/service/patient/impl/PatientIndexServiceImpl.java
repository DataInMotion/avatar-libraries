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

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.avatar.fhir.service.patient.api.PatientIndexService;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.gecko.emf.osgi.UriMapProvider;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;
import org.gecko.search.document.LuceneIndexService;
import org.gecko.util.pushstreams.GeckoPushbackPolicyOption;
import org.hl7.fhir_patient.Fhir_PatientPackage;
import org.hl7.fhir_patient.Patient;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link org.avatar.fhir.service.patient.api.PatientIndexService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "PatientIndexService", service = PatientIndexService.class, scope = ServiceScope.SINGLETON, immediate = true, reference = {
		@Reference(name = "mongoCondition", service = UriMapProvider.class, target = "(uri.map.src=mongodb://fhir/)", cardinality = ReferenceCardinality.MANDATORY),
		@Reference(name = "modelCondition", service = ResourceSetFactory.class, target = "(emf.name=fhir_patient)", cardinality = ReferenceCardinality.MANDATORY) })
public class PatientIndexServiceImpl implements PatientIndexService {
	private static final Logger LOG = LoggerFactory.getLogger(PatientIndexServiceImpl.class);

	@Reference(target = "(repo_id=fhir.fhir)", cardinality = ReferenceCardinality.MANDATORY)
	private ComponentServiceObjects<EMFRepository> repositoryServiceObjects;

	@Reference(target = "(id=patient)")
	private LuceneIndexService<EObjectDocumentIndexObjectContext> patientIndex;

	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));

	private AtomicInteger counter = new AtomicInteger(0);

	@Activate
	public void activate() {
		indexPatients();
	}

	private void indexPatients() {
		factory.submit(() -> {
			CountDownLatch latch = new CountDownLatch(1);
			latch.await(100, TimeUnit.MILLISECONDS);
			initializeIndex();
			return true;
		}).onSuccess(t -> LOG.info("Finished indexing Patient objects!")).onFailure(t -> t.printStackTrace());
	}

	public void initializeIndex() {
		LOG.info("Starting indexing Patient objects...");

		EMFRepository repository = repositoryServiceObjects.getService();
		QueryRepository queryRepo = (QueryRepository) repository.getAdapter(QueryRepository.class);
		IQuery query = queryRepo.createQueryBuilder().allQuery().build();

		resetIndex();

		List<Patient> patients = queryRepo.getEObjectsByQuery(Fhir_PatientPackage.Literals.PATIENT, query,
				getLoadOptions());
		if (patients == null || patients.isEmpty()) {
			return;
		}

		counter = new AtomicInteger(0);

		// @formatter:off
		patients.forEach(p -> {
			indexPatient(p, IndexActionType.ADD);
			
			counter.incrementAndGet();
		});
		// @formatter:on

		repositoryServiceObjects.ungetService(repository);

		LOG.info("Finished indexing " + counter.get() + " Person object(s)!");
	}

	/**
	 * FIXME: using {@link org.gecko.emf.pushstream.EPushStreamProvider} causes
	 * `ClassCastException`, likely due to complex class hierarchy of
	 * {@link org.hl7.fhir_patient.Patient} (does not extend
	 * {@link org.eclipse.emf.ecore.EObject} directly)
	 **/
	/*
	java.lang.ClassCastException: class org.hl7.fhir_patient.impl.PatientImpl cannot be cast to class org.gecko.emf.pushstream.EPushStreamProvider (org.hl7.fhir_patient.impl.PatientImpl is in unnamed module of loader org.apache.felix.framework.BundleWiringImpl$BundleClassLoader @72fd8a3c; org.gecko.emf.pushstream.EPushStreamProvider is in unnamed module of loader org.apache.felix.framework.BundleWiringImpl$BundleClassLoader @fb49fdf)
		at org.avatar.fhir.service.patient.impl.PatientIndexServiceImpl.initializeIndex(PatientIndexServiceImpl.java:109)
		at org.avatar.fhir.service.patient.impl.PatientIndexServiceImpl.lambda$0(PatientIndexServiceImpl.java:85)
		at org.osgi.util.promise.DeferredPromiseImpl$Submit.run(DeferredPromiseImpl.java:767)
		at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
		at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
		at java.base/java.lang.Thread.run(Thread.java:833)
	*/
	public Promise<Void> initializeIndex_EPushStreamProvider() {
		LOG.info("Starting indexing Patient objects...");

		EMFRepository repository = repositoryServiceObjects.getService();
		QueryRepository queryRepo = (QueryRepository) repository.getAdapter(QueryRepository.class);
		IQuery query = queryRepo.createQueryBuilder().allQuery().build();

		resetIndex();

		EPushStreamProvider psp = queryRepo.getEObjectByQuery(Fhir_PatientPackage.Literals.PATIENT, query,
				getLoadOptions());
		if (psp == null) {
			return null;
		}

		counter = new AtomicInteger(0);

		// @formatter:off
		PushStream<EObject> indexNew = psp.createPushStreamBuilder()
				.withPushbackPolicy(GeckoPushbackPolicyOption.LINEAR_AFTER_THRESHOLD.getPolicy(50))
				.withQueuePolicy(QueuePolicyOption.BLOCK)
				.withExecutor(Executors.newSingleThreadExecutor())
				.withBuffer(new ArrayBlockingQueue<PushEvent<? extends EObject>>(100))
				.build();
		// @formatter:on

		List<EObjectDocumentIndexObjectContext> contexts = new LinkedList<>();

		// @formatter:off
		Promise<Void> resultPromise = indexNew
				.map(eo -> (Patient) eo)
				.map(PatientIndexHelper::mapPatientNew)
				.forEach(d -> {
					repository.detach(d.getObject());
					if(contexts.size() < 10) {
						contexts.add(d);
					}
					else {
						patientIndex.handleContextsSync(contexts);
						contexts.clear();
						contexts.add(d);
					}
					counter.incrementAndGet();
				})
				.thenAccept(result -> {
					if(!contexts.isEmpty()) {
						try {
							patientIndex.handleContextsSync(contexts);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		// @formatter:on

		return resultPromise.onFailure(t -> repositoryServiceObjects.ungetService(repository))
				.thenAccept(result -> LOG.info("Finished indexing " + counter.get() + " Person object(s)!"))
				.thenAccept(result -> repositoryServiceObjects.ungetService(repository));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientIndexService#indexPatient(org.hl7.fhir_patient.Patient, boolean)
	 */
	@Override
	public void indexPatient(Patient patient, boolean isFirstSave) {
		if (isFirstSave) {
			indexPatient(patient, IndexActionType.ADD);
		} else {
			indexPatient(patient, IndexActionType.MODIFY);
		}
	}

	private void indexPatient(Patient patient, IndexActionType actionType) {
		EObjectDocumentIndexObjectContext context = PatientIndexHelper.mapPatient(patient, actionType);
		patientIndex.handleContextSync(context);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientIndexService#deletePatient(org.hl7.fhir_patient.Patient)
	 */
	@Override
	public void deletePatient(Patient patient) {
		indexPatient(patient, IndexActionType.REMOVE);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.fhir.service.patient.api.PatientIndexService#resetIndex()
	 */
	@Override
	public void resetIndex() {
		try {
			patientIndex.getIndexWriter().deleteAll();
			patientIndex.commit();
		} catch (IOException e) {
			LOG.error("Could not delete Patients index " + e);
		}

	}

	public static Map<Object, Object> getLoadOptions() {
		Map<Object, Object> loadOptions = new HashMap<>();
		/**
		 * temporarily disabled; see
		 * {@link org.avatar.fhir.service.patient.impl.PatientIndexServiceImpl.initializeIndex_EPushStreamProvider()}
		 * for more info
		 **/
//		loadOptions.put(Options.OPTION_BATCH_SIZE, Integer.valueOf(600));
//		loadOptions.put(MongoPushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		loadOptions.put(Options.OPTION_READ_DETACHED, true);
		return loadOptions;
	}
}