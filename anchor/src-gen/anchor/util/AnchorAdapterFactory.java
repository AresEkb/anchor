/**
 */
package anchor.util;

import anchor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see anchor.AnchorPackage
 * @generated
 */
public class AnchorAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static AnchorPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnchorAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = AnchorPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnchorSwitch<Adapter> modelSwitch =
        new AnchorSwitch<Adapter>() {
            @Override
            public Adapter caseNamed(Named object) {
                return createNamedAdapter();
            }
            @Override
            public Adapter caseTyped(Typed object) {
                return createTypedAdapter();
            }
            @Override
            public Adapter caseKnotted(Knotted object) {
                return createKnottedAdapter();
            }
            @Override
            public Adapter caseHistorized(Historized object) {
                return createHistorizedAdapter();
            }
            @Override
            public Adapter caseModel(Model object) {
                return createModelAdapter();
            }
            @Override
            public Adapter caseAnchor(Anchor object) {
                return createAnchorAdapter();
            }
            @Override
            public Adapter caseKnot(Knot object) {
                return createKnotAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseStaticAttribute(StaticAttribute object) {
                return createStaticAttributeAdapter();
            }
            @Override
            public Adapter caseHistorizedAttribute(HistorizedAttribute object) {
                return createHistorizedAttributeAdapter();
            }
            @Override
            public Adapter caseKnottedAttribute(KnottedAttribute object) {
                return createKnottedAttributeAdapter();
            }
            @Override
            public Adapter caseKnottedStaticAttribute(KnottedStaticAttribute object) {
                return createKnottedStaticAttributeAdapter();
            }
            @Override
            public Adapter caseKnottedHistorizedAttribute(KnottedHistorizedAttribute object) {
                return createKnottedHistorizedAttributeAdapter();
            }
            @Override
            public Adapter caseTie(Tie object) {
                return createTieAdapter();
            }
            @Override
            public Adapter caseStaticTie(StaticTie object) {
                return createStaticTieAdapter();
            }
            @Override
            public Adapter caseHistorizedTie(HistorizedTie object) {
                return createHistorizedTieAdapter();
            }
            @Override
            public Adapter caseKnottedTie(KnottedTie object) {
                return createKnottedTieAdapter();
            }
            @Override
            public Adapter caseKnottedStaticTie(KnottedStaticTie object) {
                return createKnottedStaticTieAdapter();
            }
            @Override
            public Adapter caseKnottedHistorizedTie(KnottedHistorizedTie object) {
                return createKnottedHistorizedTieAdapter();
            }
            @Override
            public Adapter caseAnchorRole(AnchorRole object) {
                return createAnchorRoleAdapter();
            }
            @Override
            public Adapter caseKnotRole(KnotRole object) {
                return createKnotRoleAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link anchor.Named <em>Named</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Named
     * @generated
     */
    public Adapter createNamedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Typed <em>Typed</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Typed
     * @generated
     */
    public Adapter createTypedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Knotted <em>Knotted</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Knotted
     * @generated
     */
    public Adapter createKnottedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Historized <em>Historized</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Historized
     * @generated
     */
    public Adapter createHistorizedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Anchor <em>Anchor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Anchor
     * @generated
     */
    public Adapter createAnchorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Knot <em>Knot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Knot
     * @generated
     */
    public Adapter createKnotAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.StaticAttribute <em>Static Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.StaticAttribute
     * @generated
     */
    public Adapter createStaticAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.HistorizedAttribute <em>Historized Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.HistorizedAttribute
     * @generated
     */
    public Adapter createHistorizedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedAttribute <em>Knotted Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedAttribute
     * @generated
     */
    public Adapter createKnottedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedStaticAttribute <em>Knotted Static Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedStaticAttribute
     * @generated
     */
    public Adapter createKnottedStaticAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedHistorizedAttribute <em>Knotted Historized Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedHistorizedAttribute
     * @generated
     */
    public Adapter createKnottedHistorizedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.Tie <em>Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.Tie
     * @generated
     */
    public Adapter createTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.StaticTie <em>Static Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.StaticTie
     * @generated
     */
    public Adapter createStaticTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.HistorizedTie <em>Historized Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.HistorizedTie
     * @generated
     */
    public Adapter createHistorizedTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedTie <em>Knotted Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedTie
     * @generated
     */
    public Adapter createKnottedTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedStaticTie <em>Knotted Static Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedStaticTie
     * @generated
     */
    public Adapter createKnottedStaticTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnottedHistorizedTie <em>Knotted Historized Tie</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnottedHistorizedTie
     * @generated
     */
    public Adapter createKnottedHistorizedTieAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.AnchorRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.AnchorRole
     * @generated
     */
    public Adapter createAnchorRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.KnotRole <em>Knot Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.KnotRole
     * @generated
     */
    public Adapter createKnotRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link anchor.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see anchor.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //AnchorAdapterFactory
