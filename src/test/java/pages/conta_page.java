package pages;

import org.openqa.selenium.WebDriver;

public class conta_page {
	WebDriver driver;
	
	public conta_page(WebDriver driver) {
		this.driver = driver;
	}
	
	private static String menu_contas 			= "//*[@id=\"navbar\"]/ul/li[2]/a"; 
	private static String sub_adicionar 		= "//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a";
	private static String inp_nome       		= "nome";
	private static String btn_salvar       		= "//*button[class=\"btn btn-primary\"]";
	
	
	
	
	
}
