package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.PageObject.CadastroPageObject;
import org.example.PageObject.LoginPageObject;
import org.example.PageObject.OpcoesTestePageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class FeatureCadastro {

    @Test
    public void dadosValidos_DeveraCadastrar() throws NoSuchElementException {
        AppiumDriver driver = DriverConfig.Instance().driver;
        OpcoesTestePageObject sbHibrido = new OpcoesTestePageObject(driver);
        sbHibrido.irParaSeuBarrigaHibrido();
        LoginPageObject telaLogin = new LoginPageObject(driver);
        telaLogin.buscarElementos();
        CadastroPageObject telaCadastro = telaLogin.irParaTelaCadastro();
        telaCadastro.buscarElementos();
        telaCadastro.cadastrar("karina", "karina@vafddfffgad.com", "123");
        Assert.assertEquals("Usuário inserido com sucesso", telaCadastro.verificarMensagemSucesso());
        driver.navigate().back();
    }

    @Test
    public void usuarioJaCadastradoAntes_naoCadastrar(){
        AppiumDriver driver = DriverConfig.Instance().driver;
        OpcoesTestePageObject sbHibrido = new OpcoesTestePageObject(driver);
        sbHibrido.irParaSeuBarrigaHibrido();
        LoginPageObject telaLogin = new LoginPageObject(driver);
        telaLogin.buscarElementos();
        CadastroPageObject telaCadastro = telaLogin.irParaTelaCadastro();
        telaCadastro.buscarElementos();
        telaCadastro.cadastrar("karina", "karina@karina.com", "123");
        Assert.assertEquals("Endereço de email já utilizado", telaCadastro.verificarMensagemEmailCadastrado());
        driver.navigate().back();
    }
    @Test
    public void naoCadastrara_DadosInvalidos() {
        AppiumDriver driver = DriverConfig.Instance().driver;
        OpcoesTestePageObject sbHibrido = new OpcoesTestePageObject(driver);
        sbHibrido.irParaSeuBarrigaHibrido();
        LoginPageObject telaLogin = new LoginPageObject(driver);
        telaLogin.buscarElementos();
        CadastroPageObject telaCadastro = telaLogin.irParaTelaCadastro();
        telaCadastro.buscarElementos();
        telaCadastro.cadastrar("karina", "karina.com", "123");
    }
}
