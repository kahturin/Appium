package org.example;

import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

    @AfterClass
    public static void encerrar(){
        DriverConfig.killDriver();
    }

    @After
    public void resetApp(){
        DriverConfig.getDriver().resetApp();
    }

    public void waitFor(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
