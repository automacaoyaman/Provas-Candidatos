#language: pt

Funcionalidade: Contas

Sendo eu um usuário cadastrado no sistema
Desejo acessar o site 
Para poder gerenciar minhas Contas

@auth
@logut
@Conta
Esquema do Cenário: Contas
Dado eu acesso tela de adicionar
Quando eu preencho a conta com "<conta>"
E finalizo a inclusão da conta
Então devo ver o texto de adição de conta "<mensagem>"


Exemplos:

| conta | mensagem                     |
| Luz  | Conta adicionada com sucesso!|
