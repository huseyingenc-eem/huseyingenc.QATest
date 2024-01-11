package org.example.Pages;

import io.qameta.allure.Step;
import org.example.Base.BaseTest;
// org.junit.Assert;
import org.openqa.selenium.By;

public class ButtonPage extends BaseTest {


    @Step("Gırıs Yap Buttonuna tıklanır")
    public void loginYap(){
        driver.findElement(By.cssSelector("[value=\"Log In\"]")).click();
    }

    @Step("Regıster Buttonuna tıklanır")
    public void registerScreen(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
    }

    @Step("Kayıt Etme Butonuna Tıklanır")
    public void register(){
        driver.findElement(By.cssSelector("[value=\"Register\"]")).click();
    }
    @Step("Cıkıs Yap Buttonuna tıklanır")
    public void logoutYap(){
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }


}
