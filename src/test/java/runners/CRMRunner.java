package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src//test//resources//TaggedFeature",
		glue = {"stepDefs"},
		monochrome=true,
		
		//tags = "@RegressionTest or @SmokeTest"
		//tags = "@RegressionTest and @SmokeTest"
		//tags = "@RegressionTest and not @SmokeTest"
		//tags = "@PhaseOne"
		//tags = "@PhaseOne and @RegressionTest or @PhaseOne and @SmokeTest"
				tags = "@PhaseOne and @RegressionTest"
		)

public class CRMRunner {

}
