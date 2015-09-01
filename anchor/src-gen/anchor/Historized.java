/**
 */
package anchor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.Historized#getDateTimeType <em>Date Time Type</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getHistorized()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Historized extends EObject {
    /**
	 * Returns the value of the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Type</em>' reference.
	 * @see #setDateTimeType(DateTimeType)
	 * @see anchor.AnchorPackage#getHistorized_DateTimeType()
	 * @model
	 * @generated
	 */
	DateTimeType getDateTimeType();

	/**
	 * Sets the value of the '{@link anchor.Historized#getDateTimeType <em>Date Time Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Type</em>' reference.
	 * @see #getDateTimeType()
	 * @generated
	 */
	void setDateTimeType(DateTimeType value);

} // Historized
