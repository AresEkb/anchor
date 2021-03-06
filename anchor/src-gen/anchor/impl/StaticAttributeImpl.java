/**
 */
package anchor.impl;

import anchor.Anchor;
import anchor.AnchorPackage;
import anchor.Attribute;
import anchor.DataType;
import anchor.Named;
import anchor.StaticAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.StaticAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link anchor.impl.StaticAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.StaticAttributeImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticAttributeImpl extends MinimalEObjectImpl.Container implements StaticAttribute {
    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected DataType type;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected StaticAttributeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.STATIC_ATTRIBUTE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.STATIC_ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataType basicGetType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STATIC_ATTRIBUTE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STATIC_ATTRIBUTE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Anchor getAnchor() {
		if (eContainerFeatureID() != AnchorPackage.STATIC_ATTRIBUTE__ANCHOR) return null;
		return (Anchor)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAnchor(Anchor newAnchor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnchor, AnchorPackage.STATIC_ATTRIBUTE__ANCHOR, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAnchor(Anchor newAnchor) {
		if (newAnchor != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.STATIC_ATTRIBUTE__ANCHOR && newAnchor != null)) {
			if (EcoreUtil.isAncestor(this, newAnchor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, AnchorPackage.ANCHOR__ATTRIBUTES, Anchor.class, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.STATIC_ATTRIBUTE__ANCHOR, newAnchor, newAnchor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnchor((Anchor)otherEnd, msgs);
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
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				return basicSetAnchor(null, msgs);
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
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				return eInternalContainer().eInverseRemove(this, AnchorPackage.ANCHOR__ATTRIBUTES, Anchor.class, msgs);
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
			case AnchorPackage.STATIC_ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AnchorPackage.STATIC_ATTRIBUTE__NAME:
				return getName();
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				return getAnchor();
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
			case AnchorPackage.STATIC_ATTRIBUTE__TYPE:
				setType((DataType)newValue);
				return;
			case AnchorPackage.STATIC_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				setAnchor((Anchor)newValue);
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
			case AnchorPackage.STATIC_ATTRIBUTE__TYPE:
				setType((DataType)null);
				return;
			case AnchorPackage.STATIC_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				setAnchor((Anchor)null);
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
			case AnchorPackage.STATIC_ATTRIBUTE__TYPE:
				return type != null;
			case AnchorPackage.STATIC_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR:
				return getAnchor() != null;
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
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.STATIC_ATTRIBUTE__NAME: return AnchorPackage.NAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.STATIC_ATTRIBUTE__ANCHOR: return AnchorPackage.ATTRIBUTE__ANCHOR;
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
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case AnchorPackage.NAMED__NAME: return AnchorPackage.STATIC_ATTRIBUTE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (baseFeatureID) {
				case AnchorPackage.ATTRIBUTE__ANCHOR: return AnchorPackage.STATIC_ATTRIBUTE__ANCHOR;
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

} //StaticAttributeImpl
