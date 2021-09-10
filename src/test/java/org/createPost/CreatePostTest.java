package org.createPost;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.post.AddPost;
import org.pages.login.LoginPage;
import org.pages.login.SuccessfulLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.UUID;

public class CreatePostTest extends BaseTest {

    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();

    @BeforeMethod
    public void beforeMethod() {
        goToUrl(Url.BASE_URL);
        String email = "terad321+221@gmail.com";
        String pass = "111111";
        LoginPage loginPage = new LoginPage().loginPage(email, pass);
    }

    @Test()
    public void createPostTest() throws InterruptedException {
        SuccessfulLogin successfulLogin = new SuccessfulLogin();
        Assert.assertEquals(successfulLogin.checkProfile(), "andrey +221");

        goToUrl(Url.my_account); //Переходим на страницу профиля для создания поста
        AddPost addPost = new AddPost().createText(uuidAsString).clickCreatePost();

        Thread.sleep(5000); // Делаем ожидание для того чтобы получить созданый пост в список постов
        Assert.assertEquals(addPost.getListPost(), uuidAsString); //Проверяем текст созданого поста
    }
}
