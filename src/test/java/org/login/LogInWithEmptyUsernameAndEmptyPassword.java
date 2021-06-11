package org.login;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.login.LoginPage;
import org.pages.login.UnSuccessfulLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInWithEmptyUsernameAndEmptyPassword extends BaseTest {
    String email;
    String pass;

    @BeforeMethod
    public void beforeMethod() {
        goToUrl(Url.BASE_URL);
    }

    @Test
    public void logInWithEmptyUsernameAndEmptyPasswordTest() {
        UnSuccessfulLogin unSuccessfulLogin = new LoginPage().unSuccessfulLogin(email, pass);
        Assert.assertTrue(unSuccessfulLogin.visorError());
        Assert.assertEquals(unSuccessfulLogin.getErrorText(), "Error:");
    }
}