require 'selenium-webdriver'
require 'capybara'
require 'cucumber'

class LoginPage

    #**********************Objetos**************************************************************

    #mapearos objetos

    elemnet :email, '#[id="email"]'
    element :senha, '#[id="senha"]'
    element :button_entrar, '#[value="Entrar"]'

    #*********************************************************************************************

    #**********************Métodos****************************************************************

def prencher_login 
    nome.set          'Andreia'
    email.set         'andreia@hotmail.com'
    senha.set         '123'
    button_entrar.click
end

    #*********************************************************************************************
end

