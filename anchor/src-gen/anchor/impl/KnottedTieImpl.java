/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.KnotRole;
import anchor.KnottedTie;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knotted Tie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.KnottedTieImpl#getKnotRoles <em>Knot Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KnottedTieImpl extends TieImpl implements KnottedTie {
    /**
     * The cached value of the '{@link #getKnotRoles() <em>Knot Roles</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKnotRoles()
     * @generated
     * @ordered
     */
    protected EList<KnotRole> knotRoles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KnottedTieImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.KNOTTED_TIE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KnotRole> getKnotRoles() {
        if (knotRoles == null) {
            knotRoles = new EObjectContainmentWithInverseEList<KnotRole>(KnotRole.class, this, AnchorPackage.KNOTTED_TIE__KNOT_ROLES, AnchorPackage.KNOT_ROLE__TIE);
        }
        return knotRoles;
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnotRoles()).basicAdd(otherEnd, msgs);
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                return ((InternalEList<?>)getKnotRoles()).basicRemove(otherEnd, msgs);
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                return getKnotRoles();
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                getKnotRoles().clear();
                getKnotRoles().addAll((Collection<? extends KnotRole>)newValue);
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                getKnotRoles().clear();
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
            case AnchorPackage.KNOTTED_TIE__KNOT_ROLES:
                return knotRoles != null && !knotRoles.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //KnottedTieImpl
