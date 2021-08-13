package br.com.betternow.eaq_app.page;

import br.com.betternow.eaq_app.core.BasePage;
import org.openqa.selenium.By;

public class TelaPrincipalPage extends BasePage {


    public void clicarPontoDeInterrogacao() {
        clicarPorTexto("help circle");
    }

    public String getResultPontoInterrogacao(){
        return obterTexto(By.xpath("//android.view.View[@text='Entenda seu Resultado']"));
    }

    public void clicarAjustes() {
        clicarPorTexto("cog Ajustes");
    }

    public String getTituloAjustes() {
        return obterTexto(By.xpath("//android.view.View[@text='Ajustes']"));
    }

    public void clicarHistorico() {
        clicarPorTexto("paper Histórico");
    }

    public String getTituloHistorico() {
        return obterTexto(By.xpath("//android.view.View[@text='Histórico']"));
    }

    public void clicarResumo() {
        clicarPorTexto("clipboard Resumo");
    }

    public String getTituloResumo() {
        return obterTexto(By.xpath("//android.view.View[@text='Resumo']"));
    }

    public String getTituloFinalDoTeste() {
        return obterTexto(By.xpath("//android.view.View[@text='Teste Finalizado']"));
    }

    public void cancelarTeste() {
        clicarPorTexto("CANCELAR TESTE ");
    }
}
