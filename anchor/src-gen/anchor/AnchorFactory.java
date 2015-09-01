/**
 */
package anchor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see anchor.AnchorPackage
 * @generated
 */
public interface AnchorFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    AnchorFactory eINSTANCE = anchor.impl.AnchorFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
    Model createModel();

    /**
	 * Returns a new object of class '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anchor</em>'.
	 * @generated
	 */
    Anchor createAnchor();

    /**
	 * Returns a new object of class '<em>Knot</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knot</em>'.
	 * @generated
	 */
    Knot createKnot();

    /**
	 * Returns a new object of class '<em>Static Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Attribute</em>'.
	 * @generated
	 */
    StaticAttribute createStaticAttribute();

    /**
	 * Returns a new object of class '<em>Historized Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historized Attribute</em>'.
	 * @generated
	 */
    HistorizedAttribute createHistorizedAttribute();

    /**
	 * Returns a new object of class '<em>Knotted Static Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knotted Static Attribute</em>'.
	 * @generated
	 */
    KnottedStaticAttribute createKnottedStaticAttribute();

    /**
	 * Returns a new object of class '<em>Knotted Historized Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knotted Historized Attribute</em>'.
	 * @generated
	 */
    KnottedHistorizedAttribute createKnottedHistorizedAttribute();

    /**
	 * Returns a new object of class '<em>Static Tie</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Tie</em>'.
	 * @generated
	 */
    StaticTie createStaticTie();

    /**
	 * Returns a new object of class '<em>Historized Tie</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historized Tie</em>'.
	 * @generated
	 */
    HistorizedTie createHistorizedTie();

    /**
	 * Returns a new object of class '<em>Knotted Static Tie</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knotted Static Tie</em>'.
	 * @generated
	 */
    KnottedStaticTie createKnottedStaticTie();

    /**
	 * Returns a new object of class '<em>Knotted Historized Tie</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knotted Historized Tie</em>'.
	 * @generated
	 */
    KnottedHistorizedTie createKnottedHistorizedTie();

    /**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
    AnchorRole createAnchorRole();

    /**
	 * Returns a new object of class '<em>Knot Role</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knot Role</em>'.
	 * @generated
	 */
    KnotRole createKnotRole();

    /**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
    StringType createStringType();

    /**
	 * Returns a new object of class '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type</em>'.
	 * @generated
	 */
    NumericType createNumericType();

    /**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
    BooleanType createBooleanType();

    /**
	 * Returns a new object of class '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Type</em>'.
	 * @generated
	 */
    DateTimeType createDateTimeType();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    AnchorPackage getAnchorPackage();

} //AnchorFactory
