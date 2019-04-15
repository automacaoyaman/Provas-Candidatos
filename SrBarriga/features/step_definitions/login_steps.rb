

Dado("eu acesse a página de Login") do
  @page_login = LoginPage.new
  @page_login.acessarTelaLogin
end

Quando("eu preencho os campos com {string} e {string}") do |email, senha|
  @page_login.preencherCamposLogin(email, senha)
end

Quando("realizo o Login") do
  @page_login.clicarBotaoEntrar
end

Então("devo ver o texto {string}") do |validar_mensagemLoginSucesso|
    @home_page = HomePage.new
    expect(@home_page.validarMensagemLogin).to eql validar_mensagemLoginSucesso
end