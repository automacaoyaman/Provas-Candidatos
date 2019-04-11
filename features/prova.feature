#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************

@cadastro
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando insiro os dados "<nome>" "<email>" "<senha>"
    E clico no botão cadastrar
    Então  o sistema retorna "<mensagem>"
    Exemplos:
        |site                                            |nome    |email             |senha    |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |teste1  |teste1@yaman.com  |teste1   |Usuário inserido com sucesso|
        |https://srbarriga.herokuapp.com/cadastro        |teste2  |teste2@yaman.com  |teste2   |Usuário inserido com sucesso|
        |https://srbarriga.herokuapp.com/cadastro        |teste3  |teste3@yaman.com  |teste3   |Usuário inserido com sucesso|
        
@login
Esquema do Cenario: Login
    Dado que foi acessado o "<site>"
    Quando insiro o "<email>" e "<senha>" cadastrados
    E clico no botão no botão Entrar
    E o sistema exibe "<mensagem>"
    Quando clico em Sair
    Então o sistema deve exibir a pagina de login inicial
    Exemplos:
        |site                                         |email             |senha    |mensagem                 |
        |https://srbarriga.herokuapp.com/login        |teste1@yaman.com  |teste1   |Bem vindo, +nomeInserido!|
        |https://srbarriga.herokuapp.com/login        |teste2@yaman.com  |teste2   |Bem vindo, +nomeInserido!|
        |https://srbarriga.herokuapp.com/login        |teste3@yaman.com  |teste3   |Bem vindo, +nomeInserido!|
        

@conta
Esquema do Cenario: Conta
    Dado que foi acessado o "<site>"
    E insiro os dados de "<email>" e "<senha>" cadastrados
    Quando clico em Entrar
    E acesso o menu Contas e o submenu Adicionar
    E insiro um valor no campo "<nome>"
    Quando clico no botao Salvar
    Então o sistema retorna "<mensagem>"
    Exemplos:
    |site                                         |email             |senha    |nome   |mensagem                          |
    |https://srbarriga.herokuapp.com/login        |teste1@yaman.com  |teste1   |conta1 |Já existe uma conta com esse nome!|
    |https://srbarriga.herokuapp.com/login        |teste2@yaman.com  |teste2   |conta2 |Já existe uma conta com esse nome!|
    |https://srbarriga.herokuapp.com/login        |teste3@yaman.com  |teste3   |conta3 |Já existe uma conta com esse nome!|
 
 #***************************************************Negativos*************************************************************************

@cadastro @negativo
Esquema do Cenario: Cadastro
    Dado que foi acessado o "<site>"
    Quando insiro os dados "<nome>" "<email>" "<senha>" ja usados anteriormente
    E clico no botão cadastrar
    Então  o sistema retorna "<mensagem>"
    Exemplos:
        |site                                            |nome    |email             |senha    |mensagem                      |
        |https://srbarriga.herokuapp.com/cadastro        |teste1  |teste1@yaman.com  |teste1   |Endereço de email já utilizado|
        |https://srbarriga.herokuapp.com/cadastro        |teste2  |teste2@yaman.com  |teste2   |Endereço de email já utilizado|
        |https://srbarriga.herokuapp.com/cadastro        |teste3  |teste3@yaman.com  |teste3   |Endereço de email já utilizado|

@conta @negativo
Esquema do Cenario: Conta
    Dado que foi acessado o "<site>"
    E insiro os dados de "<email>" e "<senha>" cadastrados
    Quando clico em Entrar
    E acesso o menu Contas e o submenu Adicionar
    E insiro um valor no campo "<nome>"
    Quando clico no botao Salvar
    Então o sistema retorna "<mensagem>"
    Exemplos:
    |site                                         |email             |senha    |nome   |mensagem                          |
    |https://srbarriga.herokuapp.com/login        |teste1@yaman.com  |teste1   |conta1 |Já existe uma conta com esse nome!|
    |https://srbarriga.herokuapp.com/login        |teste2@yaman.com  |teste2   |conta2 |Já existe uma conta com esse nome!|
    |https://srbarriga.herokuapp.com/login        |teste3@yaman.com  |teste3   |conta3 |Já existe uma conta com esse nome!|