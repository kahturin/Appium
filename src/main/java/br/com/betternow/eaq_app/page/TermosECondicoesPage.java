package br.com.betternow.eaq_app.page;

import br.com.betternow.eaq_app.core.BasePage;
import org.openqa.selenium.By;

public class TermosECondicoesPage extends BasePage {

    public String getTitulo(){
        return obterTexto(By.xpath("//android.view.View[@text='TERMOS & CONDIÇÕES DE USO DO APLICATIVO DA EAQ']"));
    }

    public void clicarAceitoOsTermos(){
        clicarPorTexto("ACEITO OS TERMOS ");
    }

    public String getPermissoes(){
        return obterTexto(By.xpath("//android.view.View[@text='Permissões']"));
    }

    public String getAceitoOsTermos() {
        return obterTexto(By.xpath("//android.widget.Button[@text='ACEITO OS TERMOS ']"));
    }

}
