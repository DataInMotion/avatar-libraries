/*
 */
package org.avatar.fhir.model.examplePackageName;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.avatar.fhir.model.examplePackageName.ExamplePackageNameFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ExamplePackageNamePackage.eNS_URI, genModel = "/model/your-genmodel-here.genmodel", genModelSourceLocations = {"model/your-genmodel-here.genmodel","org.avatar.fhir.model/model/your-genmodel-here.genmodel"}, ecore="/model/your-model-here.ecore", ecoreSourceLocations="/model/your-model-here.ecore")
public interface ExamplePackageNamePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "examplePackageName";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.de/example/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "example";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackageNamePackage eINSTANCE = org.avatar.fhir.model.examplePackageName.impl.ExamplePackageNamePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.avatar.fhir.model.examplePackageName.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.fhir.model.examplePackageName.impl.ExampleImpl
	 * @see org.avatar.fhir.model.examplePackageName.impl.ExamplePackageNamePackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Hello</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__HELLO = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.avatar.fhir.model.examplePackageName.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see org.avatar.fhir.model.examplePackageName.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.fhir.model.examplePackageName.Example#getHello <em>Hello</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hello</em>'.
	 * @see org.avatar.fhir.model.examplePackageName.Example#getHello()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Hello();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.fhir.model.examplePackageName.Example#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.avatar.fhir.model.examplePackageName.Example#getComment()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExamplePackageNameFactory getExamplePackageNameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.avatar.fhir.model.examplePackageName.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.fhir.model.examplePackageName.impl.ExampleImpl
		 * @see org.avatar.fhir.model.examplePackageName.impl.ExamplePackageNamePackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Hello</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__HELLO = eINSTANCE.getExample_Hello();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__COMMENT = eINSTANCE.getExample_Comment();

	}

} //ExamplePackageNamePackage
