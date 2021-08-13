package br.com.betternow.eaq_app.acceptence.steps;

import br.com.betternow.eaq_app.page.PermissoesPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Before;

public class PermissoesStep {

    private PermissoesPage page = new PermissoesPage();


    @Dado("que estou na tela de termos e condicoes")
    public void queEstouNaTelaDeTermosECondicoes() {
        page.esperarPorTermos();

    }

    @Quando("clico em aceitar os termos")
    public void clicoEmAceitarOsTermos() {
        //page.scroll(0.5, 0.9, 0.5, 0.1);
        page.clicarAceitoOsTermos();
    }

    @Entao("valido se passei para a tela de permissoes")
    public void validoSePasseiParaATelaDePermissoes() {

    }



    @Dado("que aceitei os termos e condicoes")
    public void queAceiteiOsTermosECondicoes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clico em fechar na tela de permissoes")
    public void clicoEmFecharNaTelaDePermissoes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Entao("valido se passei para a tela principal")
    public void validoSePasseiParaATelaPrincipal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("que estou na tela de permissoes")
    public void queEstouNaTelaDePermissoes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clico em conceder permissoes")
    public void clicoEmConcederPermissoes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Quando("nego todas as permissoes")
    public void negoTodasAsPermissoes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("inicio um teste na tela principal")
    public void inicioUmTesteNaTelaPrincipal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
