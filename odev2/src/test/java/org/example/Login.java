package org.example;

import org.example.Base.BaseTest;
import org.example.Pages.ButtonPage;
import org.example.Pages.LoginPage;
import org.example.Pages.RegisterPage;
import org.junit.Before;
import org.testng.annotations.*;

public class Login extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ButtonPage buttonPage =new ButtonPage();
    RegisterPage registerPage = new RegisterPage();
    private String randomUsername;
    @BeforeClass
    public void createUser() {
        buttonPage.registerScreen();
        registerPage.firstNameDoldur("huseyin");
        registerPage.lastNameDoldur("genc");
        registerPage.addressDoldur("GebzeKocaeli");
        registerPage.cityDoldur("Kocaeli");
        registerPage.stateDoldur("Gebze");
        registerPage.zipCodeDoldur("41400");
        registerPage.phoneNumberDoldur("123456789");
        registerPage.ssnDoldur("asdqew");
        randomUsername = registerPage.randomUsernameDoldur();
        registerPage.passwordDoldur("123");
        registerPage.repeatedPasswordDoldur("123");
        buttonPage.register();
        registerPage.successfulUserCreationControl("Welcome " + randomUsername);
        buttonPage.logoutYap();

    }
    @Test(description = "Hatalı Kullanıcı Girişi", priority = 1)
    public void Test1() {
        loginPage.usernameDoldur("deneme123456");
        loginPage.passwordDoldur("deneme1234654343");
        buttonPage.loginYap();
        loginPage.errorMessageController("An internal error has occurred and has been logged.");
    }

    @Test(description = "Validasyon Kontrolleri: Password Bos Kalma Durumu", priority = 2)
    public void Test2() {
        loginPage.usernameDoldur("QAtest Deneme");
        loginPage.passwordDoldur("");
        buttonPage.loginYap();
        loginPage.errorMessageController("Please enter a username and password.");
    }
    @Test(description = "Validasyon Kontrolleri: username Bos Kalma Durumu", priority = 3)
    public void Test3() {
        loginPage.usernameDoldur("");
        loginPage.passwordDoldur("qatestDeneme");
        buttonPage.loginYap();
        loginPage.errorMessageController("Please enter a username and password.");

    }
    @Test(description = "Validasyon Kontrolleri: username ve password Bos Kalma Durumu", priority = 4)
    public void Test4() {
        loginPage.usernameDoldur("");
        loginPage.passwordDoldur("");
        buttonPage.loginYap();
        loginPage.errorMessageController("Please enter a username and password.");
    }

    @Test(description = "Başarılı Kullanıcı Girişi", priority = 5)
    public void Test5() {
        loginPage.usernameDoldur(randomUsername);
        loginPage.passwordDoldur("123");
        buttonPage.loginYap();
        loginPage.userInformationMessageContoroller("Welcome huseyin genc");
    }
}
