/*
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backbone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base definition for the few data types that are allowed to carry modifier extensions.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BackboneType#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getBackboneType()
 * @model extendedMetaData="name='BackboneType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BackboneType extends DataType {
	/**
	 * Returns the value of the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 * 
	 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier Extension</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getBackboneType_ModifierExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifierExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getModifierExtension();

} // BackboneType
