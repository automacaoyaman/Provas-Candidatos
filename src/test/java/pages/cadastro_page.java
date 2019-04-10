package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

public class cadastro_page {

	WebDriver driver; 
	Logger logger;
	
	public cadastro_page(WebDriver driver) {
		this.driver = driver;
	}

	
	// Elementos
	private static String inp_nome      = "nome";
	

	public void acessarUrlCadastro() {
		String url = "https://srbarriga.herokuapp.com/cadastro";
		this.driver.get(url);
		
		@login

	    public void Cadastro() throws IOException {


	  // Abre a URL da aplicação e maximiza o browser para tela cheia.
			

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     
	     logger.info("cadastro");

	     logger.info("Acessa a URL: " + url );

	     driver.get("https://srbarriga.herokuapp.com/login");

	     driver.manage().window().maximize();

	      

	   // Aguarda a tela ser carregada


	      logger.info("Step 1 – Acessar o site: https://srbarriga.herokuapp.com/cadastro");

	      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
	      
	     
	  // Preenche o campo usuário, e-mail e senha e clica no botao cadastrar.
	     
	      logger.info("Step 2 – Insira um nome, um e-mail e uma senha;");
	      driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/label"));

	      driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]")).sendKeys("123@teste.com.br");

	      driver.findElement(By.xpath("//label[contains(text(),'Senha')]/following::input")).sendKeys("123456");
	      

	  // Validar a mensagem "Usuário inserido com sucesso"
	      
	      
	      logger.info("Step 3 – Clique no botão “Cadastrar” e validar texto “Usuário inserido com sucesso”. ");
	      
	      driver.findElement(By.xpath("//*[contains(text(),'Entrar')]")).click();
	      
          java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          
			try {
				
		  FileUtils.copyFile(src, new File("evidencias/"+ nomeArquivo + ".png"));
		  
			}catch (IOException e){
				
		  System.out.println(e.getMessage());
			  }

			
	  // Fecha o browser

			
	        logger.info("Step 6 -> Fechando o browser. ");

	        driver.close();

	    }
	
		
	}

	
}