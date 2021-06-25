package org.example.pageTest;

import org.example.BaseTest;
import org.example.DriverConfig;
import org.example.page.FormularioPage;
import org.example.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Formulario extends BaseTest {

    private final MenuPage menu = new MenuPage();
    private final FormularioPage page = new FormularioPage();

    @Before
    public void inicializarAppium() throws MalformedURLException {
        menu.irParaFormulario();
    }

    @Test
    public void preencherFormularioDemorado(){
        page.setName("karina");
        page.selectCombo("PS4");

        Assert.assertFalse(page.markedCheckbox());
        Assert.assertTrue(page.markedSwitch());

        page.clickOnSwitch();
        page.clickOnCheckbox();
        DriverConfig.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        page.clickOnSaveLate();
        WebDriverWait wait = new WebDriverWait(DriverConfig.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: karina']")));
        Assert.assertEquals("Nome: karina", page.valueName());
    }

    @Test
    public void preencherFormulario() throws MalformedURLException {
        page.setName("karina");
        page.selectCombo("PS4");

        Assert.assertFalse(page.markedCheckbox());
        Assert.assertTrue(page.markedSwitch());

        page.clickOnSwitch();
        page.clickOnCheckbox();
        page.clickOnSave();

        Assert.assertEquals("Nome: karina", page.valueName());
        Assert.assertEquals("Console: ps4", page.console());
        Assert.assertTrue(page.getSwitch());
        Assert.assertTrue(page.getCheckbox());
    }
}
