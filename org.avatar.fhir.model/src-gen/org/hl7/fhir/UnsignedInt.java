/*
 */
package org.hl7.fhir;

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsigned Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An integer with a value that is not negative (e.g. >= 0)
 * If the element is present, it must have either a @value, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.UnsignedInt#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getUnsignedInt()
 * @model extendedMetaData="name='unsignedInt' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnsignedInt extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.hl7.fhir.FHIRPackage#getUnsignedInt_Value()
	 * @model dataType="org.hl7.fhir.UnsignedIntPrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UnsignedInt#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // UnsignedInt
