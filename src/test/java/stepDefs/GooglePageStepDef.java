package stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	

    WebDriver driver;
    @Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
	    
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Java Tutorial");
		searchbox.sendKeys(Keys.ENTER);
	   
	}
	@Then("should display Java result page")
	public void should_display_java_result_page() {
	    String strTitle = driver.getTitle();
	    Assert.assertEquals("Java Tutorial - Google Search", strTitle);
	}
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium Tutorial");
		searchbox.sendKeys(Keys.ENTER);
	   
	}
	@Then("should display Selenium result page")
	public void should_display_selenium_result_page() {
	    String strTitle = driver.getTitle();
	    Assert.assertEquals("Selenium Tutorial - Search ", strTitle);
	}
	@After
	public void attachScreenWithReport(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot)driver;
			File src= screen.getScreenshotAs(OutputType.FILE);
			byte[] imgByte = FileUtils.readFileToByteArray(src);
			scenario.attach(imgByte, "image/png", "image1");
			
			
		}
		
		
	}




}
