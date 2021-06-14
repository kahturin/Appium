package org.example.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OpcoesTestePageObject {

    private AppiumDriver driver;
    private List<MobileElement> opcoesSelecionaveis;

    public OpcoesTestePageObject(AppiumDriver driver) {
        this.driver = driver;
    }

    public void irParaSeuBarrigaHibrido(){
        opcoesSelecionaveis = driver.findElementsByClassName("android.widget.TextView");
//      for(MobileElement opcao: opcoesSelecionaveis){
//            System.out.println(opcao.getText());
//      }
        opcoesSelecionaveis.get(3).click();
    }

    public void irParaDragAndDrop(){
        opcoesSelecionaveis = driver.findElementsByClassName("android.widget.TextView");
        opcoesSelecionaveis.get(11).click();
    }

    public void irParaCliques(){
        opcoesSelecionaveis = driver.findElementsByClassName("android.widget.TextView");
        opcoesSelecionaveis.get(8).click();
    }

    public void irParaFormulario(){
        opcoesSelecionaveis = driver.findElementsByClassName("android.widget.TextView");
        opcoesSelecionaveis.get(1).click();
    }
}
