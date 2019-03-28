package Sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MainMenue.MainMenue;

import org.openqa.selenium.support.FindBy;

import tests.BaseTest;




public class MainMenueMoodPowerfulTest extends BaseTest {

	
    
    @Test(groups ={"Artlist"}, description= "the script should click main menue Mood Powerful")
    public void MainMenueMoodPowerful() throws InterruptedException {
    	MainMenue mainMenue = new MainMenue(driver);
    	mainMenue.goTo();
        mainMenue.clickOnMainMenueMood();
        Thread.sleep(5000);
        mainMenue.clickOnMainMenuePowerful();
        Thread.sleep(3000);
        mainMenue.closeMainMenueInput();
       
    }
    
    
    
   
}

