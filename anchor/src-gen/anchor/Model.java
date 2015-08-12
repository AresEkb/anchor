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
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchors</em>' containment reference list.
     * @see anchor.AnchorPackage#getModel_Anchors()
     * @model containment="true"
     * @generated
     */
    EList<Anchor> getAnchors();

    /**
     * Returns the value of the '<em><b>Knots</b></em>' containment reference list.
     * The list contents are of type {@link anchor.Knot}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knots</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Knots</em>' containment reference list.
     * @see anchor.AnchorPackage#getModel_Knots()
     * @model containment="true"
     * @generated
     */
    EList<Knot> getKnots();

    /**
     * Returns the value of the '<em><b>Ties</b></em>' containment reference list.
     * The list contents are of type {@link anchor.Tie}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ties</em>' containment reference list.
     * @see anchor.AnchorPackage#getModel_Ties()
     * @model containment="true"
     * @generated
     */
    EList<Tie> getTies();

    /**
     * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
     * The list contents are of type {@link anchor.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Types</em>' containment reference list.
     * @see anchor.AnchorPackage#getModel_DataTypes()
     * @model containment="true"
     * @generated
     */
    EList<DataType> getDataTypes();

} // Model
