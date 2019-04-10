package br.sp.arodrigues.runners;

import static br.sp.arodrigues.core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = {""}, 
		plugin = {"pretty", "html:target/testReportAllanWesley" },
		snippets = SnippetType.CAMELCASE,
		glue = "br.sp.arodrigues.steps",
		monochrome = true,
		dryRun = false
		)

public class RunnerTest {
	@AfterClass
	public static void fechaTodosOsNavegadores() {
		killDriver();
	}
}