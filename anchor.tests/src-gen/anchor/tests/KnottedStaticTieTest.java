/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.KnottedStaticTie;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Knotted Static Tie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnottedStaticTieTest extends KnottedTieTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(KnottedStaticTieTest.class);
    }

    /**
     * Constructs a new Knotted Static Tie test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KnottedStaticTieTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Knotted Static Tie test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected KnottedStaticTie getFixture() {
        return (KnottedStaticTie)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AnchorFactory.eINSTANCE.createKnottedStaticTie());
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

} //KnottedStaticTieTest
