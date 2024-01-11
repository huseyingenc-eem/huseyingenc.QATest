package org.example.Pages;

//import jdk.jpackage.internal.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;


public class LoginPage extends BaseTest{
    @Step("email alanına metin girişi sağlanır")
    public void usernameDoldur(String text){
        driver.findElement(By.name("username")).sendKeys(text);
    }

    @Step("Password alanına metin girişi sağlanır")
    public void passwordDoldur(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Step("Error Mesaj Kontrolü")
    public void errorMessageController(String text){
        String value = driver.findElement(By.cssSelector("[class=\"error\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Kullanıcı Gırışı Kontrolü")
    public void userInformationMessageContoroller(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p")).getText();
        Assert.assertEquals(value, text);
    }


}
