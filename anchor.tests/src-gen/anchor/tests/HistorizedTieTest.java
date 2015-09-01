/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.HistorizedTie;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Historized Tie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistorizedTieTest extends TestCase {

    /**
	 * The fixture for this Historized Tie test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected HistorizedTie fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(HistorizedTieTest.class);
	}

    /**
	 * Constructs a new Historized Tie test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HistorizedTieTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Historized Tie test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(HistorizedTie fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Historized Tie test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected HistorizedTie getFixture() {
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
		setFixture(AnchorFactory.eINSTANCE.createHistorizedTie());
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

} //HistorizedTieTest
