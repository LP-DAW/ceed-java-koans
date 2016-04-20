package beginner;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;


@RunWith(KoanRunner.class)
@SuppressWarnings("unused")
public class AboutCasting {

    @Koan
    public void longPlusInt() {
        /* (@_@) */
        /* (^_^) */
        int a = 6;
        long b = 10;
        Object c = a + b;
        assertEquals(c, __);
        assertEquals(c instanceof Integer, __);
        assertEquals(c instanceof Long, __);
    }

    @Koan
    public void forceIntTypecast() {
        /* (@_@) */
        /* (^_^) */
        long a = 2147483648L;
        // What happens if we force a long value into an int?
        int b = (int) a;
        assertEquals(b, __);
    }

    @Koan
    public void implicitTypecast() {
        /* (@_@) */
        /* (^_^) */
        int a = 1;
        int b = Integer.MAX_VALUE;
        long c = a + b; // still overflows int... which is the Integer.MIN_VALUE, the operation occurs prior to assignment to long
        assertEquals(c, __);
    }

    interface Sleepable {
        String sleep();
    }

    class Grandparent implements Sleepable {
        /* (@_@) */
        /* (^_^) */
        public String sleep() {
            return "zzzz";
        }
    }

    class Parent extends Grandparent {
        /* (@_@) */
        /* (^_^) */
        public String complain() {
            return "TPS reports don't even have a cover letter!";
        }
    }

    class Child extends Parent {
        /* (@_@) */
        /* (^_^) */
        public String complain() {
            return "Are we there yet!!";
        }
    }

    @Koan
    public void downCastWithInheritance() {
        /* (@_@) */
        /* (^_^) */
        Child child = new Child();
        Parent parentReference = child; // Why isn't there an explicit cast?
        assertEquals(child instanceof Child, __);
        assertEquals(parentReference instanceof Child, __);
        assertEquals(parentReference instanceof Parent, __);
        assertEquals(parentReference instanceof Grandparent, __);
    }

    @Koan
    public void downCastAndPolymorphism() {
        /* (@_@) */
        /* (^_^) */
        Child child = new Child();
        Parent parentReference = child;
        // If the result is unexpected, consider the difference between an instance and its reference
        assertEquals(parentReference.complain(), __);
    }

    @Koan
    public void upCastWithInheritance() {
        /* (@_@) */
        /* (^_^) */
        Grandparent child = new Child();
        Parent parentReference = (Parent) child; // Why do we need an explicit cast here?
        Child childReference = (Child) parentReference; // Or here?
        assertEquals(childReference instanceof Child, __);
        assertEquals(childReference instanceof Parent, __);
        assertEquals(childReference instanceof Grandparent, __);
    }

    @Koan
    public void upCastAndPolymorphism() {
        /* (@_@) */
        /* (^_^) */
        Grandparent child = new Child();
        Parent parent = (Child) child;
        // Think about the result. Did you expect that? Why?
        // How is that different from above?
        assertEquals(parent.complain(), __);
    }

    @Koan
    public void classCasting() {
        /* (@_@) */
        /* (^_^) */
        try {
            Object o = new Object();
            ((Sleepable) o).sleep(); // would this even compile without the cast?
        } catch (ClassCastException x) {
            fail("Object does not implement Sleepable, maybe one of the people classes do?");
        }
    }

    @Koan
    public void complicatedCast() {
        /* (@_@) */
        /* (^_^) */
        Grandparent parent = new Parent();
        // How can we access the parent's ability to "complain" - if the reference is held as a superclass?
        assertEquals("TPS reports don't even have a cover letter!", __);
    }

}
