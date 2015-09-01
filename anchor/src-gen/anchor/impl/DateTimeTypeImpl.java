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
 *   <li>{@link anchor.impl.DateTimeTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.impl.DateTimeTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.impl.DateTimeTypeImpl#getMaxUnit <em>Max Unit</em>}</li>
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
    protected static final Double RESOLUTION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
    protected Double resolution = RESOLUTION_EDEFAULT;

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
	 * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_INCLUSIVE_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected Double maxInclusive = MAX_INCLUSIVE_EDEFAULT;

				/**
	 * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_EXCLUSIVE_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected Double maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

				/**
	 * The default value of the '{@link #getMaxUnit() <em>Max Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitOfTime MAX_UNIT_EDEFAULT = UnitOfTime.MICROSECOND;

				/**
	 * The cached value of the '{@link #getMaxUnit() <em>Max Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitOfTime maxUnit = MAX_UNIT_EDEFAULT;

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
    public Double getResolution() {
		return resolution;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Double newResolution) {
		Double oldResolution = resolution;
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
	public Double getMaxInclusive() {
		return maxInclusive;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(Double newMaxInclusive) {
		Double oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATE_TIME_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxExclusive() {
		return maxExclusive;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExclusive(Double newMaxExclusive) {
		Double oldMaxExclusive = maxExclusive;
		maxExclusive = newMaxExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATE_TIME_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfTime getMaxUnit() {
		return maxUnit;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUnit(UnitOfTime newMaxUnit) {
		UnitOfTime oldMaxUnit = maxUnit;
		maxUnit = newMaxUnit == null ? MAX_UNIT_EDEFAULT : newMaxUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATE_TIME_TYPE__MAX_UNIT, oldMaxUnit, maxUnit));
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
			case AnchorPackage.DATE_TIME_TYPE__MAX_INCLUSIVE:
				return getMaxInclusive();
			case AnchorPackage.DATE_TIME_TYPE__MAX_EXCLUSIVE:
				return getMaxExclusive();
			case AnchorPackage.DATE_TIME_TYPE__MAX_UNIT:
				return getMaxUnit();
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
			case AnchorPackage.DATE_TIME_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((Double)newValue);
				return;
			case AnchorPackage.DATE_TIME_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive((Double)newValue);
				return;
			case AnchorPackage.DATE_TIME_TYPE__MAX_UNIT:
				setMaxUnit((UnitOfTime)newValue);
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
			case AnchorPackage.DATE_TIME_TYPE__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case AnchorPackage.DATE_TIME_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
				return;
			case AnchorPackage.DATE_TIME_TYPE__MAX_UNIT:
				setMaxUnit(MAX_UNIT_EDEFAULT);
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
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case AnchorPackage.DATE_TIME_TYPE__RESOLUTION_UNIT:
				return resolutionUnit != RESOLUTION_UNIT_EDEFAULT;
			case AnchorPackage.DATE_TIME_TYPE__MAX_INCLUSIVE:
				return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
			case AnchorPackage.DATE_TIME_TYPE__MAX_EXCLUSIVE:
				return MAX_EXCLUSIVE_EDEFAULT == null ? maxExclusive != null : !MAX_EXCLUSIVE_EDEFAULT.equals(maxExclusive);
			case AnchorPackage.DATE_TIME_TYPE__MAX_UNIT:
				return maxUnit != MAX_UNIT_EDEFAULT;
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
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", maxExclusive: ");
		result.append(maxExclusive);
		result.append(", maxUnit: ");
		result.append(maxUnit);
		result.append(')');
		return result.toString();
	}

} //DateTimeTypeImpl
