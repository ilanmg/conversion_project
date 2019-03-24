package Selenium_Docker.Selenium_Docker;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchChrome {
	static RemoteWebDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		System.out.println("running test in docker container <<chrome>>");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		                          cap.setPlatform(Platform.LINUX);
		                          cap.setVersion("");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
	}
	
	@Test
	public void googlesearch() throws InterruptedException {
		
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Specialize Automation");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		System.out.println("search in chrome completed");
		
		Thread.sleep(5000);
	}
	
	@Test
	public void googlesearch1() throws InterruptedException {
		
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Specialize Automation");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		System.out.println("search in chrome completed");
		
		Thread.sleep(5000);
	}
	
	@Test
	public void googlesearch2() throws InterruptedException {
		
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Specialize Automation");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		System.out.println("search in chrome completed");
		
		Thread.sleep(5000);
	}
	
	@Test
	public void googlesearch3() throws InterruptedException {
		
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Specialize Automation");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		System.out.println("search in chrome completed");
		
		Thread.sleep(5000);
	}
	
	@AfterClass
	public static void tearDown() {
		if(driver!=null)
		{
			System.out.println("completed test in docker container <<chrome>>");
			driver.quit();
		}
	}

}
