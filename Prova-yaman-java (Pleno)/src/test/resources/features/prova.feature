#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************

@cadastro
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando insiro nome e email e uma senha validos 
    Quando clico no botao Cadastrar
    Então  Valido o texto Usuario inserido com sucesso
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |yamano   |prova@yaman.com  |123456789   |Usuário inserido com sucesso|


Teste @Login
Funcionalidade: Login 
    Permite a realizacao de acesso ao site 
  
    Eu como usuario
    Quero me logar
    Para navegar na aplicacao

  Contexto: 
    Dado que estou no site na area de login

  
  Cenario: Acesso ao site
    Quando preencho os dados de login
    E clico no botao entrar
    Entao valido a mensagem Bem vindo, "yamano" !
    E clico em Sair
    Entao valido o logout

 
Esquema do Cenario: Conta
 
 #***************************************************Negativos*************************************************************************

@cadastro @negativo
Esquema do Cenario: Cadastro

@conta @negativo
Esquema do Cenario: Conta