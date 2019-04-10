package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Cadastro {

		private WebDriver driver;

		@Dado("^que foi acessado o site$")
		public void que_foi_acessado_o_site() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Projeto_Provas\\Candidatos\\AlexandreAlves\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://srbarriga.herokuapp.com/cadastro");
			
		}

		@Quando("^inserir o usuario \"([^\"]*)\" o \"([^\"]*)\" e a \"([^\"]*)\" valida$")
		public void inserir_o_usuario_o_e_a_valida(String nome, String email, String senha) throws Exception {
		   	driver.findElement(By.id("nome")).sendKeys(nome);
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("senha")).sendKeys(senha);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
		

		@Entao("^devo clicar em Cadastrar e validar a mensagem \"([^\"]*)\"$")
		public void devo_clicar_em_Cadastrar_e_validar_a_mensagem(String arg1) throws Exception {
			String mensagem = driver.findElement(By.cssSelector("body > div.alert.alert-success")).getText();
			assertEquals(arg1, mensagem);
			

		
	}

}
