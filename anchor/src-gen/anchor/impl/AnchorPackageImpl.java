/**
 */
package anchor.impl;

import anchor.Anchor;
import anchor.AnchorFactory;
import anchor.AnchorPackage;
import anchor.AnchorRole;
import anchor.Attribute;
import anchor.BooleanType;
import anchor.DataType;
import anchor.DateTimeType;
import anchor.Historized;
import anchor.HistorizedAttribute;
import anchor.HistorizedTie;
import anchor.Knot;
import anchor.KnotRole;
import anchor.Knotted;
import anchor.KnottedAttribute;
import anchor.KnottedHistorizedAttribute;
import anchor.KnottedHistorizedTie;
import anchor.KnottedStaticAttribute;
import anchor.KnottedStaticTie;
import anchor.KnottedTie;
import anchor.Model;
import anchor.Named;
import anchor.NumericType;
import anchor.StaticAttribute;
import anchor.StaticTie;
import anchor.StringType;
import anchor.Tie;
import anchor.Typed;
import anchor.UnitOfTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnchorPackageImpl extends EPackageImpl implements AnchorPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historizedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anchorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knotEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historizedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedStaticAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedHistorizedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticTieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historizedTieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedTieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedStaticTieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knottedHistorizedTieEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anchorRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knotRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTimeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum unitOfTimeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see anchor.AnchorPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AnchorPackageImpl() {
        super(eNS_URI, AnchorFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link AnchorPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AnchorPackage init() {
        if (isInited) return (AnchorPackage)EPackage.Registry.INSTANCE.getEPackage(AnchorPackage.eNS_URI);

        // Obtain or create and register package
        AnchorPackageImpl theAnchorPackage = (AnchorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnchorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnchorPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theAnchorPackage.createPackageContents();

        // Initialize created meta-data
        theAnchorPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAnchorPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AnchorPackage.eNS_URI, theAnchorPackage);
        return theAnchorPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamed() {
        return namedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamed_Name() {
        return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTyped() {
        return typedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTyped_Type() {
        return (EReference)typedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnotted() {
        return knottedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKnotted_Knot() {
        return (EReference)knottedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHistorized() {
        return historizedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHistorized_Resolution() {
        return (EAttribute)historizedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHistorized_ResolutionUnit() {
        return (EAttribute)historizedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModel() {
        return modelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Anchors() {
        return (EReference)modelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Knots() {
        return (EReference)modelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Ties() {
        return (EReference)modelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_DataTypes() {
        return (EReference)modelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnchor() {
        return anchorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnchor_Attributes() {
        return (EReference)anchorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnot() {
        return knotEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_Anchor() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticAttribute() {
        return staticAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHistorizedAttribute() {
        return historizedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedAttribute() {
        return knottedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedStaticAttribute() {
        return knottedStaticAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedHistorizedAttribute() {
        return knottedHistorizedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTie() {
        return tieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTie_AnchorRoles() {
        return (EReference)tieEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticTie() {
        return staticTieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHistorizedTie() {
        return historizedTieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedTie() {
        return knottedTieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKnottedTie_KnotRoles() {
        return (EReference)knottedTieEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedStaticTie() {
        return knottedStaticTieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnottedHistorizedTie() {
        return knottedHistorizedTieEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnchorRole() {
        return anchorRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnchorRole_Tie() {
        return (EReference)anchorRoleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnchorRole_Anchor() {
        return (EReference)anchorRoleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnchorRole_IsIdentifier() {
        return (EAttribute)anchorRoleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnotRole() {
        return knotRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKnotRole_Tie() {
        return (EReference)knotRoleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataType() {
        return dataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringType() {
        return stringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringType_Length() {
        return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringType_MinLength() {
        return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringType_MaxLength() {
        return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringType_Pattern() {
        return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericType() {
        return numericTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_MinInclusive() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_MinExclusive() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_MaxInclusive() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_MaxExclusive() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_TotalDigits() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericType_FractionDigits() {
        return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanType() {
        return booleanTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateTimeType() {
        return dateTimeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateTimeType_Resolution() {
        return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateTimeType_ResolutionUnit() {
        return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUnitOfTime() {
        return unitOfTimeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnchorFactory getAnchorFactory() {
        return (AnchorFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        namedEClass = createEClass(NAMED);
        createEAttribute(namedEClass, NAMED__NAME);

        typedEClass = createEClass(TYPED);
        createEReference(typedEClass, TYPED__TYPE);

        knottedEClass = createEClass(KNOTTED);
        createEReference(knottedEClass, KNOTTED__KNOT);

        historizedEClass = createEClass(HISTORIZED);
        createEAttribute(historizedEClass, HISTORIZED__RESOLUTION);
        createEAttribute(historizedEClass, HISTORIZED__RESOLUTION_UNIT);

        modelEClass = createEClass(MODEL);
        createEReference(modelEClass, MODEL__ANCHORS);
        createEReference(modelEClass, MODEL__KNOTS);
        createEReference(modelEClass, MODEL__TIES);
        createEReference(modelEClass, MODEL__DATA_TYPES);

        anchorEClass = createEClass(ANCHOR);
        createEReference(anchorEClass, ANCHOR__ATTRIBUTES);

        knotEClass = createEClass(KNOT);

        attributeEClass = createEClass(ATTRIBUTE);
        createEReference(attributeEClass, ATTRIBUTE__ANCHOR);

        staticAttributeEClass = createEClass(STATIC_ATTRIBUTE);

        historizedAttributeEClass = createEClass(HISTORIZED_ATTRIBUTE);

        knottedAttributeEClass = createEClass(KNOTTED_ATTRIBUTE);

        knottedStaticAttributeEClass = createEClass(KNOTTED_STATIC_ATTRIBUTE);

        knottedHistorizedAttributeEClass = createEClass(KNOTTED_HISTORIZED_ATTRIBUTE);

        tieEClass = createEClass(TIE);
        createEReference(tieEClass, TIE__ANCHOR_ROLES);

        staticTieEClass = createEClass(STATIC_TIE);

        historizedTieEClass = createEClass(HISTORIZED_TIE);

        knottedTieEClass = createEClass(KNOTTED_TIE);
        createEReference(knottedTieEClass, KNOTTED_TIE__KNOT_ROLES);

        knottedStaticTieEClass = createEClass(KNOTTED_STATIC_TIE);

        knottedHistorizedTieEClass = createEClass(KNOTTED_HISTORIZED_TIE);

        anchorRoleEClass = createEClass(ANCHOR_ROLE);
        createEReference(anchorRoleEClass, ANCHOR_ROLE__TIE);
        createEReference(anchorRoleEClass, ANCHOR_ROLE__ANCHOR);
        createEAttribute(anchorRoleEClass, ANCHOR_ROLE__IS_IDENTIFIER);

        knotRoleEClass = createEClass(KNOT_ROLE);
        createEReference(knotRoleEClass, KNOT_ROLE__TIE);

        dataTypeEClass = createEClass(DATA_TYPE);

        stringTypeEClass = createEClass(STRING_TYPE);
        createEAttribute(stringTypeEClass, STRING_TYPE__LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__MIN_LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__MAX_LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__PATTERN);

        numericTypeEClass = createEClass(NUMERIC_TYPE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MIN_INCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MIN_EXCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MAX_INCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MAX_EXCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__TOTAL_DIGITS);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__FRACTION_DIGITS);

        booleanTypeEClass = createEClass(BOOLEAN_TYPE);

        dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);
        createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__RESOLUTION);
        createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__RESOLUTION_UNIT);

        // Create enums
        unitOfTimeEEnum = createEEnum(UNIT_OF_TIME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        modelEClass.getESuperTypes().add(this.getNamed());
        anchorEClass.getESuperTypes().add(this.getNamed());
        knotEClass.getESuperTypes().add(this.getNamed());
        knotEClass.getESuperTypes().add(this.getTyped());
        attributeEClass.getESuperTypes().add(this.getNamed());
        staticAttributeEClass.getESuperTypes().add(this.getTyped());
        staticAttributeEClass.getESuperTypes().add(this.getAttribute());
        historizedAttributeEClass.getESuperTypes().add(this.getHistorized());
        historizedAttributeEClass.getESuperTypes().add(this.getTyped());
        historizedAttributeEClass.getESuperTypes().add(this.getAttribute());
        knottedAttributeEClass.getESuperTypes().add(this.getKnotted());
        knottedAttributeEClass.getESuperTypes().add(this.getAttribute());
        knottedStaticAttributeEClass.getESuperTypes().add(this.getKnottedAttribute());
        knottedHistorizedAttributeEClass.getESuperTypes().add(this.getHistorized());
        knottedHistorizedAttributeEClass.getESuperTypes().add(this.getKnottedAttribute());
        staticTieEClass.getESuperTypes().add(this.getTie());
        historizedTieEClass.getESuperTypes().add(this.getHistorized());
        historizedTieEClass.getESuperTypes().add(this.getTie());
        knottedTieEClass.getESuperTypes().add(this.getTie());
        knottedStaticTieEClass.getESuperTypes().add(this.getKnottedTie());
        knottedHistorizedTieEClass.getESuperTypes().add(this.getHistorized());
        knottedHistorizedTieEClass.getESuperTypes().add(this.getKnottedTie());
        anchorRoleEClass.getESuperTypes().add(this.getNamed());
        knotRoleEClass.getESuperTypes().add(this.getNamed());
        knotRoleEClass.getESuperTypes().add(this.getKnotted());
        dataTypeEClass.getESuperTypes().add(this.getNamed());
        stringTypeEClass.getESuperTypes().add(this.getDataType());
        numericTypeEClass.getESuperTypes().add(this.getDataType());
        booleanTypeEClass.getESuperTypes().add(this.getDataType());
        dateTimeTypeEClass.getESuperTypes().add(this.getDataType());

        // Initialize classes, features, and operations; add parameters
        initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTyped_Type(), this.getDataType(), null, "type", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(knottedEClass, Knotted.class, "Knotted", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKnotted_Knot(), this.getKnot(), null, "knot", null, 1, 1, Knotted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(historizedEClass, Historized.class, "Historized", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHistorized_Resolution(), ecorePackage.getEDouble(), "resolution", null, 1, 1, Historized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHistorized_ResolutionUnit(), this.getUnitOfTime(), "resolutionUnit", null, 1, 1, Historized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModel_Anchors(), this.getAnchor(), null, "anchors", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModel_Knots(), this.getKnot(), null, "knots", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModel_Ties(), this.getTie(), null, "ties", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModel_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnchor_Attributes(), this.getAttribute(), this.getAttribute_Anchor(), "attributes", null, 1, -1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(knotEClass, Knot.class, "Knot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttribute_Anchor(), this.getAnchor(), this.getAnchor_Attributes(), "anchor", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticAttributeEClass, StaticAttribute.class, "StaticAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(historizedAttributeEClass, HistorizedAttribute.class, "HistorizedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knottedAttributeEClass, KnottedAttribute.class, "KnottedAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knottedStaticAttributeEClass, KnottedStaticAttribute.class, "KnottedStaticAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knottedHistorizedAttributeEClass, KnottedHistorizedAttribute.class, "KnottedHistorizedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tieEClass, Tie.class, "Tie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTie_AnchorRoles(), this.getAnchorRole(), this.getAnchorRole_Tie(), "anchorRoles", null, 2, -1, Tie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticTieEClass, StaticTie.class, "StaticTie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(historizedTieEClass, HistorizedTie.class, "HistorizedTie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knottedTieEClass, KnottedTie.class, "KnottedTie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKnottedTie_KnotRoles(), this.getKnotRole(), this.getKnotRole_Tie(), "knotRoles", null, 1, -1, KnottedTie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(knottedStaticTieEClass, KnottedStaticTie.class, "KnottedStaticTie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knottedHistorizedTieEClass, KnottedHistorizedTie.class, "KnottedHistorizedTie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(anchorRoleEClass, AnchorRole.class, "AnchorRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnchorRole_Tie(), this.getTie(), this.getTie_AnchorRoles(), "tie", null, 1, 1, AnchorRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnchorRole_Anchor(), this.getAnchor(), null, "anchor", null, 1, 1, AnchorRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnchorRole_IsIdentifier(), ecorePackage.getEBoolean(), "isIdentifier", "false", 1, 1, AnchorRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(knotRoleEClass, KnotRole.class, "KnotRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKnotRole_Tie(), this.getKnottedTie(), this.getKnottedTie_KnotRoles(), "tie", null, 1, 1, KnotRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringType_Length(), ecorePackage.getEInt(), "length", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNumericType_MinInclusive(), ecorePackage.getEInt(), "minInclusive", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MinExclusive(), ecorePackage.getEInt(), "minExclusive", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MaxInclusive(), ecorePackage.getEInt(), "maxInclusive", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MaxExclusive(), ecorePackage.getEInt(), "maxExclusive", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_TotalDigits(), ecorePackage.getEInt(), "totalDigits", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_FractionDigits(), ecorePackage.getEInt(), "fractionDigits", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDateTimeType_Resolution(), ecorePackage.getEDouble(), "resolution", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDateTimeType_ResolutionUnit(), this.getUnitOfTime(), "resolutionUnit", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(unitOfTimeEEnum, UnitOfTime.class, "UnitOfTime");
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.MICROSECOND);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.MILLISECOND);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.SECOND);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.MINUTE);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.HOUR);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.DAY);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.WEEK);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.MONTH);
        addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.YEAR);

        // Create resource
        createResource(eNS_URI);
    }

} //AnchorPackageImpl
