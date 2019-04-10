package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {


private static WebDriver driver = new ChromeDriver();
	
	// Elementos
   private static String txtEmail = "email";
   private static String txtSenha = "senha";
   private static String btnCadastrar = "//input[@type='submit']";
   
   

	// Massa
	private static String set_email = "1234567@teste.com";
	private static String set_senha = "123456789";
	
	private static String msgBemVindo = "Bem vindo,";
	
	public static void acessarUrlLogin() {
		String url = "https://srbarriga.herokuapp.com/login";
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void preencherEmail() {
		driver.findElement(By.id(txtEmail)).sendKeys(set_email);
	}
	
	public static void preencherSenha() {
		driver.findElement(By.id(txtSenha)).sendKeys(set_senha);
	}
	public static void preencherFormularioLogin() {
		preencherEmail();
		preencherSenha();
	}
	
	public static void clicarEntrar() {
		driver.findElement(By.xpath(btnCadastrar)).click();
	}
	
	
	public static void validarTextoUsuario(String texto) throws InterruptedException {
		Thread.sleep(2000);
		String textoElement = driver.findElement(By.xpath(msg_sucesso)).getText();
		assertEquals(MsgSucesso, textoElement);
		driver.quit();
	}
   
		
}
	
	