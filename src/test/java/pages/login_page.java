package pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class logar_page. {

	WebDriver driver; 
	Logger logger;
	
	}

	// Elementos
	private static String inp_nome      = "nome";
	

	public void acessarUrlCadastro() {
		String url = "https://srbarriga.herokuapp.com/cadastro";
		this.driver.get(url);
		
		@Test

	// Aguarda a tela ser carregada


       logger.info("Step 1 – Acessar o site: https://srbarriga.herokuapp.com/login");

       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
   
    // Preenche o campo e-mail e senha e clica no botao entrar.
   
       logger.info("Step 2 – Inserir e-mail cadastrado e a senha cadastrada anteriormente;");
       
       driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a"));
       
       driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]")).sendKeys("123@teste.com.br");
       
       driver.findElement(By.xpath("//label[contains(text(),'Senha')]/following::input")).sendKeys("123456");
    
    
    //Acessar a pagina inicial.
    
    
      logger.info("Step 3 – Clicar no botão “Entrar”;");
      
      driver.findElement(By.xpath("//*[contains(text(),'Entrar')]")).click();
    
 
    // Valida mensagem de "Bem vindo" com o print da tela.
    

       logger.info("Step 4 – Validar o texto “Bem vindo, +nomeInserido!”;");
       
       driver.findElement(By.xpath("//*[contains(text(),'Conta adicionada com sucesso!')]"));
       
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       FileUtils.copyFile(scrFile, new File("C:/Evidencias/Print_login.png"));


       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
		try {
			
		}
	   FileUtils.copyFile(src, new File("evidencias/"+ nomeArquivo + ".png"));
	   
		}catch (IOException e){
			
		  System.out.println(e.getMessage());
		  
    // Fazer o logout do site

	   logger.info("Step 5 – Clicar em Sair e validar logout.");
	   
       driver.findElement(By.id("logout")).click();
	        
	// Fecha o browser
	        
	   driver.close();
	
}