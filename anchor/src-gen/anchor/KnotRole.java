/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knot Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.KnotRole#getTie <em>Tie</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getKnotRole()
 * @model
 * @generated
 */
public interface KnotRole extends Named, Knotted {
    /**
     * Returns the value of the '<em><b>Tie</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link anchor.KnottedTie#getKnotRoles <em>Knot Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tie</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tie</em>' container reference.
     * @see #setTie(KnottedTie)
     * @see anchor.AnchorPackage#getKnotRole_Tie()
     * @see anchor.KnottedTie#getKnotRoles
     * @model opposite="knotRoles" required="true" transient="false"
     * @generated
     */
    KnottedTie getTie();

    /**
     * Sets the value of the '{@link anchor.KnotRole#getTie <em>Tie</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tie</em>' container reference.
     * @see #getTie()
     * @generated
     */
    void setTie(KnottedTie value);

} // KnotRole
