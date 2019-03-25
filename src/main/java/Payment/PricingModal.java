package Payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PricingModal {

	 private WebDriver driver;
	   private WebDriverWait wait;
	   
	@FindBy(id = "user-login-btn")
	 private WebElement signInBtn; 

    @FindBy(css = "a.price-btn.topsign.trial-pricing-top.for-new")
    private static WebElement clickPricingBtn;
    
    @FindBy(css = "#pricing-modal button.pricing-subscribe-now")
    private static WebElement subscribeNowBtn;

    @FindBy(css = ".payment-creditcard input[name=\"payMethodJoinUs\"]")
    private static WebElement visaRadioBtn;

    @FindBy(css ="#bluesnap-hosted-iframe-ccn")
    private static WebElement visaCardIframe;
    
    @FindBy(id ="ccn")
    private static WebElement cardHolderNumberinput;
    
    @FindBy(css ="#bluesnap-hosted-iframe-ccn")
    private WebElement visaCardIframeExit;
    
    @FindBy(css = "#bluesnap-hosted-iframe-exp")
    private static WebElement monthYearIframe;
           
    @FindBy(css = "#month")
    private static WebElement visaMonthInput;

    @FindBy(css = "#year")
    private static WebElement visayear;
    
    @FindBy(css ="#bluesnap-hosted-iframe-cvv")
    private static WebElement cvvIframe;
    
    @FindBy(css = "#cvv")
    private static WebElement setCVVnumber;
    
    @FindBy(css = "input#bluesnap-area-name-JoinUs")//
    private static WebElement cardHolderNameinput;

    @FindBy(name=("bluesnap-hosted-iframe-ccn"))
    private WebElement SwitchToIframe;
    
    @FindBy(css = "#btnRegUserFree-JoinUs")
    private static WebElement clickLastStepToSubscribe;

    
    public PricingModal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait (driver, 30);
         PageFactory.initElements(driver, this);
    }

	public  void goTo() {
        this.driver.get("https://artlist.io");
        this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));
   }
	
	public void clickOnPricingBtn() {
        this.clickPricingBtn.click();
    }
  
    
   
	public void clickSubscribeNow() {
		this.subscribeNowBtn.click();
    }
    
   
	public void clickVisaRadioBtn() {
        this.visaRadioBtn.click();
    }
	
	public WebElement switchToVisaIframe() {
        waitForElement(visaCardIframe, 10);
        this.driver.switchTo().frame(visaCardIframe);
         return visaCardIframe;
     }
    
    private void waitForElement(WebElement visaCardIframe2, int i) {
		
		
	}
    
    public void setVisaCardNumber(String cardNumber) {
        this.cardHolderNumberinput.sendKeys("4263982640269299");
       
   }

    public WebElement exitVisaIframe() {
        waitForElement(visaCardIframeExit, 10);
        this.driver.switchTo().defaultContent();
         return visaCardIframeExit;
     }
    
    public WebElement switchToMonthYearIframe() {
        waitForElement(monthYearIframe, 10);
        this.driver.switchTo().frame(monthYearIframe);
         return monthYearIframe;
     }
    
    public void setVisaMonth(String MonthNumber) {
         this.visaMonthInput.sendKeys("02");
       
    }

    public void setVisaYear(String YearNumber) {
    	 this.visayear.sendKeys("23");
        
    }
    public WebElement switchToCVVIframe() {
        waitForElement(cvvIframe, 10);
        this.driver.switchTo().frame(cvvIframe); 
         return cvvIframe;
     }
      
    public void setCVVnumber(String CVVNumber) {
    	this.setCVVnumber.sendKeys("837");
       
    }
      
    public void setCardHolderName(String holderCard) {
    	this.cardHolderNameinput.sendKeys("ilan amgar");
       
    }

    
     public void clickLastStepToSubscribe() {
        this.clickLastStepToSubscribe.click();
       
    }

	
}


