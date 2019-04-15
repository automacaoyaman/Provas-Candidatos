#language: pt

Funcionalidade: Login
Sendo eu um usuário cadastrado no sistema
Desejo acessar o site 
Para poder gerenciar minhas informações

@Login
@logout
Esquema do Cenário: Login
Dado eu acesse a página de Login
Quando eu preencho os campos com "<email>" e "<senha>"
E realizo o Login
Então devo ver o texto "<mensagem>"


 Exemplos:
    | email                    | senha   | mensagem                    |
    | pedro.cruzyamano@io.com  | pedro12 | Bem vindo, Pedro Dias!      |


