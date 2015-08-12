/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.KnotRole;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Knot Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnotRoleTest extends TestCase {

    /**
     * The fixture for this Knot Role test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KnotRole fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(KnotRoleTest.class);
    }

    /**
     * Constructs a new Knot Role test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KnotRoleTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Knot Role test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(KnotRole fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Knot Role test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KnotRole getFixture() {
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
        setFixture(AnchorFactory.eINSTANCE.createKnotRole());
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

} //KnotRoleTest
