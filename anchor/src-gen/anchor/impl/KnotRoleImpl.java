/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.Knot;
import anchor.KnotRole;
import anchor.Knotted;
import anchor.KnottedTie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knot Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.KnotRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.KnotRoleImpl#getKnot <em>Knot</em>}</li>
 *   <li>{@link anchor.impl.KnotRoleImpl#getTie <em>Tie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnotRoleImpl extends MinimalEObjectImpl.Container implements KnotRole {
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
	 * The cached value of the '{@link #getKnot() <em>Knot</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKnot()
	 * @generated
	 * @ordered
	 */
    protected Knot knot;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KnotRoleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.KNOT_ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOT_ROLE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Knot getKnot() {
		if (knot != null && knot.eIsProxy()) {
			InternalEObject oldKnot = (InternalEObject)knot;
			knot = (Knot)eResolveProxy(oldKnot);
			if (knot != oldKnot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.KNOT_ROLE__KNOT, oldKnot, knot));
			}
		}
		return knot;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Knot basicGetKnot() {
		return knot;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setKnot(Knot newKnot) {
		Knot oldKnot = knot;
		knot = newKnot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOT_ROLE__KNOT, oldKnot, knot));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedTie getTie() {
		if (eContainerFeatureID() != AnchorPackage.KNOT_ROLE__TIE) return null;
		return (KnottedTie)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTie(KnottedTie newTie, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTie, AnchorPackage.KNOT_ROLE__TIE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTie(KnottedTie newTie) {
		if (newTie != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.KNOT_ROLE__TIE && newTie != null)) {
			if (EcoreUtil.isAncestor(this, newTie))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTie != null)
				msgs = ((InternalEObject)newTie).eInverseAdd(this, AnchorPackage.KNOTTED_TIE__KNOT_ROLES, KnottedTie.class, msgs);
			msgs = basicSetTie(newTie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOT_ROLE__TIE, newTie, newTie));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnchorPackage.KNOT_ROLE__TIE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTie((KnottedTie)otherEnd, msgs);
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
			case AnchorPackage.KNOT_ROLE__TIE:
				return basicSetTie(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnchorPackage.KNOT_ROLE__TIE:
				return eInternalContainer().eInverseRemove(this, AnchorPackage.KNOTTED_TIE__KNOT_ROLES, KnottedTie.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnchorPackage.KNOT_ROLE__NAME:
				return getName();
			case AnchorPackage.KNOT_ROLE__KNOT:
				if (resolve) return getKnot();
				return basicGetKnot();
			case AnchorPackage.KNOT_ROLE__TIE:
				return getTie();
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
			case AnchorPackage.KNOT_ROLE__NAME:
				setName((String)newValue);
				return;
			case AnchorPackage.KNOT_ROLE__KNOT:
				setKnot((Knot)newValue);
				return;
			case AnchorPackage.KNOT_ROLE__TIE:
				setTie((KnottedTie)newValue);
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
			case AnchorPackage.KNOT_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnchorPackage.KNOT_ROLE__KNOT:
				setKnot((Knot)null);
				return;
			case AnchorPackage.KNOT_ROLE__TIE:
				setTie((KnottedTie)null);
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
			case AnchorPackage.KNOT_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnchorPackage.KNOT_ROLE__KNOT:
				return knot != null;
			case AnchorPackage.KNOT_ROLE__TIE:
				return getTie() != null;
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
		if (baseClass == Knotted.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.KNOT_ROLE__KNOT: return AnchorPackage.KNOTTED__KNOT;
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
		if (baseClass == Knotted.class) {
			switch (baseFeatureID) {
				case AnchorPackage.KNOTTED__KNOT: return AnchorPackage.KNOT_ROLE__KNOT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //KnotRoleImpl
