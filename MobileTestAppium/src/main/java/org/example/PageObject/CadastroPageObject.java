package org.example.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CadastroPageObject extends PageObjectBase {
    private MobileElement inputName;
    private MobileElement inputEmail;
    private MobileElement inputPassword;
    private MobileElement botaoCadastrar;
    private MobileElement mensagemSucesso;

    private final By inputNameID;
    private final By inputEmailID;
    private final By inputPasswordID;
    private final By botaoCadastrarClass;

    private MobileElement emailCadastradoMensagem;
    private MobileElement nomeObrigatorio;
    private MobileElement emailObrigatorio;

    protected CadastroPageObject(AppiumDriver driver) {
        super(driver);
        inputNameID = By.xpath("//android.widget.EditText[@index='1']");
        inputEmailID = By.xpath("//android.widget.EditText[@index='3']");
        inputPasswordID = By.xpath("//android.widget.EditText[@index='5']");
        botaoCadastrarClass = By.className("android.widget.Button");
    }

    @Override
    public void buscarElementos() {
        inputName = (MobileElement) driver.findElement(inputNameID);
        inputEmail = (MobileElement) driver.findElement(inputEmailID);
        inputPassword = (MobileElement) driver.findElement(inputPasswordID);
        botaoCadastrar = (MobileElement) driver.findElement(botaoCadastrarClass);
    }

    private void preencherCampos(String name, String email, String password) {
        inputName.setValue(name);
        inputEmail.setValue(email);
        inputPassword.setValue(password);
    }

    public void cadastrar(String name, String email, String password) {
        preencherCampos(name, email, password);
        botaoCadastrar.click();
    }

    public String verificarMensagemSucesso() {
        mensagemSucesso = (MobileElement) driver.findElementByXPath("//android.view.View[@text='Usuário inserido com sucesso']");
        return mensagemSucesso.getText();
    }

    public String verificarMensagemEmailCadastrado() {
        emailCadastradoMensagem = (MobileElement) driver.findElementByXPath("//android.view.View[@text='Endereço de email já utilizado']");
        return emailCadastradoMensagem.getText();
    }
}

//    public String verificarMensagemCampoObrigatorio() {
//        nomeObrigatorio = (MobileElement) driver.findElementByXPath("//android.view.View[@text='Nome é um campo obrigatório']");
//        return nomeObrigatorio.getText();
//        emailObrigatorio = (MobileElement)driver.findElementByXPath("//android.view.View[@text='Email é um campo obrigatório']");
//    }
//}