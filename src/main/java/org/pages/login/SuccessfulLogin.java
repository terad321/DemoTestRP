package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

public class SuccessfulLogin extends BasePage {

    @FindBy(xpath = "//div[@class='profile-name d-flex align-items-center']")
    WebElement checkProfile;

    @FindBy(xpath = "//app-profile-menu[@class='d-lg-none']//div[@class='profile-menu']//button")
    WebElement signOutButton;

    @FindBy(xpath = "//app-profile-menu[@class='d-lg-none']//div[@class='profile-menu']//button")
    WebElement dropList;

//    public boolean visorButton(){ return loginTitle.isDisplayed(); }
//
//    public String getButtonText(){ return loginTitle.getText();}

    public String checkProfile(){ return checkProfile.getText(); }

    public LoginPage signOut(){
        signOutButton.click();
        return new LoginPage();
    }
}
