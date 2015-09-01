/**
 */
package anchor.util;

import anchor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see anchor.AnchorPackage
 * @generated
 */
public class AnchorSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static AnchorPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnchorSwitch() {
		if (modelPackage == null) {
			modelPackage = AnchorPackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnchorPackage.NAMED: {
				Named named = (Named)theEObject;
				T result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.TYPED: {
				Typed typed = (Typed)theEObject;
				T result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED: {
				Knotted knotted = (Knotted)theEObject;
				T result = caseKnotted(knotted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.HISTORIZED: {
				Historized historized = (Historized)theEObject;
				T result = caseHistorized(historized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseNamed(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseNamed(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOT: {
				Knot knot = (Knot)theEObject;
				T result = caseKnot(knot);
				if (result == null) result = caseNamed(knot);
				if (result == null) result = caseTyped(knot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseNamed(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.STATIC_ATTRIBUTE: {
				StaticAttribute staticAttribute = (StaticAttribute)theEObject;
				T result = caseStaticAttribute(staticAttribute);
				if (result == null) result = caseTyped(staticAttribute);
				if (result == null) result = caseAttribute(staticAttribute);
				if (result == null) result = caseNamed(staticAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.HISTORIZED_ATTRIBUTE: {
				HistorizedAttribute historizedAttribute = (HistorizedAttribute)theEObject;
				T result = caseHistorizedAttribute(historizedAttribute);
				if (result == null) result = caseHistorized(historizedAttribute);
				if (result == null) result = caseTyped(historizedAttribute);
				if (result == null) result = caseAttribute(historizedAttribute);
				if (result == null) result = caseNamed(historizedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_ATTRIBUTE: {
				KnottedAttribute knottedAttribute = (KnottedAttribute)theEObject;
				T result = caseKnottedAttribute(knottedAttribute);
				if (result == null) result = caseKnotted(knottedAttribute);
				if (result == null) result = caseAttribute(knottedAttribute);
				if (result == null) result = caseNamed(knottedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_STATIC_ATTRIBUTE: {
				KnottedStaticAttribute knottedStaticAttribute = (KnottedStaticAttribute)theEObject;
				T result = caseKnottedStaticAttribute(knottedStaticAttribute);
				if (result == null) result = caseKnottedAttribute(knottedStaticAttribute);
				if (result == null) result = caseKnotted(knottedStaticAttribute);
				if (result == null) result = caseAttribute(knottedStaticAttribute);
				if (result == null) result = caseNamed(knottedStaticAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_HISTORIZED_ATTRIBUTE: {
				KnottedHistorizedAttribute knottedHistorizedAttribute = (KnottedHistorizedAttribute)theEObject;
				T result = caseKnottedHistorizedAttribute(knottedHistorizedAttribute);
				if (result == null) result = caseHistorized(knottedHistorizedAttribute);
				if (result == null) result = caseKnottedAttribute(knottedHistorizedAttribute);
				if (result == null) result = caseKnotted(knottedHistorizedAttribute);
				if (result == null) result = caseAttribute(knottedHistorizedAttribute);
				if (result == null) result = caseNamed(knottedHistorizedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.TIE: {
				Tie tie = (Tie)theEObject;
				T result = caseTie(tie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.STATIC_TIE: {
				StaticTie staticTie = (StaticTie)theEObject;
				T result = caseStaticTie(staticTie);
				if (result == null) result = caseTie(staticTie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.HISTORIZED_TIE: {
				HistorizedTie historizedTie = (HistorizedTie)theEObject;
				T result = caseHistorizedTie(historizedTie);
				if (result == null) result = caseHistorized(historizedTie);
				if (result == null) result = caseTie(historizedTie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_TIE: {
				KnottedTie knottedTie = (KnottedTie)theEObject;
				T result = caseKnottedTie(knottedTie);
				if (result == null) result = caseTie(knottedTie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_STATIC_TIE: {
				KnottedStaticTie knottedStaticTie = (KnottedStaticTie)theEObject;
				T result = caseKnottedStaticTie(knottedStaticTie);
				if (result == null) result = caseKnottedTie(knottedStaticTie);
				if (result == null) result = caseTie(knottedStaticTie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOTTED_HISTORIZED_TIE: {
				KnottedHistorizedTie knottedHistorizedTie = (KnottedHistorizedTie)theEObject;
				T result = caseKnottedHistorizedTie(knottedHistorizedTie);
				if (result == null) result = caseHistorized(knottedHistorizedTie);
				if (result == null) result = caseKnottedTie(knottedHistorizedTie);
				if (result == null) result = caseTie(knottedHistorizedTie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.ANCHOR_ROLE: {
				AnchorRole anchorRole = (AnchorRole)theEObject;
				T result = caseAnchorRole(anchorRole);
				if (result == null) result = caseNamed(anchorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.KNOT_ROLE: {
				KnotRole knotRole = (KnotRole)theEObject;
				T result = caseKnotRole(knotRole);
				if (result == null) result = caseNamed(knotRole);
				if (result == null) result = caseKnotted(knotRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseNamed(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseDataType(stringType);
				if (result == null) result = caseNamed(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = caseDataType(numericType);
				if (result == null) result = caseNamed(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = caseDataType(booleanType);
				if (result == null) result = caseNamed(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnchorPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = caseDataType(dateTimeType);
				if (result == null) result = caseNamed(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNamed(Named object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTyped(Typed object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnotted(Knotted object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Historized</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHistorized(Historized object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModel(Model object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAnchor(Anchor object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knot</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnot(Knot object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAttribute(Attribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Static Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStaticAttribute(StaticAttribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Historized Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historized Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHistorizedAttribute(HistorizedAttribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedAttribute(KnottedAttribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Static Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Static Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedStaticAttribute(KnottedStaticAttribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Historized Attribute</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Historized Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedHistorizedAttribute(KnottedHistorizedAttribute object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTie(Tie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Static Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStaticTie(StaticTie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Historized Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historized Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHistorizedTie(HistorizedTie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedTie(KnottedTie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Static Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Static Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedStaticTie(KnottedStaticTie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knotted Historized Tie</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotted Historized Tie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnottedHistorizedTie(KnottedHistorizedTie object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAnchorRole(AnchorRole object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Knot Role</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knot Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKnotRole(KnotRole object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataType(DataType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStringType(StringType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNumericType(NumericType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBooleanType(BooleanType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDateTimeType(DateTimeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
    public T defaultCase(EObject object) {
		return null;
	}

} //AnchorSwitch
