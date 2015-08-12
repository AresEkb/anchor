/**
 */
package anchor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knotted Tie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.KnottedTie#getKnotRoles <em>Knot Roles</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getKnottedTie()
 * @model abstract="true"
 * @generated
 */
public interface KnottedTie extends Tie {
    /**
     * Returns the value of the '<em><b>Knot Roles</b></em>' containment reference list.
     * The list contents are of type {@link anchor.KnotRole}.
     * It is bidirectional and its opposite is '{@link anchor.KnotRole#getTie <em>Tie</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knot Roles</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Knot Roles</em>' containment reference list.
     * @see anchor.AnchorPackage#getKnottedTie_KnotRoles()
     * @see anchor.KnotRole#getTie
     * @model opposite="tie" containment="true" required="true"
     * @generated
     */
    EList<KnotRole> getKnotRoles();

} // KnottedTie
