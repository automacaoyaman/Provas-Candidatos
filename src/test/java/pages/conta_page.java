package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class conta_page {
	WebDriver driver;
	login_page loginPage = new login_page(driver);

	public conta_page(WebDriver driver) {
		this.driver = driver;

	}

	// Elementos
	private static String btnConta = "//*[@id=\"navbar\"]/ul/li[2]/a";
	private static String btnAdicionar = "//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a";
	private static String nomeConta = "nome";
	private static String btnSalvar = "/html/body/div[2]/form/div[2]/button";
	private static String msgContaSuces = "/html/body/div[1]";
	private static String msgContaErro = "/html/body/div[1]";

	public void acessarUrl() throws InterruptedException {
		loginPage.acessarUrlCadastro();

	}

	public void clicarBtnContas() throws InterruptedException {
		this.driver.findElement(By.xpath(btnConta)).click();
	}

	public void clicarBtnAdicionar() {
		this.driver.findElement(By.xpath(btnAdicionar)).click();
	}

	public void preencherConta(String arg1) throws InterruptedException {
		this.driver.findElement(By.name(nomeConta)).sendKeys(arg1);
	}

	public void ClicarSalvar(String arg1) throws InterruptedException {
		this.driver.findElement(By.xpath(btnSalvar)).click();
	}

	public void validarMensagemSucesso(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msgContaSuces)).getText();
		assertEquals(arg1, textoElement);
	}

	public void validarMensagemErro(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msgContaErro)).getText();
		assertEquals(arg1, textoElement);
	}
}