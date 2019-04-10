package br.sp.arodrigues.pages;

import org.openqa.selenium.By;

import br.sp.arodrigues.core.BasePage;

public class LoginPage extends BasePage {
	
	public void setEmail(String email) {
		super.write("email", email);
	}
	
	public void setSenha(String senha) {
		super.write("senha", senha);
	}
	
	public void entrar() {
		super.click(By.xpath("//button[. = 'Entrar']"));
	}
	
	public boolean entrarIsDisplayed(){
		return super.elementIsDisplayed(By.xpath("//button[. = 'Entrar']"));
	}
}