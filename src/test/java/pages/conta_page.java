package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class conta_page {
	WebDriver driver;
	
	public conta_page(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elementos
	private static String inp_nome      			= "nome";
		private static String inp_email 			= "email";
		private static String inp_senha 			= "senha";
		private static String btn_entrar 			= "//button[@class =\"btn btn-primary\"]";
		private static String msg_sucess			= "//div[@class = \"alert alert-success\"]";	
	//	private static String inp_contas         	 = não consegui xpath;
	//	private static String inp_adicionar          = não consegui xpath;

		public void acessarUrlCadastro() {
			String url = "https://srbarriga.herokuapp.com/cadastro";
			this.driver.get(url);}
		
		public void preencherEmail(String arg1) throws InterruptedException {
			this.driver.findElement(By.id(inp_email)).sendKeys(arg1);
		}
		
		public void preencherSenha(String arg1) throws InterruptedException {
			this.driver.findElement(By.id(inp_senha)).sendKeys(arg1);
		}
		
		public void clicarEntrar() throws InterruptedException {
			this.driver.findElement(By.xpath(btn_entrar)).click();
		}
		
		public void clicarEmContas() throws InterruptedException {
			this.driver.findElement(By.xpath()).click();
		}
		
		public void clicarEmAdicionar() throws InterruptedException {
			this.driver.findElement(By.xpath()).click();
		}
		
		public void preencherNome(String arg1) throws InterruptedException {
			this.driver.findElement(By.id(inp_nome)).sendKeys(arg1);
		}
		
		public void validarMensagemSucesso(String arg1) throws InterruptedException {
			String textoElement = this.driver.findElement(By.xpath(msg_sucess)).getText();
			assertEquals(arg1, textoElement);
		}
		
		
	
}
