package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src//test//resources//SampleFeatureFile//GooglePage.feature",
		glue = {"stepDefs"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/reports/htmlreport.html",
//				"usage:target/reports/UsageReport",
//				"json:target/reports/jsonReport.json",
//				"junit:target/reports/JunitReport.xml",
//				"rerun:target/faied_scenarios.txt"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class GooglePageRunner {

	

}
