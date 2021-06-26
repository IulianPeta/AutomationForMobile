import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestCase extends BaseTest {

    @Test
    public void firstTestMethod() {
        Reporter.log("Start first test");
    }
}
