package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

public class UnSuccessfulLogin extends BasePage {

    @FindBy(xpath = "")
    WebElement errorMessages;

    public boolean visorError() { return errorMessages.isDisplayed();
    }

    public String getErrorText() {
        return errorMessages.getText();
    }
}