package br.com.betternow.eaq_app.acceptence.steps;

import br.com.betternow.eaq_app.core.Navegacao;
import br.com.betternow.eaq_app.page.TermosECondicoesPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import static br.com.betternow.eaq_app.core.DriverConfig.getDriver;
import static br.com.betternow.eaq_app.core.DriverConfig.killDriver;

public class TermosECondicoesStep {

    private final Navegacao nav = new Navegacao();
    TermosECondicoesPage page = new TermosECondicoesPage();

    @Dado("que inicio o aplicativo")
    public void queInicioOAplicativo() {
        getDriver();
    }

    @Quando("espero a tela de termos aparecer")
    public void esperoATelaDeTermosAparecer() {
        page.esperarPorTermos();
    }

    @Entao("valido se estou na tela correta")
    public void validoSeEstouNaTelaCorreta() {
        Assert.assertEquals("TERMOS & CONDIÇÕES DE USO DO APLICATIVO DA EAQ", page.getTitulo());
    }

    @Dado("que estou no final da tela de termos e condicoes")
    public void queEstouNoFinalDaTelaDeTermosECondicoes() {
        nav.irParaFinalTermosECondicoes();
    }

    @Quando("clico em aceitar os termos")
    public void clicoEmAceitarOsTermos() {
        page.clicarAceitoOsTermos();
    }

    @Entao("valido se passei para a tela de permissoes")
    public void validoSePasseiParaATelaDePermissoes() {
        Assert.assertEquals("Permissões", page.getPermissoes());
    }

    @Quando("valido se ha botao de aceitar termos")
    public void validoSeHaBotaoDeAceitarTermos() {
        Assert.assertEquals("ACEITO OS TERMOS ", page.getAceitoOsTermos());
    }

    @Entao("fecho o aplicativo")
    public void fechoOAplicativo() {
        killDriver();
    }
}
