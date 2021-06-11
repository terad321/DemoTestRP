package org.pages.message;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message {

    @FindBy(xpath = "//div[@class='chat-wrapper ng-star-inserted']/div[1]")
    WebElement clickMessage ;

    @FindBy(xpath = "/html/body/app-root/app-wrapper/div/app-messages-container/section/div/div[2]/app-messages-dialog-chat/div[1]/div/app-message/section[1]/div[1]/app-new-message-input-field/div")
    WebElement text;

    @FindBy(xpath = "//*[@id=\"SEND\"]/g/path[3]")
    WebElement send;

    public String getText(){ return text.getText(); }
    public String getTextButton(){ return send.getText(); }

    public Message clickMessage() {
        clickMessage.click();
        return this;
    }

    public Message createText(String createText) {
        text.sendKeys(createText);
        return this;
    }

    public Message clickSend() {
        send.click();
        return this;
    }
}