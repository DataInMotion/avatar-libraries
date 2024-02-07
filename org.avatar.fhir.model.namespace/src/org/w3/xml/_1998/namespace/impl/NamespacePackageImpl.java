/**
 */
package org.w3.xml._1998.namespace.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3.xml._1998.namespace.DocumentRoot;
import org.w3.xml._1998.namespace.LangTypeMember1;
import org.w3.xml._1998.namespace.NamespaceFactory;
import org.w3.xml._1998.namespace.NamespacePackage;
import org.w3.xml._1998.namespace.SpaceType;

import org.w3.xml._1998.namespace.util.NamespaceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespacePackageImpl extends EPackageImpl implements NamespacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum langTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType langTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType langTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spaceTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3.xml._1998.namespace.NamespacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NamespacePackageImpl() {
		super(eNS_URI, NamespaceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NamespacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NamespacePackage init() {
		if (isInited) return (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNamespacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NamespacePackageImpl theNamespacePackage = registeredNamespacePackage instanceof NamespacePackageImpl ? (NamespacePackageImpl)registeredNamespacePackage : new NamespacePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNamespacePackage.createPackageContents();

		// Initialize created meta-data
		theNamespacePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theNamespacePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return NamespaceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theNamespacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NamespacePackage.eNS_URI, theNamespacePackage);
		return theNamespacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Base() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Lang() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Space() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLangTypeMember1() {
		return langTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpaceType() {
		return spaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLangType() {
		return langTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLangTypeMember1Object() {
		return langTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpaceTypeObject() {
		return spaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceFactory getNamespaceFactory() {
		return (NamespaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BASE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LANG);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPACE);

		// Create enums
		langTypeMember1EEnum = createEEnum(LANG_TYPE_MEMBER1);
		spaceTypeEEnum = createEEnum(SPACE_TYPE);

		// Create data types
		langTypeEDataType = createEDataType(LANG_TYPE);
		langTypeMember1ObjectEDataType = createEDataType(LANG_TYPE_MEMBER1_OBJECT);
		spaceTypeObjectEDataType = createEDataType(SPACE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Base(), theXMLTypePackage.getAnyURI(), "base", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Lang(), this.getLangType(), "lang", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Space(), this.getSpaceType(), "space", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(langTypeMember1EEnum, LangTypeMember1.class, "LangTypeMember1");
		addEEnumLiteral(langTypeMember1EEnum, LangTypeMember1.__);

		initEEnum(spaceTypeEEnum, SpaceType.class, "SpaceType");
		addEEnumLiteral(spaceTypeEEnum, SpaceType.DEFAULT);
		addEEnumLiteral(spaceTypeEEnum, SpaceType.PRESERVE);

		// Initialize data types
		initEDataType(langTypeEDataType, Object.class, "LangType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(langTypeMember1ObjectEDataType, LangTypeMember1.class, "LangTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(spaceTypeObjectEDataType, SpaceType.class, "SpaceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "\n        \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n            \n    <h1>About the XML namespace</h1>\n            \n    <div class=\"bodytext\">\n                \n      <p>\n      This schema document describes the XML namespace, in a form\n      suitable for import by other schema documents.\n     </p>\n                \n      <p>\n              See \n        <a href=\"http://www.w3.org/XML/1998/namespace.html\">\n      http://www.w3.org/XML/1998/namespace.html</a>\n         and\n      \n        <a href=\"http://www.w3.org/TR/REC-xml\">\n      http://www.w3.org/TR/REC-xml</a>\n         for information \n      about this namespace.\n     \n      </p>\n                \n      <p>\n      Note that local names in this namespace are intended to be\n      defined only by the World Wide Web Consortium or its subgroups.\n      The names currently defined in this namespace are listed below.\n      They should not be used with conflicting semantics by any Working\n      Group, specification, or document instance.\n     </p>\n                \n      <p>\n           \n      See further below in this document for more information about \n        <a href=\"#usage\">how to refer to this schema document from your own\n      XSD schema documents</a>\n         and about \n        <a href=\"#nsversioning\">the\n      namespace-versioning policy governing this schema document</a>\n        .\n     \n      </p>\n              \n    </div>\n          \n  </div>\n      \n\n\n        \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n            \n    <h3>Father (in any context at all)</h3>\n            \n    <div class=\"bodytext\">\n                \n      <p>\n      denotes Jon Bosak, the chair of \n      the original XML Working Group.  This name is reserved by \n      the following decision of the W3C XML Plenary and \n      XML Coordination groups:\n     </p>\n                \n      <blockquote>\n                    \n        <p>\n\tIn appreciation for his vision, leadership and\n\tdedication the W3C XML Plenary on this 10th day of\n\tFebruary, 2000, reserves for Jon Bosak in perpetuity\n\tthe XML name \"xml:Father\".\n       </p>\n                  \n      </blockquote>\n              \n    </div>\n          \n  </div>\n      \n\n\n        \n  <div id=\"usage\" xml:id=\"usage\" xmlns=\"http://www.w3.org/1999/xhtml\">\n            \n    <h2>\n                \n      <a name=\"usage\">About this schema document</a>\n              \n    </h2>\n            \n    <div class=\"bodytext\">\n                \n      <p>\n              This schema defines attributes and an attribute group suitable\n      for use by schemas wishing to allow \n        <code>xml:base</code>\n        ,\n      \n        <code>xml:lang</code>\n        , \n        <code>xml:space</code>\n         or\n      \n        <code>xml:id</code>\n         attributes on elements they define.\n     \n      </p>\n                \n      <p>\n      To enable this, such a schema must import this schema for\n      the XML namespace, e.g. as follows:\n     </p>\n                \n      <pre>\n          &lt;schema . . .&gt;\n           . . .\n           &lt;import namespace=\"http://www.w3.org/XML/1998/namespace\"\n                      schemaLocation=\"http://www.w3.org/2001/xml.xsd\"/&gt;\n     </pre>\n                \n      <p>\n      or\n     </p>\n                \n      <pre>\n           &lt;import namespace=\"http://www.w3.org/XML/1998/namespace\"\n                      schemaLocation=\"http://www.w3.org/2009/01/xml.xsd\"/&gt;\n     </pre>\n                \n      <p>\n      Subsequently, qualified reference to any of the attributes or the\n      group defined below will have the desired effect, e.g.\n     </p>\n                \n      <pre>\n          &lt;type . . .&gt;\n           . . .\n           &lt;attributeGroup ref=\"xml:specialAttrs\"/&gt;\n     </pre>\n                \n      <p>\n      will define a type which will schema-validate an instance element\n      with any of those attributes.\n     </p>\n              \n    </div>\n          \n  </div>\n      \n\n\n        \n  <div id=\"nsversioning\" xml:id=\"nsversioning\" xmlns=\"http://www.w3.org/1999/xhtml\">\n            \n    <h2>\n                \n      <a name=\"nsversioning\">Versioning policy for this schema document</a>\n              \n    </h2>\n            \n    <div class=\"bodytext\">\n                \n      <p>\n              In keeping with the XML Schema WG\'s standard versioning\n      policy, this schema document will persist at\n      \n        <a href=\"http://www.w3.org/2009/01/xml.xsd\">\n       http://www.w3.org/2009/01/xml.xsd</a>\n        .\n     \n      </p>\n                \n      <p>\n              At the date of issue it can also be found at\n      \n        <a href=\"http://www.w3.org/2001/xml.xsd\">\n       http://www.w3.org/2001/xml.xsd</a>\n        .\n     \n      </p>\n                \n      <p>\n              The schema document at that URI may however change in the future,\n      in order to remain compatible with the latest version of XML\n      Schema itself, or with the XML namespace itself.  In other words,\n      if the XML Schema or XML namespaces change, the version of this\n      document at \n        <a href=\"http://www.w3.org/2001/xml.xsd\">\n       http://www.w3.org/2001/xml.xsd \n      </a>\n         \n      will change accordingly; the version at \n      \n        <a href=\"http://www.w3.org/2009/01/xml.xsd\">\n       http://www.w3.org/2009/01/xml.xsd \n      </a>\n         \n      will not change.\n     \n      </p>\n                \n      <p>\n      Previous dated (and unchanging) versions of this schema \n      document are at:\n     </p>\n                \n      <ul>\n                    \n        <li>\n                        \n          <a href=\"http://www.w3.org/2009/01/xml.xsd\">\n\thttp://www.w3.org/2009/01/xml.xsd</a>\n                      \n        </li>\n                    \n        <li>\n                        \n          <a href=\"http://www.w3.org/2007/08/xml.xsd\">\n\thttp://www.w3.org/2007/08/xml.xsd</a>\n                      \n        </li>\n                    \n        <li>\n                        \n          <a href=\"http://www.w3.org/2004/10/xml.xsd\">\n\thttp://www.w3.org/2004/10/xml.xsd</a>\n                      \n        </li>\n                    \n        <li>\n                        \n          <a href=\"http://www.w3.org/2001/03/xml.xsd\">\n\thttp://www.w3.org/2001/03/xml.xsd</a>\n                      \n        </li>\n                  \n      </ul>\n              \n    </div>\n          \n  </div>\n      \n"
		   });
		addAnnotation
		  (getDocumentRoot_Base(),
		   source,
		   new String[] {
			   "documentation", "\n          \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n              \n    <h3>base (as an attribute name)</h3>\n              \n    <p>\n       denotes an attribute whose value\n       provides a URI to be used as the base for interpreting any\n       relative URIs in the scope of the element on which it\n       appears; its value is inherited.  This name is reserved\n       by virtue of its definition in the XML Base specification.</p>\n              \n    <p>\n            See \n      <a href=\"http://www.w3.org/TR/xmlbase/\">http://www.w3.org/TR/xmlbase/</a>\n            for information about this attribute.\n     \n    </p>\n            \n  </div>\n        \n"
		   });
		addAnnotation
		  (getDocumentRoot_Id(),
		   source,
		   new String[] {
			   "documentation", "\n          \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n              \n    <h3>id (as an attribute name)</h3>\n              \n    <p>\n       denotes an attribute whose value\n       should be interpreted as if declared to be of type ID.\n       This name is reserved by virtue of its definition in the\n       xml:id specification.</p>\n              \n    <p>\n            See \n      <a href=\"http://www.w3.org/TR/xml-id/\">http://www.w3.org/TR/xml-id/</a>\n            for information about this attribute.\n     \n    </p>\n            \n  </div>\n        \n"
		   });
		addAnnotation
		  (getDocumentRoot_Lang(),
		   source,
		   new String[] {
			   "documentation", "\n          \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n              \n    <h3>lang (as an attribute name)</h3>\n              \n    <p>\n       denotes an attribute whose value\n       is a language code for the natural language of the content of\n       any element; its value is inherited.  This name is reserved\n       by virtue of its definition in the XML specification.</p>\n            \n  </div>\n          \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n              \n    <h4>Notes</h4>\n              \n    <p>\n      Attempting to install the relevant ISO 2- and 3-letter\n      codes as the enumerated possible values is probably never\n      going to be a realistic possibility.  \n     </p>\n              \n    <p>\n            See BCP 47 at \n      <a href=\"http://www.rfc-editor.org/rfc/bcp/bcp47.txt\">\n       http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>\n            and the IANA language subtag registry at\n      \n      <a href=\"http://www.iana.org/assignments/language-subtag-registry\">\n       http://www.iana.org/assignments/language-subtag-registry</a>\n            for further information.\n     \n    </p>\n              \n    <p>\n      The union allows for the \'un-declaration\' of xml:lang with\n      the empty string.\n     </p>\n            \n  </div>\n        \n"
		   });
		addAnnotation
		  (getDocumentRoot_Space(),
		   source,
		   new String[] {
			   "documentation", "\n          \n  <div xmlns=\"http://www.w3.org/1999/xhtml\">\n              \n    <h3>space (as an attribute name)</h3>\n              \n    <p>\n       denotes an attribute whose\n       value is a keyword indicating what whitespace processing\n       discipline is intended for the content of the element; its\n       value is inherited.  This name is reserved by virtue of its\n       definition in the XML specification.</p>\n            \n  </div>\n        \n"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNamespaceAnnotations() {
		String source = "http://www.w3.org/XML/1998/namespace";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "lang", "en"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (langTypeEDataType,
		   source,
		   new String[] {
			   "name", "lang_._type",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#language lang_._type_._member_._1"
		   });
		addAnnotation
		  (langTypeMember1EEnum,
		   source,
		   new String[] {
			   "name", "lang_._type_._member_._1"
		   });
		addAnnotation
		  (langTypeMember1ObjectEDataType,
		   source,
		   new String[] {
			   "name", "lang_._type_._member_._1:Object",
			   "baseType", "lang_._type_._member_._1"
		   });
		addAnnotation
		  (spaceTypeEEnum,
		   source,
		   new String[] {
			   "name", "space_._type"
		   });
		addAnnotation
		  (spaceTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "space_._type:Object",
			   "baseType", "space_._type"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Base(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "base",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Space(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "space",
			   "namespace", "##targetNamespace"
		   });
	}

} //NamespacePackageImpl
