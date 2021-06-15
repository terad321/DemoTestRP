package org.createMessage;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.message.AddMessage;
import org.pages.login.LoginPage;
import org.pages.login.SuccessfulLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.UUID;

public class CreateMessageTest extends BaseTest {

    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();

    @BeforeMethod
    public void beforeMethod() {
        goToUrl(Url.BASE_URL);
        String email = "terad321+221@gmail.com";
        String pass = "111111";
        LoginPage loginPage = new LoginPage().loginPage(email, pass);
    }

    @Test
    public void createMessageTest () throws InterruptedException {
        SuccessfulLogin successfulLogin = new SuccessfulLogin();
        Assert.assertEquals(successfulLogin.checkProfile(), "andrey +221");
        goToUrl(Url.my_message);
        AddMessage addMessage = new AddMessage().clickMessage().createTextMessage(uuidAsString).clickSend();
        Thread.sleep(500);
        Assert.assertEquals(addMessage.getListMessage(), uuidAsString);
    }
}
