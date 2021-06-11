package org.login;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInWithValidUsernameAndPassword extends BaseTest {
    String email = "terad321+221@gmail.com";
    String pass = "111111";

    @BeforeMethod
    public void beforeMethod() {
        goToUrl(Url.BASE_URL);
    }

    @Test
    public void logInWithValidUsernameAndPasswordTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage().successfulLogin(email, pass);

        Assert.assertEquals(loginPage.getMessagesText(), "Remember me");
        Thread.sleep(5000);
        Assert.assertEquals(loginPage.getTextInLogin(), "andrey +221");
        Thread.sleep(5000);

//        Assert.assertTrue(successfulLogin.isSignOutButton());
//        successfulLogin.signOut();
//        Assert.assertTrue(successfulLogin.visorButton());
//        Assert.assertEquals(successfulLogin.getButtonText(), "Login");
    }
}
