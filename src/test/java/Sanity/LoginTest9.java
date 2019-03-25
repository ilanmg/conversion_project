package Sanity;


import LoginPages.LoginPage;
import junit.framework.Assert;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest9 extends BaseTest{



    @Test
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        //driver.manage().window().maximize();
        loginPage.signInBtn();
        Thread.sleep(5000);
        loginPage.enterUserCredentials("#logemail", "#logpassword");
        loginPage.loginBtn();

        Assert.assertEquals(true, loginPage.signInBtn());

    }
}
