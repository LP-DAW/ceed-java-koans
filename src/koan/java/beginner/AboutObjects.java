package beginner;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;


@RunWith(KoanRunner.class)
public class AboutObjects {

    @Koan
    public void newObjectInstancesCanBeCreatedDirectly() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(new Object() instanceof Object, __);
    }

    @Koan
    public void allClassesInheritFromObject() {
        /* (@_@) */
        /* (^_^) */
        class Foo {
        }

        Class<?>[] ancestors = getAncestors(new Foo());
        assertEquals(ancestors[0], __);
        assertEquals(ancestors[1], __);
    }

    @Koan
    public void objectToString() {
        /* (@_@) */
        /* (^_^) */
        Object object = new Object();
        String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
        assertEquals(expectedToString, __); // hint: object.toString()
    }

    @Koan
    public void toStringConcatenates() {
        /* (@_@) */
        /* (^_^) */
        final String string = "ha";
        Object object = new Object() {
            @Override
            public String toString() {
                return string;
            }
        };
        assertEquals(string + object, __);
    }

    @Koan
    public void toStringIsTestedForNullWhenInvokedImplicitly() {
        /* (@_@) */
        /* (^_^) */
        String string = "string";
        Integer i = new Integer(128);
        Short s = new Short((short) 15);
        assertEquals(string + " " + i + " " + s, __);
    }

    private Class<?>[] getAncestors(Object object) {
        List<Class<?>> ancestors = new ArrayList<Class<?>>();
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            ancestors.add(clazz);
            clazz = clazz.getSuperclass();
        }
        return ancestors.toArray(new Class[]{});
    }

}
