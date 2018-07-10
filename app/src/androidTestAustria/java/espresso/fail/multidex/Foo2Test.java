package espresso.fail.multidex;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Foo2Test extends AbstractFooTest {
    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

//    @Test
//    @Override
//    public void testAbstractBar() {
//        super.testAbstractBar();
//    }
//
//    @Test
//    @Override
//    public void testAbstractBar2() {
//        super.testAbstractBar2();
//    }

//    @Test
//    public void testCrashApp() {
//        mMainActivityTestRule.getActivity().makeItCrash();
//
//    }

    @Test
    public void testBar2() {
        onView(withId(R.id.firebaseConfig)).check(matches(withText("get firebase config")));
    }

}
