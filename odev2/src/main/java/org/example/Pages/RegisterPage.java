package org.example.Pages;

import org.example.Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.Random;

public class RegisterPage extends BaseTest{
    @Step("Fırst Name Doldurulur")
    public void firstNameDoldur(String text){
        driver.findElement(By.id("customer.firstName")).sendKeys(text);
    }
    @Step("Last Name Doldurulur")
    public void lastNameDoldur(String text){
        driver.findElement(By.id("customer.lastName")).sendKeys(text);
    }

    @Step("Address Doldurulur")
    public void addressDoldur(String text){
        driver.findElement(By.id("customer.address.street")).sendKeys(text);
    }

    @Step("Cıty Doldurulur")
    public void cityDoldur(String city){
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
    }

    @Step("State Doldurulur")
    public void stateDoldur(String state){
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
    }

    @Step("Zıp Code Doldurulur")
    public void zipCodeDoldur(String zipCode){
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
    }

    @Step("Phone Number Doldurulur")
    public void phoneNumberDoldur(String text){
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
    }

    @Step("SSN Doldurulur")
    public void ssnDoldur(String text){
        driver.findElement(By.id("customer.ssn")).sendKeys(text);
    }

    @Step("Rastgale Username Doldurulur")
    public String randomUsernameDoldur() {
        String randomUsername = generateRandomUsername();
        driver.findElement(By.id("customer.username")).sendKeys(randomUsername);
        return randomUsername;
    }
    @Step("Rastgele Kullanıcı Adı Olusturulur")
    public String generateRandomUsername() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomUsername = new StringBuilder();
        Random random = new Random();
        int length = 8;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomUsername.append(characters.charAt(index));
        }

        return randomUsername.toString();
    }

    @Step("Password Doldurulur")
    public void passwordDoldur(String text){
        driver.findElement(By.id("customer.password")).sendKeys(text);
    }

    @Step("Repeated Password Doldurulur")
    public void repeatedPasswordDoldur(String text){
        driver.findElement(By.id("repeatedPassword")).sendKeys(text);
    }


    @Step("Repeated Password Kontrol saglanır")
    public void repeatedMessageControl(String text){
        String value = driver.findElement(By.id("repeatedPassword.errors")).getText();
        Assert.assertEquals(value,text);
    }
    @Step("Basarili Kullanici Olusturma")
    public void successfulUserCreationControl(String text){
        String value = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        Assert.assertEquals(value,text);
    }
    @Step("First Name Alanı Boş Gönderildiğinde Hata Kontrolu")
    public void checkFirstNameError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.firstName.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Step("Last Name Alanı Boş Gönderildiğinde Hata Kontrolu")
    public void checkLastNameError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.lastName.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Adress Alanı Boş Gönderildiğinde Hata Kontrolu")
    public void checkAdressError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.address.street.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("City Alanı Boş Gönderildiğinde Hata Kontrolu")
    public void checkCityError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.address.city.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("State Boş Gönderildiğinde Hata Kontrolu")
    public void checkStateError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.address.state.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Zip Boş Gönderildiğinde Hata Kontrolu")
    public void checkZipError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.address.zipCode.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Ssn Boş Gönderildiğinde Hata Kontrolu")
    public void checkSsnError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.ssn.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Username Boş Gönderildiğinde Hata Kontrolu")
    public void checkUsernameError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.username.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Pasword Boş Gönderildiğinde Hata Kontrolu")
    public void checkPasswordError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("customer.password.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Step("Repeated Pasword  Boş Gönderildiğinde Hata Kontrolu")
    public void checkRepeatedPasswordError(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.id("repeatedPassword.errors")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }



}

