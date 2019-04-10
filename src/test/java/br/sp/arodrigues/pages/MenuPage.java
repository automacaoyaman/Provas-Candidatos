package br.sp.arodrigues.pages;

import br.sp.arodrigues.core.BasePage;

public class MenuPage extends BasePage{
	
	public void sair() {
		super.linkTextClick("Sair");
	}
	
	public void contas() {
		super.partialLinkTextClick("Contas");
	}
	
	public void adicionar() {
		super.linkTextClick("Adicionar");
	}
}
