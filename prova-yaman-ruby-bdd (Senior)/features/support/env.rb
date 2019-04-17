#Bibliotecas necessárias para execução do projeto
require 'selenium-webdriver'
require 'cucumber'
require 'pry'
require 'capybara'
require 'capybara/cucumber'
require 'yaml'
require 'site_prism'
require 'SecureRandom'
require 'rspec'

ENV['ENV'] = 'qa' unless ENV.key?('ENV' || 'env')
ENVIRONMENT = YAML.load_file('./features/support/environments.yaml')[ENV['ENV']]
BROWSER = 'chrome' unless ENV.key?('browser' || 'BROWSER')


Capybara.default_max_wait_time = 10

Capybara.register_driver :selenium do |app|
  if BROWSER.eql?('chrome')
    caps = Selenium::WebDriver::Remote::Capabilities.chrome(
        'chromeOptions' => {
            "args" => [ "--window-size=1600,1300"]
        }
    )
    Capybara::Selenium::Driver.new(app, {:browser => :chrome, :desired_capabilities => caps})
  elsif BROWSER.eql?('firefox')
    Capybara::Selenium::Driver.new(app, browser: :firefox)
  end
end

  ## configure the chosen browser
  Capybara.configure do |config|
    config.default_driver = :selenium
  end