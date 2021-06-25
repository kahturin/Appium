package org.example.page;

import org.example.BasePage;
import org.openqa.selenium.By;

public class AlertPage extends BasePage {

    public void clicarAlertConfirm(){
        clicarPorTexto("ALERTA CONFIRM");
    }

    public String tituloAlert() {
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String descricaoAlert() {
        return obterTexto(By.id("android:id/message"));
    }

    public void confirm(){
        clicarPorTexto("CONFIRMAR");
    }

    public void sair(){
        clicarPorTexto("SAIR");
    }

    public void clicarAlertaSimples(){
        clicarPorTexto("ALERTA SIMPLES");
    }

}
