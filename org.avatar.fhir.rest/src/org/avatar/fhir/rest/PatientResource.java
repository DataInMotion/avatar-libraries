/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 *     Stefan Bishof - API and implementation
 *     Tim Ward - implementation
 */
package org.avatar.fhir.rest;

import org.avatar.fhir.service.patient.api.PatientService;
import org.gecko.emf.rest.annotations.ValidateContent;
import org.gecko.emf.rest.annotations.json.EMFJSONConfig;
import org.gecko.emf.rest.annotations.json.RootElement;
import org.hl7.fhir_patient.Patient;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * CRUD REST API endpoint for {@link org.hl7.fhir_patient.Patient} EObjects.
 * 
 * @author Michal H. Siemaszko
 */
@JakartarsResource
@JakartarsName("Patient Resource")
@Component(service = PatientResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/Patient")
public class PatientResource {

	static final String PATIENT_URI = "http://hl7.org/fhir/patient#//Patient";

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private PatientService patientService;

	/**
	 * Basic implementation of {@link https://www.hl7.org/fhir/http.html#create}
	 */
	@POST
	// FIXME: response is returned as JSON, despite having annotated REST API method and specified 'application/json' request header
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = Patient.class)),
			@Content(mediaType = MediaType.APPLICATION_XML, schema = @Schema(implementation = Patient.class)) }) }, tags = {
					"Patient" })
	public Response create(Patient patient) {
	// FIXME: content validation does not work in JakartaRS - same worked with JaxRS
//	public Response create(@ValidateContent @RootElement(rootClassUri = PATIENT_URI) Patient patient) {

		Patient savedPatient = patientService.savePatient(patient);

		if (savedPatient == null) {
			return Response.noContent().build();
		}

		return Response.ok(savedPatient).build();
	}

	/**
	 * Basic implementation of {@link https://www.hl7.org/fhir/http.html#read}
	 */
	@GET
	@Path("{patientId}")
	// FIXME: response is returned as JSON, despite having annotated REST API method and specified 'application/json' request header
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = Patient.class)),
			@Content(mediaType = MediaType.APPLICATION_XML, schema = @Schema(implementation = Patient.class)) }) }, tags = {
					"Patient" })	
	public Response read(
			@NotBlank(message = "Please provide patient Id") @PathParam(value = "patientId") String patientId) {

		Patient patient = patientService.getPatientById(patientId);

		if (patient == null) {
			return Response.noContent().build();
		}

		return Response.ok(patient).build();
	}

	/**
	 * Basic implementation of {@link https://www.hl7.org/fhir/http.html#update}
	 */
	@PUT
	@Path("{patientId}")
	// FIXME: response is returned as JSON, despite having annotated REST API method and specified 'application/json' request header
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = Patient.class)),
			@Content(mediaType = MediaType.APPLICATION_XML, schema = @Schema(implementation = Patient.class)) }) }, tags = {
					"Patient" })
	public Response update(
			@NotBlank(message = "Please provide patient Id") @PathParam(value = "patientId") String patientId,
			Patient patient) {
	// FIXME: content validation does not work in JakartaRS - same worked with JaxRS
//	public Response update(
//			@NotBlank(message = "Please provide patient Id") @PathParam(value = "patientId") String patientId,
//			@ValidateContent @RootElement(rootClassUri = PATIENT_URI) Patient patient) {

		Patient savedPatient = patientService.savePatient(patient);

		if (savedPatient == null) {
			return Response.noContent().build();
		}

		return Response.ok(savedPatient).build();
	}

	/**
	 * Basic implementation of {@link https://www.hl7.org/fhir/http.html#delete}
	 */
	@DELETE
	@Path("{patientId}")
	// FIXME: response is returned as JSON, despite having annotated REST API method and specified 'application/json' request header
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Operation(responses = { @ApiResponse(responseCode = "200") }, tags = { "Patient" })
	public Response delete(
			@NotBlank(message = "Please provide patient Id") @PathParam(value = "patientId") String patientId) {

		boolean deleted = patientService.deletePatient(patientId);

		return Response.ok().build();
	}
}
