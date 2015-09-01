/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.NumericType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.NumericTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link anchor.impl.NumericTypeImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link anchor.impl.NumericTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.impl.NumericTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.impl.NumericTypeImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link anchor.impl.NumericTypeImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericTypeImpl extends DataTypeImpl implements NumericType {
    /**
	 * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMinInclusive()
	 * @generated
	 * @ordered
	 */
    protected static final Double MIN_INCLUSIVE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMinInclusive()
	 * @generated
	 * @ordered
	 */
    protected Double minInclusive = MIN_INCLUSIVE_EDEFAULT;

    /**
	 * This is true if the Min Inclusive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusiveESet;

				/**
	 * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
    protected static final Double MIN_EXCLUSIVE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
    protected Double minExclusive = MIN_EXCLUSIVE_EDEFAULT;

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
	 * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTotalDigits()
	 * @generated
	 * @ordered
	 */
    protected static final Short TOTAL_DIGITS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTotalDigits()
	 * @generated
	 * @ordered
	 */
    protected Short totalDigits = TOTAL_DIGITS_EDEFAULT;

    /**
	 * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
    protected static final Short FRACTION_DIGITS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
    protected Short fractionDigits = FRACTION_DIGITS_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NumericTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.NUMERIC_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Double getMinInclusive() {
		return minInclusive;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(Double newMinInclusive) {
		Double oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		boolean oldMinInclusiveESet = minInclusiveESet;
		minInclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive, !oldMinInclusiveESet));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInclusive() {
		Double oldMinInclusive = minInclusive;
		boolean oldMinInclusiveESet = minInclusiveESet;
		minInclusive = MIN_INCLUSIVE_EDEFAULT;
		minInclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE, oldMinInclusive, MIN_INCLUSIVE_EDEFAULT, oldMinInclusiveESet));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInclusive() {
		return minInclusiveESet;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Double getMinExclusive() {
		return minExclusive;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExclusive(Double newMinExclusive) {
		Double oldMinExclusive = minExclusive;
		minExclusive = newMinExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__MIN_EXCLUSIVE, oldMinExclusive, minExclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Short getTotalDigits() {
		return totalDigits;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDigits(Short newTotalDigits) {
		Short oldTotalDigits = totalDigits;
		totalDigits = newTotalDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__TOTAL_DIGITS, oldTotalDigits, totalDigits));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Short getFractionDigits() {
		return fractionDigits;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFractionDigits(Short newFractionDigits) {
		Short oldFractionDigits = fractionDigits;
		fractionDigits = newFractionDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.NUMERIC_TYPE__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				return getMinInclusive();
			case AnchorPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				return getMinExclusive();
			case AnchorPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				return getMaxInclusive();
			case AnchorPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				return getMaxExclusive();
			case AnchorPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				return getTotalDigits();
			case AnchorPackage.NUMERIC_TYPE__FRACTION_DIGITS:
				return getFractionDigits();
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
			case AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				setMinInclusive((Double)newValue);
				return;
			case AnchorPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				setMinExclusive((Double)newValue);
				return;
			case AnchorPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((Double)newValue);
				return;
			case AnchorPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive((Double)newValue);
				return;
			case AnchorPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				setTotalDigits((Short)newValue);
				return;
			case AnchorPackage.NUMERIC_TYPE__FRACTION_DIGITS:
				setFractionDigits((Short)newValue);
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
			case AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				unsetMinInclusive();
				return;
			case AnchorPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
				return;
			case AnchorPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case AnchorPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
				return;
			case AnchorPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				setTotalDigits(TOTAL_DIGITS_EDEFAULT);
				return;
			case AnchorPackage.NUMERIC_TYPE__FRACTION_DIGITS:
				setFractionDigits(FRACTION_DIGITS_EDEFAULT);
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
			case AnchorPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				return isSetMinInclusive();
			case AnchorPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				return MIN_EXCLUSIVE_EDEFAULT == null ? minExclusive != null : !MIN_EXCLUSIVE_EDEFAULT.equals(minExclusive);
			case AnchorPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
			case AnchorPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				return MAX_EXCLUSIVE_EDEFAULT == null ? maxExclusive != null : !MAX_EXCLUSIVE_EDEFAULT.equals(maxExclusive);
			case AnchorPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				return TOTAL_DIGITS_EDEFAULT == null ? totalDigits != null : !TOTAL_DIGITS_EDEFAULT.equals(totalDigits);
			case AnchorPackage.NUMERIC_TYPE__FRACTION_DIGITS:
				return FRACTION_DIGITS_EDEFAULT == null ? fractionDigits != null : !FRACTION_DIGITS_EDEFAULT.equals(fractionDigits);
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
		result.append(" (minInclusive: ");
		if (minInclusiveESet) result.append(minInclusive); else result.append("<unset>");
		result.append(", minExclusive: ");
		result.append(minExclusive);
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", maxExclusive: ");
		result.append(maxExclusive);
		result.append(", totalDigits: ");
		result.append(totalDigits);
		result.append(", fractionDigits: ");
		result.append(fractionDigits);
		result.append(')');
		return result.toString();
	}

} //NumericTypeImpl
