/**
 */
package anchor.impl;

import anchor.AnchorPackage;
import anchor.AnchorRole;
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
 * An implementation of the model object '<em><b>Tie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.TieImpl#getModel <em>Model</em>}</li>
 *   <li>{@link anchor.impl.TieImpl#getAnchorRoles <em>Anchor Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TieImpl extends MinimalEObjectImpl.Container implements Tie {
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
    protected TieImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.TIE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != AnchorPackage.TIE__MODEL) return null;
		return (Model)eInternalContainer();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, AnchorPackage.TIE__MODEL, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.TIE__MODEL && newModel != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.TIE__MODEL, newModel, newModel));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AnchorRole> getAnchorRoles() {
		if (anchorRoles == null) {
			anchorRoles = new EObjectContainmentWithInverseEList<AnchorRole>(AnchorRole.class, this, AnchorPackage.TIE__ANCHOR_ROLES, AnchorPackage.ANCHOR_ROLE__TIE);
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
			case AnchorPackage.TIE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case AnchorPackage.TIE__ANCHOR_ROLES:
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
			case AnchorPackage.TIE__MODEL:
				return basicSetModel(null, msgs);
			case AnchorPackage.TIE__ANCHOR_ROLES:
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
			case AnchorPackage.TIE__MODEL:
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
			case AnchorPackage.TIE__MODEL:
				return getModel();
			case AnchorPackage.TIE__ANCHOR_ROLES:
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
			case AnchorPackage.TIE__MODEL:
				setModel((Model)newValue);
				return;
			case AnchorPackage.TIE__ANCHOR_ROLES:
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
			case AnchorPackage.TIE__MODEL:
				setModel((Model)null);
				return;
			case AnchorPackage.TIE__ANCHOR_ROLES:
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
			case AnchorPackage.TIE__MODEL:
				return getModel() != null;
			case AnchorPackage.TIE__ANCHOR_ROLES:
				return anchorRoles != null && !anchorRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TieImpl
