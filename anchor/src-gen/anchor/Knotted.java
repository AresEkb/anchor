/**
 */
package anchor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knotted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Knotted#getKnot <em>Knot</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getKnotted()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Knotted extends EObject {
    /**
	 * Returns the value of the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Knot</em>' reference.
	 * @see #setKnot(Knot)
	 * @see anchor.AnchorPackage#getKnotted_Knot()
	 * @model required="true"
	 * @generated
	 */
    Knot getKnot();

    /**
	 * Sets the value of the '{@link anchor.Knotted#getKnot <em>Knot</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knot</em>' reference.
	 * @see #getKnot()
	 * @generated
	 */
    void setKnot(Knot value);

} // Knotted
