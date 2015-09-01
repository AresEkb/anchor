/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.AnchorRole;
import anchor.DateTimeType;
import anchor.KnotRole;
import anchor.KnottedHistorizedTie;
import anchor.KnottedTie;
import anchor.Model;
import anchor.Tie;
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
 * An implementation of the model object '<em><b>Knotted Historized Tie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.KnottedHistorizedTieImpl#getDateTimeType <em>Date Time Type</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedTieImpl#getModel <em>Model</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedTieImpl#getAnchorRoles <em>Anchor Roles</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedTieImpl#getKnotRoles <em>Knot Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnottedHistorizedTieImpl extends MinimalEObjectImpl.Container implements KnottedHistorizedTie {
    /**
	 * The cached value of the '{@link #getDateTimeType() <em>Date Time Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeType()
	 * @generated
	 * @ordered
	 */
	protected DateTimeType dateTimeType;

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
    protected KnottedHistorizedTieImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.KNOTTED_HISTORIZED_TIE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTimeType() {
		if (dateTimeType != null && dateTimeType.eIsProxy()) {
			InternalEObject oldDateTimeType = (InternalEObject)dateTimeType;
			dateTimeType = (DateTimeType)eResolveProxy(oldDateTimeType);
			if (dateTimeType != oldDateTimeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
			}
		}
		return dateTimeType;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType basicGetDateTimeType() {
		return dateTimeType;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeType(DateTimeType newDateTimeType) {
		DateTimeType oldDateTimeType = dateTimeType;
		dateTimeType = newDateTimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL) return null;
		return (Model)eInternalContainer();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AnchorRole> getAnchorRoles() {
		if (anchorRoles == null) {
			anchorRoles = new EObjectContainmentWithInverseEList<AnchorRole>(AnchorRole.class, this, AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES, AnchorPackage.ANCHOR_ROLE__TIE);
		}
		return anchorRoles;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KnotRole> getKnotRoles() {
		if (knotRoles == null) {
			knotRoles = new EObjectContainmentWithInverseEList<KnotRole>(KnotRole.class, this, AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES, AnchorPackage.KNOT_ROLE__TIE);
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL, msgs);
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnchorRoles()).basicAdd(otherEnd, msgs);
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL:
				return eBasicSetContainer(null, AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL, msgs);
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				return ((InternalEList<?>)getAnchorRoles()).basicRemove(otherEnd, msgs);
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL:
				return eInternalContainer().eInverseRemove(this, AnchorPackage.MODEL__TIES, Model.class, msgs);
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE:
				if (resolve) return getDateTimeType();
				return basicGetDateTimeType();
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL:
				return getModel();
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				return getAnchorRoles();
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)newValue);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				getAnchorRoles().clear();
				getAnchorRoles().addAll((Collection<? extends AnchorRole>)newValue);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)null);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				getAnchorRoles().clear();
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
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
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE:
				return dateTimeType != null;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL:
				return getModel() != null;
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES:
				return anchorRoles != null && !anchorRoles.isEmpty();
			case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES:
				return knotRoles != null && !knotRoles.isEmpty();
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
				case AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL: return AnchorPackage.TIE__MODEL;
				case AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES: return AnchorPackage.TIE__ANCHOR_ROLES;
				default: return -1;
			}
		}
		if (baseClass == KnottedTie.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES: return AnchorPackage.KNOTTED_TIE__KNOT_ROLES;
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
				case AnchorPackage.TIE__MODEL: return AnchorPackage.KNOTTED_HISTORIZED_TIE__MODEL;
				case AnchorPackage.TIE__ANCHOR_ROLES: return AnchorPackage.KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES;
				default: return -1;
			}
		}
		if (baseClass == KnottedTie.class) {
			switch (baseFeatureID) {
				case AnchorPackage.KNOTTED_TIE__KNOT_ROLES: return AnchorPackage.KNOTTED_HISTORIZED_TIE__KNOT_ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //KnottedHistorizedTieImpl
