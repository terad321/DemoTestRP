package org;

import org.driver.DriverHolder;
import org.driver.DriverType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() throws IOException {
        DriverHolder.getInstance().initDriver(DriverType.CHROME);
    }

    protected void goToUrl(String url) {
        DriverHolder.getInstance().getDriver().get(url);
    }

    @AfterMethod
    public void afterMethod(){
        DriverHolder.getInstance().getDriver().quit();
    }

    @AfterSuite
    public void afterSuite() throws NullPointerException {
        DriverHolder.getInstance().getDriver().quit();
    }
}
