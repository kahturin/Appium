package br.com.betternow.eaq_app.core;

import org.openqa.selenium.By;

public class Navegacao extends BasePage{

    private final BasePage page = new BasePage();

    public void irParaTelaPrincipalAceitandoTermos(){
        page.esperarPorTermos();
        page.scrollEClick(By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"), By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"));
//        page.clicarAceitoOsTermos();
//        irParaFinalTermosECondicoes();
        page.concederPermissoes();
        page.aceitarTodasPermissoes();
        page.esperarPorAviso();
        page.clicarOk(); //android.widget.Button[@text='ACEITO OS TERMOS ']

    }

    public void irParaFinalTermosECondicoes(){
        page.esperarPorTermos();
        //page.scrollEClick(By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"));
        //page.scrollDown(By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"), By.xpath("//android.widget.Button[@text='CONCEDER PERMISSÕES ']") ,0.5, 0.9, 0.5, 0.1);
        //page.scroll(0.5, 0.9, 0.5, 0.1);
    }
}
