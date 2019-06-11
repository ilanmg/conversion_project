package Sanity;


import Sanity.MetricConversions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MetricConversions{

   
	
	private char[] answer;

	@Test
    public void CelsiusToFahrenheit() throws InterruptedException {
    	//metricConversions MetricConversions = new metricConversions(driver); 
		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	MetricConversions.goTo(); 
        driver.manage().window().maximize(); 
    	MetricConversions.CelsiusField();
        MetricConversions.celsiusInput("44");
        MetricConversions.ConvertInput();
        MetricConversions.answerInput();

       // Assert.assertEquals(true, MetricConversions.StartNow());

    }

	private static void answerInput() {
		
		
	}

	private static void ConvertInput() {
		
		
	}

	private static void goTo() {
		
		
	}

	private static void CelsiusField() {
		
		
	}

	private static void celsiusInput(String string) {
		
		
	}

	
	
	
}