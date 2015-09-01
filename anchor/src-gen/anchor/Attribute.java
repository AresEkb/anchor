/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Attribute#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Named {
    /**
	 * Returns the value of the '<em><b>Anchor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link anchor.Anchor#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' container reference.
	 * @see #setAnchor(Anchor)
	 * @see anchor.AnchorPackage#getAttribute_Anchor()
	 * @see anchor.Anchor#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
    Anchor getAnchor();

    /**
	 * Sets the value of the '{@link anchor.Attribute#getAnchor <em>Anchor</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' container reference.
	 * @see #getAnchor()
	 * @generated
	 */
    void setAnchor(Anchor value);

} // Attribute
