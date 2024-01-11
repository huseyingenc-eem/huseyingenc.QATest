package org.example.Pages;


import io.qameta.allure.Step;
import org.example.Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ArrivalControlPages extends BaseTest {
    @Step("Giriş ekranına gidilir")
    public void homeScreen() {
        driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img")).click();
    }

    @Step("Hakkında ekranına gidilir")
    public void aboutScreen() {
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
    }

    @Step("Hakkında Ekranı Mesaj Kontrolü")
    public void aboutPageMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Customer Care ekranına gidilir")
    public void customerCareScreen() {
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
    }

    @Step("Customer Care Ekranı Mesaj Kontrolü")
    public void customerCareMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }
    //*[@id="accountTable"]/tbody/tr[1]/td[1]/a
    //*[@id="accountTable"]/tbody/tr[2]/td[1]/a
    @Step("Services ekranına gidilir")
    public void servicesScreen() {
        driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[3]/a")).click();
    }

    @Step("Services Ekranı Mesaj Kontrolü")
    public void servicesMessageCheck(String text) {
        String value = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/span[1]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Latest New ekranına gidilir")
    public void latestNewScreen() {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
    }

    @Step("Latest New Ekranı Mesaj Kontrolü")
    public void latestNewMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("New Wallet Account  ekranına gidilir")
    public void newWalletScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
    }

    @Step("New Wallet Account Ekranı Mesaj Kontrolü")
    public void newWalletMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Wiew Account  ekranına gidilir")
    public void viewAccountsScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();
    }

    @Step("Wiew Accounts Account Ekranı Mesaj Kontrolü")
    public void viewAccountsMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }


    @Step("Transfer Funds ekranına gidilir")
    public void transferFundsScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();
    }

    @Step("Transfer Funds Ekranı Mesaj Kontrolü")
    public void transferFundsMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Bill Pay ekranına gidilir")
    public void billPayScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
    }

    @Step("Bill Pay Ekranı Mesaj Kontrolü")
    public void billPayMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Find Transactions ekranına gidilir")
    public void findTransactionsScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a")).click();
    }

    @Step("Find Transactions Ekranı Mesaj Kontrolü")
    public void findTransactionsMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Update Profile ekranına gidilir")
    public void updateProfileScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
    }

    @Step("Update Profile Ekranı Mesaj Kontrolü")
    public void updateProfileMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Requset Loan ekranına gidilir")
    public void requsetLoanScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
    }

    @Step("Requset Loan Ekranı Mesaj Kontrolü")
    public void requsetLoanMessageCheck(String text) {
        String value = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Hesaptan Cıkıs Ekranına Gidilir")
    public void logOutScreen() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }

    @Step("Requset Loan Ekranı Mesaj Kontrolü")
    public void logOutMessageCheck(String text) {
        String value = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2")).getText();
        Assert.assertEquals(value, text);
    }

}
