package Sanity;


import LoginPages.LoginPage;
import SearchHeader.SearchHeader;
import org.testng.Assert;
import org.testng.annotations.Test;

import Download.AddingToCart;

import tests.BaseTest;

public class DownloadTest extends BaseTest{



    @Test
    public void DownloadTest() throws InterruptedException {
    	LoginPage loginPage = new LoginPage(driver);
    	AddingToCart addingToCart = new AddingToCart (driver);
        loginPage.goTo();
        driver.manage().window().maximize();
        loginPage.signInBtn();
        Thread.sleep(5000);
        loginPage.enterUserCredentials("ilanmg@artlist.io", "Tomido1212*");
        loginPage.loginBtn();
        Thread.sleep(5000);
        addingToCart.clickAddToCartIcon(); 
        addingToCart.clickShppingCart();
       
        //Assert.assertEquals(true, searchHeader.StartNow());

    }
}