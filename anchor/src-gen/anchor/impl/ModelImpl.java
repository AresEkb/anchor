/**
 */
package anchor.impl;

import anchor.Anchor;
import anchor.AnchorPackage;
import anchor.DataType;
import anchor.Knot;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.ModelImpl#getAnchors <em>Anchors</em>}</li>
 *   <li>{@link anchor.impl.ModelImpl#getKnots <em>Knots</em>}</li>
 *   <li>{@link anchor.impl.ModelImpl#getTies <em>Ties</em>}</li>
 *   <li>{@link anchor.impl.ModelImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getAnchors() <em>Anchors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAnchors()
	 * @generated
	 * @ordered
	 */
    protected EList<Anchor> anchors;

    /**
	 * The cached value of the '{@link #getKnots() <em>Knots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKnots()
	 * @generated
	 * @ordered
	 */
    protected EList<Knot> knots;

    /**
	 * The cached value of the '{@link #getTies() <em>Ties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTies()
	 * @generated
	 * @ordered
	 */
    protected EList<Tie> ties;

    /**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
    protected EList<DataType> dataTypes;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ModelImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AnchorPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.MODEL__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Anchor> getAnchors() {
		if (anchors == null) {
			anchors = new EObjectContainmentWithInverseEList<Anchor>(Anchor.class, this, AnchorPackage.MODEL__ANCHORS, AnchorPackage.ANCHOR__MODEL);
		}
		return anchors;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Knot> getKnots() {
		if (knots == null) {
			knots = new EObjectContainmentWithInverseEList<Knot>(Knot.class, this, AnchorPackage.MODEL__KNOTS, AnchorPackage.KNOT__MODEL);
		}
		return knots;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Tie> getTies() {
		if (ties == null) {
			ties = new EObjectContainmentWithInverseEList<Tie>(Tie.class, this, AnchorPackage.MODEL__TIES, AnchorPackage.TIE__MODEL);
		}
		return ties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentWithInverseEList<DataType>(DataType.class, this, AnchorPackage.MODEL__DATA_TYPES, AnchorPackage.DATA_TYPE__MODEL);
		}
		return dataTypes;
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
			case AnchorPackage.MODEL__ANCHORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnchors()).basicAdd(otherEnd, msgs);
			case AnchorPackage.MODEL__KNOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnots()).basicAdd(otherEnd, msgs);
			case AnchorPackage.MODEL__TIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTies()).basicAdd(otherEnd, msgs);
			case AnchorPackage.MODEL__DATA_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataTypes()).basicAdd(otherEnd, msgs);
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
			case AnchorPackage.MODEL__ANCHORS:
				return ((InternalEList<?>)getAnchors()).basicRemove(otherEnd, msgs);
			case AnchorPackage.MODEL__KNOTS:
				return ((InternalEList<?>)getKnots()).basicRemove(otherEnd, msgs);
			case AnchorPackage.MODEL__TIES:
				return ((InternalEList<?>)getTies()).basicRemove(otherEnd, msgs);
			case AnchorPackage.MODEL__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case AnchorPackage.MODEL__NAME:
				return getName();
			case AnchorPackage.MODEL__ANCHORS:
				return getAnchors();
			case AnchorPackage.MODEL__KNOTS:
				return getKnots();
			case AnchorPackage.MODEL__TIES:
				return getTies();
			case AnchorPackage.MODEL__DATA_TYPES:
				return getDataTypes();
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
			case AnchorPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case AnchorPackage.MODEL__ANCHORS:
				getAnchors().clear();
				getAnchors().addAll((Collection<? extends Anchor>)newValue);
				return;
			case AnchorPackage.MODEL__KNOTS:
				getKnots().clear();
				getKnots().addAll((Collection<? extends Knot>)newValue);
				return;
			case AnchorPackage.MODEL__TIES:
				getTies().clear();
				getTies().addAll((Collection<? extends Tie>)newValue);
				return;
			case AnchorPackage.MODEL__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case AnchorPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnchorPackage.MODEL__ANCHORS:
				getAnchors().clear();
				return;
			case AnchorPackage.MODEL__KNOTS:
				getKnots().clear();
				return;
			case AnchorPackage.MODEL__TIES:
				getTies().clear();
				return;
			case AnchorPackage.MODEL__DATA_TYPES:
				getDataTypes().clear();
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
			case AnchorPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnchorPackage.MODEL__ANCHORS:
				return anchors != null && !anchors.isEmpty();
			case AnchorPackage.MODEL__KNOTS:
				return knots != null && !knots.isEmpty();
			case AnchorPackage.MODEL__TIES:
				return ties != null && !ties.isEmpty();
			case AnchorPackage.MODEL__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ModelImpl
