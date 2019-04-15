class ListarContaPage
    include Capybara::DSL
    def validarMensagemAdicionarConta
        find(:xpath, "/html/body/div[1]").text
    end
end