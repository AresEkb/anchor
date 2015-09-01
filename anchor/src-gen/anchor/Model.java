/**
 */
package anchor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Model#getAnchors <em>Anchors</em>}</li>
 *   <li>{@link anchor.Model#getKnots <em>Knots</em>}</li>
 *   <li>{@link anchor.Model#getTies <em>Ties</em>}</li>
 *   <li>{@link anchor.Model#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Named {
    /**
	 * Returns the value of the '<em><b>Anchors</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.Anchor}.
	 * It is bidirectional and its opposite is '{@link anchor.Anchor#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchors</em>' containment reference list.
	 * @see anchor.AnchorPackage#getModel_Anchors()
	 * @see anchor.Anchor#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
    EList<Anchor> getAnchors();

    /**
	 * Returns the value of the '<em><b>Knots</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.Knot}.
	 * It is bidirectional and its opposite is '{@link anchor.Knot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knots</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Knots</em>' containment reference list.
	 * @see anchor.AnchorPackage#getModel_Knots()
	 * @see anchor.Knot#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
    EList<Knot> getKnots();

    /**
	 * Returns the value of the '<em><b>Ties</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.Tie}.
	 * It is bidirectional and its opposite is '{@link anchor.Tie#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ties</em>' containment reference list.
	 * @see anchor.AnchorPackage#getModel_Ties()
	 * @see anchor.Tie#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
    EList<Tie> getTies();

    /**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link anchor.DataType}.
	 * It is bidirectional and its opposite is '{@link anchor.DataType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see anchor.AnchorPackage#getModel_DataTypes()
	 * @see anchor.DataType#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
    EList<DataType> getDataTypes();

} // Model
