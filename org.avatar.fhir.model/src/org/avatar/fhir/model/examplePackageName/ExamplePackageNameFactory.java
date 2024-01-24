/*
 */
package org.avatar.fhir.model.examplePackageName;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage
 * @generated
 */
@ProviderType
public interface ExamplePackageNameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackageNameFactory eINSTANCE = org.avatar.fhir.model.examplePackageName.impl.ExamplePackageNameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example</em>'.
	 * @generated
	 */
	Example createExample();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExamplePackageNamePackage getExamplePackageNamePackage();

} //ExamplePackageNameFactory
