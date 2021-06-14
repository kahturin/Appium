package org.example.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.FindsByXPath;

public class LoginPageObject extends PageObjectBase{

    private MobileElement novoUsuario;

    public LoginPageObject(AppiumDriver driver){
        super(driver);
    }

    @Override
    public void buscarElementos(){
        novoUsuario = (MobileElement) driver.findElementByXPath("//android.view.View[@text='Novo usuário?']");
    }

    public CadastroPageObject irParaTelaCadastro() {
        novoUsuario.click();
        return new CadastroPageObject(this.driver);
    }
}
