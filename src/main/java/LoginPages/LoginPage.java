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
    public void signInBtn() {
        this.signInBtn.click();
    }

   public void enterUserCredentials(String  Email, String password) {
        this.logemail.sendKeys("ilanmg@artlist.io");
        this.loginPasswordInput.sendKeys("Tomido1212*");
   }

   public void loginBtn() {
        this.loginBtn.click();
   }
}
