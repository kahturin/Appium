package org.example.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class CadastrarPageObject extends PageObjectBase {

    private MobileElement inputName;
    private MobileElement inputPassword;
    private MobileElement inputPasswordConfirm;
    private MobileElement buttonConfirmRegistration;
    private MobileElement messageReturnError;

    private final By erroID;
    private final By inputNameId;
    private final By inputPasswordId;
    private final By inputPasswordConfirmId;
    private final By buttonConfirmRegistrationId;

    public CadastrarPageObject(AppiumDriver driver){
        super(driver);
        erroID = By.id("br.com.alura.aluraesporte:id/erro_cadastro");
        inputNameId = By.id("br.com.alura.aluraesporte:id/input_nome");
        inputPasswordId = By.id("br.com.alura.aluraesporte:id/input_senha");
        inputPasswordConfirmId = By.id("br.com.alura.aluraesporte:id/input_confirmar_senha");
        buttonConfirmRegistrationId = By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    @Override
    public void buscarElementos(){
        inputName = (MobileElement)driver.findElement(inputNameId);
        inputPassword = (MobileElement)driver.findElement(inputPasswordId);
        inputPasswordConfirm = (MobileElement)driver.findElement(inputPasswordConfirmId);
        buttonConfirmRegistration = (MobileElement)driver.findElement(buttonConfirmRegistrationId);
    }

    public void preencherCampos(String name, String password, String confirm){
        inputName.setValue(name);
        inputPassword.setValue(password);
        inputPasswordConfirm.setValue(confirm);
    }

    public void cadastrar(String name, String password, String confirm){
        preencherCampos(name, password, confirm);
        buttonConfirmRegistration.click();
    }

    public String mensagemErro(){
        WebDriverWait espera = new WebDriverWait(driver, 10);
        espera.until(ExpectedConditions.presenceOfElementLocated(erroID));
        messageReturnError = (MobileElement)driver.findElement(erroID);
        return messageReturnError.getText();
    }

}

