/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence of Unicode characters
 * Note that FHIR strings SHALL NOT exceed 1,048,576 (1024*1024) characters in size
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.String#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getString()
 * @model extendedMetaData="name='string' kind='elementOnly'"
 * @generated
 */
public interface String extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(java.lang.String)
	 * @see org.hl7.fhir.FHIRPackage#getString_Value()
	 * @model dataType="org.hl7.fhir.StringPrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	java.lang.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.String#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(java.lang.String value);

} // String
