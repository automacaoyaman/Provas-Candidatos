class SrBarrigaLogin < SitePrism::Page

    set_url ENVIRONMENT['home'] + '/login'

    element :email_usuario, '#email'
    element :senha_usuario, '#senha'
    element :botao_entrar, '/html/body/div[2]/form/button'
    element :link_sair, '//*[@id="navbar"]/ul/li[5]/a'
end    