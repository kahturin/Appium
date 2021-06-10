package org.example.PageObjects;

import io.appium.java_client.AppiumDriver;

public abstract class PageObjectBase {

    protected final AppiumDriver driver;

    public PageObjectBase(AppiumDriver driver){
        this.driver = driver;
    }

    public abstract void buscarElementos();
}
