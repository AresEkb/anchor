/**
 */
package anchor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Anchor#getModel <em>Model</em>}</li>
 *   <li>{@link anchor.Anchor#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends Named {
    /**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link anchor.Model#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see anchor.AnchorPackage#getAnchor_Model()
	 * @see anchor.Model#getAnchors
	 * @model opposite="anchors" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link anchor.Anchor#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

				/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.Attribute}.
	 * It is bidirectional and its opposite is '{@link anchor.Attribute#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see anchor.AnchorPackage#getAnchor_Attributes()
	 * @see anchor.Attribute#getAnchor
	 * @model opposite="anchor" containment="true" required="true"
	 * @generated
	 */
    EList<Attribute> getAttributes();

} // Anchor
