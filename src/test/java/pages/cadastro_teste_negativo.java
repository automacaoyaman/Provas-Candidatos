package pages;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class cadastro_teste_negativo {

	WebDriver driver; 
	Logger logger;
	
	public cadastro_teste_negativo(WebDriver driver) {
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

	     logger.info("Acessa a URL: " + URL );

	     driver.get("https://srbarriga.herokuapp.com/login");

	     driver.manage().window().maximize();

	      

	   // Aguarda a tela ser carregada


	      logger.info("Step 1 – Acessar o site: https://srbarriga.herokuapp.com/cadastro");

	      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/div/div[1]/a")));
	      
	     
	  // Preenche o campo usuário, e-mail e senha e clica no botao logar.
	     
	      logger.info("Step 2 – Insira um nome, um e-mail e uma senha já cadastrados");
	      	
	      driver.findElement(By.id("nome")).sendkeys("123");
	      
	      driver.findElement(By.id("email")).sendKeys("123@teste.com.br");
	      
	      driver.findElement(By.id("senha")).sendKeys("123456");
	      

	  // Validar a mensagem "Endereço de email já utilizado"
	      
	      
	      logger.info("Step 3 – Clique no botão “Cadastrar” e validar texto “Endereço de email já utilizado”");
	      
	      driver.findElement(By.xpath("/html/body/div[2]/form/input").click();
	      
          File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          
			try {
				
		  FileUtils.copyFile(src, new File("evidencias/"+ nomeArquivo + ".png"));
		  
			}catch (IOException e){
				
		  System.out.println(e.getMessage());
			  }

			
	  // Fecha o browser


	        driver.close();

	    }
	
		
	}

	
}