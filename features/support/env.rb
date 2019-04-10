#Bibliotecas necessárias para execução do projeto
require 'selenium-webdriver'
require 'cucumber'
require 'pry'
require 'capybara'

Capybara.configure do |config| config.default driver = :seleniun_chrome
   config.app_host = CONFIG['url_padrao']
   config.default_max_wait_time = 10
end 

#


