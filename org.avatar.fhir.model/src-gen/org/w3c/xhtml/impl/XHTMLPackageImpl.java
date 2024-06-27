/**
 */
package org.w3c.xhtml.impl;

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.fhir.FHIRPackage;

import org.hl7.fhir.impl.FHIRPackageImpl;

import org.w3c.xhtml.AContent;
import org.w3c.xhtml.AType;
import org.w3c.xhtml.AbbrType;
import org.w3c.xhtml.AcronymType;
import org.w3c.xhtml.AddressType;
import org.w3c.xhtml.AlignType;
import org.w3c.xhtml.AreaType;
import org.w3c.xhtml.BType;
import org.w3c.xhtml.BdoType;
import org.w3c.xhtml.BigType;
import org.w3c.xhtml.Block;
import org.w3c.xhtml.BlockquoteType;
import org.w3c.xhtml.BrType;
import org.w3c.xhtml.CaptionType;
import org.w3c.xhtml.CiteType;
import org.w3c.xhtml.CodeType;
import org.w3c.xhtml.ColType;
import org.w3c.xhtml.ColgroupType;
import org.w3c.xhtml.DdType;
import org.w3c.xhtml.DfnType;
import org.w3c.xhtml.DirType;
import org.w3c.xhtml.DirType1;
import org.w3c.xhtml.DivType;
import org.w3c.xhtml.DlType;
import org.w3c.xhtml.DocumentRoot;
import org.w3c.xhtml.DtType;
import org.w3c.xhtml.EmType;
import org.w3c.xhtml.Flow;
import org.w3c.xhtml.H1Type;
import org.w3c.xhtml.H2Type;
import org.w3c.xhtml.H3Type;
import org.w3c.xhtml.H4Type;
import org.w3c.xhtml.H5Type;
import org.w3c.xhtml.H6Type;
import org.w3c.xhtml.HrType;
import org.w3c.xhtml.IType;
import org.w3c.xhtml.ImgType;
import org.w3c.xhtml.Inline;
import org.w3c.xhtml.IsmapType;
import org.w3c.xhtml.KbdType;
import org.w3c.xhtml.LiType;
import org.w3c.xhtml.MapType;
import org.w3c.xhtml.NohrefType;
import org.w3c.xhtml.OlType;
import org.w3c.xhtml.PType;
import org.w3c.xhtml.PreContent;
import org.w3c.xhtml.PreType;
import org.w3c.xhtml.QType;
import org.w3c.xhtml.SampType;
import org.w3c.xhtml.Scope;
import org.w3c.xhtml.Shape;
import org.w3c.xhtml.SmallType;
import org.w3c.xhtml.SpanType;
import org.w3c.xhtml.StrongType;
import org.w3c.xhtml.SubType;
import org.w3c.xhtml.SupType;
import org.w3c.xhtml.TFrame;
import org.w3c.xhtml.TRules;
import org.w3c.xhtml.TableType;
import org.w3c.xhtml.TbodyType;
import org.w3c.xhtml.TdType;
import org.w3c.xhtml.TfootType;
import org.w3c.xhtml.ThType;
import org.w3c.xhtml.TheadType;
import org.w3c.xhtml.TrType;
import org.w3c.xhtml.TtType;
import org.w3c.xhtml.UlType;
import org.w3c.xhtml.ValignType;
import org.w3c.xhtml.VarType;
import org.w3c.xhtml.XHTMLFactory;
import org.w3c.xhtml.XHTMLPackage;

