package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/registration.feature",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/Registrationcucumber-reports"},
	    monochrome = true
	)
public class RegistrationFeatureTestRunner extends AbstractTestNGCucumberTests{

}
