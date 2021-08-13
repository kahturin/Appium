package br.com.betternow.eaq_app.core;

import org.junit.After;

public class BaseTest {

    @After
    public void after(){
        DriverConfig.killDriver();
    }

}
