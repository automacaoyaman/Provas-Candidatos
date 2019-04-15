#Bibliotecas necessárias para execução do projeto
require 'capybara'
require 'selenium-webdriver'
require 'capybara/cucumber'
require 'pry'


Capybara.configure do |config|
    config.default_driver = :selenium_chrome
    Capybara.page.driver.browser.manage.window.maximize
    Capybara.default_max_wait_time = 10
end