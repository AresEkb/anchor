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
 *   <li>{@link anchor.DataType#getLength <em>Length</em>}</li>
 *   <li>{@link anchor.DataType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link anchor.DataType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link anchor.DataType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link anchor.DataType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link anchor.DataType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link anchor.DataType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.DataType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.DataType#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link anchor.DataType#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Named {
    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see anchor.AnchorPackage#getDataType_Length()
     * @model
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link anchor.DataType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Min Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length</em>' attribute.
     * @see #setMinLength(int)
     * @see anchor.AnchorPackage#getDataType_MinLength()
     * @model
     * @generated
     */
    int getMinLength();

    /**
     * Sets the value of the '{@link anchor.DataType#getMinLength <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length</em>' attribute.
     * @see #getMinLength()
     * @generated
     */
    void setMinLength(int value);

    /**
     * Returns the value of the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length</em>' attribute.
     * @see #setMaxLength(int)
     * @see anchor.AnchorPackage#getDataType_MaxLength()
     * @model
     * @generated
     */
    int getMaxLength();

    /**
     * Sets the value of the '{@link anchor.DataType#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength(int value);

    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(String)
     * @see anchor.AnchorPackage#getDataType_Pattern()
     * @model
     * @generated
     */
    String getPattern();

    /**
     * Sets the value of the '{@link anchor.DataType#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern(String value);

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
     * @see anchor.AnchorPackage#getDataType_MinInclusive()
     * @model
     * @generated
     */
    int getMinInclusive();

    /**
     * Sets the value of the '{@link anchor.DataType#getMinInclusive <em>Min Inclusive</em>}' attribute.
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
     * @see anchor.AnchorPackage#getDataType_MinExclusive()
     * @model
     * @generated
     */
    int getMinExclusive();

    /**
     * Sets the value of the '{@link anchor.DataType#getMinExclusive <em>Min Exclusive</em>}' attribute.
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
     * @see anchor.AnchorPackage#getDataType_MaxInclusive()
     * @model
     * @generated
     */
    int getMaxInclusive();

    /**
     * Sets the value of the '{@link anchor.DataType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
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
     * @see anchor.AnchorPackage#getDataType_MaxExclusive()
     * @model
     * @generated
     */
    int getMaxExclusive();

    /**
     * Sets the value of the '{@link anchor.DataType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
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
     * @see anchor.AnchorPackage#getDataType_TotalDigits()
     * @model
     * @generated
     */
    int getTotalDigits();

    /**
     * Sets the value of the '{@link anchor.DataType#getTotalDigits <em>Total Digits</em>}' attribute.
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
     * @see anchor.AnchorPackage#getDataType_FractionDigits()
     * @model
     * @generated
     */
    int getFractionDigits();

    /**
     * Sets the value of the '{@link anchor.DataType#getFractionDigits <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fraction Digits</em>' attribute.
     * @see #getFractionDigits()
     * @generated
     */
    void setFractionDigits(int value);

} // DataType
