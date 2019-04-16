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
		cadastroPage.acessarUrl(arg1);
	}

	@Quando("^inserir o \"([^\"]*)\", o \"([^\"]*)\" e a \"([^\"]*)\" valida$")
	public void inserir_o_o_e_a_valida(String arg1, String arg2, String arg3) throws Exception {

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
	public void inserir_o_e_a_previamente_cadastradas(String arg1, String arg2) throws Exception {

	}

	@Quando("^clicar em Entrar$")
	public void clicar_em_Entrar() throws Exception {

	}

	@Quando("^validar a mensagem \"([^\"]*)\"$")
	public void validar_a_mensagem(String arg1) throws Exception {

	}

	@Entao("^clicar em Sair e validar o logout$")
	public void clicar_em_Sair_e_validar_o_logout() throws Exception {

	}

	@Quando("^clicar no menu Contas e no submenu Adicionar$")
	public void clicar_no_menu_Contas_e_no_submenu_Adicionar() throws Exception {

	}

}
