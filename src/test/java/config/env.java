package config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class env {
	static WebDriver driver = null;

	public static WebDriver CreateWebDriver(String browser) {

		return driver;
	}

	public static void screenShot(WebDriver driver, String nomeArquivo) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File("evidencias/" + nomeArquivo + ".png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

}
