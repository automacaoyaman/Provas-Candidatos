package br.sp.arodrigues.steps;

import static br.sp.arodrigues.core.DriverFactory.getDriver;
import static br.sp.arodrigues.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import br.sp.arodrigues.core.Properties;
import br.sp.arodrigues.pages.AdicionarContaPage;
import br.sp.arodrigues.pages.CadastroPage;
import br.sp.arodrigues.pages.LoginPage;
import br.sp.arodrigues.pages.MenuPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ProvaSteps {
	
	AdicionarContaPage contaPage = new AdicionarContaPage();
	CadastroPage cadastroPage = new CadastroPage();
	LoginPage loginPage = new LoginPage();
	MenuPage menuPage = new MenuPage();
	
	@Dado("^que acesso o site \"([^\"]*)\"$")
	public void queAcessoOSite(String site) throws Exception {
		getDriver().get(site);
	}

	@Quando("^insiro o nome \"([^\"]*)\"$")
	public void insiroONome(String nome) throws Exception {
		cadastroPage.setNome(nome);
	}

	@Quando("^insiro o email \"([^\"]*)\"$")
	public void insiroOEmail(String email) throws Exception {
		cadastroPage.setEmail(email);
	}

	@Quando("^insiro a senha \"([^\"]*)\"$")
	public void insiroASenha(String senha) throws Exception {
		cadastroPage.setSenha(senha);
	}

	@Quando("^clico em cadastrar$")
	public void clicoEmCadastrar() throws Exception {
		cadastroPage.cadastrar();
	}

	@Entao("^o sistema exibe a mensagem \"([^\"]*)\"$")
	public void oSistemaExibeAMensagem(String mensagem) throws Exception {
		Assert.assertEquals( mensagem, cadastroPage.getAlertMessage() );
//		Assert.assertEquals()
	}

	@Quando("^clico em Entrar$")
	public void clicoEmEntrar() throws Exception {
		loginPage.entrar();
	}

	@Quando("^clico em Sair$")
	public void clicoEmSair() throws Exception {
	    menuPage.sair();
	}

	@Entao("^o sistema exibe a tela de login$")
	public void oSistemaExibeATelaDeLogin() throws Exception {
		Assert.assertTrue( loginPage.entrarIsDisplayed() );
	}

	@Quando("^clico no menu Contas$")
	public void clicoNoMenuContas() throws Exception {
		menuPage.contas();
	}

	@Quando("^clico no submenu Adcionar$")
	public void clicoNoSubmenuAdcionar() throws Exception {
		menuPage.adicionar();
	}

	@Quando("^clico em Salvar$")
	public void clicoEmSalvar() throws Exception {
		contaPage.Salvar();
	}
	
	@After
	public void finaliza(Scenario cenario) {
		File file = ( (TakesScreenshot) getDriver() ).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile( file, new File("evidencias/"+ cenario.getName() + ".png"));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		if( Properties.CLOSES_BROWSER ) {
			killDriver();
		}
	}
}
