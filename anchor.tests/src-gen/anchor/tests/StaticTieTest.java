/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.StaticTie;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Tie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticTieTest extends TieTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(StaticTieTest.class);
    }

    /**
     * Constructs a new Static Tie test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticTieTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Static Tie test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected StaticTie getFixture() {
        return (StaticTie)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AnchorFactory.eINSTANCE.createStaticTie());
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

} //StaticTieTest
