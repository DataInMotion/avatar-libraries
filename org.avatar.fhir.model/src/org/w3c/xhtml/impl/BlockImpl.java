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

import org.w3c.xhtml.AddressType;
import org.w3c.xhtml.Block;
import org.w3c.xhtml.BlockquoteType;
import org.w3c.xhtml.DivType;
import org.w3c.xhtml.DlType;
import org.w3c.xhtml.H1Type;
import org.w3c.xhtml.H2Type;
import org.w3c.xhtml.H3Type;
import org.w3c.xhtml.H4Type;
import org.w3c.xhtml.H5Type;
import org.w3c.xhtml.H6Type;
import org.w3c.xhtml.HrType;
import org.w3c.xhtml.OlType;
import org.w3c.xhtml.PType;
import org.w3c.xhtml.PreType;
import org.w3c.xhtml.TableType;
import org.w3c.xhtml.UlType;
import org.w3c.xhtml.XHTMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml.impl.BlockImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XHTMLPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBlock() {
		if (block == null) {
			block = new BasicFeatureMap(this, XHTMLPackage.BLOCK__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H1Type> getH1() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H2Type> getH2() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H3Type> getH3() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H4Type> getH4() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H5Type> getH5() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H6Type> getH6() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__H6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DivType> getDiv() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UlType> getUl() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlType> getOl() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DlType> getDl() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreType> getPre() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HrType> getHr() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getBlock().list(XHTMLPackage.Literals.BLOCK__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XHTMLPackage.BLOCK__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XHTMLPackage.BLOCK__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
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
			case XHTMLPackage.BLOCK__BLOCK:
				if (coreType) return getBlock();
				return ((FeatureMap.Internal)getBlock()).getWrapper();
			case XHTMLPackage.BLOCK__P:
				return getP();
			case XHTMLPackage.BLOCK__H1:
				return getH1();
			case XHTMLPackage.BLOCK__H2:
				return getH2();
			case XHTMLPackage.BLOCK__H3:
				return getH3();
			case XHTMLPackage.BLOCK__H4:
				return getH4();
			case XHTMLPackage.BLOCK__H5:
				return getH5();
			case XHTMLPackage.BLOCK__H6:
				return getH6();
			case XHTMLPackage.BLOCK__DIV:
				return getDiv();
			case XHTMLPackage.BLOCK__UL:
				return getUl();
			case XHTMLPackage.BLOCK__OL:
				return getOl();
			case XHTMLPackage.BLOCK__DL:
				return getDl();
			case XHTMLPackage.BLOCK__PRE:
				return getPre();
			case XHTMLPackage.BLOCK__HR:
				return getHr();
			case XHTMLPackage.BLOCK__BLOCKQUOTE:
				return getBlockquote();
			case XHTMLPackage.BLOCK__ADDRESS:
				return getAddress();
			case XHTMLPackage.BLOCK__TABLE:
				return getTable();
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
			case XHTMLPackage.BLOCK__BLOCK:
				((FeatureMap.Internal)getBlock()).set(newValue);
				return;
			case XHTMLPackage.BLOCK__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case XHTMLPackage.BLOCK__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case XHTMLPackage.BLOCK__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case XHTMLPackage.BLOCK__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case XHTMLPackage.BLOCK__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case XHTMLPackage.BLOCK__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case XHTMLPackage.BLOCK__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case XHTMLPackage.BLOCK__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case XHTMLPackage.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case XHTMLPackage.BLOCK__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case XHTMLPackage.BLOCK__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
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
			case XHTMLPackage.BLOCK__BLOCK:
				getBlock().clear();
				return;
			case XHTMLPackage.BLOCK__P:
				getP().clear();
				return;
			case XHTMLPackage.BLOCK__H1:
				getH1().clear();
				return;
			case XHTMLPackage.BLOCK__H2:
				getH2().clear();
				return;
			case XHTMLPackage.BLOCK__H3:
				getH3().clear();
				return;
			case XHTMLPackage.BLOCK__H4:
				getH4().clear();
				return;
			case XHTMLPackage.BLOCK__H5:
				getH5().clear();
				return;
			case XHTMLPackage.BLOCK__H6:
				getH6().clear();
				return;
			case XHTMLPackage.BLOCK__DIV:
				getDiv().clear();
				return;
			case XHTMLPackage.BLOCK__UL:
				getUl().clear();
				return;
			case XHTMLPackage.BLOCK__OL:
				getOl().clear();
				return;
			case XHTMLPackage.BLOCK__DL:
				getDl().clear();
				return;
			case XHTMLPackage.BLOCK__PRE:
				getPre().clear();
				return;
			case XHTMLPackage.BLOCK__HR:
				getHr().clear();
				return;
			case XHTMLPackage.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XHTMLPackage.BLOCK__ADDRESS:
				getAddress().clear();
				return;
			case XHTMLPackage.BLOCK__TABLE:
				getTable().clear();
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
			case XHTMLPackage.BLOCK__BLOCK:
				return block != null && !block.isEmpty();
			case XHTMLPackage.BLOCK__P:
				return !getP().isEmpty();
			case XHTMLPackage.BLOCK__H1:
				return !getH1().isEmpty();
			case XHTMLPackage.BLOCK__H2:
				return !getH2().isEmpty();
			case XHTMLPackage.BLOCK__H3:
				return !getH3().isEmpty();
			case XHTMLPackage.BLOCK__H4:
				return !getH4().isEmpty();
			case XHTMLPackage.BLOCK__H5:
				return !getH5().isEmpty();
			case XHTMLPackage.BLOCK__H6:
				return !getH6().isEmpty();
			case XHTMLPackage.BLOCK__DIV:
				return !getDiv().isEmpty();
			case XHTMLPackage.BLOCK__UL:
				return !getUl().isEmpty();
			case XHTMLPackage.BLOCK__OL:
				return !getOl().isEmpty();
			case XHTMLPackage.BLOCK__DL:
				return !getDl().isEmpty();
			case XHTMLPackage.BLOCK__PRE:
				return !getPre().isEmpty();
			case XHTMLPackage.BLOCK__HR:
				return !getHr().isEmpty();
			case XHTMLPackage.BLOCK__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XHTMLPackage.BLOCK__ADDRESS:
				return !getAddress().isEmpty();
			case XHTMLPackage.BLOCK__TABLE:
				return !getTable().isEmpty();
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
		result.append(" (block: ");
		result.append(block);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
