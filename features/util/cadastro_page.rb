require 'selenium-webdriver'
require 'cucumber'
require 'capybara'


class CadastroPage
    
    #**********************Objetos**************************************************************
    # def txt_Nome
    #     nome_elemento = "Campo de texto Nome"
    #     begin           
    #         return $driver.find_element(:id, "nome")
    #     rescue => exception
    #         fail(ArgumentError.new("Objeto <" + nome_elemento + "> não encontrado"))
    #     end
    # end

    #*********************************************************************************************

def Nome    
    element :nome,  '#[id="nome"]'
    element :email, '#[id="email"]'
    element :senha, '#[id="senha"]'
    element :button_cadastrar, '#[value="Cadastrar"]'
end 

    #**********************Métodos**************************************************************
    
    def preencher_nome
        nome.set          'Andreia'
        email.set         'andreia@hotmail.com'
        senha.set         '123'
        button_cadastrar.click
    end
    





    #***************************************************
    # Function        : configurar_ambiente
    # Description     : Função responsável por acessar uma determinada url
    # Parameters      : url
    # Value Returned  : -
    #***************************************************
    # def configurar_ambiente url
    #     $driver.get url
    # end

    #*********************************************************************************************


end