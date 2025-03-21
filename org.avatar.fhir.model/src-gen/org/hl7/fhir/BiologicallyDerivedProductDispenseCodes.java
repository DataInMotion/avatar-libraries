/*
 */
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Dispense Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coded concept specifying the state of the dispense event.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodes#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getBiologicallyDerivedProductDispenseCodes()
 * @model extendedMetaData="name='BiologicallyDerivedProductDispenseCodes' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BiologicallyDerivedProductDispenseCodes extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodesEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.BiologicallyDerivedProductDispenseCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(BiologicallyDerivedProductDispenseCodesEnum)
	 * @see org.hl7.fhir.FHIRPackage#getBiologicallyDerivedProductDispenseCodes_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BiologicallyDerivedProductDispenseCodesEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.BiologicallyDerivedProductDispenseCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BiologicallyDerivedProductDispenseCodesEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(BiologicallyDerivedProductDispenseCodesEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodes#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(BiologicallyDerivedProductDispenseCodesEnum)
	 * @generated
	 */
	boolean isSetValue();

} // BiologicallyDerivedProductDispenseCodes
