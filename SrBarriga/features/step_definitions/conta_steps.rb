
Dado("eu acesso tela de adicionar") do
    @nav = Nav.new
    @nav.acessarTelaAdicionarContas
end
  
Quando("eu preencho a conta com {string}") do |conta|
    @conta_page = ContaPage.new
    @conta_page.preencherCampoConta(conta)
end
  
Quando("finalizo a inclusão da conta") do
    @conta_page.clicarBotaoSalvar
end

Então("devo ver o texto de adição de conta {string}") do |validar_mensagemConta|
    @listar_page = ListarContaPage.new
    expect(@listar_page.validarMensagemAdicionarConta).to eql validar_mensagemConta
  end