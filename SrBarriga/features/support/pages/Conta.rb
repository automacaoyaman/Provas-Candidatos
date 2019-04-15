class ContaPage
    include Capybara::DSL
    def preencherCampoConta(conta)
        find('#nome').set conta
    end

    def clicarBotaoSalvar
        click_button('Salvar')
    end
end