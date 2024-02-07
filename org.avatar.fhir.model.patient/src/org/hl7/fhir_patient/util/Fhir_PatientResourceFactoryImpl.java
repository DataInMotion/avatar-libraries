/*
 */
package org.hl7.fhir_patient.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.constants.EMFNamespaces;

import org.hl7.fhir_patient.Fhir_PatientPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir_patient.util.Fhir_PatientResourceImpl
 * @generated
 */
public class Fhir_PatientResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fhir_PatientResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new Fhir_PatientResourceImpl(uri);
		return result;
	}

	/**
	 * A method providing the Properties the services around this ResourceFactory should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, Fhir_PatientPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "fhir_patient");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "5.0");
		return properties;
	}

} //Fhir_PatientResourceFactoryImpl
