#language: pt
# encoding: utf-8
Funcionalidade: Prova Yaman Java BDD

  #***************************************************Positivos*************************************************************************
@cadastro @positivo
  Cenario: Cadastro
    Dado que foi acessado o site 
    Quando inserir o usuario "teste" o "testeal@yaman.com" e a "123456789" valida
    Entao devo clicar em Cadastrar e validar a mensagem "Usu�rio inserido com sucesso"

 			
 	@login @positivo
  Cenario: Login
    Dado que foi acessado o site 
    Quando inserir o email "ale@jr" e a "1" previamente cadastradas
    E clicar em Entrar
    E validar a mensagem "Bem vindo, yamano!"
    Entao clicar em Sair e validar o logout

  
   
@conta @positivo
  Esquema do Cenario: Conta
    Dado que foi acessado o site
    Quando inserir o email "email>prova8@yaman.com" e a senha "123456789" previamente cadastradas
    E clicar em Entrar
    E clicar no menu Contas e no submenu Adicionar
    E inserir um valor no campo nome "nova conta" e clicar em Salvar
    Entao validar a mensagem "Conta adicionada com sucesso" e clicar em Sair

    Exemplos: 
      | site                                  | email            | senha     | nome       | mensagem                      |
      | https://srbarriga.herokuapp.com/login | prova8@yaman.com | 123456789 | Nova Conta | Conta adicionada com sucesso! |

  #***************************************************Negativos*************************************************************************
  @cadastro @negativo
  Esquema do Cenario: Login
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Entao devo clicar em Cadastrar e validar a mensagem de erro "<mensagem>"

    Exemplos: 
      | site                                     | nome    | email            | senha     | mensagem                         |
      | https://srbarriga.herokuapp.com/cadastro | yamano2 | prova2@yaman.com | 123456789 | EndereÃ§o de email jÃ¡ utilizado |

  @conta @negativo
  Esquema do Cenario: Conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar
    E clicar no menu Contas e no submenu Adicionar
    E inserir um valor no campo "<nome>" e clicar em Salvar
    Entao validar a mensagem "<mensagem>" e clicar em Sair

    Exemplos: 
      | site                                  | email            | senha     | nome       | mensagem                            |
      | https://srbarriga.herokuapp.com/login | prova2@yaman.com | 123456789 | Nova Conta | JÃ¡ existe uma conta com esse nome! |

      

     