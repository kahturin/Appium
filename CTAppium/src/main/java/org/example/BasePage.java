package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;

public class BasePage {

    public void preencherCampo(By by, String nome){
        DriverConfig.getDriver().findElement(by).setValue(nome);
    }

    public String obterTexto(By by){
        return DriverConfig.getDriver().findElement(by).getText();
    }

    public void clicar(By by){
        DriverConfig.getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    public void selecionarCombo(By by, String valor){
        DriverConfig.getDriver().findElement(by).click(); //"//android.widget.Spinner[@index='2']"
        clicarPorTexto(valor);
    }

    public boolean marcarCheckbox(By by){
        return DriverConfig.getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean elementoEncontrado(String texto){
        List<MobileElement> elementos = DriverConfig.getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
        return elementos.size() > 0;
    }

    public void tap(double xy){
        TouchAction tap = new TouchAction(DriverConfig.getDriver()).tap(xy).perform();
    }

    public void scroll(double inicio, double fim){
        Dimension size = new DriverConfig().getDriver().manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);
        new TouchAction<>(DriverConfig.getDriver()).press(x, start_y).waitAction(Duration.ofMillis(500))
                .moveTo(x, end_y)
                .release()
                .perform();
    }
}
