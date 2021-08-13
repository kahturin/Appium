package br.com.betternow.eaq_app.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
    private static void createDriver()  {
        File apk = new File("C:\\Users\\Karina\\IdeaProjects\\AppEaq\\src\\main\\resources\\appeaq-ax-v3.50.7.apk");
        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
//        configuracoes.setCapability("appPackage", "com.eaq.measurement");
//        configuracoes.setCapability("appActivity", "com.eaq.measurement.MainActivity");
//        configuracoes.setCapability("deviceName","AOSP on IA Emulator");
//        configuracoes.setCapability("ueid","358240051111110");

        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        configuracoes.setCapability(MobileCapabilityType.NO_RESET, false);
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), configuracoes);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.context("NATIVE_APP");//WEBVIEW_com.eaq.measurement
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
