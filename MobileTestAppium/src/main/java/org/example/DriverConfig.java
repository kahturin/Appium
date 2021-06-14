package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
    public final AppiumDriver driver;
    private static DriverConfig _instance;

    public static DriverConfig Instance(){
        if(DriverConfig._instance == null){
            DriverConfig._instance = new DriverConfig();
        }
        return DriverConfig._instance;
    }
    private DriverConfig() {

        File apk = new File("C:\\Users\\Karina\\IdeaProjects\\MobileTestAppium\\src\\main\\resources\\CTAppium_1_2.apk");

        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //configuracoes.setCapability(MobileCapabilityType.NO_RESET,true);
        URL urlConexao = null;
        try {
            urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AppiumDriver<>(urlConexao, configuracoes);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
