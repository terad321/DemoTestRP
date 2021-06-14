package org.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BasePage;

import java.util.List;

public class AddMessage extends BasePage {

    @FindBy(xpath = "//div[@class='chat-wrapper ng-star-inserted']/div[1]")
    WebElement clickMessage ;

    @FindBy(xpath = "//div[@placeholder='Write a message or attach file']")
    WebElement textMessage;

    @FindBy(xpath = "//app-messages-dialog-chat[@class='ng-star-inserted']//button[@class='icon SEND']")
    WebElement sendMessage;

    @FindBy(xpath = "//app-messages-dialog-chat-message[@class='ng-star-inserted']//app-message-text[@class='message-box']")
    List<WebElement> listMessage;

    public AddMessage clickMessage() {
        clickMessage.click();
        return this;
    }
    public AddMessage createTextMessage(String createText) {
        textMessage.sendKeys(createText);
        return this;
    }
    public AddMessage clickSend() {
        sendMessage.click();
        return this;
    }
    public String getListMessage() { return
            //какой-то цикл написать для работы с списком
            listMessage.get(40).getText();  }
}
