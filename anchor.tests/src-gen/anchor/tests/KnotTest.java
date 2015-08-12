/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.Knot;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Knot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnotTest extends TestCase {

    /**
     * The fixture for this Knot test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Knot fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(KnotTest.class);
    }

    /**
     * Constructs a new Knot test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KnotTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Knot test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Knot fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Knot test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Knot getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AnchorFactory.eINSTANCE.createKnot());
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

} //KnotTest
