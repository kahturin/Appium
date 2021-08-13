package br.com.betternow.eaq_app.page;

import br.com.betternow.eaq_app.core.BasePage;
import org.openqa.selenium.By;

public class PermissoesPage extends BasePage {

    public String getPermissoes(){
        return obterTexto(By.xpath("//android.view.View[@text='Permissões']"));
    }

    public void clicarFechar(){
        clicarPorTexto("FECHAR ");
    }

    public String getTituloPaginaPrincipal(){
        return obterTexto(By.xpath("//android.view.View[@text='Aguardando Início do Teste']"));
    }

}
