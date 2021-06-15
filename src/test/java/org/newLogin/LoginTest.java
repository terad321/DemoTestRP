package org.newLogin;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.login.LoginPage;
import org.pages.login.SuccessfulLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        goToUrl(Url.BASE_URL);
        String email = "terad321+221@gmail.com";
        String pass = "111111";
        LoginPage loginPage = new LoginPage().loginPage(email, pass);
    }

    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(loginPage.getButtonText(), "Remember me");
        SuccessfulLogin successfulLogin = new SuccessfulLogin();
        Assert.assertEquals(successfulLogin.checkProfile(), "andrey +221");
        Thread.sleep(1000);
//        successfulLogin.signOut();

//        Assert.assertTrue(successfulLogin.visorButton());
//        Assert.assertEquals(successfulLogin.getButtonText(), "Login");
//        Assert.assertTrue(successfulLogin.isSignOutButton());
    }
}
