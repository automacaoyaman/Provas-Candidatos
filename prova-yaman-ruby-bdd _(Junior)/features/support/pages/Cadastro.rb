class CadastroPage
    include Capybara::DSL
    def acessarPaginaCadastro
        visit 'https://srbarriga.herokuapp.com/cadastro'
    end
end