import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class teste_pagina {
	
	private WebDriver navegador;
	
	@Before
	public void inicializaPagina() {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.get("https://srbarriga.herokuapp.com/cadastro");
		navegador.manage().window().maximize();
	}
	
	@After
	public void fechaNaveegador() {
		navegador.quit();
	}
	
	@Test
	public void cadastro() {
		
		navegador.findElement(By.id("nome")).sendKeys("Leandro Brito");
		navegador.findElement(By.id("email")).sendKeys("l.brito004@gmail.com");
		navegador.findElement(By.id("email")).sendKeys("senha1");
		navegador.findElement(By.xpath("/html/body/div[2]/form/input")).click();
		
	}

}
