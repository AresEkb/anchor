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
 *   <li>{@link anchor.Historized#getResolution <em>Resolution</em>}</li>
 *   <li>{@link anchor.Historized#getResolutionUnit <em>Resolution Unit</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getHistorized()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Historized extends EObject {
    /**
     * Returns the value of the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution</em>' attribute.
     * @see #setResolution(double)
     * @see anchor.AnchorPackage#getHistorized_Resolution()
     * @model required="true"
     * @generated
     */
    double getResolution();

    /**
     * Sets the value of the '{@link anchor.Historized#getResolution <em>Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution</em>' attribute.
     * @see #getResolution()
     * @generated
     */
    void setResolution(double value);

    /**
     * Returns the value of the '<em><b>Resolution Unit</b></em>' attribute.
     * The literals are from the enumeration {@link anchor.UnitOfTime}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution Unit</em>' attribute.
     * @see anchor.UnitOfTime
     * @see #setResolutionUnit(UnitOfTime)
     * @see anchor.AnchorPackage#getHistorized_ResolutionUnit()
     * @model required="true"
     * @generated
     */
    UnitOfTime getResolutionUnit();

    /**
     * Sets the value of the '{@link anchor.Historized#getResolutionUnit <em>Resolution Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution Unit</em>' attribute.
     * @see anchor.UnitOfTime
     * @see #getResolutionUnit()
     * @generated
     */
    void setResolutionUnit(UnitOfTime value);

} // Historized
