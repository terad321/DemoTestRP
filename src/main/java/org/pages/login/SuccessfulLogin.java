package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

public class SuccessfulLogin extends BasePage {

    @FindBy(xpath = "")
    WebElement HelloMessages;

    @FindBy(xpath = "")
    WebElement signOutButton;

    @FindBy(xpath = "")
    WebElement loginTitle;

//    public boolean messagesVisor(){ return HelloMessages.isDisplayed(); }
//
//    public String getMessagesText(){
//        return HelloMessages.getText();
//    }

    public boolean visorButton(){ return loginTitle.isDisplayed(); }

    public String getButtonText(){ return loginTitle.getText();}

    public boolean isSignOutButton(){ return signOutButton.isDisplayed(); }

    public LoginPage signOut(){
        signOutButton.click();
        return new LoginPage();
    }
}
