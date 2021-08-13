package br.com.betternow.eaq_app.test;

import br.com.betternow.eaq_app.core.BasePage;
import br.com.betternow.eaq_app.core.BaseTest;
import br.com.betternow.eaq_app.core.DriverConfig;
import br.com.betternow.eaq_app.core.Navegacao;
import br.com.betternow.eaq_app.page.TelaPrincipalPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TelaPrincipal extends BaseTest {

    private final TelaPrincipalPage page = new TelaPrincipalPage();
    private final Navegacao nav = new Navegacao();

    @Test
    public void botaoInterrogacao() { //Entendendo o resultado(Botão com “?”)

        nav.irParaTelaPrincipalAceitandoTermos();
        page.clicarPontoDeInterrogacao();
        Assert.assertEquals("Entenda seu Resultado", page.getResultPontoInterrogacao());
    }

    @Test
    public void acessarAjustes(){ //Validar Acesso ao menu Ajustes
        nav.irParaTelaPrincipalAceitandoTermos();
        page.clicarAjustes();
        Assert.assertEquals("Ajustes", page.getTituloAjustes());
    }

    @Test
    public void acessarHistorico(){ //Validar Acesso ao menu Historico
        nav.irParaTelaPrincipalAceitandoTermos();
        page.clicarHistorico();
        Assert.assertEquals("Histórico", page.getTituloHistorico());
    }

    @Test
    public void acessarResumo() { //Validar Acesso ao menu Resumo
        nav.irParaTelaPrincipalAceitandoTermos();
        page.clicarResumo();
        Assert.assertEquals("Resumo", page.getTituloResumo());
    }

    @Test
    public void fazerIniciacaoDoTeste() { //Primeira iniciação
        nav.irParaTelaPrincipalAceitandoTermos();
//        page.scrollEClick(By.));
//        page.scrollEClick(By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"));
        page.iniciarTeste();
        page.esperarTesteFinalizar();
        Assert.assertEquals("Teste Finalizado", page.getTituloFinalDoTeste());
    }

    @Test
    public void cancelarTeste(){ //Cancelamento de Teste no APP
        nav.irParaTelaPrincipalAceitandoTermos();
        BasePage.scroll();
        page.iniciarTeste();
        BasePage.scroll();
        page.cancelarTeste();
        //Assert.assertEquals("Teste Cancelado"), page.

    }
}


