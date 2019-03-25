package Selenium_Docker.Selenium_Docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchHeader {

  
	 private WebDriver driver;
	 private WebDriverWait wait;
	
	 @FindBy(id = "user-login-btn")
	 private WebElement signInBtn; 

	 @FindBy(css="#txtSearch")
	    private WebElement searchInput;

	    @FindBy(xpath="//a[contains(text(),'Business (Category)')]")
	    private WebElement resultInput;

	    @FindBy(className="artist-page-opener")
	    private WebElement resultLeadsToArtlistPage;

	    @FindBy(className="tag-link")
	    private WebElement closeResultInput;

	    @FindBy(css="#tagslist > li > a.remove-tag-link")
	    private WebElement removeResultInput;

	    @FindBy(xpath="//div[@class='trigger']")
	    private WebElement triggerInput;

	    @FindBy(css="div.trigger")
	    private WebElement closingTriggerInput;

	    @FindBy(css=".tob-bar-container i.search-icon")
	    
	    private WebElement searcByMagnifier;

	    @FindBy(css = "#autoCompleteBox > ul > li > a")
	    private WebElement ResultToGetArtlistPage;
    
    
    public SearchHeader(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait (driver, 30);
         PageFactory.initElements(driver, this);
    }

    public  void goTo() {
         this.driver.get("https://artlist.io");
         this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));
    }

private void WebDriverWait(WebElement triggerInput2, int i) {
		
    }


    public void clickTriggerIcon() {
    	WebDriverWait(triggerInput, 10);
    	this.triggerInput.click();
       
    }

   
    public void clickSearchIcon() {
    	this.searchInput.sendKeys("#txtSearch");
       
    }

    public void clickFirstResult() {
    	WebDriverWait(resultInput, 10);
    	this.resultInput.click();
        
    }

    public void clickCloseResult() {
    	WebDriverWait(closeResultInput, 10);
    	this.closeResultInput.click();
       
    }

	
}
