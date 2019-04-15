
  Dado("eu acesse a tela de cadastro do site") do   
    @page_novousuario = NovoUsuarioPage.new
    @page_novousuario.acessarTelaCadastro                   
  end                                                                                               
                                                                                                    
  Quando("eu preencher as informações {string}, {string} e {string}") do |nome, email, senha| 
    @page_login = LoginPage.new
    @page_novousuario.preencherCamposCadastro(nome,email,senha)                 
  end                                                                                               
                                                                                                    
  Quando("finalizo o Cadastro") do                                                                  
    @page_novousuario.clicarBotaoCadastrar                     
  end                                                                                               
                                                                                                    
  Então("devo ver a mensagem {string}") do |mensagem_CadastroSucesso|                                                 
    expect(@page_login.validarMensagemCadastro).to eql mensagem_CadastroSucesso                   
  end                                                                                               