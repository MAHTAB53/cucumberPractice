package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features ="src/test/java/Feature",
		glue = "StepDefinitions",
		tags = {"@Test2"}
		)

public class TsetRunner extends AbstractTestNGCucumberTests {

}
