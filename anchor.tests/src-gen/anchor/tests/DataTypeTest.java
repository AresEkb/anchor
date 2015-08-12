/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.DataType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeTest extends TestCase {

    /**
     * The fixture for this Data Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DataTypeTest.class);
    }

    /**
     * Constructs a new Data Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Data Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(DataType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Data Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataType getFixture() {
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
        setFixture(AnchorFactory.eINSTANCE.createDataType());
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

} //DataTypeTest
