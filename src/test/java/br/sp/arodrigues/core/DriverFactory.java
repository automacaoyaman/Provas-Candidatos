package br.sp.arodrigues.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {} // O construtor padrão da classe foi reescrita como private justamente para utilizar apenas os métodos estáticos
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		if( driver == null ) {
			switch(Properties.browser) { // Cada linha do switch case vai criar um WebDriver do navegador configurado conforme a classe Properties
				case CHROME: driver = new ChromeDriver(); break; 
				case FIREFOX: driver = new FirefoxDriver(); break;
				case INTERNET_EXPLORER: driver = new InternetExplorerDriver(); break;
				case OPERA: driver = new OperaDriver(); break;
			}
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void killDriver() {
		if( driver != null ) {
			driver.quit();
			driver = null;
		}
	}
}
