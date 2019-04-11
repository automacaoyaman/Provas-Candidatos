package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

	WebDriver driver;

	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	// Elementos
	private static String inp_email 			= "email";
	private static String inp_senha 			= "senha";
	private static String btn_entrar 			= "//button[@class =\"btn btn-primary\"]";
	private static String msg_sucess			= "//div[@class = \"alert alert-success\"]";
	private static String btn_sair    			= "//*[@id=\"navbar\"]/ul/li[5]/a";
//	private static String msg_error 			= "//div[@class = \"alert alert-danger\"]";
//	private static String set_email_invalido	= "null@yaman.com.br";
//	private static String set_senha_invalida 	= "0000000000";
//	private static String txt_msg_sucess 		= "Bem vindo, Yamano 18!";
//	private static String txt_msg_error 		= "Problemas com o login do usuário";
//	private static String urlIncial 			= "https://srbarriga.herokuapp.com/logar";
	
	public void preencherEmail(String arg1) throws InterruptedException {
		this.driver.findElement(By.id(inp_email)).sendKeys(arg1);
	}
	
	public void preencherSenha(String arg1) throws InterruptedException {
		this.driver.findElement(By.id(inp_senha)).sendKeys(arg1);
	}
	
	public void clicarEntrar() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_entrar)).click();
	}
	
	public void clicarSair() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_sair)).click();
	}
	
	public void validarMensagemSucesso(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msg_sucess)).getText();
		assertEquals(arg1, textoElement);
	}
	
	public void validarLogout() throws InterruptedException {
		assertTrue(this.driver.findElement(By.id(inp_email)).isDisplayed());
		assertTrue(this.driver.findElement(By.id(inp_senha)).isDisplayed());
		assertTrue(this.driver.findElement(By.xpath(btn_entrar)).isDisplayed());
	}

	
}