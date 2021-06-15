package org.pages.post;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

import java.util.List;

public class AddPost extends BasePage {

    @FindBy(xpath = "//div[@placeholder='Post an update, article or question']")
    WebElement text;

    @FindBy(xpath = "//*[@class='message ng-star-inserted']//button[@class='icon SEND']")
    WebElement send;

    @FindBy(xpath = "//*[@id='viewMode']/app-post-content/div/div")
    List<WebElement> listPost;

    public AddPost createText(String createText) {
        text.sendKeys(createText);
        return this;
    }
    public AddPost clickCreatePost() {
        send.click();
        return this;
    }
    public String getListPost() { return listPost.get(0).getText();  }
}
