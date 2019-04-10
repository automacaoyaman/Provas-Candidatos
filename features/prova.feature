#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************
@cadastro @1
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando eu cadastro um novo usuário
    Então usuário cadastrado com sucesso
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |yamano   |prova@yaman.com  |123456789   |Usuário inserido com sucesso|

@login @2
Esquema do Cenario: Login
  Quando acesso o login cadastrado
  Então login acessado com sucesso

@conta @3
Esquema do Cenario: Conta
  Quando eu cadastrado uma nova conta  
  Então conta é cadastrada com sucesso
 
 #***************************************************Negativos*************************************************************************

@cadastro @negativo @4
Esquema do Cenario: Cadastro
Quando cadastro um usuario já existente
Então retorna mensagem usuário já existe


@conta @negativo @5
Esquema do Cenario: Conta
Quando cadastrado uma conta já existente
Então retorna mensagem conta já existe