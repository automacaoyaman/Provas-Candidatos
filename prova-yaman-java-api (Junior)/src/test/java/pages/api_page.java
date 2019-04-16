package pages;

import static org.junit.Assert.fail;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api_page {

	private JSONObject obj;
	int status;

	public void acessarUrl(String url) {
		RestAssured.baseURI = url;
	}

	public void validarRetorno(String rua, String cidade, String cep, String estado) {

	}

	public void chamadaApi() {

		// Chamada GET
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(RestAssured.baseURI);

		// Pega o status da chamada
		status = response.statusCode();
		if (status == 200) {


		} else {
			fail("Falha na chamada da API, retorno do status é: " + status);
		}

	}

}
