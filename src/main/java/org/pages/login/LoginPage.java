package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

import java.util.List;

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

    @FindBy(xpath = "//div[@class='profile-name d-flex align-items-center']")
    WebElement checkProfile;

    @FindBy(xpath = "//div[@placeholder='Post an update, article or question']")
    WebElement text;

    @FindBy(xpath = "//*[@class='message ng-star-inserted']//button[@class='icon SEND']")
    WebElement send;

    @FindBy(xpath = "//*[@id='viewMode']/app-post-content/div/div")
    List<WebElement> listPost;

    public String getMessagesText(){ return checkBox.getText(); }
    public String getTextInLogin(){ return checkProfile.getText(); }
    public LoginPage loginEmail(String userEmail) {
        email.sendKeys(userEmail);
        return this;
    }
    public LoginPage loginPassword(String userPass) {
        password.sendKeys(userPass);
        return this;
    }

    public LoginPage successfulLogin(String loginEmail, String loginPassword) {
        loginButton.click();
        loginEmail(loginEmail).loginPassword(loginPassword);
        loginButton2.click();
        return this;
    }
    public UnSuccessfulLogin unSuccessfulLogin(String loginEmail, String loginPassword) {
        loginButton.click();
        return new UnSuccessfulLogin();
    }

    public LoginPage createText(String createText) {
        text.sendKeys(createText);
        return this;
    }
    public LoginPage clickCreatePost() {
        send.click();
        return this;
    }
    public String getListPost() { return listPost.get(0).getText();  }
}