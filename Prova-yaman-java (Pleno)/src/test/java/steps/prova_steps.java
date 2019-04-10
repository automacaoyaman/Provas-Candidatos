package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.cadastro_page;

public class prova_steps extends cadastro_page  {


	@Dado("^que foi acessado o site \"([^\"]*)\"$")
	public void que_foi_acessado_o_site(String arg1) throws Exception {
		acessarUrlCadastro();
	}
	
	@Quando("^insiro nome e email e uma senha validos$")
	public void insiro_nome_e_email_e_uma_senha_validos() throws Throwable {
		preencherFormulario();
	}
	
	@Quando("^clico no botao Cadastrar$")
	public void clico_no_botao_Cadastrar() throws Throwable {
		clicarCadastrar();
	}
	
	@Entao("^Valido o texto Usuario inserido com sucesso$")
	public void Valido_o_texto_Usuario_inserido_com_sucesso() throws Throwable {
		validarTextoUsuario();
	}
	
}