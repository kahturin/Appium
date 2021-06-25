package org.example.page;

import org.example.BasePage;
import org.openqa.selenium.By;

public class AccordionPage extends BasePage {

    public void clicarOpcao1(){
        clicarPorTexto("Opção 1");
    }

    public String validarOpcao1() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 1']"));
        //return obterTexto(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));

    }
}
