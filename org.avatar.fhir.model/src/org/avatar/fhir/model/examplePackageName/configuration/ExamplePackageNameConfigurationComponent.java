/*
 */
package org.avatar.fhir.model.examplePackageName.configuration;

import java.util.Hashtable;

import org.avatar.fhir.model.examplePackageName.ExamplePackageNameFactory;
import org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage;

import org.avatar.fhir.model.examplePackageName.impl.ExamplePackageNamePackageImpl;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "ExamplePackageNameConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.avatar.fhir.model.examplePackageName.util.ExamplePackageNameResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource.Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.avatar.fhir.model.examplePackageName.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.avatar.fhir.model.examplePackageName.ExamplePackageNameFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.avatar.fhir.model.examplePackageName\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.avatar.fhir.model.examplePackageName\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.avatar.fhir.model.examplePackageName\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class ExamplePackageNameConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		ExamplePackageNamePackage ePackage = ExamplePackageNamePackageImpl.eINSTANCE;
		
		ExamplePackageNameEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the ExamplePackageNameEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private ExamplePackageNameEPackageConfigurator registerEPackageConfiguratorService(ExamplePackageNamePackage ePackage, BundleContext ctx){
		ExamplePackageNameEPackageConfigurator packageConfigurator = new ExamplePackageNameEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}


	/**
	 * Registers the ExamplePackageNamePackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(ExamplePackageNamePackage ePackage, ExamplePackageNameEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {ExamplePackageNamePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the ExamplePackageNameFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(ExamplePackageNamePackage ePackage, ExamplePackageNameEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {ExamplePackageNameFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getExamplePackageNameFactory(), properties);
	}

	private void registerConditionService(ExamplePackageNameEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, ExamplePackageNamePackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(ExamplePackageNamePackage.eNS_URI);
	}
}
