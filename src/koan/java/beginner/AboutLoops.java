package beginner;


import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

@RunWith(KoanRunner.class)
public class AboutLoops {

    @Koan
    public void basicForLoop1() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void basicForLoop2() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = -5; i < 1; i++) {
            s += i + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void basicForLoop3() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 5; i > 0; i--) {
            s += i + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void basicForLoop4() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 0; i < 11; i += 2) {
            s += i + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void basicForLoop5() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 1; i <= 16; i *= 2) {
            s += i + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void basicForLoopWithTwoVariables1() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            s += i + " " + j + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void nestedLoops() {
        /* (@_@) */
        /* (^_^) */
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += "(" + i + ", " + j + ") ";
            }
            s += " - ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void extendedForLoop() {
        /* (@_@) */
        /* (^_^) */
        int[] is = {1, 2, 3, 4};
        String s = "";
        for (int j : is) {
            s += j + " ";
        }
        assertEquals(s, __);
    }

    @Koan
    public void whileLoop() {
        /* (@_@) */
        /* (^_^) */
        int result = 0;
        while (result < 3) {
            result++;
        }
        assertEquals(result, __);
    }

    @Koan
    public void doLoop() {
        /* (@_@) */
        /* (^_^) */
        int result = 0;
        do {
            result++;
        } while (false);
        assertEquals(result, __);
    }

    @Koan
    public void extendedForLoopBreak() {
        /* (@_@) */
        /* (^_^) */
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Cat".equals(current)) {
                break;
            }
            count++;
        }
        assertEquals(count, __);
    }

    @Koan
    public void extendedForLoopContinue() {
        /* (@_@) */
        /* (^_^) */
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Dog".equals(current)) {
                continue;
            } else {
                count++;
            }
        }
        assertEquals(count, __);
    }

    @Koan
    public void forLoopContinueLabel() {
        /* (@_@) */
        /* (^_^) */
        int count = 0;
        outerLabel:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                count++;
                if (count > 2) {
                    continue outerLabel;
                }
            }
            count += 10;
        }
        // What does continue with a label mean?
        // What gets executed? Where does the program flow continue?
        assertEquals(count, __);
    }

    @Koan
    public void forLoopBreakLabel() {
        /* (@_@) */
        /* (^_^) */
        int count = 0;
        outerLabel:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                if (count > 2) {
                    break outerLabel;
                }
            }
            count += 10;
        }
        // What does break with a label mean?
        // What gets executed? Where does the program flow continue?
        assertEquals(count, __);
    }
}
