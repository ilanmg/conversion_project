package PlaySongsFromHomepage.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PlaySongsFromHomepage{

	 private WebDriver driver;
	 private WebDriverWait wait;
	   
	 @FindBy(id = "user-login-btn")
	 private WebElement signInBtn; 
   
	 @FindBy(css = "#song_11285 > div:nth-child(1) > div > div.flex2.item-left > div > div.flex.add-to-his > a > i")
	    private WebElement playSongBtnListInput;
	    
	    @FindBy(css = "#song_11285 > div.wrap-item > div.flex > div.flex1.item-right > div.flex > div.flex3.wave-row > div.wawe > div.wave-wrapper > div.song-wave > canvas.song-wave-canvas")
	    private WebElement playOtherSongFromCanvasInput;
	    
	    @FindBy(css = "#song_11285 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-pause")
	    private WebElement pausingSongInput;
	 
	    @FindBy(css = ".bottom-player .volume-speak")
	    private WebElement clickVolumeSpeakerInput;
	 
	    @FindBy(css = ".bottom-player .volume-speak")
	    private WebElement clickTheVolumeSpeakerForTheSecondTimeInput;
	    
	    @FindBy(css = "#song_8101 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")
	    private WebElement playOtherSongFromBtnListInput;
	    


    public PlaySongsFromHomepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait (driver, 30);
         PageFactory.initElements(driver, this);
    }

    public  void goTo() {
         this.driver.get("https://artlist.io");
         this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));
    }

    private void WebDriverWait(WebElement playSongBtnListInput2, int i) {
		
	}
   
    public void clickToPlayFirstSongOnList() {
    	WebDriverWait(playSongBtnListInput, 10);
    	this.playSongBtnListInput.click();
       
    }
    

    public void clickCanvasSongWave() {
    	WebDriverWait(playOtherSongFromCanvasInput, 10); 
    	this.playOtherSongFromCanvasInput.click();
       
    } 
    
    public void clickNewToPlayFirstSongOnList() {
    	WebDriverWait(playSongBtnListInput, 10);
    	this.playSongBtnListInput.click();
        
    }
    
    public void clickToPauseFirstSongOnList() {
    	WebDriverWait(pausingSongInput, 10);
    	this.pausingSongInput.click();
        
    }
    
    public void clickVolumeSpeaker() {
    	WebDriverWait(clickTheVolumeSpeakerForTheSecondTimeInput, 10);
    	this.clickTheVolumeSpeakerForTheSecondTimeInput.click();
       
    }
    
    public void clickTheVolumeSpeakerForTheSecondTime() {
    	WebDriverWait(clickTheVolumeSpeakerForTheSecondTimeInput, 10);
    	this.clickTheVolumeSpeakerForTheSecondTimeInput.click();
        
    }
}
