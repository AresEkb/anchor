/**
 */
package anchor.impl;

import anchor.Anchor;
import anchor.AnchorPackage;
import anchor.Attribute;
import anchor.DateTimeType;
import anchor.Knot;
import anchor.Knotted;
import anchor.KnottedAttribute;
import anchor.KnottedHistorizedAttribute;
import anchor.Named;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knotted Historized Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.KnottedHistorizedAttributeImpl#getDateTimeType <em>Date Time Type</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedAttributeImpl#getKnot <em>Knot</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.KnottedHistorizedAttributeImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnottedHistorizedAttributeImpl extends MinimalEObjectImpl.Container implements KnottedHistorizedAttribute {
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
	 * The cached value of the '{@link #getKnot() <em>Knot</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKnot()
	 * @generated
	 * @ordered
	 */
    protected Knot knot;

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
    protected KnottedHistorizedAttributeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.KNOTTED_HISTORIZED_ATTRIBUTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE, oldDateTimeType, dateTimeType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT, oldKnot, knot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT, oldKnot, knot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Anchor getAnchor() {
		if (eContainerFeatureID() != AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR) return null;
		return (Anchor)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAnchor(Anchor newAnchor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnchor, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAnchor(Anchor newAnchor) {
		if (newAnchor != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR && newAnchor != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR, newAnchor, newAnchor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE:
				if (resolve) return getDateTimeType();
				return basicGetDateTimeType();
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT:
				if (resolve) return getKnot();
				return basicGetKnot();
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME:
				return getName();
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)newValue);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT:
				setKnot((Knot)newValue);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE:
				setDateTimeType((DateTimeType)null);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT:
				setKnot((Knot)null);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE:
				return dateTimeType != null;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT:
				return knot != null;
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR:
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
		if (baseClass == Knotted.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT: return AnchorPackage.KNOTTED__KNOT;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME: return AnchorPackage.NAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (derivedFeatureID) {
				case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR: return AnchorPackage.ATTRIBUTE__ANCHOR;
				default: return -1;
			}
		}
		if (baseClass == KnottedAttribute.class) {
			switch (derivedFeatureID) {
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
				case AnchorPackage.KNOTTED__KNOT: return AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__KNOT;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case AnchorPackage.NAMED__NAME: return AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (baseFeatureID) {
				case AnchorPackage.ATTRIBUTE__ANCHOR: return AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR;
				default: return -1;
			}
		}
		if (baseClass == KnottedAttribute.class) {
			switch (baseFeatureID) {
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

} //KnottedHistorizedAttributeImpl
