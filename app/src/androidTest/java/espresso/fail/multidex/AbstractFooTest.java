package espresso.fail.multidex;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public abstract class AbstractFooTest {

    @Test
    public void testAbstractBar() {
        onView(withId(R.id.firebaseConfig)).check(matches(withText("get firebase config")));
    }

    @Test
    public void testAbstractBar2() {
        onView(withId(R.id.firebaseConfig)).check(matches(withText("get firebase config")));
    }
}
