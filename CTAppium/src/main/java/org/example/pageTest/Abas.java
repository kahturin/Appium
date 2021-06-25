package org.example.pageTest;

import org.example.BaseTest;
import org.example.page.AbasPage;
import org.example.page.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class Abas extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AbasPage page = new AbasPage();

    @Test
    public void checarConteudoDoAbas(){
        menu.irParaAbas();
        Assert.assertEquals("Este é o conteúdo da Aba 1", page.descricaoAba1());
        page.clicarNaAba2();
        Assert.assertEquals("Este é o conteúdo da Aba 2", page.descricaoAba2());
    }
}
