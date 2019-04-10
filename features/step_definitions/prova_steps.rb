
#---------------------------------Cadastro---------------------------------------------------------------------

Dado("que foi acessado o site {string}") do |site|
  Cadastropage.load
  Cadastropage.preencher_nome
  sleep(5)
end

Então("usuario cadastrado com sucesso") do
    @texto = find('#notice')
    expect(@texto.text).to eql 'Usuário Criado com sucesso'
end 

#---------------------------------Login-----------------------------------------------------------------------
Quando ("acesso o login cadastrado") do 
   LoginPage.load
   login.prencher_login
   sleep(5)
end 
#---------------------------------Conta-----------------------------------------------------------------------
Então ("login acessado com sucesso")

end