package br.sp.arodrigues.core;

import static br.sp.arodrigues.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	/********** Basic Functions **********/
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public void linkTextClick(String linkText) {
		getDriver().findElement(By.linkText(linkText)).click();
	}
	
	public void partialLinkTextClick(String linkText) {
		getDriver().findElement(By.partialLinkText(linkText)).click();
	}
	
	public void click(String id) {
		this.click(By.id(id));
	}
	
	public void write(By by, String text) {
		WebElement element = getDriver().findElement(by);
		element.clear();
		element.sendKeys(text);
	}
	
	public void write(String id, String text) {
		this.write(By.id(id), text);
	}
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String getText(String id) {
		return this.getText(By.id(id));
	}
	
	public String getValue(By by) {
		return getDriver().findElement(by).getAttribute("value");
	}
	
	public String getValue(String id) {
		return this.getValue(By.id(id));
	}
	
	public boolean elementIsDisplayed(By by) {
		return getDriver().findElement(by).isDisplayed();
	}
	
	public boolean elementIsDisplayed(String id) {
		return this.elementIsDisplayed(By.id(id));
	}
	
}
