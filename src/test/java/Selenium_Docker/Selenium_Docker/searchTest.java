package Selenium_Docker.Selenium_Docker;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import java.util.concurrent.TimeUnit;


public class searchTest  extends BaseTest {

    

    @Test(groups ={"sanity"},  description= "the script is searching for a letter, then picks up the first result")
    public void search() throws InterruptedException {
    	SearchHeader searchHeader = new SearchHeader(driver);
    	searchHeader.goTo();
    	
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchHeader.clickTriggerIcon();
        searchHeader.clickSearchIcon();
        searchHeader.clickFirstResult();
      // Assert.assertEquals(true, searchHeader.ResultToGetArtlistPageIsDisplayed()); 
    }
}

