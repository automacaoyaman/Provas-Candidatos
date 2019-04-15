package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.utils;

public class cadastro_page {

	WebDriver driver; 
	utils utils;
	
	public cadastro_page(WebDriver driver) {
		this.driver = driver;
		this.utils = new utils(driver);
	}

	// Elementos
	private static By campoNome = By.id("nome");
	private static By campoEmail = By.id("email");
	private static By campoSenha = By.id("senha");
	private static By btnCadastrar = By.xpath("//*[@type='submit']");
	private static By validaUsuarioCadastrado = By.xpath("");
	
	public void acessarUrlCadastro(String url) {
		this.driver.get(url);
	}

	public void preencherNome(String nome) {
		this.driver.findElement(campoNome).sendKeys(nome);
	}
	
	public void preencherEmail(String email) {
		this.driver.findElement(campoEmail).sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		this.driver.findElement(campoSenha).sendKeys(senha);
	}
	
	public void clicarBtnCadastrar() {
		this.driver.findElement(btnCadastrar).click();
	}
	
	public void validarMensagem(String mensagem) {
		assertTrue(this.utils.elementExist(By.xpath("//*[text()='" + mensagem + "']")));
	}
	
}