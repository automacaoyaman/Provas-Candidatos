package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

	WebDriver driver;

	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	// Elementos
	private static String btn_entrar 			= "//button[@class =\"btn btn-primary\"]";
	private static String msg_sucess			= "//div[@class = \"alert alert-success\"]";
	private static String urlIncial 			= "https://srbarriga.herokuapp.com/logout";
	private static String btn_sair			    = "Sair";
	private static String login                 = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a";
	
	public void acessarUrlCadastro() {
		String url = "https://srbarriga.herokuapp.com/login";
		this.driver.get(url);
	}
	
	public void clicarLogin() {
		this.driver.findElement(By.xpath(login)).click();
	}

	public void clicarEntrar() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_entrar)).click();
	}

	public void validarMensagemSucesso(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msg_sucess)).getText();
		assertEquals(arg1, textoElement);
	}
	
	public void clicarSair() throws InterruptedException {
		this.driver.findElement(By.linkText(btn_sair)).click();
	}
	
	public void validarUrl() throws InterruptedException {
		String urlHome = this.driver.getCurrentUrl();
		assertEquals(urlIncial, urlHome);
	}

}

	