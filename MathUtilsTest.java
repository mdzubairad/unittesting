import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    private MathUtils MathUtils;

    @Before
    public void setUp() {
        MathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        MathUtils = null;
    }

    @Test
    public void testAdd() {
        int result = MathUtils.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = MathUtils.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = MathUtils.multiply(7, 2);
        assertEquals(14, result);
    }

    @Test
    public void testDivideByNonZero() {
        double result = MathUtils.divide(8, 2);
        assertEquals(4.0, result, 0.001); // 3rd argument is delta for double comparison
    }

    @Test
    public void testDivideByZero() {
        double result = MathUtils.divide(8, 0);
        assertEquals(-1.0, result, 0.001);
    }
}
