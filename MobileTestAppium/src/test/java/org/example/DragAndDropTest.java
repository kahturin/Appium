package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.PageObject.DragAndDrop;
import org.example.PageObject.OpcoesTestePageObject;
import org.junit.Test;

public class DragAndDropTest {

    @Test
    public void efetuarDragAndDrop(){
        AppiumDriver driver = DriverConfig.Instance().driver;

        OpcoesTestePageObject arrastar = new OpcoesTestePageObject(driver);
        arrastar.irParaDragAndDrop();
//        DragAndDrop dd = new DragAndDrop(driver);
//        dd.scrumList();
    }
}
