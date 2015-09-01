/**
 */
package anchor.tests;

import anchor.Anchor;
import anchor.AnchorFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnchorTest extends TestCase {

    /**
	 * The fixture for this Anchor test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Anchor fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(AnchorTest.class);
	}

    /**
	 * Constructs a new Anchor test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnchorTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Anchor test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(Anchor fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Anchor test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Anchor getFixture() {
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
		setFixture(AnchorFactory.eINSTANCE.createAnchor());
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

} //AnchorTest
