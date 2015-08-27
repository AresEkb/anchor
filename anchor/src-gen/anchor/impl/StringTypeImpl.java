/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.StringType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.StringTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link anchor.impl.StringTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link anchor.impl.StringTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link anchor.impl.StringTypeImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringTypeImpl extends DataTypeImpl implements StringType {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.STRING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STRING_TYPE__LENGTH, oldLength, length));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STRING_TYPE__MIN_LENGTH, oldMinLength, minLength));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STRING_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STRING_TYPE__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnchorPackage.STRING_TYPE__LENGTH:
                return getLength();
            case AnchorPackage.STRING_TYPE__MIN_LENGTH:
                return getMinLength();
            case AnchorPackage.STRING_TYPE__MAX_LENGTH:
                return getMaxLength();
            case AnchorPackage.STRING_TYPE__PATTERN:
                return getPattern();
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
            case AnchorPackage.STRING_TYPE__LENGTH:
                setLength((Integer)newValue);
                return;
            case AnchorPackage.STRING_TYPE__MIN_LENGTH:
                setMinLength((Integer)newValue);
                return;
            case AnchorPackage.STRING_TYPE__MAX_LENGTH:
                setMaxLength((Integer)newValue);
                return;
            case AnchorPackage.STRING_TYPE__PATTERN:
                setPattern((String)newValue);
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
            case AnchorPackage.STRING_TYPE__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case AnchorPackage.STRING_TYPE__MIN_LENGTH:
                setMinLength(MIN_LENGTH_EDEFAULT);
                return;
            case AnchorPackage.STRING_TYPE__MAX_LENGTH:
                setMaxLength(MAX_LENGTH_EDEFAULT);
                return;
            case AnchorPackage.STRING_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
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
            case AnchorPackage.STRING_TYPE__LENGTH:
                return length != LENGTH_EDEFAULT;
            case AnchorPackage.STRING_TYPE__MIN_LENGTH:
                return minLength != MIN_LENGTH_EDEFAULT;
            case AnchorPackage.STRING_TYPE__MAX_LENGTH:
                return maxLength != MAX_LENGTH_EDEFAULT;
            case AnchorPackage.STRING_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
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
        result.append(" (length: ");
        result.append(length);
        result.append(", minLength: ");
        result.append(minLength);
        result.append(", maxLength: ");
        result.append(maxLength);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(')');
        return result.toString();
    }

} //StringTypeImpl
