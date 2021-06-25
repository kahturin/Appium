package org.example.page;

import org.example.BasePage;
import org.openqa.selenium.By;

public class AbasPage extends BasePage {

    public String descricaoAba1(){
        return obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 1']"));
    }

    public void clicarNaAba2(){
        clicarPorTexto("ABA 2");
    }

    public String descricaoAba2() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 2']"));
    }
}
