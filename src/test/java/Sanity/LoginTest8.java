package Sanity;


import LoginPages.LoginPage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest8 extends BaseTest{



    @Test
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        //driver.manage().window().maximize();
        loginPage.signInBtn();
        Thread.sleep(5000);
        loginPage.enterUserCredentials("Email", "password");
        loginPage.loginBtn();

        //Assert.assertEquals(true, siteHeader.getLicenseBtn());

    }
}