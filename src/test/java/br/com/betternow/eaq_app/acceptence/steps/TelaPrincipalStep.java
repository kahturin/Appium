package br.com.betternow.eaq_app.acceptence.steps;

import br.com.betternow.eaq_app.core.Navegacao;
import br.com.betternow.eaq_app.page.TelaPrincipalPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class TelaPrincipalStep {
    Navegacao nav = new Navegacao();
    TelaPrincipalPage page = new TelaPrincipalPage();



    @Dado("que estou na tela principal")
    public void queEstouNaTelaPrincipal() {
        nav.irParaTelaPrincipalAceitandoTermos();
    }

    @Quando("clico no botao de interrogacao")
    public void clicoNoBotaoDeInterrogacao() {
        page.clicarPontoDeInterrogacao();
    }

    @Entao("valido a pagina de resultado")
    public void validoAPaginaDeResultado() {
        Assert.assertEquals("Entenda seu Resultado", page.getResultPontoInterrogacao());
    }



    @Quando("clico no menu ajustes")
    public void clicoNoMenuAjustes() {
        page.clicarAjustes();
    }

    @Entao("valido a pagina de ajustes")
    public void validoAPaginaDeAjustes() {
        Assert.assertEquals("Ajustes", page.getTituloAjustes());
    }



    @Quando("clico no menu historico")
    public void clicoNoMenuHistorico() {
        page.clicarHistorico();
    }

    @Entao("valido a pagina de historico")
    public void validoAPaginaDeHistorico() {
        Assert.assertEquals("Histórico", page.getTituloHistorico());
    }



    @Quando("clico no menu Resumo")
    public void clicoNoMenuResumo() {
        page.clicarResumo();
    }

    @Entao("valido a pagina de Resumo")
    public void validoAPaginaDeResumo() {
        Assert.assertEquals("Resumo", page.getTituloResumo());
    }


    @Quando("clico em iniciar teste")
    public void clicoEmIniciarTeste() {
        page.scroll();
        page.iniciarTeste();
    }

    @E("espero o teste finalizar")
    public void esperoOTesteFinalizar() {
        page.esperarTesteFinalizar();
    }

    @Entao("valido se o teste foi concluido")
    public void validoSeOTesteFoiConcluido() {
        Assert.assertEquals("Teste Finalizado", page.getTituloFinalDoTeste());
    }


    @E("clico em cancelar teste")
    public void clicoEmCancelarTeste() {
        page.scroll();
        page.cancelarTeste();
    }

    @Entao("valido se o teste foi cancelado")
    public void validoSeOTesteFoiCancelado() {
        //Assert.assertEquals("Teste Cancelado"), page.
    }
}
