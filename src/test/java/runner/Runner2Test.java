package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = {"@1"}, 
		glue = "steps", 
		monochrome = true,
		dryRun=false)

public class Runner2Test {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpTest() {
		driver = new ChromeDriver();		
	}
	
	@AfterClass
	public static void tearDownTest() {
		driver.quit();
	}
	
	@Test
	public static void Teste() {
		
	}
}