/**
 */
package anchor.impl;

import anchor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnchorFactoryImpl extends EFactoryImpl implements AnchorFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static AnchorFactory init() {
		try {
			AnchorFactory theAnchorFactory = (AnchorFactory)EPackage.Registry.INSTANCE.getEFactory(AnchorPackage.eNS_URI);
			if (theAnchorFactory != null) {
				return theAnchorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnchorFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnchorFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnchorPackage.MODEL: return createModel();
			case AnchorPackage.ANCHOR: return createAnchor();
			case AnchorPackage.KNOT: return createKnot();
			case AnchorPackage.STATIC_ATTRIBUTE: return createStaticAttribute();
			case AnchorPackage.HISTORIZED_ATTRIBUTE: return createHistorizedAttribute();
			case AnchorPackage.KNOTTED_STATIC_ATTRIBUTE: return createKnottedStaticAttribute();
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE: return createKnottedHistorizedAttribute();
			case AnchorPackage.STATIC_TIE: return createStaticTie();
			case AnchorPackage.HISTORIZED_TIE: return createHistorizedTie();
			case AnchorPackage.KNOTTED_STATIC_TIE: return createKnottedStaticTie();
			case AnchorPackage.KNOTTED_HISTORIZED_TIE: return createKnottedHistorizedTie();
			case AnchorPackage.ANCHOR_ROLE: return createAnchorRole();
			case AnchorPackage.KNOT_ROLE: return createKnotRole();
			case AnchorPackage.STRING_TYPE: return createStringType();
			case AnchorPackage.NUMERIC_TYPE: return createNumericType();
			case AnchorPackage.BOOLEAN_TYPE: return createBooleanType();
			case AnchorPackage.DATE_TIME_TYPE: return createDateTimeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnchorPackage.UNIT_OF_TIME:
				return createUnitOfTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnchorPackage.UNIT_OF_TIME:
				return convertUnitOfTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Knot createKnot() {
		KnotImpl knot = new KnotImpl();
		return knot;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StaticAttribute createStaticAttribute() {
		StaticAttributeImpl staticAttribute = new StaticAttributeImpl();
		return staticAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HistorizedAttribute createHistorizedAttribute() {
		HistorizedAttributeImpl historizedAttribute = new HistorizedAttributeImpl();
		return historizedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedStaticAttribute createKnottedStaticAttribute() {
		KnottedStaticAttributeImpl knottedStaticAttribute = new KnottedStaticAttributeImpl();
		return knottedStaticAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedHistorizedAttribute createKnottedHistorizedAttribute() {
		KnottedHistorizedAttributeImpl knottedHistorizedAttribute = new KnottedHistorizedAttributeImpl();
		return knottedHistorizedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StaticTie createStaticTie() {
		StaticTieImpl staticTie = new StaticTieImpl();
		return staticTie;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HistorizedTie createHistorizedTie() {
		HistorizedTieImpl historizedTie = new HistorizedTieImpl();
		return historizedTie;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedStaticTie createKnottedStaticTie() {
		KnottedStaticTieImpl knottedStaticTie = new KnottedStaticTieImpl();
		return knottedStaticTie;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedHistorizedTie createKnottedHistorizedTie() {
		KnottedHistorizedTieImpl knottedHistorizedTie = new KnottedHistorizedTieImpl();
		return knottedHistorizedTie;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnchorRole createAnchorRole() {
		AnchorRoleImpl anchorRole = new AnchorRoleImpl();
		return anchorRole;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnotRole createKnotRole() {
		KnotRoleImpl knotRole = new KnotRoleImpl();
		return knotRole;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UnitOfTime createUnitOfTimeFromString(EDataType eDataType, String initialValue) {
		UnitOfTime result = UnitOfTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertUnitOfTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnchorPackage getAnchorPackage() {
		return (AnchorPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static AnchorPackage getPackage() {
		return AnchorPackage.eINSTANCE;
	}

} //AnchorFactoryImpl
