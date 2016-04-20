package beginner;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;


@RunWith(KoanRunner.class)
public class AboutMethodPreference {

    class A {
        public String doStuff(int i) {
            return "int";
        }

        public String doStuff(Integer i) {
            return "Integer";
        }

        public String doStuff(Object i) {
            return "Object";
        }

        public String doStuff(int... i) {
            return "int vararg";
        }
    }

    @Koan
    public void methodPreferenceInt() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(new A().doStuff(1), __);
    }

    @Koan
    public void methodPreferenceInteger() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(new A().doStuff(Integer.valueOf(1)), __);
    }

    @Koan
    public void methodPreferenceLong() {
        /* (@_@) */
        /* (^_^) */
        long l = 1;
        assertEquals(new A().doStuff(l), __);
    }

    @Koan
    public void methodPreferenceBoxedLong() {
        /* (@_@) */
        /* (^_^) */
        Long l = Long.valueOf(1);
        assertEquals(new A().doStuff(l), __);
    }

    @Koan
    public void methodPreferenceDouble() {
        /* (@_@) */
        /* (^_^) */
        Double l = Double.valueOf(1);
        assertEquals(new A().doStuff(l), __);
    }

    @Koan
    public void methodPreferenceMore() {
        /* (@_@) */
        /* (^_^) */
        // What happens if you change 'Integer' to 'Double'
        // Does this explain 'methodPreferenceDouble'?
        // Think about why this happens?
        assertEquals(new A().doStuff(1, Integer.valueOf(2)), __);
    }
}
