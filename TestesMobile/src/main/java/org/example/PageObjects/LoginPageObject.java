package org.example.PageObjects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends PageObjectBase{

    private MobileElement buttonRegister;
    private final By buttonRegisterId;


    public LoginPageObject(AppiumDriver driver) {
        super(driver);
        buttonRegisterId = By.id("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
    }

    @Override
    public void buscarElementos(){
        buttonRegister = (MobileElement)driver.findElement(buttonRegisterId);
    }

    public CadastrarPageObject irParaTelaDeCadastro(){
        buttonRegister.click();
        return new CadastrarPageObject(this.driver);
    }

}
