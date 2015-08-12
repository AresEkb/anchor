/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link anchor.impl.DataTypeImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
    protected static final int MIN_LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
    protected int minLength = MIN_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected static final int MAX_LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected int maxLength = MAX_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected static final String PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected String pattern = PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInclusive()
     * @generated
     * @ordered
     */
    protected static final int MIN_INCLUSIVE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInclusive()
     * @generated
     * @ordered
     */
    protected int minInclusive = MIN_INCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinExclusive()
     * @generated
     * @ordered
     */
    protected static final int MIN_EXCLUSIVE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinExclusive()
     * @generated
     * @ordered
     */
    protected int minExclusive = MIN_EXCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInclusive()
     * @generated
     * @ordered
     */
    protected static final int MAX_INCLUSIVE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInclusive()
     * @generated
     * @ordered
     */
    protected int maxInclusive = MAX_INCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxExclusive()
     * @generated
     * @ordered
     */
    protected static final int MAX_EXCLUSIVE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxExclusive()
     * @generated
     * @ordered
     */
    protected int maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalDigits()
     * @generated
     * @ordered
     */
    protected static final int TOTAL_DIGITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalDigits()
     * @generated
     * @ordered
     */
    protected int totalDigits = TOTAL_DIGITS_EDEFAULT;

    /**
     * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFractionDigits()
     * @generated
     * @ordered
     */
    protected static final int FRACTION_DIGITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFractionDigits()
     * @generated
     * @ordered
     */
    protected int fractionDigits = FRACTION_DIGITS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.DATA_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinLength() {
        return minLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLength(int newMinLength) {
        int oldMinLength = minLength;
        minLength = newMinLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MIN_LENGTH, oldMinLength, minLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLength(int newMaxLength) {
        int oldMaxLength = maxLength;
        maxLength = newMaxLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPattern(String newPattern) {
        String oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinInclusive() {
        return minInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinInclusive(int newMinInclusive) {
        int oldMinInclusive = minInclusive;
        minInclusive = newMinInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinExclusive() {
        return minExclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinExclusive(int newMinExclusive) {
        int oldMinExclusive = minExclusive;
        minExclusive = newMinExclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MIN_EXCLUSIVE, oldMinExclusive, minExclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxInclusive() {
        return maxInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxInclusive(int newMaxInclusive) {
        int oldMaxInclusive = maxInclusive;
        maxInclusive = newMaxInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxExclusive() {
        return maxExclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxExclusive(int newMaxExclusive) {
        int oldMaxExclusive = maxExclusive;
        maxExclusive = newMaxExclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTotalDigits() {
        return totalDigits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTotalDigits(int newTotalDigits) {
        int oldTotalDigits = totalDigits;
        totalDigits = newTotalDigits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__TOTAL_DIGITS, oldTotalDigits, totalDigits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFractionDigits() {
        return fractionDigits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFractionDigits(int newFractionDigits) {
        int oldFractionDigits = fractionDigits;
        fractionDigits = newFractionDigits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.DATA_TYPE__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnchorPackage.DATA_TYPE__NAME:
                return getName();
            case AnchorPackage.DATA_TYPE__LENGTH:
                return getLength();
            case AnchorPackage.DATA_TYPE__MIN_LENGTH:
                return getMinLength();
            case AnchorPackage.DATA_TYPE__MAX_LENGTH:
                return getMaxLength();
            case AnchorPackage.DATA_TYPE__PATTERN:
                return getPattern();
            case AnchorPackage.DATA_TYPE__MIN_INCLUSIVE:
                return getMinInclusive();
            case AnchorPackage.DATA_TYPE__MIN_EXCLUSIVE:
                return getMinExclusive();
            case AnchorPackage.DATA_TYPE__MAX_INCLUSIVE:
                return getMaxInclusive();
            case AnchorPackage.DATA_TYPE__MAX_EXCLUSIVE:
                return getMaxExclusive();
            case AnchorPackage.DATA_TYPE__TOTAL_DIGITS:
                return getTotalDigits();
            case AnchorPackage.DATA_TYPE__FRACTION_DIGITS:
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
            case AnchorPackage.DATA_TYPE__NAME:
                setName((String)newValue);
                return;
            case AnchorPackage.DATA_TYPE__LENGTH:
                setLength((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MIN_LENGTH:
                setMinLength((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MAX_LENGTH:
                setMaxLength((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__PATTERN:
                setPattern((String)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MIN_INCLUSIVE:
                setMinInclusive((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MIN_EXCLUSIVE:
                setMinExclusive((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MAX_INCLUSIVE:
                setMaxInclusive((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__MAX_EXCLUSIVE:
                setMaxExclusive((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__TOTAL_DIGITS:
                setTotalDigits((Integer)newValue);
                return;
            case AnchorPackage.DATA_TYPE__FRACTION_DIGITS:
                setFractionDigits((Integer)newValue);
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
            case AnchorPackage.DATA_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MIN_LENGTH:
                setMinLength(MIN_LENGTH_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MAX_LENGTH:
                setMaxLength(MAX_LENGTH_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MIN_INCLUSIVE:
                setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MIN_EXCLUSIVE:
                setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MAX_INCLUSIVE:
                setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__MAX_EXCLUSIVE:
                setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__TOTAL_DIGITS:
                setTotalDigits(TOTAL_DIGITS_EDEFAULT);
                return;
            case AnchorPackage.DATA_TYPE__FRACTION_DIGITS:
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
            case AnchorPackage.DATA_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AnchorPackage.DATA_TYPE__LENGTH:
                return length != LENGTH_EDEFAULT;
            case AnchorPackage.DATA_TYPE__MIN_LENGTH:
                return minLength != MIN_LENGTH_EDEFAULT;
            case AnchorPackage.DATA_TYPE__MAX_LENGTH:
                return maxLength != MAX_LENGTH_EDEFAULT;
            case AnchorPackage.DATA_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case AnchorPackage.DATA_TYPE__MIN_INCLUSIVE:
                return minInclusive != MIN_INCLUSIVE_EDEFAULT;
            case AnchorPackage.DATA_TYPE__MIN_EXCLUSIVE:
                return minExclusive != MIN_EXCLUSIVE_EDEFAULT;
            case AnchorPackage.DATA_TYPE__MAX_INCLUSIVE:
                return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
            case AnchorPackage.DATA_TYPE__MAX_EXCLUSIVE:
                return maxExclusive != MAX_EXCLUSIVE_EDEFAULT;
            case AnchorPackage.DATA_TYPE__TOTAL_DIGITS:
                return totalDigits != TOTAL_DIGITS_EDEFAULT;
            case AnchorPackage.DATA_TYPE__FRACTION_DIGITS:
                return fractionDigits != FRACTION_DIGITS_EDEFAULT;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", length: ");
        result.append(length);
        result.append(", minLength: ");
        result.append(minLength);
        result.append(", maxLength: ");
        result.append(maxLength);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(", minInclusive: ");
        result.append(minInclusive);
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

} //DataTypeImpl
