package d3dCom;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty"},features="src/test/resources/", tags = {"@Case1"})


public class RunCukesTest {
}
