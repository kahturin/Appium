package br.com.betternow.eaq_app.test;

import br.com.betternow.eaq_app.core.BaseTest;
import br.com.betternow.eaq_app.core.Navegacao;
import br.com.betternow.eaq_app.page.TermosECondicoesPage;
import org.junit.Assert;
import org.junit.Test;

public class TermosECondicoes extends BaseTest {

    private final TermosECondicoesPage page = new TermosECondicoesPage();
    private final Navegacao nav = new Navegacao();

    @Test
    public void abrirTermosEcondicoes() { //Abrir o Termos e Condições do App
        page.esperarPorTermos();
        Assert.assertEquals("TERMOS & CONDIÇÕES DE USO DO APLICATIVO DA EAQ", page.getTitulo());
    }

    @Test
    public void aceitarOsTermosECondicoesDoApp(){ //Aceitar os Termos e Condições do App.
        nav.irParaFinalTermosECondicoes();
        //page.clicarAceitoOsTermos();
        Assert.assertEquals("Permissões", page.getPermissoes());
    }

    @Test
    public void fecharAppSemAceitarOsTermos(){ //Fechar o App sem aceitar os Termos e Condições do App
        nav.irParaFinalTermosECondicoes();
        Assert.assertEquals("ACEITO OS TERMOS ", page.getAceitoOsTermos());
    }

}
