package org.example;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.PageObjects.CadastrarPageObject;
import org.example.PageObjects.LoginPageObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class FeatureCadastro
{

    @Test
    public void senhasIncompativeisNaoCadastrara() {
        AppiumDriver d = AppiumDriverConfig.Instance().driver;

        LoginPageObject telaLogin = new LoginPageObject(d);
        telaLogin.buscarElementos();
        CadastrarPageObject telaCadastro = telaLogin.irParaTelaDeCadastro();
        telaCadastro.buscarElementos();
        telaCadastro.cadastrar("karina", "123", "1234");

        Assert.assertEquals("Senhas não conferem", telaCadastro.mensagemErro());
        d.navigate().back(); //(mesmo sem o navigate os dois testes passam).
    }

    @Test
    public void deveraSeLogarComDadosValidos() throws NoSuchElementException {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        LoginPageObject telaLogin = new LoginPageObject(driver);
        telaLogin.buscarElementos();
        CadastrarPageObject telaCadastro = telaLogin.irParaTelaDeCadastro();
        telaCadastro.buscarElementos();
        telaCadastro.cadastrar("karina", "123", "123");

        MobileElement loginButton = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
    }
}
