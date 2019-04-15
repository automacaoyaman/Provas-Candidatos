Before('@auth') do
    @page_login = LoginPage.new
    @home_page = HomePage.new
    @page_login.acessarTelaLogin
    @page_login.preencherCamposLogin("pedro.cruzyamanu@io.com", "pedro12")
    @page_login.clicarBotaoEntrar
    expect(@home_page.validarMensagemLogin).to eql "Bem vindo, Pedro Dias!"
end



After('@logout') do
    nav = Nav.new
    @page_login = LoginPage.new
    nav.Sair
    @page_login.validarLogout
end