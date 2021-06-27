import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public abstract class BaseTest {


    @BeforeClass
    public void setUp() {
        Reporter.log("Start set up");
        System.out.println("Start set up");
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Start tear down");
        System.out.println("Stop set up");

    }
}
