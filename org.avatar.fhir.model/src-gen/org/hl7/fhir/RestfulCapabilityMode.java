/*
 */
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restful Capability Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RestfulCapabilityMode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getRestfulCapabilityMode()
 * @model extendedMetaData="name='RestfulCapabilityMode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RestfulCapabilityMode extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.RestfulCapabilityModeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.RestfulCapabilityModeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(RestfulCapabilityModeEnum)
	 * @see org.hl7.fhir.FHIRPackage#getRestfulCapabilityMode_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	RestfulCapabilityModeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RestfulCapabilityMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.RestfulCapabilityModeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RestfulCapabilityModeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.RestfulCapabilityMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(RestfulCapabilityModeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.RestfulCapabilityMode#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(RestfulCapabilityModeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // RestfulCapabilityMode
