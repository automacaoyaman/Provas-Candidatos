#language: pt

Funcionalidade: Cadastro
Sendo eu um usuário comum
Desejo me cadastrar no sistema 
Para que eu possa acessar

Cenário: Realizar Cadastro
Dado eu acesse a página inicial do sistema
Quando eu preencher as informações "Pedro Dias", "pedro.testeyaman@io.com" e "testeyaman"
E finalizo o Cadastro
Então devo ver a mensagem "Usuário inserido com sucesso"

