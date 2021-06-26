import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {


    @BeforeMethod
    public void setUp() {
        Reporter.log("Start set up");
    }

    @AfterMethod
    public void tearDown() {
        Reporter.log("Start tear down");
    }
}
