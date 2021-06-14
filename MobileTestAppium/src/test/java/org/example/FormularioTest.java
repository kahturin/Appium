package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.PageObject.Formulario;
import org.example.PageObject.OpcoesTestePageObject;
import org.junit.Assert;
import org.junit.Test;

public class FormularioTest {

    @Test
    public void salvarDadosNoFormulario(){
        AppiumDriver driver = DriverConfig.Instance().driver;
        OpcoesTestePageObject formulario = new OpcoesTestePageObject(driver);
        formulario.irParaFormulario();
        Formulario novoFormulario = new Formulario(driver);
        novoFormulario.buscarElementos();
        novoFormulario.preencherCampo("karina");
        novoFormulario.selecionarcombo();
        novoFormulario.campoSwitch();
        novoFormulario.campoCheckbox();
        novoFormulario.salvarDados();
        novoFormulario.validarDados();


    }
}
