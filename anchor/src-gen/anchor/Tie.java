/**
 */
package anchor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Tie#getModel <em>Model</em>}</li>
 *   <li>{@link anchor.Tie#getAnchorRoles <em>Anchor Roles</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getTie()
 * @model abstract="true"
 * @generated
 */
public interface Tie extends EObject {
    /**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link anchor.Model#getTies <em>Ties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see anchor.AnchorPackage#getTie_Model()
	 * @see anchor.Model#getTies
	 * @model opposite="ties" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link anchor.Tie#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

				/**
	 * Returns the value of the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.AnchorRole}.
	 * It is bidirectional and its opposite is '{@link anchor.AnchorRole#getTie <em>Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor Roles</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Roles</em>' containment reference list.
	 * @see anchor.AnchorPackage#getTie_AnchorRoles()
	 * @see anchor.AnchorRole#getTie
	 * @model opposite="tie" containment="true" lower="2"
	 * @generated
	 */
    EList<AnchorRole> getAnchorRoles();

} // Tie