import org.w3c.xhtml.util.XHTMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XHTMLPackageImpl extends EPackageImpl implements XHTMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acronymTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bdoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockquoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlTypeEClass = null;

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
	private EClass dtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h3TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h4TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h5TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h6TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kbdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfootTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dirTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dirType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ismapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nohrefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tFrameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tRulesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charsetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charsetsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentTypesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datetimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dirTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dirTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ismapTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linkTypesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mediaDescEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nohrefTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixelsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scriptEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shapeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleSheetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tabindexNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tFrameObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRulesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valignTypeObjectEDataType = null;

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
	 * @see org.w3c.xhtml.XHTMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XHTMLPackageImpl() {
		super(eNS_URI, XHTMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XHTMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XHTMLPackage init() {
		if (isInited) return (XHTMLPackage)EPackage.Registry.INSTANCE.getEPackage(XHTMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXHTMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XHTMLPackageImpl theXHTMLPackage = registeredXHTMLPackage instanceof XHTMLPackageImpl ? (XHTMLPackageImpl)registeredXHTMLPackage : new XHTMLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FHIRPackage.eNS_URI);
		FHIRPackageImpl theFHIRPackage = (FHIRPackageImpl)(registeredPackage instanceof FHIRPackageImpl ? registeredPackage : FHIRPackage.eINSTANCE);

		// Load packages
		theFHIRPackage.loadPackage();

		// Create package meta-data objects
		theXHTMLPackage.createPackageContents();

		// Initialize created meta-data
		theXHTMLPackage.initializePackageContents();

		// Fix loaded packages
		theFHIRPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXHTMLPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return XHTMLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXHTMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XHTMLPackage.eNS_URI, theXHTMLPackage);
		return theXHTMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbbrType() {
		return abbrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Class() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Dir() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Id() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Lang() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Lang1() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Style() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbrType_Title() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAContent() {
		return aContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAContent_Mixed() {
		return (EAttribute)aContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAContent_Group() {
		return (EAttribute)aContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Br() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Span() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Bdo() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Map() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Img() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Tt() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_I() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_B() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Big() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Small() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Em() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Strong() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Dfn() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Code() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Q() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Samp() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Kbd() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Var() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Cite() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Abbr() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Acronym() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Sub() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAContent_Sup() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcronymType() {
		return acronymTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Class() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Dir() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Id() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Lang() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Lang1() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Style() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcronymType_Title() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Class() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Dir() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Id() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Lang() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Lang1() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Style() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressType_Title() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaType() {
		return areaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Accesskey() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Alt() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Class() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Coords() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Dir() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Href() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Id() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Lang() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Lang1() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Nohref() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Shape() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Style() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Tabindex() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType_Title() {
		return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAType() {
		return aTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Accesskey() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Charset() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Class() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Coords() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Dir() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Href() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Hreflang() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Id() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Lang() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Lang1() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Name() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Rel() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Rev() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Shape() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Style() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Tabindex() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Title() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Type() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBdoType() {
		return bdoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Class() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Dir() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Id() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Lang() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Lang1() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Style() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBdoType_Title() {
		return (EAttribute)bdoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBigType() {
		return bigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Class() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Dir() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Id() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Lang() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Lang1() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Style() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigType_Title() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Block() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_P() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H1() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H2() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H3() {
		return (EReference)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H4() {
		return (EReference)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H5() {
		return (EReference)blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_H6() {
		return (EReference)blockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Div() {
		return (EReference)blockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Ul() {
		return (EReference)blockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Ol() {
		return (EReference)blockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Dl() {
		return (EReference)blockEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Pre() {
		return (EReference)blockEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Hr() {
		return (EReference)blockEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Blockquote() {
		return (EReference)blockEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Address() {
		return (EReference)blockEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Table() {
		return (EReference)blockEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockquoteType() {
		return blockquoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Cite() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Class() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Dir() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Id() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Lang() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Lang1() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Style() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockquoteType_Title() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBrType() {
		return brTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBrType_Class() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBrType_Id() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBrType_Style() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBrType_Title() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBType() {
		return bTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Class() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Dir() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Id() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Lang() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Lang1() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Style() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBType_Title() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaptionType() {
		return captionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Class() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Dir() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Id() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Lang() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Lang1() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Style() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaptionType_Title() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCiteType() {
		return citeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Class() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Dir() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Id() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Lang() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Lang1() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Style() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCiteType_Title() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeType() {
		return codeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Class() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Dir() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Id() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Lang() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Lang1() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Style() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeType_Title() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColgroupType() {
		return colgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColgroupType_Col() {
		return (EReference)colgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Align() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Char() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Charoff() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Class() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Dir() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Id() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Lang() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Lang1() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Span() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Style() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Title() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Valign() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColgroupType_Width() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColType() {
		return colTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Align() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Char() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Charoff() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Class() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Dir() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Id() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Lang() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Lang1() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Span() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Style() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Title() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Valign() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColType_Width() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDdType() {
		return ddTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Class() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Dir() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Id() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Lang() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Lang1() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Style() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDdType_Title() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDfnType() {
		return dfnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Class() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Dir() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Id() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Lang() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Lang1() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Style() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDfnType_Title() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivType() {
		return divTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Class() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Dir() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Id() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Lang() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Lang1() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Style() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivType_Title() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDlType() {
		return dlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Group() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDlType_Dt() {
		return (EReference)dlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDlType_Dd() {
		return (EReference)dlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Class() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Dir() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Id() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Lang() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Lang1() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Style() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDlType_Title() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(9);
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
	public EReference getDocumentRoot_A() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Abbr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Acronym() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Area() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_B() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Bdo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Big() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Blockquote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Br() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Caption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Cite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Code() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Col() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Colgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dd() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dfn() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Div() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Em() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H2() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H3() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H4() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H5() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_H6() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Hr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_I() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Img() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Kbd() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Li() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Map() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Ol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_P() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Pre() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Q() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Samp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Small() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Span() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Strong() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sub() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Table() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tbody() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Td() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tfoot() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Th() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Thead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Ul() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Var() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDtType() {
		return dtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Class() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Dir() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Id() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Lang() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Lang1() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Style() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDtType_Title() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmType() {
		return emTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Class() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Dir() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Id() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Lang() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Lang1() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Style() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmType_Title() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlow_Mixed() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlow_Group() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_P() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H1() {
		return (EReference)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H2() {
		return (EReference)flowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H3() {
		return (EReference)flowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H4() {
		return (EReference)flowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H5() {
		return (EReference)flowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_H6() {
		return (EReference)flowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Div() {
		return (EReference)flowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Ul() {
		return (EReference)flowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Ol() {
		return (EReference)flowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Dl() {
		return (EReference)flowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Pre() {
		return (EReference)flowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Hr() {
		return (EReference)flowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Blockquote() {
		return (EReference)flowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Address() {
		return (EReference)flowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Table() {
		return (EReference)flowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_A() {
		return (EReference)flowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Br() {
		return (EReference)flowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Span() {
		return (EReference)flowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Bdo() {
		return (EReference)flowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Map() {
		return (EReference)flowEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Img() {
		return (EReference)flowEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Tt() {
		return (EReference)flowEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_I() {
		return (EReference)flowEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_B() {
		return (EReference)flowEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Big() {
		return (EReference)flowEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Small() {
		return (EReference)flowEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Em() {
		return (EReference)flowEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Strong() {
		return (EReference)flowEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Dfn() {
		return (EReference)flowEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Code() {
		return (EReference)flowEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Q() {
		return (EReference)flowEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Samp() {
		return (EReference)flowEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Kbd() {
		return (EReference)flowEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Var() {
		return (EReference)flowEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Cite() {
		return (EReference)flowEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Abbr() {
		return (EReference)flowEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Acronym() {
		return (EReference)flowEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Sub() {
		return (EReference)flowEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Sup() {
		return (EReference)flowEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH1Type() {
		return h1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Class() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Dir() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Id() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Lang() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Lang1() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Style() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH1Type_Title() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH2Type() {
		return h2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Class() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Dir() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Id() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Lang() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Lang1() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Style() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH2Type_Title() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH3Type() {
		return h3TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Class() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Dir() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Id() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Lang() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Lang1() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Style() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH3Type_Title() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH4Type() {
		return h4TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Class() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Dir() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Id() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Lang() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Lang1() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Style() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH4Type_Title() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH5Type() {
		return h5TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Class() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Dir() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Id() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Lang() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Lang1() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Style() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH5Type_Title() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getH6Type() {
		return h6TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Class() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Dir() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Id() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Lang() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Lang1() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Style() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getH6Type_Title() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHrType() {
		return hrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Class() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Dir() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Id() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Lang() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Lang1() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Style() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHrType_Title() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImgType() {
		return imgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Alt() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Class() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Dir() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Height() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Id() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Ismap() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Lang() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Lang1() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Longdesc() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Src() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Style() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Title() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Usemap() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImgType_Width() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInline() {
		return inlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInline_Mixed() {
		return (EAttribute)inlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInline_Inline() {
		return (EAttribute)inlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_A() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Br() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Span() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Bdo() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Map() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Img() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Tt() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_I() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_B() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Big() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Small() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Em() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Strong() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Dfn() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Code() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Q() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Samp() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Kbd() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Var() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Cite() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Abbr() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Acronym() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Sub() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInline_Sup() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIType() {
		return iTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Class() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Dir() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Id() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Lang() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Lang1() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Style() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIType_Title() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKbdType() {
		return kbdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Class() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Dir() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Id() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Lang() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Lang1() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Style() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKbdType_Title() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiType() {
		return liTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Class() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Dir() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Id() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Lang() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Lang1() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Style() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiType_Title() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapType() {
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Block() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_P() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H1() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H2() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H3() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H4() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H5() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_H6() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Div() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Ul() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Ol() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Dl() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Pre() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Hr() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Blockquote() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Address() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Table() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Area() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Class() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Dir() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Id() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Lang() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Lang1() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Name() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Style() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Title() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOlType() {
		return olTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOlType_Li() {
		return (EReference)olTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Class() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Dir() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Id() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Lang() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Lang1() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Style() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOlType_Title() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreContent() {
		return preContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreContent_Mixed() {
		return (EAttribute)preContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreContent_Group() {
		return (EAttribute)preContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_A() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Tt() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_I() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_B() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Big() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Small() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Em() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Strong() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Dfn() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Code() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Q() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Samp() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Kbd() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Var() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Cite() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Abbr() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Acronym() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Sub() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Sup() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Br() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Span() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Bdo() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreContent_Map() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreType() {
		return preTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Class() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Dir() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Id() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Lang() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Lang1() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Space() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Style() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreType_Title() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPType() {
		return pTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Class() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Dir() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Id() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Lang() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Lang1() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Style() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPType_Title() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQType() {
		return qTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Cite1() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Class() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Dir() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Id() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Lang() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Lang1() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Style() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQType_Title() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampType() {
		return sampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Class() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Dir() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Id() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Lang() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Lang1() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Style() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampType_Title() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmallType() {
		return smallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Class() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Dir() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Id() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Lang() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Lang1() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Style() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSmallType_Title() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpanType() {
		return spanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Class() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Dir() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Id() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Lang() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Lang1() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Style() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanType_Title() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongType() {
		return strongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Class() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Dir() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Id() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Lang() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Lang1() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Style() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrongType_Title() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubType() {
		return subTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Class() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Dir() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Id() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Lang() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Lang1() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Style() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubType_Title() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupType() {
		return supTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Class() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Dir() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Id() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Lang() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Lang1() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Style() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupType_Title() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Caption() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Col() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Colgroup() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Thead() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Tfoot() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Tbody() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableType_Tr() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Border() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Cellpadding() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Cellspacing() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Class() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Dir() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Frame() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Lang() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Lang1() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Rules() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Style() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Summary() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Title() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableType_Width() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTbodyType() {
		return tbodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTbodyType_Tr() {
		return (EReference)tbodyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Align() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Char() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Charoff() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Class() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Dir() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Id() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Lang() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Lang1() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Style() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Title() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTbodyType_Valign() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTdType() {
		return tdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Abbr1() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Align() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Axis() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Char() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Charoff() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Class() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Colspan() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Dir() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Headers() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Id() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Lang() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Lang1() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Rowspan() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Scope() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Style() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Title() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTdType_Valign() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTfootType() {
		return tfootTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTfootType_Tr() {
		return (EReference)tfootTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Align() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Char() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Charoff() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Class() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Dir() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Id() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Lang() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Lang1() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Style() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Title() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTfootType_Valign() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTheadType() {
		return theadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTheadType_Tr() {
		return (EReference)theadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Align() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Char() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Charoff() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Class() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Dir() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Id() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Lang() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Lang1() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Style() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Title() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTheadType_Valign() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThType() {
		return thTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Abbr1() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Align() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Axis() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Char() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Charoff() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Class() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Colspan() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Dir() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Headers() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Id() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Lang() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Lang1() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Rowspan() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Scope() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Style() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Title() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThType_Valign() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrType() {
		return trTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Group() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrType_Th() {
		return (EReference)trTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrType_Td() {
		return (EReference)trTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Align() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Char() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Charoff() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Class() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Dir() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Id() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Lang() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Lang1() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Style() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Title() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrType_Valign() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtType() {
		return ttTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Class() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Dir() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Id() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Lang() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Lang1() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Style() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtType_Title() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUlType() {
		return ulTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUlType_Li() {
		return (EReference)ulTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Class() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Dir() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Id() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Lang() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Lang1() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Style() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUlType_Title() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarType() {
		return varTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Class() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Dir() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Id() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Lang() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Lang1() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Style() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarType_Title() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlignType() {
		return alignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirType() {
		return dirTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirType1() {
		return dirType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIsmapType() {
		return ismapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNohrefType() {
		return nohrefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShape() {
		return shapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTFrame() {
		return tFrameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTRules() {
		return tRulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValignType() {
		return valignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAlignTypeObject() {
		return alignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCharacter() {
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCharset() {
		return charsetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCharsets() {
		return charsetsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContentType() {
		return contentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContentTypes() {
		return contentTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoords() {
		return coordsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatetime() {
		return datetimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDirTypeObject() {
		return dirTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDirTypeObject1() {
		return dirTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIsmapTypeObject() {
		return ismapTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLanguageCode() {
		return languageCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLength() {
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLinkTypes() {
		return linkTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMediaDesc() {
		return mediaDescEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMultiLength() {
		return multiLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNohrefTypeObject() {
		return nohrefTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPixels() {
		return pixelsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScopeObject() {
		return scopeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScript() {
		return scriptEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getShapeObject() {
		return shapeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStyleSheet() {
		return styleSheetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTabindexNumber() {
		return tabindexNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getText() {
		return textEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTFrameObject() {
		return tFrameObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTRulesObject() {
		return tRulesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUriList() {
		return uriListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getValignTypeObject() {
		return valignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XHTMLFactory getXHTMLFactory() {
		return (XHTMLFactory)getEFactoryInstance();
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
		abbrTypeEClass = createEClass(ABBR_TYPE);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__CLASS);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__DIR);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__ID);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__LANG);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__LANG1);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__STYLE);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__TITLE);

		aContentEClass = createEClass(ACONTENT);
		createEAttribute(aContentEClass, ACONTENT__MIXED);
		createEAttribute(aContentEClass, ACONTENT__GROUP);
		createEReference(aContentEClass, ACONTENT__BR);
		createEReference(aContentEClass, ACONTENT__SPAN);
		createEReference(aContentEClass, ACONTENT__BDO);
		createEReference(aContentEClass, ACONTENT__MAP);
		createEReference(aContentEClass, ACONTENT__IMG);
		createEReference(aContentEClass, ACONTENT__TT);
		createEReference(aContentEClass, ACONTENT__I);
		createEReference(aContentEClass, ACONTENT__B);
		createEReference(aContentEClass, ACONTENT__BIG);
		createEReference(aContentEClass, ACONTENT__SMALL);
		createEReference(aContentEClass, ACONTENT__EM);
		createEReference(aContentEClass, ACONTENT__STRONG);
		createEReference(aContentEClass, ACONTENT__DFN);
		createEReference(aContentEClass, ACONTENT__CODE);
		createEReference(aContentEClass, ACONTENT__Q);
		createEReference(aContentEClass, ACONTENT__SAMP);
		createEReference(aContentEClass, ACONTENT__KBD);
		createEReference(aContentEClass, ACONTENT__VAR);
		createEReference(aContentEClass, ACONTENT__CITE);
		createEReference(aContentEClass, ACONTENT__ABBR);
		createEReference(aContentEClass, ACONTENT__ACRONYM);
		createEReference(aContentEClass, ACONTENT__SUB);
		createEReference(aContentEClass, ACONTENT__SUP);

		acronymTypeEClass = createEClass(ACRONYM_TYPE);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__CLASS);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__DIR);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__ID);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__LANG);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__LANG1);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__STYLE);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__TITLE);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__CLASS);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__DIR);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__ID);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__LANG);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__LANG1);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__STYLE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__TITLE);

		areaTypeEClass = createEClass(AREA_TYPE);
		createEAttribute(areaTypeEClass, AREA_TYPE__ACCESSKEY);
		createEAttribute(areaTypeEClass, AREA_TYPE__ALT);
		createEAttribute(areaTypeEClass, AREA_TYPE__CLASS);
		createEAttribute(areaTypeEClass, AREA_TYPE__COORDS);
		createEAttribute(areaTypeEClass, AREA_TYPE__DIR);
		createEAttribute(areaTypeEClass, AREA_TYPE__HREF);
		createEAttribute(areaTypeEClass, AREA_TYPE__ID);
		createEAttribute(areaTypeEClass, AREA_TYPE__LANG);
		createEAttribute(areaTypeEClass, AREA_TYPE__LANG1);
		createEAttribute(areaTypeEClass, AREA_TYPE__NOHREF);
		createEAttribute(areaTypeEClass, AREA_TYPE__SHAPE);
		createEAttribute(areaTypeEClass, AREA_TYPE__STYLE);
		createEAttribute(areaTypeEClass, AREA_TYPE__TABINDEX);
		createEAttribute(areaTypeEClass, AREA_TYPE__TITLE);

		aTypeEClass = createEClass(ATYPE);
		createEAttribute(aTypeEClass, ATYPE__ACCESSKEY);
		createEAttribute(aTypeEClass, ATYPE__CHARSET);
		createEAttribute(aTypeEClass, ATYPE__CLASS);
		createEAttribute(aTypeEClass, ATYPE__COORDS);
		createEAttribute(aTypeEClass, ATYPE__DIR);
		createEAttribute(aTypeEClass, ATYPE__HREF);
		createEAttribute(aTypeEClass, ATYPE__HREFLANG);
		createEAttribute(aTypeEClass, ATYPE__ID);
		createEAttribute(aTypeEClass, ATYPE__LANG);
		createEAttribute(aTypeEClass, ATYPE__LANG1);
		createEAttribute(aTypeEClass, ATYPE__NAME);
		createEAttribute(aTypeEClass, ATYPE__REL);
		createEAttribute(aTypeEClass, ATYPE__REV);
		createEAttribute(aTypeEClass, ATYPE__SHAPE);
		createEAttribute(aTypeEClass, ATYPE__STYLE);
		createEAttribute(aTypeEClass, ATYPE__TABINDEX);
		createEAttribute(aTypeEClass, ATYPE__TITLE);
		createEAttribute(aTypeEClass, ATYPE__TYPE);

		bdoTypeEClass = createEClass(BDO_TYPE);
		createEAttribute(bdoTypeEClass, BDO_TYPE__CLASS);
		createEAttribute(bdoTypeEClass, BDO_TYPE__DIR);
		createEAttribute(bdoTypeEClass, BDO_TYPE__ID);
		createEAttribute(bdoTypeEClass, BDO_TYPE__LANG);
		createEAttribute(bdoTypeEClass, BDO_TYPE__LANG1);
		createEAttribute(bdoTypeEClass, BDO_TYPE__STYLE);
		createEAttribute(bdoTypeEClass, BDO_TYPE__TITLE);

		bigTypeEClass = createEClass(BIG_TYPE);
		createEAttribute(bigTypeEClass, BIG_TYPE__CLASS);
		createEAttribute(bigTypeEClass, BIG_TYPE__DIR);
		createEAttribute(bigTypeEClass, BIG_TYPE__ID);
		createEAttribute(bigTypeEClass, BIG_TYPE__LANG);
		createEAttribute(bigTypeEClass, BIG_TYPE__LANG1);
		createEAttribute(bigTypeEClass, BIG_TYPE__STYLE);
		createEAttribute(bigTypeEClass, BIG_TYPE__TITLE);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__BLOCK);
		createEReference(blockEClass, BLOCK__P);
		createEReference(blockEClass, BLOCK__H1);
		createEReference(blockEClass, BLOCK__H2);
		createEReference(blockEClass, BLOCK__H3);
		createEReference(blockEClass, BLOCK__H4);
		createEReference(blockEClass, BLOCK__H5);
		createEReference(blockEClass, BLOCK__H6);
		createEReference(blockEClass, BLOCK__DIV);
		createEReference(blockEClass, BLOCK__UL);
		createEReference(blockEClass, BLOCK__OL);
		createEReference(blockEClass, BLOCK__DL);
		createEReference(blockEClass, BLOCK__PRE);
		createEReference(blockEClass, BLOCK__HR);
		createEReference(blockEClass, BLOCK__BLOCKQUOTE);
		createEReference(blockEClass, BLOCK__ADDRESS);
		createEReference(blockEClass, BLOCK__TABLE);

		blockquoteTypeEClass = createEClass(BLOCKQUOTE_TYPE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__CITE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__CLASS);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__DIR);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__ID);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__LANG);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__LANG1);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__STYLE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__TITLE);

		brTypeEClass = createEClass(BR_TYPE);
		createEAttribute(brTypeEClass, BR_TYPE__CLASS);
		createEAttribute(brTypeEClass, BR_TYPE__ID);
		createEAttribute(brTypeEClass, BR_TYPE__STYLE);
		createEAttribute(brTypeEClass, BR_TYPE__TITLE);

		bTypeEClass = createEClass(BTYPE);
		createEAttribute(bTypeEClass, BTYPE__CLASS);
		createEAttribute(bTypeEClass, BTYPE__DIR);
		createEAttribute(bTypeEClass, BTYPE__ID);
		createEAttribute(bTypeEClass, BTYPE__LANG);
		createEAttribute(bTypeEClass, BTYPE__LANG1);
		createEAttribute(bTypeEClass, BTYPE__STYLE);
		createEAttribute(bTypeEClass, BTYPE__TITLE);

		captionTypeEClass = createEClass(CAPTION_TYPE);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__CLASS);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__DIR);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__ID);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__LANG);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__LANG1);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__STYLE);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__TITLE);

		citeTypeEClass = createEClass(CITE_TYPE);
		createEAttribute(citeTypeEClass, CITE_TYPE__CLASS);
		createEAttribute(citeTypeEClass, CITE_TYPE__DIR);
		createEAttribute(citeTypeEClass, CITE_TYPE__ID);
		createEAttribute(citeTypeEClass, CITE_TYPE__LANG);
		createEAttribute(citeTypeEClass, CITE_TYPE__LANG1);
		createEAttribute(citeTypeEClass, CITE_TYPE__STYLE);
		createEAttribute(citeTypeEClass, CITE_TYPE__TITLE);

		codeTypeEClass = createEClass(CODE_TYPE);
		createEAttribute(codeTypeEClass, CODE_TYPE__CLASS);
		createEAttribute(codeTypeEClass, CODE_TYPE__DIR);
		createEAttribute(codeTypeEClass, CODE_TYPE__ID);
		createEAttribute(codeTypeEClass, CODE_TYPE__LANG);
		createEAttribute(codeTypeEClass, CODE_TYPE__LANG1);
		createEAttribute(codeTypeEClass, CODE_TYPE__STYLE);
		createEAttribute(codeTypeEClass, CODE_TYPE__TITLE);

		colgroupTypeEClass = createEClass(COLGROUP_TYPE);
		createEReference(colgroupTypeEClass, COLGROUP_TYPE__COL);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__ALIGN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CHAR);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CHAROFF);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CLASS);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__DIR);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__ID);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__LANG);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__LANG1);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__SPAN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__STYLE);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__TITLE);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__VALIGN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__WIDTH);

		colTypeEClass = createEClass(COL_TYPE);
		createEAttribute(colTypeEClass, COL_TYPE__ALIGN);
		createEAttribute(colTypeEClass, COL_TYPE__CHAR);
		createEAttribute(colTypeEClass, COL_TYPE__CHAROFF);
		createEAttribute(colTypeEClass, COL_TYPE__CLASS);
		createEAttribute(colTypeEClass, COL_TYPE__DIR);
		createEAttribute(colTypeEClass, COL_TYPE__ID);
		createEAttribute(colTypeEClass, COL_TYPE__LANG);
		createEAttribute(colTypeEClass, COL_TYPE__LANG1);
		createEAttribute(colTypeEClass, COL_TYPE__SPAN);
		createEAttribute(colTypeEClass, COL_TYPE__STYLE);
		createEAttribute(colTypeEClass, COL_TYPE__TITLE);
		createEAttribute(colTypeEClass, COL_TYPE__VALIGN);
		createEAttribute(colTypeEClass, COL_TYPE__WIDTH);

		ddTypeEClass = createEClass(DD_TYPE);
		createEAttribute(ddTypeEClass, DD_TYPE__CLASS);
		createEAttribute(ddTypeEClass, DD_TYPE__DIR);
		createEAttribute(ddTypeEClass, DD_TYPE__ID);
		createEAttribute(ddTypeEClass, DD_TYPE__LANG);
		createEAttribute(ddTypeEClass, DD_TYPE__LANG1);
		createEAttribute(ddTypeEClass, DD_TYPE__STYLE);
		createEAttribute(ddTypeEClass, DD_TYPE__TITLE);

		dfnTypeEClass = createEClass(DFN_TYPE);
		createEAttribute(dfnTypeEClass, DFN_TYPE__CLASS);
		createEAttribute(dfnTypeEClass, DFN_TYPE__DIR);
		createEAttribute(dfnTypeEClass, DFN_TYPE__ID);
		createEAttribute(dfnTypeEClass, DFN_TYPE__LANG);
		createEAttribute(dfnTypeEClass, DFN_TYPE__LANG1);
		createEAttribute(dfnTypeEClass, DFN_TYPE__STYLE);
		createEAttribute(dfnTypeEClass, DFN_TYPE__TITLE);

		divTypeEClass = createEClass(DIV_TYPE);
		createEAttribute(divTypeEClass, DIV_TYPE__CLASS);
		createEAttribute(divTypeEClass, DIV_TYPE__DIR);
		createEAttribute(divTypeEClass, DIV_TYPE__ID);
		createEAttribute(divTypeEClass, DIV_TYPE__LANG);
		createEAttribute(divTypeEClass, DIV_TYPE__LANG1);
		createEAttribute(divTypeEClass, DIV_TYPE__STYLE);
		createEAttribute(divTypeEClass, DIV_TYPE__TITLE);

		dlTypeEClass = createEClass(DL_TYPE);
		createEAttribute(dlTypeEClass, DL_TYPE__GROUP);
		createEReference(dlTypeEClass, DL_TYPE__DT);
		createEReference(dlTypeEClass, DL_TYPE__DD);
		createEAttribute(dlTypeEClass, DL_TYPE__CLASS);
		createEAttribute(dlTypeEClass, DL_TYPE__DIR);
		createEAttribute(dlTypeEClass, DL_TYPE__ID);
		createEAttribute(dlTypeEClass, DL_TYPE__LANG);
		createEAttribute(dlTypeEClass, DL_TYPE__LANG1);
		createEAttribute(dlTypeEClass, DL_TYPE__STYLE);
		createEAttribute(dlTypeEClass, DL_TYPE__TITLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__A);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABBR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACRONYM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AREA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__B);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BDO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BIG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BLOCKQUOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CAPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLGROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DFN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIV);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H2);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H3);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H4);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H5);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H6);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__I);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KBD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__P);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__Q);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SAMP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SMALL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRONG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TBODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TFOOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THEAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VAR);

		dtTypeEClass = createEClass(DT_TYPE);
		createEAttribute(dtTypeEClass, DT_TYPE__CLASS);
		createEAttribute(dtTypeEClass, DT_TYPE__DIR);
		createEAttribute(dtTypeEClass, DT_TYPE__ID);
		createEAttribute(dtTypeEClass, DT_TYPE__LANG);
		createEAttribute(dtTypeEClass, DT_TYPE__LANG1);
		createEAttribute(dtTypeEClass, DT_TYPE__STYLE);
		createEAttribute(dtTypeEClass, DT_TYPE__TITLE);

		emTypeEClass = createEClass(EM_TYPE);
		createEAttribute(emTypeEClass, EM_TYPE__CLASS);
		createEAttribute(emTypeEClass, EM_TYPE__DIR);
		createEAttribute(emTypeEClass, EM_TYPE__ID);
		createEAttribute(emTypeEClass, EM_TYPE__LANG);
		createEAttribute(emTypeEClass, EM_TYPE__LANG1);
		createEAttribute(emTypeEClass, EM_TYPE__STYLE);
		createEAttribute(emTypeEClass, EM_TYPE__TITLE);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__MIXED);
		createEAttribute(flowEClass, FLOW__GROUP);
		createEReference(flowEClass, FLOW__P);
		createEReference(flowEClass, FLOW__H1);
		createEReference(flowEClass, FLOW__H2);
		createEReference(flowEClass, FLOW__H3);
		createEReference(flowEClass, FLOW__H4);
		createEReference(flowEClass, FLOW__H5);
		createEReference(flowEClass, FLOW__H6);
		createEReference(flowEClass, FLOW__DIV);
		createEReference(flowEClass, FLOW__UL);
		createEReference(flowEClass, FLOW__OL);
		createEReference(flowEClass, FLOW__DL);
		createEReference(flowEClass, FLOW__PRE);
		createEReference(flowEClass, FLOW__HR);
		createEReference(flowEClass, FLOW__BLOCKQUOTE);
		createEReference(flowEClass, FLOW__ADDRESS);
		createEReference(flowEClass, FLOW__TABLE);
		createEReference(flowEClass, FLOW__A);
		createEReference(flowEClass, FLOW__BR);
		createEReference(flowEClass, FLOW__SPAN);
		createEReference(flowEClass, FLOW__BDO);
		createEReference(flowEClass, FLOW__MAP);
		createEReference(flowEClass, FLOW__IMG);
		createEReference(flowEClass, FLOW__TT);
		createEReference(flowEClass, FLOW__I);
		createEReference(flowEClass, FLOW__B);
		createEReference(flowEClass, FLOW__BIG);
		createEReference(flowEClass, FLOW__SMALL);
		createEReference(flowEClass, FLOW__EM);
		createEReference(flowEClass, FLOW__STRONG);
		createEReference(flowEClass, FLOW__DFN);
		createEReference(flowEClass, FLOW__CODE);
		createEReference(flowEClass, FLOW__Q);
		createEReference(flowEClass, FLOW__SAMP);
		createEReference(flowEClass, FLOW__KBD);
		createEReference(flowEClass, FLOW__VAR);
		createEReference(flowEClass, FLOW__CITE);
		createEReference(flowEClass, FLOW__ABBR);
		createEReference(flowEClass, FLOW__ACRONYM);
		createEReference(flowEClass, FLOW__SUB);
		createEReference(flowEClass, FLOW__SUP);

		h1TypeEClass = createEClass(H1_TYPE);
		createEAttribute(h1TypeEClass, H1_TYPE__CLASS);
		createEAttribute(h1TypeEClass, H1_TYPE__DIR);
		createEAttribute(h1TypeEClass, H1_TYPE__ID);
		createEAttribute(h1TypeEClass, H1_TYPE__LANG);
		createEAttribute(h1TypeEClass, H1_TYPE__LANG1);
		createEAttribute(h1TypeEClass, H1_TYPE__STYLE);
		createEAttribute(h1TypeEClass, H1_TYPE__TITLE);

		h2TypeEClass = createEClass(H2_TYPE);
		createEAttribute(h2TypeEClass, H2_TYPE__CLASS);
		createEAttribute(h2TypeEClass, H2_TYPE__DIR);
		createEAttribute(h2TypeEClass, H2_TYPE__ID);
		createEAttribute(h2TypeEClass, H2_TYPE__LANG);
		createEAttribute(h2TypeEClass, H2_TYPE__LANG1);
		createEAttribute(h2TypeEClass, H2_TYPE__STYLE);
		createEAttribute(h2TypeEClass, H2_TYPE__TITLE);

		h3TypeEClass = createEClass(H3_TYPE);
		createEAttribute(h3TypeEClass, H3_TYPE__CLASS);
		createEAttribute(h3TypeEClass, H3_TYPE__DIR);
		createEAttribute(h3TypeEClass, H3_TYPE__ID);
		createEAttribute(h3TypeEClass, H3_TYPE__LANG);
		createEAttribute(h3TypeEClass, H3_TYPE__LANG1);
		createEAttribute(h3TypeEClass, H3_TYPE__STYLE);
		createEAttribute(h3TypeEClass, H3_TYPE__TITLE);

		h4TypeEClass = createEClass(H4_TYPE);
		createEAttribute(h4TypeEClass, H4_TYPE__CLASS);
		createEAttribute(h4TypeEClass, H4_TYPE__DIR);
		createEAttribute(h4TypeEClass, H4_TYPE__ID);
		createEAttribute(h4TypeEClass, H4_TYPE__LANG);
		createEAttribute(h4TypeEClass, H4_TYPE__LANG1);
		createEAttribute(h4TypeEClass, H4_TYPE__STYLE);
		createEAttribute(h4TypeEClass, H4_TYPE__TITLE);

		h5TypeEClass = createEClass(H5_TYPE);
		createEAttribute(h5TypeEClass, H5_TYPE__CLASS);
		createEAttribute(h5TypeEClass, H5_TYPE__DIR);
		createEAttribute(h5TypeEClass, H5_TYPE__ID);
		createEAttribute(h5TypeEClass, H5_TYPE__LANG);
		createEAttribute(h5TypeEClass, H5_TYPE__LANG1);
		createEAttribute(h5TypeEClass, H5_TYPE__STYLE);
		createEAttribute(h5TypeEClass, H5_TYPE__TITLE);

		h6TypeEClass = createEClass(H6_TYPE);
		createEAttribute(h6TypeEClass, H6_TYPE__CLASS);
		createEAttribute(h6TypeEClass, H6_TYPE__DIR);
		createEAttribute(h6TypeEClass, H6_TYPE__ID);
		createEAttribute(h6TypeEClass, H6_TYPE__LANG);
		createEAttribute(h6TypeEClass, H6_TYPE__LANG1);
		createEAttribute(h6TypeEClass, H6_TYPE__STYLE);
		createEAttribute(h6TypeEClass, H6_TYPE__TITLE);

		hrTypeEClass = createEClass(HR_TYPE);
		createEAttribute(hrTypeEClass, HR_TYPE__CLASS);
		createEAttribute(hrTypeEClass, HR_TYPE__DIR);
		createEAttribute(hrTypeEClass, HR_TYPE__ID);
		createEAttribute(hrTypeEClass, HR_TYPE__LANG);
		createEAttribute(hrTypeEClass, HR_TYPE__LANG1);
		createEAttribute(hrTypeEClass, HR_TYPE__STYLE);
		createEAttribute(hrTypeEClass, HR_TYPE__TITLE);

		imgTypeEClass = createEClass(IMG_TYPE);
		createEAttribute(imgTypeEClass, IMG_TYPE__ALT);
		createEAttribute(imgTypeEClass, IMG_TYPE__CLASS);
		createEAttribute(imgTypeEClass, IMG_TYPE__DIR);
		createEAttribute(imgTypeEClass, IMG_TYPE__HEIGHT);
		createEAttribute(imgTypeEClass, IMG_TYPE__ID);
		createEAttribute(imgTypeEClass, IMG_TYPE__ISMAP);
		createEAttribute(imgTypeEClass, IMG_TYPE__LANG);
		createEAttribute(imgTypeEClass, IMG_TYPE__LANG1);
		createEAttribute(imgTypeEClass, IMG_TYPE__LONGDESC);
		createEAttribute(imgTypeEClass, IMG_TYPE__SRC);
		createEAttribute(imgTypeEClass, IMG_TYPE__STYLE);
		createEAttribute(imgTypeEClass, IMG_TYPE__TITLE);
		createEAttribute(imgTypeEClass, IMG_TYPE__USEMAP);
		createEAttribute(imgTypeEClass, IMG_TYPE__WIDTH);

		inlineEClass = createEClass(INLINE);
		createEAttribute(inlineEClass, INLINE__MIXED);
		createEAttribute(inlineEClass, INLINE__INLINE);
		createEReference(inlineEClass, INLINE__A);
		createEReference(inlineEClass, INLINE__BR);
		createEReference(inlineEClass, INLINE__SPAN);
		createEReference(inlineEClass, INLINE__BDO);
		createEReference(inlineEClass, INLINE__MAP);
		createEReference(inlineEClass, INLINE__IMG);
		createEReference(inlineEClass, INLINE__TT);
		createEReference(inlineEClass, INLINE__I);
		createEReference(inlineEClass, INLINE__B);
		createEReference(inlineEClass, INLINE__BIG);
		createEReference(inlineEClass, INLINE__SMALL);
		createEReference(inlineEClass, INLINE__EM);
		createEReference(inlineEClass, INLINE__STRONG);
		createEReference(inlineEClass, INLINE__DFN);
		createEReference(inlineEClass, INLINE__CODE);
		createEReference(inlineEClass, INLINE__Q);
		createEReference(inlineEClass, INLINE__SAMP);
		createEReference(inlineEClass, INLINE__KBD);
		createEReference(inlineEClass, INLINE__VAR);
		createEReference(inlineEClass, INLINE__CITE);
		createEReference(inlineEClass, INLINE__ABBR);
		createEReference(inlineEClass, INLINE__ACRONYM);
		createEReference(inlineEClass, INLINE__SUB);
		createEReference(inlineEClass, INLINE__SUP);

		iTypeEClass = createEClass(ITYPE);
		createEAttribute(iTypeEClass, ITYPE__CLASS);
		createEAttribute(iTypeEClass, ITYPE__DIR);
		createEAttribute(iTypeEClass, ITYPE__ID);
		createEAttribute(iTypeEClass, ITYPE__LANG);
		createEAttribute(iTypeEClass, ITYPE__LANG1);
		createEAttribute(iTypeEClass, ITYPE__STYLE);
		createEAttribute(iTypeEClass, ITYPE__TITLE);

		kbdTypeEClass = createEClass(KBD_TYPE);
		createEAttribute(kbdTypeEClass, KBD_TYPE__CLASS);
		createEAttribute(kbdTypeEClass, KBD_TYPE__DIR);
		createEAttribute(kbdTypeEClass, KBD_TYPE__ID);
		createEAttribute(kbdTypeEClass, KBD_TYPE__LANG);
		createEAttribute(kbdTypeEClass, KBD_TYPE__LANG1);
		createEAttribute(kbdTypeEClass, KBD_TYPE__STYLE);
		createEAttribute(kbdTypeEClass, KBD_TYPE__TITLE);

		liTypeEClass = createEClass(LI_TYPE);
		createEAttribute(liTypeEClass, LI_TYPE__CLASS);
		createEAttribute(liTypeEClass, LI_TYPE__DIR);
		createEAttribute(liTypeEClass, LI_TYPE__ID);
		createEAttribute(liTypeEClass, LI_TYPE__LANG);
		createEAttribute(liTypeEClass, LI_TYPE__LANG1);
		createEAttribute(liTypeEClass, LI_TYPE__STYLE);
		createEAttribute(liTypeEClass, LI_TYPE__TITLE);

		mapTypeEClass = createEClass(MAP_TYPE);
		createEAttribute(mapTypeEClass, MAP_TYPE__BLOCK);
		createEReference(mapTypeEClass, MAP_TYPE__P);
		createEReference(mapTypeEClass, MAP_TYPE__H1);
		createEReference(mapTypeEClass, MAP_TYPE__H2);
		createEReference(mapTypeEClass, MAP_TYPE__H3);
		createEReference(mapTypeEClass, MAP_TYPE__H4);
		createEReference(mapTypeEClass, MAP_TYPE__H5);
		createEReference(mapTypeEClass, MAP_TYPE__H6);
		createEReference(mapTypeEClass, MAP_TYPE__DIV);
		createEReference(mapTypeEClass, MAP_TYPE__UL);
		createEReference(mapTypeEClass, MAP_TYPE__OL);
		createEReference(mapTypeEClass, MAP_TYPE__DL);
		createEReference(mapTypeEClass, MAP_TYPE__PRE);
		createEReference(mapTypeEClass, MAP_TYPE__HR);
		createEReference(mapTypeEClass, MAP_TYPE__BLOCKQUOTE);
		createEReference(mapTypeEClass, MAP_TYPE__ADDRESS);
		createEReference(mapTypeEClass, MAP_TYPE__TABLE);
		createEReference(mapTypeEClass, MAP_TYPE__AREA);
		createEAttribute(mapTypeEClass, MAP_TYPE__CLASS);
		createEAttribute(mapTypeEClass, MAP_TYPE__DIR);
		createEAttribute(mapTypeEClass, MAP_TYPE__ID);
		createEAttribute(mapTypeEClass, MAP_TYPE__LANG);
		createEAttribute(mapTypeEClass, MAP_TYPE__LANG1);
		createEAttribute(mapTypeEClass, MAP_TYPE__NAME);
		createEAttribute(mapTypeEClass, MAP_TYPE__STYLE);
		createEAttribute(mapTypeEClass, MAP_TYPE__TITLE);

		olTypeEClass = createEClass(OL_TYPE);
		createEReference(olTypeEClass, OL_TYPE__LI);
		createEAttribute(olTypeEClass, OL_TYPE__CLASS);
		createEAttribute(olTypeEClass, OL_TYPE__DIR);
		createEAttribute(olTypeEClass, OL_TYPE__ID);
		createEAttribute(olTypeEClass, OL_TYPE__LANG);
		createEAttribute(olTypeEClass, OL_TYPE__LANG1);
		createEAttribute(olTypeEClass, OL_TYPE__STYLE);
		createEAttribute(olTypeEClass, OL_TYPE__TITLE);

		preContentEClass = createEClass(PRE_CONTENT);
		createEAttribute(preContentEClass, PRE_CONTENT__MIXED);
		createEAttribute(preContentEClass, PRE_CONTENT__GROUP);
		createEReference(preContentEClass, PRE_CONTENT__A);
		createEReference(preContentEClass, PRE_CONTENT__TT);
		createEReference(preContentEClass, PRE_CONTENT__I);
		createEReference(preContentEClass, PRE_CONTENT__B);
		createEReference(preContentEClass, PRE_CONTENT__BIG);
		createEReference(preContentEClass, PRE_CONTENT__SMALL);
		createEReference(preContentEClass, PRE_CONTENT__EM);
		createEReference(preContentEClass, PRE_CONTENT__STRONG);
		createEReference(preContentEClass, PRE_CONTENT__DFN);
		createEReference(preContentEClass, PRE_CONTENT__CODE);
		createEReference(preContentEClass, PRE_CONTENT__Q);
		createEReference(preContentEClass, PRE_CONTENT__SAMP);
		createEReference(preContentEClass, PRE_CONTENT__KBD);
		createEReference(preContentEClass, PRE_CONTENT__VAR);
		createEReference(preContentEClass, PRE_CONTENT__CITE);
		createEReference(preContentEClass, PRE_CONTENT__ABBR);
		createEReference(preContentEClass, PRE_CONTENT__ACRONYM);
		createEReference(preContentEClass, PRE_CONTENT__SUB);
		createEReference(preContentEClass, PRE_CONTENT__SUP);
		createEReference(preContentEClass, PRE_CONTENT__BR);
		createEReference(preContentEClass, PRE_CONTENT__SPAN);
		createEReference(preContentEClass, PRE_CONTENT__BDO);
		createEReference(preContentEClass, PRE_CONTENT__MAP);

		preTypeEClass = createEClass(PRE_TYPE);
		createEAttribute(preTypeEClass, PRE_TYPE__CLASS);
		createEAttribute(preTypeEClass, PRE_TYPE__DIR);
		createEAttribute(preTypeEClass, PRE_TYPE__ID);
		createEAttribute(preTypeEClass, PRE_TYPE__LANG);
		createEAttribute(preTypeEClass, PRE_TYPE__LANG1);
		createEAttribute(preTypeEClass, PRE_TYPE__SPACE);
		createEAttribute(preTypeEClass, PRE_TYPE__STYLE);
		createEAttribute(preTypeEClass, PRE_TYPE__TITLE);

		pTypeEClass = createEClass(PTYPE);
		createEAttribute(pTypeEClass, PTYPE__CLASS);
		createEAttribute(pTypeEClass, PTYPE__DIR);
		createEAttribute(pTypeEClass, PTYPE__ID);
		createEAttribute(pTypeEClass, PTYPE__LANG);
		createEAttribute(pTypeEClass, PTYPE__LANG1);
		createEAttribute(pTypeEClass, PTYPE__STYLE);
		createEAttribute(pTypeEClass, PTYPE__TITLE);

		qTypeEClass = createEClass(QTYPE);
		createEAttribute(qTypeEClass, QTYPE__CITE1);
		createEAttribute(qTypeEClass, QTYPE__CLASS);
		createEAttribute(qTypeEClass, QTYPE__DIR);
		createEAttribute(qTypeEClass, QTYPE__ID);
		createEAttribute(qTypeEClass, QTYPE__LANG);
		createEAttribute(qTypeEClass, QTYPE__LANG1);
		createEAttribute(qTypeEClass, QTYPE__STYLE);
		createEAttribute(qTypeEClass, QTYPE__TITLE);

		sampTypeEClass = createEClass(SAMP_TYPE);
		createEAttribute(sampTypeEClass, SAMP_TYPE__CLASS);
		createEAttribute(sampTypeEClass, SAMP_TYPE__DIR);
		createEAttribute(sampTypeEClass, SAMP_TYPE__ID);
		createEAttribute(sampTypeEClass, SAMP_TYPE__LANG);
		createEAttribute(sampTypeEClass, SAMP_TYPE__LANG1);
		createEAttribute(sampTypeEClass, SAMP_TYPE__STYLE);
		createEAttribute(sampTypeEClass, SAMP_TYPE__TITLE);

		smallTypeEClass = createEClass(SMALL_TYPE);
		createEAttribute(smallTypeEClass, SMALL_TYPE__CLASS);
		createEAttribute(smallTypeEClass, SMALL_TYPE__DIR);
		createEAttribute(smallTypeEClass, SMALL_TYPE__ID);
		createEAttribute(smallTypeEClass, SMALL_TYPE__LANG);
		createEAttribute(smallTypeEClass, SMALL_TYPE__LANG1);
		createEAttribute(smallTypeEClass, SMALL_TYPE__STYLE);
		createEAttribute(smallTypeEClass, SMALL_TYPE__TITLE);

		spanTypeEClass = createEClass(SPAN_TYPE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__CLASS);
		createEAttribute(spanTypeEClass, SPAN_TYPE__DIR);
		createEAttribute(spanTypeEClass, SPAN_TYPE__ID);
		createEAttribute(spanTypeEClass, SPAN_TYPE__LANG);
		createEAttribute(spanTypeEClass, SPAN_TYPE__LANG1);
		createEAttribute(spanTypeEClass, SPAN_TYPE__STYLE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__TITLE);

		strongTypeEClass = createEClass(STRONG_TYPE);
		createEAttribute(strongTypeEClass, STRONG_TYPE__CLASS);
		createEAttribute(strongTypeEClass, STRONG_TYPE__DIR);
		createEAttribute(strongTypeEClass, STRONG_TYPE__ID);
		createEAttribute(strongTypeEClass, STRONG_TYPE__LANG);
		createEAttribute(strongTypeEClass, STRONG_TYPE__LANG1);
		createEAttribute(strongTypeEClass, STRONG_TYPE__STYLE);
		createEAttribute(strongTypeEClass, STRONG_TYPE__TITLE);

		subTypeEClass = createEClass(SUB_TYPE);
		createEAttribute(subTypeEClass, SUB_TYPE__CLASS);
		createEAttribute(subTypeEClass, SUB_TYPE__DIR);
		createEAttribute(subTypeEClass, SUB_TYPE__ID);
		createEAttribute(subTypeEClass, SUB_TYPE__LANG);
		createEAttribute(subTypeEClass, SUB_TYPE__LANG1);
		createEAttribute(subTypeEClass, SUB_TYPE__STYLE);
		createEAttribute(subTypeEClass, SUB_TYPE__TITLE);

		supTypeEClass = createEClass(SUP_TYPE);
		createEAttribute(supTypeEClass, SUP_TYPE__CLASS);
		createEAttribute(supTypeEClass, SUP_TYPE__DIR);
		createEAttribute(supTypeEClass, SUP_TYPE__ID);
		createEAttribute(supTypeEClass, SUP_TYPE__LANG);
		createEAttribute(supTypeEClass, SUP_TYPE__LANG1);
		createEAttribute(supTypeEClass, SUP_TYPE__STYLE);
		createEAttribute(supTypeEClass, SUP_TYPE__TITLE);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__CAPTION);
		createEReference(tableTypeEClass, TABLE_TYPE__COL);
		createEReference(tableTypeEClass, TABLE_TYPE__COLGROUP);
		createEReference(tableTypeEClass, TABLE_TYPE__THEAD);
		createEReference(tableTypeEClass, TABLE_TYPE__TFOOT);
		createEReference(tableTypeEClass, TABLE_TYPE__TBODY);
		createEReference(tableTypeEClass, TABLE_TYPE__TR);
		createEAttribute(tableTypeEClass, TABLE_TYPE__BORDER);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CELLPADDING);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CELLSPACING);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CLASS);
		createEAttribute(tableTypeEClass, TABLE_TYPE__DIR);
		createEAttribute(tableTypeEClass, TABLE_TYPE__FRAME);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);
		createEAttribute(tableTypeEClass, TABLE_TYPE__LANG);
		createEAttribute(tableTypeEClass, TABLE_TYPE__LANG1);
		createEAttribute(tableTypeEClass, TABLE_TYPE__RULES);
		createEAttribute(tableTypeEClass, TABLE_TYPE__STYLE);
		createEAttribute(tableTypeEClass, TABLE_TYPE__SUMMARY);
		createEAttribute(tableTypeEClass, TABLE_TYPE__TITLE);
		createEAttribute(tableTypeEClass, TABLE_TYPE__WIDTH);

		tbodyTypeEClass = createEClass(TBODY_TYPE);
		createEReference(tbodyTypeEClass, TBODY_TYPE__TR);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__ALIGN);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CHAR);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CHAROFF);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CLASS);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__DIR);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__ID);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__LANG);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__LANG1);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__STYLE);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__TITLE);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__VALIGN);

		tdTypeEClass = createEClass(TD_TYPE);
		createEAttribute(tdTypeEClass, TD_TYPE__ABBR1);
		createEAttribute(tdTypeEClass, TD_TYPE__ALIGN);
		createEAttribute(tdTypeEClass, TD_TYPE__AXIS);
		createEAttribute(tdTypeEClass, TD_TYPE__CHAR);
		createEAttribute(tdTypeEClass, TD_TYPE__CHAROFF);
		createEAttribute(tdTypeEClass, TD_TYPE__CLASS);
		createEAttribute(tdTypeEClass, TD_TYPE__COLSPAN);
		createEAttribute(tdTypeEClass, TD_TYPE__DIR);
		createEAttribute(tdTypeEClass, TD_TYPE__HEADERS);
		createEAttribute(tdTypeEClass, TD_TYPE__ID);
		createEAttribute(tdTypeEClass, TD_TYPE__LANG);
		createEAttribute(tdTypeEClass, TD_TYPE__LANG1);
		createEAttribute(tdTypeEClass, TD_TYPE__ROWSPAN);
		createEAttribute(tdTypeEClass, TD_TYPE__SCOPE);
		createEAttribute(tdTypeEClass, TD_TYPE__STYLE);
		createEAttribute(tdTypeEClass, TD_TYPE__TITLE);
		createEAttribute(tdTypeEClass, TD_TYPE__VALIGN);

		tfootTypeEClass = createEClass(TFOOT_TYPE);
		createEReference(tfootTypeEClass, TFOOT_TYPE__TR);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__ALIGN);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CHAR);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CHAROFF);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CLASS);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__DIR);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__ID);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__LANG);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__LANG1);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__STYLE);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__TITLE);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__VALIGN);

		theadTypeEClass = createEClass(THEAD_TYPE);
		createEReference(theadTypeEClass, THEAD_TYPE__TR);
		createEAttribute(theadTypeEClass, THEAD_TYPE__ALIGN);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CHAR);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CHAROFF);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CLASS);
		createEAttribute(theadTypeEClass, THEAD_TYPE__DIR);
		createEAttribute(theadTypeEClass, THEAD_TYPE__ID);
		createEAttribute(theadTypeEClass, THEAD_TYPE__LANG);
		createEAttribute(theadTypeEClass, THEAD_TYPE__LANG1);
		createEAttribute(theadTypeEClass, THEAD_TYPE__STYLE);
		createEAttribute(theadTypeEClass, THEAD_TYPE__TITLE);
		createEAttribute(theadTypeEClass, THEAD_TYPE__VALIGN);

		thTypeEClass = createEClass(TH_TYPE);
		createEAttribute(thTypeEClass, TH_TYPE__ABBR1);
		createEAttribute(thTypeEClass, TH_TYPE__ALIGN);
		createEAttribute(thTypeEClass, TH_TYPE__AXIS);
		createEAttribute(thTypeEClass, TH_TYPE__CHAR);
		createEAttribute(thTypeEClass, TH_TYPE__CHAROFF);
		createEAttribute(thTypeEClass, TH_TYPE__CLASS);
		createEAttribute(thTypeEClass, TH_TYPE__COLSPAN);
		createEAttribute(thTypeEClass, TH_TYPE__DIR);
		createEAttribute(thTypeEClass, TH_TYPE__HEADERS);
		createEAttribute(thTypeEClass, TH_TYPE__ID);
		createEAttribute(thTypeEClass, TH_TYPE__LANG);
		createEAttribute(thTypeEClass, TH_TYPE__LANG1);
		createEAttribute(thTypeEClass, TH_TYPE__ROWSPAN);
		createEAttribute(thTypeEClass, TH_TYPE__SCOPE);
		createEAttribute(thTypeEClass, TH_TYPE__STYLE);
		createEAttribute(thTypeEClass, TH_TYPE__TITLE);
		createEAttribute(thTypeEClass, TH_TYPE__VALIGN);

		trTypeEClass = createEClass(TR_TYPE);
		createEAttribute(trTypeEClass, TR_TYPE__GROUP);
		createEReference(trTypeEClass, TR_TYPE__TH);
		createEReference(trTypeEClass, TR_TYPE__TD);
		createEAttribute(trTypeEClass, TR_TYPE__ALIGN);
		createEAttribute(trTypeEClass, TR_TYPE__CHAR);
		createEAttribute(trTypeEClass, TR_TYPE__CHAROFF);
		createEAttribute(trTypeEClass, TR_TYPE__CLASS);
		createEAttribute(trTypeEClass, TR_TYPE__DIR);
		createEAttribute(trTypeEClass, TR_TYPE__ID);
		createEAttribute(trTypeEClass, TR_TYPE__LANG);
		createEAttribute(trTypeEClass, TR_TYPE__LANG1);
		createEAttribute(trTypeEClass, TR_TYPE__STYLE);
		createEAttribute(trTypeEClass, TR_TYPE__TITLE);
		createEAttribute(trTypeEClass, TR_TYPE__VALIGN);

		ttTypeEClass = createEClass(TT_TYPE);
		createEAttribute(ttTypeEClass, TT_TYPE__CLASS);
		createEAttribute(ttTypeEClass, TT_TYPE__DIR);
		createEAttribute(ttTypeEClass, TT_TYPE__ID);
		createEAttribute(ttTypeEClass, TT_TYPE__LANG);
		createEAttribute(ttTypeEClass, TT_TYPE__LANG1);
		createEAttribute(ttTypeEClass, TT_TYPE__STYLE);
		createEAttribute(ttTypeEClass, TT_TYPE__TITLE);

		ulTypeEClass = createEClass(UL_TYPE);
		createEReference(ulTypeEClass, UL_TYPE__LI);
		createEAttribute(ulTypeEClass, UL_TYPE__CLASS);
		createEAttribute(ulTypeEClass, UL_TYPE__DIR);
		createEAttribute(ulTypeEClass, UL_TYPE__ID);
		createEAttribute(ulTypeEClass, UL_TYPE__LANG);
		createEAttribute(ulTypeEClass, UL_TYPE__LANG1);
		createEAttribute(ulTypeEClass, UL_TYPE__STYLE);
		createEAttribute(ulTypeEClass, UL_TYPE__TITLE);

		varTypeEClass = createEClass(VAR_TYPE);
		createEAttribute(varTypeEClass, VAR_TYPE__CLASS);
		createEAttribute(varTypeEClass, VAR_TYPE__DIR);
		createEAttribute(varTypeEClass, VAR_TYPE__ID);
		createEAttribute(varTypeEClass, VAR_TYPE__LANG);
		createEAttribute(varTypeEClass, VAR_TYPE__LANG1);
		createEAttribute(varTypeEClass, VAR_TYPE__STYLE);
		createEAttribute(varTypeEClass, VAR_TYPE__TITLE);

		// Create enums
		alignTypeEEnum = createEEnum(ALIGN_TYPE);
		dirTypeEEnum = createEEnum(DIR_TYPE);
		dirType1EEnum = createEEnum(DIR_TYPE1);
		ismapTypeEEnum = createEEnum(ISMAP_TYPE);
		nohrefTypeEEnum = createEEnum(NOHREF_TYPE);
		scopeEEnum = createEEnum(SCOPE);
		shapeEEnum = createEEnum(SHAPE);
		tFrameEEnum = createEEnum(TFRAME);
		tRulesEEnum = createEEnum(TRULES);
		valignTypeEEnum = createEEnum(VALIGN_TYPE);

		// Create data types
		alignTypeObjectEDataType = createEDataType(ALIGN_TYPE_OBJECT);
		characterEDataType = createEDataType(CHARACTER);
		charsetEDataType = createEDataType(CHARSET);
		charsetsEDataType = createEDataType(CHARSETS);
		contentTypeEDataType = createEDataType(CONTENT_TYPE);
		contentTypesEDataType = createEDataType(CONTENT_TYPES);
		coordsEDataType = createEDataType(COORDS);
		datetimeEDataType = createEDataType(DATETIME);
		dirTypeObjectEDataType = createEDataType(DIR_TYPE_OBJECT);
		dirTypeObject1EDataType = createEDataType(DIR_TYPE_OBJECT1);
		ismapTypeObjectEDataType = createEDataType(ISMAP_TYPE_OBJECT);
		languageCodeEDataType = createEDataType(LANGUAGE_CODE);
		lengthEDataType = createEDataType(LENGTH);
		linkTypesEDataType = createEDataType(LINK_TYPES);
		mediaDescEDataType = createEDataType(MEDIA_DESC);
		multiLengthEDataType = createEDataType(MULTI_LENGTH);
		nohrefTypeObjectEDataType = createEDataType(NOHREF_TYPE_OBJECT);
		numberEDataType = createEDataType(NUMBER);
		pixelsEDataType = createEDataType(PIXELS);
		scopeObjectEDataType = createEDataType(SCOPE_OBJECT);
		scriptEDataType = createEDataType(SCRIPT);
		shapeObjectEDataType = createEDataType(SHAPE_OBJECT);
		styleSheetEDataType = createEDataType(STYLE_SHEET);
		tabindexNumberEDataType = createEDataType(TABINDEX_NUMBER);
		textEDataType = createEDataType(TEXT);
		tFrameObjectEDataType = createEDataType(TFRAME_OBJECT);
		tRulesObjectEDataType = createEDataType(TRULES_OBJECT);
		uriEDataType = createEDataType(URI);
		uriListEDataType = createEDataType(URI_LIST);
		valignTypeObjectEDataType = createEDataType(VALIGN_TYPE_OBJECT);
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
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abbrTypeEClass.getESuperTypes().add(this.getInline());
		acronymTypeEClass.getESuperTypes().add(this.getInline());
		addressTypeEClass.getESuperTypes().add(this.getInline());
		aTypeEClass.getESuperTypes().add(this.getAContent());
		bdoTypeEClass.getESuperTypes().add(this.getInline());
		bigTypeEClass.getESuperTypes().add(this.getInline());
		blockquoteTypeEClass.getESuperTypes().add(this.getBlock());
		bTypeEClass.getESuperTypes().add(this.getInline());
		captionTypeEClass.getESuperTypes().add(this.getInline());
		citeTypeEClass.getESuperTypes().add(this.getInline());
		codeTypeEClass.getESuperTypes().add(this.getInline());
		ddTypeEClass.getESuperTypes().add(this.getFlow());
		dfnTypeEClass.getESuperTypes().add(this.getInline());
		divTypeEClass.getESuperTypes().add(this.getFlow());
		dtTypeEClass.getESuperTypes().add(this.getInline());
		emTypeEClass.getESuperTypes().add(this.getInline());
		h1TypeEClass.getESuperTypes().add(this.getInline());
		h2TypeEClass.getESuperTypes().add(this.getInline());
		h3TypeEClass.getESuperTypes().add(this.getInline());
		h4TypeEClass.getESuperTypes().add(this.getInline());
		h5TypeEClass.getESuperTypes().add(this.getInline());
		h6TypeEClass.getESuperTypes().add(this.getInline());
		iTypeEClass.getESuperTypes().add(this.getInline());
		kbdTypeEClass.getESuperTypes().add(this.getInline());
		liTypeEClass.getESuperTypes().add(this.getFlow());
		preTypeEClass.getESuperTypes().add(this.getPreContent());
		pTypeEClass.getESuperTypes().add(this.getInline());
		qTypeEClass.getESuperTypes().add(this.getInline());
		sampTypeEClass.getESuperTypes().add(this.getInline());
		smallTypeEClass.getESuperTypes().add(this.getInline());
		spanTypeEClass.getESuperTypes().add(this.getInline());
		strongTypeEClass.getESuperTypes().add(this.getInline());
		subTypeEClass.getESuperTypes().add(this.getInline());
		supTypeEClass.getESuperTypes().add(this.getInline());
		tdTypeEClass.getESuperTypes().add(this.getFlow());
		thTypeEClass.getESuperTypes().add(this.getFlow());
		ttTypeEClass.getESuperTypes().add(this.getInline());
		varTypeEClass.getESuperTypes().add(this.getInline());

		// Initialize classes, features, and operations; add parameters
		initEClass(abbrTypeEClass, AbbrType.class, "AbbrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbbrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Dir(), this.getDirType(), "dir", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Style(), this.getStyleSheet(), "style", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Title(), this.getText(), "title", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aContentEClass, AContent.class, "AContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Br(), this.getBrType(), null, "br", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Span(), this.getSpanType(), null, "span", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Bdo(), this.getBdoType(), null, "bdo", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Map(), this.getMapType(), null, "map", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Img(), this.getImgType(), null, "img", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Tt(), this.getTtType(), null, "tt", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_I(), this.getIType(), null, "i", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_B(), this.getBType(), null, "b", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Big(), this.getBigType(), null, "big", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Small(), this.getSmallType(), null, "small", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Em(), this.getEmType(), null, "em", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Strong(), this.getStrongType(), null, "strong", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Code(), this.getCodeType(), null, "code", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Q(), this.getQType(), null, "q", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Samp(), this.getSampType(), null, "samp", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Var(), this.getVarType(), null, "var", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Cite(), this.getCiteType(), null, "cite", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Sub(), this.getSubType(), null, "sub", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Sup(), this.getSupType(), null, "sup", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(acronymTypeEClass, AcronymType.class, "AcronymType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcronymType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Dir(), this.getDirType(), "dir", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Style(), this.getStyleSheet(), "style", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Title(), this.getText(), "title", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Dir(), this.getDirType(), "dir", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Style(), this.getStyleSheet(), "style", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Title(), this.getText(), "title", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaTypeEClass, AreaType.class, "AreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAreaType_Accesskey(), this.getCharacter(), "accesskey", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Alt(), this.getText(), "alt", null, 1, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Coords(), this.getCoords(), "coords", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Dir(), this.getDirType(), "dir", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Href(), this.getURI(), "href", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Nohref(), this.getNohrefType(), "nohref", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Shape(), this.getShape(), "shape", "rect", 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Style(), this.getStyleSheet(), "style", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Tabindex(), this.getTabindexNumber(), "tabindex", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAreaType_Title(), this.getText(), "title", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aTypeEClass, AType.class, "AType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAType_Accesskey(), this.getCharacter(), "accesskey", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Charset(), this.getCharset(), "charset", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Coords(), this.getCoords(), "coords", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Dir(), this.getDirType(), "dir", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Href(), this.getURI(), "href", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Hreflang(), this.getLanguageCode(), "hreflang", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Rel(), this.getLinkTypes(), "rel", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Rev(), this.getLinkTypes(), "rev", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Shape(), this.getShape(), "shape", "rect", 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Style(), this.getStyleSheet(), "style", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Tabindex(), this.getTabindexNumber(), "tabindex", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Title(), this.getText(), "title", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Type(), this.getContentType(), "type", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bdoTypeEClass, BdoType.class, "BdoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBdoType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Dir(), this.getDirType1(), "dir", null, 1, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Style(), this.getStyleSheet(), "style", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBdoType_Title(), this.getText(), "title", null, 0, 1, BdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigTypeEClass, BigType.class, "BigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Dir(), this.getDirType(), "dir", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Style(), this.getStyleSheet(), "style", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Title(), this.getText(), "title", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Block(), ecorePackage.getEFeatureMapEntry(), "block", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_P(), this.getPType(), null, "p", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H1(), this.getH1Type(), null, "h1", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H2(), this.getH2Type(), null, "h2", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H3(), this.getH3Type(), null, "h3", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H4(), this.getH4Type(), null, "h4", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H5(), this.getH5Type(), null, "h5", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H6(), this.getH6Type(), null, "h6", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Div(), this.getDivType(), null, "div", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ul(), this.getUlType(), null, "ul", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ol(), this.getOlType(), null, "ol", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Dl(), this.getDlType(), null, "dl", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Pre(), this.getPreType(), null, "pre", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Hr(), this.getHrType(), null, "hr", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Address(), this.getAddressType(), null, "address", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Table(), this.getTableType(), null, "table", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(blockquoteTypeEClass, BlockquoteType.class, "BlockquoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockquoteType_Cite(), this.getURI(), "cite", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Dir(), this.getDirType(), "dir", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Style(), this.getStyleSheet(), "style", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Title(), this.getText(), "title", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeEClass, BrType.class, "BrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Style(), this.getStyleSheet(), "style", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Title(), this.getText(), "title", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTypeEClass, BType.class, "BType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Dir(), this.getDirType(), "dir", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Style(), this.getStyleSheet(), "style", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Title(), this.getText(), "title", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(captionTypeEClass, CaptionType.class, "CaptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaptionType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Dir(), this.getDirType(), "dir", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Style(), this.getStyleSheet(), "style", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Title(), this.getText(), "title", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citeTypeEClass, CiteType.class, "CiteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCiteType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Dir(), this.getDirType(), "dir", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Style(), this.getStyleSheet(), "style", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Title(), this.getText(), "title", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeTypeEClass, CodeType.class, "CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Dir(), this.getDirType(), "dir", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Style(), this.getStyleSheet(), "style", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Title(), this.getText(), "title", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colgroupTypeEClass, ColgroupType.class, "ColgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColgroupType_Col(), this.getColType(), null, "col", null, 0, -1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Align(), this.getAlignType(), "align", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Char(), this.getCharacter(), "char", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Charoff(), this.getLength(), "charoff", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Dir(), this.getDirType(), "dir", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Span(), this.getNumber(), "span", "1", 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Style(), this.getStyleSheet(), "style", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Title(), this.getText(), "title", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Valign(), this.getValignType(), "valign", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Width(), this.getMultiLength(), "width", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colTypeEClass, ColType.class, "ColType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColType_Align(), this.getAlignType(), "align", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Char(), this.getCharacter(), "char", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Charoff(), this.getLength(), "charoff", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Dir(), this.getDirType(), "dir", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Span(), this.getNumber(), "span", "1", 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Style(), this.getStyleSheet(), "style", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Title(), this.getText(), "title", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Valign(), this.getValignType(), "valign", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Width(), this.getMultiLength(), "width", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddTypeEClass, DdType.class, "DdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Dir(), this.getDirType(), "dir", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Style(), this.getStyleSheet(), "style", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Title(), this.getText(), "title", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dfnTypeEClass, DfnType.class, "DfnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDfnType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Dir(), this.getDirType(), "dir", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Style(), this.getStyleSheet(), "style", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Title(), this.getText(), "title", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divTypeEClass, DivType.class, "DivType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Dir(), this.getDirType(), "dir", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Style(), this.getStyleSheet(), "style", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Title(), this.getText(), "title", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dlTypeEClass, DlType.class, "DlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDlType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDlType_Dt(), this.getDtType(), null, "dt", null, 0, -1, DlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDlType_Dd(), this.getDdType(), null, "dd", null, 0, -1, DlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Dir(), this.getDirType(), "dir", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Style(), this.getStyleSheet(), "style", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Title(), this.getText(), "title", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_A(), this.getAType(), null, "a", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Area(), this.getAreaType(), null, "area", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_B(), this.getBType(), null, "b", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bdo(), this.getBdoType(), null, "bdo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Big(), this.getBigType(), null, "big", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Br(), this.getBrType(), null, "br", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Caption(), this.getCaptionType(), null, "caption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cite(), this.getCiteType(), null, "cite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Code(), this.getCodeType(), null, "code", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Col(), this.getColType(), null, "col", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Colgroup(), this.getColgroupType(), null, "colgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dd(), this.getDdType(), null, "dd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dfn(), this.getDfnType(), null, "dfn", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Div(), this.getDivType(), null, "div", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dl(), this.getDlType(), null, "dl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dt(), this.getDtType(), null, "dt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Em(), this.getEmType(), null, "em", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H1(), this.getH1Type(), null, "h1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H2(), this.getH2Type(), null, "h2", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H3(), this.getH3Type(), null, "h3", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H4(), this.getH4Type(), null, "h4", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H5(), this.getH5Type(), null, "h5", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H6(), this.getH6Type(), null, "h6", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Hr(), this.getHrType(), null, "hr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_I(), this.getIType(), null, "i", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Img(), this.getImgType(), null, "img", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Kbd(), this.getKbdType(), null, "kbd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Li(), this.getLiType(), null, "li", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Map(), this.getMapType(), null, "map", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ol(), this.getOlType(), null, "ol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_P(), this.getPType(), null, "p", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Pre(), this.getPreType(), null, "pre", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Q(), this.getQType(), null, "q", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Samp(), this.getSampType(), null, "samp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Small(), this.getSmallType(), null, "small", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Span(), this.getSpanType(), null, "span", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Strong(), this.getStrongType(), null, "strong", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sub(), this.getSubType(), null, "sub", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sup(), this.getSupType(), null, "sup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Table(), this.getTableType(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Td(), this.getTdType(), null, "td", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tfoot(), this.getTfootType(), null, "tfoot", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Th(), this.getThType(), null, "th", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Thead(), this.getTheadType(), null, "thead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tr(), this.getTrType(), null, "tr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tt(), this.getTtType(), null, "tt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ul(), this.getUlType(), null, "ul", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Var(), this.getVarType(), null, "var", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dtTypeEClass, DtType.class, "DtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDtType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Dir(), this.getDirType(), "dir", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Style(), this.getStyleSheet(), "style", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Title(), this.getText(), "title", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emTypeEClass, EmType.class, "EmType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Dir(), this.getDirType(), "dir", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Style(), this.getStyleSheet(), "style", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Title(), this.getText(), "title", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_P(), this.getPType(), null, "p", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H1(), this.getH1Type(), null, "h1", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H2(), this.getH2Type(), null, "h2", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H3(), this.getH3Type(), null, "h3", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H4(), this.getH4Type(), null, "h4", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H5(), this.getH5Type(), null, "h5", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H6(), this.getH6Type(), null, "h6", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Div(), this.getDivType(), null, "div", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Ul(), this.getUlType(), null, "ul", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Ol(), this.getOlType(), null, "ol", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Dl(), this.getDlType(), null, "dl", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Pre(), this.getPreType(), null, "pre", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Hr(), this.getHrType(), null, "hr", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Address(), this.getAddressType(), null, "address", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Table(), this.getTableType(), null, "table", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_A(), this.getAType(), null, "a", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Br(), this.getBrType(), null, "br", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Span(), this.getSpanType(), null, "span", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Bdo(), this.getBdoType(), null, "bdo", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Map(), this.getMapType(), null, "map", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Img(), this.getImgType(), null, "img", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Tt(), this.getTtType(), null, "tt", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_I(), this.getIType(), null, "i", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_B(), this.getBType(), null, "b", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Big(), this.getBigType(), null, "big", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Small(), this.getSmallType(), null, "small", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Em(), this.getEmType(), null, "em", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Strong(), this.getStrongType(), null, "strong", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Code(), this.getCodeType(), null, "code", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Q(), this.getQType(), null, "q", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Samp(), this.getSampType(), null, "samp", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Var(), this.getVarType(), null, "var", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Cite(), this.getCiteType(), null, "cite", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Sub(), this.getSubType(), null, "sub", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Sup(), this.getSupType(), null, "sup", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(h1TypeEClass, H1Type.class, "H1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Dir(), this.getDirType(), "dir", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Title(), this.getText(), "title", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2TypeEClass, H2Type.class, "H2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH2Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Dir(), this.getDirType(), "dir", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Title(), this.getText(), "title", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h3TypeEClass, H3Type.class, "H3Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH3Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Dir(), this.getDirType(), "dir", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Title(), this.getText(), "title", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h4TypeEClass, H4Type.class, "H4Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH4Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Dir(), this.getDirType(), "dir", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Title(), this.getText(), "title", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h5TypeEClass, H5Type.class, "H5Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH5Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Dir(), this.getDirType(), "dir", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Title(), this.getText(), "title", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h6TypeEClass, H6Type.class, "H6Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH6Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Dir(), this.getDirType(), "dir", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Lang(), this.getLanguageCode(), "lang", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Title(), this.getText(), "title", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hrTypeEClass, HrType.class, "HrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Dir(), this.getDirType(), "dir", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Style(), this.getStyleSheet(), "style", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Title(), this.getText(), "title", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imgTypeEClass, ImgType.class, "ImgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImgType_Alt(), this.getText(), "alt", null, 1, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Dir(), this.getDirType(), "dir", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Height(), this.getLength(), "height", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Ismap(), this.getIsmapType(), "ismap", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Longdesc(), this.getURI(), "longdesc", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Src(), this.getURI(), "src", null, 1, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Style(), this.getStyleSheet(), "style", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Title(), this.getText(), "title", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Usemap(), this.getURI(), "usemap", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Width(), this.getLength(), "width", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineEClass, Inline.class, "Inline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInline_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Inline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInline_Inline(), ecorePackage.getEFeatureMapEntry(), "inline", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_A(), this.getAType(), null, "a", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Br(), this.getBrType(), null, "br", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Span(), this.getSpanType(), null, "span", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Bdo(), this.getBdoType(), null, "bdo", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Map(), this.getMapType(), null, "map", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Img(), this.getImgType(), null, "img", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Tt(), this.getTtType(), null, "tt", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_I(), this.getIType(), null, "i", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_B(), this.getBType(), null, "b", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Big(), this.getBigType(), null, "big", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Small(), this.getSmallType(), null, "small", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Em(), this.getEmType(), null, "em", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Strong(), this.getStrongType(), null, "strong", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Code(), this.getCodeType(), null, "code", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Q(), this.getQType(), null, "q", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Samp(), this.getSampType(), null, "samp", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Var(), this.getVarType(), null, "var", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Cite(), this.getCiteType(), null, "cite", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Sub(), this.getSubType(), null, "sub", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Sup(), this.getSupType(), null, "sup", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iTypeEClass, IType.class, "IType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Dir(), this.getDirType(), "dir", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Style(), this.getStyleSheet(), "style", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Title(), this.getText(), "title", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kbdTypeEClass, KbdType.class, "KbdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKbdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Dir(), this.getDirType(), "dir", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Style(), this.getStyleSheet(), "style", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Title(), this.getText(), "title", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liTypeEClass, LiType.class, "LiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Dir(), this.getDirType(), "dir", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Style(), this.getStyleSheet(), "style", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Title(), this.getText(), "title", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapTypeEClass, MapType.class, "MapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapType_Block(), ecorePackage.getEFeatureMapEntry(), "block", null, 0, -1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_P(), this.getPType(), null, "p", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H1(), this.getH1Type(), null, "h1", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H2(), this.getH2Type(), null, "h2", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H3(), this.getH3Type(), null, "h3", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H4(), this.getH4Type(), null, "h4", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H5(), this.getH5Type(), null, "h5", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_H6(), this.getH6Type(), null, "h6", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Div(), this.getDivType(), null, "div", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Ul(), this.getUlType(), null, "ul", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Ol(), this.getOlType(), null, "ol", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Dl(), this.getDlType(), null, "dl", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Pre(), this.getPreType(), null, "pre", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Hr(), this.getHrType(), null, "hr", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Address(), this.getAddressType(), null, "address", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Table(), this.getTableType(), null, "table", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Area(), this.getAreaType(), null, "area", null, 0, -1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Class(), theXMLTypePackage.getAnySimpleType(), "class", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Dir(), this.getDirType(), "dir", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Style(), this.getStyleSheet(), "style", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_Title(), this.getText(), "title", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(olTypeEClass, OlType.class, "OlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOlType_Li(), this.getLiType(), null, "li", null, 1, -1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Dir(), this.getDirType(), "dir", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Style(), this.getStyleSheet(), "style", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Title(), this.getText(), "title", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preContentEClass, PreContent.class, "PreContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PreContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_A(), this.getAType(), null, "a", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Tt(), this.getTtType(), null, "tt", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_I(), this.getIType(), null, "i", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_B(), this.getBType(), null, "b", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Big(), this.getBigType(), null, "big", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Small(), this.getSmallType(), null, "small", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Em(), this.getEmType(), null, "em", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Strong(), this.getStrongType(), null, "strong", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Code(), this.getCodeType(), null, "code", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Q(), this.getQType(), null, "q", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Samp(), this.getSampType(), null, "samp", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Var(), this.getVarType(), null, "var", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Cite(), this.getCiteType(), null, "cite", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Sub(), this.getSubType(), null, "sub", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Sup(), this.getSupType(), null, "sup", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Br(), this.getBrType(), null, "br", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Span(), this.getSpanType(), null, "span", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Bdo(), this.getBdoType(), null, "bdo", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Map(), this.getMapType(), null, "map", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(preTypeEClass, PreType.class, "PreType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Dir(), this.getDirType(), "dir", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Space(), theXMLNamespacePackage.getSpaceType(), "space", "preserve", 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Style(), this.getStyleSheet(), "style", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Title(), this.getText(), "title", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pTypeEClass, PType.class, "PType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Dir(), this.getDirType(), "dir", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Style(), this.getStyleSheet(), "style", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Title(), this.getText(), "title", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qTypeEClass, QType.class, "QType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQType_Cite1(), this.getURI(), "cite1", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Dir(), this.getDirType(), "dir", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Style(), this.getStyleSheet(), "style", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Title(), this.getText(), "title", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampTypeEClass, SampType.class, "SampType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Dir(), this.getDirType(), "dir", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Style(), this.getStyleSheet(), "style", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Title(), this.getText(), "title", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smallTypeEClass, SmallType.class, "SmallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmallType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Dir(), this.getDirType(), "dir", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Style(), this.getStyleSheet(), "style", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Title(), this.getText(), "title", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanTypeEClass, SpanType.class, "SpanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Dir(), this.getDirType(), "dir", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Style(), this.getStyleSheet(), "style", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Title(), this.getText(), "title", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strongTypeEClass, StrongType.class, "StrongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrongType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Dir(), this.getDirType(), "dir", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Style(), this.getStyleSheet(), "style", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Title(), this.getText(), "title", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subTypeEClass, SubType.class, "SubType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Dir(), this.getDirType(), "dir", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Style(), this.getStyleSheet(), "style", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Title(), this.getText(), "title", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supTypeEClass, SupType.class, "SupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Dir(), this.getDirType(), "dir", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Style(), this.getStyleSheet(), "style", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Title(), this.getText(), "title", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Caption(), this.getCaptionType(), null, "caption", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Col(), this.getColType(), null, "col", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Colgroup(), this.getColgroupType(), null, "colgroup", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Thead(), this.getTheadType(), null, "thead", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tfoot(), this.getTfootType(), null, "tfoot", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tr(), this.getTrType(), null, "tr", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Border(), this.getPixels(), "border", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Cellpadding(), this.getLength(), "cellpadding", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Cellspacing(), this.getLength(), "cellspacing", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Dir(), this.getDirType(), "dir", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Frame(), this.getTFrame(), "frame", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Rules(), this.getTRules(), "rules", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Style(), this.getStyleSheet(), "style", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Summary(), this.getText(), "summary", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Title(), this.getText(), "title", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Width(), this.getLength(), "width", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tbodyTypeEClass, TbodyType.class, "TbodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTbodyType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Align(), this.getAlignType(), "align", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Char(), this.getCharacter(), "char", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Charoff(), this.getLength(), "charoff", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Dir(), this.getDirType(), "dir", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Style(), this.getStyleSheet(), "style", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Title(), this.getText(), "title", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Valign(), this.getValignType(), "valign", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdTypeEClass, TdType.class, "TdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTdType_Abbr1(), this.getText(), "abbr1", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Align(), this.getAlignType(), "align", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Axis(), theXMLTypePackage.getAnySimpleType(), "axis", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Char(), this.getCharacter(), "char", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Charoff(), this.getLength(), "charoff", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Colspan(), this.getNumber(), "colspan", "1", 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Dir(), this.getDirType(), "dir", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Headers(), theXMLTypePackage.getIDREFS(), "headers", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Rowspan(), this.getNumber(), "rowspan", "1", 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Scope(), this.getScope(), "scope", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Style(), this.getStyleSheet(), "style", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Title(), this.getText(), "title", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Valign(), this.getValignType(), "valign", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tfootTypeEClass, TfootType.class, "TfootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTfootType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Align(), this.getAlignType(), "align", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Char(), this.getCharacter(), "char", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Charoff(), this.getLength(), "charoff", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Dir(), this.getDirType(), "dir", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Style(), this.getStyleSheet(), "style", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Title(), this.getText(), "title", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Valign(), this.getValignType(), "valign", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theadTypeEClass, TheadType.class, "TheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheadType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Align(), this.getAlignType(), "align", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Char(), this.getCharacter(), "char", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Charoff(), this.getLength(), "charoff", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Dir(), this.getDirType(), "dir", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Style(), this.getStyleSheet(), "style", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Title(), this.getText(), "title", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Valign(), this.getValignType(), "valign", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thTypeEClass, ThType.class, "ThType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThType_Abbr1(), this.getText(), "abbr1", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Align(), this.getAlignType(), "align", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Axis(), theXMLTypePackage.getAnySimpleType(), "axis", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Char(), this.getCharacter(), "char", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Charoff(), this.getLength(), "charoff", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Colspan(), this.getNumber(), "colspan", "1", 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Dir(), this.getDirType(), "dir", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Headers(), theXMLTypePackage.getIDREFS(), "headers", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Rowspan(), this.getNumber(), "rowspan", "1", 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Scope(), this.getScope(), "scope", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Style(), this.getStyleSheet(), "style", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Title(), this.getText(), "title", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Valign(), this.getValignType(), "valign", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trTypeEClass, TrType.class, "TrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrType_Th(), this.getThType(), null, "th", null, 0, -1, TrType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrType_Td(), this.getTdType(), null, "td", null, 0, -1, TrType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Align(), this.getAlignType(), "align", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Char(), this.getCharacter(), "char", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Charoff(), this.getLength(), "charoff", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Dir(), this.getDirType(), "dir", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Style(), this.getStyleSheet(), "style", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Title(), this.getText(), "title", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Valign(), this.getValignType(), "valign", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttTypeEClass, TtType.class, "TtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTtType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Dir(), this.getDirType(), "dir", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Style(), this.getStyleSheet(), "style", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Title(), this.getText(), "title", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ulTypeEClass, UlType.class, "UlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUlType_Li(), this.getLiType(), null, "li", null, 1, -1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Dir(), this.getDirType(), "dir", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Style(), this.getStyleSheet(), "style", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Title(), this.getText(), "title", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Dir(), this.getDirType(), "dir", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Lang(), this.getLanguageCode(), "lang", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Lang1(), theXMLNamespacePackage.getLangType(), "lang1", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Style(), this.getStyleSheet(), "style", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Title(), this.getText(), "title", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignTypeEEnum, AlignType.class, "AlignType");
		addEEnumLiteral(alignTypeEEnum, AlignType.LEFT);
		addEEnumLiteral(alignTypeEEnum, AlignType.CENTER);
		addEEnumLiteral(alignTypeEEnum, AlignType.RIGHT);
		addEEnumLiteral(alignTypeEEnum, AlignType.JUSTIFY);
		addEEnumLiteral(alignTypeEEnum, AlignType.CHAR);

		initEEnum(dirTypeEEnum, DirType.class, "DirType");
		addEEnumLiteral(dirTypeEEnum, DirType.LTR);
		addEEnumLiteral(dirTypeEEnum, DirType.RTL);

		initEEnum(dirType1EEnum, DirType1.class, "DirType1");
		addEEnumLiteral(dirType1EEnum, DirType1.LTR);
		addEEnumLiteral(dirType1EEnum, DirType1.RTL);

		initEEnum(ismapTypeEEnum, IsmapType.class, "IsmapType");
		addEEnumLiteral(ismapTypeEEnum, IsmapType.ISMAP);

		initEEnum(nohrefTypeEEnum, NohrefType.class, "NohrefType");
		addEEnumLiteral(nohrefTypeEEnum, NohrefType.NOHREF);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.ROW);
		addEEnumLiteral(scopeEEnum, Scope.COL);
		addEEnumLiteral(scopeEEnum, Scope.ROWGROUP);
		addEEnumLiteral(scopeEEnum, Scope.COLGROUP);

		initEEnum(shapeEEnum, Shape.class, "Shape");
		addEEnumLiteral(shapeEEnum, Shape.RECT);
		addEEnumLiteral(shapeEEnum, Shape.CIRCLE);
		addEEnumLiteral(shapeEEnum, Shape.POLY);
		addEEnumLiteral(shapeEEnum, Shape.DEFAULT);

		initEEnum(tFrameEEnum, TFrame.class, "TFrame");
		addEEnumLiteral(tFrameEEnum, TFrame.VOID);
		addEEnumLiteral(tFrameEEnum, TFrame.ABOVE);
		addEEnumLiteral(tFrameEEnum, TFrame.BELOW);
		addEEnumLiteral(tFrameEEnum, TFrame.HSIDES);
		addEEnumLiteral(tFrameEEnum, TFrame.LHS);
		addEEnumLiteral(tFrameEEnum, TFrame.RHS);
		addEEnumLiteral(tFrameEEnum, TFrame.VSIDES);
		addEEnumLiteral(tFrameEEnum, TFrame.BOX);
		addEEnumLiteral(tFrameEEnum, TFrame.BORDER);

		initEEnum(tRulesEEnum, TRules.class, "TRules");
		addEEnumLiteral(tRulesEEnum, TRules.NONE);
		addEEnumLiteral(tRulesEEnum, TRules.GROUPS);
		addEEnumLiteral(tRulesEEnum, TRules.ROWS);
		addEEnumLiteral(tRulesEEnum, TRules.COLS);
		addEEnumLiteral(tRulesEEnum, TRules.ALL);

		initEEnum(valignTypeEEnum, ValignType.class, "ValignType");
		addEEnumLiteral(valignTypeEEnum, ValignType.TOP);
		addEEnumLiteral(valignTypeEEnum, ValignType.MIDDLE);
		addEEnumLiteral(valignTypeEEnum, ValignType.BOTTOM);
		addEEnumLiteral(valignTypeEEnum, ValignType.BASELINE);

		// Initialize data types
		initEDataType(alignTypeObjectEDataType, AlignType.class, "AlignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(characterEDataType, String.class, "Character", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charsetEDataType, String.class, "Charset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charsetsEDataType, String.class, "Charsets", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentTypeEDataType, String.class, "ContentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentTypesEDataType, String.class, "ContentTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordsEDataType, String.class, "Coords", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datetimeEDataType, XMLGregorianCalendar.class, "Datetime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dirTypeObjectEDataType, DirType.class, "DirTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dirTypeObject1EDataType, DirType1.class, "DirTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ismapTypeObjectEDataType, IsmapType.class, "IsmapTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageCodeEDataType, String.class, "LanguageCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lengthEDataType, String.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(linkTypesEDataType, List.class, "LinkTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mediaDescEDataType, String.class, "MediaDesc", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multiLengthEDataType, String.class, "MultiLength", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nohrefTypeObjectEDataType, NohrefType.class, "NohrefTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, BigInteger.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pixelsEDataType, BigInteger.class, "Pixels", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scopeObjectEDataType, Scope.class, "ScopeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scriptEDataType, String.class, "Script", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shapeObjectEDataType, Shape.class, "ShapeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleSheetEDataType, String.class, "StyleSheet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tabindexNumberEDataType, BigInteger.class, "TabindexNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textEDataType, String.class, "Text", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tFrameObjectEDataType, TFrame.class, "TFrameObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tRulesObjectEDataType, TRules.class, "TRulesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriListEDataType, String.class, "UriList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valignTypeObjectEDataType, ValignType.class, "ValignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (abbrTypeEClass,
		   source,
		   new String[] {
			   "name", "abbr_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAbbrType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getAbbrType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getAbbrType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAbbrType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getAbbrType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getAbbrType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getAbbrType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (aContentEClass,
		   source,
		   new String[] {
			   "name", "a.content",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAContent_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getAContent_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getAContent_Br(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "br",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Span(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "span",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Bdo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bdo",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Map(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "map",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Img(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "img",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Big(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "big",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Small(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "small",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Dfn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dfn",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Q(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "q",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Samp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "samp",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Kbd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kbd",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Cite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cite",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Abbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abbr",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Acronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acronym",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getAContent_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (acronymTypeEClass,
		   source,
		   new String[] {
			   "name", "acronym_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAcronymType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getAcronymType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getAcronymType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAcronymType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getAcronymType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getAcronymType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getAcronymType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (addressTypeEClass,
		   source,
		   new String[] {
			   "name", "address_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAddressType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getAddressType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getAddressType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAddressType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getAddressType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getAddressType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getAddressType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (alignTypeEEnum,
		   source,
		   new String[] {
			   "name", "align_._type"
		   });
		addAnnotation
		  (alignTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "align_._type:Object",
			   "baseType", "align_._type"
		   });
		addAnnotation
		  (areaTypeEClass,
		   source,
		   new String[] {
			   "name", "area_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAreaType_Accesskey(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accesskey"
		   });
		addAnnotation
		  (getAreaType_Alt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "alt"
		   });
		addAnnotation
		  (getAreaType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getAreaType_Coords(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "coords"
		   });
		addAnnotation
		  (getAreaType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getAreaType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getAreaType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAreaType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getAreaType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getAreaType_Nohref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nohref"
		   });
		addAnnotation
		  (getAreaType_Shape(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "shape"
		   });
		addAnnotation
		  (getAreaType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getAreaType_Tabindex(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "tabindex"
		   });
		addAnnotation
		  (getAreaType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (aTypeEClass,
		   source,
		   new String[] {
			   "name", "a_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAType_Accesskey(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accesskey"
		   });
		addAnnotation
		  (getAType_Charset(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charset"
		   });
		addAnnotation
		  (getAType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getAType_Coords(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "coords"
		   });
		addAnnotation
		  (getAType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getAType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getAType_Hreflang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hreflang"
		   });
		addAnnotation
		  (getAType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getAType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getAType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getAType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getAType_Rel(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rel"
		   });
		addAnnotation
		  (getAType_Rev(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rev"
		   });
		addAnnotation
		  (getAType_Shape(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "shape"
		   });
		addAnnotation
		  (getAType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getAType_Tabindex(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "tabindex"
		   });
		addAnnotation
		  (getAType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getAType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (bdoTypeEClass,
		   source,
		   new String[] {
			   "name", "bdo_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getBdoType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getBdoType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getBdoType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getBdoType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getBdoType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getBdoType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getBdoType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (bigTypeEClass,
		   source,
		   new String[] {
			   "name", "big_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getBigType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getBigType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getBigType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getBigType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getBigType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getBigType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getBigType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (blockEClass,
		   source,
		   new String[] {
			   "name", "Block",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Block(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Block:0"
		   });
		addAnnotation
		  (getBlock_P(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "p",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h1",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h2",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h3",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h4",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h5",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_H6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h6",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "div",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Ul(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ul",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Ol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ol",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Dl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dl",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Pre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pre",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Hr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hr",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Blockquote(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "blockquote",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getBlock_Table(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "table",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (blockquoteTypeEClass,
		   source,
		   new String[] {
			   "name", "blockquote_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlockquoteType_Cite(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cite"
		   });
		addAnnotation
		  (getBlockquoteType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getBlockquoteType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getBlockquoteType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getBlockquoteType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getBlockquoteType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getBlockquoteType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getBlockquoteType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (brTypeEClass,
		   source,
		   new String[] {
			   "name", "br_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBrType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getBrType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getBrType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getBrType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (bTypeEClass,
		   source,
		   new String[] {
			   "name", "b_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getBType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getBType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getBType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getBType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getBType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getBType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getBType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (captionTypeEClass,
		   source,
		   new String[] {
			   "name", "caption_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCaptionType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getCaptionType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getCaptionType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getCaptionType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getCaptionType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getCaptionType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getCaptionType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (characterEDataType,
		   source,
		   new String[] {
			   "name", "Character",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "length", "1"
		   });
		addAnnotation
		  (charsetEDataType,
		   source,
		   new String[] {
			   "name", "Charset",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (charsetsEDataType,
		   source,
		   new String[] {
			   "name", "Charsets",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (citeTypeEClass,
		   source,
		   new String[] {
			   "name", "cite_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCiteType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getCiteType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getCiteType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getCiteType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getCiteType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getCiteType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getCiteType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (codeTypeEClass,
		   source,
		   new String[] {
			   "name", "code_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCodeType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getCodeType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getCodeType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getCodeType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getCodeType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getCodeType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getCodeType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (colgroupTypeEClass,
		   source,
		   new String[] {
			   "name", "colgroup_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getColgroupType_Col(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "col",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getColgroupType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getColgroupType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getColgroupType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getColgroupType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getColgroupType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getColgroupType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getColgroupType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getColgroupType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getColgroupType_Span(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "span"
		   });
		addAnnotation
		  (getColgroupType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getColgroupType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getColgroupType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (getColgroupType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (colTypeEClass,
		   source,
		   new String[] {
			   "name", "col_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getColType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getColType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getColType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getColType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getColType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getColType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getColType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getColType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getColType_Span(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "span"
		   });
		addAnnotation
		  (getColType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getColType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getColType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (getColType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (contentTypeEDataType,
		   source,
		   new String[] {
			   "name", "ContentType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (contentTypesEDataType,
		   source,
		   new String[] {
			   "name", "ContentTypes",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (coordsEDataType,
		   source,
		   new String[] {
			   "name", "Coords",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[-+]?(\\d+|\\d+(\\.\\d+)?%25)(,\\s*[-+]?(\\d+|\\d+(\\.\\d+)?%25))*"
		   });
		addAnnotation
		  (datetimeEDataType,
		   source,
		   new String[] {
			   "name", "Datetime",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
		addAnnotation
		  (ddTypeEClass,
		   source,
		   new String[] {
			   "name", "dd_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDdType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getDdType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getDdType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDdType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getDdType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getDdType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getDdType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (dfnTypeEClass,
		   source,
		   new String[] {
			   "name", "dfn_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDfnType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getDfnType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getDfnType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDfnType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getDfnType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getDfnType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getDfnType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (dirTypeEEnum,
		   source,
		   new String[] {
			   "name", "dir_._type"
		   });
		addAnnotation
		  (dirType1EEnum,
		   source,
		   new String[] {
			   "name", "dir_._1_._type"
		   });
		addAnnotation
		  (dirTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "dir_._type:Object",
			   "baseType", "dir_._type"
		   });
		addAnnotation
		  (dirTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "dir_._1_._type:Object",
			   "baseType", "dir_._1_._type"
		   });
		addAnnotation
		  (divTypeEClass,
		   source,
		   new String[] {
			   "name", "div_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDivType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getDivType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getDivType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDivType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getDivType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getDivType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getDivType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (dlTypeEClass,
		   source,
		   new String[] {
			   "name", "dl_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDlType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getDlType_Dt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dt",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDlType_Dd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dd",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDlType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getDlType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getDlType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDlType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getDlType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getDlType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getDlType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
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
		  (getDocumentRoot_A(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "a",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Abbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Acronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acronym",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Area(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "area",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Bdo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bdo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Big(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "big",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Blockquote(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "blockquote",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Br(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "br",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Caption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Cite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cite",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Col(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "col",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Colgroup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "colgroup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dfn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dfn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "div",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_H6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Hr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Img(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "img",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Kbd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kbd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Li(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "li",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Map(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "map",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Ol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ol",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_P(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "p",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Pre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pre",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Q(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "q",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Samp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "samp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Small(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "small",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Span(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "span",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Table(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "table",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tbody(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tbody",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Td(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "td",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tfoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tfoot",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Th(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "th",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Thead(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "thead",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Ul(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ul",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dtTypeEClass,
		   source,
		   new String[] {
			   "name", "dt_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDtType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getDtType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getDtType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDtType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getDtType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getDtType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getDtType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (emTypeEClass,
		   source,
		   new String[] {
			   "name", "em_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getEmType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getEmType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getEmType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getEmType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getEmType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getEmType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getEmType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "name", "Flow",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getFlow_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getFlow_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getFlow_P(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "p",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h1",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h2",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h3",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h4",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h5",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_H6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h6",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "div",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Ul(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ul",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Ol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ol",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Dl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dl",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Pre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pre",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Hr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hr",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Blockquote(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "blockquote",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Table(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "table",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_A(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "a",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Br(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "br",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Span(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "span",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Bdo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bdo",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Map(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "map",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Img(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "img",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Big(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "big",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Small(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "small",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Dfn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dfn",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Q(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "q",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Samp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "samp",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Kbd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kbd",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Cite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cite",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Abbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abbr",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Acronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acronym",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFlow_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (h1TypeEClass,
		   source,
		   new String[] {
			   "name", "h1_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH1Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH1Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH1Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH1Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH1Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH1Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH1Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (h2TypeEClass,
		   source,
		   new String[] {
			   "name", "h2_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH2Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH2Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH2Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH2Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH2Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH2Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH2Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (h3TypeEClass,
		   source,
		   new String[] {
			   "name", "h3_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH3Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH3Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH3Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH3Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH3Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH3Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH3Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (h4TypeEClass,
		   source,
		   new String[] {
			   "name", "h4_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH4Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH4Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH4Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH4Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH4Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH4Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH4Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (h5TypeEClass,
		   source,
		   new String[] {
			   "name", "h5_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH5Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH5Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH5Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH5Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH5Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH5Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH5Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (h6TypeEClass,
		   source,
		   new String[] {
			   "name", "h6_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getH6Type_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getH6Type_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getH6Type_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getH6Type_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getH6Type_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getH6Type_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getH6Type_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (hrTypeEClass,
		   source,
		   new String[] {
			   "name", "hr_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getHrType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getHrType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getHrType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getHrType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getHrType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getHrType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getHrType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (imgTypeEClass,
		   source,
		   new String[] {
			   "name", "img_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getImgType_Alt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "alt"
		   });
		addAnnotation
		  (getImgType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getImgType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getImgType_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getImgType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getImgType_Ismap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ismap"
		   });
		addAnnotation
		  (getImgType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getImgType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getImgType_Longdesc(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "longdesc"
		   });
		addAnnotation
		  (getImgType_Src(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "src"
		   });
		addAnnotation
		  (getImgType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getImgType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getImgType_Usemap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "usemap"
		   });
		addAnnotation
		  (getImgType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (inlineEClass,
		   source,
		   new String[] {
			   "name", "Inline",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getInline_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getInline_Inline(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Inline:1"
		   });
		addAnnotation
		  (getInline_A(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "a",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Br(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "br",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Span(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "span",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Bdo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bdo",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Map(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "map",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Img(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "img",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Big(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "big",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Small(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "small",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Dfn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dfn",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Q(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "q",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Samp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "samp",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Kbd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kbd",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Cite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cite",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Abbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abbr",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Acronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acronym",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (getInline_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#Inline:1"
		   });
		addAnnotation
		  (ismapTypeEEnum,
		   source,
		   new String[] {
			   "name", "ismap_._type"
		   });
		addAnnotation
		  (ismapTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ismap_._type:Object",
			   "baseType", "ismap_._type"
		   });
		addAnnotation
		  (iTypeEClass,
		   source,
		   new String[] {
			   "name", "i_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getIType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getIType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getIType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getIType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getIType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getIType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getIType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (kbdTypeEClass,
		   source,
		   new String[] {
			   "name", "kbd_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getKbdType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getKbdType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getKbdType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getKbdType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getKbdType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getKbdType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getKbdType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (languageCodeEDataType,
		   source,
		   new String[] {
			   "name", "LanguageCode",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });
		addAnnotation
		  (lengthEDataType,
		   source,
		   new String[] {
			   "name", "Length",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[-+]?(\\d+|\\d+(\\.\\d+)?%25)"
		   });
		addAnnotation
		  (linkTypesEDataType,
		   source,
		   new String[] {
			   "name", "LinkTypes",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKENS"
		   });
		addAnnotation
		  (liTypeEClass,
		   source,
		   new String[] {
			   "name", "li_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getLiType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getLiType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getLiType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLiType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getLiType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getLiType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getLiType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (mapTypeEClass,
		   source,
		   new String[] {
			   "name", "map_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMapType_Block(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "Block:0"
		   });
		addAnnotation
		  (getMapType_P(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "p",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h1",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h2",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h3",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h4",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h5",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_H6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "h6",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Div(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "div",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Ul(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ul",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Ol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ol",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Dl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dl",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Pre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pre",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Hr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hr",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Blockquote(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "blockquote",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Table(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "table",
			   "namespace", "##targetNamespace",
			   "group", "#Block:0"
		   });
		addAnnotation
		  (getMapType_Area(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "area",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMapType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getMapType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getMapType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getMapType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getMapType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getMapType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getMapType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getMapType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (mediaDescEDataType,
		   source,
		   new String[] {
			   "name", "MediaDesc",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[^,]+(,\\s*[^,]+)*"
		   });
		addAnnotation
		  (multiLengthEDataType,
		   source,
		   new String[] {
			   "name", "MultiLength",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[-+]?(\\d+|\\d+(\\.\\d+)?%25)|[1-9]?(\\d+)?\\*"
		   });
		addAnnotation
		  (nohrefTypeEEnum,
		   source,
		   new String[] {
			   "name", "nohref_._type"
		   });
		addAnnotation
		  (nohrefTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "nohref_._type:Object",
			   "baseType", "nohref_._type"
		   });
		addAnnotation
		  (numberEDataType,
		   source,
		   new String[] {
			   "name", "Number",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			   "pattern", "[0-9]+"
		   });
		addAnnotation
		  (olTypeEClass,
		   source,
		   new String[] {
			   "name", "ol_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOlType_Li(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "li",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOlType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getOlType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getOlType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getOlType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getOlType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getOlType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getOlType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (pixelsEDataType,
		   source,
		   new String[] {
			   "name", "Pixels",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });
		addAnnotation
		  (preContentEClass,
		   source,
		   new String[] {
			   "name", "pre.content",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getPreContent_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getPreContent_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getPreContent_A(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "a",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Big(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "big",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Small(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "small",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Dfn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dfn",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Code(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "code",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Q(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "q",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Samp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "samp",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Kbd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kbd",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Var(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "var",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Cite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cite",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Abbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abbr",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Acronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acronym",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Br(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "br",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Span(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "span",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Bdo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bdo",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getPreContent_Map(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "map",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (preTypeEClass,
		   source,
		   new String[] {
			   "name", "pre_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getPreType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getPreType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getPreType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getPreType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getPreType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getPreType_Space(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "space",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getPreType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getPreType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (pTypeEClass,
		   source,
		   new String[] {
			   "name", "p_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getPType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getPType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getPType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getPType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getPType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getPType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getPType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (qTypeEClass,
		   source,
		   new String[] {
			   "name", "q_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getQType_Cite1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cite"
		   });
		addAnnotation
		  (getQType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getQType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getQType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getQType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getQType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getQType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getQType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (sampTypeEClass,
		   source,
		   new String[] {
			   "name", "samp_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSampType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSampType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getSampType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getSampType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getSampType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getSampType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getSampType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (scopeEEnum,
		   source,
		   new String[] {
			   "name", "Scope"
		   });
		addAnnotation
		  (scopeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Scope:Object",
			   "baseType", "Scope"
		   });
		addAnnotation
		  (scriptEDataType,
		   source,
		   new String[] {
			   "name", "Script",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (shapeEEnum,
		   source,
		   new String[] {
			   "name", "Shape"
		   });
		addAnnotation
		  (shapeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Shape:Object",
			   "baseType", "Shape"
		   });
		addAnnotation
		  (smallTypeEClass,
		   source,
		   new String[] {
			   "name", "small_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSmallType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSmallType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getSmallType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getSmallType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getSmallType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getSmallType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getSmallType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (spanTypeEClass,
		   source,
		   new String[] {
			   "name", "span_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSpanType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSpanType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getSpanType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getSpanType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getSpanType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getSpanType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getSpanType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (strongTypeEClass,
		   source,
		   new String[] {
			   "name", "strong_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getStrongType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getStrongType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getStrongType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getStrongType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getStrongType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getStrongType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getStrongType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (styleSheetEDataType,
		   source,
		   new String[] {
			   "name", "StyleSheet",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (subTypeEClass,
		   source,
		   new String[] {
			   "name", "sub_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSubType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSubType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getSubType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getSubType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getSubType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getSubType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getSubType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (supTypeEClass,
		   source,
		   new String[] {
			   "name", "sup_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSupType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSupType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getSupType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getSupType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getSupType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getSupType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getSupType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (tabindexNumberEDataType,
		   source,
		   new String[] {
			   "name", "tabindexNumber",
			   "baseType", "Number",
			   "minInclusive", "0",
			   "maxInclusive", "32767"
		   });
		addAnnotation
		  (tableTypeEClass,
		   source,
		   new String[] {
			   "name", "table_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTableType_Caption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Col(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "col",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Colgroup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "colgroup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Thead(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "thead",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Tfoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tfoot",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Tbody(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tbody",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Tr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTableType_Border(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "border"
		   });
		addAnnotation
		  (getTableType_Cellpadding(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cellpadding"
		   });
		addAnnotation
		  (getTableType_Cellspacing(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cellspacing"
		   });
		addAnnotation
		  (getTableType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTableType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTableType_Frame(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "frame"
		   });
		addAnnotation
		  (getTableType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTableType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTableType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTableType_Rules(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rules"
		   });
		addAnnotation
		  (getTableType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTableType_Summary(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "summary"
		   });
		addAnnotation
		  (getTableType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTableType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (tbodyTypeEClass,
		   source,
		   new String[] {
			   "name", "tbody_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTbodyType_Tr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTbodyType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getTbodyType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getTbodyType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getTbodyType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTbodyType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTbodyType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTbodyType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTbodyType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTbodyType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTbodyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTbodyType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (tdTypeEClass,
		   source,
		   new String[] {
			   "name", "td_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTdType_Abbr1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "abbr"
		   });
		addAnnotation
		  (getTdType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getTdType_Axis(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "axis"
		   });
		addAnnotation
		  (getTdType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getTdType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getTdType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTdType_Colspan(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "colspan"
		   });
		addAnnotation
		  (getTdType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTdType_Headers(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "headers"
		   });
		addAnnotation
		  (getTdType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTdType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTdType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTdType_Rowspan(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rowspan"
		   });
		addAnnotation
		  (getTdType_Scope(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scope"
		   });
		addAnnotation
		  (getTdType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTdType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTdType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (textEDataType,
		   source,
		   new String[] {
			   "name", "Text",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (tfootTypeEClass,
		   source,
		   new String[] {
			   "name", "tfoot_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTfootType_Tr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTfootType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getTfootType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getTfootType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getTfootType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTfootType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTfootType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTfootType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTfootType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTfootType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTfootType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTfootType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (tFrameEEnum,
		   source,
		   new String[] {
			   "name", "TFrame"
		   });
		addAnnotation
		  (tFrameObjectEDataType,
		   source,
		   new String[] {
			   "name", "TFrame:Object",
			   "baseType", "TFrame"
		   });
		addAnnotation
		  (theadTypeEClass,
		   source,
		   new String[] {
			   "name", "thead_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTheadType_Tr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTheadType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getTheadType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getTheadType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getTheadType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTheadType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTheadType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTheadType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTheadType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTheadType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTheadType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTheadType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (thTypeEClass,
		   source,
		   new String[] {
			   "name", "th_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getThType_Abbr1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "abbr"
		   });
		addAnnotation
		  (getThType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getThType_Axis(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "axis"
		   });
		addAnnotation
		  (getThType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getThType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getThType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getThType_Colspan(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "colspan"
		   });
		addAnnotation
		  (getThType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getThType_Headers(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "headers"
		   });
		addAnnotation
		  (getThType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getThType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getThType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getThType_Rowspan(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rowspan"
		   });
		addAnnotation
		  (getThType_Scope(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scope"
		   });
		addAnnotation
		  (getThType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getThType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getThType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (trTypeEClass,
		   source,
		   new String[] {
			   "name", "tr_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getTrType_Th(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "th",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTrType_Td(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "td",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTrType_Align(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "align"
		   });
		addAnnotation
		  (getTrType_Char(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "char"
		   });
		addAnnotation
		  (getTrType_Charoff(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "charoff"
		   });
		addAnnotation
		  (getTrType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTrType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTrType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTrType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTrType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTrType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTrType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getTrType_Valign(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "valign"
		   });
		addAnnotation
		  (tRulesEEnum,
		   source,
		   new String[] {
			   "name", "TRules"
		   });
		addAnnotation
		  (tRulesObjectEDataType,
		   source,
		   new String[] {
			   "name", "TRules:Object",
			   "baseType", "TRules"
		   });
		addAnnotation
		  (ttTypeEClass,
		   source,
		   new String[] {
			   "name", "tt_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTtType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getTtType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getTtType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTtType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getTtType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getTtType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getTtType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (ulTypeEClass,
		   source,
		   new String[] {
			   "name", "ul_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUlType_Li(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "li",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUlType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getUlType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getUlType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getUlType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getUlType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getUlType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getUlType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (uriEDataType,
		   source,
		   new String[] {
			   "name", "URI",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
		addAnnotation
		  (uriListEDataType,
		   source,
		   new String[] {
			   "name", "UriList",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (valignTypeEEnum,
		   source,
		   new String[] {
			   "name", "valign_._type"
		   });
		addAnnotation
		  (valignTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "valign_._type:Object",
			   "baseType", "valign_._type"
		   });
		addAnnotation
		  (varTypeEClass,
		   source,
		   new String[] {
			   "name", "var_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getVarType_Class(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getVarType_Dir(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dir"
		   });
		addAnnotation
		  (getVarType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getVarType_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang"
		   });
		addAnnotation
		  (getVarType_Lang1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getVarType_Style(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getVarType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
	}

} //XHTMLPackageImpl
