package org.example.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.time.Duration;
import java.util.List;


public class DragAndDrop {

    private AppiumDriver driver;

    public DragAndDrop(AppiumDriver driver){
        this.driver = driver;
    }

    public void arrastar(String origem, String destino){

    }

    public String[] scrumList(){
        List<MobileElement> elementos = driver.findElementsByClassName("android.widget.TextView");
        String[] retorno = new String[elementos.size()];
        for(int i = 0; i < elementos.size(); i++){
            retorno[i] = elementos.get(i).getText();
            System.out.println("\"" + retorno[i] + "\", ");
        }
        return retorno;
    }

    public void scroll(double inicio, double fim){
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int)(size.height * inicio);
        int end_y = (int)(size.height * fim);

//        new TouchAction(driver)
//                //.press(x, start_y)
//                .waitAction(Duration.ofMillis(500))
//                .moveTo(x, end_y)
//                .release()
//                .perform();
    }
}
