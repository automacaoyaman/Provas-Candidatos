package steps;

import cucumber.api.java.pt.Dado;
import pages.api_page;

/**
 * Unit test for simple App.
 */
public class api_steps {

	api_page apiPage = new api_page();

	@Dado("^que foi realizada a conexao \"([^\"]*)\"$")
	public void que_foi_realizada_a_conexao(String arg1) throws Exception {

	}

}
