/**
 */
package anchor.impl;

import anchor.Anchor;
import anchor.AnchorPackage;
import anchor.AnchorRole;
import anchor.Tie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link anchor.impl.AnchorRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link anchor.impl.AnchorRoleImpl#getTie <em>Tie</em>}</li>
 *   <li>{@link anchor.impl.AnchorRoleImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link anchor.impl.AnchorRoleImpl#isIsIdentifier <em>Is Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnchorRoleImpl extends MinimalEObjectImpl.Container implements AnchorRole {
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
     * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchor()
     * @generated
     * @ordered
     */
    protected Anchor anchor;

    /**
     * The default value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsIdentifier()
     * @generated
     * @ordered
     */
    protected static final boolean IS_IDENTIFIER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsIdentifier()
     * @generated
     * @ordered
     */
    protected boolean isIdentifier = IS_IDENTIFIER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnchorRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnchorPackage.Literals.ANCHOR_ROLE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.ANCHOR_ROLE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tie getTie() {
        if (eContainerFeatureID() != AnchorPackage.ANCHOR_ROLE__TIE) return null;
        return (Tie)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTie(Tie newTie, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTie, AnchorPackage.ANCHOR_ROLE__TIE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTie(Tie newTie) {
        if (newTie != eInternalContainer() || (eContainerFeatureID() != AnchorPackage.ANCHOR_ROLE__TIE && newTie != null)) {
            if (EcoreUtil.isAncestor(this, newTie))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTie != null)
                msgs = ((InternalEObject)newTie).eInverseAdd(this, AnchorPackage.TIE__ANCHOR_ROLES, Tie.class, msgs);
            msgs = basicSetTie(newTie, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.ANCHOR_ROLE__TIE, newTie, newTie));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Anchor getAnchor() {
        if (anchor != null && anchor.eIsProxy()) {
            InternalEObject oldAnchor = (InternalEObject)anchor;
            anchor = (Anchor)eResolveProxy(oldAnchor);
            if (anchor != oldAnchor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnchorPackage.ANCHOR_ROLE__ANCHOR, oldAnchor, anchor));
            }
        }
        return anchor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Anchor basicGetAnchor() {
        return anchor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnchor(Anchor newAnchor) {
        Anchor oldAnchor = anchor;
        anchor = newAnchor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.ANCHOR_ROLE__ANCHOR, oldAnchor, anchor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsIdentifier() {
        return isIdentifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsIdentifier(boolean newIsIdentifier) {
        boolean oldIsIdentifier = isIdentifier;
        isIdentifier = newIsIdentifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnchorPackage.ANCHOR_ROLE__IS_IDENTIFIER, oldIsIdentifier, isIdentifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnchorPackage.ANCHOR_ROLE__TIE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTie((Tie)otherEnd, msgs);
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
            case AnchorPackage.ANCHOR_ROLE__TIE:
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
            case AnchorPackage.ANCHOR_ROLE__TIE:
                return eInternalContainer().eInverseRemove(this, AnchorPackage.TIE__ANCHOR_ROLES, Tie.class, msgs);
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
            case AnchorPackage.ANCHOR_ROLE__NAME:
                return getName();
            case AnchorPackage.ANCHOR_ROLE__TIE:
                return getTie();
            case AnchorPackage.ANCHOR_ROLE__ANCHOR:
                if (resolve) return getAnchor();
                return basicGetAnchor();
            case AnchorPackage.ANCHOR_ROLE__IS_IDENTIFIER:
                return isIsIdentifier();
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
            case AnchorPackage.ANCHOR_ROLE__NAME:
                setName((String)newValue);
                return;
            case AnchorPackage.ANCHOR_ROLE__TIE:
                setTie((Tie)newValue);
                return;
            case AnchorPackage.ANCHOR_ROLE__ANCHOR:
                setAnchor((Anchor)newValue);
                return;
            case AnchorPackage.ANCHOR_ROLE__IS_IDENTIFIER:
                setIsIdentifier((Boolean)newValue);
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
            case AnchorPackage.ANCHOR_ROLE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AnchorPackage.ANCHOR_ROLE__TIE:
                setTie((Tie)null);
                return;
            case AnchorPackage.ANCHOR_ROLE__ANCHOR:
                setAnchor((Anchor)null);
                return;
            case AnchorPackage.ANCHOR_ROLE__IS_IDENTIFIER:
                setIsIdentifier(IS_IDENTIFIER_EDEFAULT);
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
            case AnchorPackage.ANCHOR_ROLE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AnchorPackage.ANCHOR_ROLE__TIE:
                return getTie() != null;
            case AnchorPackage.ANCHOR_ROLE__ANCHOR:
                return anchor != null;
            case AnchorPackage.ANCHOR_ROLE__IS_IDENTIFIER:
                return isIdentifier != IS_IDENTIFIER_EDEFAULT;
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
        result.append(", isIdentifier: ");
        result.append(isIdentifier);
        result.append(')');
        return result.toString();
    }

} //AnchorRoleImpl
