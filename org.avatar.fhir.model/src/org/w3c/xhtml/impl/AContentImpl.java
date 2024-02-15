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

import org.w3c.xhtml.AContent;
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
 * An implementation of the model object '<em><b>AContent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.AContentImpl#getSup <em>Sup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AContentImpl extends MinimalEObjectImpl.Container implements AContent {
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
	protected AContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XHTMLPackage.Literals.ACONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XHTMLPackage.ACONTENT__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTMLPackage.Literals.ACONTENT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrType> getBr() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpanType> getSpan() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BdoType> getBdo() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__BDO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImgType> getImg() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TtType> getTt() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IType> getI() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BType> getB() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigType> getBig() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmallType> getSmall() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmType> getEm() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongType> getStrong() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DfnType> getDfn() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QType> getQ() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SampType> getSamp() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KbdType> getKbd() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarType> getVar() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiteType> getCite() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrType> getAbbr() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getGroup().list(XHTMLPackage.Literals.ACONTENT__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XHTMLPackage.ACONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.ACONTENT__SUP:
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
			case XHTMLPackage.ACONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XHTMLPackage.ACONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XHTMLPackage.ACONTENT__BR:
				return getBr();
			case XHTMLPackage.ACONTENT__SPAN:
				return getSpan();
			case XHTMLPackage.ACONTENT__BDO:
				return getBdo();
			case XHTMLPackage.ACONTENT__MAP:
				return getMap();
			case XHTMLPackage.ACONTENT__IMG:
				return getImg();
			case XHTMLPackage.ACONTENT__TT:
				return getTt();
			case XHTMLPackage.ACONTENT__I:
				return getI();
			case XHTMLPackage.ACONTENT__B:
				return getB();
			case XHTMLPackage.ACONTENT__BIG:
				return getBig();
			case XHTMLPackage.ACONTENT__SMALL:
				return getSmall();
			case XHTMLPackage.ACONTENT__EM:
				return getEm();
			case XHTMLPackage.ACONTENT__STRONG:
				return getStrong();
			case XHTMLPackage.ACONTENT__DFN:
				return getDfn();
			case XHTMLPackage.ACONTENT__CODE:
				return getCode();
			case XHTMLPackage.ACONTENT__Q:
				return getQ();
			case XHTMLPackage.ACONTENT__SAMP:
				return getSamp();
			case XHTMLPackage.ACONTENT__KBD:
				return getKbd();
			case XHTMLPackage.ACONTENT__VAR:
				return getVar();
			case XHTMLPackage.ACONTENT__CITE:
				return getCite();
			case XHTMLPackage.ACONTENT__ABBR:
				return getAbbr();
			case XHTMLPackage.ACONTENT__ACRONYM:
				return getAcronym();
			case XHTMLPackage.ACONTENT__SUB:
				return getSub();
			case XHTMLPackage.ACONTENT__SUP:
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
			case XHTMLPackage.ACONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XHTMLPackage.ACONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XHTMLPackage.ACONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XHTMLPackage.ACONTENT__SUP:
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
			case XHTMLPackage.ACONTENT__MIXED:
				getMixed().clear();
				return;
			case XHTMLPackage.ACONTENT__GROUP:
				getGroup().clear();
				return;
			case XHTMLPackage.ACONTENT__BR:
				getBr().clear();
				return;
			case XHTMLPackage.ACONTENT__SPAN:
				getSpan().clear();
				return;
			case XHTMLPackage.ACONTENT__BDO:
				getBdo().clear();
				return;
			case XHTMLPackage.ACONTENT__MAP:
				getMap().clear();
				return;
			case XHTMLPackage.ACONTENT__IMG:
				getImg().clear();
				return;
			case XHTMLPackage.ACONTENT__TT:
				getTt().clear();
				return;
			case XHTMLPackage.ACONTENT__I:
				getI().clear();
				return;
			case XHTMLPackage.ACONTENT__B:
				getB().clear();
				return;
			case XHTMLPackage.ACONTENT__BIG:
				getBig().clear();
				return;
			case XHTMLPackage.ACONTENT__SMALL:
				getSmall().clear();
				return;
			case XHTMLPackage.ACONTENT__EM:
				getEm().clear();
				return;
			case XHTMLPackage.ACONTENT__STRONG:
				getStrong().clear();
				return;
			case XHTMLPackage.ACONTENT__DFN:
				getDfn().clear();
				return;
			case XHTMLPackage.ACONTENT__CODE:
				getCode().clear();
				return;
			case XHTMLPackage.ACONTENT__Q:
				getQ().clear();
				return;
			case XHTMLPackage.ACONTENT__SAMP:
				getSamp().clear();
				return;
			case XHTMLPackage.ACONTENT__KBD:
				getKbd().clear();
				return;
			case XHTMLPackage.ACONTENT__VAR:
				getVar().clear();
				return;
			case XHTMLPackage.ACONTENT__CITE:
				getCite().clear();
				return;
			case XHTMLPackage.ACONTENT__ABBR:
				getAbbr().clear();
				return;
			case XHTMLPackage.ACONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case XHTMLPackage.ACONTENT__SUB:
				getSub().clear();
				return;
			case XHTMLPackage.ACONTENT__SUP:
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
			case XHTMLPackage.ACONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XHTMLPackage.ACONTENT__GROUP:
				return !getGroup().isEmpty();
			case XHTMLPackage.ACONTENT__BR:
				return !getBr().isEmpty();
			case XHTMLPackage.ACONTENT__SPAN:
				return !getSpan().isEmpty();
			case XHTMLPackage.ACONTENT__BDO:
				return !getBdo().isEmpty();
			case XHTMLPackage.ACONTENT__MAP:
				return !getMap().isEmpty();
			case XHTMLPackage.ACONTENT__IMG:
				return !getImg().isEmpty();
			case XHTMLPackage.ACONTENT__TT:
				return !getTt().isEmpty();
			case XHTMLPackage.ACONTENT__I:
				return !getI().isEmpty();
			case XHTMLPackage.ACONTENT__B:
				return !getB().isEmpty();
			case XHTMLPackage.ACONTENT__BIG:
				return !getBig().isEmpty();
			case XHTMLPackage.ACONTENT__SMALL:
				return !getSmall().isEmpty();
			case XHTMLPackage.ACONTENT__EM:
				return !getEm().isEmpty();
			case XHTMLPackage.ACONTENT__STRONG:
				return !getStrong().isEmpty();
			case XHTMLPackage.ACONTENT__DFN:
				return !getDfn().isEmpty();
			case XHTMLPackage.ACONTENT__CODE:
				return !getCode().isEmpty();
			case XHTMLPackage.ACONTENT__Q:
				return !getQ().isEmpty();
			case XHTMLPackage.ACONTENT__SAMP:
				return !getSamp().isEmpty();
			case XHTMLPackage.ACONTENT__KBD:
				return !getKbd().isEmpty();
			case XHTMLPackage.ACONTENT__VAR:
				return !getVar().isEmpty();
			case XHTMLPackage.ACONTENT__CITE:
				return !getCite().isEmpty();
			case XHTMLPackage.ACONTENT__ABBR:
				return !getAbbr().isEmpty();
			case XHTMLPackage.ACONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case XHTMLPackage.ACONTENT__SUB:
				return !getSub().isEmpty();
			case XHTMLPackage.ACONTENT__SUP:
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

} //AContentImpl
