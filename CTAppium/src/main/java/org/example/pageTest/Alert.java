package org.example.pageTest;

import org.example.BasePage;
import org.example.page.AlertPage;
import org.example.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Alert extends BasePage {

    private MenuPage menu = new MenuPage();
    private AlertPage page = new AlertPage();

    @Before
    public void before(){
        menu.irParaAlert();
    }

    @Test
    public void confirmarAlert(){
        page.clicarAlertConfirm();
        Assert.assertEquals("Info", page.tituloAlert());
        Assert.assertEquals("Confirma a operação?", page.descricaoAlert());
        page.confirm();
        Assert.assertEquals("Confirmado", page.descricaoAlert());
        page.sair();
    }


}
