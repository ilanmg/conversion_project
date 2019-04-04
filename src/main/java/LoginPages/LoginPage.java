package LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class LoginPage {

   private WebDriver driver;
   private WebDriverWait wait;

    @FindBy(css = "#get-your-license")
    private WebElement license;

    @FindBy(id = "user-login-btn")
    private WebElement signInBtn;
    
    @FindBy(css= "#logemail")
    private WebElement logemail;

    @FindBy(css= "#logpassword")
    private WebElement loginPasswordInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;




    public LoginPage(WebDriver driver) {
       this.driver = driver; 
       this.wait = new WebDriverWait (driver, 30);
        PageFactory.initElements(driver, this);
   }

   public  void goTo() {
        this.driver.get("https://artlist.io");
        this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));  
   }
    public boolean signInBtn() {
        this.signInBtn.click();
		return false;
    }

   public void enterUserCredentials(String  Email, String password) {
        this.logemail.sendKeys(Email);
        this.loginPasswordInput.sendKeys(password);
   }

   public void loginBtn() {
	   this.wait = new WebDriverWait (driver, 30);
        this.loginBtn.click();
   }
   public boolean getLicense() {
       return isElementVisible(license); 
   }

private boolean isElementVisible(WebElement signInBtn) {
	
	return false;
}
}