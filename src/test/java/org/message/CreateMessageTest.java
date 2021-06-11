package org.message;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.login.LoginPage;
import org.pages.message.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateMessageTest extends BaseTest {

    String email = "terad321+221@gmail.com";
    String pass = "111111";
    String text = "test new post";

//    @BeforeMethod
//    public void beforeMethod() {
//        goToUrl(Url.BASE_URL);
//    }

    @Test(priority=1)
    public void logInWithValidUsernameAndPasswordTest() throws InterruptedException {
        goToUrl(Url.BASE_URL);
        LoginPage loginPage = new LoginPage().successfulLogin(email, pass);
        Assert.assertEquals(loginPage.getMessagesText(), "Remember me");
        Assert.assertEquals(loginPage.getTextInLogin(), "andrey +221");
    }

    @Test(priority=2)
    public void createMessage() throws InterruptedException {
        Message message = new Message();
        goToUrl(Url.my_message);
        message.clickMessage();
        message.createText(text);
        message.clickSend();
        Thread.sleep(1000);
    }
}
