/**
 */
package org.avatar.fhir.model.examplePackageName.impl;

import org.avatar.fhir.model.examplePackageName.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExamplePackageNameFactoryImpl extends EFactoryImpl implements ExamplePackageNameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExamplePackageNameFactory init() {
		try {
			ExamplePackageNameFactory theExamplePackageNameFactory = (ExamplePackageNameFactory)EPackage.Registry.INSTANCE.getEFactory(ExamplePackageNamePackage.eNS_URI);
			if (theExamplePackageNameFactory != null) {
				return theExamplePackageNameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExamplePackageNameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplePackageNameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExamplePackageNamePackage.EXAMPLE: return createExample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExamplePackageNamePackage getExamplePackageNamePackage() {
		return (ExamplePackageNamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExamplePackageNamePackage getPackage() {
		return ExamplePackageNamePackage.eINSTANCE;
	}

} //ExamplePackageNameFactoryImpl
