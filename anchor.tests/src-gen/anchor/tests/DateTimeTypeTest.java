/**
 */
package anchor.tests;

import anchor.AnchorFactory;
import anchor.DateTimeType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Time Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTimeTypeTest extends DataTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DateTimeTypeTest.class);
    }

    /**
     * Constructs a new Date Time Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateTimeTypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Date Time Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DateTimeType getFixture() {
        return (DateTimeType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AnchorFactory.eINSTANCE.createDateTimeType());
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

} //DateTimeTypeTest
