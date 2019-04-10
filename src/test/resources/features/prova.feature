#language: pt
# encoding: utf-8
Funcionalidade: Prova Yaman Java BDD
#***************************************************Positivos*************************************************************************
@cadastroPositivo 
Esquema do Cenario: Cadastro de novo usuario
     Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Entao devo clicar em Cadastrar e validar a mensagem "<mensagem>"
    Exemplos:
        |site                                            |nome     |email                    |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |Gui      |testepr4555@yaman.com    |123456789   |Usuário inserido com sucesso|
  
    
        
@loginPositivo 
Esquema do Cenario: Acesso a conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar 
    E validar a mensagem "<mensagem>"
    Entao clicar em Sair e validar o logout
    Exemplos:
        |site                                          |email                  |senha       |mensagem          |
        |https://srbarriga.herokuapp.com/login         |testepr4555@yaman.com  |123456789   |Bem vindo, Gui!   |

@contaPositivo 
Esquema do Cenario: Cadastro de conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas 
    E clicar em Entrar 
    E validar a mensagem "<mensagem1>"
    E clicar no menu Contas e no submenu Adicionar
    E inserir um valor no campo "<nome>" e clicar em Salvar
    E validar a mensagem "<mensagem2>"
    Entao clicar em Sair e validar o logout
    Exemplos:
        |site                                            |email                |senha      |nome        |mensagem1           |mensagem2                     |
        |https://srbarriga.herokuapp.com/login           |testeprova@yaman.com |123456789  |Teste99087  |Bem vindo, Gui!     |Conta adicionada com sucesso! |

   
 #***************************************************Negativos*************************************************************************

@cadastroNegativo
Esquema do Cenario: Acesso a conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Entao devo clicar em Cadastrar e validar a mensagem "<mensagem>"
    Exemplos:
        |site                                            |nome     |email            |senha      |mensagem                      |
        |https://srbarriga.herokuapp.com/cadastro        |         |prova2@yaman.com |123456789  |Nome é um campo obrigatório   |

@contaNegativoCadastro @1
Esquema do Cenario: Cadasto de conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar 
    E clicar no menu Contas e no submenu Adicionar
    E inserir um valor no campo "<nome>" e clicar em Salvar
    Entao validar a mensagem "<mensagem>" e clicar em Sair
    Exemplos:
        |site                                      |email             |senha       |nome  |mensagem               |
        |https://srbarriga.herokuapp.com/login     |prova2@yaman.com  |123456789   |      |Informe o nome da conta|
