package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class conta_page {
	WebDriver driver;
	
	public conta_page(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elementos
	private static String inp_nome 			 = "nome";
	private static String btn_salvar 		 = "//button[@class =\"btn btn-primary\"]";
	private static String menu_conta         = "//*[@id=\"navbar\"]/ul/li[2]/a";
	private static String submenu_adicionar  = "//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a";
	private static String msg_sucess	     = "//div[@class = \"alert alert-success\"]";
	
	public void preencherNome(String arg1) throws InterruptedException {
		this.driver.findElement(By.id(inp_nome)).sendKeys(arg1);
	}
	
	public void clicarSalvar() throws InterruptedException {
		this.driver.findElement(By.xpath(btn_salvar)).click();
	}
	
	public void navegarAteAdicionar() throws InterruptedException {
		this.driver.findElement(By.xpath(menu_conta)).click();
		this.driver.findElement(By.xpath(submenu_adicionar)).click();
	}
	
	public void validarMensagemSucesso(String arg1) throws InterruptedException {
		String textoElement = this.driver.findElement(By.xpath(msg_sucess)).getText();
		assertEquals(arg1, textoElement);
	}
}
