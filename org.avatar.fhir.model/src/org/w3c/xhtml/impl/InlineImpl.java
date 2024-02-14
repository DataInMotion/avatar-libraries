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
import org.w3c.xhtml.BType;
import org.w3c.xhtml.BdoType;
import org.w3c.xhtml.BigType;
import org.w3c.xhtml.BrType;
import org.w3c.xhtml.CiteType;
import org.w3c.xhtml.CodeType;
import org.w3c.xhtml.DfnType;
import org.w3c.xhtml.EmType;
import org.w3c.xhtml.IType;
import org.w3c.xhtml.ImgType;
import org.w3c.xhtml.Inline;
import org.w3c.xhtml.KbdType;
import org.w3c.xhtml.MapType;
import org.w3c.xhtml.QType;
import org.w3c.xhtml.SampType;
import org.w3c.xhtml.SmallType;
import org.w3c.xhtml.SpanType;
import org.w3c.xhtml.StrongType;
import org.w3c.xhtml.SubType;
import org.w3c.xhtml.SupType;
import org.w3c.xhtml.TtType;
import org.w3c.xhtml.VarType;
import org.w3c.xhtml.XHTMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getInline <em>Inline</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.InlineImpl#getSup <em>Sup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineImpl extends MinimalEObjectImpl.Container implements Inline {
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
	protected InlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XHTMLPackage.eINSTANCE.getInline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XHTMLPackage.INLINE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInline() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTMLPackage.eINSTANCE.getInline_Inline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AType> getA() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrType> getBr() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpanType> getSpan() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BdoType> getBdo() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImgType> getImg() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TtType> getTt() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IType> getI() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BType> getB() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigType> getBig() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmallType> getSmall() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmType> getEm() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongType> getStrong() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DfnType> getDfn() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QType> getQ() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SampType> getSamp() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KbdType> getKbd() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarType> getVar() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiteType> getCite() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrType> getAbbr() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getInline().list(XHTMLPackage.eINSTANCE.getInline_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XHTMLPackage.INLINE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__INLINE:
				return ((InternalEList<?>)getInline()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.INLINE__SUP:
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
			case XHTMLPackage.INLINE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XHTMLPackage.INLINE__INLINE:
				if (coreType) return getInline();
				return ((FeatureMap.Internal)getInline()).getWrapper();
			case XHTMLPackage.INLINE__A:
				return getA();
			case XHTMLPackage.INLINE__BR:
				return getBr();
			case XHTMLPackage.INLINE__SPAN:
				return getSpan();
			case XHTMLPackage.INLINE__BDO:
				return getBdo();
			case XHTMLPackage.INLINE__MAP:
				return getMap();
			case XHTMLPackage.INLINE__IMG:
				return getImg();
			case XHTMLPackage.INLINE__TT:
				return getTt();
			case XHTMLPackage.INLINE__I:
				return getI();
			case XHTMLPackage.INLINE__B:
				return getB();
			case XHTMLPackage.INLINE__BIG:
				return getBig();
			case XHTMLPackage.INLINE__SMALL:
				return getSmall();
			case XHTMLPackage.INLINE__EM:
				return getEm();
			case XHTMLPackage.INLINE__STRONG:
				return getStrong();
			case XHTMLPackage.INLINE__DFN:
				return getDfn();
			case XHTMLPackage.INLINE__CODE:
				return getCode();
			case XHTMLPackage.INLINE__Q:
				return getQ();
			case XHTMLPackage.INLINE__SAMP:
				return getSamp();
			case XHTMLPackage.INLINE__KBD:
				return getKbd();
			case XHTMLPackage.INLINE__VAR:
				return getVar();
			case XHTMLPackage.INLINE__CITE:
				return getCite();
			case XHTMLPackage.INLINE__ABBR:
				return getAbbr();
			case XHTMLPackage.INLINE__ACRONYM:
				return getAcronym();
			case XHTMLPackage.INLINE__SUB:
				return getSub();
			case XHTMLPackage.INLINE__SUP:
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
			case XHTMLPackage.INLINE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XHTMLPackage.INLINE__INLINE:
				((FeatureMap.Internal)getInline()).set(newValue);
				return;
			case XHTMLPackage.INLINE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XHTMLPackage.INLINE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XHTMLPackage.INLINE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XHTMLPackage.INLINE__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case XHTMLPackage.INLINE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case XHTMLPackage.INLINE__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XHTMLPackage.INLINE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XHTMLPackage.INLINE__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XHTMLPackage.INLINE__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XHTMLPackage.INLINE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XHTMLPackage.INLINE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XHTMLPackage.INLINE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XHTMLPackage.INLINE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XHTMLPackage.INLINE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XHTMLPackage.INLINE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XHTMLPackage.INLINE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XHTMLPackage.INLINE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XHTMLPackage.INLINE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XHTMLPackage.INLINE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XHTMLPackage.INLINE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XHTMLPackage.INLINE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XHTMLPackage.INLINE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XHTMLPackage.INLINE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XHTMLPackage.INLINE__SUP:
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
			case XHTMLPackage.INLINE__MIXED:
				getMixed().clear();
				return;
			case XHTMLPackage.INLINE__INLINE:
				getInline().clear();
				return;
			case XHTMLPackage.INLINE__A:
				getA().clear();
				return;
			case XHTMLPackage.INLINE__BR:
				getBr().clear();
				return;
			case XHTMLPackage.INLINE__SPAN:
				getSpan().clear();
				return;
			case XHTMLPackage.INLINE__BDO:
				getBdo().clear();
				return;
			case XHTMLPackage.INLINE__MAP:
				getMap().clear();
				return;
			case XHTMLPackage.INLINE__IMG:
				getImg().clear();
				return;
			case XHTMLPackage.INLINE__TT:
				getTt().clear();
				return;
			case XHTMLPackage.INLINE__I:
				getI().clear();
				return;
			case XHTMLPackage.INLINE__B:
				getB().clear();
				return;
			case XHTMLPackage.INLINE__BIG:
				getBig().clear();
				return;
			case XHTMLPackage.INLINE__SMALL:
				getSmall().clear();
				return;
			case XHTMLPackage.INLINE__EM:
				getEm().clear();
				return;
			case XHTMLPackage.INLINE__STRONG:
				getStrong().clear();
				return;
			case XHTMLPackage.INLINE__DFN:
				getDfn().clear();
				return;
			case XHTMLPackage.INLINE__CODE:
				getCode().clear();
				return;
			case XHTMLPackage.INLINE__Q:
				getQ().clear();
				return;
			case XHTMLPackage.INLINE__SAMP:
				getSamp().clear();
				return;
			case XHTMLPackage.INLINE__KBD:
				getKbd().clear();
				return;
			case XHTMLPackage.INLINE__VAR:
				getVar().clear();
				return;
			case XHTMLPackage.INLINE__CITE:
				getCite().clear();
				return;
			case XHTMLPackage.INLINE__ABBR:
				getAbbr().clear();
				return;
			case XHTMLPackage.INLINE__ACRONYM:
				getAcronym().clear();
				return;
			case XHTMLPackage.INLINE__SUB:
				getSub().clear();
				return;
			case XHTMLPackage.INLINE__SUP:
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
			case XHTMLPackage.INLINE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XHTMLPackage.INLINE__INLINE:
				return !getInline().isEmpty();
			case XHTMLPackage.INLINE__A:
				return !getA().isEmpty();
			case XHTMLPackage.INLINE__BR:
				return !getBr().isEmpty();
			case XHTMLPackage.INLINE__SPAN:
				return !getSpan().isEmpty();
			case XHTMLPackage.INLINE__BDO:
				return !getBdo().isEmpty();
			case XHTMLPackage.INLINE__MAP:
				return !getMap().isEmpty();
			case XHTMLPackage.INLINE__IMG:
				return !getImg().isEmpty();
			case XHTMLPackage.INLINE__TT:
				return !getTt().isEmpty();
			case XHTMLPackage.INLINE__I:
				return !getI().isEmpty();
			case XHTMLPackage.INLINE__B:
				return !getB().isEmpty();
			case XHTMLPackage.INLINE__BIG:
				return !getBig().isEmpty();
			case XHTMLPackage.INLINE__SMALL:
				return !getSmall().isEmpty();
			case XHTMLPackage.INLINE__EM:
				return !getEm().isEmpty();
			case XHTMLPackage.INLINE__STRONG:
				return !getStrong().isEmpty();
			case XHTMLPackage.INLINE__DFN:
				return !getDfn().isEmpty();
			case XHTMLPackage.INLINE__CODE:
				return !getCode().isEmpty();
			case XHTMLPackage.INLINE__Q:
				return !getQ().isEmpty();
			case XHTMLPackage.INLINE__SAMP:
				return !getSamp().isEmpty();
			case XHTMLPackage.INLINE__KBD:
				return !getKbd().isEmpty();
			case XHTMLPackage.INLINE__VAR:
				return !getVar().isEmpty();
			case XHTMLPackage.INLINE__CITE:
				return !getCite().isEmpty();
			case XHTMLPackage.INLINE__ABBR:
				return !getAbbr().isEmpty();
			case XHTMLPackage.INLINE__ACRONYM:
				return !getAcronym().isEmpty();
			case XHTMLPackage.INLINE__SUB:
				return !getSub().isEmpty();
			case XHTMLPackage.INLINE__SUP:
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

} //InlineImpl
