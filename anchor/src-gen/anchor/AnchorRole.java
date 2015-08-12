/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.AnchorRole#getTie <em>Tie</em>}</li>
 *   <li>{@link anchor.AnchorRole#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link anchor.AnchorRole#isIsIdentifier <em>Is Identifier</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getAnchorRole()
 * @model
 * @generated
 */
public interface AnchorRole extends Named {
    /**
     * Returns the value of the '<em><b>Tie</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link anchor.Tie#getAnchorRoles <em>Anchor Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tie</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tie</em>' container reference.
     * @see #setTie(Tie)
     * @see anchor.AnchorPackage#getAnchorRole_Tie()
     * @see anchor.Tie#getAnchorRoles
     * @model opposite="anchorRoles" required="true" transient="false"
     * @generated
     */
    Tie getTie();

    /**
     * Sets the value of the '{@link anchor.AnchorRole#getTie <em>Tie</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tie</em>' container reference.
     * @see #getTie()
     * @generated
     */
    void setTie(Tie value);

    /**
     * Returns the value of the '<em><b>Anchor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor</em>' reference.
     * @see #setAnchor(Anchor)
     * @see anchor.AnchorPackage#getAnchorRole_Anchor()
     * @model required="true"
     * @generated
     */
    Anchor getAnchor();

    /**
     * Sets the value of the '{@link anchor.AnchorRole#getAnchor <em>Anchor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor</em>' reference.
     * @see #getAnchor()
     * @generated
     */
    void setAnchor(Anchor value);

    /**
     * Returns the value of the '<em><b>Is Identifier</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Identifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Identifier</em>' attribute.
     * @see #setIsIdentifier(boolean)
     * @see anchor.AnchorPackage#getAnchorRole_IsIdentifier()
     * @model default="false" required="true"
     * @generated
     */
    boolean isIsIdentifier();

    /**
     * Sets the value of the '{@link anchor.AnchorRole#isIsIdentifier <em>Is Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Identifier</em>' attribute.
     * @see #isIsIdentifier()
     * @generated
     */
    void setIsIdentifier(boolean value);

} // AnchorRole
