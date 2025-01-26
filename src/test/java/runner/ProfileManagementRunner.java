package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/ProfileManagement.feature",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/ProfileManagementTesting-reports"},
	    monochrome = true
	)
public class ProfileManagementRunner  extends AbstractTestNGCucumberTests {

}
