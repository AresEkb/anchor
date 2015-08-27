/**
 */
package anchor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Typed#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getTyped()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Typed extends EObject {

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(DataType)
     * @see anchor.AnchorPackage#getTyped_Type()
     * @model
     * @generated
     */
    DataType getType();

    /**
     * Sets the value of the '{@link anchor.Typed#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DataType value);
} // Typed
