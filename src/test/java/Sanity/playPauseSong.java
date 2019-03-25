package Sanity;

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

import LoginPages.LoginPage;
import PlaySongsFromHomepage.java.PlaySongsFromHomepage;
import tests.BaseTest;


public class playPauseSong extends BaseTest {



   
    @Test(description = "this test should play songs and pausing them")
    public void playPauseSong() throws InterruptedException {

    	PlaySongsFromHomepage playSongsFromHomepage = new PlaySongsFromHomepage(driver);
    	
    	
    	playSongsFromHomepage.goTo();
    	playSongsFromHomepage.clickToPlayFirstSongOnList();
        Thread.sleep(5000);

        playSongsFromHomepage.clickCanvasSongWave();
        Thread.sleep(3000);

        playSongsFromHomepage.clickToPauseFirstSongOnList();
        Thread.sleep(10000);

        playSongsFromHomepage.clickToPlayFirstSongOnList();
        Thread.sleep(5000);

        playSongsFromHomepage.clickVolumeSpeaker();
        Thread.sleep(5000);

        playSongsFromHomepage.clickTheVolumeSpeakerForTheSecondTime();
        Thread.sleep(5000);
       // Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());

    }
}