package org.example;
//import jdk.jpackage.internal.Log;

import org.example.Pages.ButtonPage;
import org.example.Pages.ArrivalControlPages;
import org.example.Base.BaseTest;
import org.example.Pages.RegisterPage;
import org.testng.annotations.*;

public class ArrivalControl extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    ButtonPage buttonPage = new ButtonPage();
    ArrivalControlPages pageArrivalControl = new ArrivalControlPages();

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
        String randomUsername = registerPage.randomUsernameDoldur();
        registerPage.passwordDoldur("123asd123");
        registerPage.repeatedPasswordDoldur("123asd123");
        buttonPage.register();
        registerPage.successfulUserCreationControl("Welcome " + randomUsername);


    }

    @Test(description = "Ana Sayfa Ekranında Olma durumu", priority = 1)
    public void Test2() {
        pageArrivalControl.homeScreen();
    }

    @Test(description = "Hakkında Ekranında Olma durumu", priority = 2)
    public void Test3() {
        pageArrivalControl.aboutScreen();
        pageArrivalControl.aboutPageMessageCheck("ParaSoft Demo Website");
    }

    @Test(description = "Customer Care Sayfasında Ekranında Olma durumu", priority = 3)
    public void Test4() {
        pageArrivalControl.customerCareScreen();
        pageArrivalControl.customerCareMessageCheck("Customer Care");
    }

    @Test(description = "Services Ekranında Olma durumu", priority = 4)
    public void Test5() {
        pageArrivalControl.servicesScreen();
        pageArrivalControl.servicesMessageCheck("Available Bookstore SOAP services:");
    }

    @Test(description = "Latest New Ekranında Olma durumu", priority = 5)
    public void Test6() {
        pageArrivalControl.latestNewScreen();
        pageArrivalControl.latestNewMessageCheck("ParaBank News");
    }

    @Test(description = "New Wallet Account Ekranında Olma durumu", priority = 6)
    public void Test7() {
        pageArrivalControl.newWalletScreen();
        pageArrivalControl.newWalletMessageCheck("Open New Account");
    }

    @Test(description = "Accounts Overview Ekranında Olma durumu", priority = 7)
    public void Test8() {
        pageArrivalControl.viewAccountsScreen();
        pageArrivalControl.viewAccountsMessageCheck("Accounts Overview");
    }

    @Test(description = " Transfer Funds Ekranında Olma durumu", priority = 8)
    public void Test9() {
        pageArrivalControl.transferFundsScreen();
        pageArrivalControl.transferFundsMessageCheck("Transfer Funds");
    }

    @Test(description = " Bill Pay Ekranında Olma durumu", priority = 9)
    public void Test10() {
        pageArrivalControl.billPayScreen();
        pageArrivalControl.billPayMessageCheck("Bill Payment Service");
    }

    @Test(description = "Find Transacitons Ekranında Olma durumu", priority = 10)
    public void Test11() {
        pageArrivalControl.findTransactionsScreen();
        pageArrivalControl.findTransactionsMessageCheck("Find Transactions");
    }

    @Test(description = "Update Contact Ekranında Olma durumu", priority = 11)
    public void Test12() {
        pageArrivalControl.updateProfileScreen();
        pageArrivalControl.updateProfileMessageCheck("Update Profile");
    }

    @Test(description = "Request Loan Ekranında Olma durumu", priority = 12)
    public void Test13() {
        pageArrivalControl.requsetLoanScreen();
        pageArrivalControl.requsetLoanMessageCheck("Apply for a Loan");
    }

    @Test(description = "Hesaptan Çıkış Ekranında Olma durumu", priority = 13)
    public void Test14() {
        pageArrivalControl.logOutScreen();
        pageArrivalControl.logOutMessageCheck("Customer Login");
    }


    @AfterMethod
    public void returnHomePage() {
        pageArrivalControl.homeScreen();

    }

}
