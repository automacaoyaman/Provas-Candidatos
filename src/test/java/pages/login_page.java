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
	private static String inp_email 			= "email";
	private static String inp_senha 			= "senha";
	private static String btn_entrar 			= "//button[@class =\"btn btn-primary\"]";
	private static String msg_sucess			= "//div[@class = \"alert alert-success\"]";
	private static String msg_error 			= "//div[@class = \"alert alert-danger\"]";
	private static String set_email_invalido	= "null@yaman.com.br";
	private static String set_senha_invalida 	= "0000000000";
	private static String txt_msg_sucess 		= "Bem vindo, yamano!";
	private static String txt_msg_error 		= "Problemas com o login do usuário";
	private static String urlIncial 			= "https://srbarriga.herokuapp.com/logar";
	private static String btn_sair              = "//*[@id=\"navbar\"]/ul/li[5]/a";


	public void acessarUrlLogin() {
		String url = "https://srbarriga.herokuapp.com/login";
		this.driver.get(url);
	}
	
	public void preencherEmailLogin(String arg1) throws InterruptedException {
		this.driver.findElement(By.id(inp_email)).sendKeys(arg1);
	}
	
	public void preencherSenhaLogin(String arg1) throws InterruptedException {
		this.driver.findElement(By.id(inp_senha)).sendKeys(arg1);
	}

	public void preencherFormularioLogin(String email, String senha) throws InterruptedException {
		preencherEmailLogin(email);
		preencherSenhaLogin(senha);
	}
	public void clicarEntrar() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_entrar)).click();
	}
	public void validarMensagemSucessoLogin(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msg_sucess)).getText();
		assertEquals(arg1, textoElement);
	}
	public void validarMensagemErroLogin(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(txt_msg_error)).getText();
		assertEquals(arg1, textoElement);
	}
	public void clicarSair() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_sair)).click();
	}
	
}