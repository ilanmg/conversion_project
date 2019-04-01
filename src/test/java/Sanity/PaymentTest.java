package Sanity;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Payment.PricingModal;
import tests.BaseTest;



public class PaymentTest extends BaseTest {

   

	@Test(groups ={"Artlist"}, description = "this test should enter a valid card and should be succeeded")
    public void PaymentTestSuccess() throws InterruptedException {
			
		PricingModal pricingModal = new PricingModal(driver);    
		
		pricingModal.goTo();
	        
		pricingModal.clickOnPricingBtn();
        Thread.sleep(3000);
        pricingModal.clickSubscribeNow();
         
        driver.manage().window().maximize();  
        
        Thread.sleep(2000);
        pricingModal.clickVisaRadioBtn();
        
        pricingModal.switchToVisaIframe();
        
        pricingModal.setVisaCardNumber("4263982640269299");
        driver.switchTo().defaultContent();
        
        
        pricingModal.switchToMonthYearIframe();
      
       
        pricingModal.setVisaMonth("02"); 
        pricingModal.setVisaYear("23");
       driver.switchTo().defaultContent();
     
       
       pricingModal.switchToCVVIframe();
       pricingModal.setCVVnumber("837");
       
  
       driver.switchTo().defaultContent();
       
       pricingModal.setCardHolderName("ilan amgar");
        
 
             
        pricingModal.clickLastStepToSubscribe();
      
    }
}

