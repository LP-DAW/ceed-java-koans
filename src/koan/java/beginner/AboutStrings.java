package beginner;


import java.text.MessageFormat;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

@RunWith(KoanRunner.class)
public class AboutStrings {

    @Koan
    public void implicitStrings() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("just a plain ole string".getClass(), __);
    }

    @Koan
    public void newString() {
        /* (@_@) */
        /* (^_^) */
        // very rarely if ever should Strings be created via new String() in
        // practice - generally it is redundant, and done repetitively can be slow
        String string = new String();
        String empty = "";
        assertEquals(string.equals(empty), __);
    }

    @Koan
    public void newStringIsRedundant() {
        /* (@_@) */
        /* (^_^) */
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(stringInstance.equals(stringReference), __);
    }

    @Koan
    public void newStringIsNotIdentical() {
        /* (@_@) */
        /* (^_^) */
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(stringInstance == stringReference, __);
    }

    @Koan
    public void stringIsEmpty() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("".isEmpty(), __);
        assertEquals("one".isEmpty(), __);
        assertEquals(new String().isEmpty(), __);
        assertEquals(new String("").isEmpty(), __);
        assertEquals(new String("one").isEmpty(), __);
    }

    @Koan
    public void stringLength() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("".length(), __);
        assertEquals("one".length(), __);
        assertEquals("the number is one".length(), __);
    }

    @Koan
    public void stringTrim() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("".trim(), __);
        assertEquals("one".trim(), "one");
        assertEquals(" one more time".trim(), __);
        assertEquals(" one more time         ".trim(), __);
        assertEquals(" and again\t".trim(), __);
        assertEquals("\t\t\twhat about now?\t".trim(), __);
    }

    @Koan
    public void stringConcatenation() {
        /* (@_@) */
        /* (^_^) */
        String one = "one";
        String space = " ";
        String two = "two";
        assertEquals(one + space + two, __);
        assertEquals(space + one + two, __);
        assertEquals(two + space + one, __);
    }

    @Koan
    public void stringUpperCase() {
        /* (@_@) */
        /* (^_^) */
        String str = "I am a number one!";
        assertEquals(str.toUpperCase(), __);
    }

    @Koan
    public void stringLowerCase() {
        /* (@_@) */
        /* (^_^) */
        String str = "I AM a number ONE!";
        assertEquals(str.toLowerCase(), __);
    }

    @Koan
    public void stringCompare() {
        /* (@_@) */
        /* (^_^) */
        String str = "I AM a number ONE!";
        assertEquals(str.compareTo("I AM a number ONE!") == 0, __);
        assertEquals(str.compareTo("I am a number one!") == 0, __);
        assertEquals(str.compareTo("I AM A NUMBER ONE!") == 0, __);
    }

    @Koan
    public void stringCompareIgnoreCase() {
        /* (@_@) */
        /* (^_^) */
        String str = "I AM a number ONE!";
        assertEquals(str.compareToIgnoreCase("I AM a number ONE!") == 0, __);
        assertEquals(str.compareToIgnoreCase("I am a number one!") == 0, __);
        assertEquals(str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0, __);
    }

    @Koan
    public void stringStartsWith() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("".startsWith("one"), __);
        assertEquals("one".startsWith("one"), __);
        assertEquals("one is the number".startsWith("one"), __);
        assertEquals("ONE is the number".startsWith("one"), __);
    }

    @Koan
    public void stringEndsWith() {
        /* (@_@) */
        /* (^_^) */
        assertEquals("".endsWith("one"), __);
        assertEquals("one".endsWith("one"), __);
        assertEquals("the number is one".endsWith("one"), __);
        assertEquals("the number is two".endsWith("one"), __);
        assertEquals("the number is One".endsWith("one"), __);
    }

    @Koan
    public void stringSubstring() {
        /* (@_@) */
        /* (^_^) */
        String str = "I AM a number ONE!";
        assertEquals(str.substring(0), __);
        assertEquals(str.substring(1), __);
        assertEquals(str.substring(5), __);
        assertEquals(str.substring(14, 17), __);
        assertEquals(str.substring(7, str.length()), __);
    }

    @Koan
    public void stringContains() {
        /* (@_@) */
        /* (^_^) */
        String str = "I AM a number ONE!";
        assertEquals(str.contains("one"), __);
        assertEquals(str.contains("ONE"), __);
    }

    @Koan
    public void stringReplace() {
        /* (@_@) */
        /* (^_^) */
        String str = "I am a number ONE!";
        assertEquals(str.replace("ONE", "TWO"), __);
        assertEquals(str.replace("I am", "She is"),  __);
    }

    @Koan
    public void stringBuilderCanActAsAMutableString() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(new StringBuilder("one").append(" ").append("two").toString(), __);
    }

    @Koan
    public void readableStringFormattingWithStringFormat() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(String.format("%s %s %s", "a", "b", "a"), __);
    }

    @Koan
    public void extraArgumentsToStringFormatGetIgnored() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(String.format("%s %s %s", "a", "b", "c", "d"), __);
    }

    @Koan
    public void insufficientArgumentsToStringFormatCausesAnError() {
        /* (@_@) */
        /* (^_^) */
        try {
            String.format("%s %s %s", "a", "b");
            fail("No Exception was thrown!");
        } catch (Exception e) {
            assertEquals(e.getClass(), __);
            assertEquals(e.getMessage(), __);
        }
    }

    @Koan
    public void readableStringFormattingWithMessageFormat() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(MessageFormat.format("{0} {1} {0}", "a", "b"), __);
    }

    @Koan
    public void extraArgumentsToMessageFormatGetIgnored() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(MessageFormat.format("{0} {1} {0}", "a", "b", "c"), __);
    }

    @Koan
    public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
        /* (@_@) */
        /* (^_^) */
        assertEquals(MessageFormat.format("{0} {1} {0}", "a"), __);
    }
}
