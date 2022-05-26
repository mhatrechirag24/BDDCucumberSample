package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "@target/faied_scenarios.txt",
		glue = {"stepDefs"},
		monochrome = true
		)


public class reRunner {

	

}
