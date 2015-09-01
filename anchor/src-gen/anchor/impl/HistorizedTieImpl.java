/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.AnchorRole;
import anchor.DateTimeType;
import anchor.HistorizedTie;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historized Tie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getDateTimeType <em>Date Time Type</em>}</li>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getModel <em>Model</em>}</li>
 *   <li>{@link anchor.impl.HistorizedTieImpl#getAnchorRoles <em>Anchor Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistorizedTieImpl extends MinimalEObjectImpl.Container implements HistorizedTie {
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
	public DateTimeType getDateTimeType() {
		if (dateTimeType != null && dateTimeType.eIsProxy()) {
			InternalEObject oldDateTimeType = (InternalEObject)dateTimeType;
			dateTimeType = (DateTimeType)eResolveProxy(oldDateTimeType);
			if (dateTimeType != oldDateTimeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != AnchorPackage.HISTORIZED_TIE__MODEL) return null;
		return (Model)eInternalContainer();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, AnchorPackage.HISTORIZED_TIE__MODEL, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.HISTORIZED_TIE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, AnchorPackage.MODEL__TIES, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.HISTORIZED_TIE__MODEL, newModel, newModel));
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
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
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
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				return basicSetModel(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnchorPackage.HISTORIZED_TIE__MODEL:
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
			case AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE:
				if (resolve) return getDateTimeType();
				return basicGetDateTimeType();
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				return getModel();
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
			case AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)newValue);
				return;
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				setModel((Model)newValue);
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
			case AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)null);
				return;
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				setModel((Model)null);
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
			case AnchorPackage.HISTORIZED_TIE__DATE_TIME_TYPE:
				return dateTimeType != null;
			case AnchorPackage.HISTORIZED_TIE__MODEL:
				return getModel() != null;
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
				case AnchorPackage.HISTORIZED_TIE__MODEL: return AnchorPackage.TIE__MODEL;
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
				case AnchorPackage.TIE__MODEL: return AnchorPackage.HISTORIZED_TIE__MODEL;
				case AnchorPackage.TIE__ANCHOR_ROLES: return AnchorPackage.HISTORIZED_TIE__ANCHOR_ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HistorizedTieImpl
