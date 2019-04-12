#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************

#Esquema do Cenario: Cadastro
#    Dado que foi acessado o site "<site>"
#    Quando 
#    Então  
#    Exemplos:
#        |site                                     |       
#        |https://srbarriga.herokuapp.com/cadastro |

Cenario: Efetuar um cadastro com sucesso
    Dado que eu acessso a home do site srbarriga
    Quando eu preencher meus dados de cadastro
    E clicar no botao cadastrar
    Entao Eu irei visualizar a mensagem 'Usuário inserido com sucesso'


#implementar cenário de Login

Cenario: Efetuar login no cadastro recem criado
    Dado que eu acesse a pagina de login
    Quando eu preencher meus dados que acabei de cadastrar
    E clicar no botão entrar
    Entao devo visualizar a mensagem de boas vindas com meu nome de usuario
    Quando eu clicar no botão sair
    Entao devo visualizar a mensagem de logout

#implementar cenário de Conta

 
 #***************************************************Negativos*************************************************************************

#implementar cenário negativo de Cadastro

#implementar cenário negativo de Conta