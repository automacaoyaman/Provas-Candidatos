require 'selenium-webdriver'

class LoginPage

    #**********************Objetos**************************************************************

    #mapearos objetos
    find_element (:id, "nome")
    find_element (:id, "email")
    find_element (:id, "senha")
    

    #*********************************************************************************************

    #**********************Métodos****************************************************************

      
    #implementar os métodos

    def Login
        nome.set nome
        email.set email
        senha.set senha
        find (:xpath, '/html/body/div[2]/form/button').click
        
    end
    #*********************************************************************************************
end