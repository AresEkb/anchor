/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.NumericType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link anchor.NumericType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link anchor.NumericType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.NumericType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.NumericType#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link anchor.NumericType#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends DataType {
    /**
     * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Inclusive</em>' attribute.
     * @see #setMinInclusive(int)
     * @see anchor.AnchorPackage#getNumericType_MinInclusive()
     * @model
     * @generated
     */
    int getMinInclusive();

    /**
     * Sets the value of the '{@link anchor.NumericType#getMinInclusive <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Inclusive</em>' attribute.
     * @see #getMinInclusive()
     * @generated
     */
    void setMinInclusive(int value);

    /**
     * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Exclusive</em>' attribute.
     * @see #setMinExclusive(int)
     * @see anchor.AnchorPackage#getNumericType_MinExclusive()
     * @model
     * @generated
     */
    int getMinExclusive();

    /**
     * Sets the value of the '{@link anchor.NumericType#getMinExclusive <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Exclusive</em>' attribute.
     * @see #getMinExclusive()
     * @generated
     */
    void setMinExclusive(int value);

    /**
     * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Inclusive</em>' attribute.
     * @see #setMaxInclusive(int)
     * @see anchor.AnchorPackage#getNumericType_MaxInclusive()
     * @model
     * @generated
     */
    int getMaxInclusive();

    /**
     * Sets the value of the '{@link anchor.NumericType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Inclusive</em>' attribute.
     * @see #getMaxInclusive()
     * @generated
     */
    void setMaxInclusive(int value);

    /**
     * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Exclusive</em>' attribute.
     * @see #setMaxExclusive(int)
     * @see anchor.AnchorPackage#getNumericType_MaxExclusive()
     * @model
     * @generated
     */
    int getMaxExclusive();

    /**
     * Sets the value of the '{@link anchor.NumericType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Exclusive</em>' attribute.
     * @see #getMaxExclusive()
     * @generated
     */
    void setMaxExclusive(int value);

    /**
     * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Total Digits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Total Digits</em>' attribute.
     * @see #setTotalDigits(int)
     * @see anchor.AnchorPackage#getNumericType_TotalDigits()
     * @model
     * @generated
     */
    int getTotalDigits();

    /**
     * Sets the value of the '{@link anchor.NumericType#getTotalDigits <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total Digits</em>' attribute.
     * @see #getTotalDigits()
     * @generated
     */
    void setTotalDigits(int value);

    /**
     * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fraction Digits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fraction Digits</em>' attribute.
     * @see #setFractionDigits(int)
     * @see anchor.AnchorPackage#getNumericType_FractionDigits()
     * @model
     * @generated
     */
    int getFractionDigits();

    /**
     * Sets the value of the '{@link anchor.NumericType#getFractionDigits <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fraction Digits</em>' attribute.
     * @see #getFractionDigits()
     * @generated
     */
    void setFractionDigits(int value);

} // NumericType
