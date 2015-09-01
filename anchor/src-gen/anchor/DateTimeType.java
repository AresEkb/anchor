/**
 */
package anchor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link anchor.DateTimeType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link anchor.DateTimeType#getResolutionUnit <em>Resolution Unit</em>}</li>
 *   <li>{@link anchor.DateTimeType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.DateTimeType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.DateTimeType#getMaxUnit <em>Max Unit</em>}</li>
 * </ul>
 *
 * @see anchor.AnchorPackage#getDateTimeType()
 * @model
 * @generated
 */
public interface DateTimeType extends DataType {
    /**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(Double)
	 * @see anchor.AnchorPackage#getDateTimeType_Resolution()
	 * @model required="true"
	 * @generated
	 */
    Double getResolution();

    /**
	 * Sets the value of the '{@link anchor.DateTimeType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Double value);

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
	 * @see anchor.AnchorPackage#getDateTimeType_ResolutionUnit()
	 * @model required="true"
	 * @generated
	 */
    UnitOfTime getResolutionUnit();

    /**
	 * Sets the value of the '{@link anchor.DateTimeType#getResolutionUnit <em>Resolution Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Unit</em>' attribute.
	 * @see anchor.UnitOfTime
	 * @see #getResolutionUnit()
	 * @generated
	 */
    void setResolutionUnit(UnitOfTime value);

				/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(Double)
	 * @see anchor.AnchorPackage#getDateTimeType_MaxInclusive()
	 * @model
	 * @generated
	 */
	Double getMaxInclusive();

				/**
	 * Sets the value of the '{@link anchor.DateTimeType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #getMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(Double value);

				/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #setMaxExclusive(Double)
	 * @see anchor.AnchorPackage#getDateTimeType_MaxExclusive()
	 * @model
	 * @generated
	 */
	Double getMaxExclusive();

				/**
	 * Sets the value of the '{@link anchor.DateTimeType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(Double value);

				/**
	 * Returns the value of the '<em><b>Max Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link anchor.UnitOfTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Unit</em>' attribute.
	 * @see anchor.UnitOfTime
	 * @see #setMaxUnit(UnitOfTime)
	 * @see anchor.AnchorPackage#getDateTimeType_MaxUnit()
	 * @model required="true"
	 * @generated
	 */
	UnitOfTime getMaxUnit();

				/**
	 * Sets the value of the '{@link anchor.DateTimeType#getMaxUnit <em>Max Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unit</em>' attribute.
	 * @see anchor.UnitOfTime
	 * @see #getMaxUnit()
	 * @generated
	 */
	void setMaxUnit(UnitOfTime value);

} // DateTimeType
