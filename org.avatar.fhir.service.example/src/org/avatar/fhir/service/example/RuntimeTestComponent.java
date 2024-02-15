/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.avatar.fhir.service.example;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderEnum;
import org.hl7.fhir.FHIRFactory;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Patient;
import org.hl7.fhir.Person;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * !!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * @author mark
 * @since 19.01.2024
 */
@Component
public class RuntimeTestComponent {

	@Reference
	private FHIRFactory modelFactory;
	@Reference
	private FHIRPackage modelPackage;
	@Reference
	private EMFRepository repo;

	@Activate
	public void activate() {
		Patient patient = modelFactory.createPatient();
		Id id = modelFactory.createId();
		id.setId("test");
		id.setValue("123");
		patient.setId(id);
		System.out.println("Save Patient:");
		String patId = null;
		try {
			repo.save(patient);
			patId =  patient.getExtId();
			System.out.println("Save Patient: " + patId + " - " + patient);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Person person = modelFactory.createPerson();
		person.setId(id);
		AdministrativeGender gender = modelFactory.createAdministrativeGender();
		gender.setValue(AdministrativeGenderEnum.MALE);
		person.setGender(gender);
		try {
			org.hl7.fhir.Date date = modelFactory.createDate();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date d = format.parse("1977-04-21");
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(d);
			
			XMLGregorianCalendar xmlGregCal;
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			date.setValue(xmlGregCal);
			person.setBirthDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Save Person:");
		String perId = null;
		try {
			repo.save(person);
			perId = person.getExtId();
			System.out.println("Save Person: " + perId + " - " + person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		repo.detach(person);
		repo.detach(patient);
		Person loadPerson = repo.getEObject(modelPackage.getPerson(), perId);
		System.out.println("Loaded Person " + loadPerson + " - " + loadPerson.getBirthDate().toString());
		Patient loadPatient = repo.getEObject(modelPackage.getPatient(), patId);
		System.out.println("Loaded Patient " + loadPatient + " - " + loadPatient.getId().toString());
	}


}
