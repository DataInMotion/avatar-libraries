/**
 */
package org.w3c.xhtml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3c.xhtml.AType;
import org.w3c.xhtml.AbbrType;
import org.w3c.xhtml.AcronymType;
import org.w3c.xhtml.AddressType;
import org.w3c.xhtml.BType;
import org.w3c.xhtml.BdoType;
import org.w3c.xhtml.BigType;
import org.w3c.xhtml.BlockquoteType;
import org.w3c.xhtml.BrType;
import org.w3c.xhtml.CiteType;
import org.w3c.xhtml.CodeType;
import org.w3c.xhtml.DfnType;
import org.w3c.xhtml.DivType;
import org.w3c.xhtml.DlType;
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
import org.w3c.xhtml.KbdType;
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
import org.w3c.xhtml.TtType;
import org.w3c.xhtml.UlType;
import org.w3c.xhtml.VarType;
import org.w3c.xhtml.XHTMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.FlowImpl#getSup <em>Sup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XHTMLPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XHTMLPackage.FLOW__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTMLPackage.Literals.FLOW__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H1Type> getH1() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H2Type> getH2() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H3Type> getH3() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H4Type> getH4() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H5Type> getH5() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H6Type> getH6() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__H6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DivType> getDiv() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UlType> getUl() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlType> getOl() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DlType> getDl() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreType> getPre() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HrType> getHr() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AType> getA() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrType> getBr() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpanType> getSpan() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BdoType> getBdo() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__BDO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImgType> getImg() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TtType> getTt() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IType> getI() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BType> getB() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigType> getBig() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmallType> getSmall() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmType> getEm() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongType> getStrong() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DfnType> getDfn() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QType> getQ() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SampType> getSamp() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KbdType> getKbd() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarType> getVar() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiteType> getCite() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrType> getAbbr() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getGroup().list(XHTMLPackage.Literals.FLOW__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XHTMLPackage.FLOW__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.FLOW__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case XHTMLPackage.FLOW__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XHTMLPackage.FLOW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XHTMLPackage.FLOW__P:
				return getP();
			case XHTMLPackage.FLOW__H1:
				return getH1();
			case XHTMLPackage.FLOW__H2:
				return getH2();
			case XHTMLPackage.FLOW__H3:
				return getH3();
			case XHTMLPackage.FLOW__H4:
				return getH4();
			case XHTMLPackage.FLOW__H5:
				return getH5();
			case XHTMLPackage.FLOW__H6:
				return getH6();
			case XHTMLPackage.FLOW__DIV:
				return getDiv();
			case XHTMLPackage.FLOW__UL:
				return getUl();
			case XHTMLPackage.FLOW__OL:
				return getOl();
			case XHTMLPackage.FLOW__DL:
				return getDl();
			case XHTMLPackage.FLOW__PRE:
				return getPre();
			case XHTMLPackage.FLOW__HR:
				return getHr();
			case XHTMLPackage.FLOW__BLOCKQUOTE:
				return getBlockquote();
			case XHTMLPackage.FLOW__ADDRESS:
				return getAddress();
			case XHTMLPackage.FLOW__TABLE:
				return getTable();
			case XHTMLPackage.FLOW__A:
				return getA();
			case XHTMLPackage.FLOW__BR:
				return getBr();
			case XHTMLPackage.FLOW__SPAN:
				return getSpan();
			case XHTMLPackage.FLOW__BDO:
				return getBdo();
			case XHTMLPackage.FLOW__MAP:
				return getMap();
			case XHTMLPackage.FLOW__IMG:
				return getImg();
			case XHTMLPackage.FLOW__TT:
				return getTt();
			case XHTMLPackage.FLOW__I:
				return getI();
			case XHTMLPackage.FLOW__B:
				return getB();
			case XHTMLPackage.FLOW__BIG:
				return getBig();
			case XHTMLPackage.FLOW__SMALL:
				return getSmall();
			case XHTMLPackage.FLOW__EM:
				return getEm();
			case XHTMLPackage.FLOW__STRONG:
				return getStrong();
			case XHTMLPackage.FLOW__DFN:
				return getDfn();
			case XHTMLPackage.FLOW__CODE:
				return getCode();
			case XHTMLPackage.FLOW__Q:
				return getQ();
			case XHTMLPackage.FLOW__SAMP:
				return getSamp();
			case XHTMLPackage.FLOW__KBD:
				return getKbd();
			case XHTMLPackage.FLOW__VAR:
				return getVar();
			case XHTMLPackage.FLOW__CITE:
				return getCite();
			case XHTMLPackage.FLOW__ABBR:
				return getAbbr();
			case XHTMLPackage.FLOW__ACRONYM:
				return getAcronym();
			case XHTMLPackage.FLOW__SUB:
				return getSub();
			case XHTMLPackage.FLOW__SUP:
				return getSup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XHTMLPackage.FLOW__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XHTMLPackage.FLOW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XHTMLPackage.FLOW__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case XHTMLPackage.FLOW__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case XHTMLPackage.FLOW__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case XHTMLPackage.FLOW__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case XHTMLPackage.FLOW__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case XHTMLPackage.FLOW__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case XHTMLPackage.FLOW__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case XHTMLPackage.FLOW__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case XHTMLPackage.FLOW__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case XHTMLPackage.FLOW__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case XHTMLPackage.FLOW__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case XHTMLPackage.FLOW__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case XHTMLPackage.FLOW__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case XHTMLPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case XHTMLPackage.FLOW__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case XHTMLPackage.FLOW__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case XHTMLPackage.FLOW__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XHTMLPackage.FLOW__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XHTMLPackage.FLOW__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XHTMLPackage.FLOW__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case XHTMLPackage.FLOW__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case XHTMLPackage.FLOW__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XHTMLPackage.FLOW__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XHTMLPackage.FLOW__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XHTMLPackage.FLOW__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XHTMLPackage.FLOW__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XHTMLPackage.FLOW__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XHTMLPackage.FLOW__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XHTMLPackage.FLOW__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XHTMLPackage.FLOW__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XHTMLPackage.FLOW__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XHTMLPackage.FLOW__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XHTMLPackage.FLOW__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XHTMLPackage.FLOW__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XHTMLPackage.FLOW__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XHTMLPackage.FLOW__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XHTMLPackage.FLOW__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XHTMLPackage.FLOW__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XHTMLPackage.FLOW__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XHTMLPackage.FLOW__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
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
			case XHTMLPackage.FLOW__MIXED:
				getMixed().clear();
				return;
			case XHTMLPackage.FLOW__GROUP:
				getGroup().clear();
				return;
			case XHTMLPackage.FLOW__P:
				getP().clear();
				return;
			case XHTMLPackage.FLOW__H1:
				getH1().clear();
				return;
			case XHTMLPackage.FLOW__H2:
				getH2().clear();
				return;
			case XHTMLPackage.FLOW__H3:
				getH3().clear();
				return;
			case XHTMLPackage.FLOW__H4:
				getH4().clear();
				return;
			case XHTMLPackage.FLOW__H5:
				getH5().clear();
				return;
			case XHTMLPackage.FLOW__H6:
				getH6().clear();
				return;
			case XHTMLPackage.FLOW__DIV:
				getDiv().clear();
				return;
			case XHTMLPackage.FLOW__UL:
				getUl().clear();
				return;
			case XHTMLPackage.FLOW__OL:
				getOl().clear();
				return;
			case XHTMLPackage.FLOW__DL:
				getDl().clear();
				return;
			case XHTMLPackage.FLOW__PRE:
				getPre().clear();
				return;
			case XHTMLPackage.FLOW__HR:
				getHr().clear();
				return;
			case XHTMLPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XHTMLPackage.FLOW__ADDRESS:
				getAddress().clear();
				return;
			case XHTMLPackage.FLOW__TABLE:
				getTable().clear();
				return;
			case XHTMLPackage.FLOW__A:
				getA().clear();
				return;
			case XHTMLPackage.FLOW__BR:
				getBr().clear();
				return;
			case XHTMLPackage.FLOW__SPAN:
				getSpan().clear();
				return;
			case XHTMLPackage.FLOW__BDO:
				getBdo().clear();
				return;
			case XHTMLPackage.FLOW__MAP:
				getMap().clear();
				return;
			case XHTMLPackage.FLOW__IMG:
				getImg().clear();
				return;
			case XHTMLPackage.FLOW__TT:
				getTt().clear();
				return;
			case XHTMLPackage.FLOW__I:
				getI().clear();
				return;
			case XHTMLPackage.FLOW__B:
				getB().clear();
				return;
			case XHTMLPackage.FLOW__BIG:
				getBig().clear();
				return;
			case XHTMLPackage.FLOW__SMALL:
				getSmall().clear();
				return;
			case XHTMLPackage.FLOW__EM:
				getEm().clear();
				return;
			case XHTMLPackage.FLOW__STRONG:
				getStrong().clear();
				return;
			case XHTMLPackage.FLOW__DFN:
				getDfn().clear();
				return;
			case XHTMLPackage.FLOW__CODE:
				getCode().clear();
				return;
			case XHTMLPackage.FLOW__Q:
				getQ().clear();
				return;
			case XHTMLPackage.FLOW__SAMP:
				getSamp().clear();
				return;
			case XHTMLPackage.FLOW__KBD:
				getKbd().clear();
				return;
			case XHTMLPackage.FLOW__VAR:
				getVar().clear();
				return;
			case XHTMLPackage.FLOW__CITE:
				getCite().clear();
				return;
			case XHTMLPackage.FLOW__ABBR:
				getAbbr().clear();
				return;
			case XHTMLPackage.FLOW__ACRONYM:
				getAcronym().clear();
				return;
			case XHTMLPackage.FLOW__SUB:
				getSub().clear();
				return;
			case XHTMLPackage.FLOW__SUP:
				getSup().clear();
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
			case XHTMLPackage.FLOW__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XHTMLPackage.FLOW__GROUP:
				return !getGroup().isEmpty();
			case XHTMLPackage.FLOW__P:
				return !getP().isEmpty();
			case XHTMLPackage.FLOW__H1:
				return !getH1().isEmpty();
			case XHTMLPackage.FLOW__H2:
				return !getH2().isEmpty();
			case XHTMLPackage.FLOW__H3:
				return !getH3().isEmpty();
			case XHTMLPackage.FLOW__H4:
				return !getH4().isEmpty();
			case XHTMLPackage.FLOW__H5:
				return !getH5().isEmpty();
			case XHTMLPackage.FLOW__H6:
				return !getH6().isEmpty();
			case XHTMLPackage.FLOW__DIV:
				return !getDiv().isEmpty();
			case XHTMLPackage.FLOW__UL:
				return !getUl().isEmpty();
			case XHTMLPackage.FLOW__OL:
				return !getOl().isEmpty();
			case XHTMLPackage.FLOW__DL:
				return !getDl().isEmpty();
			case XHTMLPackage.FLOW__PRE:
				return !getPre().isEmpty();
			case XHTMLPackage.FLOW__HR:
				return !getHr().isEmpty();
			case XHTMLPackage.FLOW__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XHTMLPackage.FLOW__ADDRESS:
				return !getAddress().isEmpty();
			case XHTMLPackage.FLOW__TABLE:
				return !getTable().isEmpty();
			case XHTMLPackage.FLOW__A:
				return !getA().isEmpty();
			case XHTMLPackage.FLOW__BR:
				return !getBr().isEmpty();
			case XHTMLPackage.FLOW__SPAN:
				return !getSpan().isEmpty();
			case XHTMLPackage.FLOW__BDO:
				return !getBdo().isEmpty();
			case XHTMLPackage.FLOW__MAP:
				return !getMap().isEmpty();
			case XHTMLPackage.FLOW__IMG:
				return !getImg().isEmpty();
			case XHTMLPackage.FLOW__TT:
				return !getTt().isEmpty();
			case XHTMLPackage.FLOW__I:
				return !getI().isEmpty();
			case XHTMLPackage.FLOW__B:
				return !getB().isEmpty();
			case XHTMLPackage.FLOW__BIG:
				return !getBig().isEmpty();
			case XHTMLPackage.FLOW__SMALL:
				return !getSmall().isEmpty();
			case XHTMLPackage.FLOW__EM:
				return !getEm().isEmpty();
			case XHTMLPackage.FLOW__STRONG:
				return !getStrong().isEmpty();
			case XHTMLPackage.FLOW__DFN:
				return !getDfn().isEmpty();
			case XHTMLPackage.FLOW__CODE:
				return !getCode().isEmpty();
			case XHTMLPackage.FLOW__Q:
				return !getQ().isEmpty();
			case XHTMLPackage.FLOW__SAMP:
				return !getSamp().isEmpty();
			case XHTMLPackage.FLOW__KBD:
				return !getKbd().isEmpty();
			case XHTMLPackage.FLOW__VAR:
				return !getVar().isEmpty();
			case XHTMLPackage.FLOW__CITE:
				return !getCite().isEmpty();
			case XHTMLPackage.FLOW__ABBR:
				return !getAbbr().isEmpty();
			case XHTMLPackage.FLOW__ACRONYM:
				return !getAcronym().isEmpty();
			case XHTMLPackage.FLOW__SUB:
				return !getSub().isEmpty();
			case XHTMLPackage.FLOW__SUP:
				return !getSup().isEmpty();
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

} //FlowImpl
