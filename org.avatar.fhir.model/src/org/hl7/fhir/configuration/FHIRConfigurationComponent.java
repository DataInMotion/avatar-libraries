/*
 */
package org.hl7.fhir.configuration;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.gecko.emf.osgi.configurator.EPackageConfigurator;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.hl7.fhir.FHIRFactory;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.impl.FHIRPackageImpl;
import org.hl7.fhir.util.FHIRResourceFactoryImpl;
import org.osgi.annotation.bundle.Capability;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.condition.Condition;
import org.w3c.xhtml.XHTMLPackage;
import org.w3c.xhtml.impl.XHTMLPackageImpl;

/**
 * 
 * @author mark
 * @since 14.02.2024
 */
@Component(name = "FHIRConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.hl7.fhir.util.FHIRResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource.Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.hl7.fhir.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.hl7.fhir.FHIRFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.hl7.fhir\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.hl7.fhir.FHIRPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.hl7.fhir\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.hl7.fhir\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class FHIRConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;
	private ServiceRegistration<?> resourceFactoryRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 */
	@Activate
	public void activate(BundleContext ctx) {
		XHTMLPackage xhtmlPackage = XHTMLPackageImpl.eINSTANCE;
		FHIRPackage fhirPackage = FHIRPackageImpl.eINSTANCE;
		
		HL7EPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(fhirPackage, xhtmlPackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(fhirPackage, packageConfigurator, ctx);
		registerEFactoryService(fhirPackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the ExamplePrefixEPackageConfigurator as a service.
	 *
	 */
	private HL7EPackageConfigurator registerEPackageConfiguratorService(FHIRPackage fhirPackage, XHTMLPackage xhtmlPackage, BundleContext ctx){
		HL7EPackageConfigurator packageConfigurator = new HL7EPackageConfigurator(fhirPackage, xhtmlPackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the ExamplePrefixResourceFactoryImpl as a service.
	 *
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		FHIRResourceFactoryImpl factory = new FHIRResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(getServiceProperties());
		String[] serviceClasses = new String[] {FHIRResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}
	
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, FHIRPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "fhir");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}

	/**
	 * Registers the ExamplePrefixPackage as a service.
	 *
	 */
	private void registerEPackageService(FHIRPackage ePackage, HL7EPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {FHIRPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the ExamplePrefixFactory as a service.
	 *
	 */
	private void registerEFactoryService(FHIRPackage fhirPackage, HL7EPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {FHIRFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, fhirPackage.getFHIRFactory(), properties);
	}

	private void registerConditionService(HL7EPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, FHIRPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		resourceFactoryRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(FHIRPackage.eNS_URI);
		EPackage.Registry.INSTANCE.remove(XHTMLPackage.eNS_URI);
	}
}
