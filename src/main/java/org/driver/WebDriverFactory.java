package org.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    public static WebDriver initDriver(DriverType driverType) {

        switch (driverType) {
            case OPERA: {
                WebDriverManager.operadriver().version("90").setup();
                return new OperaDriver();
            }
            case FIREFOX: {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case CHROME:
            default: {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
        }
    }
    public static WebDriver initDriver() {
        DriverType driverType = DriverType.valueOf(System.getProperty("org.driver.type").toUpperCase());
        return initDriver(driverType);
    }
}