package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.cadastro_page;
import pages.conta_page;
import pages.login_page;

public class prova_steps {

	WebDriver driver = config.env.CreateWebDriver("chrome");
	login_page loginPage = new login_page(driver);
	cadastro_page cadastroPage = new cadastro_page(driver);
	conta_page contaPage = new conta_page(driver);

	@Dado("^que foi acessado o site \"([^\"]*)\"$")
	public void que_foi_acessado_o_site(String arg1) throws Exception {
		
	}

	@Quando("^inserir o \"([^\"]*)\", o \"([^\"]*)\" e a \"([^\"]*)\" valida$")
	public void clicar_na_aba_Novo_Usuario_e_inserir_o_o_e_a_valida(String arg1, String arg2, String arg3)
			throws Exception {

	}

	@Entao("^devo clicar em Cadastrar e validar a mensagem \"([^\"]*)\"$")
	public void devo_clicar_em_Cadastrar_e_validar_a_mensagem(String arg1) throws Exception {
		cadastroPage.clicarCadastrar();
		cadastroPage.validarMensagemSucesso(arg1);
		config.env.screenShot(driver, "evidencia1");

	}

	@Entao("^devo clicar em Cadastrar e validar a mensagem de erro \"([^\"]*)\"$")
	public void devo_clicar_em_Cadastrar_e_validar_a_mensagem_de_erro(String arg1) throws Exception {
		cadastroPage.clicarCadastrar();
		cadastroPage.validarMensagemErro(arg1);
		config.env.screenShot(driver, "evidencia2");

	}

	@Quando("^inserir o \"([^\"]*)\" e a \"([^\"]*)\" previamente cadastradas$")
	public void clicar_na_aba_Login_e_inserir_o_e_a_previamente_cadastradas(String arg1, String arg2) throws Exception {
		loginPage.acessarUrlLogin();
		loginPage.preencherFormularioLogin(arg1, arg2);
		
		
	}

	@Quando("^clicar em Entrar$")
	public void clicar_em_Entrar() throws Exception {
		loginPage.clicarEntrar();

	}

	@Quando("^validar a mensagem \"([^\"]*)\"$")
	public void validar_a_mensagem(String arg1) throws Exception {
		loginPage.validarMensagemSucessoLogin(arg1);

	}

	@Entao("^clicar em Sair e validar o logout$")
	public void clicar_em_Sair_e_validar_o_logout() throws Exception {
		loginPage.clicarSair();

	}

	@Dado("^que estou logada no sistema com \"([^\"]*)\" e \"([^\"]*)\"$")
	public void que_estou_logada_no_sistema_com_e(String arg1, String arg2) throws Exception {
		loginPage.acessarUrlLogin();
		loginPage.preencherFormularioLogin(arg1, arg2);
		loginPage.clicarEntrar(); 
	 
	}

	@Dado("^clico no menu contras e submenu Adicionar$")
	public void clico_no_menu_contras_e_submenu_Adicionar() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Quando("^insero um valor no campo \"([^\"]*)\" e clico no botao Salvar$")
	public void insero_um_valor_no_campo_e_clico_no_botao_Salvar(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Entao("^valido a \"([^\"]*)\" e clico no botao Sair$")
	public void valido_a_e_clico_no_botao_Sair(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

		
		
}
