/*
 */
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A length - a value with a unit that is a physical distance.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.fhir.FHIRPackage#getDistance()
 * @model extendedMetaData="name='Distance' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Distance extends Quantity {
} // Distance
