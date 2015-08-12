/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.AnchorRole;
import anchor.HistorizedTie;
import anchor.Tie;
import anchor.UnitOfTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historized Tie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getResolutionUnit <em>Resolution Unit</em>}</li>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getAnchorRoles <em>Anchor Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistorizedTieImpl extends MinimalEObjectImpl.Container implements HistorizedTie {
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
     * The cached value of the '{@link #getAnchorRoles() <em>Anchor Roles</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorRoles()
     * @generated
     * @ordered
     */
    protected EList<AnchorRole> anchorRoles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HistorizedTieImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.HISTORIZED_TIE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.HISTORIZED_TIE__RESOLUTION, oldResolution, resolution));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.HISTORIZED_TIE__RESOLUTION_UNIT, oldResolutionUnit, resolutionUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnchorRole> getAnchorRoles() {
        if (anchorRoles == null) {
            anchorRoles = new EObjectContainmentWithInverseEList<AnchorRole>(AnchorRole.class, this, AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES, AnchorPackage.ANCHOR_ROLE__TIE);
        }
        return anchorRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnchorRoles()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                return ((InternalEList<?>)getAnchorRoles()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION:
                return getResolution();
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION_UNIT:
                return getResolutionUnit();
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                return getAnchorRoles();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION:
                setResolution((Double)newValue);
                return;
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION_UNIT:
                setResolutionUnit((UnitOfTime)newValue);
                return;
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                getAnchorRoles().clear();
                getAnchorRoles().addAll((Collection<? extends AnchorRole>)newValue);
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
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION:
                setResolution(RESOLUTION_EDEFAULT);
                return;
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION_UNIT:
                setResolutionUnit(RESOLUTION_UNIT_EDEFAULT);
                return;
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                getAnchorRoles().clear();
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
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION:
                return resolution != RESOLUTION_EDEFAULT;
            case AnchorPackage.HISTORIZED_TIE__RESOLUTION_UNIT:
                return resolutionUnit != RESOLUTION_UNIT_EDEFAULT;
            case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES:
                return anchorRoles != null && !anchorRoles.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Tie.class) {
            switch (derivedFeatureID) {
                case AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES: return AnchorPackage.TIE__ANCHOR_ROLES;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Tie.class) {
            switch (baseFeatureID) {
                case AnchorPackage.TIE__ANCHOR_ROLES: return AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //HistorizedTieImpl
