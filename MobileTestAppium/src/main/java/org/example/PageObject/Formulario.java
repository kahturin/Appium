package org.example.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

public class Formulario extends PageObjectBase {

    private MobileElement inputName;
    private MobileElement combo;
    private MobileElement videoGameSelecionado;
    private MobileElement validacao;
    private MobileElement switc;
    private MobileElement checkbox;
    private MobileElement checkbox1;
    private MobileElement switc1;
    private MobileElement botaoSalvar;
    private MobileElement nome;
    private MobileElement console;

    public Formulario(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public void buscarElementos() {
        inputName = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Nome']");
        combo = (MobileElement) driver.findElementByXPath("//android.widget.Spinner[@index='2']");
    }

    public void preencherCampo(String nome){
        inputName.setValue(nome);
    }

    public void selecionarcombo(){
        combo.click();
        videoGameSelecionado = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[@text='PS4']"); //uma vez que foi encontrado o spinner, continue a busca abaixo dele
        videoGameSelecionado.click();
    }

    public void campoSwitch(){
        switc1 = (MobileElement) driver.findElementByXPath("//android.widget.Switch[@index='5']");
        Assert.assertTrue(switc1.getAttribute("checked").equals("true"));
        switc1.click();
//        Assert.assertFalse(switc.getAttribute("checked").equals("true"));
    }

    public void campoCheckbox(){
        checkbox1 = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@index='4']");
        Assert.assertTrue(checkbox1.getAttribute("checked").equals("false"));
        checkbox1.click();
//        Assert.assertFalse(checkbox.getAttribute("checked").equals("false"));
    }

    public void salvarDados(){
        botaoSalvar = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='SALVAR']");
        botaoSalvar.click();
    }

    public void validarDados(){
        nome = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Nome: karina']");
        Assert.assertEquals("Nome: karina", nome.getText());
        console = (MobileElement) driver.findElementByXPath("//android.widget.TextView[starts-with(@text, 'Console:')]");
        Assert.assertEquals("Console: ps4", console.getText());
    }


}
