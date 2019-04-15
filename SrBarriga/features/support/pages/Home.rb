class HomePage
    include Capybara::DSL
    def validarMensagemLogin
        find(:xpath, "/html/body/div[1]").text
    end
end