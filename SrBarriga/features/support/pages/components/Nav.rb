class Nav
    include Capybara::DSL
    def Sair
        click_link('Sair')
    end

    def acessarTelaAdicionarContas
        click_link('Contas')
        click_link('Adicionar')
    end
end