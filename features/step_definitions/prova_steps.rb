
#---------------------------------Cadastro---------------------------------------------------------------------

Dado("que foi acessado o site {string}") do |site|
    @@cadastroPage = CadastroPage.new
    @@cadastroPage.configurar_ambiente(site)
end

Quando("insiro os dados {string} {string} {string}") do |nome, email, senha|
    cadastro_page.Login
  end
  
Quando("clico no botão cadastrar") do
    find( :xpath, '/html/body/div[2]/form/button').click
end
  
Então("o sistema retorna {string}") do |mensagem|
   assert_text ('mensagem')
end

#---------------------------------Login-----------------------------------------------------------------------

#---------------------------------Conta-----------------------------------------------------------------------
