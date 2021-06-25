package org.example.page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.example.BasePage;
import org.example.DriverConfig;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    public void setName(String nome){
        preencherCampo(MobileBy.AccessibilityId("nome"), nome);
    }

    public String getName(){
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selectCombo(String value){
        selecionarCombo(MobileBy.AccessibilityId("console"), value);
    }

    public String getCombo(){
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public boolean markedCheckbox(){
        return marcarCheckbox(By.xpath("//android.widget.CheckBox[@index='4']"));
    }

    public boolean markedSwitch(){
        return marcarCheckbox(By.xpath("//android.widget.Switch[@index='5']"));
    }

    public void clickOnSwitch(){
        clicar(By.xpath("//android.widget.Switch[@index='5']"));
    }

    public void clickOnCheckbox(){
        clicar(By.xpath("//android.widget.CheckBox[@index='4']"));
    }

//    public void clicarSeekBar(double posicion){
//        MobileElement seek = new DriverConfig().getDriver().findElement(By.xpath("//android.widget.SeekBar[@index='3']"));
//        int y = seek.getLocation().y + (seek.getSize().height / 2);
//        int x = (int) (seek.getLocation().x + (seek.getSize().width * posicion));
//
//        tap(x,y);
//    }
    public void clickOnSave(){
        clicarPorTexto("SALVAR");
    }

    public String console(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

    public String valueName(){
        return obterTexto(By.xpath("//android.widget.TextView[@text='Nome: karina']"));
    }

    public boolean getSwitch(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]")).endsWith("Off");
    }

    public boolean getCheckbox(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]")).endsWith("Marcado");
    }

    public void clickOnSaveLate() {
        clicarPorTexto("SALVAR DEMORADO");
    }
}
