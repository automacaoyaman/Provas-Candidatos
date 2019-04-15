package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.utils;

public class login_page {

	WebDriver driver;
	utils utils;

	public login_page(WebDriver driver) {
		this.driver = driver;
		this.utils = new utils(driver);
	}
	
	//Mapeamento dos elementos
	private static By campoEmail = By.id("email");
	private static By campoSenha = By.id("senha");
	private static By btnEntrar = By.xpath("//*[@type='submit']");
	private static By btnSair = By.xpath("//*[text()='Sair']");
	private static By btnLogin = By.xpath("//*[text()='Login']");
	
	//Método - Preenche com uma String o campo de email
	public void preencherEmail(String email) {
		this.driver.findElement(campoEmail).sendKeys(email);
	}
	
	//Método - Preenche com uma String o campo de senha
	public void preencherSenha(String senha) {
		this.driver.findElement(campoSenha).sendKeys(senha);
	}
	
	//Método - Clica no botão Entrar
	public void clicarBtnEntrar() {
		this.driver.findElement(btnEntrar).click();
	}
	
	//Método - Valida o login usando o Nome de usuário passado nos Exemplos
	public void validarLogin(String nome) {
		assertTrue(this.utils.elementExist(By.xpath("//*[text()='Bem vindo, " + nome + "!']")));
	}
	
	//Método - Clica no botão Sair
	public void clicarBtnSair() {
		this.driver.findElement(btnSair).click();
	}
	
	//Método - Valida o logout verificando se o Botão de Login se encontra ne tela
	public void validarLogout() {
		assertTrue(this.utils.elementExist(btnLogin));
	}
}