#language: pt

Funcionalidade: Novo Usuário
Sendo eu um usuário comum
Desejo me cadastrar no sistema
Para que eu possa acessar o sistema

Contexto: Tela de Cadastro
Dado eu acesse a tela de cadastro do site 

Esquema do Cenário: Novo Usuário
Quando eu preencher as informações "<nome>", "<email>" e "<senha>"
E finalizo o Cadastro
Então devo ver a mensagem "<mensagem>"


  Exemplos:
    | nome       | email                     | senha   | mensagem                       |
    | Pedro Dias | pedro.cruzyamano@io.com   | pedro12 | Usuário inserido com sucesso   |
    | Pedro Dias | pedro.cruzyamano@io.com   | pedro12 | Endereço de email já utilizado |
