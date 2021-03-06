package beginner;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;


@RunWith(KoanRunner.class)
public class AboutBitwiseOperators {

    @Koan
    public void fullAnd() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        if (true & (++i < 8)) i = i + 1;
        assertEquals(i, __);
    }

    @Koan
    public void shortCircuitAnd() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        if (true && (i < -28)) i = i + 1;
        assertEquals(i, __);
    }

    @Koan
    public void aboutXOR() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        int a = 6;
        if ((a < 9) ^ false) i = i + 1;
        assertEquals(i, __);
    }

    @Koan
    public void dontMistakeEqualsForEqualsEquals() {
        /* (@_@) */
        /* (^_^) */
        int i = 1;
        boolean a = false;
        if (a = true) i++;
        assertEquals(a, __);
        assertEquals(i, __);
        // How could you write the condition 'with a twist' to avoid this trap?
    }

    @Koan
    public void aboutBitShiftingRightShift() {
        /* (@_@) */
        /* (^_^) */
        int rightShift = 8;
        rightShift = rightShift >> 1;
        assertEquals(rightShift, __);
    }

    @Koan
    public void aboutBitShiftingLeftShift() {
        /* (@_@) */
        /* (^_^) */
        int leftShift = 0x80000000; // Is this number positive or negative?
        leftShift = leftShift << 1;
        assertEquals(leftShift, __);
    }

    @Koan
    public void aboutBitShiftingRightUnsigned() {
        /* (@_@) */
        /* (^_^) */
        int rightShiftNegativeStaysNegative = 0x80000000;
        rightShiftNegativeStaysNegative = rightShiftNegativeStaysNegative >> 4;
        assertEquals(rightShiftNegativeStaysNegative, __);
        int unsignedRightShift = 0x80000000; // always fills with 0
        unsignedRightShift >>>= 4; // Just like +=
        assertEquals(unsignedRightShift, __);
    }
}
