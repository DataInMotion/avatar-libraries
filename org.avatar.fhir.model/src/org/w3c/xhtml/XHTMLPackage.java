/**
 */
package org.w3c.xhtml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * 
 *     XHTML 1.0 (Second Edition) Strict in XML Schema
 * 
 *     This is the same as HTML 4 Strict except for
 *     changes due to the differences between XML and SGML.
 * 
 *     Namespace = http://www.w3.org/1999/xhtml
 * 
 *     For further information, see: http://www.w3.org/TR/xhtml1
 * 
 *     Copyright (c) 1998-2002 W3C (MIT, INRIA, Keio),
 *     All Rights Reserved. 
 * 
 *     The DTD version is identified by the PUBLIC and SYSTEM identifiers:
 * 
 *     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"
 * 
 *     _id: xhtml1-strict.xsd,v 1.2 2002/08/28 08:05:44 mimasa Exp $
 *     
 * 
 *     ================ Character mnemonic entities =========================
 * 
 *     XHTML entity sets are identified by the PUBLIC and SYSTEM identifiers:
 *   
 *     PUBLIC "-//W3C//ENTITIES Latin 1 for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Special for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Symbols for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent"
 *     
 * 
 *     ================== Imported Names ====================================
 *     
 * 
 *     these are used for image maps
 *     
 * 
 *     =================== Generic Attributes ===============================
 *     
 * 
 *     =================== Text Elements ====================================
 *     
 * 
 *     ================== Block level elements ==============================
 *     
 * 
 *     ================== Content models for exclusions =====================
 *     
 * 
 *     ================ Document Structure ==================================
 *     
 * 
 *     =================== Paragraphs =======================================
 *     
 * 
 *     =================== Headings =========================================
 * 
 *     There are six levels of headings from h1 (the most important)
 *     to h6 (the least important).
 *     
 * 
 *     =================== Lists ============================================
 *     
 * 
 *     definition lists - dt for term, dd for its definition
 *     
 * 
 *     =================== Address ==========================================
 *     
 * 
 *     =================== Horizontal Rule ==================================
 *     
 * 
 *     =================== Preformatted Text ================================
 *     
 * 
 *     =================== Block-like Quotes ================================
 *     
 * 
 *     ================== The Anchor Element ================================
 *     
 * 
 *     ===================== Inline Elements ================================
 *     
 * 
 *     =================== Images ===========================================
 * 
 *     To avoid accessibility problems for people who aren't
 *     able to see the image, you should provide a text
 *     description using the alt and longdesc attributes.
 *     In addition, avoid the use of server-side image maps.
 *     Note that in this DTD there is no name attribute. That
 *     is only available in the transitional and frameset DTD.
 *     
 * 
 *     ================== Client-side image maps ============================
 * 
 *     These can be placed in the same document or grouped in a
 *     separate document although this isn't yet widely supported
 *     
 * 
 *     ======================= Tables =======================================
 * 
 *     Derived from IETF HTML table standard, see [RFC1942]
 *     
 * 
 *     Use thead to duplicate headers when breaking table
 *     across page boundaries, or for static headers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use tfoot to duplicate footers when breaking table
 *     across page boundaries, or for static footers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use multiple tbody sections when rules are needed
 *     between groups of table rows.
 *     
 * 
 *     th is for headers, td for data and for cells acting as both
 *     
 * 
 *         
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *             
 *     <h1>About the XML namespace</h1>
 *             
 *     <div class="bodytext">
 *                 
 *       <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *                 
 *       <p>
 *               See 
 *         <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a>
 *          and
 *       
 *         <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a>
 *          for information 
 *       about this namespace.
 *      
 *       </p>
 *                 
 *       <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *                 
 *       <p>
 *            
 *       See further below in this document for more information about 
 *         <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a>
 *          and about 
 *         <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>
 *         .
 *      
 *       </p>
 *               
 *     </div>
 *           
 *   </div>
 *       
 * 
 * 
 *         
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *             
 *     <h3>Father (in any context at all)</h3>
 *             
 *     <div class="bodytext">
 *                 
 *       <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *                 
 *       <blockquote>
 *                     
 *         <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *                   
 *       </blockquote>
 *               
 *     </div>
 *           
 *   </div>
 *       
 * 
 * 
 *         
 *   <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *             
 *     <h2>
 *                 
 *       <a name="usage">About this schema document</a>
 *               
 *     </h2>
 *             
 *     <div class="bodytext">
 *                 
 *       <p>
 *               This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow 
 *         <code>xml:base</code>
 *         ,
 *       
 *         <code>xml:lang</code>
 *         , 
 *         <code>xml:space</code>
 *          or
 *       
 *         <code>xml:id</code>
 *          attributes on elements they define.
 *      
 *       </p>
 *                 
 *       <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *                 
 *       <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *                 
 *       <p>
 *       or
 *      </p>
 *                 
 *       <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *                 
 *       <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *                 
 *       <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *                 
 *       <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *               
 *     </div>
 *           
 *   </div>
 *       
 * 
 * 
 *         
 *   <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *             
 *     <h2>
 *                 
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *               
 *     </h2>
 *             
 *     <div class="bodytext">
 *                 
 *       <p>
 *               In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>
 *         .
 *      
 *       </p>
 *                 
 *       <p>
 *               At the date of issue it can also be found at
 *       
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>
 *         .
 *      
 *       </p>
 *                 
 *       <p>
 *               The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at 
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a>
 *          
 *       will change accordingly; the version at 
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a>
 *          
 *       will not change.
 *      
 *       </p>
 *                 
 *       <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *                 
 *       <ul>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *                       
 *         </li>
 *                   
 *       </ul>
 *               
 *     </div>
 *           
 *   </div>
 *       
 * 
 * <!-- end-model-doc -->
 * @see org.w3c.xhtml.XHTMLFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface XHTMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xhtml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xhtml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xhtml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XHTMLPackage eINSTANCE = org.w3c.xhtml.impl.XHTMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.InlineImpl <em>Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.InlineImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getInline()
	 * @generated
	 */
	int INLINE = 33;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__INLINE = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__A = 2;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BR = 3;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SPAN = 4;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BDO = 5;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__MAP = 6;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__IMG = 7;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__TT = 8;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__I = 9;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__B = 10;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BIG = 11;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SMALL = 12;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__EM = 13;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__STRONG = 14;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__DFN = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CODE = 16;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__Q = 17;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SAMP = 18;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__KBD = 19;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__VAR = 20;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CITE = 21;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ABBR = 22;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ACRONYM = 23;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUB = 24;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUP = 25;

	/**
	 * The number of structural features of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.AbbrTypeImpl <em>Abbr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.AbbrTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAbbrType()
	 * @generated
	 */
	int ABBR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abbr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Abbr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.AContentImpl <em>AContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.AContentImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAContent()
	 * @generated
	 */
	int ACONTENT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BDO = 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__MAP = 5;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__IMG = 6;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__TT = 7;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__I = 8;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__B = 9;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BIG = 10;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SMALL = 11;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__EM = 12;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__STRONG = 13;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__DFN = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CODE = 15;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__Q = 16;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SAMP = 17;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__KBD = 18;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__VAR = 19;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CITE = 20;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ABBR = 21;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ACRONYM = 22;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUB = 23;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUP = 24;

	/**
	 * The number of structural features of the '<em>AContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>AContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.AcronymTypeImpl <em>Acronym Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.AcronymTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAcronymType()
	 * @generated
	 */
	int ACRONYM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Acronym Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Acronym Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.AddressTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.AreaTypeImpl <em>Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.AreaTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAreaType()
	 * @generated
	 */
	int AREA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__ACCESSKEY = 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__ALT = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__COORDS = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__DIR = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__HREF = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Nohref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__NOHREF = 9;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__STYLE = 11;

	/**
	 * The feature id for the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__TABINDEX = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__TITLE = 13;

	/**
	 * The number of structural features of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ATypeImpl <em>AType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ATypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAType()
	 * @generated
	 */
	int ATYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__MIXED = ACONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__GROUP = ACONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__BR = ACONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SPAN = ACONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__BDO = ACONTENT__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__MAP = ACONTENT__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__IMG = ACONTENT__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TT = ACONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__I = ACONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__B = ACONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__BIG = ACONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SMALL = ACONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__EM = ACONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__STRONG = ACONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__DFN = ACONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CODE = ACONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__Q = ACONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SAMP = ACONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__KBD = ACONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__VAR = ACONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CITE = ACONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ABBR = ACONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ACRONYM = ACONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SUB = ACONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SUP = ACONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ACCESSKEY = ACONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CHARSET = ACONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CLASS = ACONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__COORDS = ACONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__DIR = ACONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREF = ACONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREFLANG = ACONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ID = ACONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__LANG = ACONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__LANG1 = ACONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__NAME = ACONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__REL = ACONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__REV = ACONTENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SHAPE = ACONTENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__STYLE = ACONTENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TABINDEX = ACONTENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TITLE = ACONTENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TYPE = ACONTENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_FEATURE_COUNT = ACONTENT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_OPERATION_COUNT = ACONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BdoTypeImpl <em>Bdo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BdoTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBdoType()
	 * @generated
	 */
	int BDO_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bdo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bdo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDO_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BigTypeImpl <em>Big Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BigTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBigType()
	 * @generated
	 */
	int BIG_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Big Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Big Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BlockImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__P = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H6 = 7;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DIV = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OL = 10;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DL = 11;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PRE = 12;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HR = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TABLE = 16;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BlockquoteTypeImpl <em>Blockquote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BlockquoteTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBlockquoteType()
	 * @generated
	 */
	int BLOCKQUOTE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__BLOCK = BLOCK__BLOCK;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__P = BLOCK__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H1 = BLOCK__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H2 = BLOCK__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H3 = BLOCK__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H4 = BLOCK__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H5 = BLOCK__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H6 = BLOCK__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DIV = BLOCK__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__UL = BLOCK__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__OL = BLOCK__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DL = BLOCK__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__PRE = BLOCK__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__HR = BLOCK__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__BLOCKQUOTE = BLOCK__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__ADDRESS = BLOCK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__TABLE = BLOCK__TABLE;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__CITE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__CLASS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DIR = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__ID = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__LANG = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__LANG1 = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__STYLE = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__TITLE = BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Blockquote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Blockquote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BrTypeImpl <em>Br Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BrTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBrType()
	 * @generated
	 */
	int BR_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Br Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Br Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.BTypeImpl <em>BType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.BTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBType()
	 * @generated
	 */
	int BTYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.CaptionTypeImpl <em>Caption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.CaptionTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCaptionType()
	 * @generated
	 */
	int CAPTION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Caption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Caption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.CiteTypeImpl <em>Cite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.CiteTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCiteType()
	 * @generated
	 */
	int CITE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.CodeTypeImpl <em>Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.CodeTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCodeType()
	 * @generated
	 */
	int CODE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ColgroupTypeImpl <em>Colgroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ColgroupTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getColgroupType()
	 * @generated
	 */
	int COLGROUP_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__COL = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__DIR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__SPAN = 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__STYLE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__TITLE = 11;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__VALIGN = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Colgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Colgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ColTypeImpl <em>Col Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ColTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getColType()
	 * @generated
	 */
	int COL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CHAR = 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CHAROFF = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__DIR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__LANG1 = 7;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__SPAN = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__VALIGN = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__WIDTH = 12;

	/**
	 * The number of structural features of the '<em>Col Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Col Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.FlowImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__GROUP = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__P = 2;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H1 = 3;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H2 = 4;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H3 = 5;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H4 = 6;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H5 = 7;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H6 = 8;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DIV = 9;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__UL = 10;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OL = 11;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DL = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PRE = 13;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__HR = 14;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BLOCKQUOTE = 15;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TABLE = 17;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__A = 18;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BR = 19;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SPAN = 20;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BDO = 21;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MAP = 22;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IMG = 23;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TT = 24;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__I = 25;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__B = 26;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BIG = 27;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SMALL = 28;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EM = 29;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STRONG = 30;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DFN = 31;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CODE = 32;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__Q = 33;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SAMP = 34;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__KBD = 35;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VAR = 36;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CITE = 37;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ABBR = 38;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACRONYM = 39;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUB = 40;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUP = 41;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DdTypeImpl <em>Dd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DdTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDdType()
	 * @generated
	 */
	int DD_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BDO = FLOW__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__MAP = FLOW__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DIR = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ID = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__LANG = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__LANG1 = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__STYLE = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TITLE = FLOW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DfnTypeImpl <em>Dfn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DfnTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDfnType()
	 * @generated
	 */
	int DFN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dfn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dfn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DivTypeImpl <em>Div Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DivTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDivType()
	 * @generated
	 */
	int DIV_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BDO = FLOW__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__MAP = FLOW__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DIR = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ID = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__LANG = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__LANG1 = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__STYLE = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TITLE = FLOW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DlTypeImpl <em>Dl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DlTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDlType()
	 * @generated
	 */
	int DL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__DT = 1;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__DD = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__DIR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__LANG1 = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__TITLE = 9;

	/**
	 * The number of structural features of the '<em>Dl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Dl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DocumentRootImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__A = 3;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABBR = 4;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACRONYM = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AREA = 7;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__B = 8;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BDO = 9;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIG = 10;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BLOCKQUOTE = 11;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BR = 12;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION = 13;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE = 15;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COL = 16;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLGROUP = 17;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DD = 18;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DFN = 19;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIV = 20;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DL = 21;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DT = 22;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EM = 23;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H1 = 24;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H2 = 25;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H3 = 26;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H4 = 27;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H5 = 28;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H6 = 29;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HR = 30;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__I = 31;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMG = 32;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KBD = 33;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LI = 34;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAP = 35;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OL = 36;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__P = 37;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRE = 38;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Q = 39;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SAMP = 40;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL = 41;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPAN = 42;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRONG = 43;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB = 44;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUP = 45;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE = 46;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TBODY = 47;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TD = 48;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TFOOT = 49;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TH = 50;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THEAD = 51;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TR = 52;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TT = 53;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UL = 54;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VAR = 55;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 56;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.DtTypeImpl <em>Dt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.DtTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDtType()
	 * @generated
	 */
	int DT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.EmTypeImpl <em>Em Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.EmTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getEmType()
	 * @generated
	 */
	int EM_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Em Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Em Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H1TypeImpl <em>H1 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H1TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH1Type()
	 * @generated
	 */
	int H1_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H2TypeImpl <em>H2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H2TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH2Type()
	 * @generated
	 */
	int H2_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H3TypeImpl <em>H3 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H3TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH3Type()
	 * @generated
	 */
	int H3_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H4TypeImpl <em>H4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H4TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH4Type()
	 * @generated
	 */
	int H4_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H5TypeImpl <em>H5 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H5TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH5Type()
	 * @generated
	 */
	int H5_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H5 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H5 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.H6TypeImpl <em>H6 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.H6TypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH6Type()
	 * @generated
	 */
	int H6_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>H6 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>H6 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.HrTypeImpl <em>Hr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.HrTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getHrType()
	 * @generated
	 */
	int HR_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__DIR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__LANG = 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__LANG1 = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__TITLE = 6;

	/**
	 * The number of structural features of the '<em>Hr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Hr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ImgTypeImpl <em>Img Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ImgTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getImgType()
	 * @generated
	 */
	int IMG_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ALT = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__DIR = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Ismap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ISMAP = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__LANG1 = 7;

	/**
	 * The feature id for the '<em><b>Longdesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__LONGDESC = 8;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__SRC = 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__STYLE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__TITLE = 11;

	/**
	 * The feature id for the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__USEMAP = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Img Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Img Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ITypeImpl <em>IType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ITypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIType()
	 * @generated
	 */
	int ITYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.KbdTypeImpl <em>Kbd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.KbdTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getKbdType()
	 * @generated
	 */
	int KBD_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Kbd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Kbd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.LiTypeImpl <em>Li Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.LiTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLiType()
	 * @generated
	 */
	int LI_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BDO = FLOW__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__MAP = FLOW__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DIR = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ID = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__LANG = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__LANG1 = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__STYLE = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TITLE = FLOW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Li Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Li Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.MapTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__P = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DIV = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__OL = 10;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DL = 11;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__PRE = 12;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__HR = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__TABLE = 16;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__AREA = 17;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CLASS = 18;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DIR = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ID = 20;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LANG = 21;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LANG1 = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__NAME = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__STYLE = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__TITLE = 25;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.OlTypeImpl <em>Ol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.OlTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getOlType()
	 * @generated
	 */
	int OL_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__DIR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__LANG = 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__LANG1 = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__TITLE = 7;

	/**
	 * The number of structural features of the '<em>Ol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.PreContentImpl <em>Pre Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.PreContentImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPreContent()
	 * @generated
	 */
	int PRE_CONTENT = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__A = 2;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__TT = 3;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__I = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__B = 5;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BIG = 6;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SMALL = 7;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__EM = 8;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__STRONG = 9;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__DFN = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CODE = 11;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__Q = 12;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SAMP = 13;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__KBD = 14;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__VAR = 15;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CITE = 16;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ABBR = 17;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ACRONYM = 18;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUB = 19;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUP = 20;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BR = 21;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SPAN = 22;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BDO = 23;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__MAP = 24;

	/**
	 * The number of structural features of the '<em>Pre Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Pre Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.PreTypeImpl <em>Pre Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.PreTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPreType()
	 * @generated
	 */
	int PRE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__MIXED = PRE_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__GROUP = PRE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__A = PRE_CONTENT__A;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__TT = PRE_CONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__I = PRE_CONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__B = PRE_CONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__BIG = PRE_CONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SMALL = PRE_CONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__EM = PRE_CONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__STRONG = PRE_CONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__DFN = PRE_CONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CODE = PRE_CONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__Q = PRE_CONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SAMP = PRE_CONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__KBD = PRE_CONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__VAR = PRE_CONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CITE = PRE_CONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ABBR = PRE_CONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ACRONYM = PRE_CONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SUB = PRE_CONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SUP = PRE_CONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__BR = PRE_CONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SPAN = PRE_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__BDO = PRE_CONTENT__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__MAP = PRE_CONTENT__MAP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CLASS = PRE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__DIR = PRE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ID = PRE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__LANG = PRE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__LANG1 = PRE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SPACE = PRE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__STYLE = PRE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__TITLE = PRE_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Pre Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE_FEATURE_COUNT = PRE_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Pre Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE_OPERATION_COUNT = PRE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.PTypeImpl <em>PType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.PTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 41;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.QTypeImpl <em>QType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.QTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CITE1 = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CLASS = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__DIR = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ID = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__LANG = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__LANG1 = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__STYLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__TITLE = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>QType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>QType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.SampTypeImpl <em>Samp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.SampTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSampType()
	 * @generated
	 */
	int SAMP_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Samp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Samp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.SmallTypeImpl <em>Small Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.SmallTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSmallType()
	 * @generated
	 */
	int SMALL_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Small Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Small Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.SpanTypeImpl <em>Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.SpanTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSpanType()
	 * @generated
	 */
	int SPAN_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.StrongTypeImpl <em>Strong Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.StrongTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getStrongType()
	 * @generated
	 */
	int STRONG_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Strong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Strong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.SubTypeImpl <em>Sub Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.SubTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSubType()
	 * @generated
	 */
	int SUB_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.SupTypeImpl <em>Sup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.SupTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSupType()
	 * @generated
	 */
	int SUP_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TableTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COL = 1;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COLGROUP = 2;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__THEAD = 3;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TFOOT = 4;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TBODY = 5;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TR = 6;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__BORDER = 7;

	/**
	 * The feature id for the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CELLPADDING = 8;

	/**
	 * The feature id for the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CELLSPACING = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CLASS = 10;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__DIR = 11;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__FRAME = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__LANG = 14;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__LANG1 = 15;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__RULES = 16;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__STYLE = 17;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SUMMARY = 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TITLE = 19;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__WIDTH = 20;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TbodyTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTbodyType()
	 * @generated
	 */
	int TBODY_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__DIR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__VALIGN = 11;

	/**
	 * The number of structural features of the '<em>Tbody Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Tbody Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TdTypeImpl <em>Td Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TdTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTdType()
	 * @generated
	 */
	int TD_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BDO = FLOW__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__MAP = FLOW__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ABBR1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ALIGN = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__AXIS = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CHAR = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CHAROFF = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CLASS = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__COLSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DIR = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__HEADERS = FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ID = FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__LANG = FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__LANG1 = FLOW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ROWSPAN = FLOW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SCOPE = FLOW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__STYLE = FLOW_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TITLE = FLOW_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__VALIGN = FLOW_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Td Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Td Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TfootTypeImpl <em>Tfoot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TfootTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTfootType()
	 * @generated
	 */
	int TFOOT_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__DIR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__VALIGN = 11;

	/**
	 * The number of structural features of the '<em>Tfoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Tfoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TheadTypeImpl <em>Thead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TheadTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTheadType()
	 * @generated
	 */
	int THEAD_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__DIR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__VALIGN = 11;

	/**
	 * The number of structural features of the '<em>Thead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Thead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.ThTypeImpl <em>Th Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.ThTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getThType()
	 * @generated
	 */
	int TH_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BDO = FLOW__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__MAP = FLOW__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ABBR1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ALIGN = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__AXIS = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CHAR = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CHAROFF = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CLASS = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__COLSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DIR = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__HEADERS = FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ID = FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__LANG = FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__LANG1 = FLOW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ROWSPAN = FLOW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SCOPE = FLOW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__STYLE = FLOW_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TITLE = FLOW_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__VALIGN = FLOW_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Th Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Th Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TrTypeImpl <em>Tr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TrTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTrType()
	 * @generated
	 */
	int TR_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TH = 1;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TD = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CHAR = 4;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CHAROFF = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__DIR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__ID = 8;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__LANG = 9;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__LANG1 = 10;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__STYLE = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TITLE = 12;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__VALIGN = 13;

	/**
	 * The number of structural features of the '<em>Tr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Tr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.TtTypeImpl <em>Tt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.TtTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTtType()
	 * @generated
	 */
	int TT_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.UlTypeImpl <em>Ul Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.UlTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getUlType()
	 * @generated
	 */
	int UL_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__DIR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__LANG = 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__LANG1 = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__TITLE = 7;

	/**
	 * The number of structural features of the '<em>Ul Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ul Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.impl.VarTypeImpl
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Bdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__BDO = INLINE__BDO;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__MAP = INLINE__MAP;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__DIR = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__LANG = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__LANG1 = INLINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__STYLE = INLINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__TITLE = INLINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_OPERATION_COUNT = INLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.AlignType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.DirType <em>Dir Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.DirType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirType()
	 * @generated
	 */
	int DIR_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.DirType1 <em>Dir Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.DirType1
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirType1()
	 * @generated
	 */
	int DIR_TYPE1 = 61;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.IsmapType <em>Ismap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.IsmapType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIsmapType()
	 * @generated
	 */
	int ISMAP_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.NohrefType <em>Nohref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.NohrefType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNohrefType()
	 * @generated
	 */
	int NOHREF_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.Scope
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 64;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.Shape
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 65;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.TFrame <em>TFrame</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.TFrame
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTFrame()
	 * @generated
	 */
	int TFRAME = 66;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.TRules <em>TRules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.TRules
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTRules()
	 * @generated
	 */
	int TRULES = 67;

	/**
	 * The meta object id for the '{@link org.w3c.xhtml.ValignType <em>Valign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.ValignType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getValignType()
	 * @generated
	 */
	int VALIGN_TYPE = 68;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.AlignType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 70;

	/**
	 * The meta object id for the '<em>Charset</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharset()
	 * @generated
	 */
	int CHARSET = 71;

	/**
	 * The meta object id for the '<em>Charsets</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharsets()
	 * @generated
	 */
	int CHARSETS = 72;

	/**
	 * The meta object id for the '<em>Content Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 73;

	/**
	 * The meta object id for the '<em>Content Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getContentTypes()
	 * @generated
	 */
	int CONTENT_TYPES = 74;

	/**
	 * The meta object id for the '<em>Coords</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCoords()
	 * @generated
	 */
	int COORDS = 75;

	/**
	 * The meta object id for the '<em>Datetime</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 76;

	/**
	 * The meta object id for the '<em>Dir Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.DirType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirTypeObject()
	 * @generated
	 */
	int DIR_TYPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Dir Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.DirType1
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirTypeObject1()
	 * @generated
	 */
	int DIR_TYPE_OBJECT1 = 78;

	/**
	 * The meta object id for the '<em>Ismap Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.IsmapType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIsmapTypeObject()
	 * @generated
	 */
	int ISMAP_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Language Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLanguageCode()
	 * @generated
	 */
	int LANGUAGE_CODE = 80;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 81;

	/**
	 * The meta object id for the '<em>Link Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLinkTypes()
	 * @generated
	 */
	int LINK_TYPES = 82;

	/**
	 * The meta object id for the '<em>Media Desc</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMediaDesc()
	 * @generated
	 */
	int MEDIA_DESC = 83;

	/**
	 * The meta object id for the '<em>Multi Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMultiLength()
	 * @generated
	 */
	int MULTI_LENGTH = 84;

	/**
	 * The meta object id for the '<em>Nohref Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.NohrefType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNohrefTypeObject()
	 * @generated
	 */
	int NOHREF_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 86;

	/**
	 * The meta object id for the '<em>Pixels</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPixels()
	 * @generated
	 */
	int PIXELS = 87;

	/**
	 * The meta object id for the '<em>Scope Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.Scope
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScopeObject()
	 * @generated
	 */
	int SCOPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Script</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 89;

	/**
	 * The meta object id for the '<em>Shape Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.Shape
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getShapeObject()
	 * @generated
	 */
	int SHAPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Style Sheet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 91;

	/**
	 * The meta object id for the '<em>Tabindex Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTabindexNumber()
	 * @generated
	 */
	int TABINDEX_NUMBER = 92;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 93;

	/**
	 * The meta object id for the '<em>TFrame Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.TFrame
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTFrameObject()
	 * @generated
	 */
	int TFRAME_OBJECT = 94;

	/**
	 * The meta object id for the '<em>TRules Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.TRules
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTRulesObject()
	 * @generated
	 */
	int TRULES_OBJECT = 95;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getURI()
	 * @generated
	 */
	int URI = 96;

	/**
	 * The meta object id for the '<em>Uri List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getUriList()
	 * @generated
	 */
	int URI_LIST = 97;

	/**
	 * The meta object id for the '<em>Valign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.xhtml.ValignType
	 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getValignTypeObject()
	 * @generated
	 */
	int VALIGN_TYPE_OBJECT = 98;


	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbr Type</em>'.
	 * @see org.w3c.xhtml.AbbrType
	 * @generated
	 */
	EClass getAbbrType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.AbbrType#getClass_()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.AbbrType#getDir()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.AbbrType#getId()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.AbbrType#getLang()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.AbbrType#getLang1()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.AbbrType#getStyle()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AbbrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.AbbrType#getTitle()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AContent</em>'.
	 * @see org.w3c.xhtml.AContent
	 * @generated
	 */
	EClass getAContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.AContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3c.xhtml.AContent#getMixed()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.AContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3c.xhtml.AContent#getGroup()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.w3c.xhtml.AContent#getBr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.w3c.xhtml.AContent#getSpan()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getBdo <em>Bdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bdo</em>'.
	 * @see org.w3c.xhtml.AContent#getBdo()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Bdo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.w3c.xhtml.AContent#getMap()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.w3c.xhtml.AContent#getImg()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.w3c.xhtml.AContent#getTt()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.w3c.xhtml.AContent#getI()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.w3c.xhtml.AContent#getB()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.w3c.xhtml.AContent#getBig()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.w3c.xhtml.AContent#getSmall()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.w3c.xhtml.AContent#getEm()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.w3c.xhtml.AContent#getStrong()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.w3c.xhtml.AContent#getDfn()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.w3c.xhtml.AContent#getCode()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.w3c.xhtml.AContent#getQ()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.w3c.xhtml.AContent#getSamp()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.w3c.xhtml.AContent#getKbd()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.w3c.xhtml.AContent#getVar()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.w3c.xhtml.AContent#getCite()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.w3c.xhtml.AContent#getAbbr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.w3c.xhtml.AContent#getAcronym()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.w3c.xhtml.AContent#getSub()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.AContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.w3c.xhtml.AContent#getSup()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sup();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acronym Type</em>'.
	 * @see org.w3c.xhtml.AcronymType
	 * @generated
	 */
	EClass getAcronymType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.AcronymType#getClass_()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.AcronymType#getDir()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.AcronymType#getId()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.AcronymType#getLang()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.AcronymType#getLang1()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.AcronymType#getStyle()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AcronymType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.AcronymType#getTitle()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.w3c.xhtml.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.AddressType#getClass_()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.AddressType#getDir()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.AddressType#getId()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.AddressType#getLang()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.AddressType#getLang1()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.AddressType#getStyle()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AddressType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.AddressType#getTitle()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Type</em>'.
	 * @see org.w3c.xhtml.AreaType
	 * @generated
	 */
	EClass getAreaType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getAccesskey <em>Accesskey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accesskey</em>'.
	 * @see org.w3c.xhtml.AreaType#getAccesskey()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Accesskey();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.w3c.xhtml.AreaType#getAlt()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.AreaType#getClass_()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coords</em>'.
	 * @see org.w3c.xhtml.AreaType#getCoords()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Coords();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.AreaType#getDir()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3c.xhtml.AreaType#getHref()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.AreaType#getId()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.AreaType#getLang()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.AreaType#getLang1()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getNohref <em>Nohref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nohref</em>'.
	 * @see org.w3c.xhtml.AreaType#getNohref()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Nohref();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.w3c.xhtml.AreaType#getShape()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Shape();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.AreaType#getStyle()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getTabindex <em>Tabindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabindex</em>'.
	 * @see org.w3c.xhtml.AreaType#getTabindex()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Tabindex();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AreaType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.AreaType#getTitle()
	 * @see #getAreaType()
	 * @generated
	 */
	EAttribute getAreaType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AType</em>'.
	 * @see org.w3c.xhtml.AType
	 * @generated
	 */
	EClass getAType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getAccesskey <em>Accesskey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accesskey</em>'.
	 * @see org.w3c.xhtml.AType#getAccesskey()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Accesskey();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.w3c.xhtml.AType#getCharset()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.AType#getClass_()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coords</em>'.
	 * @see org.w3c.xhtml.AType#getCoords()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Coords();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.AType#getDir()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3c.xhtml.AType#getHref()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getHreflang <em>Hreflang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hreflang</em>'.
	 * @see org.w3c.xhtml.AType#getHreflang()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Hreflang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.AType#getId()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.AType#getLang()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.AType#getLang1()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3c.xhtml.AType#getName()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.w3c.xhtml.AType#getRel()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getRev <em>Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev</em>'.
	 * @see org.w3c.xhtml.AType#getRev()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Rev();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.w3c.xhtml.AType#getShape()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Shape();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.AType#getStyle()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getTabindex <em>Tabindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabindex</em>'.
	 * @see org.w3c.xhtml.AType#getTabindex()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Tabindex();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.AType#getTitle()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.AType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3c.xhtml.AType#getType()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.BdoType <em>Bdo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bdo Type</em>'.
	 * @see org.w3c.xhtml.BdoType
	 * @generated
	 */
	EClass getBdoType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.BdoType#getClass_()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.BdoType#getDir()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.BdoType#getId()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.BdoType#getLang()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.BdoType#getLang1()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.BdoType#getStyle()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BdoType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.BdoType#getTitle()
	 * @see #getBdoType()
	 * @generated
	 */
	EAttribute getBdoType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.BigType <em>Big Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Type</em>'.
	 * @see org.w3c.xhtml.BigType
	 * @generated
	 */
	EClass getBigType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.BigType#getClass_()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.BigType#getDir()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.BigType#getId()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.BigType#getLang()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.BigType#getLang1()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.BigType#getStyle()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BigType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.BigType#getTitle()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.w3c.xhtml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block</em>'.
	 * @see org.w3c.xhtml.Block#getBlock()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.w3c.xhtml.Block#getP()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.w3c.xhtml.Block#getH1()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.w3c.xhtml.Block#getH2()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.w3c.xhtml.Block#getH3()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.w3c.xhtml.Block#getH4()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.w3c.xhtml.Block#getH5()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.w3c.xhtml.Block#getH6()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.w3c.xhtml.Block#getDiv()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.w3c.xhtml.Block#getUl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.w3c.xhtml.Block#getOl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.w3c.xhtml.Block#getDl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.w3c.xhtml.Block#getPre()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.w3c.xhtml.Block#getHr()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.w3c.xhtml.Block#getBlockquote()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.w3c.xhtml.Block#getAddress()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Block#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.w3c.xhtml.Block#getTable()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Table();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.BlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote Type</em>'.
	 * @see org.w3c.xhtml.BlockquoteType
	 * @generated
	 */
	EClass getBlockquoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getCite()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Cite();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getClass_()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getDir()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getId()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getLang()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getLang1()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getStyle()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BlockquoteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.BlockquoteType#getTitle()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.BrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Br Type</em>'.
	 * @see org.w3c.xhtml.BrType
	 * @generated
	 */
	EClass getBrType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.BrType#getClass_()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.BrType#getId()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.BrType#getStyle()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.BrType#getTitle()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType</em>'.
	 * @see org.w3c.xhtml.BType
	 * @generated
	 */
	EClass getBType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.BType#getClass_()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.BType#getDir()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.BType#getId()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.BType#getLang()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.BType#getLang1()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.BType#getStyle()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.BType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.BType#getTitle()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption Type</em>'.
	 * @see org.w3c.xhtml.CaptionType
	 * @generated
	 */
	EClass getCaptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.CaptionType#getClass_()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.CaptionType#getDir()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.CaptionType#getId()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.CaptionType#getLang()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.CaptionType#getLang1()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.CaptionType#getStyle()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CaptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.CaptionType#getTitle()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.CiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cite Type</em>'.
	 * @see org.w3c.xhtml.CiteType
	 * @generated
	 */
	EClass getCiteType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.CiteType#getClass_()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.CiteType#getDir()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.CiteType#getId()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.CiteType#getLang()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.CiteType#getLang1()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.CiteType#getStyle()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CiteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.CiteType#getTitle()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Type</em>'.
	 * @see org.w3c.xhtml.CodeType
	 * @generated
	 */
	EClass getCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.CodeType#getClass_()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.CodeType#getDir()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.CodeType#getId()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.CodeType#getLang()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.CodeType#getLang1()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.CodeType#getStyle()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.CodeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.CodeType#getTitle()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colgroup Type</em>'.
	 * @see org.w3c.xhtml.ColgroupType
	 * @generated
	 */
	EClass getColgroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.ColgroupType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getCol()
	 * @see #getColgroupType()
	 * @generated
	 */
	EReference getColgroupType_Col();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getAlign()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getChar()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getCharoff()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getClass_()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getDir()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getId()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getLang()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getLang1()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getSpan()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getStyle()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getTitle()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getValign()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColgroupType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.w3c.xhtml.ColgroupType#getWidth()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Width();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Type</em>'.
	 * @see org.w3c.xhtml.ColType
	 * @generated
	 */
	EClass getColType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.ColType#getAlign()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.ColType#getChar()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.ColType#getCharoff()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.ColType#getClass_()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.ColType#getDir()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.ColType#getId()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.ColType#getLang()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.ColType#getLang1()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.w3c.xhtml.ColType#getSpan()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.ColType#getStyle()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.ColType#getTitle()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.ColType#getValign()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ColType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.w3c.xhtml.ColType#getWidth()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Width();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dd Type</em>'.
	 * @see org.w3c.xhtml.DdType
	 * @generated
	 */
	EClass getDdType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.DdType#getClass_()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.DdType#getDir()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.DdType#getId()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.DdType#getLang()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.DdType#getLang1()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.DdType#getStyle()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.DdType#getTitle()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dfn Type</em>'.
	 * @see org.w3c.xhtml.DfnType
	 * @generated
	 */
	EClass getDfnType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.DfnType#getClass_()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.DfnType#getDir()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.DfnType#getId()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.DfnType#getLang()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.DfnType#getLang1()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.DfnType#getStyle()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DfnType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.DfnType#getTitle()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div Type</em>'.
	 * @see org.w3c.xhtml.DivType
	 * @generated
	 */
	EClass getDivType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.DivType#getClass_()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.DivType#getDir()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.DivType#getId()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.DivType#getLang()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.DivType#getLang1()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.DivType#getStyle()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DivType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.DivType#getTitle()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dl Type</em>'.
	 * @see org.w3c.xhtml.DlType
	 * @generated
	 */
	EClass getDlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.DlType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3c.xhtml.DlType#getGroup()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.DlType#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dt</em>'.
	 * @see org.w3c.xhtml.DlType#getDt()
	 * @see #getDlType()
	 * @generated
	 */
	EReference getDlType_Dt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.DlType#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dd</em>'.
	 * @see org.w3c.xhtml.DlType#getDd()
	 * @see #getDlType()
	 * @generated
	 */
	EReference getDlType_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.DlType#getClass_()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.DlType#getDir()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.DlType#getId()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.DlType#getLang()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.DlType#getLang1()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.DlType#getStyle()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.DlType#getTitle()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3c.xhtml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3c.xhtml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3c.xhtml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_A();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abbr</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getAbbr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abbr();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acronym</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Acronym();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Area();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_B();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getBdo <em>Bdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bdo</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getBdo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bdo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Big</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getBig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Big();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blockquote</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getBlockquote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Blockquote();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Br</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getBr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Br();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getCaption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cite</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getCite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cite();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Col</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getCol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Col();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colgroup</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getColgroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dd</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getDd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dd();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dfn</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getDfn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dfn();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getDiv()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Div();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dl</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getDl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dl();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dt</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getDt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dt();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Em</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getEm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Em();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H1</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H1();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H2</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H2();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H3</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH3()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H3();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H4</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H4();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H5</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH5()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H5();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H6</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getH6()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H6();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hr</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getHr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hr();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_I();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Img</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getImg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Img();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kbd</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getKbd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Kbd();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Li</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getLi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Li();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Map();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ol</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getOl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ol();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_P();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getPre()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getQ()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Q();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Samp</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getSamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Samp();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getSmall()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Small();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Span();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strong</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getStrong()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strong();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getSub()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sup</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getSup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbody</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTbody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tbody();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Td</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Td();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTfoot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tfoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Th</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Th();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getThead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tr</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tr();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tt</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getTt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tt();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ul</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getUl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ul();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.DocumentRoot#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see org.w3c.xhtml.DocumentRoot#getVar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Var();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.DtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dt Type</em>'.
	 * @see org.w3c.xhtml.DtType
	 * @generated
	 */
	EClass getDtType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.DtType#getClass_()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.DtType#getDir()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.DtType#getId()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.DtType#getLang()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.DtType#getLang1()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.DtType#getStyle()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.DtType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.DtType#getTitle()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.EmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Em Type</em>'.
	 * @see org.w3c.xhtml.EmType
	 * @generated
	 */
	EClass getEmType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.EmType#getClass_()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.EmType#getDir()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.EmType#getId()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.EmType#getLang()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.EmType#getLang1()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.EmType#getStyle()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.EmType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.EmType#getTitle()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.w3c.xhtml.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.Flow#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3c.xhtml.Flow#getMixed()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.Flow#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3c.xhtml.Flow#getGroup()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.w3c.xhtml.Flow#getP()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.w3c.xhtml.Flow#getH1()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.w3c.xhtml.Flow#getH2()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.w3c.xhtml.Flow#getH3()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.w3c.xhtml.Flow#getH4()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.w3c.xhtml.Flow#getH5()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.w3c.xhtml.Flow#getH6()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.w3c.xhtml.Flow#getDiv()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.w3c.xhtml.Flow#getUl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.w3c.xhtml.Flow#getOl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.w3c.xhtml.Flow#getDl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.w3c.xhtml.Flow#getPre()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.w3c.xhtml.Flow#getHr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.w3c.xhtml.Flow#getBlockquote()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.w3c.xhtml.Flow#getAddress()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.w3c.xhtml.Flow#getTable()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.w3c.xhtml.Flow#getA()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.w3c.xhtml.Flow#getBr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.w3c.xhtml.Flow#getSpan()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getBdo <em>Bdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bdo</em>'.
	 * @see org.w3c.xhtml.Flow#getBdo()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Bdo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.w3c.xhtml.Flow#getMap()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.w3c.xhtml.Flow#getImg()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.w3c.xhtml.Flow#getTt()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.w3c.xhtml.Flow#getI()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.w3c.xhtml.Flow#getB()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.w3c.xhtml.Flow#getBig()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.w3c.xhtml.Flow#getSmall()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.w3c.xhtml.Flow#getEm()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.w3c.xhtml.Flow#getStrong()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.w3c.xhtml.Flow#getDfn()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.w3c.xhtml.Flow#getCode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.w3c.xhtml.Flow#getQ()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.w3c.xhtml.Flow#getSamp()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.w3c.xhtml.Flow#getKbd()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.w3c.xhtml.Flow#getVar()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.w3c.xhtml.Flow#getCite()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.w3c.xhtml.Flow#getAbbr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.w3c.xhtml.Flow#getAcronym()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.w3c.xhtml.Flow#getSub()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Flow#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.w3c.xhtml.Flow#getSup()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sup();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 Type</em>'.
	 * @see org.w3c.xhtml.H1Type
	 * @generated
	 */
	EClass getH1Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H1Type#getClass_()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H1Type#getDir()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H1Type#getId()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H1Type#getLang()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H1Type#getLang1()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H1Type#getStyle()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H1Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H1Type#getTitle()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 Type</em>'.
	 * @see org.w3c.xhtml.H2Type
	 * @generated
	 */
	EClass getH2Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H2Type#getClass_()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H2Type#getDir()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H2Type#getId()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H2Type#getLang()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H2Type#getLang1()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H2Type#getStyle()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H2Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H2Type#getTitle()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 Type</em>'.
	 * @see org.w3c.xhtml.H3Type
	 * @generated
	 */
	EClass getH3Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H3Type#getClass_()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H3Type#getDir()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H3Type#getId()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H3Type#getLang()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H3Type#getLang1()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H3Type#getStyle()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H3Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H3Type#getTitle()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 Type</em>'.
	 * @see org.w3c.xhtml.H4Type
	 * @generated
	 */
	EClass getH4Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H4Type#getClass_()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H4Type#getDir()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H4Type#getId()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H4Type#getLang()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H4Type#getLang1()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H4Type#getStyle()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H4Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H4Type#getTitle()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 Type</em>'.
	 * @see org.w3c.xhtml.H5Type
	 * @generated
	 */
	EClass getH5Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H5Type#getClass_()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H5Type#getDir()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H5Type#getId()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H5Type#getLang()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H5Type#getLang1()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H5Type#getStyle()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H5Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H5Type#getTitle()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.H6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 Type</em>'.
	 * @see org.w3c.xhtml.H6Type
	 * @generated
	 */
	EClass getH6Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.H6Type#getClass_()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.H6Type#getDir()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.H6Type#getId()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.H6Type#getLang()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.H6Type#getLang1()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.H6Type#getStyle()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.H6Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.H6Type#getTitle()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.HrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hr Type</em>'.
	 * @see org.w3c.xhtml.HrType
	 * @generated
	 */
	EClass getHrType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.HrType#getClass_()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.HrType#getDir()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.HrType#getId()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.HrType#getLang()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.HrType#getLang1()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.HrType#getStyle()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.HrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.HrType#getTitle()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img Type</em>'.
	 * @see org.w3c.xhtml.ImgType
	 * @generated
	 */
	EClass getImgType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.w3c.xhtml.ImgType#getAlt()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.ImgType#getClass_()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.ImgType#getDir()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.w3c.xhtml.ImgType#getHeight()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.ImgType#getId()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getIsmap <em>Ismap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismap</em>'.
	 * @see org.w3c.xhtml.ImgType#getIsmap()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Ismap();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.ImgType#getLang()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.ImgType#getLang1()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getLongdesc <em>Longdesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longdesc</em>'.
	 * @see org.w3c.xhtml.ImgType#getLongdesc()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Longdesc();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.w3c.xhtml.ImgType#getSrc()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.ImgType#getStyle()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.ImgType#getTitle()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getUsemap <em>Usemap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usemap</em>'.
	 * @see org.w3c.xhtml.ImgType#getUsemap()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Usemap();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ImgType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.w3c.xhtml.ImgType#getWidth()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Width();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline</em>'.
	 * @see org.w3c.xhtml.Inline
	 * @generated
	 */
	EClass getInline();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.Inline#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3c.xhtml.Inline#getMixed()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.Inline#getInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inline</em>'.
	 * @see org.w3c.xhtml.Inline#getInline()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Inline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.w3c.xhtml.Inline#getA()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.w3c.xhtml.Inline#getBr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.w3c.xhtml.Inline#getSpan()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getBdo <em>Bdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bdo</em>'.
	 * @see org.w3c.xhtml.Inline#getBdo()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Bdo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.w3c.xhtml.Inline#getMap()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.w3c.xhtml.Inline#getImg()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.w3c.xhtml.Inline#getTt()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.w3c.xhtml.Inline#getI()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.w3c.xhtml.Inline#getB()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.w3c.xhtml.Inline#getBig()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.w3c.xhtml.Inline#getSmall()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.w3c.xhtml.Inline#getEm()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.w3c.xhtml.Inline#getStrong()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.w3c.xhtml.Inline#getDfn()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.w3c.xhtml.Inline#getCode()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.w3c.xhtml.Inline#getQ()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.w3c.xhtml.Inline#getSamp()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.w3c.xhtml.Inline#getKbd()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.w3c.xhtml.Inline#getVar()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.w3c.xhtml.Inline#getCite()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.w3c.xhtml.Inline#getAbbr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.w3c.xhtml.Inline#getAcronym()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.w3c.xhtml.Inline#getSub()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.Inline#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.w3c.xhtml.Inline#getSup()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sup();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType</em>'.
	 * @see org.w3c.xhtml.IType
	 * @generated
	 */
	EClass getIType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.IType#getClass_()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.IType#getDir()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.IType#getId()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.IType#getLang()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.IType#getLang1()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.IType#getStyle()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.IType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.IType#getTitle()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.KbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kbd Type</em>'.
	 * @see org.w3c.xhtml.KbdType
	 * @generated
	 */
	EClass getKbdType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.KbdType#getClass_()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.KbdType#getDir()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.KbdType#getId()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.KbdType#getLang()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.KbdType#getLang1()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.KbdType#getStyle()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.KbdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.KbdType#getTitle()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.LiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Li Type</em>'.
	 * @see org.w3c.xhtml.LiType
	 * @generated
	 */
	EClass getLiType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.LiType#getClass_()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.LiType#getDir()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.LiType#getId()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.LiType#getLang()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.LiType#getLang1()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.LiType#getStyle()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.LiType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.LiType#getTitle()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.w3c.xhtml.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.MapType#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block</em>'.
	 * @see org.w3c.xhtml.MapType#getBlock()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.w3c.xhtml.MapType#getP()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.w3c.xhtml.MapType#getH1()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.w3c.xhtml.MapType#getH2()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.w3c.xhtml.MapType#getH3()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.w3c.xhtml.MapType#getH4()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.w3c.xhtml.MapType#getH5()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.w3c.xhtml.MapType#getH6()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.w3c.xhtml.MapType#getDiv()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.w3c.xhtml.MapType#getUl()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.w3c.xhtml.MapType#getOl()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.w3c.xhtml.MapType#getDl()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.w3c.xhtml.MapType#getPre()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.w3c.xhtml.MapType#getHr()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.w3c.xhtml.MapType#getBlockquote()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.w3c.xhtml.MapType#getAddress()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.w3c.xhtml.MapType#getTable()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.MapType#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see org.w3c.xhtml.MapType#getArea()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.MapType#getClass_()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.MapType#getDir()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.MapType#getId()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.MapType#getLang()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.MapType#getLang1()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3c.xhtml.MapType#getName()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.MapType#getStyle()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.MapType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.MapType#getTitle()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.OlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ol Type</em>'.
	 * @see org.w3c.xhtml.OlType
	 * @generated
	 */
	EClass getOlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.OlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.w3c.xhtml.OlType#getLi()
	 * @see #getOlType()
	 * @generated
	 */
	EReference getOlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.OlType#getClass_()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.OlType#getDir()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.OlType#getId()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.OlType#getLang()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.OlType#getLang1()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.OlType#getStyle()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.OlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.OlType#getTitle()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Content</em>'.
	 * @see org.w3c.xhtml.PreContent
	 * @generated
	 */
	EClass getPreContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.PreContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3c.xhtml.PreContent#getMixed()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.PreContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3c.xhtml.PreContent#getGroup()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.w3c.xhtml.PreContent#getA()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.w3c.xhtml.PreContent#getTt()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.w3c.xhtml.PreContent#getI()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.w3c.xhtml.PreContent#getB()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.w3c.xhtml.PreContent#getBig()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.w3c.xhtml.PreContent#getSmall()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.w3c.xhtml.PreContent#getEm()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.w3c.xhtml.PreContent#getStrong()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.w3c.xhtml.PreContent#getDfn()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.w3c.xhtml.PreContent#getCode()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.w3c.xhtml.PreContent#getQ()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.w3c.xhtml.PreContent#getSamp()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.w3c.xhtml.PreContent#getKbd()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.w3c.xhtml.PreContent#getVar()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.w3c.xhtml.PreContent#getCite()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.w3c.xhtml.PreContent#getAbbr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.w3c.xhtml.PreContent#getAcronym()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.w3c.xhtml.PreContent#getSub()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.w3c.xhtml.PreContent#getSup()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.w3c.xhtml.PreContent#getBr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.w3c.xhtml.PreContent#getSpan()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getBdo <em>Bdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bdo</em>'.
	 * @see org.w3c.xhtml.PreContent#getBdo()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Bdo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.PreContent#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.w3c.xhtml.PreContent#getMap()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Map();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.PreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Type</em>'.
	 * @see org.w3c.xhtml.PreType
	 * @generated
	 */
	EClass getPreType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.PreType#getClass_()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.PreType#getDir()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.PreType#getId()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.PreType#getLang()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.PreType#getLang1()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.w3c.xhtml.PreType#getSpace()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.PreType#getStyle()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PreType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.PreType#getTitle()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PType</em>'.
	 * @see org.w3c.xhtml.PType
	 * @generated
	 */
	EClass getPType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.PType#getClass_()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.PType#getDir()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.PType#getId()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.PType#getLang()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.PType#getLang1()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.PType#getStyle()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.PType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.PType#getTitle()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QType</em>'.
	 * @see org.w3c.xhtml.QType
	 * @generated
	 */
	EClass getQType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.w3c.xhtml.QType#getCite1()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.QType#getClass_()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.QType#getDir()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.QType#getId()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.QType#getLang()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.QType#getLang1()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.QType#getStyle()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.QType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.QType#getTitle()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.SampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Samp Type</em>'.
	 * @see org.w3c.xhtml.SampType
	 * @generated
	 */
	EClass getSampType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.SampType#getClass_()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.SampType#getDir()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.SampType#getId()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.SampType#getLang()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.SampType#getLang1()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.SampType#getStyle()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SampType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.SampType#getTitle()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.SmallType <em>Small Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Type</em>'.
	 * @see org.w3c.xhtml.SmallType
	 * @generated
	 */
	EClass getSmallType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.SmallType#getClass_()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.SmallType#getDir()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.SmallType#getId()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.SmallType#getLang()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.SmallType#getLang1()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.SmallType#getStyle()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SmallType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.SmallType#getTitle()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Type</em>'.
	 * @see org.w3c.xhtml.SpanType
	 * @generated
	 */
	EClass getSpanType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.SpanType#getClass_()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.SpanType#getDir()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.SpanType#getId()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.SpanType#getLang()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.SpanType#getLang1()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.SpanType#getStyle()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SpanType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.SpanType#getTitle()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.StrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Type</em>'.
	 * @see org.w3c.xhtml.StrongType
	 * @generated
	 */
	EClass getStrongType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.StrongType#getClass_()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.StrongType#getDir()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.StrongType#getId()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.StrongType#getLang()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.StrongType#getLang1()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.StrongType#getStyle()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.StrongType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.StrongType#getTitle()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Type</em>'.
	 * @see org.w3c.xhtml.SubType
	 * @generated
	 */
	EClass getSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.SubType#getClass_()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.SubType#getDir()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.SubType#getId()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.SubType#getLang()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.SubType#getLang1()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.SubType#getStyle()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SubType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.SubType#getTitle()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.SupType <em>Sup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sup Type</em>'.
	 * @see org.w3c.xhtml.SupType
	 * @generated
	 */
	EClass getSupType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.SupType#getClass_()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.SupType#getDir()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.SupType#getId()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.SupType#getLang()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.SupType#getLang1()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.SupType#getStyle()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.SupType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.SupType#getTitle()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see org.w3c.xhtml.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.TableType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.w3c.xhtml.TableType#getCaption()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TableType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.w3c.xhtml.TableType#getCol()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Col();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TableType#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colgroup</em>'.
	 * @see org.w3c.xhtml.TableType#getColgroup()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.TableType#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.w3c.xhtml.TableType#getThead()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3c.xhtml.TableType#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.w3c.xhtml.TableType#getTfoot()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tfoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TableType#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbody</em>'.
	 * @see org.w3c.xhtml.TableType#getTbody()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tbody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TableType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.w3c.xhtml.TableType#getTr()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.w3c.xhtml.TableType#getBorder()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getCellpadding <em>Cellpadding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellpadding</em>'.
	 * @see org.w3c.xhtml.TableType#getCellpadding()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Cellpadding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getCellspacing <em>Cellspacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellspacing</em>'.
	 * @see org.w3c.xhtml.TableType#getCellspacing()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Cellspacing();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TableType#getClass_()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TableType#getDir()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.w3c.xhtml.TableType#getFrame()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TableType#getId()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TableType#getLang()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TableType#getLang1()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules</em>'.
	 * @see org.w3c.xhtml.TableType#getRules()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TableType#getStyle()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.w3c.xhtml.TableType#getSummary()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TableType#getTitle()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.w3c.xhtml.TableType#getWidth()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Width();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody Type</em>'.
	 * @see org.w3c.xhtml.TbodyType
	 * @generated
	 */
	EClass getTbodyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TbodyType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.w3c.xhtml.TbodyType#getTr()
	 * @see #getTbodyType()
	 * @generated
	 */
	EReference getTbodyType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.TbodyType#getAlign()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.TbodyType#getChar()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.TbodyType#getCharoff()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TbodyType#getClass_()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TbodyType#getDir()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TbodyType#getId()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TbodyType#getLang()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TbodyType#getLang1()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TbodyType#getStyle()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TbodyType#getTitle()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TbodyType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.TbodyType#getValign()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Td Type</em>'.
	 * @see org.w3c.xhtml.TdType
	 * @generated
	 */
	EClass getTdType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.w3c.xhtml.TdType#getAbbr1()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.TdType#getAlign()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.w3c.xhtml.TdType#getAxis()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.TdType#getChar()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.TdType#getCharoff()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TdType#getClass_()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.w3c.xhtml.TdType#getColspan()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TdType#getDir()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.w3c.xhtml.TdType#getHeaders()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TdType#getId()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TdType#getLang()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TdType#getLang1()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.w3c.xhtml.TdType#getRowspan()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.w3c.xhtml.TdType#getScope()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TdType#getStyle()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TdType#getTitle()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TdType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.TdType#getValign()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot Type</em>'.
	 * @see org.w3c.xhtml.TfootType
	 * @generated
	 */
	EClass getTfootType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TfootType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.w3c.xhtml.TfootType#getTr()
	 * @see #getTfootType()
	 * @generated
	 */
	EReference getTfootType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.TfootType#getAlign()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.TfootType#getChar()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.TfootType#getCharoff()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TfootType#getClass_()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TfootType#getDir()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TfootType#getId()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TfootType#getLang()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TfootType#getLang1()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TfootType#getStyle()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TfootType#getTitle()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TfootType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.TfootType#getValign()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead Type</em>'.
	 * @see org.w3c.xhtml.TheadType
	 * @generated
	 */
	EClass getTheadType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TheadType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.w3c.xhtml.TheadType#getTr()
	 * @see #getTheadType()
	 * @generated
	 */
	EReference getTheadType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.TheadType#getAlign()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.TheadType#getChar()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.TheadType#getCharoff()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TheadType#getClass_()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TheadType#getDir()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TheadType#getId()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TheadType#getLang()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TheadType#getLang1()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TheadType#getStyle()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TheadType#getTitle()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TheadType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.TheadType#getValign()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Th Type</em>'.
	 * @see org.w3c.xhtml.ThType
	 * @generated
	 */
	EClass getThType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.w3c.xhtml.ThType#getAbbr1()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.ThType#getAlign()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.w3c.xhtml.ThType#getAxis()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.ThType#getChar()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.ThType#getCharoff()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.ThType#getClass_()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.w3c.xhtml.ThType#getColspan()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.ThType#getDir()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.w3c.xhtml.ThType#getHeaders()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.ThType#getId()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.ThType#getLang()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.ThType#getLang1()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.w3c.xhtml.ThType#getRowspan()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.w3c.xhtml.ThType#getScope()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.ThType#getStyle()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.ThType#getTitle()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.ThType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.ThType#getValign()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tr Type</em>'.
	 * @see org.w3c.xhtml.TrType
	 * @generated
	 */
	EClass getTrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3c.xhtml.TrType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3c.xhtml.TrType#getGroup()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TrType#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Th</em>'.
	 * @see org.w3c.xhtml.TrType#getTh()
	 * @see #getTrType()
	 * @generated
	 */
	EReference getTrType_Th();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.TrType#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Td</em>'.
	 * @see org.w3c.xhtml.TrType#getTd()
	 * @see #getTrType()
	 * @generated
	 */
	EReference getTrType_Td();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.w3c.xhtml.TrType#getAlign()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.w3c.xhtml.TrType#getChar()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.w3c.xhtml.TrType#getCharoff()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TrType#getClass_()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TrType#getDir()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TrType#getId()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TrType#getLang()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TrType#getLang1()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TrType#getStyle()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TrType#getTitle()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TrType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.w3c.xhtml.TrType#getValign()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Valign();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.TtType <em>Tt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tt Type</em>'.
	 * @see org.w3c.xhtml.TtType
	 * @generated
	 */
	EClass getTtType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.TtType#getClass_()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.TtType#getDir()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.TtType#getId()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.TtType#getLang()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.TtType#getLang1()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.TtType#getStyle()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.TtType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.TtType#getTitle()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.UlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ul Type</em>'.
	 * @see org.w3c.xhtml.UlType
	 * @generated
	 */
	EClass getUlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3c.xhtml.UlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.w3c.xhtml.UlType#getLi()
	 * @see #getUlType()
	 * @generated
	 */
	EReference getUlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.UlType#getClass_()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.UlType#getDir()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.UlType#getId()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.UlType#getLang()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.UlType#getLang1()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.UlType#getStyle()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.UlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.UlType#getTitle()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Title();

	/**
	 * Returns the meta object for class '{@link org.w3c.xhtml.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see org.w3c.xhtml.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.w3c.xhtml.VarType#getClass_()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.w3c.xhtml.VarType#getDir()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3c.xhtml.VarType#getId()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3c.xhtml.VarType#getLang()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see org.w3c.xhtml.VarType#getLang1()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.w3c.xhtml.VarType#getStyle()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.w3c.xhtml.VarType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3c.xhtml.VarType#getTitle()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Title();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.w3c.xhtml.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.DirType <em>Dir Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dir Type</em>'.
	 * @see org.w3c.xhtml.DirType
	 * @generated
	 */
	EEnum getDirType();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.DirType1 <em>Dir Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dir Type1</em>'.
	 * @see org.w3c.xhtml.DirType1
	 * @generated
	 */
	EEnum getDirType1();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.IsmapType <em>Ismap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ismap Type</em>'.
	 * @see org.w3c.xhtml.IsmapType
	 * @generated
	 */
	EEnum getIsmapType();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.NohrefType <em>Nohref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nohref Type</em>'.
	 * @see org.w3c.xhtml.NohrefType
	 * @generated
	 */
	EEnum getNohrefType();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.w3c.xhtml.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see org.w3c.xhtml.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.TFrame <em>TFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFrame</em>'.
	 * @see org.w3c.xhtml.TFrame
	 * @generated
	 */
	EEnum getTFrame();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.TRules <em>TRules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRules</em>'.
	 * @see org.w3c.xhtml.TRules
	 * @generated
	 */
	EEnum getTRules();

	/**
	 * Returns the meta object for enum '{@link org.w3c.xhtml.ValignType <em>Valign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valign Type</em>'.
	 * @see org.w3c.xhtml.ValignType
	 * @generated
	 */
	EEnum getValignType();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.w3c.xhtml.AlignType
	 * @model instanceClass="org.w3c.xhtml.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a single character, as per section 2.2 of [XML]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Character' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1'"
	 * @generated
	 */
	EDataType getCharacter();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a character encoding, as per [RFC2045]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Charset</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Charset' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCharset();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Charsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a space separated list of character encodings, as per [RFC2045]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Charsets</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Charsets' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCharsets();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       media type, as per [RFC2045]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Content Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ContentType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Content Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       comma-separated list of media types, as per [RFC2045]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Content Types</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ContentTypes' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       comma-separated list of lengths
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Coords</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Coords' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[-+]?(\\d+|\\d+(\\.\\d+)?%25)(,\\s*[-+]?(\\d+|\\d+(\\.\\d+)?%25))*'"
	 * @generated
	 */
	EDataType getCoords();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       date and time information. ISO date format
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datetime</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='Datetime' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDatetime();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.DirType <em>Dir Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dir Type Object</em>'.
	 * @see org.w3c.xhtml.DirType
	 * @model instanceClass="org.w3c.xhtml.DirType"
	 *        extendedMetaData="name='dir_._type:Object' baseType='dir_._type'"
	 * @generated
	 */
	EDataType getDirTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.DirType1 <em>Dir Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dir Type Object1</em>'.
	 * @see org.w3c.xhtml.DirType1
	 * @model instanceClass="org.w3c.xhtml.DirType1"
	 *        extendedMetaData="name='dir_._1_._type:Object' baseType='dir_._1_._type'"
	 * @generated
	 */
	EDataType getDirTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.IsmapType <em>Ismap Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ismap Type Object</em>'.
	 * @see org.w3c.xhtml.IsmapType
	 * @model instanceClass="org.w3c.xhtml.IsmapType"
	 *        extendedMetaData="name='ismap_._type:Object' baseType='ismap_._type'"
	 * @generated
	 */
	EDataType getIsmapTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a language code, as per [RFC3066]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Language Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LanguageCode' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
	 * @generated
	 */
	EDataType getLanguageCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       nn for pixels or nn% for percentage length
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Length' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[-+]?(\\d+|\\d+(\\.\\d+)?%25)'"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Link Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       space-separated list of link types
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Link Types</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='LinkTypes' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKENS'"
	 * @generated
	 */
	EDataType getLinkTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Media Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       single or comma-separated list of media descriptors
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Media Desc</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MediaDesc' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^,]+(,\\s*[^,]+)*'"
	 * @generated
	 */
	EDataType getMediaDesc();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Multi Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       pixel, percentage, or relative
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Multi Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MultiLength' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[-+]?(\\d+|\\d+(\\.\\d+)?%25)|[1-9]?(\\d+)?\\*'"
	 * @generated
	 */
	EDataType getMultiLength();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.NohrefType <em>Nohref Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nohref Type Object</em>'.
	 * @see org.w3c.xhtml.NohrefType
	 * @model instanceClass="org.w3c.xhtml.NohrefType"
	 *        extendedMetaData="name='nohref_._type:Object' baseType='nohref_._type'"
	 * @generated
	 */
	EDataType getNohrefTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       one or more digits
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Number' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='[0-9]+'"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       integer representing length in pixels
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Pixels</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Pixels' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getPixels();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.Scope <em>Scope Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Object</em>'.
	 * @see org.w3c.xhtml.Scope
	 * @model instanceClass="org.w3c.xhtml.Scope"
	 *        extendedMetaData="name='Scope:Object' baseType='Scope'"
	 * @generated
	 */
	EDataType getScopeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       script expression
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Script</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Script' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getScript();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.Shape <em>Shape Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shape Object</em>'.
	 * @see org.w3c.xhtml.Shape
	 * @model instanceClass="org.w3c.xhtml.Shape"
	 *        extendedMetaData="name='Shape:Object' baseType='Shape'"
	 * @generated
	 */
	EDataType getShapeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       style sheet data
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Style Sheet</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StyleSheet' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStyleSheet();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Tabindex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       tabindex attribute specifies the position of the current element
     *       in the tabbing order for the current document. This value must be
     *       a number between 0 and 32767. User agents should ignore leading zeros. 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Tabindex Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='tabindexNumber' baseType='Number' minInclusive='0' maxInclusive='32767'"
	 * @generated
	 */
	EDataType getTabindexNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       used for titles etc.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Text' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getText();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.TFrame <em>TFrame Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFrame Object</em>'.
	 * @see org.w3c.xhtml.TFrame
	 * @model instanceClass="org.w3c.xhtml.TFrame"
	 *        extendedMetaData="name='TFrame:Object' baseType='TFrame'"
	 * @generated
	 */
	EDataType getTFrameObject();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.TRules <em>TRules Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRules Object</em>'.
	 * @see org.w3c.xhtml.TRules
	 * @model instanceClass="org.w3c.xhtml.TRules"
	 *        extendedMetaData="name='TRules:Object' baseType='TRules'"
	 * @generated
	 */
	EDataType getTRulesObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a Uniform Resource Identifier, see [RFC2396]
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       a space separated list of Uniform Resource Identifiers
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Uri List</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UriList' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUriList();

	/**
	 * Returns the meta object for data type '{@link org.w3c.xhtml.ValignType <em>Valign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valign Type Object</em>'.
	 * @see org.w3c.xhtml.ValignType
	 * @model instanceClass="org.w3c.xhtml.ValignType"
	 *        extendedMetaData="name='valign_._type:Object' baseType='valign_._type'"
	 * @generated
	 */
	EDataType getValignTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XHTMLFactory getXHTMLFactory();

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
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.AbbrTypeImpl <em>Abbr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.AbbrTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAbbrType()
		 * @generated
		 */
		EClass ABBR_TYPE = eINSTANCE.getAbbrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__CLASS = eINSTANCE.getAbbrType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__DIR = eINSTANCE.getAbbrType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__ID = eINSTANCE.getAbbrType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__LANG = eINSTANCE.getAbbrType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__LANG1 = eINSTANCE.getAbbrType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__STYLE = eINSTANCE.getAbbrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__TITLE = eINSTANCE.getAbbrType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.AContentImpl <em>AContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.AContentImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAContent()
		 * @generated
		 */
		EClass ACONTENT = eINSTANCE.getAContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__MIXED = eINSTANCE.getAContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__GROUP = eINSTANCE.getAContent_Group();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BR = eINSTANCE.getAContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SPAN = eINSTANCE.getAContent_Span();

		/**
		 * The meta object literal for the '<em><b>Bdo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BDO = eINSTANCE.getAContent_Bdo();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__MAP = eINSTANCE.getAContent_Map();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__IMG = eINSTANCE.getAContent_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__TT = eINSTANCE.getAContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__I = eINSTANCE.getAContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__B = eINSTANCE.getAContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BIG = eINSTANCE.getAContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SMALL = eINSTANCE.getAContent_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__EM = eINSTANCE.getAContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__STRONG = eINSTANCE.getAContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__DFN = eINSTANCE.getAContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CODE = eINSTANCE.getAContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__Q = eINSTANCE.getAContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SAMP = eINSTANCE.getAContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__KBD = eINSTANCE.getAContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__VAR = eINSTANCE.getAContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CITE = eINSTANCE.getAContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ABBR = eINSTANCE.getAContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ACRONYM = eINSTANCE.getAContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUB = eINSTANCE.getAContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUP = eINSTANCE.getAContent_Sup();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.AcronymTypeImpl <em>Acronym Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.AcronymTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAcronymType()
		 * @generated
		 */
		EClass ACRONYM_TYPE = eINSTANCE.getAcronymType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__CLASS = eINSTANCE.getAcronymType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__DIR = eINSTANCE.getAcronymType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__ID = eINSTANCE.getAcronymType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__LANG = eINSTANCE.getAcronymType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__LANG1 = eINSTANCE.getAcronymType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__STYLE = eINSTANCE.getAcronymType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__TITLE = eINSTANCE.getAcronymType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.AddressTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__CLASS = eINSTANCE.getAddressType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__DIR = eINSTANCE.getAddressType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ID = eINSTANCE.getAddressType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__LANG = eINSTANCE.getAddressType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__LANG1 = eINSTANCE.getAddressType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__STYLE = eINSTANCE.getAddressType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__TITLE = eINSTANCE.getAddressType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.AreaTypeImpl <em>Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.AreaTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAreaType()
		 * @generated
		 */
		EClass AREA_TYPE = eINSTANCE.getAreaType();

		/**
		 * The meta object literal for the '<em><b>Accesskey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__ACCESSKEY = eINSTANCE.getAreaType_Accesskey();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__ALT = eINSTANCE.getAreaType_Alt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__CLASS = eINSTANCE.getAreaType_Class();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__COORDS = eINSTANCE.getAreaType_Coords();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__DIR = eINSTANCE.getAreaType_Dir();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__HREF = eINSTANCE.getAreaType_Href();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__ID = eINSTANCE.getAreaType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__LANG = eINSTANCE.getAreaType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__LANG1 = eINSTANCE.getAreaType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Nohref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__NOHREF = eINSTANCE.getAreaType_Nohref();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__SHAPE = eINSTANCE.getAreaType_Shape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__STYLE = eINSTANCE.getAreaType_Style();

		/**
		 * The meta object literal for the '<em><b>Tabindex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__TABINDEX = eINSTANCE.getAreaType_Tabindex();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE__TITLE = eINSTANCE.getAreaType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ATypeImpl <em>AType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ATypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAType()
		 * @generated
		 */
		EClass ATYPE = eINSTANCE.getAType();

		/**
		 * The meta object literal for the '<em><b>Accesskey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__ACCESSKEY = eINSTANCE.getAType_Accesskey();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__CHARSET = eINSTANCE.getAType_Charset();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__CLASS = eINSTANCE.getAType_Class();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__COORDS = eINSTANCE.getAType_Coords();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__DIR = eINSTANCE.getAType_Dir();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__HREF = eINSTANCE.getAType_Href();

		/**
		 * The meta object literal for the '<em><b>Hreflang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__HREFLANG = eINSTANCE.getAType_Hreflang();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__ID = eINSTANCE.getAType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__LANG = eINSTANCE.getAType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__LANG1 = eINSTANCE.getAType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__NAME = eINSTANCE.getAType_Name();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__REL = eINSTANCE.getAType_Rel();

		/**
		 * The meta object literal for the '<em><b>Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__REV = eINSTANCE.getAType_Rev();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__SHAPE = eINSTANCE.getAType_Shape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__STYLE = eINSTANCE.getAType_Style();

		/**
		 * The meta object literal for the '<em><b>Tabindex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__TABINDEX = eINSTANCE.getAType_Tabindex();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__TITLE = eINSTANCE.getAType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__TYPE = eINSTANCE.getAType_Type();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BdoTypeImpl <em>Bdo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BdoTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBdoType()
		 * @generated
		 */
		EClass BDO_TYPE = eINSTANCE.getBdoType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__CLASS = eINSTANCE.getBdoType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__DIR = eINSTANCE.getBdoType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__ID = eINSTANCE.getBdoType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__LANG = eINSTANCE.getBdoType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__LANG1 = eINSTANCE.getBdoType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__STYLE = eINSTANCE.getBdoType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDO_TYPE__TITLE = eINSTANCE.getBdoType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BigTypeImpl <em>Big Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BigTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBigType()
		 * @generated
		 */
		EClass BIG_TYPE = eINSTANCE.getBigType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__CLASS = eINSTANCE.getBigType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__DIR = eINSTANCE.getBigType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__ID = eINSTANCE.getBigType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__LANG = eINSTANCE.getBigType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__LANG1 = eINSTANCE.getBigType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__STYLE = eINSTANCE.getBigType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__TITLE = eINSTANCE.getBigType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BlockImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK = eINSTANCE.getBlock_Block();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__P = eINSTANCE.getBlock_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H1 = eINSTANCE.getBlock_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H2 = eINSTANCE.getBlock_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H3 = eINSTANCE.getBlock_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H4 = eINSTANCE.getBlock_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H5 = eINSTANCE.getBlock_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H6 = eINSTANCE.getBlock_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DIV = eINSTANCE.getBlock_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__UL = eINSTANCE.getBlock_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OL = eINSTANCE.getBlock_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DL = eINSTANCE.getBlock_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PRE = eINSTANCE.getBlock_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__HR = eINSTANCE.getBlock_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCKQUOTE = eINSTANCE.getBlock_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ADDRESS = eINSTANCE.getBlock_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TABLE = eINSTANCE.getBlock_Table();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BlockquoteTypeImpl <em>Blockquote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BlockquoteTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBlockquoteType()
		 * @generated
		 */
		EClass BLOCKQUOTE_TYPE = eINSTANCE.getBlockquoteType();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__CITE = eINSTANCE.getBlockquoteType_Cite();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__CLASS = eINSTANCE.getBlockquoteType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__DIR = eINSTANCE.getBlockquoteType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__ID = eINSTANCE.getBlockquoteType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__LANG = eINSTANCE.getBlockquoteType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__LANG1 = eINSTANCE.getBlockquoteType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__STYLE = eINSTANCE.getBlockquoteType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__TITLE = eINSTANCE.getBlockquoteType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BrTypeImpl <em>Br Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BrTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBrType()
		 * @generated
		 */
		EClass BR_TYPE = eINSTANCE.getBrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__CLASS = eINSTANCE.getBrType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__ID = eINSTANCE.getBrType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__STYLE = eINSTANCE.getBrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__TITLE = eINSTANCE.getBrType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.BTypeImpl <em>BType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.BTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getBType()
		 * @generated
		 */
		EClass BTYPE = eINSTANCE.getBType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__CLASS = eINSTANCE.getBType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__DIR = eINSTANCE.getBType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__ID = eINSTANCE.getBType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__LANG = eINSTANCE.getBType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__LANG1 = eINSTANCE.getBType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__STYLE = eINSTANCE.getBType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__TITLE = eINSTANCE.getBType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.CaptionTypeImpl <em>Caption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.CaptionTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCaptionType()
		 * @generated
		 */
		EClass CAPTION_TYPE = eINSTANCE.getCaptionType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__CLASS = eINSTANCE.getCaptionType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__DIR = eINSTANCE.getCaptionType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__ID = eINSTANCE.getCaptionType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__LANG = eINSTANCE.getCaptionType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__LANG1 = eINSTANCE.getCaptionType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__STYLE = eINSTANCE.getCaptionType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__TITLE = eINSTANCE.getCaptionType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.CiteTypeImpl <em>Cite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.CiteTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCiteType()
		 * @generated
		 */
		EClass CITE_TYPE = eINSTANCE.getCiteType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__CLASS = eINSTANCE.getCiteType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__DIR = eINSTANCE.getCiteType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__ID = eINSTANCE.getCiteType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__LANG = eINSTANCE.getCiteType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__LANG1 = eINSTANCE.getCiteType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__STYLE = eINSTANCE.getCiteType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__TITLE = eINSTANCE.getCiteType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.CodeTypeImpl <em>Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.CodeTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCodeType()
		 * @generated
		 */
		EClass CODE_TYPE = eINSTANCE.getCodeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__CLASS = eINSTANCE.getCodeType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__DIR = eINSTANCE.getCodeType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__ID = eINSTANCE.getCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__LANG = eINSTANCE.getCodeType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__LANG1 = eINSTANCE.getCodeType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__STYLE = eINSTANCE.getCodeType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__TITLE = eINSTANCE.getCodeType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ColgroupTypeImpl <em>Colgroup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ColgroupTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getColgroupType()
		 * @generated
		 */
		EClass COLGROUP_TYPE = eINSTANCE.getColgroupType();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLGROUP_TYPE__COL = eINSTANCE.getColgroupType_Col();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__ALIGN = eINSTANCE.getColgroupType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CHAR = eINSTANCE.getColgroupType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CHAROFF = eINSTANCE.getColgroupType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CLASS = eINSTANCE.getColgroupType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__DIR = eINSTANCE.getColgroupType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__ID = eINSTANCE.getColgroupType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__LANG = eINSTANCE.getColgroupType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__LANG1 = eINSTANCE.getColgroupType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__SPAN = eINSTANCE.getColgroupType_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__STYLE = eINSTANCE.getColgroupType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__TITLE = eINSTANCE.getColgroupType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__VALIGN = eINSTANCE.getColgroupType_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__WIDTH = eINSTANCE.getColgroupType_Width();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ColTypeImpl <em>Col Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ColTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getColType()
		 * @generated
		 */
		EClass COL_TYPE = eINSTANCE.getColType();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__ALIGN = eINSTANCE.getColType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CHAR = eINSTANCE.getColType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CHAROFF = eINSTANCE.getColType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CLASS = eINSTANCE.getColType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__DIR = eINSTANCE.getColType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__ID = eINSTANCE.getColType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__LANG = eINSTANCE.getColType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__LANG1 = eINSTANCE.getColType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__SPAN = eINSTANCE.getColType_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__STYLE = eINSTANCE.getColType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__TITLE = eINSTANCE.getColType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__VALIGN = eINSTANCE.getColType_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__WIDTH = eINSTANCE.getColType_Width();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DdTypeImpl <em>Dd Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DdTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDdType()
		 * @generated
		 */
		EClass DD_TYPE = eINSTANCE.getDdType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__CLASS = eINSTANCE.getDdType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__DIR = eINSTANCE.getDdType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__ID = eINSTANCE.getDdType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__LANG = eINSTANCE.getDdType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__LANG1 = eINSTANCE.getDdType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__STYLE = eINSTANCE.getDdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__TITLE = eINSTANCE.getDdType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DfnTypeImpl <em>Dfn Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DfnTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDfnType()
		 * @generated
		 */
		EClass DFN_TYPE = eINSTANCE.getDfnType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__CLASS = eINSTANCE.getDfnType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__DIR = eINSTANCE.getDfnType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__ID = eINSTANCE.getDfnType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__LANG = eINSTANCE.getDfnType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__LANG1 = eINSTANCE.getDfnType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__STYLE = eINSTANCE.getDfnType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__TITLE = eINSTANCE.getDfnType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DivTypeImpl <em>Div Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DivTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDivType()
		 * @generated
		 */
		EClass DIV_TYPE = eINSTANCE.getDivType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__CLASS = eINSTANCE.getDivType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__DIR = eINSTANCE.getDivType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__ID = eINSTANCE.getDivType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__LANG = eINSTANCE.getDivType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__LANG1 = eINSTANCE.getDivType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__STYLE = eINSTANCE.getDivType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__TITLE = eINSTANCE.getDivType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DlTypeImpl <em>Dl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DlTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDlType()
		 * @generated
		 */
		EClass DL_TYPE = eINSTANCE.getDlType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__GROUP = eINSTANCE.getDlType_Group();

		/**
		 * The meta object literal for the '<em><b>Dt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL_TYPE__DT = eINSTANCE.getDlType_Dt();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL_TYPE__DD = eINSTANCE.getDlType_Dd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__CLASS = eINSTANCE.getDlType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__DIR = eINSTANCE.getDlType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__ID = eINSTANCE.getDlType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__LANG = eINSTANCE.getDlType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__LANG1 = eINSTANCE.getDlType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__STYLE = eINSTANCE.getDlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__TITLE = eINSTANCE.getDlType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DocumentRootImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__A = eINSTANCE.getDocumentRoot_A();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABBR = eINSTANCE.getDocumentRoot_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACRONYM = eINSTANCE.getDocumentRoot_Acronym();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AREA = eINSTANCE.getDocumentRoot_Area();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__B = eINSTANCE.getDocumentRoot_B();

		/**
		 * The meta object literal for the '<em><b>Bdo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BDO = eINSTANCE.getDocumentRoot_Bdo();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BIG = eINSTANCE.getDocumentRoot_Big();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BLOCKQUOTE = eINSTANCE.getDocumentRoot_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BR = eINSTANCE.getDocumentRoot_Br();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAPTION = eINSTANCE.getDocumentRoot_Caption();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITE = eINSTANCE.getDocumentRoot_Cite();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE = eINSTANCE.getDocumentRoot_Code();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COL = eINSTANCE.getDocumentRoot_Col();

		/**
		 * The meta object literal for the '<em><b>Colgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLGROUP = eINSTANCE.getDocumentRoot_Colgroup();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DD = eINSTANCE.getDocumentRoot_Dd();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DFN = eINSTANCE.getDocumentRoot_Dfn();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIV = eINSTANCE.getDocumentRoot_Div();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DL = eINSTANCE.getDocumentRoot_Dl();

		/**
		 * The meta object literal for the '<em><b>Dt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DT = eINSTANCE.getDocumentRoot_Dt();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EM = eINSTANCE.getDocumentRoot_Em();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H1 = eINSTANCE.getDocumentRoot_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H2 = eINSTANCE.getDocumentRoot_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H3 = eINSTANCE.getDocumentRoot_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H4 = eINSTANCE.getDocumentRoot_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H5 = eINSTANCE.getDocumentRoot_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H6 = eINSTANCE.getDocumentRoot_H6();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HR = eINSTANCE.getDocumentRoot_Hr();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__I = eINSTANCE.getDocumentRoot_I();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMG = eINSTANCE.getDocumentRoot_Img();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KBD = eINSTANCE.getDocumentRoot_Kbd();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LI = eINSTANCE.getDocumentRoot_Li();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MAP = eINSTANCE.getDocumentRoot_Map();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OL = eINSTANCE.getDocumentRoot_Ol();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__P = eINSTANCE.getDocumentRoot_P();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRE = eINSTANCE.getDocumentRoot_Pre();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__Q = eINSTANCE.getDocumentRoot_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SAMP = eINSTANCE.getDocumentRoot_Samp();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SMALL = eINSTANCE.getDocumentRoot_Small();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPAN = eINSTANCE.getDocumentRoot_Span();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRONG = eINSTANCE.getDocumentRoot_Strong();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUB = eINSTANCE.getDocumentRoot_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUP = eINSTANCE.getDocumentRoot_Sup();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLE = eINSTANCE.getDocumentRoot_Table();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TBODY = eINSTANCE.getDocumentRoot_Tbody();

		/**
		 * The meta object literal for the '<em><b>Td</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TD = eINSTANCE.getDocumentRoot_Td();

		/**
		 * The meta object literal for the '<em><b>Tfoot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TFOOT = eINSTANCE.getDocumentRoot_Tfoot();

		/**
		 * The meta object literal for the '<em><b>Th</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TH = eINSTANCE.getDocumentRoot_Th();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__THEAD = eINSTANCE.getDocumentRoot_Thead();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TR = eINSTANCE.getDocumentRoot_Tr();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TT = eINSTANCE.getDocumentRoot_Tt();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UL = eINSTANCE.getDocumentRoot_Ul();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VAR = eINSTANCE.getDocumentRoot_Var();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.DtTypeImpl <em>Dt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.DtTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDtType()
		 * @generated
		 */
		EClass DT_TYPE = eINSTANCE.getDtType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__CLASS = eINSTANCE.getDtType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__DIR = eINSTANCE.getDtType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__ID = eINSTANCE.getDtType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__LANG = eINSTANCE.getDtType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__LANG1 = eINSTANCE.getDtType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__STYLE = eINSTANCE.getDtType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__TITLE = eINSTANCE.getDtType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.EmTypeImpl <em>Em Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.EmTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getEmType()
		 * @generated
		 */
		EClass EM_TYPE = eINSTANCE.getEmType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__CLASS = eINSTANCE.getEmType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__DIR = eINSTANCE.getEmType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__ID = eINSTANCE.getEmType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__LANG = eINSTANCE.getEmType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__LANG1 = eINSTANCE.getEmType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__STYLE = eINSTANCE.getEmType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__TITLE = eINSTANCE.getEmType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.FlowImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MIXED = eINSTANCE.getFlow_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__GROUP = eINSTANCE.getFlow_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__P = eINSTANCE.getFlow_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H1 = eINSTANCE.getFlow_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H2 = eINSTANCE.getFlow_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H3 = eINSTANCE.getFlow_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H4 = eINSTANCE.getFlow_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H5 = eINSTANCE.getFlow_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H6 = eINSTANCE.getFlow_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DIV = eINSTANCE.getFlow_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__UL = eINSTANCE.getFlow_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__OL = eINSTANCE.getFlow_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DL = eINSTANCE.getFlow_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__PRE = eINSTANCE.getFlow_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__HR = eINSTANCE.getFlow_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BLOCKQUOTE = eINSTANCE.getFlow_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ADDRESS = eINSTANCE.getFlow_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TABLE = eINSTANCE.getFlow_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__A = eINSTANCE.getFlow_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BR = eINSTANCE.getFlow_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SPAN = eINSTANCE.getFlow_Span();

		/**
		 * The meta object literal for the '<em><b>Bdo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BDO = eINSTANCE.getFlow_Bdo();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__MAP = eINSTANCE.getFlow_Map();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__IMG = eINSTANCE.getFlow_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TT = eINSTANCE.getFlow_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__I = eINSTANCE.getFlow_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__B = eINSTANCE.getFlow_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BIG = eINSTANCE.getFlow_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SMALL = eINSTANCE.getFlow_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EM = eINSTANCE.getFlow_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STRONG = eINSTANCE.getFlow_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DFN = eINSTANCE.getFlow_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CODE = eINSTANCE.getFlow_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__Q = eINSTANCE.getFlow_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SAMP = eINSTANCE.getFlow_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__KBD = eINSTANCE.getFlow_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__VAR = eINSTANCE.getFlow_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CITE = eINSTANCE.getFlow_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ABBR = eINSTANCE.getFlow_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ACRONYM = eINSTANCE.getFlow_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUB = eINSTANCE.getFlow_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUP = eINSTANCE.getFlow_Sup();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H1TypeImpl <em>H1 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H1TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH1Type()
		 * @generated
		 */
		EClass H1_TYPE = eINSTANCE.getH1Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__CLASS = eINSTANCE.getH1Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__DIR = eINSTANCE.getH1Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__ID = eINSTANCE.getH1Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__LANG = eINSTANCE.getH1Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__LANG1 = eINSTANCE.getH1Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__STYLE = eINSTANCE.getH1Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__TITLE = eINSTANCE.getH1Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H2TypeImpl <em>H2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H2TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH2Type()
		 * @generated
		 */
		EClass H2_TYPE = eINSTANCE.getH2Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__CLASS = eINSTANCE.getH2Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__DIR = eINSTANCE.getH2Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__ID = eINSTANCE.getH2Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__LANG = eINSTANCE.getH2Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__LANG1 = eINSTANCE.getH2Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__STYLE = eINSTANCE.getH2Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__TITLE = eINSTANCE.getH2Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H3TypeImpl <em>H3 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H3TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH3Type()
		 * @generated
		 */
		EClass H3_TYPE = eINSTANCE.getH3Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__CLASS = eINSTANCE.getH3Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__DIR = eINSTANCE.getH3Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__ID = eINSTANCE.getH3Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__LANG = eINSTANCE.getH3Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__LANG1 = eINSTANCE.getH3Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__STYLE = eINSTANCE.getH3Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__TITLE = eINSTANCE.getH3Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H4TypeImpl <em>H4 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H4TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH4Type()
		 * @generated
		 */
		EClass H4_TYPE = eINSTANCE.getH4Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__CLASS = eINSTANCE.getH4Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__DIR = eINSTANCE.getH4Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__ID = eINSTANCE.getH4Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__LANG = eINSTANCE.getH4Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__LANG1 = eINSTANCE.getH4Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__STYLE = eINSTANCE.getH4Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__TITLE = eINSTANCE.getH4Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H5TypeImpl <em>H5 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H5TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH5Type()
		 * @generated
		 */
		EClass H5_TYPE = eINSTANCE.getH5Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__CLASS = eINSTANCE.getH5Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__DIR = eINSTANCE.getH5Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__ID = eINSTANCE.getH5Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__LANG = eINSTANCE.getH5Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__LANG1 = eINSTANCE.getH5Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__STYLE = eINSTANCE.getH5Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__TITLE = eINSTANCE.getH5Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.H6TypeImpl <em>H6 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.H6TypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getH6Type()
		 * @generated
		 */
		EClass H6_TYPE = eINSTANCE.getH6Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__CLASS = eINSTANCE.getH6Type_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__DIR = eINSTANCE.getH6Type_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__ID = eINSTANCE.getH6Type_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__LANG = eINSTANCE.getH6Type_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__LANG1 = eINSTANCE.getH6Type_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__STYLE = eINSTANCE.getH6Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__TITLE = eINSTANCE.getH6Type_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.HrTypeImpl <em>Hr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.HrTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getHrType()
		 * @generated
		 */
		EClass HR_TYPE = eINSTANCE.getHrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__CLASS = eINSTANCE.getHrType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__DIR = eINSTANCE.getHrType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__ID = eINSTANCE.getHrType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__LANG = eINSTANCE.getHrType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__LANG1 = eINSTANCE.getHrType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__STYLE = eINSTANCE.getHrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__TITLE = eINSTANCE.getHrType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ImgTypeImpl <em>Img Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ImgTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getImgType()
		 * @generated
		 */
		EClass IMG_TYPE = eINSTANCE.getImgType();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ALT = eINSTANCE.getImgType_Alt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__CLASS = eINSTANCE.getImgType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__DIR = eINSTANCE.getImgType_Dir();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__HEIGHT = eINSTANCE.getImgType_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ID = eINSTANCE.getImgType_Id();

		/**
		 * The meta object literal for the '<em><b>Ismap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ISMAP = eINSTANCE.getImgType_Ismap();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__LANG = eINSTANCE.getImgType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__LANG1 = eINSTANCE.getImgType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Longdesc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__LONGDESC = eINSTANCE.getImgType_Longdesc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__SRC = eINSTANCE.getImgType_Src();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__STYLE = eINSTANCE.getImgType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__TITLE = eINSTANCE.getImgType_Title();

		/**
		 * The meta object literal for the '<em><b>Usemap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__USEMAP = eINSTANCE.getImgType_Usemap();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__WIDTH = eINSTANCE.getImgType_Width();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.InlineImpl <em>Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.InlineImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getInline()
		 * @generated
		 */
		EClass INLINE = eINSTANCE.getInline();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__MIXED = eINSTANCE.getInline_Mixed();

		/**
		 * The meta object literal for the '<em><b>Inline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__INLINE = eINSTANCE.getInline_Inline();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__A = eINSTANCE.getInline_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BR = eINSTANCE.getInline_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SPAN = eINSTANCE.getInline_Span();

		/**
		 * The meta object literal for the '<em><b>Bdo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BDO = eINSTANCE.getInline_Bdo();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__MAP = eINSTANCE.getInline_Map();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__IMG = eINSTANCE.getInline_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__TT = eINSTANCE.getInline_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__I = eINSTANCE.getInline_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__B = eINSTANCE.getInline_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BIG = eINSTANCE.getInline_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SMALL = eINSTANCE.getInline_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__EM = eINSTANCE.getInline_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__STRONG = eINSTANCE.getInline_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__DFN = eINSTANCE.getInline_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CODE = eINSTANCE.getInline_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__Q = eINSTANCE.getInline_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SAMP = eINSTANCE.getInline_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__KBD = eINSTANCE.getInline_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__VAR = eINSTANCE.getInline_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CITE = eINSTANCE.getInline_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ABBR = eINSTANCE.getInline_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ACRONYM = eINSTANCE.getInline_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUB = eINSTANCE.getInline_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUP = eINSTANCE.getInline_Sup();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ITypeImpl <em>IType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ITypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIType()
		 * @generated
		 */
		EClass ITYPE = eINSTANCE.getIType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__CLASS = eINSTANCE.getIType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__DIR = eINSTANCE.getIType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__ID = eINSTANCE.getIType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__LANG = eINSTANCE.getIType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__LANG1 = eINSTANCE.getIType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__STYLE = eINSTANCE.getIType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__TITLE = eINSTANCE.getIType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.KbdTypeImpl <em>Kbd Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.KbdTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getKbdType()
		 * @generated
		 */
		EClass KBD_TYPE = eINSTANCE.getKbdType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__CLASS = eINSTANCE.getKbdType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__DIR = eINSTANCE.getKbdType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__ID = eINSTANCE.getKbdType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__LANG = eINSTANCE.getKbdType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__LANG1 = eINSTANCE.getKbdType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__STYLE = eINSTANCE.getKbdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__TITLE = eINSTANCE.getKbdType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.LiTypeImpl <em>Li Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.LiTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLiType()
		 * @generated
		 */
		EClass LI_TYPE = eINSTANCE.getLiType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__CLASS = eINSTANCE.getLiType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__DIR = eINSTANCE.getLiType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__ID = eINSTANCE.getLiType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__LANG = eINSTANCE.getLiType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__LANG1 = eINSTANCE.getLiType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__STYLE = eINSTANCE.getLiType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__TITLE = eINSTANCE.getLiType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.MapTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__BLOCK = eINSTANCE.getMapType_Block();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__P = eINSTANCE.getMapType_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H1 = eINSTANCE.getMapType_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H2 = eINSTANCE.getMapType_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H3 = eINSTANCE.getMapType_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H4 = eINSTANCE.getMapType_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H5 = eINSTANCE.getMapType_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__H6 = eINSTANCE.getMapType_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__DIV = eINSTANCE.getMapType_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__UL = eINSTANCE.getMapType_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__OL = eINSTANCE.getMapType_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__DL = eINSTANCE.getMapType_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__PRE = eINSTANCE.getMapType_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__HR = eINSTANCE.getMapType_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__BLOCKQUOTE = eINSTANCE.getMapType_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__ADDRESS = eINSTANCE.getMapType_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__TABLE = eINSTANCE.getMapType_Table();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__AREA = eINSTANCE.getMapType_Area();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__CLASS = eINSTANCE.getMapType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__DIR = eINSTANCE.getMapType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__ID = eINSTANCE.getMapType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__LANG = eINSTANCE.getMapType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__LANG1 = eINSTANCE.getMapType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__NAME = eINSTANCE.getMapType_Name();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__STYLE = eINSTANCE.getMapType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__TITLE = eINSTANCE.getMapType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.OlTypeImpl <em>Ol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.OlTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getOlType()
		 * @generated
		 */
		EClass OL_TYPE = eINSTANCE.getOlType();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OL_TYPE__LI = eINSTANCE.getOlType_Li();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__CLASS = eINSTANCE.getOlType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__DIR = eINSTANCE.getOlType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__ID = eINSTANCE.getOlType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__LANG = eINSTANCE.getOlType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__LANG1 = eINSTANCE.getOlType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__STYLE = eINSTANCE.getOlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__TITLE = eINSTANCE.getOlType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.PreContentImpl <em>Pre Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.PreContentImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPreContent()
		 * @generated
		 */
		EClass PRE_CONTENT = eINSTANCE.getPreContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__MIXED = eINSTANCE.getPreContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__GROUP = eINSTANCE.getPreContent_Group();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__A = eINSTANCE.getPreContent_A();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__TT = eINSTANCE.getPreContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__I = eINSTANCE.getPreContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__B = eINSTANCE.getPreContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BIG = eINSTANCE.getPreContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SMALL = eINSTANCE.getPreContent_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__EM = eINSTANCE.getPreContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__STRONG = eINSTANCE.getPreContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__DFN = eINSTANCE.getPreContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CODE = eINSTANCE.getPreContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__Q = eINSTANCE.getPreContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SAMP = eINSTANCE.getPreContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__KBD = eINSTANCE.getPreContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__VAR = eINSTANCE.getPreContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CITE = eINSTANCE.getPreContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ABBR = eINSTANCE.getPreContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ACRONYM = eINSTANCE.getPreContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUB = eINSTANCE.getPreContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUP = eINSTANCE.getPreContent_Sup();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BR = eINSTANCE.getPreContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SPAN = eINSTANCE.getPreContent_Span();

		/**
		 * The meta object literal for the '<em><b>Bdo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BDO = eINSTANCE.getPreContent_Bdo();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__MAP = eINSTANCE.getPreContent_Map();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.PreTypeImpl <em>Pre Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.PreTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPreType()
		 * @generated
		 */
		EClass PRE_TYPE = eINSTANCE.getPreType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__CLASS = eINSTANCE.getPreType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__DIR = eINSTANCE.getPreType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__ID = eINSTANCE.getPreType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__LANG = eINSTANCE.getPreType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__LANG1 = eINSTANCE.getPreType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__SPACE = eINSTANCE.getPreType_Space();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__STYLE = eINSTANCE.getPreType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__TITLE = eINSTANCE.getPreType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.PTypeImpl <em>PType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.PTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPType()
		 * @generated
		 */
		EClass PTYPE = eINSTANCE.getPType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__CLASS = eINSTANCE.getPType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__DIR = eINSTANCE.getPType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ID = eINSTANCE.getPType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__LANG = eINSTANCE.getPType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__LANG1 = eINSTANCE.getPType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__STYLE = eINSTANCE.getPType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__TITLE = eINSTANCE.getPType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.QTypeImpl <em>QType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.QTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getQType()
		 * @generated
		 */
		EClass QTYPE = eINSTANCE.getQType();

		/**
		 * The meta object literal for the '<em><b>Cite1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__CITE1 = eINSTANCE.getQType_Cite1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__CLASS = eINSTANCE.getQType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__DIR = eINSTANCE.getQType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__ID = eINSTANCE.getQType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__LANG = eINSTANCE.getQType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__LANG1 = eINSTANCE.getQType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__STYLE = eINSTANCE.getQType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__TITLE = eINSTANCE.getQType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.SampTypeImpl <em>Samp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.SampTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSampType()
		 * @generated
		 */
		EClass SAMP_TYPE = eINSTANCE.getSampType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__CLASS = eINSTANCE.getSampType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__DIR = eINSTANCE.getSampType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__ID = eINSTANCE.getSampType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__LANG = eINSTANCE.getSampType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__LANG1 = eINSTANCE.getSampType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__STYLE = eINSTANCE.getSampType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__TITLE = eINSTANCE.getSampType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.SmallTypeImpl <em>Small Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.SmallTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSmallType()
		 * @generated
		 */
		EClass SMALL_TYPE = eINSTANCE.getSmallType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__CLASS = eINSTANCE.getSmallType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__DIR = eINSTANCE.getSmallType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__ID = eINSTANCE.getSmallType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__LANG = eINSTANCE.getSmallType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__LANG1 = eINSTANCE.getSmallType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__STYLE = eINSTANCE.getSmallType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__TITLE = eINSTANCE.getSmallType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.SpanTypeImpl <em>Span Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.SpanTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSpanType()
		 * @generated
		 */
		EClass SPAN_TYPE = eINSTANCE.getSpanType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__CLASS = eINSTANCE.getSpanType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__DIR = eINSTANCE.getSpanType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__ID = eINSTANCE.getSpanType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__LANG = eINSTANCE.getSpanType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__LANG1 = eINSTANCE.getSpanType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__STYLE = eINSTANCE.getSpanType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__TITLE = eINSTANCE.getSpanType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.StrongTypeImpl <em>Strong Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.StrongTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getStrongType()
		 * @generated
		 */
		EClass STRONG_TYPE = eINSTANCE.getStrongType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__CLASS = eINSTANCE.getStrongType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__DIR = eINSTANCE.getStrongType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__ID = eINSTANCE.getStrongType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__LANG = eINSTANCE.getStrongType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__LANG1 = eINSTANCE.getStrongType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__STYLE = eINSTANCE.getStrongType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__TITLE = eINSTANCE.getStrongType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.SubTypeImpl <em>Sub Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.SubTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSubType()
		 * @generated
		 */
		EClass SUB_TYPE = eINSTANCE.getSubType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__CLASS = eINSTANCE.getSubType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__DIR = eINSTANCE.getSubType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__ID = eINSTANCE.getSubType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__LANG = eINSTANCE.getSubType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__LANG1 = eINSTANCE.getSubType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__STYLE = eINSTANCE.getSubType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__TITLE = eINSTANCE.getSubType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.SupTypeImpl <em>Sup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.SupTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getSupType()
		 * @generated
		 */
		EClass SUP_TYPE = eINSTANCE.getSupType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__CLASS = eINSTANCE.getSupType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__DIR = eINSTANCE.getSupType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__ID = eINSTANCE.getSupType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__LANG = eINSTANCE.getSupType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__LANG1 = eINSTANCE.getSupType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__STYLE = eINSTANCE.getSupType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__TITLE = eINSTANCE.getSupType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TableTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__CAPTION = eINSTANCE.getTableType_Caption();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COL = eINSTANCE.getTableType_Col();

		/**
		 * The meta object literal for the '<em><b>Colgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COLGROUP = eINSTANCE.getTableType_Colgroup();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__THEAD = eINSTANCE.getTableType_Thead();

		/**
		 * The meta object literal for the '<em><b>Tfoot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TFOOT = eINSTANCE.getTableType_Tfoot();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TBODY = eINSTANCE.getTableType_Tbody();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TR = eINSTANCE.getTableType_Tr();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__BORDER = eINSTANCE.getTableType_Border();

		/**
		 * The meta object literal for the '<em><b>Cellpadding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CELLPADDING = eINSTANCE.getTableType_Cellpadding();

		/**
		 * The meta object literal for the '<em><b>Cellspacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CELLSPACING = eINSTANCE.getTableType_Cellspacing();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CLASS = eINSTANCE.getTableType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__DIR = eINSTANCE.getTableType_Dir();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__FRAME = eINSTANCE.getTableType_Frame();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__ID = eINSTANCE.getTableType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__LANG = eINSTANCE.getTableType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__LANG1 = eINSTANCE.getTableType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__RULES = eINSTANCE.getTableType_Rules();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__STYLE = eINSTANCE.getTableType_Style();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__SUMMARY = eINSTANCE.getTableType_Summary();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__TITLE = eINSTANCE.getTableType_Title();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__WIDTH = eINSTANCE.getTableType_Width();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TbodyTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTbodyType()
		 * @generated
		 */
		EClass TBODY_TYPE = eINSTANCE.getTbodyType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBODY_TYPE__TR = eINSTANCE.getTbodyType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__ALIGN = eINSTANCE.getTbodyType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CHAR = eINSTANCE.getTbodyType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CHAROFF = eINSTANCE.getTbodyType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CLASS = eINSTANCE.getTbodyType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__DIR = eINSTANCE.getTbodyType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__ID = eINSTANCE.getTbodyType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__LANG = eINSTANCE.getTbodyType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__LANG1 = eINSTANCE.getTbodyType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__STYLE = eINSTANCE.getTbodyType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__TITLE = eINSTANCE.getTbodyType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__VALIGN = eINSTANCE.getTbodyType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TdTypeImpl <em>Td Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TdTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTdType()
		 * @generated
		 */
		EClass TD_TYPE = eINSTANCE.getTdType();

		/**
		 * The meta object literal for the '<em><b>Abbr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ABBR1 = eINSTANCE.getTdType_Abbr1();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ALIGN = eINSTANCE.getTdType_Align();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__AXIS = eINSTANCE.getTdType_Axis();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CHAR = eINSTANCE.getTdType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CHAROFF = eINSTANCE.getTdType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CLASS = eINSTANCE.getTdType_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__COLSPAN = eINSTANCE.getTdType_Colspan();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__DIR = eINSTANCE.getTdType_Dir();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__HEADERS = eINSTANCE.getTdType_Headers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ID = eINSTANCE.getTdType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__LANG = eINSTANCE.getTdType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__LANG1 = eINSTANCE.getTdType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ROWSPAN = eINSTANCE.getTdType_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__SCOPE = eINSTANCE.getTdType_Scope();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__STYLE = eINSTANCE.getTdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__TITLE = eINSTANCE.getTdType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__VALIGN = eINSTANCE.getTdType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TfootTypeImpl <em>Tfoot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TfootTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTfootType()
		 * @generated
		 */
		EClass TFOOT_TYPE = eINSTANCE.getTfootType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFOOT_TYPE__TR = eINSTANCE.getTfootType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__ALIGN = eINSTANCE.getTfootType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CHAR = eINSTANCE.getTfootType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CHAROFF = eINSTANCE.getTfootType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CLASS = eINSTANCE.getTfootType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__DIR = eINSTANCE.getTfootType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__ID = eINSTANCE.getTfootType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__LANG = eINSTANCE.getTfootType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__LANG1 = eINSTANCE.getTfootType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__STYLE = eINSTANCE.getTfootType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__TITLE = eINSTANCE.getTfootType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__VALIGN = eINSTANCE.getTfootType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TheadTypeImpl <em>Thead Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TheadTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTheadType()
		 * @generated
		 */
		EClass THEAD_TYPE = eINSTANCE.getTheadType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEAD_TYPE__TR = eINSTANCE.getTheadType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__ALIGN = eINSTANCE.getTheadType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CHAR = eINSTANCE.getTheadType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CHAROFF = eINSTANCE.getTheadType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CLASS = eINSTANCE.getTheadType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__DIR = eINSTANCE.getTheadType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__ID = eINSTANCE.getTheadType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__LANG = eINSTANCE.getTheadType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__LANG1 = eINSTANCE.getTheadType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__STYLE = eINSTANCE.getTheadType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__TITLE = eINSTANCE.getTheadType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__VALIGN = eINSTANCE.getTheadType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.ThTypeImpl <em>Th Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.ThTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getThType()
		 * @generated
		 */
		EClass TH_TYPE = eINSTANCE.getThType();

		/**
		 * The meta object literal for the '<em><b>Abbr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ABBR1 = eINSTANCE.getThType_Abbr1();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ALIGN = eINSTANCE.getThType_Align();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__AXIS = eINSTANCE.getThType_Axis();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CHAR = eINSTANCE.getThType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CHAROFF = eINSTANCE.getThType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CLASS = eINSTANCE.getThType_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__COLSPAN = eINSTANCE.getThType_Colspan();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__DIR = eINSTANCE.getThType_Dir();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__HEADERS = eINSTANCE.getThType_Headers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ID = eINSTANCE.getThType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__LANG = eINSTANCE.getThType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__LANG1 = eINSTANCE.getThType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ROWSPAN = eINSTANCE.getThType_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__SCOPE = eINSTANCE.getThType_Scope();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__STYLE = eINSTANCE.getThType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__TITLE = eINSTANCE.getThType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__VALIGN = eINSTANCE.getThType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TrTypeImpl <em>Tr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TrTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTrType()
		 * @generated
		 */
		EClass TR_TYPE = eINSTANCE.getTrType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__GROUP = eINSTANCE.getTrType_Group();

		/**
		 * The meta object literal for the '<em><b>Th</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR_TYPE__TH = eINSTANCE.getTrType_Th();

		/**
		 * The meta object literal for the '<em><b>Td</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR_TYPE__TD = eINSTANCE.getTrType_Td();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__ALIGN = eINSTANCE.getTrType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CHAR = eINSTANCE.getTrType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CHAROFF = eINSTANCE.getTrType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CLASS = eINSTANCE.getTrType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__DIR = eINSTANCE.getTrType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__ID = eINSTANCE.getTrType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__LANG = eINSTANCE.getTrType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__LANG1 = eINSTANCE.getTrType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__STYLE = eINSTANCE.getTrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__TITLE = eINSTANCE.getTrType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__VALIGN = eINSTANCE.getTrType_Valign();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.TtTypeImpl <em>Tt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.TtTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTtType()
		 * @generated
		 */
		EClass TT_TYPE = eINSTANCE.getTtType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__CLASS = eINSTANCE.getTtType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__DIR = eINSTANCE.getTtType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__ID = eINSTANCE.getTtType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__LANG = eINSTANCE.getTtType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__LANG1 = eINSTANCE.getTtType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__STYLE = eINSTANCE.getTtType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__TITLE = eINSTANCE.getTtType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.UlTypeImpl <em>Ul Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.UlTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getUlType()
		 * @generated
		 */
		EClass UL_TYPE = eINSTANCE.getUlType();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UL_TYPE__LI = eINSTANCE.getUlType_Li();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__CLASS = eINSTANCE.getUlType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__DIR = eINSTANCE.getUlType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__ID = eINSTANCE.getUlType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__LANG = eINSTANCE.getUlType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__LANG1 = eINSTANCE.getUlType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__STYLE = eINSTANCE.getUlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__TITLE = eINSTANCE.getUlType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.impl.VarTypeImpl
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__CLASS = eINSTANCE.getVarType_Class();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__DIR = eINSTANCE.getVarType_Dir();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__ID = eINSTANCE.getVarType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__LANG = eINSTANCE.getVarType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__LANG1 = eINSTANCE.getVarType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__STYLE = eINSTANCE.getVarType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__TITLE = eINSTANCE.getVarType_Title();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.AlignType <em>Align Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.AlignType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAlignType()
		 * @generated
		 */
		EEnum ALIGN_TYPE = eINSTANCE.getAlignType();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.DirType <em>Dir Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.DirType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirType()
		 * @generated
		 */
		EEnum DIR_TYPE = eINSTANCE.getDirType();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.DirType1 <em>Dir Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.DirType1
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirType1()
		 * @generated
		 */
		EEnum DIR_TYPE1 = eINSTANCE.getDirType1();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.IsmapType <em>Ismap Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.IsmapType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIsmapType()
		 * @generated
		 */
		EEnum ISMAP_TYPE = eINSTANCE.getIsmapType();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.NohrefType <em>Nohref Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.NohrefType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNohrefType()
		 * @generated
		 */
		EEnum NOHREF_TYPE = eINSTANCE.getNohrefType();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.Scope
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.Shape
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.TFrame <em>TFrame</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.TFrame
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTFrame()
		 * @generated
		 */
		EEnum TFRAME = eINSTANCE.getTFrame();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.TRules <em>TRules</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.TRules
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTRules()
		 * @generated
		 */
		EEnum TRULES = eINSTANCE.getTRules();

		/**
		 * The meta object literal for the '{@link org.w3c.xhtml.ValignType <em>Valign Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.ValignType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getValignType()
		 * @generated
		 */
		EEnum VALIGN_TYPE = eINSTANCE.getValignType();

		/**
		 * The meta object literal for the '<em>Align Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.AlignType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getAlignTypeObject()
		 * @generated
		 */
		EDataType ALIGN_TYPE_OBJECT = eINSTANCE.getAlignTypeObject();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Charset</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharset()
		 * @generated
		 */
		EDataType CHARSET = eINSTANCE.getCharset();

		/**
		 * The meta object literal for the '<em>Charsets</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCharsets()
		 * @generated
		 */
		EDataType CHARSETS = eINSTANCE.getCharsets();

		/**
		 * The meta object literal for the '<em>Content Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getContentType()
		 * @generated
		 */
		EDataType CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em>Content Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getContentTypes()
		 * @generated
		 */
		EDataType CONTENT_TYPES = eINSTANCE.getContentTypes();

		/**
		 * The meta object literal for the '<em>Coords</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getCoords()
		 * @generated
		 */
		EDataType COORDS = eINSTANCE.getCoords();

		/**
		 * The meta object literal for the '<em>Datetime</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDatetime()
		 * @generated
		 */
		EDataType DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '<em>Dir Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.DirType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirTypeObject()
		 * @generated
		 */
		EDataType DIR_TYPE_OBJECT = eINSTANCE.getDirTypeObject();

		/**
		 * The meta object literal for the '<em>Dir Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.DirType1
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getDirTypeObject1()
		 * @generated
		 */
		EDataType DIR_TYPE_OBJECT1 = eINSTANCE.getDirTypeObject1();

		/**
		 * The meta object literal for the '<em>Ismap Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.IsmapType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getIsmapTypeObject()
		 * @generated
		 */
		EDataType ISMAP_TYPE_OBJECT = eINSTANCE.getIsmapTypeObject();

		/**
		 * The meta object literal for the '<em>Language Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLanguageCode()
		 * @generated
		 */
		EDataType LANGUAGE_CODE = eINSTANCE.getLanguageCode();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Link Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getLinkTypes()
		 * @generated
		 */
		EDataType LINK_TYPES = eINSTANCE.getLinkTypes();

		/**
		 * The meta object literal for the '<em>Media Desc</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMediaDesc()
		 * @generated
		 */
		EDataType MEDIA_DESC = eINSTANCE.getMediaDesc();

		/**
		 * The meta object literal for the '<em>Multi Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getMultiLength()
		 * @generated
		 */
		EDataType MULTI_LENGTH = eINSTANCE.getMultiLength();

		/**
		 * The meta object literal for the '<em>Nohref Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.NohrefType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNohrefTypeObject()
		 * @generated
		 */
		EDataType NOHREF_TYPE_OBJECT = eINSTANCE.getNohrefTypeObject();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Pixels</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getPixels()
		 * @generated
		 */
		EDataType PIXELS = eINSTANCE.getPixels();

		/**
		 * The meta object literal for the '<em>Scope Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.Scope
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScopeObject()
		 * @generated
		 */
		EDataType SCOPE_OBJECT = eINSTANCE.getScopeObject();

		/**
		 * The meta object literal for the '<em>Script</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getScript()
		 * @generated
		 */
		EDataType SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em>Shape Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.Shape
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getShapeObject()
		 * @generated
		 */
		EDataType SHAPE_OBJECT = eINSTANCE.getShapeObject();

		/**
		 * The meta object literal for the '<em>Style Sheet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getStyleSheet()
		 * @generated
		 */
		EDataType STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '<em>Tabindex Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTabindexNumber()
		 * @generated
		 */
		EDataType TABINDEX_NUMBER = eINSTANCE.getTabindexNumber();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>TFrame Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.TFrame
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTFrameObject()
		 * @generated
		 */
		EDataType TFRAME_OBJECT = eINSTANCE.getTFrameObject();

		/**
		 * The meta object literal for the '<em>TRules Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.TRules
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getTRulesObject()
		 * @generated
		 */
		EDataType TRULES_OBJECT = eINSTANCE.getTRulesObject();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Uri List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getUriList()
		 * @generated
		 */
		EDataType URI_LIST = eINSTANCE.getUriList();

		/**
		 * The meta object literal for the '<em>Valign Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.xhtml.ValignType
		 * @see org.w3c.xhtml.impl.XHTMLPackageImpl#getValignTypeObject()
		 * @generated
		 */
		EDataType VALIGN_TYPE_OBJECT = eINSTANCE.getValignTypeObject();

	}

} //XHTMLPackage
