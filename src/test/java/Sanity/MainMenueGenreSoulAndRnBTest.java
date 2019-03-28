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




public class MainMenueGenreSoulAndRnBTest extends BaseTest {

	
    
    @Test(groups ={"Artlist"}, description= "the script should click main menue Genre Acoustic")
    public void mainMenuGenreHoliday() throws InterruptedException {
    	MainMenue mainMenue = new MainMenue(driver);
    	mainMenue.goTo();
        mainMenue.clickOnmainMenuGenre();
        Thread.sleep(2000);
        mainMenue.clickOnmainMenuGenreAcoustic();
        Thread.sleep(2000);
        mainMenue.closeMainMenueInput();
       
    }
}

