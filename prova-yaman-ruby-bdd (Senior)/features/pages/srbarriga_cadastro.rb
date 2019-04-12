class SrBarrigaCadastro < SitePrism::Page

    set_url ENVIRONMENT['home'] + '/cadastro'

    element :nome_usuario, '#nome'
    element :email_usuario, '#email'
    element :senha_usuario, '#senha'
    element :botao_cadastrar, 'input.btn.btn-primary'

    def generate_user(number)
        SecureRandom.hex (number)
    end

end