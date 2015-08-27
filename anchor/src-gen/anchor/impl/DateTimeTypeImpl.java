/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.DateTimeType;
import anchor.UnitOfTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.DateTimeTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link anchor.impl.DateTimeTypeImpl#getResolutionUnit <em>Resolution Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTimeTypeImpl extends DataTypeImpl implements DateTimeType {
    /**
     * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolution()
     * @generated
     * @ordered
     */
    protected static final double RESOLUTION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolution()
     * @generated
     * @ordered
     */
    protected double resolution = RESOLUTION_EDEFAULT;

    /**
     * The default value of the '{@link #getResolutionUnit() <em>Resolution Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolutionUnit()
     * @generated
     * @ordered
     */
    protected static final UnitOfTime RESOLUTION_UNIT_EDEFAULT = UnitOfTime.MICROSECOND;

    /**
     * The cached value of the '{@link #getResolutionUnit() <em>Resolution Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolutionUnit()
     * @generated
     * @ordered
     */
    protected UnitOfTime resolutionUnit = RESOLUTION_UNIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DateTimeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.DATE_TIME_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getResolution() {
        return resolution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResolution(double newResolution) {
        double oldResolution = resolution;
        resolution = newResolution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATE_TIME_TYPE__RESOLUTION, oldResolution, resolution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitOfTime getResolutionUnit() {
        return resolutionUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResolutionUnit(UnitOfTime newResolutionUnit) {
        UnitOfTime oldResolutionUnit = resolutionUnit;
        resolutionUnit = newResolutionUnit == null ? RESOLUTION_UNIT_EDEFAULT : newResolutionUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT, oldResolutionUnit, resolutionUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION:
                return getResolution();
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT:
                return getResolutionUnit();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION:
                setResolution((Double)newValue);
                return;
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT:
                setResolutionUnit((UnitOfTime)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION:
                setResolution(RESOLUTION_EDEFAULT);
                return;
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT:
                setResolutionUnit(RESOLUTION_UNIT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION:
                return resolution != RESOLUTION_EDEFAULT;
            case AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT:
                return resolutionUnit != RESOLUTION_UNIT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (resolution: ");
        result.append(resolution);
        result.append(", resolutionUnit: ");
        result.append(resolutionUnit);
        result.append(')');
        return result.toString();
    }

} //DateTimeTypeImpl
