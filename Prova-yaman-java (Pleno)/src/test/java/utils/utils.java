package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class utils {
	
	WebDriver driver; 
	
	public utils(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean elementExist(By by) {
		try {
			this.driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
