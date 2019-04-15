class NovoUsuarioPage
    include Capybara::DSL
    def acessarTelaCadastro
        visit 'https://srbarriga.herokuapp.com/cadastro'
    end

    def preencherCampoNome(nome)
        find('#nome').set nome
    end

    def preencherCampoEmail(email)
        find('#email').set email
    end

    def preencherCampoSenha(senha)
        find('#senha').set senha
    end

    def clicarBotaoCadastrar
        click_button('Cadastrar')
    end

    def preencherCamposCadastro(nome, email, senha)
        preencherCampoNome(nome)
        preencherCampoEmail(email)
        preencherCampoSenha(senha)
    end
end