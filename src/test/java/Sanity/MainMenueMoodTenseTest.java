package Sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MainMenue.MainMenue;
import SearchHeader.SearchHeader;

import org.openqa.selenium.support.FindBy;

import tests.BaseTest;




public class MainMenueMoodTenseTest extends BaseTest {

	
    
    @Test(groups ={"Artlist"}, description= "the script should click main menue Mood Tense")
    public void MainMenueMoodTense() throws InterruptedException {
    	MainMenue mainMenue = new MainMenue(driver);
    	SearchHeader searchHeader = new SearchHeader(driver);
    	mainMenue.goTo();
        mainMenue.clickOnMainMenueMood();
        Thread.sleep(5000);
        mainMenue.clickOnMainMenueTense();
        Thread.sleep(3000);
        mainMenue.closeMainMenueInput();
        Assert.assertEquals(true, searchHeader.StartNow());
    }
    
    
    
   
}

