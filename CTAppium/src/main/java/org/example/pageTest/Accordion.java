package org.example.pageTest;

import org.example.BaseTest;
import org.example.page.AccordionPage;
import org.example.page.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class Accordion extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AccordionPage page = new AccordionPage();

    @Test
    public void verificarDescricaoNasOpcoes(){
        menu.irParaAccordion();
        page.clicarOpcao1();
        waitFor(1000);
        Assert.assertEquals("Esta é a descrição da opção 1", page.validarOpcao1());
    }
}
