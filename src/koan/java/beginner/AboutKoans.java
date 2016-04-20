package beginner;


import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;


@RunWith(KoanRunner.class)
public class AboutKoans {

    @Koan
    public void findAboutKoansFile() {   
        // Hello, I'm a koan. I'm a piece of code, piece of wisdom,
        // which you learn JAVA with. Every koan is a small task to solve.
        // To solve it is to make it pass, or not to fail.
        /* (@_@) */
        /* (^_^) */
        fail("delete this line or a koan will fail");
    }

    @Koan
    public void definitionOfKoanCompletion() {
        /* (@_@) */
        /* (^_^) */
        boolean koanIsComplete = false;
        if (!koanIsComplete) {
            fail("what if koanIsComplete variable was true?");
        }
    }

}
