#language: pt
# encoding: utf-8
Funcionalidade: Prova Yaman Java BDD

#***************************************************Positivos*************************************************************************
@cadastro @positivo
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>" o "<email>" e a "<senha>" valida
    Entao devo clicar em Cadastrar e validar a mensagem "<mensagem>"
    Exemplos:
        |site                                            |nome     |email             |senha       |mensagem                     |
        |https://srbarriga.herokuapp.com/cadastro        |yamano   |prova9@yaman.com  |123456789   |Usuário inserido com sucesso|

@login @positivo
Esquema do Cenario: Login
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar 
    E validar a mensagem "<mensagem>"
    Entao clicar em Sair e validar o logout
    Exemplos:
        |site                                          |email            |senha       |mensagem          |
        |https://srbarriga.herokuapp.com/login         |prova9@yaman.com |123456789   |Bem vindo, yamano!|

@conta @positivo @tati
Esquema do Cenario: Conta
    Dado que estou logada no sistema com "<email>" e "<senha>" 
  	E clico no menu contras e submenu Adicionar
    Quando insero um valor no campo "<nome>" e clico no botao Salvar 
    Entao valido a "<mensagem>" e clico no botao Sair
    Exemplos:
        |site                                            |email            |senha       |nome        |mensagem                     |
        |https://srbarriga.herokuapp.com/login           |prova9@yaman.com |123456789   |yamano      |Conta adicionada com sucesso!|


 #***************************************************Negativos*************************************************************************

@cadastro @negativo 
Esquema do Cenario: Login
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Entao devo clicar em Cadastrar e validar a mensagem de erro "<mensagem>"
