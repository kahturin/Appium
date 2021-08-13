package br.com.betternow.eaq_app.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static br.com.betternow.eaq_app.core.DriverConfig.getDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public String obterTexto(By by){
        return DriverConfig.getDriver().findElement(by).getText();
    }

    public void clicarPorTexto(String texto){
        DriverConfig.getDriver().findElement(By.xpath("//*[@text='"+ texto +"']")).click();
    }

    public void clicarAceitoOsTermos(){
        clicarPorTexto("ACEITO OS TERMOS ");
    }

    public void concederPermissoes(){
        clicarPorTexto("CONCEDER PERMISSÕES ");
    }

    public void aceitarPermissoes(){
        for(int i = 0; i < 3; i++){
            DriverConfig.getDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        }
    }

    public void aceitarTodasPermissoes(){
        aceitarPermissoes();
    }

    public void negarPermissoes() {
        for(int i = 0; i < 3; i++){
            DriverConfig.getDriver().findElement(By.id("com.android.packageinstaller:id/permission_deny_button")).click();
        }
    }

    public static void scroll() {
        Dimension size = DriverConfig.getDriver().manage().window().getSize();
        int starScroll = (int) (size.getHeight() * 0.8);
        int endScroll = (int) (size.getHeight() * 0.2);
            new TouchAction(getDriver())
                .press(PointOption.point(0, starScroll))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, endScroll))
                        .release()
                        .perform();
    }

    public void scrollEClick(By by, By by1){
        int retry = 0;
        while(retry++ <= 7){
            if(by != by1) {
                scroll();
            }
            getDriver().findElement(by).click();
        }
    }

    public void esperarPorTermos(){
        WebDriverWait wait = new WebDriverWait(DriverConfig.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='TERMOS & CONDIÇÕES DE USO DO APLICATIVO DA EAQ']")));
    }

    public void clicarOk() {
        clicarPorTexto("OK ");
    }

    public void iniciarTeste() {
        clicarPorTexto("INICIAR TESTE ");
    }

    public void esperarPorAviso(){
        WebDriverWait wait = new WebDriverWait(DriverConfig.getDriver(), 11);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Aviso']")));
    }

    public void esperarTesteFinalizar(){
        WebDriverWait wait = new WebDriverWait(DriverConfig.getDriver(), 40);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Teste Finalizado']")));
    }
}
