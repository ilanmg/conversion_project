package LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class metricConversions {

   private static final WebElement OTGramsInput = null;
   private WebDriver driver;
   private WebDriverWait wait;

    @FindBy(className= "argument")
    private WebElement celsiusImput;


    @FindBy(className = "convert greenButton")
    private WebElement ConvertInput;
    
    @FindBy(className = "answer")
    private WebElement answerInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;
	private Object celsiusInput;

	 @FindBy(className = "answer")
	 private WebElement MFanswerInput;
	
	
	@FindBy(className = "Meters to Feet")
    private WebElement metersToFeetInput;
	private Object clickMetersToFeetButton;
	
	@FindBy(className = "argumentConv")
    private WebElement clickMetersToFeetButton11;
	private Object clickMetersToFeetButton1;
	 
	
	 @FindBy(className= "typeConv weight bluebg")
	 private WebElement wightImput;
	private Object wightouncesInput;
	
	 @FindBy(className= "typeConv unitConv unit2UnitConv")
	 private WebElement wightouncesImput;
	private WebElement wightToouncesInput;
	
	 @FindBy(className = "answer")
	 private WebElement OTGanswerInput;
	
	
    public void MetricConversions(WebDriver driver) { 
		// TODO Auto-generated constructor stub
	}

    public metricConversions(WebDriver driver) {
       this.driver = driver; 
       this.wait = new WebDriverWait (driver, 30);
        PageFactory.initElements(driver, this);
   }

 
   public void celsiusInput(int Celsius) {
        ((WebElement) this.celsiusInput).sendKeys("44");
      
   }

   public void ConvertInput() {
        this.ConvertInput.click();
   }
   public void answerInput() {
       this.ConvertInput.click();
  }
   
   public void MFanswerInput() {
       this.MFanswerInput.click();
  }
   
   
   public void metersToFeetInput() {
       this.metersToFeetInput.click();
  }
   
   public void clickMetersToFeetButton() {
       ((WebElement) this.clickMetersToFeetButton).click();
  }
  
   public void MetersToFeetInput(int metersfeet) {
       ((WebElement) this.celsiusInput).sendKeys("44");
     
  }
   
   public void wightImput() {
       ((WebElement) this.wightouncesInput).click();
  }
   
   public void wightouncesImput() {
       ((WebElement) this.wightToouncesInput).click();
  }
   
   public void OTGInput(int metersfeet) {
       ((WebElement) this.OTGramsInput).sendKeys("44");
     
  }
  
   public void OTGanswerInput() {
       this.ConvertInput.click();
  }
   
}