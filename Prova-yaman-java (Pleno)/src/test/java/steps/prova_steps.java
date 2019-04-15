package steps;

import org.openqa.selenium.WebDriver;

import config.env;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.cadastro_page;
import pages.login_page;

public class prova_steps {

	private WebDriver driver = new env().CreateWebDriver(null);
	
	private cadastro_page telaCadastro = new cadastro_page(this.driver);
	private login_page telaLogin = new login_page(this.driver);
	
	@Dado("^que foi acessado o site \"(.*)\"$")
	public void que_foi_acessado_o_site(String url) throws Exception {
		telaCadastro.acessarUrlCadastro(url);
		env.screenShot(driver, "Cadastro_ScreenShot_1");
	}

	@Quando("^insiro um \"(.*)\" \"(.*)\" e uma \"(.*)\"$")
	public void insiro_um_e_uma(String nome, String email, String senha) throws Exception {
		telaCadastro.preencherNome(nome);
		telaCadastro.preencherEmail(email);
		telaCadastro.preencherSenha(senha);
		env.screenShot(driver, "Cadastro_ScreenShot_2");
	}

	@Entao("^clico em Cadastrar e valido a mensagem \"(.*)\"$")
	public void clico_em_Cadastrar_e_valido_a_mensagem(String mensagem) throws Exception {
		telaCadastro.clicarBtnCadastrar();
	    telaCadastro.validarMensagem(mensagem);
	    env.screenShot(driver, "Cadastro_ScreenShot_3");
	}
	
	@Quando("^insiro o \"(.*)\" e \"(.*)\" cadastrada anteriormente$")
	public void insiro_o_e_cadastrada_anteriormente(String email, String senha) throws Exception {
		telaLogin.preencherEmail(email);
		telaLogin.preencherSenha(senha);
		env.screenShot(driver, "Login_ScreenShot_1");
	}

	@Entao("^clico no botão Entrar$")
	public void clico_no_botão_Entrar() throws Exception {
	    telaLogin.clicarBtnEntrar();
	}

	@Entao("^valido o texto Bem vindo \"(.*)\"$")
	public void valido_o_texto_Bem_vindo(String nome) throws Exception {
	    telaLogin.validarLogin(nome);
	    env.screenShot(driver, "Login_ScreenShot_2");
	}
	
	@Entao("^clico em sair e valido o logout$")
	public void clico_em_sair_e_valido_o_logout() throws Exception {
	    telaLogin.clicarBtnSair();
	    telaLogin.validarLogout();
	    env.screenShot(driver, "Login_ScreenShot_3");
	}
	
	@After
	public void finalizarDriver() {
		driver.quit();
	}
	
}
