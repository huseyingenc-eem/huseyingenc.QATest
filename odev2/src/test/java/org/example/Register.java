package org.example;

import org.example.Base.BaseTest;
import org.example.Pages.ButtonPage;
import org.example.Pages.LoginPage;
import org.example.Pages.RegisterPage;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Register extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    ButtonPage buttonPage =new ButtonPage();


    @Test(description = "Error: sifre uyusmazlıgı Ile Kullanıcı Olusturma", priority = 1)
    public void Test1() {
        buttonPage.registerScreen();
        registerPage.firstNameDoldur("huseyin");
        registerPage.lastNameDoldur("genc");
        registerPage.addressDoldur("GebzeKocaeli");
        registerPage.cityDoldur("Kocaeli");
        registerPage.stateDoldur("Gebze");
        registerPage.zipCodeDoldur("41400");
        registerPage.phoneNumberDoldur("123456789");
        registerPage.ssnDoldur("asdqew");
        registerPage.randomUsernameDoldur();
        registerPage.passwordDoldur("123asd123");
        registerPage.repeatedPasswordDoldur("asd");
        buttonPage.register();
        registerPage.repeatedMessageControl("Passwords did not match.");
    }
    @Test(description = "Error: Bos Alanlar Ile Kullanıcı Olusturma", priority = 2)
    public void Test2() {
        buttonPage.registerScreen();
        buttonPage.register();
        registerPage.checkFirstNameError("First name is required.");
        registerPage.checkLastNameError("Last name is required.");
        registerPage.checkAdressError("Address is required.");
        registerPage.checkCityError("City is required.");
        registerPage.checkStateError("State is required.");
        registerPage.checkZipError("Zip Code is required.");
        registerPage.checkSsnError("Social Security Number is required.");
        registerPage.checkUsernameError("Username is required.");
        registerPage.checkPasswordError("Password is required.");
        registerPage.checkRepeatedPasswordError("Password confirmation is required.");
    }
    @Test(description = "Kullanıcı Olusturma", priority = 3)
    public void Test3() {

        buttonPage.registerScreen();
        registerPage.firstNameDoldur("huseyin");
        registerPage.lastNameDoldur("genc");
        registerPage.addressDoldur("GebzeKocaeli");
        registerPage.cityDoldur("Kocaeli");
        registerPage.stateDoldur("Gebze");
        registerPage.zipCodeDoldur("41400");
        registerPage.phoneNumberDoldur("123456789");
        registerPage.ssnDoldur("asdqew");
        String randomUsername = registerPage.randomUsernameDoldur();
        registerPage.passwordDoldur("123asd123");
        registerPage.repeatedPasswordDoldur("123asd123");
        buttonPage.register();
        registerPage.successfulUserCreationControl("Welcome "+ randomUsername);
    }

}
