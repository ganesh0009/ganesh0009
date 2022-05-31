package AmazonRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/Amazonfeatures/customer.feature"},
		glue = {"StepDefination"},
		dryRun=true,
		monochrome=true,
		plugin = {"pretty","json:target/Myreports/report.json",
				"junit:target/Myreport/report.xml"},
		publish=true
		)

public class LoginTestRun {

}
