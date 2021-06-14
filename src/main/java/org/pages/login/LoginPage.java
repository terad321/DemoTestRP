package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='btn login']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@id='log_email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='log_password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton2;
    @FindBy(xpath = "//*[@class='mat-checkbox-label']")
    WebElement checkBox;

    public String getButtonText(){ return checkBox.getText();}

    public LoginPage loginEmail(String userEmail) {
        email.sendKeys(userEmail);
        return this;
    }
    public LoginPage loginPassword(String userPass) {
        password.sendKeys(userPass);
        return this;
    }
    public LoginPage loginPage(String loginEmail, String loginPassword) {
        loginButton.click();
        loginEmail(loginEmail).loginPassword(loginPassword);
        loginButton2.click();
        return new LoginPage();
    }
    public UnSuccessfulLogin unSuccessfulLogin(String loginEmail, String loginPassword) {
        loginButton.click();
        return new UnSuccessfulLogin();
    }
}