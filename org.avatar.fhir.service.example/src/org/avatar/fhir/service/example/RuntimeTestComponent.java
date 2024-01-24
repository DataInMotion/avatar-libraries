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

import org.avatar.fhir.model.examplePackageName.ExamplePackageNameFactory;
import org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage;
import org.gecko.emf.repository.EMFRepository;
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
	private ExamplePackageNameFactory modelFactory;
	@Reference
	private ExamplePackageNamePackage modelPackage;
	@Reference
	private EMFRepository repo;
	
	@Activate
	public void activate() {
		// do something
	}


}
