/*
 */
package org.w3c.xhtml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colgroup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getCol <em>Col</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getChar <em>Char</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getValign <em>Valign</em>}</li>
 *   <li>{@link org.w3c.xhtml.ColgroupType#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType()
 * @model extendedMetaData="name='colgroup_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ColgroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml.ColType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       col elements define the alignment properties for cells in
	 *       one or more columns.
	 * 
	 *       The width attribute specifies the width of the columns, e.g.
	 * 
	 *           width=64        width in screen pixels
	 *           width=0.5*      relative width of 0.5
	 * 
	 *       The span attribute causes the attributes of one
	 *       col element to apply to more than one column.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColType> getCol();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml.AlignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.w3c.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.w3c.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml.ColgroupType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml.ColgroupType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Char()
	 * @model dataType="org.w3c.xhtml.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Charoff()
	 * @model dataType="org.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml.ColgroupType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml.ColgroupType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Lang()
	 * @model dataType="org.w3c.xhtml.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *               
	 *     <h3>lang (as an attribute name)</h3>
	 *               
	 *     <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *             
	 *   </div>
	 *           
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *               
	 *     <h4>Notes</h4>
	 *               
	 *     <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *               
	 *     <p>
	 *             See BCP 47 at 
	 *       <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *             and the IANA language subtag registry at
	 *       
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *             for further information.
	 *      
	 *     </p>
	 *               
	 *     <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *             
	 *   </div>
	 *         
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(String value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #setSpan(BigInteger)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Span()
	 * @model default="1" unsettable="true" dataType="org.w3c.xhtml.Number"
	 *        extendedMetaData="kind='attribute' name='span'"
	 * @generated
	 */
	BigInteger getSpan();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml.ColgroupType#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan()
	 * @see #getSpan()
	 * @see #setSpan(BigInteger)
	 * @generated
	 */
	void unsetSpan();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml.ColgroupType#getSpan <em>Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span</em>' attribute is set.
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @see #setSpan(BigInteger)
	 * @generated
	 */
	boolean isSetSpan();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Style()
	 * @model dataType="org.w3c.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Title()
	 * @model dataType="org.w3c.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml.ValignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.w3c.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.w3c.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml.ColgroupType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml.ColgroupType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.w3c.xhtml.XHTMLPackage#getColgroupType_Width()
	 * @model dataType="org.w3c.xhtml.MultiLength"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml.ColgroupType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // ColgroupType
