package br.sp.arodrigues.pages;

import org.openqa.selenium.By;

import br.sp.arodrigues.core.BasePage;

public class CadastroPage extends BasePage {
	
	public void setNome(String nome) {
		super.write("nome", nome);
	}
	
	public void setEmail(String email) {
		super.write("email", email);
	}
	
	public void setSenha(String senha) {
		super.write("senha", senha);
	}
	
	public void cadastrar() {
		super.click(By.xpath("//input[@type = 'submit' and @value = 'Cadastrar']"));
	}
	
	public String getAlertMessage() {
		return super.getText(By.xpath("//div[starts-with( @class, 'alert alert')]"));
	}
}