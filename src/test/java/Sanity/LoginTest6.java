package Sanity;


import LoginPages.LoginPage;
import SearchHeader.SearchHeader;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest6 extends BaseTest{



    @Test
    public void LoginTest() throws InterruptedException {
    	SearchHeader searchHeader = new SearchHeader(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        //driver.manage().window().maximize();
        loginPage.signInBtn();
        Thread.sleep(5000);
        loginPage.enterUserCredentials("ilanmg@artlist.io", "Tomido1212*");
        loginPage.loginBtn();

        Assert.assertEquals(true, searchHeader.StartNow());

    }
}