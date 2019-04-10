#language: pt
Funcionalidade: Prova Yaman API

#Teste usando os dados de uma API
Esquema do Cenário: Dados do correio
    Dado que foi realizada a conexao "<url>"
    Quando receber os valores da API
    Então devo comparar se o retorno dos valores da API estao em conformidade com a "<rua>", "<cidade>", "<cep>" e "<estado>"
    | url                                       |rua                  | cidade    | cep     | estado|
    | 											| 					  |    		  | 		|       |
