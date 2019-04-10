#language: pt

Funcionalidade: Prova de automação Allan :D 

@cadastro @positivo
Esquema do Cenario: Cadastro de novo usuario 
    Dado que acesso o site "<site>"
    Quando insiro o nome "<nome>"
		E insiro o email "<email>"
		E insiro a senha "<senha>"
    E clico em cadastrar
    Entao o sistema exibe a mensagem "<mensagemCadastro>"
Exemplos:
	| site																			| nome						| email						| senha			| mensagemCadastro							|
	| https://srbarriga.herokuapp.com/cadastro	| sorriso					| sorriso2@yaman		| automacao	| Usuário inserido com sucesso	|

@login @positivo
Esquema do Cenario: Acesso a conta cadastrada
    Dado que acesso o site "<site>"
    E insiro o email "<email>"
    E insiro a senha "<senha>"
    Quando clico em Entrar 
    Entao o sistema exibe a mensagem "<mensagemBemVindo>"
    Quando clico em Sair
    Entao o sistema exibe a tela de login
Exemplos:
	| site																	| email					| senha			| mensagemBemVindo			|
	| https://srbarriga.herokuapp.com/login	| sorriso2@yaman	| automacao	| Bem vindo, sorriso!		|

@conta @positivo
Esquema do Cenario: Cadastro de conta
    Dado que acesso o site "<site>"
    E insiro o email "<email>"
    E insiro a senha "<senha>"
    Quando clico em Entrar
    Entao o sistema exibe a mensagem "<mensagemBemVindo>"
    Quando clico no menu Contas
    E clico no submenu Adcionar
    E insiro o nome "<nome>"
    E clico em Salvar
    Entao o sistema exibe a mensagem "<mensagemConta>"
Exemplos:
	| site																	| email					| senha			| mensagemBemVindo			| nome	| mensagemConta									|
	| https://srbarriga.herokuapp.com/login	| sorriso2@yaman	| automacao	| Bem vindo, sorriso!		| conta	| Conta adicionada com sucesso!	|

@cadastro @negativo
Esquema do Cenario: Cadastrar usuario ja existente
    Dado que acesso o site "<site>"
    Quando insiro o nome "<nome>"
		E insiro o email "<email>"
		E insiro a senha "<senha>"
    E clico em cadastrar
    Entao o sistema exibe a mensagem "<mensagemCadastro>"
Exemplos:
	| site																			| nome			| email					| senha			| mensagemCadastro								|
	| https://srbarriga.herokuapp.com/cadastro	| sorriso		| sorriso2@yaman	| automacao	| Endereço de email já utilizado	|

@conta @negativo
Esquema do Cenario: Cadastrar uma conta ja existente
    Dado que acesso o site "<site>"
    E insiro o email "<email>"
    E insiro a senha "<senha>"
    Quando clico em Entrar
    E clico no menu Contas
    E clico no submenu Adcionar
    E insiro o nome "<nome>"
    E clico em Salvar
    Entao o sistema exibe a mensagem "<mensagemConta>"
Exemplos:
	| site																	| email					| senha			| nome	| mensagemConta												|
	| https://srbarriga.herokuapp.com/login	| sorriso2@yaman	| automacao	| conta	| Já existe uma conta com esse nome!	|
