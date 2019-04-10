package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cadastro_page {

	private static WebDriver driver = new ChromeDriver();
	
	// Elementos
	private static String txtNome = "nome";
	private static String txtEmail = "email";
	private static String txtSenha = "senha";
	private static String btnCadastrar = "//input[@type='submit']";
	private static String msg_sucesso = "//div[@role='alert' and text()='Usuário inserido com sucesso']";
	
	// Massa
	private static String set_nome   = "yamano";
	private static String set_email  = "1234567@teste.com";
	private static String set_senha   = "123456789";
	
	private static String MsgSucesso = "Usuário inserido com sucesso";

	public static void acessarUrlCadastro() {
		driver = new ChromeDriver();
		String url = "https://srbarriga.herokuapp.com/cadastro";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void preencherFormulario() throws InterruptedException {
		preencherNome();
		preencherEmail();
		preencherSenha();
	}
	
    public void preencherNome() throws InterruptedException {   	
    	Thread.sleep(1000);
		driver.findElement(By.id(txtNome)).sendKeys(set_nome);
    }
    public void preencherEmail() throws InterruptedException {
    	Thread.sleep(1000);
    	driver.findElement(By.id(txtEmail)).sendKeys(set_email);
    }
    
    public static void preencherSenha() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id(txtSenha)).sendKeys(set_senha);
	}
    public static void clicarCadastrar() throws InterruptedException {
		driver.findElement(By.xpath(btnCadastrar)).click();
		Thread.sleep(1000);
	} 
    public static void validarTextoUsuario() throws InterruptedException {
		Thread.sleep(2000);
		String textoElement = driver.findElement(By.xpath(msg_sucesso)).getText();
		assertEquals(MsgSucesso, textoElement);
		driver.quit();
	}
   
    

	
}