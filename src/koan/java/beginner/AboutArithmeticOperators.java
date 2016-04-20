package beginner;


import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;



import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;



@RunWith(KoanRunner.class)
public class AboutArithmeticOperators {

    @Koan
    public void simpleOperations() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(1, __);
        assertEquals(1 + 1, __);
        assertEquals(2 + 3 * 4, __);
        assertEquals((2 + 3) * 4, __);
        assertEquals(2 * 3 + 4, __);
        assertEquals(2 - 3 + 4, __);
        assertEquals(2 + 4 / 2, __);
        assertEquals((2 + 4) / 2, __);
    }

    @Koan
    public void notSoSimpleOperations() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(1 / 2, __);
        assertEquals(3 / 2, __);
        assertEquals(1 % 2, __);
        assertEquals(3 % 2, __);
    }

    @Koan
    public void minusMinusVariableMinusMinus() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        assertEquals(--i, __);
        assertEquals(i, __);
        assertEquals(i--, __);
        assertEquals(i, __);
    }

    @Koan
    public void plusPlusVariablePlusPlus() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        assertEquals(++i, __);
        assertEquals(i, __);
        assertEquals(i++, __);
        assertEquals(i, __);
    }

    @Koan
    public void timesAndDivInPlace() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        i *= 2;
        assertEquals(i, __);
        i /= 2;
        assertEquals(i, __);
    }

}
