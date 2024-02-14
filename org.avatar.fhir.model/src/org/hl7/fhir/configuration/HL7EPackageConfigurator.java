/*
 */
package org.hl7.fhir.configuration;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.hl7.fhir.FHIRPackage;
import org.w3c.xhtml.XHTMLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * 
 * @author mark
 * @since 14.02.2024
 */
public class HL7EPackageConfigurator implements EPackageConfigurator {
	
	private FHIRPackage fhirPackage;
	private XHTMLPackage xhtmlPackage;

	protected HL7EPackageConfigurator(FHIRPackage fhirPackage, XHTMLPackage xhtmlPackage){
		this.fhirPackage = fhirPackage;
		this.xhtmlPackage = xhtmlPackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(XHTMLPackage.eNS_URI, xhtmlPackage);
		registry.put(FHIRPackage.eNS_URI, fhirPackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(FHIRPackage.eNS_URI);
		registry.remove(XHTMLPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, FHIRPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, FHIRPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "fhir");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}