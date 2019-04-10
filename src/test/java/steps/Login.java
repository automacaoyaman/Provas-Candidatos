package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Login {
	
	private WebDriver driver;
	
	@Dado("^que foi acessado o site \"([^\"]*)\"$")
	public void que_foi_acessado_o_site(String arg1) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Projeto_Provas\\Candidatos\\AlexandreAlves\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
	}

	@Quando("^inserir o email \"([^\"]*)\" e a \"([^\"]*)\" previamente cadastradas$")
	public void inserir_o_email_e_a_previamente_cadastradas(String arg1, String arg2) throws Exception {
		throw new PendingException();
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("senha")).sendKeys(arg2);
	}
	@Quando("^clicar em Entrar$")
	public void clicar_em_Entrar() throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
	
	}

	@Quando("^validar a mensagem \"([^\"]*)\"$")
	public void validar_a_mensagem(String arg1) throws Exception {
		driver.findElement(By.cssSelector("body > div.alert.alert-success")).getText(arg1);
		
		  
	}

	@Entao("^clicar em Sair e validar o logout$")
	public void clicar_em_Sair_e_validar_o_logout() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/a")).click();
		
		}
	   

}
