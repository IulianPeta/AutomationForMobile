import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static final DesiredCapabilities desiredCapabilities = initDesiredCapabilities();

    private static DesiredCapabilities initDesiredCapabilities() {
        final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "path to app apk");
        desiredCapabilities.setCapability("appWaitActivity", "*");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "false");

        return desiredCapabilities;
    }

    protected AndroidDriver androidDriver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        Reporter.log("Start set up");
        System.out.println("Start set up");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void resetApp() {
        androidDriver.resetApp();
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Start tear down");
        System.out.println("Stop set up");

        androidDriver.quit();
    }
}
