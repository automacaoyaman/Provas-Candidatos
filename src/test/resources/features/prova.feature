#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************
@cadastro @positivo @1
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Então devo clicar em Cadastrar e validar a mensagem "<mensagem>"
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |yamano   |prova@yaman.com  |123456789   |Usuário inserido com sucesso|

@2
Esquema do Cenario: Login
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar 
    E validar a mensagem "<mensagem>"
    Então clicar em Sair e validar o logout
    Exemplos:
        |site                                         |email						 |senha     |mensagem 					|
        |https://srbarriga.herokuapp.com/login        |prova@yaman.com   |123456789	|Bem vindo, yamano! |

@3
Esquema do Cenario: Conta
    Dado que foi acessado o site "<site>"
    Quando inserir o "<email>" e a "<senha>" previamente cadastradas
    E clicar em Entrar
    E clicar no menu Contas e no submenu Adicionar
    E inserir um valor no campo nome "<nome>"
    E clicar em Salvar
    E validar a mensagem "<mensagem" e Sair
    Então clicar em Entrar
    Exemplos: 
        |site                                            |email           |senha    |nome   |mensagem    									 |
        |https://srbarriga.herokuapp.com/login           |prova@yaman.com |12345679 |yamano |Conta adicionada com sucesso! |

 
 #***************************************************Negativos*************************************************************************

@cadastro @negativo @4
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando inserir o "<nome>", o "<email>" e a "<senha>" valida
    Então devo clicar em Cadastrar e validar a mensagem "<mensagem>"
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                       |
        |https://srbarriga.herokuapp.com/cadastro        |yamano   |prova@yaman.com  |123456789   |Endereço de email já utilizado |