package br.sp.arodrigues.pages;

import org.openqa.selenium.By;

import br.sp.arodrigues.core.BasePage;

public class AdicionarContaPage extends BasePage {
	
	public void setNome(String nome) {
		super.write("nome", nome);
	}
	
	public void Salvar() {
		super.click(By.xpath("//button[. = 'Salvar']"));
	}
}
