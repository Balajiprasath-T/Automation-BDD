package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/NavigatingHealthPrograms.feature",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/HealthPrograms-reports"},
	    monochrome = true
	)
public class HealthProgramsRunner  extends AbstractTestNGCucumberTests {

}
