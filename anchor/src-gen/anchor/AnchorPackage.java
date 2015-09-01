/**
 */
package anchor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see anchor.AnchorFactory
 * @model kind="package"
 * @generated
 */
public interface AnchorPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "anchor";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://example.com/anchor";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "anchor";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    AnchorPackage eINSTANCE = anchor.impl.AnchorPackageImpl.init();

    /**
	 * The meta object id for the '{@link anchor.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.Named
	 * @see anchor.impl.AnchorPackageImpl#getNamed()
	 * @generated
	 */
    int NAMED = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED__NAME = 0;

    /**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link anchor.Typed <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.Typed
	 * @see anchor.impl.AnchorPackageImpl#getTyped()
	 * @generated
	 */
    int TYPED = 1;

    /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED__TYPE = 0;

    /**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link anchor.Knotted <em>Knotted</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.Knotted
	 * @see anchor.impl.AnchorPackageImpl#getKnotted()
	 * @generated
	 */
    int KNOTTED = 2;

    /**
	 * The feature id for the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED__KNOT = 0;

    /**
	 * The number of structural features of the '<em>Knotted</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Knotted</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link anchor.Historized <em>Historized</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.Historized
	 * @see anchor.impl.AnchorPackageImpl#getHistorized()
	 * @generated
	 */
    int HISTORIZED = 3;

    /**
	 * The feature id for the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIZED__DATE_TIME_TYPE = 0;

				/**
	 * The number of structural features of the '<em>Historized</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Historized</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link anchor.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.ModelImpl
	 * @see anchor.impl.AnchorPackageImpl#getModel()
	 * @generated
	 */
    int MODEL = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL__ANCHORS = NAMED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Knots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL__KNOTS = NAMED_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Ties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL__TIES = NAMED_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL__DATA_TYPES = NAMED_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

    /**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.AnchorImpl
	 * @see anchor.impl.AnchorPackageImpl#getAnchor()
	 * @generated
	 */
    int ANCHOR = 5;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__MODEL = NAMED_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR__ATTRIBUTES = NAMED_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnotImpl <em>Knot</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnotImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnot()
	 * @generated
	 */
    int KNOT = 6;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT__TYPE = NAMED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOT__MODEL = NAMED_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Knot</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Knot</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.AttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getAttribute()
	 * @generated
	 */
    int ATTRIBUTE = 7;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE__ANCHOR = NAMED_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.StaticAttributeImpl <em>Static Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.StaticAttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getStaticAttribute()
	 * @generated
	 */
    int STATIC_ATTRIBUTE = 8;

    /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_ATTRIBUTE__TYPE = TYPED__TYPE;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_ATTRIBUTE__NAME = TYPED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_ATTRIBUTE__ANCHOR = TYPED_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_ATTRIBUTE_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_ATTRIBUTE_OPERATION_COUNT = TYPED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.HistorizedAttributeImpl <em>Historized Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.HistorizedAttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getHistorizedAttribute()
	 * @generated
	 */
    int HISTORIZED_ATTRIBUTE = 9;

    /**
	 * The feature id for the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE = HISTORIZED__DATE_TIME_TYPE;

				/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_ATTRIBUTE__TYPE = HISTORIZED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_ATTRIBUTE__NAME = HISTORIZED_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_ATTRIBUTE__ANCHOR = HISTORIZED_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Historized Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_ATTRIBUTE_FEATURE_COUNT = HISTORIZED_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Historized Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_ATTRIBUTE_OPERATION_COUNT = HISTORIZED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedAttributeImpl <em>Knotted Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedAttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedAttribute()
	 * @generated
	 */
    int KNOTTED_ATTRIBUTE = 10;

    /**
	 * The feature id for the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_ATTRIBUTE__KNOT = KNOTTED__KNOT;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_ATTRIBUTE__NAME = KNOTTED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_ATTRIBUTE__ANCHOR = KNOTTED_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Knotted Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_ATTRIBUTE_FEATURE_COUNT = KNOTTED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Knotted Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_ATTRIBUTE_OPERATION_COUNT = KNOTTED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedStaticAttributeImpl <em>Knotted Static Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedStaticAttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedStaticAttribute()
	 * @generated
	 */
    int KNOTTED_STATIC_ATTRIBUTE = 11;

    /**
	 * The feature id for the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_ATTRIBUTE__KNOT = KNOTTED_ATTRIBUTE__KNOT;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_ATTRIBUTE__NAME = KNOTTED_ATTRIBUTE__NAME;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_ATTRIBUTE__ANCHOR = KNOTTED_ATTRIBUTE__ANCHOR;

    /**
	 * The number of structural features of the '<em>Knotted Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_ATTRIBUTE_FEATURE_COUNT = KNOTTED_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Knotted Static Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_ATTRIBUTE_OPERATION_COUNT = KNOTTED_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedHistorizedAttributeImpl <em>Knotted Historized Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedHistorizedAttributeImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedHistorizedAttribute()
	 * @generated
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE = 12;

    /**
	 * The feature id for the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTTED_HISTORIZED_ATTRIBUTE__DATE_TIME_TYPE = HISTORIZED__DATE_TIME_TYPE;

				/**
	 * The feature id for the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE__KNOT = HISTORIZED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE__NAME = HISTORIZED_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE__ANCHOR = HISTORIZED_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Knotted Historized Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE_FEATURE_COUNT = HISTORIZED_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Knotted Historized Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_ATTRIBUTE_OPERATION_COUNT = HISTORIZED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.TieImpl <em>Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.TieImpl
	 * @see anchor.impl.AnchorPackageImpl#getTie()
	 * @generated
	 */
    int TIE = 13;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE__MODEL = 0;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIE__ANCHOR_ROLES = 1;

    /**
	 * The number of structural features of the '<em>Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIE_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link anchor.impl.StaticTieImpl <em>Static Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.StaticTieImpl
	 * @see anchor.impl.AnchorPackageImpl#getStaticTie()
	 * @generated
	 */
    int STATIC_TIE = 14;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TIE__MODEL = TIE__MODEL;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_TIE__ANCHOR_ROLES = TIE__ANCHOR_ROLES;

    /**
	 * The number of structural features of the '<em>Static Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_TIE_FEATURE_COUNT = TIE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Static Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_TIE_OPERATION_COUNT = TIE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.HistorizedTieImpl <em>Historized Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.HistorizedTieImpl
	 * @see anchor.impl.AnchorPackageImpl#getHistorizedTie()
	 * @generated
	 */
    int HISTORIZED_TIE = 15;

    /**
	 * The feature id for the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIZED_TIE__DATE_TIME_TYPE = HISTORIZED__DATE_TIME_TYPE;

				/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIZED_TIE__MODEL = HISTORIZED_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_TIE__ANCHOR_ROLES = HISTORIZED_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Historized Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_TIE_FEATURE_COUNT = HISTORIZED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Historized Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HISTORIZED_TIE_OPERATION_COUNT = HISTORIZED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedTieImpl <em>Knotted Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedTieImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedTie()
	 * @generated
	 */
    int KNOTTED_TIE = 16;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTTED_TIE__MODEL = TIE__MODEL;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_TIE__ANCHOR_ROLES = TIE__ANCHOR_ROLES;

    /**
	 * The feature id for the '<em><b>Knot Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_TIE__KNOT_ROLES = TIE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Knotted Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_TIE_FEATURE_COUNT = TIE_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Knotted Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_TIE_OPERATION_COUNT = TIE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedStaticTieImpl <em>Knotted Static Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedStaticTieImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedStaticTie()
	 * @generated
	 */
    int KNOTTED_STATIC_TIE = 17;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTTED_STATIC_TIE__MODEL = KNOTTED_TIE__MODEL;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_TIE__ANCHOR_ROLES = KNOTTED_TIE__ANCHOR_ROLES;

    /**
	 * The feature id for the '<em><b>Knot Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_TIE__KNOT_ROLES = KNOTTED_TIE__KNOT_ROLES;

    /**
	 * The number of structural features of the '<em>Knotted Static Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_TIE_FEATURE_COUNT = KNOTTED_TIE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Knotted Static Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_STATIC_TIE_OPERATION_COUNT = KNOTTED_TIE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnottedHistorizedTieImpl <em>Knotted Historized Tie</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnottedHistorizedTieImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnottedHistorizedTie()
	 * @generated
	 */
    int KNOTTED_HISTORIZED_TIE = 18;

    /**
	 * The feature id for the '<em><b>Date Time Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTTED_HISTORIZED_TIE__DATE_TIME_TYPE = HISTORIZED__DATE_TIME_TYPE;

				/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTTED_HISTORIZED_TIE__MODEL = HISTORIZED_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Anchor Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_TIE__ANCHOR_ROLES = HISTORIZED_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Knot Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_TIE__KNOT_ROLES = HISTORIZED_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Knotted Historized Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_TIE_FEATURE_COUNT = HISTORIZED_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Knotted Historized Tie</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOTTED_HISTORIZED_TIE_OPERATION_COUNT = HISTORIZED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.AnchorRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.AnchorRoleImpl
	 * @see anchor.impl.AnchorPackageImpl#getAnchorRole()
	 * @generated
	 */
    int ANCHOR_ROLE = 19;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Tie</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE__TIE = NAMED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE__ANCHOR = NAMED_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE__IS_IDENTIFIER = NAMED_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANCHOR_ROLE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.KnotRoleImpl <em>Knot Role</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.KnotRoleImpl
	 * @see anchor.impl.AnchorPackageImpl#getKnotRole()
	 * @generated
	 */
    int KNOT_ROLE = 20;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_ROLE__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Knot</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_ROLE__KNOT = NAMED_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Tie</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_ROLE__TIE = NAMED_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Knot Role</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_ROLE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Knot Role</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNOT_ROLE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.DataTypeImpl
	 * @see anchor.impl.AnchorPackageImpl#getDataType()
	 * @generated
	 */
    int DATA_TYPE = 21;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE__NAME = NAMED__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MODEL = NAMED_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.StringTypeImpl
	 * @see anchor.impl.AnchorPackageImpl#getStringType()
	 * @generated
	 */
    int STRING_TYPE = 22;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__NAME = DATA_TYPE__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MODEL = DATA_TYPE__MODEL;

				/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__LENGTH = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__MIN_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__PATTERN = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.NumericTypeImpl
	 * @see anchor.impl.AnchorPackageImpl#getNumericType()
	 * @generated
	 */
    int NUMERIC_TYPE = 23;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__NAME = DATA_TYPE__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MODEL = DATA_TYPE__MODEL;

				/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__MIN_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__MIN_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__MAX_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__MAX_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__TOTAL_DIGITS = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE__FRACTION_DIGITS = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERIC_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.BooleanTypeImpl
	 * @see anchor.impl.AnchorPackageImpl#getBooleanType()
	 * @generated
	 */
    int BOOLEAN_TYPE = 24;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE__NAME = DATA_TYPE__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MODEL = DATA_TYPE__MODEL;

				/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.impl.DateTimeTypeImpl
	 * @see anchor.impl.AnchorPackageImpl#getDateTimeType()
	 * @generated
	 */
    int DATE_TIME_TYPE = 25;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__NAME = DATA_TYPE__NAME;

    /**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MODEL = DATA_TYPE__MODEL;

				/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Resolution Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__RESOLUTION_UNIT = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MAX_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MAX_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Max Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MAX_UNIT = DATA_TYPE_FEATURE_COUNT + 4;

				/**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The number of operations of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link anchor.UnitOfTime <em>Unit Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see anchor.UnitOfTime
	 * @see anchor.impl.AnchorPackageImpl#getUnitOfTime()
	 * @generated
	 */
    int UNIT_OF_TIME = 26;


    /**
	 * Returns the meta object for class '{@link anchor.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see anchor.Named
	 * @generated
	 */
    EClass getNamed();

    /**
	 * Returns the meta object for the attribute '{@link anchor.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see anchor.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
    EAttribute getNamed_Name();

    /**
	 * Returns the meta object for class '{@link anchor.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see anchor.Typed
	 * @generated
	 */
    EClass getTyped();

    /**
	 * Returns the meta object for the reference '{@link anchor.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see anchor.Typed#getType()
	 * @see #getTyped()
	 * @generated
	 */
    EReference getTyped_Type();

    /**
	 * Returns the meta object for class '{@link anchor.Knotted <em>Knotted</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted</em>'.
	 * @see anchor.Knotted
	 * @generated
	 */
    EClass getKnotted();

    /**
	 * Returns the meta object for the reference '{@link anchor.Knotted#getKnot <em>Knot</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knot</em>'.
	 * @see anchor.Knotted#getKnot()
	 * @see #getKnotted()
	 * @generated
	 */
    EReference getKnotted_Knot();

    /**
	 * Returns the meta object for class '{@link anchor.Historized <em>Historized</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historized</em>'.
	 * @see anchor.Historized
	 * @generated
	 */
    EClass getHistorized();

    /**
	 * Returns the meta object for the reference '{@link anchor.Historized#getDateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date Time Type</em>'.
	 * @see anchor.Historized#getDateTimeType()
	 * @see #getHistorized()
	 * @generated
	 */
	EReference getHistorized_DateTimeType();

				/**
	 * Returns the meta object for class '{@link anchor.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see anchor.Model
	 * @generated
	 */
    EClass getModel();

    /**
	 * Returns the meta object for the containment reference list '{@link anchor.Model#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchors</em>'.
	 * @see anchor.Model#getAnchors()
	 * @see #getModel()
	 * @generated
	 */
    EReference getModel_Anchors();

    /**
	 * Returns the meta object for the containment reference list '{@link anchor.Model#getKnots <em>Knots</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knots</em>'.
	 * @see anchor.Model#getKnots()
	 * @see #getModel()
	 * @generated
	 */
    EReference getModel_Knots();

    /**
	 * Returns the meta object for the containment reference list '{@link anchor.Model#getTies <em>Ties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ties</em>'.
	 * @see anchor.Model#getTies()
	 * @see #getModel()
	 * @generated
	 */
    EReference getModel_Ties();

    /**
	 * Returns the meta object for the containment reference list '{@link anchor.Model#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see anchor.Model#getDataTypes()
	 * @see #getModel()
	 * @generated
	 */
    EReference getModel_DataTypes();

    /**
	 * Returns the meta object for class '{@link anchor.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see anchor.Anchor
	 * @generated
	 */
    EClass getAnchor();

    /**
	 * Returns the meta object for the container reference '{@link anchor.Anchor#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see anchor.Anchor#getModel()
	 * @see #getAnchor()
	 * @generated
	 */
	EReference getAnchor_Model();

				/**
	 * Returns the meta object for the containment reference list '{@link anchor.Anchor#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see anchor.Anchor#getAttributes()
	 * @see #getAnchor()
	 * @generated
	 */
    EReference getAnchor_Attributes();

    /**
	 * Returns the meta object for class '{@link anchor.Knot <em>Knot</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knot</em>'.
	 * @see anchor.Knot
	 * @generated
	 */
    EClass getKnot();

    /**
	 * Returns the meta object for the container reference '{@link anchor.Knot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see anchor.Knot#getModel()
	 * @see #getKnot()
	 * @generated
	 */
	EReference getKnot_Model();

				/**
	 * Returns the meta object for class '{@link anchor.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see anchor.Attribute
	 * @generated
	 */
    EClass getAttribute();

    /**
	 * Returns the meta object for the container reference '{@link anchor.Attribute#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Anchor</em>'.
	 * @see anchor.Attribute#getAnchor()
	 * @see #getAttribute()
	 * @generated
	 */
    EReference getAttribute_Anchor();

    /**
	 * Returns the meta object for class '{@link anchor.StaticAttribute <em>Static Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Attribute</em>'.
	 * @see anchor.StaticAttribute
	 * @generated
	 */
    EClass getStaticAttribute();

    /**
	 * Returns the meta object for class '{@link anchor.HistorizedAttribute <em>Historized Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historized Attribute</em>'.
	 * @see anchor.HistorizedAttribute
	 * @generated
	 */
    EClass getHistorizedAttribute();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedAttribute <em>Knotted Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Attribute</em>'.
	 * @see anchor.KnottedAttribute
	 * @generated
	 */
    EClass getKnottedAttribute();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedStaticAttribute <em>Knotted Static Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Static Attribute</em>'.
	 * @see anchor.KnottedStaticAttribute
	 * @generated
	 */
    EClass getKnottedStaticAttribute();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedHistorizedAttribute <em>Knotted Historized Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Historized Attribute</em>'.
	 * @see anchor.KnottedHistorizedAttribute
	 * @generated
	 */
    EClass getKnottedHistorizedAttribute();

    /**
	 * Returns the meta object for class '{@link anchor.Tie <em>Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie</em>'.
	 * @see anchor.Tie
	 * @generated
	 */
    EClass getTie();

    /**
	 * Returns the meta object for the container reference '{@link anchor.Tie#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see anchor.Tie#getModel()
	 * @see #getTie()
	 * @generated
	 */
	EReference getTie_Model();

				/**
	 * Returns the meta object for the containment reference list '{@link anchor.Tie#getAnchorRoles <em>Anchor Roles</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchor Roles</em>'.
	 * @see anchor.Tie#getAnchorRoles()
	 * @see #getTie()
	 * @generated
	 */
    EReference getTie_AnchorRoles();

    /**
	 * Returns the meta object for class '{@link anchor.StaticTie <em>Static Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Tie</em>'.
	 * @see anchor.StaticTie
	 * @generated
	 */
    EClass getStaticTie();

    /**
	 * Returns the meta object for class '{@link anchor.HistorizedTie <em>Historized Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historized Tie</em>'.
	 * @see anchor.HistorizedTie
	 * @generated
	 */
    EClass getHistorizedTie();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedTie <em>Knotted Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Tie</em>'.
	 * @see anchor.KnottedTie
	 * @generated
	 */
    EClass getKnottedTie();

    /**
	 * Returns the meta object for the containment reference list '{@link anchor.KnottedTie#getKnotRoles <em>Knot Roles</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knot Roles</em>'.
	 * @see anchor.KnottedTie#getKnotRoles()
	 * @see #getKnottedTie()
	 * @generated
	 */
    EReference getKnottedTie_KnotRoles();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedStaticTie <em>Knotted Static Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Static Tie</em>'.
	 * @see anchor.KnottedStaticTie
	 * @generated
	 */
    EClass getKnottedStaticTie();

    /**
	 * Returns the meta object for class '{@link anchor.KnottedHistorizedTie <em>Knotted Historized Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotted Historized Tie</em>'.
	 * @see anchor.KnottedHistorizedTie
	 * @generated
	 */
    EClass getKnottedHistorizedTie();

    /**
	 * Returns the meta object for class '{@link anchor.AnchorRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see anchor.AnchorRole
	 * @generated
	 */
    EClass getAnchorRole();

    /**
	 * Returns the meta object for the container reference '{@link anchor.AnchorRole#getTie <em>Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tie</em>'.
	 * @see anchor.AnchorRole#getTie()
	 * @see #getAnchorRole()
	 * @generated
	 */
    EReference getAnchorRole_Tie();

    /**
	 * Returns the meta object for the reference '{@link anchor.AnchorRole#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anchor</em>'.
	 * @see anchor.AnchorRole#getAnchor()
	 * @see #getAnchorRole()
	 * @generated
	 */
    EReference getAnchorRole_Anchor();

    /**
	 * Returns the meta object for the attribute '{@link anchor.AnchorRole#isIsIdentifier <em>Is Identifier</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identifier</em>'.
	 * @see anchor.AnchorRole#isIsIdentifier()
	 * @see #getAnchorRole()
	 * @generated
	 */
    EAttribute getAnchorRole_IsIdentifier();

    /**
	 * Returns the meta object for class '{@link anchor.KnotRole <em>Knot Role</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knot Role</em>'.
	 * @see anchor.KnotRole
	 * @generated
	 */
    EClass getKnotRole();

    /**
	 * Returns the meta object for the container reference '{@link anchor.KnotRole#getTie <em>Tie</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tie</em>'.
	 * @see anchor.KnotRole#getTie()
	 * @see #getKnotRole()
	 * @generated
	 */
    EReference getKnotRole_Tie();

    /**
	 * Returns the meta object for class '{@link anchor.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see anchor.DataType
	 * @generated
	 */
    EClass getDataType();

    /**
	 * Returns the meta object for the container reference '{@link anchor.DataType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see anchor.DataType#getModel()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Model();

				/**
	 * Returns the meta object for class '{@link anchor.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see anchor.StringType
	 * @generated
	 */
    EClass getStringType();

    /**
	 * Returns the meta object for the attribute '{@link anchor.StringType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see anchor.StringType#getLength()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_Length();

    /**
	 * Returns the meta object for the attribute '{@link anchor.StringType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see anchor.StringType#getMinLength()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_MinLength();

    /**
	 * Returns the meta object for the attribute '{@link anchor.StringType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see anchor.StringType#getMaxLength()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_MaxLength();

    /**
	 * Returns the meta object for the attribute '{@link anchor.StringType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see anchor.StringType#getPattern()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_Pattern();

    /**
	 * Returns the meta object for class '{@link anchor.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see anchor.NumericType
	 * @generated
	 */
    EClass getNumericType();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see anchor.NumericType#getMinInclusive()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_MinInclusive();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see anchor.NumericType#getMinExclusive()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_MinExclusive();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see anchor.NumericType#getMaxInclusive()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_MaxInclusive();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see anchor.NumericType#getMaxExclusive()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_MaxExclusive();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Digits</em>'.
	 * @see anchor.NumericType#getTotalDigits()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_TotalDigits();

    /**
	 * Returns the meta object for the attribute '{@link anchor.NumericType#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction Digits</em>'.
	 * @see anchor.NumericType#getFractionDigits()
	 * @see #getNumericType()
	 * @generated
	 */
    EAttribute getNumericType_FractionDigits();

    /**
	 * Returns the meta object for class '{@link anchor.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see anchor.BooleanType
	 * @generated
	 */
    EClass getBooleanType();

    /**
	 * Returns the meta object for class '{@link anchor.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see anchor.DateTimeType
	 * @generated
	 */
    EClass getDateTimeType();

    /**
	 * Returns the meta object for the attribute '{@link anchor.DateTimeType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see anchor.DateTimeType#getResolution()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EAttribute getDateTimeType_Resolution();

    /**
	 * Returns the meta object for the attribute '{@link anchor.DateTimeType#getResolutionUnit <em>Resolution Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Unit</em>'.
	 * @see anchor.DateTimeType#getResolutionUnit()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EAttribute getDateTimeType_ResolutionUnit();

    /**
	 * Returns the meta object for the attribute '{@link anchor.DateTimeType#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see anchor.DateTimeType#getMaxInclusive()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_MaxInclusive();

				/**
	 * Returns the meta object for the attribute '{@link anchor.DateTimeType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see anchor.DateTimeType#getMaxExclusive()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_MaxExclusive();

				/**
	 * Returns the meta object for the attribute '{@link anchor.DateTimeType#getMaxUnit <em>Max Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Unit</em>'.
	 * @see anchor.DateTimeType#getMaxUnit()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_MaxUnit();

				/**
	 * Returns the meta object for enum '{@link anchor.UnitOfTime <em>Unit Of Time</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Time</em>'.
	 * @see anchor.UnitOfTime
	 * @generated
	 */
    EEnum getUnitOfTime();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    AnchorFactory getAnchorFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link anchor.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.Named
		 * @see anchor.impl.AnchorPackageImpl#getNamed()
		 * @generated
		 */
        EClass NAMED = eINSTANCE.getNamed();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

        /**
		 * The meta object literal for the '{@link anchor.Typed <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.Typed
		 * @see anchor.impl.AnchorPackageImpl#getTyped()
		 * @generated
		 */
        EClass TYPED = eINSTANCE.getTyped();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TYPED__TYPE = eINSTANCE.getTyped_Type();

        /**
		 * The meta object literal for the '{@link anchor.Knotted <em>Knotted</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.Knotted
		 * @see anchor.impl.AnchorPackageImpl#getKnotted()
		 * @generated
		 */
        EClass KNOTTED = eINSTANCE.getKnotted();

        /**
		 * The meta object literal for the '<em><b>Knot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference KNOTTED__KNOT = eINSTANCE.getKnotted_Knot();

        /**
		 * The meta object literal for the '{@link anchor.Historized <em>Historized</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.Historized
		 * @see anchor.impl.AnchorPackageImpl#getHistorized()
		 * @generated
		 */
        EClass HISTORIZED = eINSTANCE.getHistorized();

        /**
		 * The meta object literal for the '<em><b>Date Time Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIZED__DATE_TIME_TYPE = eINSTANCE.getHistorized_DateTimeType();

								/**
		 * The meta object literal for the '{@link anchor.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.ModelImpl
		 * @see anchor.impl.AnchorPackageImpl#getModel()
		 * @generated
		 */
        EClass MODEL = eINSTANCE.getModel();

        /**
		 * The meta object literal for the '<em><b>Anchors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MODEL__ANCHORS = eINSTANCE.getModel_Anchors();

        /**
		 * The meta object literal for the '<em><b>Knots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MODEL__KNOTS = eINSTANCE.getModel_Knots();

        /**
		 * The meta object literal for the '<em><b>Ties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MODEL__TIES = eINSTANCE.getModel_Ties();

        /**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MODEL__DATA_TYPES = eINSTANCE.getModel_DataTypes();

        /**
		 * The meta object literal for the '{@link anchor.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.AnchorImpl
		 * @see anchor.impl.AnchorPackageImpl#getAnchor()
		 * @generated
		 */
        EClass ANCHOR = eINSTANCE.getAnchor();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR__MODEL = eINSTANCE.getAnchor_Model();

								/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ANCHOR__ATTRIBUTES = eINSTANCE.getAnchor_Attributes();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnotImpl <em>Knot</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnotImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnot()
		 * @generated
		 */
        EClass KNOT = eINSTANCE.getKnot();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOT__MODEL = eINSTANCE.getKnot_Model();

								/**
		 * The meta object literal for the '{@link anchor.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.AttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getAttribute()
		 * @generated
		 */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
		 * The meta object literal for the '<em><b>Anchor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE__ANCHOR = eINSTANCE.getAttribute_Anchor();

        /**
		 * The meta object literal for the '{@link anchor.impl.StaticAttributeImpl <em>Static Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.StaticAttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getStaticAttribute()
		 * @generated
		 */
        EClass STATIC_ATTRIBUTE = eINSTANCE.getStaticAttribute();

        /**
		 * The meta object literal for the '{@link anchor.impl.HistorizedAttributeImpl <em>Historized Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.HistorizedAttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getHistorizedAttribute()
		 * @generated
		 */
        EClass HISTORIZED_ATTRIBUTE = eINSTANCE.getHistorizedAttribute();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedAttributeImpl <em>Knotted Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedAttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedAttribute()
		 * @generated
		 */
        EClass KNOTTED_ATTRIBUTE = eINSTANCE.getKnottedAttribute();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedStaticAttributeImpl <em>Knotted Static Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedStaticAttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedStaticAttribute()
		 * @generated
		 */
        EClass KNOTTED_STATIC_ATTRIBUTE = eINSTANCE.getKnottedStaticAttribute();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedHistorizedAttributeImpl <em>Knotted Historized Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedHistorizedAttributeImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedHistorizedAttribute()
		 * @generated
		 */
        EClass KNOTTED_HISTORIZED_ATTRIBUTE = eINSTANCE.getKnottedHistorizedAttribute();

        /**
		 * The meta object literal for the '{@link anchor.impl.TieImpl <em>Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.TieImpl
		 * @see anchor.impl.AnchorPackageImpl#getTie()
		 * @generated
		 */
        EClass TIE = eINSTANCE.getTie();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE__MODEL = eINSTANCE.getTie_Model();

								/**
		 * The meta object literal for the '<em><b>Anchor Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TIE__ANCHOR_ROLES = eINSTANCE.getTie_AnchorRoles();

        /**
		 * The meta object literal for the '{@link anchor.impl.StaticTieImpl <em>Static Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.StaticTieImpl
		 * @see anchor.impl.AnchorPackageImpl#getStaticTie()
		 * @generated
		 */
        EClass STATIC_TIE = eINSTANCE.getStaticTie();

        /**
		 * The meta object literal for the '{@link anchor.impl.HistorizedTieImpl <em>Historized Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.HistorizedTieImpl
		 * @see anchor.impl.AnchorPackageImpl#getHistorizedTie()
		 * @generated
		 */
        EClass HISTORIZED_TIE = eINSTANCE.getHistorizedTie();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedTieImpl <em>Knotted Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedTieImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedTie()
		 * @generated
		 */
        EClass KNOTTED_TIE = eINSTANCE.getKnottedTie();

        /**
		 * The meta object literal for the '<em><b>Knot Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference KNOTTED_TIE__KNOT_ROLES = eINSTANCE.getKnottedTie_KnotRoles();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedStaticTieImpl <em>Knotted Static Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedStaticTieImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedStaticTie()
		 * @generated
		 */
        EClass KNOTTED_STATIC_TIE = eINSTANCE.getKnottedStaticTie();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnottedHistorizedTieImpl <em>Knotted Historized Tie</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnottedHistorizedTieImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnottedHistorizedTie()
		 * @generated
		 */
        EClass KNOTTED_HISTORIZED_TIE = eINSTANCE.getKnottedHistorizedTie();

        /**
		 * The meta object literal for the '{@link anchor.impl.AnchorRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.AnchorRoleImpl
		 * @see anchor.impl.AnchorPackageImpl#getAnchorRole()
		 * @generated
		 */
        EClass ANCHOR_ROLE = eINSTANCE.getAnchorRole();

        /**
		 * The meta object literal for the '<em><b>Tie</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ANCHOR_ROLE__TIE = eINSTANCE.getAnchorRole_Tie();

        /**
		 * The meta object literal for the '<em><b>Anchor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ANCHOR_ROLE__ANCHOR = eINSTANCE.getAnchorRole_Anchor();

        /**
		 * The meta object literal for the '<em><b>Is Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ANCHOR_ROLE__IS_IDENTIFIER = eINSTANCE.getAnchorRole_IsIdentifier();

        /**
		 * The meta object literal for the '{@link anchor.impl.KnotRoleImpl <em>Knot Role</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.KnotRoleImpl
		 * @see anchor.impl.AnchorPackageImpl#getKnotRole()
		 * @generated
		 */
        EClass KNOT_ROLE = eINSTANCE.getKnotRole();

        /**
		 * The meta object literal for the '<em><b>Tie</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference KNOT_ROLE__TIE = eINSTANCE.getKnotRole_Tie();

        /**
		 * The meta object literal for the '{@link anchor.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.DataTypeImpl
		 * @see anchor.impl.AnchorPackageImpl#getDataType()
		 * @generated
		 */
        EClass DATA_TYPE = eINSTANCE.getDataType();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__MODEL = eINSTANCE.getDataType_Model();

								/**
		 * The meta object literal for the '{@link anchor.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.StringTypeImpl
		 * @see anchor.impl.AnchorPackageImpl#getStringType()
		 * @generated
		 */
        EClass STRING_TYPE = eINSTANCE.getStringType();

        /**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__LENGTH = eINSTANCE.getStringType_Length();

        /**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__MIN_LENGTH = eINSTANCE.getStringType_MinLength();

        /**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__MAX_LENGTH = eINSTANCE.getStringType_MaxLength();

        /**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__PATTERN = eINSTANCE.getStringType_Pattern();

        /**
		 * The meta object literal for the '{@link anchor.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.NumericTypeImpl
		 * @see anchor.impl.AnchorPackageImpl#getNumericType()
		 * @generated
		 */
        EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

        /**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__MIN_INCLUSIVE = eINSTANCE.getNumericType_MinInclusive();

        /**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__MIN_EXCLUSIVE = eINSTANCE.getNumericType_MinExclusive();

        /**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__MAX_INCLUSIVE = eINSTANCE.getNumericType_MaxInclusive();

        /**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__MAX_EXCLUSIVE = eINSTANCE.getNumericType_MaxExclusive();

        /**
		 * The meta object literal for the '<em><b>Total Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__TOTAL_DIGITS = eINSTANCE.getNumericType_TotalDigits();

        /**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NUMERIC_TYPE__FRACTION_DIGITS = eINSTANCE.getNumericType_FractionDigits();

        /**
		 * The meta object literal for the '{@link anchor.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.BooleanTypeImpl
		 * @see anchor.impl.AnchorPackageImpl#getBooleanType()
		 * @generated
		 */
        EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

        /**
		 * The meta object literal for the '{@link anchor.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.impl.DateTimeTypeImpl
		 * @see anchor.impl.AnchorPackageImpl#getDateTimeType()
		 * @generated
		 */
        EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

        /**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATE_TIME_TYPE__RESOLUTION = eINSTANCE.getDateTimeType_Resolution();

        /**
		 * The meta object literal for the '<em><b>Resolution Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATE_TIME_TYPE__RESOLUTION_UNIT = eINSTANCE.getDateTimeType_ResolutionUnit();

        /**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__MAX_INCLUSIVE = eINSTANCE.getDateTimeType_MaxInclusive();

								/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__MAX_EXCLUSIVE = eINSTANCE.getDateTimeType_MaxExclusive();

								/**
		 * The meta object literal for the '<em><b>Max Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__MAX_UNIT = eINSTANCE.getDateTimeType_MaxUnit();

								/**
		 * The meta object literal for the '{@link anchor.UnitOfTime <em>Unit Of Time</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see anchor.UnitOfTime
		 * @see anchor.impl.AnchorPackageImpl#getUnitOfTime()
		 * @generated
		 */
        EEnum UNIT_OF_TIME = eINSTANCE.getUnitOfTime();

    }

} //AnchorPackage
