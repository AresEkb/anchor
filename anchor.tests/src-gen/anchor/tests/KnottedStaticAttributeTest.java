/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.KnottedStaticAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Knotted Static Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnottedStaticAttributeTest extends KnottedAttributeTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(KnottedStaticAttributeTest.class);
	}

    /**
	 * Constructs a new Knotted Static Attribute test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnottedStaticAttributeTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Knotted Static Attribute test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected KnottedStaticAttribute getFixture() {
		return (KnottedStaticAttribute)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(AnchorFactory.eINSTANCE.createKnottedStaticAttribute());
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
    @Override
    protected void tearDown() throws Exception {
		setFixture(null);
	}

} //KnottedStaticAttributeTest
