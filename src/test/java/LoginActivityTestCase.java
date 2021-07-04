import actions.LoginActivityObject;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginActivityTestCase extends BaseTest {
    private static final String TEST_EMAIL = "iulian@gmail.com";
    private static final String TEST_PASSWORD = "123";

    private LoginActivityObject createLoginActivityObject() {
        return new LoginActivityObject(androidDriver);
    }

    @Test
    public void loginNavigatesYouToTheLoginSuccessActivity() {
        final LoginActivityObject loginActivityObject = createLoginActivityObject();
        loginActivityObject.setUserName(TEST_EMAIL);
        loginActivityObject.setPassword(TEST_PASSWORD);
        loginActivityObject.clickLoginButton();

        try {
            findLoginSuccessMessage();
        } catch (NoSuchElementException e) {
            Assert.fail("Could not find the element on the Login Success Activity.", e);
        }
    }

    private void findLoginSuccessMessage() {
        androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView");
    }

    @Test
    public void pressingCancelButtonLeavesFieldsUnchanged() {
        final LoginActivityObject loginActivityObject = createLoginActivityObject();
        loginActivityObject.setUserName(TEST_EMAIL);
        loginActivityObject.setPassword(TEST_PASSWORD);
        loginActivityObject.clickCancelButton();

        final SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginActivityObject.getUserName(), TEST_EMAIL, "Entered email should have remained unchanged.");
        softAssert.assertFalse(loginActivityObject.getPassword().isEmpty(), "Entered password should have remained unchanged.");
        softAssert.assertAll();
    }
}
