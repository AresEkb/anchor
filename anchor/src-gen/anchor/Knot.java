/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Knot#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getKnot()
 * @model
 * @generated
 */
public interface Knot extends Named, Typed {

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link anchor.Model#getKnots <em>Knots</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see anchor.AnchorPackage#getKnot_Model()
	 * @see anchor.Model#getKnots
	 * @model opposite="knots" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link anchor.Knot#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);
} // Knot
