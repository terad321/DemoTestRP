package org.createPost;

import org.BaseTest;
import org.infrastructure.Url;
import org.pages.login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.UUID;

public class CreatePostTest extends BaseTest {

    String email = "terad321+221@gmail.com";
    String pass = "111111";
    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();

    @Test
    public void createPostInVerification() throws InterruptedException {
        goToUrl(Url.BASE_URL); //Переходим на стартовую страницу ресурка
        LoginPage loginPage = new LoginPage().successfulLogin(email, pass); //Авторизация
        Assert.assertEquals(loginPage.getMessagesText(), "Remember me"); //Проверка что форма авторизации открыта
        Assert.assertEquals(loginPage.getTextInLogin(), "andrey +221"); //Роверка что авторизация прошла успешно

        goToUrl(Url.my_account); //Переходим на страницу профиля для создания поста
        loginPage.createText(uuidAsString); //Заполняем поле поста текстом, который генерируем рандомно
        loginPage.clickCreatePost();// Нажимаем кнопку создания поста
        Thread.sleep(1000); // Делаем ожидание для того чтобы получить созданый пост в список постов
        Assert.assertEquals(loginPage.getListPost(), uuidAsString); //Проверяем текст созданого поста
    }
}
