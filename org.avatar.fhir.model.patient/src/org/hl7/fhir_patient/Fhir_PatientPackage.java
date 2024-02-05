/*
 */
package org.hl7.fhir_patient;


import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.hl7.fhir_patient.Fhir_PatientFactory
 * @model kind="package"
 *        annotation="Version value='5.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = Fhir_PatientPackage.eNS_URI, genModel = "/model/fhir-patient.genmodel", genModelSourceLocations = {"model/fhir-patient.genmodel","org.avatar.fhir.model.patient/model/fhir-patient.genmodel"}, ecore="/model/fhir-patient.ecore", ecoreSourceLocations="/model/fhir-patient.ecore")
public interface Fhir_PatientPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fhir_patient";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hl7.org/fhir/patient";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhir_patient";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fhir_PatientPackage eINSTANCE = org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BaseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 12;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ElementImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AddressImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LINE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>District</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DISTRICT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERIOD = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AddressTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AddressUseImpl <em>Address Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AddressUseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressUse()
	 * @generated
	 */
	int ADDRESS_USE = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Address Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AdministrativeGenderImpl <em>Administrative Gender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AdministrativeGenderImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAdministrativeGender()
	 * @generated
	 */
	int ADMINISTRATIVE_GENDER = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_GENDER__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_GENDER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_GENDER__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Administrative Gender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_GENDER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Administrative Gender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_GENDER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.QuantityImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 76;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__COMPARATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SYSTEM = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AgeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AnnotationImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Author Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__AUTHOR_REFERENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__AUTHOR_STRING = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TIME = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AttachmentImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__URL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__HASH = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TITLE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__HEIGHT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__WIDTH = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FRAMES = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DURATION = DATA_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PAGES = DATA_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AvailabilityImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 7;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Available Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__AVAILABLE_TIME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not Available Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__NOT_AVAILABLE_TIME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AvailabilityAvailableTimeImpl <em>Availability Available Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AvailabilityAvailableTimeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailabilityAvailableTime()
	 * @generated
	 */
	int AVAILABILITY_AVAILABLE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Days Of Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__ALL_DAY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Availability Available Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Availability Available Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_AVAILABLE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.AvailabilityNotAvailableTimeImpl <em>Availability Not Available Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.AvailabilityNotAvailableTimeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailabilityNotAvailableTime()
	 * @generated
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME = 9;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME__DESCRIPTION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME__DURING = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Availability Not Available Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Availability Not Available Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_NOT_AVAILABLE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BackboneElementImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBackboneElement()
	 * @generated
	 */
	int BACKBONE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__MODIFIER_EXTENSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BackboneTypeImpl <em>Backbone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BackboneTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBackboneType()
	 * @generated
	 */
	int BACKBONE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_TYPE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_TYPE__MODIFIER_EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backbone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Base64BinaryImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 13;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ResourceImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 84;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__META = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IMPLICIT_RULES = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LANGUAGE = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BinaryImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__META = RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__IMPLICIT_RULES = RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CONTENT_TYPE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SECURITY_CONTEXT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DATA = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BooleanImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 15;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__META = RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IMPLICIT_RULES = RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IDENTIFIER = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TYPE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TIMESTAMP = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TOTAL = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LINK = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ENTRY = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__SIGNATURE = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleEntryImpl <em>Bundle Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleEntryImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleEntry()
	 * @generated
	 */
	int BUNDLE_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__LINK = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__FULL_URL = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__SEARCH = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__REQUEST = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY__RESPONSE = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bundle Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bundle Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ENTRY_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleLinkImpl <em>Bundle Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleLinkImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleLink()
	 * @generated
	 */
	int BUNDLE_LINK = 18;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK__RELATION = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK__URL = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bundle Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LINK_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleRequestImpl <em>Bundle Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleRequestImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleRequest()
	 * @generated
	 */
	int BUNDLE_REQUEST = 19;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__METHOD = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__URL = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If None Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__IF_NONE_MATCH = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>If Modified Since</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__IF_MODIFIED_SINCE = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>If Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__IF_MATCH = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>If None Exist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST__IF_NONE_EXIST = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bundle Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bundle Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUEST_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleResponseImpl <em>Bundle Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleResponseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleResponse()
	 * @generated
	 */
	int BUNDLE_RESPONSE = 20;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__STATUS = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__LOCATION = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Etag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__ETAG = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE__LAST_MODIFIED = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bundle Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bundle Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_RESPONSE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleSearchImpl <em>Bundle Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleSearchImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleSearch()
	 * @generated
	 */
	int BUNDLE_SEARCH = 21;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH__MODE = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH__SCORE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bundle Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SEARCH_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.BundleTypeImpl <em>Bundle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.BundleTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleType()
	 * @generated
	 */
	int BUNDLE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bundle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CanonicalImpl <em>Canonical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CanonicalImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCanonical()
	 * @generated
	 */
	int CANONICAL = 23;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Canonical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Canonical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CodeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 24;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CodeableConceptImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodeableConcept()
	 * @generated
	 */
	int CODEABLE_CONCEPT = 25;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__CODING = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CodeableReferenceImpl <em>Codeable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CodeableReferenceImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodeableReference()
	 * @generated
	 */
	int CODEABLE_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE__CONCEPT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Codeable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Codeable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_REFERENCE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CodingImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 27;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__USER_SELECTED = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ContactDetailImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactDetail()
	 * @generated
	 */
	int CONTACT_DETAIL = 28;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__TELECOM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ContactPointImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 29;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__USE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__RANK = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ContactPointSystemImpl <em>Contact Point System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ContactPointSystemImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointSystem()
	 * @generated
	 */
	int CONTACT_POINT_SYSTEM = 30;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_SYSTEM__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_SYSTEM__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_SYSTEM__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Point System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contact Point System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_SYSTEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ContactPointUseImpl <em>Contact Point Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ContactPointUseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointUse()
	 * @generated
	 */
	int CONTACT_POINT_USE = 31;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_USE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_USE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_USE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Point Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_USE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contact Point Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_USE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.CountImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 32;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataRequirementImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirement()
	 * @generated
	 */
	int DATA_REQUIREMENT = 33;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__PROFILE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subject Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__SUBJECT_REFERENCE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__MUST_SUPPORT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__CODE_FILTER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__DATE_FILTER = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__VALUE_FILTER = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__LIMIT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__SORT = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl <em>Data Requirement Code Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementCodeFilter()
	 * @generated
	 */
	int DATA_REQUIREMENT_CODE_FILTER = 34;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__VALUE_SET = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER__CODE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Requirement Code Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Requirement Code Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_CODE_FILTER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataRequirementDateFilterImpl <em>Data Requirement Date Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataRequirementDateFilterImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementDateFilter()
	 * @generated
	 */
	int DATA_REQUIREMENT_DATE_FILTER = 35;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__SEARCH_PARAM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Requirement Date Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Requirement Date Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_DATE_FILTER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataRequirementSortImpl <em>Data Requirement Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataRequirementSortImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementSort()
	 * @generated
	 */
	int DATA_REQUIREMENT_SORT = 36;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT__DIRECTION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Requirement Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Requirement Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_SORT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DataRequirementValueFilterImpl <em>Data Requirement Value Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DataRequirementValueFilterImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementValueFilter()
	 * @generated
	 */
	int DATA_REQUIREMENT_VALUE_FILTER = 37;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Requirement Value Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Data Requirement Value Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_VALUE_FILTER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DateImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 39;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DateTimeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 40;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DecimalImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 41;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DistanceImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 42;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DomainResourceImpl <em>Domain Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DomainResourceImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDomainResource()
	 * @generated
	 */
	int DOMAIN_RESOURCE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__META = RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__IMPLICIT_RULES = RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__TEXT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__EXTENSION = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE__MODIFIER_EXTENSION = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Domain Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DosageImpl <em>Dosage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DosageImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDosage()
	 * @generated
	 */
	int DOSAGE = 44;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__EXTENSION = BACKBONE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ID = BACKBONE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MODIFIER_EXTENSION = BACKBONE_TYPE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__SEQUENCE = BACKBONE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__TEXT = BACKBONE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ADDITIONAL_INSTRUCTION = BACKBONE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__PATIENT_INSTRUCTION = BACKBONE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__TIMING = BACKBONE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>As Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__AS_NEEDED = BACKBONE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>As Needed For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__AS_NEEDED_FOR = BACKBONE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__SITE = BACKBONE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ROUTE = BACKBONE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__METHOD = BACKBONE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dose And Rate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__DOSE_AND_RATE = BACKBONE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Dose Per Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_PERIOD = BACKBONE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Dose Per Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_ADMINISTRATION = BACKBONE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Dose Per Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_LIFETIME = BACKBONE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Dosage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_FEATURE_COUNT = BACKBONE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Dosage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_OPERATION_COUNT = BACKBONE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DosageDoseAndRateImpl <em>Dosage Dose And Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DosageDoseAndRateImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDosageDoseAndRate()
	 * @generated
	 */
	int DOSAGE_DOSE_AND_RATE = 45;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__EXTENSION = BACKBONE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__ID = BACKBONE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__MODIFIER_EXTENSION = BACKBONE_TYPE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__TYPE = BACKBONE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dose Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__DOSE_RANGE = BACKBONE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY = BACKBONE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__RATE_RATIO = BACKBONE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__RATE_RANGE = BACKBONE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE__RATE_QUANTITY = BACKBONE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dosage Dose And Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE_FEATURE_COUNT = BACKBONE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dosage Dose And Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_DOSE_AND_RATE_OPERATION_COUNT = BACKBONE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.DurationImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 46;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.EventTimingImpl <em>Event Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.EventTimingImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getEventTiming()
	 * @generated
	 */
	int EVENT_TIMING = 48;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIMING__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIMING__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIMING__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIMING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TIMING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ExpressionImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__REFERENCE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ExtendedContactDetailImpl <em>Extended Contact Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ExtendedContactDetailImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExtendedContactDetail()
	 * @generated
	 */
	int EXTENDED_CONTACT_DETAIL = 50;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__PURPOSE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__TELECOM = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__ADDRESS = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__ORGANIZATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL__PERIOD = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Extended Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Extended Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CONTACT_DETAIL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ExtensionImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 51;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_BASE64_BINARY = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_BOOLEAN = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CANONICAL = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CODE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DATE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DATE_TIME = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DECIMAL = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_ID = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_INSTANT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_INTEGER = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Integer64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_INTEGER64 = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Value Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_MARKDOWN = DATA_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_OID = DATA_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_POSITIVE_INT = DATA_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_STRING = DATA_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_TIME = DATA_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_UNSIGNED_INT = DATA_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_URI = DATA_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Value Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_URL = DATA_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_UUID = DATA_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_ADDRESS = DATA_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Value Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_AGE = DATA_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_ANNOTATION = DATA_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_ATTACHMENT = DATA_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CODEABLE_CONCEPT = DATA_TYPE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Value Codeable Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CODEABLE_REFERENCE = DATA_TYPE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CODING = DATA_TYPE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CONTACT_POINT = DATA_TYPE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Value Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_COUNT = DATA_TYPE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Value Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DISTANCE = DATA_TYPE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DURATION = DATA_TYPE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_HUMAN_NAME = DATA_TYPE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_IDENTIFIER = DATA_TYPE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Value Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_MONEY = DATA_TYPE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_PERIOD = DATA_TYPE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_QUANTITY = DATA_TYPE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_RANGE = DATA_TYPE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_RATIO = DATA_TYPE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Value Ratio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_RATIO_RANGE = DATA_TYPE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_REFERENCE = DATA_TYPE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_SAMPLED_DATA = DATA_TYPE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_SIGNATURE = DATA_TYPE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_TIMING = DATA_TYPE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Value Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_CONTACT_DETAIL = DATA_TYPE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Value Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DATA_REQUIREMENT = DATA_TYPE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_EXPRESSION = DATA_TYPE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Value Parameter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_PARAMETER_DEFINITION = DATA_TYPE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Value Related Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_RELATED_ARTIFACT = DATA_TYPE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Value Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_TRIGGER_DEFINITION = DATA_TYPE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Value Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_USAGE_CONTEXT = DATA_TYPE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Value Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_AVAILABILITY = DATA_TYPE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Value Extended Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_EXTENDED_CONTACT_DETAIL = DATA_TYPE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Value Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_DOSAGE = DATA_TYPE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_META = DATA_TYPE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = DATA_TYPE_FEATURE_COUNT + 54;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 55;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.HTTPVerbImpl <em>HTTP Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.HTTPVerbImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHTTPVerb()
	 * @generated
	 */
	int HTTP_VERB = 52;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_VERB__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_VERB__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_VERB__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTTP Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_VERB_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTTP Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_VERB_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.HumanNameImpl <em>Human Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.HumanNameImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHumanName()
	 * @generated
	 */
	int HUMAN_NAME = 53;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__FAMILY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__GIVEN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PREFIX = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__SUFFIX = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PERIOD = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.IdImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getId()
	 * @generated
	 */
	int ID = 54;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.IdentifierImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 55;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__SYSTEM = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VALUE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assigner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ASSIGNER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.IdentifierUseImpl <em>Identifier Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.IdentifierUseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifierUse()
	 * @generated
	 */
	int IDENTIFIER_USE = 56;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_USE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_USE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_USE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_USE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_USE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.InstantImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 57;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.IntegerImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 58;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.Integer64Impl <em>Integer64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Integer64Impl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64()
	 * @generated
	 */
	int INTEGER64 = 59;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER64__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER64__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER64__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER64_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER64_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.LinkRelationTypesImpl <em>Link Relation Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.LinkRelationTypesImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkRelationTypes()
	 * @generated
	 */
	int LINK_RELATION_TYPES = 60;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATION_TYPES__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATION_TYPES__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATION_TYPES__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Relation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATION_TYPES_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Relation Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATION_TYPES_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.LinkTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.MarkdownImpl <em>Markdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.MarkdownImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMarkdown()
	 * @generated
	 */
	int MARKDOWN = 62;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.MetaImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMeta()
	 * @generated
	 */
	int META = 63;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VERSION_ID = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__LAST_UPDATED = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SOURCE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__PROFILE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SECURITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TAG = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.MoneyImpl <em>Money</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.MoneyImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 64;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__CURRENCY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.NameUseImpl <em>Name Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.NameUseImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNameUse()
	 * @generated
	 */
	int NAME_USE = 65;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_USE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_USE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_USE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_USE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_USE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.NarrativeImpl <em>Narrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.NarrativeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrative()
	 * @generated
	 */
	int NARRATIVE = 66;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__STATUS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__DIV = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.NarrativeStatusImpl <em>Narrative Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.NarrativeStatusImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrativeStatus()
	 * @generated
	 */
	int NARRATIVE_STATUS = 67;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_STATUS__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_STATUS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_STATUS__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Narrative Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_STATUS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Narrative Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_STATUS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.OidImpl <em>Oid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.OidImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getOid()
	 * @generated
	 */
	int OID = 68;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ParameterDefinitionImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 69;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__USE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MIN = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MAX = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__DOCUMENTATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__PROFILE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PatientImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ID = DOMAIN_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__META = DOMAIN_RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__IMPLICIT_RULES = DOMAIN_RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LANGUAGE = DOMAIN_RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__TEXT = DOMAIN_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__EXTENSION = DOMAIN_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MODIFIER_EXTENSION = DOMAIN_RESOURCE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__IDENTIFIER = DOMAIN_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTIVE = DOMAIN_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = DOMAIN_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__TELECOM = DOMAIN_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENDER = DOMAIN_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BIRTH_DATE = DOMAIN_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Deceased Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DECEASED_BOOLEAN = DOMAIN_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Deceased Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DECEASED_DATE_TIME = DOMAIN_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ADDRESS = DOMAIN_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Marital Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MARITAL_STATUS = DOMAIN_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Multiple Birth Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MULTIPLE_BIRTH_BOOLEAN = DOMAIN_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Multiple Birth Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MULTIPLE_BIRTH_INTEGER = DOMAIN_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PHOTO = DOMAIN_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CONTACT = DOMAIN_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__COMMUNICATION = DOMAIN_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>General Practitioner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENERAL_PRACTITIONER = DOMAIN_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MANAGING_ORGANIZATION = DOMAIN_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LINK = DOMAIN_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fake Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__FAKE_ID = DOMAIN_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = DOMAIN_RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = DOMAIN_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PatientCommunicationImpl <em>Patient Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PatientCommunicationImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientCommunication()
	 * @generated
	 */
	int PATIENT_COMMUNICATION = 71;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION__LANGUAGE = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION__PREFERRED = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Patient Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Patient Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_COMMUNICATION_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PatientContactImpl <em>Patient Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PatientContactImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientContact()
	 * @generated
	 */
	int PATIENT_CONTACT = 72;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__RELATIONSHIP = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__NAME = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__TELECOM = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__ADDRESS = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__GENDER = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__ORGANIZATION = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT__PERIOD = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Patient Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Patient Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_CONTACT_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PatientLinkImpl <em>Patient Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PatientLinkImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientLink()
	 * @generated
	 */
	int PATIENT_LINK = 73;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK__OTHER = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK__TYPE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Patient Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Patient Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_LINK_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PeriodImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 74;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.PositiveIntImpl <em>Positive Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.PositiveIntImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 75;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.QuantityComparatorImpl <em>Quantity Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.QuantityComparatorImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantityComparator()
	 * @generated
	 */
	int QUANTITY_COMPARATOR = 77;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARATOR__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARATOR__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARATOR__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARATOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantity Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARATOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.RangeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 78;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOW = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HIGH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.RatioImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 79;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__NUMERATOR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DENOMINATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.RatioRangeImpl <em>Ratio Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.RatioRangeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRatioRange()
	 * @generated
	 */
	int RATIO_RANGE = 80;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Low Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE__LOW_NUMERATOR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE__HIGH_NUMERATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE__DENOMINATOR = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ratio Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ratio Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.ReferenceImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 81;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IDENTIFIER = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.RelatedArtifactImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifact()
	 * @generated
	 */
	int RELATED_ARTIFACT = 82;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__CLASSIFIER = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__LABEL = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__CITATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DOCUMENT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__RESOURCE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__RESOURCE_REFERENCE = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Publication Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__PUBLICATION_STATUS = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__PUBLICATION_DATE = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.RelatedArtifactTypeImpl <em>Related Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.RelatedArtifactTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifactType()
	 * @generated
	 */
	int RELATED_ARTIFACT_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Related Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Related Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.SampledDataImpl <em>Sampled Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.SampledDataImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledData()
	 * @generated
	 */
	int SAMPLED_DATA = 85;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ORIGIN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__INTERVAL = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__INTERVAL_UNIT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__FACTOR = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__LOWER_LIMIT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__UPPER_LIMIT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DIMENSIONS = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Code Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__CODE_MAP = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Offsets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__OFFSETS = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DATA = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.SampledDataDataTypeImpl <em>Sampled Data Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.SampledDataDataTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledDataDataType()
	 * @generated
	 */
	int SAMPLED_DATA_DATA_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_DATA_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_DATA_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_DATA_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sampled Data Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sampled Data Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_DATA_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.SearchEntryModeImpl <em>Search Entry Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.SearchEntryModeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSearchEntryMode()
	 * @generated
	 */
	int SEARCH_ENTRY_MODE = 87;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_ENTRY_MODE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_ENTRY_MODE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_ENTRY_MODE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Entry Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_ENTRY_MODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Search Entry Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_ENTRY_MODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.SignatureImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 88;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHEN = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHO = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ON_BEHALF_OF = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TARGET_FORMAT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sig Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__SIG_FORMAT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__DATA = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.SortDirectionImpl <em>Sort Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.SortDirectionImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 89;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DIRECTION__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DIRECTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DIRECTION__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DIRECTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sort Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DIRECTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.StringImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getString()
	 * @generated
	 */
	int STRING = 90;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.TimeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 91;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.TimingImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 92;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EXTENSION = BACKBONE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__ID = BACKBONE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__MODIFIER_EXTENSION = BACKBONE_TYPE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENT = BACKBONE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__REPEAT = BACKBONE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CODE = BACKBONE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = BACKBONE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = BACKBONE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.TimingRepeatImpl <em>Timing Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.TimingRepeatImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTimingRepeat()
	 * @generated
	 */
	int TIMING_REPEAT = 93;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__EXTENSION = BACKBONE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__ID = BACKBONE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__MODIFIER_EXTENSION = BACKBONE_TYPE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Bounds Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__BOUNDS_DURATION = BACKBONE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__BOUNDS_RANGE = BACKBONE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounds Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__BOUNDS_PERIOD = BACKBONE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__COUNT = BACKBONE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Count Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__COUNT_MAX = BACKBONE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION = BACKBONE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION_MAX = BACKBONE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Duration Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION_UNIT = BACKBONE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__FREQUENCY = BACKBONE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Frequency Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__FREQUENCY_MAX = BACKBONE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD = BACKBONE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Period Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD_MAX = BACKBONE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Period Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD_UNIT = BACKBONE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DAY_OF_WEEK = BACKBONE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__TIME_OF_DAY = BACKBONE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__WHEN = BACKBONE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__OFFSET = BACKBONE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Timing Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT_FEATURE_COUNT = BACKBONE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Timing Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT_OPERATION_COUNT = BACKBONE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.TriggerDefinitionImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerDefinition()
	 * @generated
	 */
	int TRIGGER_DEFINITION = 94;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscription Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__SUBSCRIPTION_TOPIC = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TIMING_TIMING = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timing Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TIMING_REFERENCE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timing Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TIMING_DATE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TIMING_DATE_TIME = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__DATA = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__CONDITION = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.TriggerTypeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UnitsOfTimeImpl <em>Units Of Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UnitsOfTimeImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnitsOfTime()
	 * @generated
	 */
	int UNITS_OF_TIME = 96;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OF_TIME__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OF_TIME__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OF_TIME__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Units Of Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OF_TIME_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Units Of Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OF_TIME_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UnsignedIntImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 97;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UriImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUri()
	 * @generated
	 */
	int URI = 98;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UrlImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 99;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UsageContextImpl <em>Usage Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UsageContextImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUsageContext()
	 * @generated
	 */
	int USAGE_CONTEXT = 100;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__CODE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_QUANTITY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_RANGE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_REFERENCE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.impl.UuidImpl <em>Uuid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.UuidImpl
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUuid()
	 * @generated
	 */
	int UUID = 101;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.AddressTypeEnum <em>Address Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.AddressTypeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressTypeEnum()
	 * @generated
	 */
	int ADDRESS_TYPE_ENUM = 102;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.AddressUseEnum <em>Address Use Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.AddressUseEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressUseEnum()
	 * @generated
	 */
	int ADDRESS_USE_ENUM = 103;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.AdministrativeGenderEnum <em>Administrative Gender Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.AdministrativeGenderEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAdministrativeGenderEnum()
	 * @generated
	 */
	int ADMINISTRATIVE_GENDER_ENUM = 104;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.BundleTypeEnum <em>Bundle Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.BundleTypeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleTypeEnum()
	 * @generated
	 */
	int BUNDLE_TYPE_ENUM = 105;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.ContactPointSystemEnum <em>Contact Point System Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.ContactPointSystemEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointSystemEnum()
	 * @generated
	 */
	int CONTACT_POINT_SYSTEM_ENUM = 106;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.ContactPointUseEnum <em>Contact Point Use Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.ContactPointUseEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointUseEnum()
	 * @generated
	 */
	int CONTACT_POINT_USE_ENUM = 107;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.EventTimingEnum <em>Event Timing Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.EventTimingEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getEventTimingEnum()
	 * @generated
	 */
	int EVENT_TIMING_ENUM = 108;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.HTTPVerbEnum <em>HTTP Verb Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.HTTPVerbEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHTTPVerbEnum()
	 * @generated
	 */
	int HTTP_VERB_ENUM = 109;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.IdentifierUseEnum <em>Identifier Use Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.IdentifierUseEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifierUseEnum()
	 * @generated
	 */
	int IDENTIFIER_USE_ENUM = 110;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.LinkRelationTypesEnum <em>Link Relation Types Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.LinkRelationTypesEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkRelationTypesEnum()
	 * @generated
	 */
	int LINK_RELATION_TYPES_ENUM = 111;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.LinkTypeEnum <em>Link Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.LinkTypeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkTypeEnum()
	 * @generated
	 */
	int LINK_TYPE_ENUM = 112;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.NameUseEnum <em>Name Use Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.NameUseEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNameUseEnum()
	 * @generated
	 */
	int NAME_USE_ENUM = 113;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.NarrativeStatusEnum <em>Narrative Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.NarrativeStatusEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrativeStatusEnum()
	 * @generated
	 */
	int NARRATIVE_STATUS_ENUM = 114;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.QuantityComparatorEnum <em>Quantity Comparator Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.QuantityComparatorEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantityComparatorEnum()
	 * @generated
	 */
	int QUANTITY_COMPARATOR_ENUM = 115;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.RelatedArtifactTypeEnum <em>Related Artifact Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.RelatedArtifactTypeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifactTypeEnum()
	 * @generated
	 */
	int RELATED_ARTIFACT_TYPE_ENUM = 116;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.SearchEntryModeEnum <em>Search Entry Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.SearchEntryModeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSearchEntryModeEnum()
	 * @generated
	 */
	int SEARCH_ENTRY_MODE_ENUM = 117;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.SortDirectionEnum <em>Sort Direction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.SortDirectionEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSortDirectionEnum()
	 * @generated
	 */
	int SORT_DIRECTION_ENUM = 118;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.TriggerTypeEnum <em>Trigger Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.TriggerTypeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerTypeEnum()
	 * @generated
	 */
	int TRIGGER_TYPE_ENUM = 119;

	/**
	 * The meta object id for the '{@link org.hl7.fhir_patient.UnitsOfTimeEnum <em>Units Of Time Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.UnitsOfTimeEnum
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnitsOfTimeEnum()
	 * @generated
	 */
	int UNITS_OF_TIME_ENUM = 120;

	/**
	 * The meta object id for the '<em>Base64 Binary Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase64BinaryPrimitive()
	 * @generated
	 */
	int BASE64_BINARY_PRIMITIVE = 121;

	/**
	 * The meta object id for the '<em>Boolean Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBooleanPrimitive()
	 * @generated
	 */
	int BOOLEAN_PRIMITIVE = 122;

	/**
	 * The meta object id for the '<em>Boolean Primitive Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBooleanPrimitiveObject()
	 * @generated
	 */
	int BOOLEAN_PRIMITIVE_OBJECT = 123;

	/**
	 * The meta object id for the '<em>Canonical Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCanonicalPrimitive()
	 * @generated
	 */
	int CANONICAL_PRIMITIVE = 124;

	/**
	 * The meta object id for the '<em>Code Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodePrimitive()
	 * @generated
	 */
	int CODE_PRIMITIVE = 125;

	/**
	 * The meta object id for the '<em>Date Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDatePrimitive()
	 * @generated
	 */
	int DATE_PRIMITIVE = 126;

	/**
	 * The meta object id for the '<em>Date Primitive Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDatePrimitiveBase()
	 * @generated
	 */
	int DATE_PRIMITIVE_BASE = 127;

	/**
	 * The meta object id for the '<em>Date Time Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTimePrimitive()
	 * @generated
	 */
	int DATE_TIME_PRIMITIVE = 128;

	/**
	 * The meta object id for the '<em>Date Time Primitive Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTimePrimitiveBase()
	 * @generated
	 */
	int DATE_TIME_PRIMITIVE_BASE = 129;

	/**
	 * The meta object id for the '<em>Decimal Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDecimalPrimitive()
	 * @generated
	 */
	int DECIMAL_PRIMITIVE = 130;

	/**
	 * The meta object id for the '<em>Id Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdPrimitive()
	 * @generated
	 */
	int ID_PRIMITIVE = 131;

	/**
	 * The meta object id for the '<em>Instant Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInstantPrimitive()
	 * @generated
	 */
	int INSTANT_PRIMITIVE = 132;

	/**
	 * The meta object id for the '<em>Integer64 Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64Primitive()
	 * @generated
	 */
	int INTEGER64_PRIMITIVE = 133;

	/**
	 * The meta object id for the '<em>Integer64 Primitive Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64PrimitiveObject()
	 * @generated
	 */
	int INTEGER64_PRIMITIVE_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Integer Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIntegerPrimitive()
	 * @generated
	 */
	int INTEGER_PRIMITIVE = 135;

	/**
	 * The meta object id for the '<em>Integer Primitive Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIntegerPrimitiveObject()
	 * @generated
	 */
	int INTEGER_PRIMITIVE_OBJECT = 136;

	/**
	 * The meta object id for the '<em>Markdown Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMarkdownPrimitive()
	 * @generated
	 */
	int MARKDOWN_PRIMITIVE = 137;

	/**
	 * The meta object id for the '<em>Oid Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getOidPrimitive()
	 * @generated
	 */
	int OID_PRIMITIVE = 138;

	/**
	 * The meta object id for the '<em>Positive Int Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPositiveIntPrimitive()
	 * @generated
	 */
	int POSITIVE_INT_PRIMITIVE = 139;

	/**
	 * The meta object id for the '<em>Sampled Data Data Type Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledDataDataTypePrimitive()
	 * @generated
	 */
	int SAMPLED_DATA_DATA_TYPE_PRIMITIVE = 140;

	/**
	 * The meta object id for the '<em>String Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getStringPrimitive()
	 * @generated
	 */
	int STRING_PRIMITIVE = 141;

	/**
	 * The meta object id for the '<em>Time Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTimePrimitive()
	 * @generated
	 */
	int TIME_PRIMITIVE = 142;

	/**
	 * The meta object id for the '<em>Unsigned Int Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnsignedIntPrimitive()
	 * @generated
	 */
	int UNSIGNED_INT_PRIMITIVE = 143;

	/**
	 * The meta object id for the '<em>Uri Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUriPrimitive()
	 * @generated
	 */
	int URI_PRIMITIVE = 144;

	/**
	 * The meta object id for the '<em>Url Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUrlPrimitive()
	 * @generated
	 */
	int URL_PRIMITIVE = 145;

	/**
	 * The meta object id for the '<em>Uuid Primitive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUuidPrimitive()
	 * @generated
	 */
	int UUID_PRIMITIVE = 146;


	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.hl7.fhir_patient.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.hl7.fhir_patient.Address#getUse()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.Address#getText()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Address#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.hl7.fhir_patient.Address#getLine()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City</em>'.
	 * @see org.hl7.fhir_patient.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>District</em>'.
	 * @see org.hl7.fhir_patient.Address#getDistrict()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_District();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see org.hl7.fhir_patient.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.hl7.fhir_patient.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see org.hl7.fhir_patient.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Address#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.Address#getPeriod()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Period();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.hl7.fhir_patient.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.AddressType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.AddressType#getValue()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Use</em>'.
	 * @see org.hl7.fhir_patient.AddressUse
	 * @generated
	 */
	EClass getAddressUse();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.AddressUse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.AddressUse#getValue()
	 * @see #getAddressUse()
	 * @generated
	 */
	EAttribute getAddressUse_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.AdministrativeGender <em>Administrative Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Gender</em>'.
	 * @see org.hl7.fhir_patient.AdministrativeGender
	 * @generated
	 */
	EClass getAdministrativeGender();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.AdministrativeGender#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.AdministrativeGender#getValue()
	 * @see #getAdministrativeGender()
	 * @generated
	 */
	EAttribute getAdministrativeGender_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see org.hl7.fhir_patient.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.hl7.fhir_patient.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Annotation#getAuthorReference <em>Author Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author Reference</em>'.
	 * @see org.hl7.fhir_patient.Annotation#getAuthorReference()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AuthorReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Annotation#getAuthorString <em>Author String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author String</em>'.
	 * @see org.hl7.fhir_patient.Annotation#getAuthorString()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AuthorString();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Annotation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.hl7.fhir_patient.Annotation#getTime()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.hl7.fhir_patient.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Type</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getContentType()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getLanguage()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Language();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getData()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hash</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getHash()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Hash();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getTitle()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getCreation()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Creation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getHeight()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Height();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getWidth()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Width();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frames</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getFrames()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Frames();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getDuration()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Attachment#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pages</em>'.
	 * @see org.hl7.fhir_patient.Attachment#getPages()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Pages();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see org.hl7.fhir_patient.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Availability#getAvailableTime <em>Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Time</em>'.
	 * @see org.hl7.fhir_patient.Availability#getAvailableTime()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_AvailableTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Availability#getNotAvailableTime <em>Not Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not Available Time</em>'.
	 * @see org.hl7.fhir_patient.Availability#getNotAvailableTime()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_NotAvailableTime();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.AvailabilityAvailableTime <em>Availability Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability Available Time</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityAvailableTime
	 * @generated
	 */
	EClass getAvailabilityAvailableTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.AvailabilityAvailableTime#getDaysOfWeek <em>Days Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days Of Week</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityAvailableTime#getDaysOfWeek()
	 * @see #getAvailabilityAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityAvailableTime_DaysOfWeek();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.AvailabilityAvailableTime#getAllDay <em>All Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Day</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityAvailableTime#getAllDay()
	 * @see #getAvailabilityAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityAvailableTime_AllDay();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.AvailabilityAvailableTime#getAvailableStartTime <em>Available Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Start Time</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityAvailableTime#getAvailableStartTime()
	 * @see #getAvailabilityAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityAvailableTime_AvailableStartTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.AvailabilityAvailableTime#getAvailableEndTime <em>Available End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available End Time</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityAvailableTime#getAvailableEndTime()
	 * @see #getAvailabilityAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityAvailableTime_AvailableEndTime();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.AvailabilityNotAvailableTime <em>Availability Not Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability Not Available Time</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityNotAvailableTime
	 * @generated
	 */
	EClass getAvailabilityNotAvailableTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.AvailabilityNotAvailableTime#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityNotAvailableTime#getDescription()
	 * @see #getAvailabilityNotAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityNotAvailableTime_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.AvailabilityNotAvailableTime#getDuring <em>During</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>During</em>'.
	 * @see org.hl7.fhir_patient.AvailabilityNotAvailableTime#getDuring()
	 * @see #getAvailabilityNotAvailableTime()
	 * @generated
	 */
	EReference getAvailabilityNotAvailableTime_During();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Element</em>'.
	 * @see org.hl7.fhir_patient.BackboneElement
	 * @generated
	 */
	EClass getBackboneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.BackboneElement#getModifierExtension <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier Extension</em>'.
	 * @see org.hl7.fhir_patient.BackboneElement#getModifierExtension()
	 * @see #getBackboneElement()
	 * @generated
	 */
	EReference getBackboneElement_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BackboneType <em>Backbone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Type</em>'.
	 * @see org.hl7.fhir_patient.BackboneType
	 * @generated
	 */
	EClass getBackboneType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.BackboneType#getModifierExtension <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier Extension</em>'.
	 * @see org.hl7.fhir_patient.BackboneType#getModifierExtension()
	 * @see #getBackboneType()
	 * @generated
	 */
	EReference getBackboneType_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.hl7.fhir_patient.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary</em>'.
	 * @see org.hl7.fhir_patient.Base64Binary
	 * @generated
	 */
	EClass getBase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Base64Binary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Base64Binary#getValue()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see org.hl7.fhir_patient.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Binary#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Type</em>'.
	 * @see org.hl7.fhir_patient.Binary#getContentType()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_ContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Binary#getSecurityContext <em>Security Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Context</em>'.
	 * @see org.hl7.fhir_patient.Binary#getSecurityContext()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_SecurityContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Binary#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.hl7.fhir_patient.Binary#getData()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Data();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.hl7.fhir_patient.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.hl7.fhir_patient.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Bundle#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getIdentifier()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Bundle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getType()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Bundle#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getTimestamp()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Bundle#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getTotal()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Total();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Bundle#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getLink()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Bundle#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getEntry()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Bundle#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see org.hl7.fhir_patient.Bundle#getSignature()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Signature();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleEntry <em>Bundle Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Entry</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry
	 * @generated
	 */
	EClass getBundleEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.BundleEntry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry#getLink()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EReference getBundleEntry_Link();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleEntry#getFullUrl <em>Full Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Full Url</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry#getFullUrl()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EReference getBundleEntry_FullUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleEntry#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry#getSearch()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EReference getBundleEntry_Search();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleEntry#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry#getRequest()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EReference getBundleEntry_Request();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleEntry#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see org.hl7.fhir_patient.BundleEntry#getResponse()
	 * @see #getBundleEntry()
	 * @generated
	 */
	EReference getBundleEntry_Response();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleLink <em>Bundle Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Link</em>'.
	 * @see org.hl7.fhir_patient.BundleLink
	 * @generated
	 */
	EClass getBundleLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleLink#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see org.hl7.fhir_patient.BundleLink#getRelation()
	 * @see #getBundleLink()
	 * @generated
	 */
	EReference getBundleLink_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.hl7.fhir_patient.BundleLink#getUrl()
	 * @see #getBundleLink()
	 * @generated
	 */
	EReference getBundleLink_Url();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleRequest <em>Bundle Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Request</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest
	 * @generated
	 */
	EClass getBundleRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getMethod()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getUrl()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getIfNoneMatch <em>If None Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If None Match</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getIfNoneMatch()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_IfNoneMatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getIfModifiedSince <em>If Modified Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Modified Since</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getIfModifiedSince()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_IfModifiedSince();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getIfMatch <em>If Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Match</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getIfMatch()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_IfMatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleRequest#getIfNoneExist <em>If None Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If None Exist</em>'.
	 * @see org.hl7.fhir_patient.BundleRequest#getIfNoneExist()
	 * @see #getBundleRequest()
	 * @generated
	 */
	EReference getBundleRequest_IfNoneExist();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleResponse <em>Bundle Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Response</em>'.
	 * @see org.hl7.fhir_patient.BundleResponse
	 * @generated
	 */
	EClass getBundleResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.hl7.fhir_patient.BundleResponse#getStatus()
	 * @see #getBundleResponse()
	 * @generated
	 */
	EReference getBundleResponse_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleResponse#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.hl7.fhir_patient.BundleResponse#getLocation()
	 * @see #getBundleResponse()
	 * @generated
	 */
	EReference getBundleResponse_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleResponse#getEtag <em>Etag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Etag</em>'.
	 * @see org.hl7.fhir_patient.BundleResponse#getEtag()
	 * @see #getBundleResponse()
	 * @generated
	 */
	EReference getBundleResponse_Etag();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleResponse#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Modified</em>'.
	 * @see org.hl7.fhir_patient.BundleResponse#getLastModified()
	 * @see #getBundleResponse()
	 * @generated
	 */
	EReference getBundleResponse_LastModified();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleSearch <em>Bundle Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Search</em>'.
	 * @see org.hl7.fhir_patient.BundleSearch
	 * @generated
	 */
	EClass getBundleSearch();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleSearch#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mode</em>'.
	 * @see org.hl7.fhir_patient.BundleSearch#getMode()
	 * @see #getBundleSearch()
	 * @generated
	 */
	EReference getBundleSearch_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.BundleSearch#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see org.hl7.fhir_patient.BundleSearch#getScore()
	 * @see #getBundleSearch()
	 * @generated
	 */
	EReference getBundleSearch_Score();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Type</em>'.
	 * @see org.hl7.fhir_patient.BundleType
	 * @generated
	 */
	EClass getBundleType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.BundleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.BundleType#getValue()
	 * @see #getBundleType()
	 * @generated
	 */
	EAttribute getBundleType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Canonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonical</em>'.
	 * @see org.hl7.fhir_patient.Canonical
	 * @generated
	 */
	EClass getCanonical();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Canonical#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Canonical#getValue()
	 * @see #getCanonical()
	 * @generated
	 */
	EAttribute getCanonical_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Code#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Code#getValue()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Concept</em>'.
	 * @see org.hl7.fhir_patient.CodeableConcept
	 * @generated
	 */
	EClass getCodeableConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.CodeableConcept#getCoding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coding</em>'.
	 * @see org.hl7.fhir_patient.CodeableConcept#getCoding()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Coding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.CodeableConcept#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.CodeableConcept#getText()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Text();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.CodeableReference <em>Codeable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Reference</em>'.
	 * @see org.hl7.fhir_patient.CodeableReference
	 * @generated
	 */
	EClass getCodeableReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.CodeableReference#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept</em>'.
	 * @see org.hl7.fhir_patient.CodeableReference#getConcept()
	 * @see #getCodeableReference()
	 * @generated
	 */
	EReference getCodeableReference_Concept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.CodeableReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.hl7.fhir_patient.CodeableReference#getReference()
	 * @see #getCodeableReference()
	 * @generated
	 */
	EReference getCodeableReference_Reference();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see org.hl7.fhir_patient.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.fhir_patient.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.hl7.fhir_patient.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see org.hl7.fhir_patient.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Display();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Coding#getUserSelected <em>User Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Selected</em>'.
	 * @see org.hl7.fhir_patient.Coding#getUserSelected()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_UserSelected();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Detail</em>'.
	 * @see org.hl7.fhir_patient.ContactDetail
	 * @generated
	 */
	EClass getContactDetail();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.ContactDetail#getName()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.ContactDetail#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.hl7.fhir_patient.ContactDetail#getTelecom()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Telecom();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactPoint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint#getSystem()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint#getValue()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactPoint#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint#getUse()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactPoint#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rank</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint#getRank()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Rank();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ContactPoint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.ContactPoint#getPeriod()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Period();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ContactPointSystem <em>Contact Point System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point System</em>'.
	 * @see org.hl7.fhir_patient.ContactPointSystem
	 * @generated
	 */
	EClass getContactPointSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.ContactPointSystem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.ContactPointSystem#getValue()
	 * @see #getContactPointSystem()
	 * @generated
	 */
	EAttribute getContactPointSystem_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ContactPointUse <em>Contact Point Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point Use</em>'.
	 * @see org.hl7.fhir_patient.ContactPointUse
	 * @generated
	 */
	EClass getContactPointUse();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.ContactPointUse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.ContactPointUse#getValue()
	 * @see #getContactPointUse()
	 * @generated
	 */
	EAttribute getContactPointUse_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.hl7.fhir_patient.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement
	 * @generated
	 */
	EClass getDataRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getType()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getProfile()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Profile();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirement#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Codeable Concept</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getSubjectCodeableConcept()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_SubjectCodeableConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirement#getSubjectReference <em>Subject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Reference</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getSubjectReference()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_SubjectReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Must Support</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getMustSupport()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_MustSupport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getCodeFilter <em>Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getCodeFilter()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_CodeFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getDateFilter <em>Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getDateFilter()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_DateFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getValueFilter <em>Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getValueFilter()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_ValueFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirement#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getLimit()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Limit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirement#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort</em>'.
	 * @see org.hl7.fhir_patient.DataRequirement#getSort()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Sort();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataRequirementCodeFilter <em>Data Requirement Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Code Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementCodeFilter
	 * @generated
	 */
	EClass getDataRequirementCodeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementCodeFilter#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementCodeFilter#getPath()
	 * @see #getDataRequirementCodeFilter()
	 * @generated
	 */
	EReference getDataRequirementCodeFilter_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementCodeFilter#getSearchParam <em>Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Param</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementCodeFilter#getSearchParam()
	 * @see #getDataRequirementCodeFilter()
	 * @generated
	 */
	EReference getDataRequirementCodeFilter_SearchParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementCodeFilter#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementCodeFilter#getValueSet()
	 * @see #getDataRequirementCodeFilter()
	 * @generated
	 */
	EReference getDataRequirementCodeFilter_ValueSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DataRequirementCodeFilter#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementCodeFilter#getCode()
	 * @see #getDataRequirementCodeFilter()
	 * @generated
	 */
	EReference getDataRequirementCodeFilter_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataRequirementDateFilter <em>Data Requirement Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Date Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter
	 * @generated
	 */
	EClass getDataRequirementDateFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementDateFilter#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter#getPath()
	 * @see #getDataRequirementDateFilter()
	 * @generated
	 */
	EReference getDataRequirementDateFilter_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementDateFilter#getSearchParam <em>Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Param</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter#getSearchParam()
	 * @see #getDataRequirementDateFilter()
	 * @generated
	 */
	EReference getDataRequirementDateFilter_SearchParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementDateFilter#getValueDateTime <em>Value Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Date Time</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter#getValueDateTime()
	 * @see #getDataRequirementDateFilter()
	 * @generated
	 */
	EReference getDataRequirementDateFilter_ValueDateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementDateFilter#getValuePeriod <em>Value Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Period</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter#getValuePeriod()
	 * @see #getDataRequirementDateFilter()
	 * @generated
	 */
	EReference getDataRequirementDateFilter_ValuePeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementDateFilter#getValueDuration <em>Value Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Duration</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementDateFilter#getValueDuration()
	 * @see #getDataRequirementDateFilter()
	 * @generated
	 */
	EReference getDataRequirementDateFilter_ValueDuration();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataRequirementSort <em>Data Requirement Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Sort</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementSort
	 * @generated
	 */
	EClass getDataRequirementSort();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementSort#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementSort#getPath()
	 * @see #getDataRequirementSort()
	 * @generated
	 */
	EReference getDataRequirementSort_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementSort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementSort#getDirection()
	 * @see #getDataRequirementSort()
	 * @generated
	 */
	EReference getDataRequirementSort_Direction();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataRequirementValueFilter <em>Data Requirement Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Value Filter</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter
	 * @generated
	 */
	EClass getDataRequirementValueFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getPath()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getSearchParam <em>Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Param</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getSearchParam()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_SearchParam();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparator</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getComparator()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_Comparator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getValueDateTime <em>Value Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Date Time</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getValueDateTime()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_ValueDateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getValuePeriod <em>Value Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Period</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getValuePeriod()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_ValuePeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DataRequirementValueFilter#getValueDuration <em>Value Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Duration</em>'.
	 * @see org.hl7.fhir_patient.DataRequirementValueFilter#getValueDuration()
	 * @see #getDataRequirementValueFilter()
	 * @generated
	 */
	EReference getDataRequirementValueFilter_ValueDuration();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.hl7.fhir_patient.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see org.hl7.fhir_patient.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Date#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Date#getValue()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.hl7.fhir_patient.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.DateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.DateTime#getValue()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see org.hl7.fhir_patient.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Decimal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Decimal#getValue()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see org.hl7.fhir_patient.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Resource</em>'.
	 * @see org.hl7.fhir_patient.DomainResource
	 * @generated
	 */
	EClass getDomainResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DomainResource#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.DomainResource#getText()
	 * @see #getDomainResource()
	 * @generated
	 */
	EReference getDomainResource_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DomainResource#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.hl7.fhir_patient.DomainResource#getExtension()
	 * @see #getDomainResource()
	 * @generated
	 */
	EReference getDomainResource_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.DomainResource#getModifierExtension <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier Extension</em>'.
	 * @see org.hl7.fhir_patient.DomainResource#getModifierExtension()
	 * @see #getDomainResource()
	 * @generated
	 */
	EReference getDomainResource_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Dosage <em>Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dosage</em>'.
	 * @see org.hl7.fhir_patient.Dosage
	 * @generated
	 */
	EClass getDosage();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getSequence()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getText()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Dosage#getAdditionalInstruction <em>Additional Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instruction</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getAdditionalInstruction()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_AdditionalInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getPatientInstruction <em>Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient Instruction</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getPatientInstruction()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_PatientInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getTiming()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Timing();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getAsNeeded <em>As Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As Needed</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getAsNeeded()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_AsNeeded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Dosage#getAsNeededFor <em>As Needed For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>As Needed For</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getAsNeededFor()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_AsNeededFor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getSite()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Site();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getRoute()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Route();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getMethod()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Dosage#getDoseAndRate <em>Dose And Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dose And Rate</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getDoseAndRate()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_DoseAndRate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Dosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Dose Per Period</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getMaxDosePerPeriod()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Per Administration</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getMaxDosePerAdministration()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerAdministration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Per Lifetime</em>'.
	 * @see org.hl7.fhir_patient.Dosage#getMaxDosePerLifetime()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerLifetime();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.DosageDoseAndRate <em>Dosage Dose And Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dosage Dose And Rate</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate
	 * @generated
	 */
	EClass getDosageDoseAndRate();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getType()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getDoseRange <em>Dose Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dose Range</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getDoseRange()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_DoseRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getDoseQuantity <em>Dose Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dose Quantity</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getDoseQuantity()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_DoseQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getRateRatio <em>Rate Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate Ratio</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getRateRatio()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_RateRatio();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getRateRange <em>Rate Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate Range</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getRateRange()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_RateRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.DosageDoseAndRate#getRateQuantity <em>Rate Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate Quantity</em>'.
	 * @see org.hl7.fhir_patient.DosageDoseAndRate#getRateQuantity()
	 * @see #getDosageDoseAndRate()
	 * @generated
	 */
	EReference getDosageDoseAndRate_RateQuantity();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.hl7.fhir_patient.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.hl7.fhir_patient.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Element#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.hl7.fhir_patient.Element#getExtension()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hl7.fhir_patient.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.EventTiming <em>Event Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Timing</em>'.
	 * @see org.hl7.fhir_patient.EventTiming
	 * @generated
	 */
	EClass getEventTiming();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.EventTiming#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.EventTiming#getValue()
	 * @see #getEventTiming()
	 * @generated
	 */
	EAttribute getEventTiming_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.hl7.fhir_patient.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Expression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.fhir_patient.Expression#getDescription()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.fhir_patient.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Language();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.fhir_patient.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Expression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.hl7.fhir_patient.Expression#getReference()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Reference();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ExtendedContactDetail <em>Extended Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Contact Detail</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail
	 * @generated
	 */
	EClass getExtendedContactDetail();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ExtendedContactDetail#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getPurpose()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.ExtendedContactDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getName()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.ExtendedContactDetail#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getTelecom()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ExtendedContactDetail#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getAddress()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ExtendedContactDetail#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getOrganization()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ExtendedContactDetail#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.ExtendedContactDetail#getPeriod()
	 * @see #getExtendedContactDetail()
	 * @generated
	 */
	EReference getExtendedContactDetail_Period();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.hl7.fhir_patient.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueBase64Binary <em>Value Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Base64 Binary</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueBase64Binary()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueBase64Binary();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueBoolean <em>Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Boolean</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueBoolean()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCanonical <em>Value Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Canonical</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCanonical()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCanonical();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCode <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Code</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCode()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDate <em>Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Date</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDate()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDateTime <em>Value Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Date Time</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDateTime()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDecimal <em>Value Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Decimal</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDecimal()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDecimal();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueId()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueInstant <em>Value Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Instant</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueInstant()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueInstant();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueInteger <em>Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Integer</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueInteger()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueInteger();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueInteger64 <em>Value Integer64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Integer64</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueInteger64()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueInteger64();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueMarkdown <em>Value Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Markdown</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueMarkdown()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueMarkdown();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueOid <em>Value Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Oid</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueOid()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueOid();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValuePositiveInt <em>Value Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Positive Int</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValuePositiveInt()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValuePositiveInt();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value String</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueString()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueString();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueTime <em>Value Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Time</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueTime()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueUnsignedInt <em>Value Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Unsigned Int</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueUnsignedInt()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueUnsignedInt();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueUri <em>Value Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Uri</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueUri()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueUri();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueUrl <em>Value Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Url</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueUuid <em>Value Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Uuid</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueUuid()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueUuid();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueAddress <em>Value Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Address</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueAddress()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueAge <em>Value Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Age</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueAge()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueAge();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueAnnotation <em>Value Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Annotation</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueAnnotation()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueAttachment <em>Value Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Attachment</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueAttachment()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueAttachment();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCodeableConcept <em>Value Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Codeable Concept</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCodeableConcept()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCodeableConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCodeableReference <em>Value Codeable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Codeable Reference</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCodeableReference()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCodeableReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCoding <em>Value Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Coding</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCoding()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueContactPoint <em>Value Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Contact Point</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueContactPoint()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueContactPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueCount <em>Value Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Count</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueCount()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDistance <em>Value Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Distance</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDistance()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDistance();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDuration <em>Value Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Duration</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDuration()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueHumanName <em>Value Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Human Name</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueHumanName()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueHumanName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueIdentifier <em>Value Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Identifier</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueIdentifier()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueMoney <em>Value Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Money</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueMoney()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueMoney();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValuePeriod <em>Value Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Period</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValuePeriod()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValuePeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueQuantity()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Range</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueRange()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueRatio <em>Value Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Ratio</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueRatio()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueRatio();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueRatioRange <em>Value Ratio Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Ratio Range</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueRatioRange()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueRatioRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Reference</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueReference()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueSampledData <em>Value Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Sampled Data</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueSampledData()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueSampledData();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueSignature <em>Value Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Signature</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueSignature()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueSignature();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueTiming <em>Value Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Timing</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueTiming()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueTiming();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueContactDetail <em>Value Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Contact Detail</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueContactDetail()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueContactDetail();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDataRequirement <em>Value Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Data Requirement</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDataRequirement()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDataRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueExpression()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueParameterDefinition <em>Value Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Parameter Definition</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueParameterDefinition()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueParameterDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueRelatedArtifact <em>Value Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Related Artifact</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueRelatedArtifact()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueRelatedArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueTriggerDefinition <em>Value Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Trigger Definition</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueTriggerDefinition()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueTriggerDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueUsageContext <em>Value Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Usage Context</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueUsageContext()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueUsageContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueAvailability <em>Value Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Availability</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueAvailability()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueAvailability();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueExtendedContactDetail <em>Value Extended Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Extended Contact Detail</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueExtendedContactDetail()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueExtendedContactDetail();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueDosage <em>Value Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Dosage</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueDosage()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueDosage();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Extension#getValueMeta <em>Value Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Meta</em>'.
	 * @see org.hl7.fhir_patient.Extension#getValueMeta()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ValueMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.hl7.fhir_patient.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Url();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Verb</em>'.
	 * @see org.hl7.fhir_patient.HTTPVerb
	 * @generated
	 */
	EClass getHTTPVerb();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.HTTPVerb#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.HTTPVerb#getValue()
	 * @see #getHTTPVerb()
	 * @generated
	 */
	EAttribute getHTTPVerb_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Name</em>'.
	 * @see org.hl7.fhir_patient.HumanName
	 * @generated
	 */
	EClass getHumanName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.HumanName#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getUse()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.HumanName#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getText()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.HumanName#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Family</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getFamily()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Family();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.HumanName#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getGiven()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Given();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.HumanName#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prefix</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getPrefix()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.HumanName#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suffix</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getSuffix()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Suffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.HumanName#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.HumanName#getPeriod()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Period();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.hl7.fhir_patient.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Id#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Id#getValue()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.hl7.fhir_patient.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getUse()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getSystem()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getValue()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getPeriod()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Identifier#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigner</em>'.
	 * @see org.hl7.fhir_patient.Identifier#getAssigner()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Assigner();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.IdentifierUse <em>Identifier Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Use</em>'.
	 * @see org.hl7.fhir_patient.IdentifierUse
	 * @generated
	 */
	EClass getIdentifierUse();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.IdentifierUse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.IdentifierUse#getValue()
	 * @see #getIdentifierUse()
	 * @generated
	 */
	EAttribute getIdentifierUse_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see org.hl7.fhir_patient.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Instant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Instant#getValue()
	 * @see #getInstant()
	 * @generated
	 */
	EAttribute getInstant_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.hl7.fhir_patient.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Integer64 <em>Integer64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer64</em>'.
	 * @see org.hl7.fhir_patient.Integer64
	 * @generated
	 */
	EClass getInteger64();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Integer64#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Integer64#getValue()
	 * @see #getInteger64()
	 * @generated
	 */
	EAttribute getInteger64_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.LinkRelationTypes <em>Link Relation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Relation Types</em>'.
	 * @see org.hl7.fhir_patient.LinkRelationTypes
	 * @generated
	 */
	EClass getLinkRelationTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.LinkRelationTypes#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.LinkRelationTypes#getValue()
	 * @see #getLinkRelationTypes()
	 * @generated
	 */
	EAttribute getLinkRelationTypes_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see org.hl7.fhir_patient.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.LinkType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.LinkType#getValue()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown</em>'.
	 * @see org.hl7.fhir_patient.Markdown
	 * @generated
	 */
	EClass getMarkdown();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Markdown#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Markdown#getValue()
	 * @see #getMarkdown()
	 * @generated
	 */
	EAttribute getMarkdown_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.hl7.fhir_patient.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Meta#getVersionId <em>Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Id</em>'.
	 * @see org.hl7.fhir_patient.Meta#getVersionId()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_VersionId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Meta#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Updated</em>'.
	 * @see org.hl7.fhir_patient.Meta#getLastUpdated()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_LastUpdated();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Meta#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.fhir_patient.Meta#getSource()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Meta#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see org.hl7.fhir_patient.Meta#getProfile()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Profile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Meta#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see org.hl7.fhir_patient.Meta#getSecurity()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Meta#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see org.hl7.fhir_patient.Meta#getTag()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Tag();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money</em>'.
	 * @see org.hl7.fhir_patient.Money
	 * @generated
	 */
	EClass getMoney();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Money#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Money#getValue()
	 * @see #getMoney()
	 * @generated
	 */
	EReference getMoney_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Money#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see org.hl7.fhir_patient.Money#getCurrency()
	 * @see #getMoney()
	 * @generated
	 */
	EReference getMoney_Currency();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.NameUse <em>Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Use</em>'.
	 * @see org.hl7.fhir_patient.NameUse
	 * @generated
	 */
	EClass getNameUse();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.NameUse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.NameUse#getValue()
	 * @see #getNameUse()
	 * @generated
	 */
	EAttribute getNameUse_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative</em>'.
	 * @see org.hl7.fhir_patient.Narrative
	 * @generated
	 */
	EClass getNarrative();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Narrative#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.hl7.fhir_patient.Narrative#getStatus()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Narrative#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.hl7.fhir_patient.Narrative#getDiv()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Div();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.NarrativeStatus <em>Narrative Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative Status</em>'.
	 * @see org.hl7.fhir_patient.NarrativeStatus
	 * @generated
	 */
	EClass getNarrativeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.NarrativeStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.NarrativeStatus#getValue()
	 * @see #getNarrativeStatus()
	 * @generated
	 */
	EAttribute getNarrativeStatus_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oid</em>'.
	 * @see org.hl7.fhir_patient.Oid
	 * @generated
	 */
	EClass getOid();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Oid#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Oid#getValue()
	 * @see #getOid()
	 * @generated
	 */
	EAttribute getOid_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getName()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getUse()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getMin()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Min();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getMax()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Max();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getDocumentation()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getType()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.ParameterDefinition#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see org.hl7.fhir_patient.ParameterDefinition#getProfile()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Profile();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see org.hl7.fhir_patient.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.fhir_patient.Patient#getIdentifier()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see org.hl7.fhir_patient.Patient#getActive()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Active();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.Patient#getName()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.hl7.fhir_patient.Patient#getTelecom()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gender</em>'.
	 * @see org.hl7.fhir_patient.Patient#getGender()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Gender();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Date</em>'.
	 * @see org.hl7.fhir_patient.Patient#getBirthDate()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_BirthDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getDeceasedBoolean <em>Deceased Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deceased Boolean</em>'.
	 * @see org.hl7.fhir_patient.Patient#getDeceasedBoolean()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_DeceasedBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getDeceasedDateTime <em>Deceased Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deceased Date Time</em>'.
	 * @see org.hl7.fhir_patient.Patient#getDeceasedDateTime()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_DeceasedDateTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.hl7.fhir_patient.Patient#getAddress()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getMaritalStatus <em>Marital Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marital Status</em>'.
	 * @see org.hl7.fhir_patient.Patient#getMaritalStatus()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_MaritalStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getMultipleBirthBoolean <em>Multiple Birth Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiple Birth Boolean</em>'.
	 * @see org.hl7.fhir_patient.Patient#getMultipleBirthBoolean()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_MultipleBirthBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getMultipleBirthInteger <em>Multiple Birth Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiple Birth Integer</em>'.
	 * @see org.hl7.fhir_patient.Patient#getMultipleBirthInteger()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_MultipleBirthInteger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getPhoto <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Photo</em>'.
	 * @see org.hl7.fhir_patient.Patient#getPhoto()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Photo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.hl7.fhir_patient.Patient#getContact()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Contact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication</em>'.
	 * @see org.hl7.fhir_patient.Patient#getCommunication()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Communication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getGeneralPractitioner <em>General Practitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Practitioner</em>'.
	 * @see org.hl7.fhir_patient.Patient#getGeneralPractitioner()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_GeneralPractitioner();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Patient#getManagingOrganization <em>Managing Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Managing Organization</em>'.
	 * @see org.hl7.fhir_patient.Patient#getManagingOrganization()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_ManagingOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Patient#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.hl7.fhir_patient.Patient#getLink()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Patient#getFakeId <em>Fake Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fake Id</em>'.
	 * @see org.hl7.fhir_patient.Patient#getFakeId()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_FakeId();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.PatientCommunication <em>Patient Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Communication</em>'.
	 * @see org.hl7.fhir_patient.PatientCommunication
	 * @generated
	 */
	EClass getPatientCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientCommunication#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.fhir_patient.PatientCommunication#getLanguage()
	 * @see #getPatientCommunication()
	 * @generated
	 */
	EReference getPatientCommunication_Language();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientCommunication#getPreferred <em>Preferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred</em>'.
	 * @see org.hl7.fhir_patient.PatientCommunication#getPreferred()
	 * @see #getPatientCommunication()
	 * @generated
	 */
	EReference getPatientCommunication_Preferred();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.PatientContact <em>Patient Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Contact</em>'.
	 * @see org.hl7.fhir_patient.PatientContact
	 * @generated
	 */
	EClass getPatientContact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.PatientContact#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getRelationship()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientContact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getName()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.PatientContact#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getTelecom()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientContact#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getAddress()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientContact#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gender</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getGender()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Gender();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientContact#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getOrganization()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientContact#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.PatientContact#getPeriod()
	 * @see #getPatientContact()
	 * @generated
	 */
	EReference getPatientContact_Period();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.PatientLink <em>Patient Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Link</em>'.
	 * @see org.hl7.fhir_patient.PatientLink
	 * @generated
	 */
	EClass getPatientLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientLink#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other</em>'.
	 * @see org.hl7.fhir_patient.PatientLink#getOther()
	 * @see #getPatientLink()
	 * @generated
	 */
	EReference getPatientLink_Other();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.PatientLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.PatientLink#getType()
	 * @see #getPatientLink()
	 * @generated
	 */
	EReference getPatientLink_Type();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.hl7.fhir_patient.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.hl7.fhir_patient.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Int</em>'.
	 * @see org.hl7.fhir_patient.PositiveInt
	 * @generated
	 */
	EClass getPositiveInt();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.PositiveInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.PositiveInt#getValue()
	 * @see #getPositiveInt()
	 * @generated
	 */
	EAttribute getPositiveInt_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.hl7.fhir_patient.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Quantity#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparator</em>'.
	 * @see org.hl7.fhir_patient.Quantity#getComparator()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Comparator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.hl7.fhir_patient.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Quantity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.fhir_patient.Quantity#getSystem()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Quantity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.Quantity#getCode()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.QuantityComparator <em>Quantity Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Comparator</em>'.
	 * @see org.hl7.fhir_patient.QuantityComparator
	 * @generated
	 */
	EClass getQuantityComparator();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.QuantityComparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.QuantityComparator#getValue()
	 * @see #getQuantityComparator()
	 * @generated
	 */
	EAttribute getQuantityComparator_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.hl7.fhir_patient.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Range#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.fhir_patient.Range#getLow()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Range#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.fhir_patient.Range#getHigh()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_High();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see org.hl7.fhir_patient.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Ratio#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see org.hl7.fhir_patient.Ratio#getNumerator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Ratio#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.hl7.fhir_patient.Ratio#getDenominator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Denominator();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.RatioRange <em>Ratio Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Range</em>'.
	 * @see org.hl7.fhir_patient.RatioRange
	 * @generated
	 */
	EClass getRatioRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RatioRange#getLowNumerator <em>Low Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low Numerator</em>'.
	 * @see org.hl7.fhir_patient.RatioRange#getLowNumerator()
	 * @see #getRatioRange()
	 * @generated
	 */
	EReference getRatioRange_LowNumerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RatioRange#getHighNumerator <em>High Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High Numerator</em>'.
	 * @see org.hl7.fhir_patient.RatioRange#getHighNumerator()
	 * @see #getRatioRange()
	 * @generated
	 */
	EReference getRatioRange_HighNumerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RatioRange#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.hl7.fhir_patient.RatioRange#getDenominator()
	 * @see #getRatioRange()
	 * @generated
	 */
	EReference getRatioRange_Denominator();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.hl7.fhir_patient.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.hl7.fhir_patient.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Reference#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.fhir_patient.Reference#getIdentifier()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Reference#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see org.hl7.fhir_patient.Reference#getDisplay()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Display();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Artifact</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact
	 * @generated
	 */
	EClass getRelatedArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getType()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.RelatedArtifact#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getClassifier()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getLabel()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getDisplay()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Display();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getCitation()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Citation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getDocument()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Document();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getResource()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Reference</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getResourceReference()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_ResourceReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getPublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication Status</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getPublicationStatus()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_PublicationStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.RelatedArtifact#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication Date</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifact#getPublicationDate()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_PublicationDate();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.RelatedArtifactType <em>Related Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Artifact Type</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifactType
	 * @generated
	 */
	EClass getRelatedArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.RelatedArtifactType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifactType#getValue()
	 * @see #getRelatedArtifactType()
	 * @generated
	 */
	EAttribute getRelatedArtifactType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.hl7.fhir_patient.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Resource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.hl7.fhir_patient.Resource#getId()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Resource#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.hl7.fhir_patient.Resource#getMeta()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Resource#getImplicitRules <em>Implicit Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Rules</em>'.
	 * @see org.hl7.fhir_patient.Resource#getImplicitRules()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ImplicitRules();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Resource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.fhir_patient.Resource#getLanguage()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Language();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Data</em>'.
	 * @see org.hl7.fhir_patient.SampledData
	 * @generated
	 */
	EClass getSampledData();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getOrigin()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getInterval()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getIntervalUnit <em>Interval Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval Unit</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getIntervalUnit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_IntervalUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factor</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getFactor()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Factor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getLowerLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_LowerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getUpperLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_UpperLimit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimensions</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getDimensions()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getCodeMap <em>Code Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Map</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getCodeMap()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_CodeMap();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getOffsets <em>Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offsets</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getOffsets()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Offsets();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.SampledData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.hl7.fhir_patient.SampledData#getData()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Data();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.SampledDataDataType <em>Sampled Data Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Data Data Type</em>'.
	 * @see org.hl7.fhir_patient.SampledDataDataType
	 * @generated
	 */
	EClass getSampledDataDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.SampledDataDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.SampledDataDataType#getValue()
	 * @see #getSampledDataDataType()
	 * @generated
	 */
	EAttribute getSampledDataDataType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.SearchEntryMode <em>Search Entry Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Entry Mode</em>'.
	 * @see org.hl7.fhir_patient.SearchEntryMode
	 * @generated
	 */
	EClass getSearchEntryMode();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.SearchEntryMode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.SearchEntryMode#getValue()
	 * @see #getSearchEntryMode()
	 * @generated
	 */
	EAttribute getSearchEntryMode_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see org.hl7.fhir_patient.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Signature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.Signature#getType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see org.hl7.fhir_patient.Signature#getWhen()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_When();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Who</em>'.
	 * @see org.hl7.fhir_patient.Signature#getWho()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Who();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getOnBehalfOf <em>On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Behalf Of</em>'.
	 * @see org.hl7.fhir_patient.Signature#getOnBehalfOf()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_OnBehalfOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getTargetFormat <em>Target Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Format</em>'.
	 * @see org.hl7.fhir_patient.Signature#getTargetFormat()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_TargetFormat();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getSigFormat <em>Sig Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sig Format</em>'.
	 * @see org.hl7.fhir_patient.Signature#getSigFormat()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_SigFormat();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Signature#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.hl7.fhir_patient.Signature#getData()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Data();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Direction</em>'.
	 * @see org.hl7.fhir_patient.SortDirection
	 * @generated
	 */
	EClass getSortDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.SortDirection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.SortDirection#getValue()
	 * @see #getSortDirection()
	 * @generated
	 */
	EAttribute getSortDirection_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.hl7.fhir_patient.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.hl7.fhir_patient.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see org.hl7.fhir_patient.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.Timing#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see org.hl7.fhir_patient.Timing#getEvent()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Timing#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see org.hl7.fhir_patient.Timing#getRepeat()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.Timing#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.Timing#getCode()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.TimingRepeat <em>Timing Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Repeat</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat
	 * @generated
	 */
	EClass getTimingRepeat();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getBoundsDuration <em>Bounds Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds Duration</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getBoundsDuration()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_BoundsDuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getBoundsRange <em>Bounds Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds Range</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getBoundsRange()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_BoundsRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getBoundsPeriod <em>Bounds Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds Period</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getBoundsPeriod()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_BoundsPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getCount()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Count();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getCountMax <em>Count Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Max</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getCountMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_CountMax();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getDuration()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getDurationMax <em>Duration Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Max</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getDurationMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_DurationMax();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getDurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Unit</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getDurationUnit()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_DurationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getFrequency()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Frequency();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency Max</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getFrequencyMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_FrequencyMax();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getPeriod()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getPeriodMax <em>Period Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Max</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getPeriodMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_PeriodMax();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getPeriodUnit <em>Period Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Unit</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getPeriodUnit()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_PeriodUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.TimingRepeat#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Day Of Week</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getDayOfWeek()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_DayOfWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.TimingRepeat#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getTimeOfDay()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_TimeOfDay();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.TimingRepeat#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getWhen()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_When();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TimingRepeat#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.hl7.fhir_patient.TimingRepeat#getOffset()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Offset();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Definition</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition
	 * @generated
	 */
	EClass getTriggerDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getType()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getName()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getCode()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getSubscriptionTopic <em>Subscription Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription Topic</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getSubscriptionTopic()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_SubscriptionTopic();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getTimingTiming <em>Timing Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Timing</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getTimingTiming()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_TimingTiming();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getTimingReference <em>Timing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Reference</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getTimingReference()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_TimingReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getTimingDate <em>Timing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Date</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getTimingDate()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_TimingDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getTimingDateTime <em>Timing Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Date Time</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getTimingDateTime()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_TimingDateTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.fhir_patient.TriggerDefinition#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getData()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.TriggerDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.hl7.fhir_patient.TriggerDefinition#getCondition()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Condition();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Type</em>'.
	 * @see org.hl7.fhir_patient.TriggerType
	 * @generated
	 */
	EClass getTriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.TriggerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.TriggerType#getValue()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.UnitsOfTime <em>Units Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Units Of Time</em>'.
	 * @see org.hl7.fhir_patient.UnitsOfTime
	 * @generated
	 */
	EClass getUnitsOfTime();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.UnitsOfTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.UnitsOfTime#getValue()
	 * @see #getUnitsOfTime()
	 * @generated
	 */
	EAttribute getUnitsOfTime_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Int</em>'.
	 * @see org.hl7.fhir_patient.UnsignedInt
	 * @generated
	 */
	EClass getUnsignedInt();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.UnsignedInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.UnsignedInt#getValue()
	 * @see #getUnsignedInt()
	 * @generated
	 */
	EAttribute getUnsignedInt_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see org.hl7.fhir_patient.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Uri#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Uri#getValue()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see org.hl7.fhir_patient.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Url#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Url#getValue()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Context</em>'.
	 * @see org.hl7.fhir_patient.UsageContext
	 * @generated
	 */
	EClass getUsageContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.UsageContext#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.fhir_patient.UsageContext#getCode()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.UsageContext#getValueCodeableConcept <em>Value Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Codeable Concept</em>'.
	 * @see org.hl7.fhir_patient.UsageContext#getValueCodeableConcept()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueCodeableConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.UsageContext#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see org.hl7.fhir_patient.UsageContext#getValueQuantity()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.UsageContext#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Range</em>'.
	 * @see org.hl7.fhir_patient.UsageContext#getValueRange()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.fhir_patient.UsageContext#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Reference</em>'.
	 * @see org.hl7.fhir_patient.UsageContext#getValueReference()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueReference();

	/**
	 * Returns the meta object for class '{@link org.hl7.fhir_patient.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid</em>'.
	 * @see org.hl7.fhir_patient.Uuid
	 * @generated
	 */
	EClass getUuid();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.fhir_patient.Uuid#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.fhir_patient.Uuid#getValue()
	 * @see #getUuid()
	 * @generated
	 */
	EAttribute getUuid_Value();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.AddressTypeEnum <em>Address Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type Enum</em>'.
	 * @see org.hl7.fhir_patient.AddressTypeEnum
	 * @generated
	 */
	EEnum getAddressTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.AddressUseEnum <em>Address Use Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Use Enum</em>'.
	 * @see org.hl7.fhir_patient.AddressUseEnum
	 * @generated
	 */
	EEnum getAddressUseEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.AdministrativeGenderEnum <em>Administrative Gender Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Administrative Gender Enum</em>'.
	 * @see org.hl7.fhir_patient.AdministrativeGenderEnum
	 * @generated
	 */
	EEnum getAdministrativeGenderEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.BundleTypeEnum <em>Bundle Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bundle Type Enum</em>'.
	 * @see org.hl7.fhir_patient.BundleTypeEnum
	 * @generated
	 */
	EEnum getBundleTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.ContactPointSystemEnum <em>Contact Point System Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point System Enum</em>'.
	 * @see org.hl7.fhir_patient.ContactPointSystemEnum
	 * @generated
	 */
	EEnum getContactPointSystemEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.ContactPointUseEnum <em>Contact Point Use Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point Use Enum</em>'.
	 * @see org.hl7.fhir_patient.ContactPointUseEnum
	 * @generated
	 */
	EEnum getContactPointUseEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.EventTimingEnum <em>Event Timing Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Timing Enum</em>'.
	 * @see org.hl7.fhir_patient.EventTimingEnum
	 * @generated
	 */
	EEnum getEventTimingEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.HTTPVerbEnum <em>HTTP Verb Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Verb Enum</em>'.
	 * @see org.hl7.fhir_patient.HTTPVerbEnum
	 * @generated
	 */
	EEnum getHTTPVerbEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.IdentifierUseEnum <em>Identifier Use Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Use Enum</em>'.
	 * @see org.hl7.fhir_patient.IdentifierUseEnum
	 * @generated
	 */
	EEnum getIdentifierUseEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.LinkRelationTypesEnum <em>Link Relation Types Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Relation Types Enum</em>'.
	 * @see org.hl7.fhir_patient.LinkRelationTypesEnum
	 * @generated
	 */
	EEnum getLinkRelationTypesEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.LinkTypeEnum <em>Link Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type Enum</em>'.
	 * @see org.hl7.fhir_patient.LinkTypeEnum
	 * @generated
	 */
	EEnum getLinkTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.NameUseEnum <em>Name Use Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Use Enum</em>'.
	 * @see org.hl7.fhir_patient.NameUseEnum
	 * @generated
	 */
	EEnum getNameUseEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.NarrativeStatusEnum <em>Narrative Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Narrative Status Enum</em>'.
	 * @see org.hl7.fhir_patient.NarrativeStatusEnum
	 * @generated
	 */
	EEnum getNarrativeStatusEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.QuantityComparatorEnum <em>Quantity Comparator Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantity Comparator Enum</em>'.
	 * @see org.hl7.fhir_patient.QuantityComparatorEnum
	 * @generated
	 */
	EEnum getQuantityComparatorEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.RelatedArtifactTypeEnum <em>Related Artifact Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Related Artifact Type Enum</em>'.
	 * @see org.hl7.fhir_patient.RelatedArtifactTypeEnum
	 * @generated
	 */
	EEnum getRelatedArtifactTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.SearchEntryModeEnum <em>Search Entry Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Entry Mode Enum</em>'.
	 * @see org.hl7.fhir_patient.SearchEntryModeEnum
	 * @generated
	 */
	EEnum getSearchEntryModeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.SortDirectionEnum <em>Sort Direction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction Enum</em>'.
	 * @see org.hl7.fhir_patient.SortDirectionEnum
	 * @generated
	 */
	EEnum getSortDirectionEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.TriggerTypeEnum <em>Trigger Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type Enum</em>'.
	 * @see org.hl7.fhir_patient.TriggerTypeEnum
	 * @generated
	 */
	EEnum getTriggerTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.hl7.fhir_patient.UnitsOfTimeEnum <em>Units Of Time Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Of Time Enum</em>'.
	 * @see org.hl7.fhir_patient.UnitsOfTimeEnum
	 * @generated
	 */
	EEnum getUnitsOfTimeEnum();

	/**
	 * Returns the meta object for data type '<em>Base64 Binary Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base64 Binary Primitive</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='base64Binary-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary' pattern='([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?'"
	 * @generated
	 */
	EDataType getBase64BinaryPrimitive();

	/**
	 * Returns the meta object for data type '<em>Boolean Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Primitive</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='boolean-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='true|false'"
	 * @generated
	 */
	EDataType getBooleanPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Primitive Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Primitive Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='boolean-primitive:Object' baseType='boolean-primitive'"
	 * @generated
	 */
	EDataType getBooleanPrimitiveObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Canonical Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Canonical Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='canonical-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1' pattern='\\S*'"
	 * @generated
	 */
	EDataType getCanonicalPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='code-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1' pattern='[^\\s]+(%20[^\\s]+)*'"
	 * @generated
	 */
	EDataType getCodePrimitive();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Primitive</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='date-primitive' baseType='date-primitive_._base' pattern='([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?'"
	 * @generated
	 */
	EDataType getDatePrimitive();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Primitive Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Primitive Base</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='date-primitive_._base' memberTypes='http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getDatePrimitiveBase();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Primitive</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateTime-primitive' baseType='dateTime-primitive_._base' pattern='([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?'"
	 * @generated
	 */
	EDataType getDateTimePrimitive();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Primitive Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Primitive Base</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateTime-primitive_._base' memberTypes='http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDateTimePrimitiveBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Decimal Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decimal Primitive</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='decimal-primitive' memberTypes='http://www.eclipse.org/emf/2003/XMLType#decimal http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getDecimalPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='id-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='64' pattern='[A-Za-z0-9\\-\\.]{1,64}'"
	 * @generated
	 */
	EDataType getIdPrimitive();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Instant Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instant Primitive</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='instant-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime' pattern='([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]{1,9})?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))'"
	 * @generated
	 */
	EDataType getInstantPrimitive();

	/**
	 * Returns the meta object for data type '<em>Integer64 Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer64 Primitive</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='integer64-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#long' pattern='[0]|[-+]?[1-9][0-9]*'"
	 * @generated
	 */
	EDataType getInteger64Primitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Integer64 Primitive Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer64 Primitive Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='integer64-primitive:Object' baseType='integer64-primitive'"
	 * @generated
	 */
	EDataType getInteger64PrimitiveObject();

	/**
	 * Returns the meta object for data type '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Primitive</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='integer-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#int' pattern='[0]|[-+]?[1-9][0-9]*'"
	 * @generated
	 */
	EDataType getIntegerPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer Primitive Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Primitive Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='integer-primitive:Object' baseType='integer-primitive'"
	 * @generated
	 */
	EDataType getIntegerPrimitiveObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Markdown Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Markdown Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='markdown-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' pattern='[\\s\\S]+'"
	 * @generated
	 */
	EDataType getMarkdownPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oid Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oid Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oid-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1' pattern='urn:oid:[0-2](\\.(0|[1-9][0-9]*))+'"
	 * @generated
	 */
	EDataType getOidPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Positive Int Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int Primitive</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='positiveInt-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' pattern='[1-9][0-9]*'"
	 * @generated
	 */
	EDataType getPositiveIntPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Sampled Data Data Type Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sampled Data Data Type Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SampledDataDataType-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])(%20((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*'"
	 * @generated
	 */
	EDataType getSampledDataDataTypePrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='string-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getStringPrimitive();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Primitive</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='time-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#time' pattern='([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?'"
	 * @generated
	 */
	EDataType getTimePrimitive();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Unsigned Int Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Int Primitive</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='unsignedInt-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='[0]|([1-9][0-9]*)'"
	 * @generated
	 */
	EDataType getUnsignedIntPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='uri-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='\\S*'"
	 * @generated
	 */
	EDataType getUriPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='url-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1' pattern='\\S*'"
	 * @generated
	 */
	EDataType getUrlPrimitive();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uuid Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uuid Primitive</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='uuid-primitive' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1' pattern='urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}'"
	 * @generated
	 */
	EDataType getUuidPrimitive();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fhir_PatientFactory getFhir_PatientFactory();

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
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AddressImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__USE = eINSTANCE.getAddress_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TEXT = eINSTANCE.getAddress_Text();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__LINE = eINSTANCE.getAddress_Line();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__DISTRICT = eINSTANCE.getAddress_District();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__PERIOD = eINSTANCE.getAddress_Period();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AddressTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__VALUE = eINSTANCE.getAddressType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AddressUseImpl <em>Address Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AddressUseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressUse()
		 * @generated
		 */
		EClass ADDRESS_USE = eINSTANCE.getAddressUse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_USE__VALUE = eINSTANCE.getAddressUse_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AdministrativeGenderImpl <em>Administrative Gender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AdministrativeGenderImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAdministrativeGender()
		 * @generated
		 */
		EClass ADMINISTRATIVE_GENDER = eINSTANCE.getAdministrativeGender();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_GENDER__VALUE = eINSTANCE.getAdministrativeGender_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AgeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AnnotationImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Author Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__AUTHOR_REFERENCE = eINSTANCE.getAnnotation_AuthorReference();

		/**
		 * The meta object literal for the '<em><b>Author String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__AUTHOR_STRING = eINSTANCE.getAnnotation_AuthorString();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TIME = eINSTANCE.getAnnotation_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AttachmentImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CONTENT_TYPE = eINSTANCE.getAttachment_ContentType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__LANGUAGE = eINSTANCE.getAttachment_Language();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__DATA = eINSTANCE.getAttachment_Data();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__URL = eINSTANCE.getAttachment_Url();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__HASH = eINSTANCE.getAttachment_Hash();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TITLE = eINSTANCE.getAttachment_Title();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CREATION = eINSTANCE.getAttachment_Creation();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__HEIGHT = eINSTANCE.getAttachment_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__WIDTH = eINSTANCE.getAttachment_Width();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__FRAMES = eINSTANCE.getAttachment_Frames();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__DURATION = eINSTANCE.getAttachment_Duration();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PAGES = eINSTANCE.getAttachment_Pages();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AvailabilityImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Available Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__AVAILABLE_TIME = eINSTANCE.getAvailability_AvailableTime();

		/**
		 * The meta object literal for the '<em><b>Not Available Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__NOT_AVAILABLE_TIME = eINSTANCE.getAvailability_NotAvailableTime();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AvailabilityAvailableTimeImpl <em>Availability Available Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AvailabilityAvailableTimeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailabilityAvailableTime()
		 * @generated
		 */
		EClass AVAILABILITY_AVAILABLE_TIME = eINSTANCE.getAvailabilityAvailableTime();

		/**
		 * The meta object literal for the '<em><b>Days Of Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK = eINSTANCE.getAvailabilityAvailableTime_DaysOfWeek();

		/**
		 * The meta object literal for the '<em><b>All Day</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_AVAILABLE_TIME__ALL_DAY = eINSTANCE.getAvailabilityAvailableTime_AllDay();

		/**
		 * The meta object literal for the '<em><b>Available Start Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME = eINSTANCE.getAvailabilityAvailableTime_AvailableStartTime();

		/**
		 * The meta object literal for the '<em><b>Available End Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME = eINSTANCE.getAvailabilityAvailableTime_AvailableEndTime();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.AvailabilityNotAvailableTimeImpl <em>Availability Not Available Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.AvailabilityNotAvailableTimeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAvailabilityNotAvailableTime()
		 * @generated
		 */
		EClass AVAILABILITY_NOT_AVAILABLE_TIME = eINSTANCE.getAvailabilityNotAvailableTime();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_NOT_AVAILABLE_TIME__DESCRIPTION = eINSTANCE.getAvailabilityNotAvailableTime_Description();

		/**
		 * The meta object literal for the '<em><b>During</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_NOT_AVAILABLE_TIME__DURING = eINSTANCE.getAvailabilityNotAvailableTime_During();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BackboneElementImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBackboneElement()
		 * @generated
		 */
		EClass BACKBONE_ELEMENT = eINSTANCE.getBackboneElement();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_ELEMENT__MODIFIER_EXTENSION = eINSTANCE.getBackboneElement_ModifierExtension();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BackboneTypeImpl <em>Backbone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BackboneTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBackboneType()
		 * @generated
		 */
		EClass BACKBONE_TYPE = eINSTANCE.getBackboneType();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_TYPE__MODIFIER_EXTENSION = eINSTANCE.getBackboneType_ModifierExtension();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BaseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Base64BinaryImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase64Binary()
		 * @generated
		 */
		EClass BASE64_BINARY = eINSTANCE.getBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__VALUE = eINSTANCE.getBase64Binary_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BinaryImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__CONTENT_TYPE = eINSTANCE.getBinary_ContentType();

		/**
		 * The meta object literal for the '<em><b>Security Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__SECURITY_CONTEXT = eINSTANCE.getBinary_SecurityContext();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__DATA = eINSTANCE.getBinary_Data();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BooleanImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__IDENTIFIER = eINSTANCE.getBundle_Identifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__TYPE = eINSTANCE.getBundle_Type();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__TIMESTAMP = eINSTANCE.getBundle_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__TOTAL = eINSTANCE.getBundle_Total();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__LINK = eINSTANCE.getBundle_Link();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__ENTRY = eINSTANCE.getBundle_Entry();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__SIGNATURE = eINSTANCE.getBundle_Signature();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleEntryImpl <em>Bundle Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleEntryImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleEntry()
		 * @generated
		 */
		EClass BUNDLE_ENTRY = eINSTANCE.getBundleEntry();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ENTRY__LINK = eINSTANCE.getBundleEntry_Link();

		/**
		 * The meta object literal for the '<em><b>Full Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ENTRY__FULL_URL = eINSTANCE.getBundleEntry_FullUrl();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ENTRY__SEARCH = eINSTANCE.getBundleEntry_Search();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ENTRY__REQUEST = eINSTANCE.getBundleEntry_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ENTRY__RESPONSE = eINSTANCE.getBundleEntry_Response();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleLinkImpl <em>Bundle Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleLinkImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleLink()
		 * @generated
		 */
		EClass BUNDLE_LINK = eINSTANCE.getBundleLink();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_LINK__RELATION = eINSTANCE.getBundleLink_Relation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_LINK__URL = eINSTANCE.getBundleLink_Url();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleRequestImpl <em>Bundle Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleRequestImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleRequest()
		 * @generated
		 */
		EClass BUNDLE_REQUEST = eINSTANCE.getBundleRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__METHOD = eINSTANCE.getBundleRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__URL = eINSTANCE.getBundleRequest_Url();

		/**
		 * The meta object literal for the '<em><b>If None Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__IF_NONE_MATCH = eINSTANCE.getBundleRequest_IfNoneMatch();

		/**
		 * The meta object literal for the '<em><b>If Modified Since</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__IF_MODIFIED_SINCE = eINSTANCE.getBundleRequest_IfModifiedSince();

		/**
		 * The meta object literal for the '<em><b>If Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__IF_MATCH = eINSTANCE.getBundleRequest_IfMatch();

		/**
		 * The meta object literal for the '<em><b>If None Exist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_REQUEST__IF_NONE_EXIST = eINSTANCE.getBundleRequest_IfNoneExist();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleResponseImpl <em>Bundle Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleResponseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleResponse()
		 * @generated
		 */
		EClass BUNDLE_RESPONSE = eINSTANCE.getBundleResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_RESPONSE__STATUS = eINSTANCE.getBundleResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_RESPONSE__LOCATION = eINSTANCE.getBundleResponse_Location();

		/**
		 * The meta object literal for the '<em><b>Etag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_RESPONSE__ETAG = eINSTANCE.getBundleResponse_Etag();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_RESPONSE__LAST_MODIFIED = eINSTANCE.getBundleResponse_LastModified();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleSearchImpl <em>Bundle Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleSearchImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleSearch()
		 * @generated
		 */
		EClass BUNDLE_SEARCH = eINSTANCE.getBundleSearch();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_SEARCH__MODE = eINSTANCE.getBundleSearch_Mode();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_SEARCH__SCORE = eINSTANCE.getBundleSearch_Score();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.BundleTypeImpl <em>Bundle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.BundleTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleType()
		 * @generated
		 */
		EClass BUNDLE_TYPE = eINSTANCE.getBundleType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_TYPE__VALUE = eINSTANCE.getBundleType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CanonicalImpl <em>Canonical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CanonicalImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCanonical()
		 * @generated
		 */
		EClass CANONICAL = eINSTANCE.getCanonical();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANONICAL__VALUE = eINSTANCE.getCanonical_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CodeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__VALUE = eINSTANCE.getCode_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CodeableConceptImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodeableConcept()
		 * @generated
		 */
		EClass CODEABLE_CONCEPT = eINSTANCE.getCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__CODING = eINSTANCE.getCodeableConcept_Coding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__TEXT = eINSTANCE.getCodeableConcept_Text();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CodeableReferenceImpl <em>Codeable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CodeableReferenceImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodeableReference()
		 * @generated
		 */
		EClass CODEABLE_REFERENCE = eINSTANCE.getCodeableReference();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_REFERENCE__CONCEPT = eINSTANCE.getCodeableReference_Concept();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_REFERENCE__REFERENCE = eINSTANCE.getCodeableReference_Reference();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CodingImpl <em>Coding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CodingImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCoding()
		 * @generated
		 */
		EClass CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__SYSTEM = eINSTANCE.getCoding_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__VERSION = eINSTANCE.getCoding_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__CODE = eINSTANCE.getCoding_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__DISPLAY = eINSTANCE.getCoding_Display();

		/**
		 * The meta object literal for the '<em><b>User Selected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__USER_SELECTED = eINSTANCE.getCoding_UserSelected();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ContactDetailImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactDetail()
		 * @generated
		 */
		EClass CONTACT_DETAIL = eINSTANCE.getContactDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__NAME = eINSTANCE.getContactDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__TELECOM = eINSTANCE.getContactDetail_Telecom();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ContactPointImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__SYSTEM = eINSTANCE.getContactPoint_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__VALUE = eINSTANCE.getContactPoint_Value();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__USE = eINSTANCE.getContactPoint_Use();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__RANK = eINSTANCE.getContactPoint_Rank();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__PERIOD = eINSTANCE.getContactPoint_Period();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ContactPointSystemImpl <em>Contact Point System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ContactPointSystemImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointSystem()
		 * @generated
		 */
		EClass CONTACT_POINT_SYSTEM = eINSTANCE.getContactPointSystem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT_SYSTEM__VALUE = eINSTANCE.getContactPointSystem_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ContactPointUseImpl <em>Contact Point Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ContactPointUseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointUse()
		 * @generated
		 */
		EClass CONTACT_POINT_USE = eINSTANCE.getContactPointUse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT_USE__VALUE = eINSTANCE.getContactPointUse_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.CountImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataRequirementImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirement()
		 * @generated
		 */
		EClass DATA_REQUIREMENT = eINSTANCE.getDataRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__TYPE = eINSTANCE.getDataRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__PROFILE = eINSTANCE.getDataRequirement_Profile();

		/**
		 * The meta object literal for the '<em><b>Subject Codeable Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__SUBJECT_CODEABLE_CONCEPT = eINSTANCE.getDataRequirement_SubjectCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Subject Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__SUBJECT_REFERENCE = eINSTANCE.getDataRequirement_SubjectReference();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__MUST_SUPPORT = eINSTANCE.getDataRequirement_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Code Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__CODE_FILTER = eINSTANCE.getDataRequirement_CodeFilter();

		/**
		 * The meta object literal for the '<em><b>Date Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__DATE_FILTER = eINSTANCE.getDataRequirement_DateFilter();

		/**
		 * The meta object literal for the '<em><b>Value Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__VALUE_FILTER = eINSTANCE.getDataRequirement_ValueFilter();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__LIMIT = eINSTANCE.getDataRequirement_Limit();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__SORT = eINSTANCE.getDataRequirement_Sort();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl <em>Data Requirement Code Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataRequirementCodeFilterImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementCodeFilter()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_CODE_FILTER = eINSTANCE.getDataRequirementCodeFilter();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_CODE_FILTER__PATH = eINSTANCE.getDataRequirementCodeFilter_Path();

		/**
		 * The meta object literal for the '<em><b>Search Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_CODE_FILTER__SEARCH_PARAM = eINSTANCE.getDataRequirementCodeFilter_SearchParam();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_CODE_FILTER__VALUE_SET = eINSTANCE.getDataRequirementCodeFilter_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_CODE_FILTER__CODE = eINSTANCE.getDataRequirementCodeFilter_Code();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataRequirementDateFilterImpl <em>Data Requirement Date Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataRequirementDateFilterImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementDateFilter()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_DATE_FILTER = eINSTANCE.getDataRequirementDateFilter();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_DATE_FILTER__PATH = eINSTANCE.getDataRequirementDateFilter_Path();

		/**
		 * The meta object literal for the '<em><b>Search Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_DATE_FILTER__SEARCH_PARAM = eINSTANCE.getDataRequirementDateFilter_SearchParam();

		/**
		 * The meta object literal for the '<em><b>Value Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_DATE_FILTER__VALUE_DATE_TIME = eINSTANCE.getDataRequirementDateFilter_ValueDateTime();

		/**
		 * The meta object literal for the '<em><b>Value Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_DATE_FILTER__VALUE_PERIOD = eINSTANCE.getDataRequirementDateFilter_ValuePeriod();

		/**
		 * The meta object literal for the '<em><b>Value Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_DATE_FILTER__VALUE_DURATION = eINSTANCE.getDataRequirementDateFilter_ValueDuration();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataRequirementSortImpl <em>Data Requirement Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataRequirementSortImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementSort()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_SORT = eINSTANCE.getDataRequirementSort();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_SORT__PATH = eINSTANCE.getDataRequirementSort_Path();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_SORT__DIRECTION = eINSTANCE.getDataRequirementSort_Direction();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataRequirementValueFilterImpl <em>Data Requirement Value Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataRequirementValueFilterImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataRequirementValueFilter()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_VALUE_FILTER = eINSTANCE.getDataRequirementValueFilter();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__PATH = eINSTANCE.getDataRequirementValueFilter_Path();

		/**
		 * The meta object literal for the '<em><b>Search Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__SEARCH_PARAM = eINSTANCE.getDataRequirementValueFilter_SearchParam();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__COMPARATOR = eINSTANCE.getDataRequirementValueFilter_Comparator();

		/**
		 * The meta object literal for the '<em><b>Value Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__VALUE_DATE_TIME = eINSTANCE.getDataRequirementValueFilter_ValueDateTime();

		/**
		 * The meta object literal for the '<em><b>Value Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__VALUE_PERIOD = eINSTANCE.getDataRequirementValueFilter_ValuePeriod();

		/**
		 * The meta object literal for the '<em><b>Value Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_VALUE_FILTER__VALUE_DURATION = eINSTANCE.getDataRequirementValueFilter_ValueDuration();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DataTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DateImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DateTimeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__VALUE = eINSTANCE.getDateTime_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DecimalImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL__VALUE = eINSTANCE.getDecimal_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DistanceImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DomainResourceImpl <em>Domain Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DomainResourceImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDomainResource()
		 * @generated
		 */
		EClass DOMAIN_RESOURCE = eINSTANCE.getDomainResource();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_RESOURCE__TEXT = eINSTANCE.getDomainResource_Text();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_RESOURCE__EXTENSION = eINSTANCE.getDomainResource_Extension();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_RESOURCE__MODIFIER_EXTENSION = eINSTANCE.getDomainResource_ModifierExtension();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DosageImpl <em>Dosage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DosageImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDosage()
		 * @generated
		 */
		EClass DOSAGE = eINSTANCE.getDosage();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__SEQUENCE = eINSTANCE.getDosage_Sequence();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__TEXT = eINSTANCE.getDosage_Text();

		/**
		 * The meta object literal for the '<em><b>Additional Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__ADDITIONAL_INSTRUCTION = eINSTANCE.getDosage_AdditionalInstruction();

		/**
		 * The meta object literal for the '<em><b>Patient Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__PATIENT_INSTRUCTION = eINSTANCE.getDosage_PatientInstruction();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__TIMING = eINSTANCE.getDosage_Timing();

		/**
		 * The meta object literal for the '<em><b>As Needed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__AS_NEEDED = eINSTANCE.getDosage_AsNeeded();

		/**
		 * The meta object literal for the '<em><b>As Needed For</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__AS_NEEDED_FOR = eINSTANCE.getDosage_AsNeededFor();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__SITE = eINSTANCE.getDosage_Site();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__ROUTE = eINSTANCE.getDosage_Route();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__METHOD = eINSTANCE.getDosage_Method();

		/**
		 * The meta object literal for the '<em><b>Dose And Rate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__DOSE_AND_RATE = eINSTANCE.getDosage_DoseAndRate();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_PERIOD = eINSTANCE.getDosage_MaxDosePerPeriod();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Administration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_ADMINISTRATION = eINSTANCE.getDosage_MaxDosePerAdministration();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Lifetime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_LIFETIME = eINSTANCE.getDosage_MaxDosePerLifetime();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DosageDoseAndRateImpl <em>Dosage Dose And Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DosageDoseAndRateImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDosageDoseAndRate()
		 * @generated
		 */
		EClass DOSAGE_DOSE_AND_RATE = eINSTANCE.getDosageDoseAndRate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__TYPE = eINSTANCE.getDosageDoseAndRate_Type();

		/**
		 * The meta object literal for the '<em><b>Dose Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__DOSE_RANGE = eINSTANCE.getDosageDoseAndRate_DoseRange();

		/**
		 * The meta object literal for the '<em><b>Dose Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY = eINSTANCE.getDosageDoseAndRate_DoseQuantity();

		/**
		 * The meta object literal for the '<em><b>Rate Ratio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__RATE_RATIO = eINSTANCE.getDosageDoseAndRate_RateRatio();

		/**
		 * The meta object literal for the '<em><b>Rate Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__RATE_RANGE = eINSTANCE.getDosageDoseAndRate_RateRange();

		/**
		 * The meta object literal for the '<em><b>Rate Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_DOSE_AND_RATE__RATE_QUANTITY = eINSTANCE.getDosageDoseAndRate_RateQuantity();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.DurationImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ElementImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.EventTimingImpl <em>Event Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.EventTimingImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getEventTiming()
		 * @generated
		 */
		EClass EVENT_TIMING = eINSTANCE.getEventTiming();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TIMING__VALUE = eINSTANCE.getEventTiming_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ExpressionImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__DESCRIPTION = eINSTANCE.getExpression_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__REFERENCE = eINSTANCE.getExpression_Reference();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ExtendedContactDetailImpl <em>Extended Contact Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ExtendedContactDetailImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExtendedContactDetail()
		 * @generated
		 */
		EClass EXTENDED_CONTACT_DETAIL = eINSTANCE.getExtendedContactDetail();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__PURPOSE = eINSTANCE.getExtendedContactDetail_Purpose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__NAME = eINSTANCE.getExtendedContactDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__TELECOM = eINSTANCE.getExtendedContactDetail_Telecom();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__ADDRESS = eINSTANCE.getExtendedContactDetail_Address();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__ORGANIZATION = eINSTANCE.getExtendedContactDetail_Organization();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CONTACT_DETAIL__PERIOD = eINSTANCE.getExtendedContactDetail_Period();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ExtensionImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Value Base64 Binary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_BASE64_BINARY = eINSTANCE.getExtension_ValueBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_BOOLEAN = eINSTANCE.getExtension_ValueBoolean();

		/**
		 * The meta object literal for the '<em><b>Value Canonical</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CANONICAL = eINSTANCE.getExtension_ValueCanonical();

		/**
		 * The meta object literal for the '<em><b>Value Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CODE = eINSTANCE.getExtension_ValueCode();

		/**
		 * The meta object literal for the '<em><b>Value Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DATE = eINSTANCE.getExtension_ValueDate();

		/**
		 * The meta object literal for the '<em><b>Value Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DATE_TIME = eINSTANCE.getExtension_ValueDateTime();

		/**
		 * The meta object literal for the '<em><b>Value Decimal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DECIMAL = eINSTANCE.getExtension_ValueDecimal();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_ID = eINSTANCE.getExtension_ValueId();

		/**
		 * The meta object literal for the '<em><b>Value Instant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_INSTANT = eINSTANCE.getExtension_ValueInstant();

		/**
		 * The meta object literal for the '<em><b>Value Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_INTEGER = eINSTANCE.getExtension_ValueInteger();

		/**
		 * The meta object literal for the '<em><b>Value Integer64</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_INTEGER64 = eINSTANCE.getExtension_ValueInteger64();

		/**
		 * The meta object literal for the '<em><b>Value Markdown</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_MARKDOWN = eINSTANCE.getExtension_ValueMarkdown();

		/**
		 * The meta object literal for the '<em><b>Value Oid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_OID = eINSTANCE.getExtension_ValueOid();

		/**
		 * The meta object literal for the '<em><b>Value Positive Int</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_POSITIVE_INT = eINSTANCE.getExtension_ValuePositiveInt();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_STRING = eINSTANCE.getExtension_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_TIME = eINSTANCE.getExtension_ValueTime();

		/**
		 * The meta object literal for the '<em><b>Value Unsigned Int</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_UNSIGNED_INT = eINSTANCE.getExtension_ValueUnsignedInt();

		/**
		 * The meta object literal for the '<em><b>Value Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_URI = eINSTANCE.getExtension_ValueUri();

		/**
		 * The meta object literal for the '<em><b>Value Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_URL = eINSTANCE.getExtension_ValueUrl();

		/**
		 * The meta object literal for the '<em><b>Value Uuid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_UUID = eINSTANCE.getExtension_ValueUuid();

		/**
		 * The meta object literal for the '<em><b>Value Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_ADDRESS = eINSTANCE.getExtension_ValueAddress();

		/**
		 * The meta object literal for the '<em><b>Value Age</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_AGE = eINSTANCE.getExtension_ValueAge();

		/**
		 * The meta object literal for the '<em><b>Value Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_ANNOTATION = eINSTANCE.getExtension_ValueAnnotation();

		/**
		 * The meta object literal for the '<em><b>Value Attachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_ATTACHMENT = eINSTANCE.getExtension_ValueAttachment();

		/**
		 * The meta object literal for the '<em><b>Value Codeable Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CODEABLE_CONCEPT = eINSTANCE.getExtension_ValueCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Value Codeable Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CODEABLE_REFERENCE = eINSTANCE.getExtension_ValueCodeableReference();

		/**
		 * The meta object literal for the '<em><b>Value Coding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CODING = eINSTANCE.getExtension_ValueCoding();

		/**
		 * The meta object literal for the '<em><b>Value Contact Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CONTACT_POINT = eINSTANCE.getExtension_ValueContactPoint();

		/**
		 * The meta object literal for the '<em><b>Value Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_COUNT = eINSTANCE.getExtension_ValueCount();

		/**
		 * The meta object literal for the '<em><b>Value Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DISTANCE = eINSTANCE.getExtension_ValueDistance();

		/**
		 * The meta object literal for the '<em><b>Value Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DURATION = eINSTANCE.getExtension_ValueDuration();

		/**
		 * The meta object literal for the '<em><b>Value Human Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_HUMAN_NAME = eINSTANCE.getExtension_ValueHumanName();

		/**
		 * The meta object literal for the '<em><b>Value Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_IDENTIFIER = eINSTANCE.getExtension_ValueIdentifier();

		/**
		 * The meta object literal for the '<em><b>Value Money</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_MONEY = eINSTANCE.getExtension_ValueMoney();

		/**
		 * The meta object literal for the '<em><b>Value Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_PERIOD = eINSTANCE.getExtension_ValuePeriod();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_QUANTITY = eINSTANCE.getExtension_ValueQuantity();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_RANGE = eINSTANCE.getExtension_ValueRange();

		/**
		 * The meta object literal for the '<em><b>Value Ratio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_RATIO = eINSTANCE.getExtension_ValueRatio();

		/**
		 * The meta object literal for the '<em><b>Value Ratio Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_RATIO_RANGE = eINSTANCE.getExtension_ValueRatioRange();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_REFERENCE = eINSTANCE.getExtension_ValueReference();

		/**
		 * The meta object literal for the '<em><b>Value Sampled Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_SAMPLED_DATA = eINSTANCE.getExtension_ValueSampledData();

		/**
		 * The meta object literal for the '<em><b>Value Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_SIGNATURE = eINSTANCE.getExtension_ValueSignature();

		/**
		 * The meta object literal for the '<em><b>Value Timing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_TIMING = eINSTANCE.getExtension_ValueTiming();

		/**
		 * The meta object literal for the '<em><b>Value Contact Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_CONTACT_DETAIL = eINSTANCE.getExtension_ValueContactDetail();

		/**
		 * The meta object literal for the '<em><b>Value Data Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DATA_REQUIREMENT = eINSTANCE.getExtension_ValueDataRequirement();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_EXPRESSION = eINSTANCE.getExtension_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value Parameter Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_PARAMETER_DEFINITION = eINSTANCE.getExtension_ValueParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Related Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_RELATED_ARTIFACT = eINSTANCE.getExtension_ValueRelatedArtifact();

		/**
		 * The meta object literal for the '<em><b>Value Trigger Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_TRIGGER_DEFINITION = eINSTANCE.getExtension_ValueTriggerDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Usage Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_USAGE_CONTEXT = eINSTANCE.getExtension_ValueUsageContext();

		/**
		 * The meta object literal for the '<em><b>Value Availability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_AVAILABILITY = eINSTANCE.getExtension_ValueAvailability();

		/**
		 * The meta object literal for the '<em><b>Value Extended Contact Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_EXTENDED_CONTACT_DETAIL = eINSTANCE.getExtension_ValueExtendedContactDetail();

		/**
		 * The meta object literal for the '<em><b>Value Dosage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_DOSAGE = eINSTANCE.getExtension_ValueDosage();

		/**
		 * The meta object literal for the '<em><b>Value Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE_META = eINSTANCE.getExtension_ValueMeta();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.HTTPVerbImpl <em>HTTP Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.HTTPVerbImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHTTPVerb()
		 * @generated
		 */
		EClass HTTP_VERB = eINSTANCE.getHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_VERB__VALUE = eINSTANCE.getHTTPVerb_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.HumanNameImpl <em>Human Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.HumanNameImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHumanName()
		 * @generated
		 */
		EClass HUMAN_NAME = eINSTANCE.getHumanName();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__USE = eINSTANCE.getHumanName_Use();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__TEXT = eINSTANCE.getHumanName_Text();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__FAMILY = eINSTANCE.getHumanName_Family();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__GIVEN = eINSTANCE.getHumanName_Given();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PREFIX = eINSTANCE.getHumanName_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__SUFFIX = eINSTANCE.getHumanName_Suffix();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PERIOD = eINSTANCE.getHumanName_Period();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.IdImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__VALUE = eINSTANCE.getId_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.IdentifierImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__USE = eINSTANCE.getIdentifier_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__TYPE = eINSTANCE.getIdentifier_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__SYSTEM = eINSTANCE.getIdentifier_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__PERIOD = eINSTANCE.getIdentifier_Period();

		/**
		 * The meta object literal for the '<em><b>Assigner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ASSIGNER = eINSTANCE.getIdentifier_Assigner();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.IdentifierUseImpl <em>Identifier Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.IdentifierUseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifierUse()
		 * @generated
		 */
		EClass IDENTIFIER_USE = eINSTANCE.getIdentifierUse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_USE__VALUE = eINSTANCE.getIdentifierUse_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.InstantImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT__VALUE = eINSTANCE.getInstant_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.IntegerImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.Integer64Impl <em>Integer64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Integer64Impl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64()
		 * @generated
		 */
		EClass INTEGER64 = eINSTANCE.getInteger64();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER64__VALUE = eINSTANCE.getInteger64_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.LinkRelationTypesImpl <em>Link Relation Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.LinkRelationTypesImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkRelationTypes()
		 * @generated
		 */
		EClass LINK_RELATION_TYPES = eINSTANCE.getLinkRelationTypes();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_RELATION_TYPES__VALUE = eINSTANCE.getLinkRelationTypes_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.LinkTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VALUE = eINSTANCE.getLinkType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.MarkdownImpl <em>Markdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.MarkdownImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMarkdown()
		 * @generated
		 */
		EClass MARKDOWN = eINSTANCE.getMarkdown();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN__VALUE = eINSTANCE.getMarkdown_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.MetaImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Version Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__VERSION_ID = eINSTANCE.getMeta_VersionId();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__LAST_UPDATED = eINSTANCE.getMeta_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SOURCE = eINSTANCE.getMeta_Source();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__PROFILE = eINSTANCE.getMeta_Profile();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SECURITY = eINSTANCE.getMeta_Security();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__TAG = eINSTANCE.getMeta_Tag();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.MoneyImpl <em>Money</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.MoneyImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMoney()
		 * @generated
		 */
		EClass MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONEY__VALUE = eINSTANCE.getMoney_Value();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONEY__CURRENCY = eINSTANCE.getMoney_Currency();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.NameUseImpl <em>Name Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.NameUseImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNameUse()
		 * @generated
		 */
		EClass NAME_USE = eINSTANCE.getNameUse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_USE__VALUE = eINSTANCE.getNameUse_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.NarrativeImpl <em>Narrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.NarrativeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrative()
		 * @generated
		 */
		EClass NARRATIVE = eINSTANCE.getNarrative();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__STATUS = eINSTANCE.getNarrative_Status();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__DIV = eINSTANCE.getNarrative_Div();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.NarrativeStatusImpl <em>Narrative Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.NarrativeStatusImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrativeStatus()
		 * @generated
		 */
		EClass NARRATIVE_STATUS = eINSTANCE.getNarrativeStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NARRATIVE_STATUS__VALUE = eINSTANCE.getNarrativeStatus_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.OidImpl <em>Oid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.OidImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getOid()
		 * @generated
		 */
		EClass OID = eINSTANCE.getOid();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OID__VALUE = eINSTANCE.getOid_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ParameterDefinitionImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__USE = eINSTANCE.getParameterDefinition_Use();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MIN = eINSTANCE.getParameterDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MAX = eINSTANCE.getParameterDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__DOCUMENTATION = eINSTANCE.getParameterDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__TYPE = eINSTANCE.getParameterDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__PROFILE = eINSTANCE.getParameterDefinition_Profile();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PatientImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__IDENTIFIER = eINSTANCE.getPatient_Identifier();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__ACTIVE = eINSTANCE.getPatient_Active();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__NAME = eINSTANCE.getPatient_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__TELECOM = eINSTANCE.getPatient_Telecom();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__GENDER = eINSTANCE.getPatient_Gender();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__BIRTH_DATE = eINSTANCE.getPatient_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Deceased Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DECEASED_BOOLEAN = eINSTANCE.getPatient_DeceasedBoolean();

		/**
		 * The meta object literal for the '<em><b>Deceased Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DECEASED_DATE_TIME = eINSTANCE.getPatient_DeceasedDateTime();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__ADDRESS = eINSTANCE.getPatient_Address();

		/**
		 * The meta object literal for the '<em><b>Marital Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MARITAL_STATUS = eINSTANCE.getPatient_MaritalStatus();

		/**
		 * The meta object literal for the '<em><b>Multiple Birth Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MULTIPLE_BIRTH_BOOLEAN = eINSTANCE.getPatient_MultipleBirthBoolean();

		/**
		 * The meta object literal for the '<em><b>Multiple Birth Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MULTIPLE_BIRTH_INTEGER = eINSTANCE.getPatient_MultipleBirthInteger();

		/**
		 * The meta object literal for the '<em><b>Photo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__PHOTO = eINSTANCE.getPatient_Photo();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__CONTACT = eINSTANCE.getPatient_Contact();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__COMMUNICATION = eINSTANCE.getPatient_Communication();

		/**
		 * The meta object literal for the '<em><b>General Practitioner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__GENERAL_PRACTITIONER = eINSTANCE.getPatient_GeneralPractitioner();

		/**
		 * The meta object literal for the '<em><b>Managing Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MANAGING_ORGANIZATION = eINSTANCE.getPatient_ManagingOrganization();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__LINK = eINSTANCE.getPatient_Link();

		/**
		 * The meta object literal for the '<em><b>Fake Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__FAKE_ID = eINSTANCE.getPatient_FakeId();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PatientCommunicationImpl <em>Patient Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PatientCommunicationImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientCommunication()
		 * @generated
		 */
		EClass PATIENT_COMMUNICATION = eINSTANCE.getPatientCommunication();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_COMMUNICATION__LANGUAGE = eINSTANCE.getPatientCommunication_Language();

		/**
		 * The meta object literal for the '<em><b>Preferred</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_COMMUNICATION__PREFERRED = eINSTANCE.getPatientCommunication_Preferred();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PatientContactImpl <em>Patient Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PatientContactImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientContact()
		 * @generated
		 */
		EClass PATIENT_CONTACT = eINSTANCE.getPatientContact();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__RELATIONSHIP = eINSTANCE.getPatientContact_Relationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__NAME = eINSTANCE.getPatientContact_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__TELECOM = eINSTANCE.getPatientContact_Telecom();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__ADDRESS = eINSTANCE.getPatientContact_Address();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__GENDER = eINSTANCE.getPatientContact_Gender();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__ORGANIZATION = eINSTANCE.getPatientContact_Organization();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_CONTACT__PERIOD = eINSTANCE.getPatientContact_Period();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PatientLinkImpl <em>Patient Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PatientLinkImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPatientLink()
		 * @generated
		 */
		EClass PATIENT_LINK = eINSTANCE.getPatientLink();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_LINK__OTHER = eINSTANCE.getPatientLink_Other();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_LINK__TYPE = eINSTANCE.getPatientLink_Type();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PeriodImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.PositiveIntImpl <em>Positive Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.PositiveIntImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPositiveInt()
		 * @generated
		 */
		EClass POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIVE_INT__VALUE = eINSTANCE.getPositiveInt_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.QuantityImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__COMPARATOR = eINSTANCE.getQuantity_Comparator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__SYSTEM = eINSTANCE.getQuantity_System();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__CODE = eINSTANCE.getQuantity_Code();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.QuantityComparatorImpl <em>Quantity Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.QuantityComparatorImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantityComparator()
		 * @generated
		 */
		EClass QUANTITY_COMPARATOR = eINSTANCE.getQuantityComparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_COMPARATOR__VALUE = eINSTANCE.getQuantityComparator_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.RangeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__LOW = eINSTANCE.getRange_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HIGH = eINSTANCE.getRange_High();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.RatioImpl <em>Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.RatioImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRatio()
		 * @generated
		 */
		EClass RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__NUMERATOR = eINSTANCE.getRatio_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__DENOMINATOR = eINSTANCE.getRatio_Denominator();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.RatioRangeImpl <em>Ratio Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.RatioRangeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRatioRange()
		 * @generated
		 */
		EClass RATIO_RANGE = eINSTANCE.getRatioRange();

		/**
		 * The meta object literal for the '<em><b>Low Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_RANGE__LOW_NUMERATOR = eINSTANCE.getRatioRange_LowNumerator();

		/**
		 * The meta object literal for the '<em><b>High Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_RANGE__HIGH_NUMERATOR = eINSTANCE.getRatioRange_HighNumerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO_RANGE__DENOMINATOR = eINSTANCE.getRatioRange_Denominator();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ReferenceImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IDENTIFIER = eINSTANCE.getReference_Identifier();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__DISPLAY = eINSTANCE.getReference_Display();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.RelatedArtifactImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifact()
		 * @generated
		 */
		EClass RELATED_ARTIFACT = eINSTANCE.getRelatedArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__TYPE = eINSTANCE.getRelatedArtifact_Type();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__CLASSIFIER = eINSTANCE.getRelatedArtifact_Classifier();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__LABEL = eINSTANCE.getRelatedArtifact_Label();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DISPLAY = eINSTANCE.getRelatedArtifact_Display();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__CITATION = eINSTANCE.getRelatedArtifact_Citation();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DOCUMENT = eINSTANCE.getRelatedArtifact_Document();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__RESOURCE = eINSTANCE.getRelatedArtifact_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__RESOURCE_REFERENCE = eINSTANCE.getRelatedArtifact_ResourceReference();

		/**
		 * The meta object literal for the '<em><b>Publication Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__PUBLICATION_STATUS = eINSTANCE.getRelatedArtifact_PublicationStatus();

		/**
		 * The meta object literal for the '<em><b>Publication Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__PUBLICATION_DATE = eINSTANCE.getRelatedArtifact_PublicationDate();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.RelatedArtifactTypeImpl <em>Related Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.RelatedArtifactTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifactType()
		 * @generated
		 */
		EClass RELATED_ARTIFACT_TYPE = eINSTANCE.getRelatedArtifactType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_ARTIFACT_TYPE__VALUE = eINSTANCE.getRelatedArtifactType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.ResourceImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ID = eINSTANCE.getResource_Id();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__META = eINSTANCE.getResource_Meta();

		/**
		 * The meta object literal for the '<em><b>Implicit Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__IMPLICIT_RULES = eINSTANCE.getResource_ImplicitRules();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LANGUAGE = eINSTANCE.getResource_Language();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.SampledDataImpl <em>Sampled Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.SampledDataImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledData()
		 * @generated
		 */
		EClass SAMPLED_DATA = eINSTANCE.getSampledData();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__ORIGIN = eINSTANCE.getSampledData_Origin();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__INTERVAL = eINSTANCE.getSampledData_Interval();

		/**
		 * The meta object literal for the '<em><b>Interval Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__INTERVAL_UNIT = eINSTANCE.getSampledData_IntervalUnit();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__FACTOR = eINSTANCE.getSampledData_Factor();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__LOWER_LIMIT = eINSTANCE.getSampledData_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__UPPER_LIMIT = eINSTANCE.getSampledData_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DIMENSIONS = eINSTANCE.getSampledData_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Code Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__CODE_MAP = eINSTANCE.getSampledData_CodeMap();

		/**
		 * The meta object literal for the '<em><b>Offsets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__OFFSETS = eINSTANCE.getSampledData_Offsets();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DATA = eINSTANCE.getSampledData_Data();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.SampledDataDataTypeImpl <em>Sampled Data Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.SampledDataDataTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledDataDataType()
		 * @generated
		 */
		EClass SAMPLED_DATA_DATA_TYPE = eINSTANCE.getSampledDataDataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_DATA_DATA_TYPE__VALUE = eINSTANCE.getSampledDataDataType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.SearchEntryModeImpl <em>Search Entry Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.SearchEntryModeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSearchEntryMode()
		 * @generated
		 */
		EClass SEARCH_ENTRY_MODE = eINSTANCE.getSearchEntryMode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_ENTRY_MODE__VALUE = eINSTANCE.getSearchEntryMode_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.SignatureImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHEN = eINSTANCE.getSignature_When();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHO = eINSTANCE.getSignature_Who();

		/**
		 * The meta object literal for the '<em><b>On Behalf Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__ON_BEHALF_OF = eINSTANCE.getSignature_OnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Target Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TARGET_FORMAT = eINSTANCE.getSignature_TargetFormat();

		/**
		 * The meta object literal for the '<em><b>Sig Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__SIG_FORMAT = eINSTANCE.getSignature_SigFormat();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__DATA = eINSTANCE.getSignature_Data();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.SortDirectionImpl <em>Sort Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.SortDirectionImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSortDirection()
		 * @generated
		 */
		EClass SORT_DIRECTION = eINSTANCE.getSortDirection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_DIRECTION__VALUE = eINSTANCE.getSortDirection_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.StringImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.TimeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.TimingImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENT = eINSTANCE.getTiming_Event();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__REPEAT = eINSTANCE.getTiming_Repeat();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CODE = eINSTANCE.getTiming_Code();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.TimingRepeatImpl <em>Timing Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.TimingRepeatImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTimingRepeat()
		 * @generated
		 */
		EClass TIMING_REPEAT = eINSTANCE.getTimingRepeat();

		/**
		 * The meta object literal for the '<em><b>Bounds Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__BOUNDS_DURATION = eINSTANCE.getTimingRepeat_BoundsDuration();

		/**
		 * The meta object literal for the '<em><b>Bounds Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__BOUNDS_RANGE = eINSTANCE.getTimingRepeat_BoundsRange();

		/**
		 * The meta object literal for the '<em><b>Bounds Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__BOUNDS_PERIOD = eINSTANCE.getTimingRepeat_BoundsPeriod();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__COUNT = eINSTANCE.getTimingRepeat_Count();

		/**
		 * The meta object literal for the '<em><b>Count Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__COUNT_MAX = eINSTANCE.getTimingRepeat_CountMax();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION = eINSTANCE.getTimingRepeat_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION_MAX = eINSTANCE.getTimingRepeat_DurationMax();

		/**
		 * The meta object literal for the '<em><b>Duration Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION_UNIT = eINSTANCE.getTimingRepeat_DurationUnit();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__FREQUENCY = eINSTANCE.getTimingRepeat_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__FREQUENCY_MAX = eINSTANCE.getTimingRepeat_FrequencyMax();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD = eINSTANCE.getTimingRepeat_Period();

		/**
		 * The meta object literal for the '<em><b>Period Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD_MAX = eINSTANCE.getTimingRepeat_PeriodMax();

		/**
		 * The meta object literal for the '<em><b>Period Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD_UNIT = eINSTANCE.getTimingRepeat_PeriodUnit();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DAY_OF_WEEK = eINSTANCE.getTimingRepeat_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Time Of Day</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__TIME_OF_DAY = eINSTANCE.getTimingRepeat_TimeOfDay();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__WHEN = eINSTANCE.getTimingRepeat_When();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__OFFSET = eINSTANCE.getTimingRepeat_Offset();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.TriggerDefinitionImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerDefinition()
		 * @generated
		 */
		EClass TRIGGER_DEFINITION = eINSTANCE.getTriggerDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TYPE = eINSTANCE.getTriggerDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__NAME = eINSTANCE.getTriggerDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__CODE = eINSTANCE.getTriggerDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Subscription Topic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__SUBSCRIPTION_TOPIC = eINSTANCE.getTriggerDefinition_SubscriptionTopic();

		/**
		 * The meta object literal for the '<em><b>Timing Timing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TIMING_TIMING = eINSTANCE.getTriggerDefinition_TimingTiming();

		/**
		 * The meta object literal for the '<em><b>Timing Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TIMING_REFERENCE = eINSTANCE.getTriggerDefinition_TimingReference();

		/**
		 * The meta object literal for the '<em><b>Timing Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TIMING_DATE = eINSTANCE.getTriggerDefinition_TimingDate();

		/**
		 * The meta object literal for the '<em><b>Timing Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TIMING_DATE_TIME = eINSTANCE.getTriggerDefinition_TimingDateTime();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__DATA = eINSTANCE.getTriggerDefinition_Data();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__CONDITION = eINSTANCE.getTriggerDefinition_Condition();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.TriggerTypeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerType()
		 * @generated
		 */
		EClass TRIGGER_TYPE = eINSTANCE.getTriggerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_TYPE__VALUE = eINSTANCE.getTriggerType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UnitsOfTimeImpl <em>Units Of Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UnitsOfTimeImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnitsOfTime()
		 * @generated
		 */
		EClass UNITS_OF_TIME = eINSTANCE.getUnitsOfTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITS_OF_TIME__VALUE = eINSTANCE.getUnitsOfTime_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UnsignedIntImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnsignedInt()
		 * @generated
		 */
		EClass UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSIGNED_INT__VALUE = eINSTANCE.getUnsignedInt_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UriImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__VALUE = eINSTANCE.getUri_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UrlImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__VALUE = eINSTANCE.getUrl_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UsageContextImpl <em>Usage Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UsageContextImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUsageContext()
		 * @generated
		 */
		EClass USAGE_CONTEXT = eINSTANCE.getUsageContext();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__CODE = eINSTANCE.getUsageContext_Code();

		/**
		 * The meta object literal for the '<em><b>Value Codeable Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT = eINSTANCE.getUsageContext_ValueCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_QUANTITY = eINSTANCE.getUsageContext_ValueQuantity();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_RANGE = eINSTANCE.getUsageContext_ValueRange();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_REFERENCE = eINSTANCE.getUsageContext_ValueReference();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.impl.UuidImpl <em>Uuid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.UuidImpl
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUuid()
		 * @generated
		 */
		EClass UUID = eINSTANCE.getUuid();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UUID__VALUE = eINSTANCE.getUuid_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.AddressTypeEnum <em>Address Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.AddressTypeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressTypeEnum()
		 * @generated
		 */
		EEnum ADDRESS_TYPE_ENUM = eINSTANCE.getAddressTypeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.AddressUseEnum <em>Address Use Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.AddressUseEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAddressUseEnum()
		 * @generated
		 */
		EEnum ADDRESS_USE_ENUM = eINSTANCE.getAddressUseEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.AdministrativeGenderEnum <em>Administrative Gender Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.AdministrativeGenderEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getAdministrativeGenderEnum()
		 * @generated
		 */
		EEnum ADMINISTRATIVE_GENDER_ENUM = eINSTANCE.getAdministrativeGenderEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.BundleTypeEnum <em>Bundle Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.BundleTypeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBundleTypeEnum()
		 * @generated
		 */
		EEnum BUNDLE_TYPE_ENUM = eINSTANCE.getBundleTypeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.ContactPointSystemEnum <em>Contact Point System Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.ContactPointSystemEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointSystemEnum()
		 * @generated
		 */
		EEnum CONTACT_POINT_SYSTEM_ENUM = eINSTANCE.getContactPointSystemEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.ContactPointUseEnum <em>Contact Point Use Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.ContactPointUseEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getContactPointUseEnum()
		 * @generated
		 */
		EEnum CONTACT_POINT_USE_ENUM = eINSTANCE.getContactPointUseEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.EventTimingEnum <em>Event Timing Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.EventTimingEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getEventTimingEnum()
		 * @generated
		 */
		EEnum EVENT_TIMING_ENUM = eINSTANCE.getEventTimingEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.HTTPVerbEnum <em>HTTP Verb Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.HTTPVerbEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getHTTPVerbEnum()
		 * @generated
		 */
		EEnum HTTP_VERB_ENUM = eINSTANCE.getHTTPVerbEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.IdentifierUseEnum <em>Identifier Use Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.IdentifierUseEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdentifierUseEnum()
		 * @generated
		 */
		EEnum IDENTIFIER_USE_ENUM = eINSTANCE.getIdentifierUseEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.LinkRelationTypesEnum <em>Link Relation Types Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.LinkRelationTypesEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkRelationTypesEnum()
		 * @generated
		 */
		EEnum LINK_RELATION_TYPES_ENUM = eINSTANCE.getLinkRelationTypesEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.LinkTypeEnum <em>Link Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.LinkTypeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getLinkTypeEnum()
		 * @generated
		 */
		EEnum LINK_TYPE_ENUM = eINSTANCE.getLinkTypeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.NameUseEnum <em>Name Use Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.NameUseEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNameUseEnum()
		 * @generated
		 */
		EEnum NAME_USE_ENUM = eINSTANCE.getNameUseEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.NarrativeStatusEnum <em>Narrative Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.NarrativeStatusEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getNarrativeStatusEnum()
		 * @generated
		 */
		EEnum NARRATIVE_STATUS_ENUM = eINSTANCE.getNarrativeStatusEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.QuantityComparatorEnum <em>Quantity Comparator Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.QuantityComparatorEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getQuantityComparatorEnum()
		 * @generated
		 */
		EEnum QUANTITY_COMPARATOR_ENUM = eINSTANCE.getQuantityComparatorEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.RelatedArtifactTypeEnum <em>Related Artifact Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.RelatedArtifactTypeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getRelatedArtifactTypeEnum()
		 * @generated
		 */
		EEnum RELATED_ARTIFACT_TYPE_ENUM = eINSTANCE.getRelatedArtifactTypeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.SearchEntryModeEnum <em>Search Entry Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.SearchEntryModeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSearchEntryModeEnum()
		 * @generated
		 */
		EEnum SEARCH_ENTRY_MODE_ENUM = eINSTANCE.getSearchEntryModeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.SortDirectionEnum <em>Sort Direction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.SortDirectionEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSortDirectionEnum()
		 * @generated
		 */
		EEnum SORT_DIRECTION_ENUM = eINSTANCE.getSortDirectionEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.TriggerTypeEnum <em>Trigger Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.TriggerTypeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTriggerTypeEnum()
		 * @generated
		 */
		EEnum TRIGGER_TYPE_ENUM = eINSTANCE.getTriggerTypeEnum();

		/**
		 * The meta object literal for the '{@link org.hl7.fhir_patient.UnitsOfTimeEnum <em>Units Of Time Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.UnitsOfTimeEnum
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnitsOfTimeEnum()
		 * @generated
		 */
		EEnum UNITS_OF_TIME_ENUM = eINSTANCE.getUnitsOfTimeEnum();

		/**
		 * The meta object literal for the '<em>Base64 Binary Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBase64BinaryPrimitive()
		 * @generated
		 */
		EDataType BASE64_BINARY_PRIMITIVE = eINSTANCE.getBase64BinaryPrimitive();

		/**
		 * The meta object literal for the '<em>Boolean Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBooleanPrimitive()
		 * @generated
		 */
		EDataType BOOLEAN_PRIMITIVE = eINSTANCE.getBooleanPrimitive();

		/**
		 * The meta object literal for the '<em>Boolean Primitive Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getBooleanPrimitiveObject()
		 * @generated
		 */
		EDataType BOOLEAN_PRIMITIVE_OBJECT = eINSTANCE.getBooleanPrimitiveObject();

		/**
		 * The meta object literal for the '<em>Canonical Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCanonicalPrimitive()
		 * @generated
		 */
		EDataType CANONICAL_PRIMITIVE = eINSTANCE.getCanonicalPrimitive();

		/**
		 * The meta object literal for the '<em>Code Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getCodePrimitive()
		 * @generated
		 */
		EDataType CODE_PRIMITIVE = eINSTANCE.getCodePrimitive();

		/**
		 * The meta object literal for the '<em>Date Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDatePrimitive()
		 * @generated
		 */
		EDataType DATE_PRIMITIVE = eINSTANCE.getDatePrimitive();

		/**
		 * The meta object literal for the '<em>Date Primitive Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDatePrimitiveBase()
		 * @generated
		 */
		EDataType DATE_PRIMITIVE_BASE = eINSTANCE.getDatePrimitiveBase();

		/**
		 * The meta object literal for the '<em>Date Time Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTimePrimitive()
		 * @generated
		 */
		EDataType DATE_TIME_PRIMITIVE = eINSTANCE.getDateTimePrimitive();

		/**
		 * The meta object literal for the '<em>Date Time Primitive Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDateTimePrimitiveBase()
		 * @generated
		 */
		EDataType DATE_TIME_PRIMITIVE_BASE = eINSTANCE.getDateTimePrimitiveBase();

		/**
		 * The meta object literal for the '<em>Decimal Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getDecimalPrimitive()
		 * @generated
		 */
		EDataType DECIMAL_PRIMITIVE = eINSTANCE.getDecimalPrimitive();

		/**
		 * The meta object literal for the '<em>Id Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIdPrimitive()
		 * @generated
		 */
		EDataType ID_PRIMITIVE = eINSTANCE.getIdPrimitive();

		/**
		 * The meta object literal for the '<em>Instant Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInstantPrimitive()
		 * @generated
		 */
		EDataType INSTANT_PRIMITIVE = eINSTANCE.getInstantPrimitive();

		/**
		 * The meta object literal for the '<em>Integer64 Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64Primitive()
		 * @generated
		 */
		EDataType INTEGER64_PRIMITIVE = eINSTANCE.getInteger64Primitive();

		/**
		 * The meta object literal for the '<em>Integer64 Primitive Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getInteger64PrimitiveObject()
		 * @generated
		 */
		EDataType INTEGER64_PRIMITIVE_OBJECT = eINSTANCE.getInteger64PrimitiveObject();

		/**
		 * The meta object literal for the '<em>Integer Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIntegerPrimitive()
		 * @generated
		 */
		EDataType INTEGER_PRIMITIVE = eINSTANCE.getIntegerPrimitive();

		/**
		 * The meta object literal for the '<em>Integer Primitive Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getIntegerPrimitiveObject()
		 * @generated
		 */
		EDataType INTEGER_PRIMITIVE_OBJECT = eINSTANCE.getIntegerPrimitiveObject();

		/**
		 * The meta object literal for the '<em>Markdown Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getMarkdownPrimitive()
		 * @generated
		 */
		EDataType MARKDOWN_PRIMITIVE = eINSTANCE.getMarkdownPrimitive();

		/**
		 * The meta object literal for the '<em>Oid Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getOidPrimitive()
		 * @generated
		 */
		EDataType OID_PRIMITIVE = eINSTANCE.getOidPrimitive();

		/**
		 * The meta object literal for the '<em>Positive Int Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getPositiveIntPrimitive()
		 * @generated
		 */
		EDataType POSITIVE_INT_PRIMITIVE = eINSTANCE.getPositiveIntPrimitive();

		/**
		 * The meta object literal for the '<em>Sampled Data Data Type Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getSampledDataDataTypePrimitive()
		 * @generated
		 */
		EDataType SAMPLED_DATA_DATA_TYPE_PRIMITIVE = eINSTANCE.getSampledDataDataTypePrimitive();

		/**
		 * The meta object literal for the '<em>String Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getStringPrimitive()
		 * @generated
		 */
		EDataType STRING_PRIMITIVE = eINSTANCE.getStringPrimitive();

		/**
		 * The meta object literal for the '<em>Time Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getTimePrimitive()
		 * @generated
		 */
		EDataType TIME_PRIMITIVE = eINSTANCE.getTimePrimitive();

		/**
		 * The meta object literal for the '<em>Unsigned Int Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUnsignedIntPrimitive()
		 * @generated
		 */
		EDataType UNSIGNED_INT_PRIMITIVE = eINSTANCE.getUnsignedIntPrimitive();

		/**
		 * The meta object literal for the '<em>Uri Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUriPrimitive()
		 * @generated
		 */
		EDataType URI_PRIMITIVE = eINSTANCE.getUriPrimitive();

		/**
		 * The meta object literal for the '<em>Url Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUrlPrimitive()
		 * @generated
		 */
		EDataType URL_PRIMITIVE = eINSTANCE.getUrlPrimitive();

		/**
		 * The meta object literal for the '<em>Uuid Primitive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.fhir_patient.impl.Fhir_PatientPackageImpl#getUuidPrimitive()
		 * @generated
		 */
		EDataType UUID_PRIMITIVE = eINSTANCE.getUuidPrimitive();

	}

} //Fhir_PatientPackage
