package org.pages;

import org.driver.DriverHolder;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverHolder.getInstance().getDriver(), this);
    }
}