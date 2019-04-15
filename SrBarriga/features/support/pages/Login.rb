class LoginPage
    include Capybara::DSL
    def validarMensagemCadastro
        find(:xpath, "/html/body/div[1]").text
    end

    def acessarTelaLogin
        visit 'https://srbarriga.herokuapp.com/login'
    end

    def preencheCampoEmail(email)
        find('#email').set email
    end

    def preencherCampoSenha(senha)
        find('#senha').set senha
    end

    def clicarBotaoEntrar
        click_button('Entrar')
    end

    def preencherCamposLogin(email, senha)
        preencheCampoEmail(email)
        preencherCampoSenha(senha)
    end

    def validarLogout
        find(:xpath, "/html/body/div[2]/form/button")
    end
end