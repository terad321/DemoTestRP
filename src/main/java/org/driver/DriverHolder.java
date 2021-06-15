package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverHolder {

    private WebDriver driver;

    private static DriverHolder INSTANCE = null;

    public static DriverHolder getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DriverHolder();
        }
        return INSTANCE;
    }

    public  void initDriver(DriverType driverType){
        driver =  WebDriverFactory.initDriver(driverType);
        DriverHolder.getInstance().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverHolder.getInstance().getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    private DriverHolder() {
    }
}