package br.com.betternow.eaq_app.test;

import br.com.betternow.eaq_app.core.BaseTest;
import br.com.betternow.eaq_app.page.PermissoesPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Permissoes extends BaseTest {
    private final PermissoesPage page = new PermissoesPage();

    @Before
    public void before(){
        page.esperarPorTermos();
        //page.scroll(0.5, 0.9, 0.5, 0.1);
        page.clicarAceitoOsTermos();
    }

    @Test
    public void AcceptUserPermissions(){ //Aceitar as permissões do usuário
        //Acesso a tela de permissões
        Assert.assertEquals("Permissões", page.getPermissoes());

        //Aceitar os Termos e Condições do App.
        page.concederPermissoes();
        page.aceitarTodasPermissoes();
    }

    @Test
    public void clicarNoBotaoFecharEmPermissoes(){  //Clicar sobre o botão fechar na tela de permissões
        page.clicarFechar();
        Assert.assertEquals("Aguardando Início do Teste", page.getTituloPaginaPrincipal());
    }

    @Test
    public void iniciarTesteSemAceitarPermissoes(){ //Iniciar um teste após fechar a tela de permissões sem aceitar as permissões.
        page.concederPermissoes();
        page.negarPermissoes();
        page.esperarPorAviso();
        page.clicarOk();
        page.iniciarTeste();
    }
}
