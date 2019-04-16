package testeLeandro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testePratico {
	
	private WebDriver navegador;
	
	@Before
	public void inicializaPagina() {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
	}
	
	@After
	public void fechaNaveegador() {
		navegador.quit();
	}
	
	@Test
	public void cadastroNovoUsuario() {
		
		navegador.get("https://srbarriga.herokuapp.com/cadastro");
		navegador.findElement(By.id("nome")).sendKeys("Leandro Brito");
		navegador.findElement(By.id("email")).sendKeys("brito234@gmail.com");
		navegador.findElement(By.id("email")).sendKeys("senha1");
		navegador.findElement(By.xpath("/html/body/div[2]/form/input")).click();
		org.junit.Assert.assertEquals("Usuário inserido com sucesso", navegador.findElement(By.xpath("/html/body/div[1]")).getText());
		
	}
	
	@Test
	public void loginContaCadastrada() {
		
		navegador.get("https://srbarriga.herokuapp.com/login");
		navegador.findElement(By.id("email")).sendKeys("brito@gmail.com");
		navegador.findElement(By.id("senha")).sendKeys("senha1");
		navegador.findElement(By.xpath("/html/body/div[3]/form/button")).click();
		org.junit.Assert.assertEquals("Bem vindo, Leandro Brito!", navegador.findElement(By.xpath("/html/body/div[1]")).getText());
		navegador.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/a")).click();
	}
	
	@Test
	public void cadastroDeConta() {
		
		navegador.get("https://srbarriga.herokuapp.com/login");
		navegador.findElement(By.id("email")).sendKeys("brito@gmail.com");
		navegador.findElement(By.id("senha")).sendKeys("senha1");
		navegador.findElement(By.xpath("/html/body/div[3]/form/button")).click();
		navegador.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		navegador.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a")).click();
		navegador.findElement(By.id("nome")).sendKeys("Leandro23");
		navegador.findElement(By.xpath("/html/body/div[2]/form/div[2]/button")).click();
		org.junit.Assert.assertEquals("Conta adicionada com sucesso", navegador.findElement(By.xpath("/html/body/div[1]")).getText());
		navegador.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/a")).click();
		
		
	}
	
	@Test
	public void cenarioNegativo() {
		
		navegador.get("https://srbarriga.herokuapp.com/cadastro");
		navegador.findElement(By.id("nome")).sendKeys("Leandro Brito");
		navegador.findElement(By.id("email")).sendKeys("brito@gmail.com");
		navegador.findElement(By.id("email")).sendKeys("senha1");
		navegador.findElement(By.xpath("/html/body/div[2]/form/input")).click();
		org.junit.Assert.assertEquals("Endereço de email já utilizado", navegador.findElement(By.xpath("/html/body/div[1]")).getText());
		
	}
	
	

}
