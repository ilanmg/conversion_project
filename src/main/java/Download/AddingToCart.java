package Download;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddingToCart {

	 private WebDriver driver;
	 private WebDriverWait wait;
	   
	   
    @FindBy(id = "user-login-btn")
    private WebElement signInBtn;

    @FindBy(css= "#logemail")
    private WebElement logemail;

    @FindBy(css= "#logpassword")
    private WebElement loaginPasswordInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;

    @FindBy(css = "#song_11609 a.add-cart")
    private WebElement addToCartInput;

    @FindBy(css = "#top-bar > div.row.top-row > div > div > div > div.login-side > div > div.carttop > a > i")
    private WebElement shppingCartInput;
   
    
    


private void WebDriverWait(WebElement signInBtn2, int i) {
		
	}
   
public AddingToCart(WebDriver driver) {
    this.driver = driver; 
    this.wait = new WebDriverWait (driver, 30);
     PageFactory.initElements(driver, this);
}

public AddingToCart() {
	
}

public  void goTo() {
     this.driver.get("https://artlist.io");
     this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));  
}

    public void clickSignInBtn() {
    	WebDriverWait(signInBtn, 10);
        this.signInBtn.click();
      
    }

   	public void setEmail(String email){
		WebDriverWait(logemail, 10);
        logemail.sendKeys(email);
    }

    public void setPassword(String password){ 
    	WebDriverWait(loaginPasswordInput, 10);
        loaginPasswordInput.sendKeys(password); 
    }

    public void clickLoginBtn() {
    	WebDriverWait(loginBtn, 10);
    	this.loginBtn.click();
    }

    public void clickAddToCartIcon() {
    	WebDriverWait(addToCartInput, 10);
    	this.addToCartInput.click();
    }
    public void clickShppingCart() {
    	WebDriverWait(shppingCartInput, 10);
    	this.shppingCartInput.click();
    }
    
}


