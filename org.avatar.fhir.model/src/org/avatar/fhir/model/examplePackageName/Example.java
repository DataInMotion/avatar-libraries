/*
 */
package org.avatar.fhir.model.examplePackageName;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.fhir.model.examplePackageName.Example#getHello <em>Hello</em>}</li>
 *   <li>{@link org.avatar.fhir.model.examplePackageName.Example#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage#getExample()
 * @model
 * @generated
 */
@ProviderType
public interface Example extends EObject {
	/**
	 * Returns the value of the '<em><b>Hello</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hello</em>' attribute.
	 * @see #setHello(String)
	 * @see org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage#getExample_Hello()
	 * @model
	 * @generated
	 */
	String getHello();

	/**
	 * Sets the value of the '{@link org.avatar.fhir.model.examplePackageName.Example#getHello <em>Hello</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hello</em>' attribute.
	 * @see #getHello()
	 * @generated
	 */
	void setHello(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.avatar.fhir.model.examplePackageName.ExamplePackageNamePackage#getExample_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.avatar.fhir.model.examplePackageName.Example#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Example
