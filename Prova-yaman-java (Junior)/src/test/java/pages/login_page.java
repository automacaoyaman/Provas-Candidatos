package pages;

import org.openqa.selenium.WebDriver;

public class login_page {

	WebDriver driver;

	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	// Elementos
	private static String inp_email 			= "email";
	private static String inp_senha 			= "senha";
	private static String btn_entrar 			= "//button[@class =\"btn btn-primary\"]";
	private static String msg_sucess			= "//div[@class = \"alert alert-success\"]";
	private static String msg_error 			= "//div[@class = \"alert alert-danger\"]";
	private static String set_email_invalido	= "null@yaman.com.br";
	private static String set_senha_invalida 	= "0000000000";
	private static String txt_msg_sucess 		= "Bem vindo, Yamano 18!";
	private static String txt_msg_error 		= "Problemas com o login do usuário";
	private static String urlIncial 			= "https://srbarriga.herokuapp.com/logar";

	
}