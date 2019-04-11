#Executar antes de iniciar qualquer teste
Before do | scenario |
    Selenium::WebDriver::Chrome.driver_path="C:/Projeto_Provas/Candidatos/FabiolaSilva/prova-yaman-ruby-bdd (Pleno)/chromedriver.exe"
    $driver = Selenium::WebDriver.for :chrome
    $driver.manage.window.maximize

end

#Executado após finalizar qualquer teste
After do | scenario |
    scenario_name = scenario.name
    encoded_img = $driver.screenshot_as(:base64)
    embed("data:image/png;base64,#{encoded_img}",'image/png')
    $driver.save_screenshot("./screenshot/#{scenario_name}_screenshot.png")

    
end

