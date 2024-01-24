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
package org.avatar.fhir.rest.example;

import org.avatar.fhir.model.examplePackageName.Example;
import org.avatar.fhir.model.examplePackageName.ExamplePackageNameFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This is a Demo Resource for a Jakartars Whiteboard
 * 
 * 
 * ------------------------------------------------------------- 
 * !!!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * -------------------------------------------------------------
 * 
 * 
 * 
 * @since 1.0
 */
@JakartarsResource
@JakartarsName("demo")
@Component(service = DemoResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class DemoResource {
	
	@Reference
	private ExamplePackageNameFactory modelFactory;

	/**
	 * Please check http://localhost:8082/fhir/rest/hello
	 * @return
	 */
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello World (via HTTP Whiteboard)!";
	}
	
	/**
	 * Please check http://localhost:8082/fhir/rest/example
	 * @return
	 */
	@GET
	@Path("/example")
	@Produces(MediaType.APPLICATION_JSON)
	public Response example() {
		Example e = modelFactory.createExample();
		e.setHello("Michael");
		e.setComment("Thank you for your work! ;-)");
		return Response.ok(e).build();
	}

}
