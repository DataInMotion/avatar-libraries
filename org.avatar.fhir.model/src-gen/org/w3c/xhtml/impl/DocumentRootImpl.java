/*
 */
package org.w3c.xhtml.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3c.xhtml.AType;
import org.w3c.xhtml.AbbrType;
import org.w3c.xhtml.AcronymType;
import org.w3c.xhtml.AddressType;
import org.w3c.xhtml.AreaType;
import org.w3c.xhtml.BType;
import org.w3c.xhtml.BdoType;
import org.w3c.xhtml.BigType;
import org.w3c.xhtml.BlockquoteType;
import org.w3c.xhtml.BrType;
import org.w3c.xhtml.CaptionType;
import org.w3c.xhtml.CiteType;
import org.w3c.xhtml.CodeType;
import org.w3c.xhtml.ColType;
import org.w3c.xhtml.ColgroupType;
import org.w3c.xhtml.DdType;
import org.w3c.xhtml.DfnType;
import org.w3c.xhtml.DivType;
import org.w3c.xhtml.DlType;
import org.w3c.xhtml.DocumentRoot;
import org.w3c.xhtml.DtType;
import org.w3c.xhtml.EmType;
import org.w3c.xhtml.H1Type;
import org.w3c.xhtml.H2Type;
import org.w3c.xhtml.H3Type;
import org.w3c.xhtml.H4Type;
import org.w3c.xhtml.H5Type;
import org.w3c.xhtml.H6Type;
import org.w3c.xhtml.HrType;
import org.w3c.xhtml.IType;
import org.w3c.xhtml.ImgType;
import org.w3c.xhtml.KbdType;
import org.w3c.xhtml.LiType;
import org.w3c.xhtml.MapType;
import org.w3c.xhtml.OlType;
import org.w3c.xhtml.PType;
import org.w3c.xhtml.PreType;
import org.w3c.xhtml.QType;
import org.w3c.xhtml.SampType;
import org.w3c.xhtml.SmallType;
import org.w3c.xhtml.SpanType;
import org.w3c.xhtml.StrongType;
import org.w3c.xhtml.SubType;
import org.w3c.xhtml.SupType;
import org.w3c.xhtml.TableType;
import org.w3c.xhtml.TbodyType;
import org.w3c.xhtml.TdType;
import org.w3c.xhtml.TfootType;
import org.w3c.xhtml.ThType;
import org.w3c.xhtml.TheadType;
import org.w3c.xhtml.TrType;
import org.w3c.xhtml.TtType;
import org.w3c.xhtml.UlType;
import org.w3c.xhtml.VarType;
import org.w3c.xhtml.XHTMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getDd <em>Dd</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getDt <em>Dt</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getLi <em>Li</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTd <em>Td</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTh <em>Th</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.DocumentRootImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XHTMLPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XHTMLPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AType getA() {
		return (AType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__A, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(AType newA, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__A, newA, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA(AType newA) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__A, newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrType getAbbr() {
		return (AbbrType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__ABBR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbr(AbbrType newAbbr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__ABBR, newAbbr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbr(AbbrType newAbbr) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__ABBR, newAbbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcronymType getAcronym() {
		return (AcronymType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__ACRONYM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcronym(AcronymType newAcronym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__ACRONYM, newAcronym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcronym(AcronymType newAcronym) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__ACRONYM, newAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType getAddress() {
		return (AddressType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(AddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType getArea() {
		return (AreaType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(AreaType newArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__AREA, newArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(AreaType newArea) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__AREA, newArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BType getB() {
		return (BType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(BType newB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__B, newB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setB(BType newB) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BdoType getBdo() {
		return (BdoType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__BDO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBdo(BdoType newBdo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__BDO, newBdo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBdo(BdoType newBdo) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__BDO, newBdo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigType getBig() {
		return (BigType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__BIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBig(BigType newBig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__BIG, newBig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBig(BigType newBig) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__BIG, newBig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockquoteType getBlockquote() {
		return (BlockquoteType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__BLOCKQUOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockquote(BlockquoteType newBlockquote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__BLOCKQUOTE, newBlockquote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockquote(BlockquoteType newBlockquote) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__BLOCKQUOTE, newBlockquote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrType getBr() {
		return (BrType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__BR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBr(BrType newBr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__BR, newBr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBr(BrType newBr) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__BR, newBr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return (CaptionType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__CAPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__CAPTION, newCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(CaptionType newCaption) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__CAPTION, newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiteType getCite() {
		return (CiteType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__CITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCite(CiteType newCite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__CITE, newCite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCite(CiteType newCite) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__CITE, newCite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getCode() {
		return (CodeType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeType newCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__CODE, newCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(CodeType newCode) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType getCol() {
		return (ColType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__COL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCol(ColType newCol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__COL, newCol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCol(ColType newCol) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__COL, newCol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType getColgroup() {
		return (ColgroupType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__COLGROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColgroup(ColgroupType newColgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__COLGROUP, newColgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColgroup(ColgroupType newColgroup) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__COLGROUP, newColgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DdType getDd() {
		return (DdType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__DD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDd(DdType newDd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__DD, newDd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDd(DdType newDd) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__DD, newDd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DfnType getDfn() {
		return (DfnType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__DFN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDfn(DfnType newDfn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__DFN, newDfn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDfn(DfnType newDfn) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__DFN, newDfn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivType getDiv() {
		return (DivType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__DIV, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiv(DivType newDiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__DIV, newDiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiv(DivType newDiv) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__DIV, newDiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DlType getDl() {
		return (DlType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__DL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDl(DlType newDl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__DL, newDl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDl(DlType newDl) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__DL, newDl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DtType getDt() {
		return (DtType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__DT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDt(DtType newDt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__DT, newDt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDt(DtType newDt) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__DT, newDt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmType getEm() {
		return (EmType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__EM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEm(EmType newEm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__EM, newEm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEm(EmType newEm) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__EM, newEm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H1Type getH1() {
		return (H1Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH1(H1Type newH1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H1, newH1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH1(H1Type newH1) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H1, newH1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H2Type getH2() {
		return (H2Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH2(H2Type newH2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H2, newH2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH2(H2Type newH2) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H2, newH2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H3Type getH3() {
		return (H3Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H3, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH3(H3Type newH3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H3, newH3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH3(H3Type newH3) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H3, newH3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H4Type getH4() {
		return (H4Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH4(H4Type newH4, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H4, newH4, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH4(H4Type newH4) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H4, newH4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H5Type getH5() {
		return (H5Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H5, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH5(H5Type newH5, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H5, newH5, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH5(H5Type newH5) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H5, newH5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H6Type getH6() {
		return (H6Type)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__H6, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH6(H6Type newH6, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__H6, newH6, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH6(H6Type newH6) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__H6, newH6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HrType getHr() {
		return (HrType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__HR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHr(HrType newHr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__HR, newHr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHr(HrType newHr) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__HR, newHr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IType getI() {
		return (IType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__I, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetI(IType newI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__I, newI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setI(IType newI) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__I, newI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImgType getImg() {
		return (ImgType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__IMG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImg(ImgType newImg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__IMG, newImg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImg(ImgType newImg) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__IMG, newImg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KbdType getKbd() {
		return (KbdType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__KBD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKbd(KbdType newKbd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__KBD, newKbd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKbd(KbdType newKbd) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__KBD, newKbd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiType getLi() {
		return (LiType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__LI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLi(LiType newLi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__LI, newLi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLi(LiType newLi) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__LI, newLi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType getMap() {
		return (MapType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__MAP, newMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMap(MapType newMap) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__MAP, newMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlType getOl() {
		return (OlType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__OL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOl(OlType newOl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__OL, newOl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOl(OlType newOl) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__OL, newOl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PType getP() {
		return (PType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__P, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PType newP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__P, newP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setP(PType newP) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__P, newP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreType getPre() {
		return (PreType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__PRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(PreType newPre, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__PRE, newPre, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPre(PreType newPre) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__PRE, newPre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QType getQ() {
		return (QType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__Q, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(QType newQ, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__Q, newQ, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQ(QType newQ) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__Q, newQ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampType getSamp() {
		return (SampType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__SAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamp(SampType newSamp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__SAMP, newSamp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamp(SampType newSamp) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__SAMP, newSamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmallType getSmall() {
		return (SmallType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__SMALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmall(SmallType newSmall, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__SMALL, newSmall, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmall(SmallType newSmall) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__SMALL, newSmall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanType getSpan() {
		return (SpanType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__SPAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(SpanType newSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpan(SpanType newSpan) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongType getStrong() {
		return (StrongType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__STRONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrong(StrongType newStrong, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__STRONG, newStrong, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrong(StrongType newStrong) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__STRONG, newStrong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubType getSub() {
		return (SubType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__SUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(SubType newSub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__SUB, newSub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSub(SubType newSub) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__SUB, newSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupType getSup() {
		return (SupType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__SUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSup(SupType newSup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__SUP, newSup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSup(SupType newSup) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__SUP, newSup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType getTable() {
		return (TableType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TABLE, newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(TableType newTable) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TABLE, newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType getTbody() {
		return (TbodyType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TBODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TBODY, newTbody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTbody(TbodyType newTbody) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TBODY, newTbody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType getTd() {
		return (TdType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTd(TdType newTd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TD, newTd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTd(TdType newTd) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TD, newTd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return (TfootType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TFOOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TFOOT, newTfoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTfoot(TfootType newTfoot) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TFOOT, newTfoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType getTh() {
		return (ThType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTh(ThType newTh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TH, newTh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTh(ThType newTh) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TH, newTh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return (TheadType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__THEAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__THEAD, newThead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThead(TheadType newThead) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__THEAD, newThead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType getTr() {
		return (TrType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TrType newTr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TR, newTr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTr(TrType newTr) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TR, newTr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtType getTt() {
		return (TtType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__TT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTt(TtType newTt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__TT, newTt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTt(TtType newTt) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__TT, newTt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UlType getUl() {
		return (UlType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__UL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUl(UlType newUl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__UL, newUl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUl(UlType newUl) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__UL, newUl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarType getVar() {
		return (VarType)getMixed().get(XHTMLPackage.Literals.DOCUMENT_ROOT__VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVar(VarType newVar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XHTMLPackage.Literals.DOCUMENT_ROOT__VAR, newVar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVar(VarType newVar) {
		((FeatureMap.Internal)getMixed()).set(XHTMLPackage.Literals.DOCUMENT_ROOT__VAR, newVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XHTMLPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__A:
				return basicSetA(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__ABBR:
				return basicSetAbbr(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__ACRONYM:
				return basicSetAcronym(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__AREA:
				return basicSetArea(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__B:
				return basicSetB(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__BDO:
				return basicSetBdo(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__BIG:
				return basicSetBig(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return basicSetBlockquote(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__BR:
				return basicSetBr(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__CAPTION:
				return basicSetCaption(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__CITE:
				return basicSetCite(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__CODE:
				return basicSetCode(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__COL:
				return basicSetCol(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__COLGROUP:
				return basicSetColgroup(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__DD:
				return basicSetDd(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__DFN:
				return basicSetDfn(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__DIV:
				return basicSetDiv(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__DL:
				return basicSetDl(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__DT:
				return basicSetDt(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__EM:
				return basicSetEm(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H1:
				return basicSetH1(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H2:
				return basicSetH2(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H3:
				return basicSetH3(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H4:
				return basicSetH4(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H5:
				return basicSetH5(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__H6:
				return basicSetH6(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__HR:
				return basicSetHr(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__I:
				return basicSetI(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__IMG:
				return basicSetImg(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__KBD:
				return basicSetKbd(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__LI:
				return basicSetLi(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__MAP:
				return basicSetMap(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__OL:
				return basicSetOl(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__P:
				return basicSetP(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__PRE:
				return basicSetPre(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__Q:
				return basicSetQ(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__SAMP:
				return basicSetSamp(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__SMALL:
				return basicSetSmall(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__SPAN:
				return basicSetSpan(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__STRONG:
				return basicSetStrong(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__SUB:
				return basicSetSub(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__SUP:
				return basicSetSup(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TBODY:
				return basicSetTbody(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TD:
				return basicSetTd(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TFOOT:
				return basicSetTfoot(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TH:
				return basicSetTh(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__THEAD:
				return basicSetThead(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TR:
				return basicSetTr(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__TT:
				return basicSetTt(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__UL:
				return basicSetUl(null, msgs);
			case XHTMLPackage.DOCUMENT_ROOT__VAR:
				return basicSetVar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XHTMLPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XHTMLPackage.DOCUMENT_ROOT__A:
				return getA();
			case XHTMLPackage.DOCUMENT_ROOT__ABBR:
				return getAbbr();
			case XHTMLPackage.DOCUMENT_ROOT__ACRONYM:
				return getAcronym();
			case XHTMLPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case XHTMLPackage.DOCUMENT_ROOT__AREA:
				return getArea();
			case XHTMLPackage.DOCUMENT_ROOT__B:
				return getB();
			case XHTMLPackage.DOCUMENT_ROOT__BDO:
				return getBdo();
			case XHTMLPackage.DOCUMENT_ROOT__BIG:
				return getBig();
			case XHTMLPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return getBlockquote();
			case XHTMLPackage.DOCUMENT_ROOT__BR:
				return getBr();
			case XHTMLPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption();
			case XHTMLPackage.DOCUMENT_ROOT__CITE:
				return getCite();
			case XHTMLPackage.DOCUMENT_ROOT__CODE:
				return getCode();
			case XHTMLPackage.DOCUMENT_ROOT__COL:
				return getCol();
			case XHTMLPackage.DOCUMENT_ROOT__COLGROUP:
				return getColgroup();
			case XHTMLPackage.DOCUMENT_ROOT__DD:
				return getDd();
			case XHTMLPackage.DOCUMENT_ROOT__DFN:
				return getDfn();
			case XHTMLPackage.DOCUMENT_ROOT__DIV:
				return getDiv();
			case XHTMLPackage.DOCUMENT_ROOT__DL:
				return getDl();
			case XHTMLPackage.DOCUMENT_ROOT__DT:
				return getDt();
			case XHTMLPackage.DOCUMENT_ROOT__EM:
				return getEm();
			case XHTMLPackage.DOCUMENT_ROOT__H1:
				return getH1();
			case XHTMLPackage.DOCUMENT_ROOT__H2:
				return getH2();
			case XHTMLPackage.DOCUMENT_ROOT__H3:
				return getH3();
			case XHTMLPackage.DOCUMENT_ROOT__H4:
				return getH4();
			case XHTMLPackage.DOCUMENT_ROOT__H5:
				return getH5();
			case XHTMLPackage.DOCUMENT_ROOT__H6:
				return getH6();
			case XHTMLPackage.DOCUMENT_ROOT__HR:
				return getHr();
			case XHTMLPackage.DOCUMENT_ROOT__I:
				return getI();
			case XHTMLPackage.DOCUMENT_ROOT__IMG:
				return getImg();
			case XHTMLPackage.DOCUMENT_ROOT__KBD:
				return getKbd();
			case XHTMLPackage.DOCUMENT_ROOT__LI:
				return getLi();
			case XHTMLPackage.DOCUMENT_ROOT__MAP:
				return getMap();
			case XHTMLPackage.DOCUMENT_ROOT__OL:
				return getOl();
			case XHTMLPackage.DOCUMENT_ROOT__P:
				return getP();
			case XHTMLPackage.DOCUMENT_ROOT__PRE:
				return getPre();
			case XHTMLPackage.DOCUMENT_ROOT__Q:
				return getQ();
			case XHTMLPackage.DOCUMENT_ROOT__SAMP:
				return getSamp();
			case XHTMLPackage.DOCUMENT_ROOT__SMALL:
				return getSmall();
			case XHTMLPackage.DOCUMENT_ROOT__SPAN:
				return getSpan();
			case XHTMLPackage.DOCUMENT_ROOT__STRONG:
				return getStrong();
			case XHTMLPackage.DOCUMENT_ROOT__SUB:
				return getSub();
			case XHTMLPackage.DOCUMENT_ROOT__SUP:
				return getSup();
			case XHTMLPackage.DOCUMENT_ROOT__TABLE:
				return getTable();
			case XHTMLPackage.DOCUMENT_ROOT__TBODY:
				return getTbody();
			case XHTMLPackage.DOCUMENT_ROOT__TD:
				return getTd();
			case XHTMLPackage.DOCUMENT_ROOT__TFOOT:
				return getTfoot();
			case XHTMLPackage.DOCUMENT_ROOT__TH:
				return getTh();
			case XHTMLPackage.DOCUMENT_ROOT__THEAD:
				return getThead();
			case XHTMLPackage.DOCUMENT_ROOT__TR:
				return getTr();
			case XHTMLPackage.DOCUMENT_ROOT__TT:
				return getTt();
			case XHTMLPackage.DOCUMENT_ROOT__UL:
				return getUl();
			case XHTMLPackage.DOCUMENT_ROOT__VAR:
				return getVar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XHTMLPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__A:
				setA((AType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ABBR:
				setAbbr((AbbrType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ACRONYM:
				setAcronym((AcronymType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__AREA:
				setArea((AreaType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__B:
				setB((BType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BDO:
				setBdo((BdoType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BIG:
				setBig((BigType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				setBlockquote((BlockquoteType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BR:
				setBr((BrType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CITE:
				setCite((CiteType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CODE:
				setCode((CodeType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__COL:
				setCol((ColType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DD:
				setDd((DdType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DFN:
				setDfn((DfnType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DIV:
				setDiv((DivType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DL:
				setDl((DlType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DT:
				setDt((DtType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__EM:
				setEm((EmType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H1:
				setH1((H1Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H2:
				setH2((H2Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H3:
				setH3((H3Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H4:
				setH4((H4Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H5:
				setH5((H5Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H6:
				setH6((H6Type)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__HR:
				setHr((HrType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__I:
				setI((IType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__IMG:
				setImg((ImgType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__KBD:
				setKbd((KbdType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__LI:
				setLi((LiType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__OL:
				setOl((OlType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__P:
				setP((PType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__PRE:
				setPre((PreType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__Q:
				setQ((QType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SAMP:
				setSamp((SampType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SMALL:
				setSmall((SmallType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__STRONG:
				setStrong((StrongType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SUB:
				setSub((SubType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SUP:
				setSup((SupType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TD:
				setTd((TdType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TH:
				setTh((ThType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TR:
				setTr((TrType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TT:
				setTt((TtType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__UL:
				setUl((UlType)newValue);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__VAR:
				setVar((VarType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XHTMLPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XHTMLPackage.DOCUMENT_ROOT__A:
				setA((AType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ABBR:
				setAbbr((AbbrType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ACRONYM:
				setAcronym((AcronymType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__AREA:
				setArea((AreaType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__B:
				setB((BType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BDO:
				setBdo((BdoType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BIG:
				setBig((BigType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				setBlockquote((BlockquoteType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__BR:
				setBr((BrType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CITE:
				setCite((CiteType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__CODE:
				setCode((CodeType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__COL:
				setCol((ColType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DD:
				setDd((DdType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DFN:
				setDfn((DfnType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DIV:
				setDiv((DivType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DL:
				setDl((DlType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__DT:
				setDt((DtType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__EM:
				setEm((EmType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H1:
				setH1((H1Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H2:
				setH2((H2Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H3:
				setH3((H3Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H4:
				setH4((H4Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H5:
				setH5((H5Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__H6:
				setH6((H6Type)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__HR:
				setHr((HrType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__I:
				setI((IType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__IMG:
				setImg((ImgType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__KBD:
				setKbd((KbdType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__LI:
				setLi((LiType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__OL:
				setOl((OlType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__P:
				setP((PType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__PRE:
				setPre((PreType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__Q:
				setQ((QType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SAMP:
				setSamp((SampType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SMALL:
				setSmall((SmallType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__STRONG:
				setStrong((StrongType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SUB:
				setSub((SubType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__SUP:
				setSup((SupType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TD:
				setTd((TdType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TH:
				setTh((ThType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TR:
				setTr((TrType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__TT:
				setTt((TtType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__UL:
				setUl((UlType)null);
				return;
			case XHTMLPackage.DOCUMENT_ROOT__VAR:
				setVar((VarType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XHTMLPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XHTMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XHTMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XHTMLPackage.DOCUMENT_ROOT__A:
				return getA() != null;
			case XHTMLPackage.DOCUMENT_ROOT__ABBR:
				return getAbbr() != null;
			case XHTMLPackage.DOCUMENT_ROOT__ACRONYM:
				return getAcronym() != null;
			case XHTMLPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case XHTMLPackage.DOCUMENT_ROOT__AREA:
				return getArea() != null;
			case XHTMLPackage.DOCUMENT_ROOT__B:
				return getB() != null;
			case XHTMLPackage.DOCUMENT_ROOT__BDO:
				return getBdo() != null;
			case XHTMLPackage.DOCUMENT_ROOT__BIG:
				return getBig() != null;
			case XHTMLPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return getBlockquote() != null;
			case XHTMLPackage.DOCUMENT_ROOT__BR:
				return getBr() != null;
			case XHTMLPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption() != null;
			case XHTMLPackage.DOCUMENT_ROOT__CITE:
				return getCite() != null;
			case XHTMLPackage.DOCUMENT_ROOT__CODE:
				return getCode() != null;
			case XHTMLPackage.DOCUMENT_ROOT__COL:
				return getCol() != null;
			case XHTMLPackage.DOCUMENT_ROOT__COLGROUP:
				return getColgroup() != null;
			case XHTMLPackage.DOCUMENT_ROOT__DD:
				return getDd() != null;
			case XHTMLPackage.DOCUMENT_ROOT__DFN:
				return getDfn() != null;
			case XHTMLPackage.DOCUMENT_ROOT__DIV:
				return getDiv() != null;
			case XHTMLPackage.DOCUMENT_ROOT__DL:
				return getDl() != null;
			case XHTMLPackage.DOCUMENT_ROOT__DT:
				return getDt() != null;
			case XHTMLPackage.DOCUMENT_ROOT__EM:
				return getEm() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H1:
				return getH1() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H2:
				return getH2() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H3:
				return getH3() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H4:
				return getH4() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H5:
				return getH5() != null;
			case XHTMLPackage.DOCUMENT_ROOT__H6:
				return getH6() != null;
			case XHTMLPackage.DOCUMENT_ROOT__HR:
				return getHr() != null;
			case XHTMLPackage.DOCUMENT_ROOT__I:
				return getI() != null;
			case XHTMLPackage.DOCUMENT_ROOT__IMG:
				return getImg() != null;
			case XHTMLPackage.DOCUMENT_ROOT__KBD:
				return getKbd() != null;
			case XHTMLPackage.DOCUMENT_ROOT__LI:
				return getLi() != null;
			case XHTMLPackage.DOCUMENT_ROOT__MAP:
				return getMap() != null;
			case XHTMLPackage.DOCUMENT_ROOT__OL:
				return getOl() != null;
			case XHTMLPackage.DOCUMENT_ROOT__P:
				return getP() != null;
			case XHTMLPackage.DOCUMENT_ROOT__PRE:
				return getPre() != null;
			case XHTMLPackage.DOCUMENT_ROOT__Q:
				return getQ() != null;
			case XHTMLPackage.DOCUMENT_ROOT__SAMP:
				return getSamp() != null;
			case XHTMLPackage.DOCUMENT_ROOT__SMALL:
				return getSmall() != null;
			case XHTMLPackage.DOCUMENT_ROOT__SPAN:
				return getSpan() != null;
			case XHTMLPackage.DOCUMENT_ROOT__STRONG:
				return getStrong() != null;
			case XHTMLPackage.DOCUMENT_ROOT__SUB:
				return getSub() != null;
			case XHTMLPackage.DOCUMENT_ROOT__SUP:
				return getSup() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TBODY:
				return getTbody() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TD:
				return getTd() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TFOOT:
				return getTfoot() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TH:
				return getTh() != null;
			case XHTMLPackage.DOCUMENT_ROOT__THEAD:
				return getThead() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TR:
				return getTr() != null;
			case XHTMLPackage.DOCUMENT_ROOT__TT:
				return getTt() != null;
			case XHTMLPackage.DOCUMENT_ROOT__UL:
				return getUl() != null;
			case XHTMLPackage.DOCUMENT_ROOT__VAR:
				return getVar() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
