/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.DataType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends Named {

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link anchor.Model#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see anchor.AnchorPackage#getDataType_Model()
	 * @see anchor.Model#getDataTypes
	 * @model opposite="dataTypes" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link anchor.DataType#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // DataType
