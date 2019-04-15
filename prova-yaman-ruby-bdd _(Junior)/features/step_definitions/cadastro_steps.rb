  Dado("eu acesse a página inicial do sistema") do
    @page_cadastro = CadastroPage.new
    @page_cadastro.acessarPaginaCadastro
  end
  
  Quando("eu preencher as informações {string}, {string} e {string}") do |string, string2, string3|
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Quando("finalizo o Cadastro") do
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Então("devo ver a mensagem {string}") do |string|
    pending # Write code here that turns the phrase above into concrete actions
  end