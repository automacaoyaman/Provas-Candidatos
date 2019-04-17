
#---------------------------------Cadastro---------------------------------------------------------------------

Dado("que eu acessso a home do site srbarriga") do
    @cadastro = SrBarrigaCadastro.new
    @cadastro.load()
end

Quando("eu preencher meus dados de cadastro") do
    @usuario = @cadastro.generate_user(5)
    @usuario_email = "#{@usuario}@#{@usuario}.com"
    @cadastro.nome_usuario.set(@usuario)
    @cadastro.email_usuario.set(@usuario_email)
    @cadastro.senha_usuario.set(@usuario)
end
  
Quando("clicar no botao cadastrar") do
   @cadastro.botao_cadastrar.click
end
  
Entao("Eu irei visualizar a mensagem {string}") do |msg_cadastro_sucesso|
   expect(@cadastro).to have_content(msg_cadastro_sucesso)
end


#---------------------------------Login-----------------------------------------------------------------------

Dado("que eu acesse a pagina de login") do
    @login = SrBarrigaLogin.new
    @login.load
  end
  
  Quando("eu preencher meus dados que acabei de cadastrar") do
    @login.email_usuario.set(@usuario)
  end
  
  Quando("clicar no botão entrar") do
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Entao("devo visualizar a mensagem de boas vindas com meu nome de usuario") do
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Quando("eu clicar no botão sair") do
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Entao("devo visualizar a mensagem de logout") do
    pending # Write code here that turns the phrase above into concrete actions
  end
#---------------------------------Conta-----------------------------------------------------------------------
