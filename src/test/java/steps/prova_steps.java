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
		cadastroPage.acessarUrlCadastro();

	}

	@Quando("^inserir o \"([^\"]*)\", o \"([^\"]*)\" e a \"([^\"]*)\" valida$")
	public void clicar_na_aba_Novo_Usuario_e_inserir_o_o_e_a_valida(String arg1, String arg2, String arg3)
			throws Exception {
		cadastroPage.preencherNome(arg1);
		cadastroPage.preencherEmail(arg2);
		cadastroPage.preencherSenha(arg3);

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
		cadastroPage.preencherEmail(arg1);
		cadastroPage.preencherSenha(arg2);

	}

	@Quando("^clicar em Entrar$")
	public void clicar_em_Entrar() throws Exception {
		loginPage.clicarEntrar();

	}

	@Quando("^validar a mensagem \"([^\"]*)\"$")
	public void validar_a_mensagem(String arg1) throws Exception {
		loginPage.validarMensagemSucesso(arg1);
	}

	@Entao("^clicar em Sair e validar o logout$")
	public void clicar_em_Sair_e_validar_o_logout() throws Exception {
		loginPage.clicarSair();
		loginPage.validarUrl();
	}

	@Quando("^clicar no menu Contas e no submenu Adicionar$")
	public void clicar_no_menu_Contas_e_no_submenu_Adicionar() throws Exception {
		contaPage.clicarBtnContas();
		contaPage.clicarBtnAdicionar();

	}

	@Quando("^inserir um valor no campo \"([^\"]*)\" e clicar em Salvar$")
	public void inserir_um_valor_no_campo_e_clicar_em_Salvar(String arg1) throws Exception {
		contaPage.preencherConta(arg1);
		contaPage.ClicarSalvar(arg1);

	}

	@Entao("^validar a mensagem \"([^\"]*)\" e clicar em Sair$")
	public void validar_a_mensagem_e_clicar_em_Sair(String arg1) throws Exception {
		contaPage.validarMensagemSucesso(arg1);
		contaPage.validarMensagemErro(arg1);
	}
	
	@Dado("^que foi acessado um novo site \"([^\"]*)\"$")
	public void que_foi_acessado_um_novo_site(String arg1) throws Exception {
		loginPage.acessarUrlCadastro();
	}

}
