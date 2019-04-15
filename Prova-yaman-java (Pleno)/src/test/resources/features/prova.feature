#language: pt
Funcionalidade: Prova Yaman Ruby BDD

 #***************************************************Positivos*************************************************************************

Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando insiro um "<nome>" "<email>" e uma "<senha>"
    Entao clico em Cadastrar e valido a mensagem "<mensagem>"
    
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/cadastro        |Eloy8    |eloy8@yaman.com  |123456789   |Usuário inserido com sucesso|

Esquema do Cenario: Login
		Dado que foi acessado o site "<site>"
		Quando insiro o "<email>" e "<senha>" cadastrada anteriormente
		Entao clico no botão Entrar
		E valido o texto Bem vindo "<nome>"
		Entao clico em sair e valido o logout

		Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                    |
        |https://srbarriga.herokuapp.com/login           |Eloy     |eloy@yaman.com   |123456789   |Usuário inserido com sucesso|
        
#Esquema do Cenario: Conta
# 	Dado que foi acessado o site "<site>"
# 	Quando insiro o "<email>" e "<senha>" cadastrada anteriormente
#		Entao clico no botão Entrar
#		E clico no meu contas e em seguida no submenu adicionar
#		E insiro um valor no campo Nome "<nomeValor>"
#		E clico no botao Salvar
#		E valido o texto Conta Adicionada com sucesso e clico em Sair
		
#		Exemplos:
#        |site                                            |nome     |email            |senha       |mensagem                    |
#        |https://srbarriga.herokuapp.com/login           |Eloy     |eloy@yaman.com   |123456789   |Usuário inserido com sucesso|
 #***************************************************Negativos*************************************************************************

@cadastro @negativo
Esquema do Cenario: Cadastro
		Dado que foi acessado o site "<site>"
    Quando insiro um "<nome>" "<email>" e uma "<senha>"
    Entao clico em Cadastrar e valido a mensagem "<mensagem>"
    
    Exemplos:
        |site                                            |nome     |email            |senha       |mensagem                      |
        |https://srbarriga.herokuapp.com/cadastro        |Eloy     |eloy@yaman.com   |123456789   |Endereço de email já utilizado|
        
#@conta @negativo
#Esquema do Cenario: Conta