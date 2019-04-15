package pages;

import io.restassured.RestAssured;

public class api_page {

	public void acessarUrl(String url) {
		RestAssured.baseURI = url;
	}

}
