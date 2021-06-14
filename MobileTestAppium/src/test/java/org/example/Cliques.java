package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.PageObject.OpcoesTestePageObject;
import org.junit.Test;

public class Cliques {

    @Test
    public void fazerUmCliqueDuplo(){
        AppiumDriver driver = DriverConfig.Instance().driver;
        OpcoesTestePageObject cliqueDuplo = new OpcoesTestePageObject(driver);
        cliqueDuplo.irParaCliques();
    } //android.widget.TextView[@index='0']
}
