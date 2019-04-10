package pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cadastrodecontanegativo {

	WebDriver driver; 
	Logger logger;
	
	public Cadastrodecontanegativo(WebDriver driver) {
		this.driver = driver;
	}

	
	// Elementos
	private static String inp_nome      = "nome";
	

	public void acessarUrlCadastro() {
		String url = "https://srbarriga.herokuapp.com/cadastro";
		this.driver.get(url);
		
		@Test
		public void CadastroConta() throws IOException {


	 // Abre a URL da aplicação e maximiza o browser para tela cheia.
					

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    logger.info("cadastro");

	    logger.info("Acessa a URL:" + URL );
 
	    driver.get("https://srbarriga.herokuapp.com/login");

	    driver.manage().window().maximize();

			      

     // Aguarda a tela ser carregada


	    logger.info("Step 1 – Acessar o site: https://srbarriga.herokuapp.com/cadastro");

	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")));
			     
	 // Preenche o campo usuário, e-mail e senha e clica no botao cadastrar.
			     
	    logger.info("Step 2 – Inserir e-mail cadastrado e a senha cadastrada anteriormente;")));
	 
	    driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/label"));

	    driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]")).sendKeys("123@teste.com.br");

	    driver.findElement(By.xpath("//label[contains(text(),'Senha')]/following::input")).sendKeys("123456");

	 // Validar pagina incial
			      
		 logger.info("Step 3 – Clicar no botão “Entrar”; ");
		
		 driver.findElement(By.xpath("//*[contains(text(),'Entrar')]")).click();

	     File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			 
	     FileUtils.copyFile(src, new File("evidencias/"+ nomeArquivo + ".png"));
	     }catch (IOException e){
	    	 
		 System.out.println(e.getMessage());
		 
		 }

			       

	 // Aguardar a tela ser iniciada

	 // Clica no menu contas para o cadastro de uma nova conta.
			     

		 logger.info("Step 4 – Clicar no menu “Contas” em seguida no submenu “Adicionar");

	     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a");

	 // Ver a mensagem de confirmação do cadastro
			      
			       
	     logger.info("Step 5 – Inserir um valor no campo “Nome”");
	    
		 driver.findElement(By.id("nome").sendKeys("123");
			       
		 driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/button")).click();
			       
			       
	// Valida mensagem de "Conta adicionada" com o print da tela.
			        

	     logger.info("Step 6 – Clicar no botão “Salvar”;");
			        
	     logger.info("Step 11 – Validar texto “Já existe uma conta com esse nome!” e clicar em Sair; ");
	    
	     driver.findElement(By.xpath("//*[contains(text(),'Conta adicionada com sucesso!')]"));

	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	     FileUtils.copyFile(scrFile, new File("C:/Evidencias/Print_Cadastro.png"));
 
			       
     // Fechar o browser
			        

	     driver.close();

			    }
			
				
			}

			
		}
