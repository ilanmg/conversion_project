package Sanity;


import Sanity.MteresToFeet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MteresToFeet{

   

	private char[] answer;

	@Test
    public void CelsiusToFahrenheit() throws InterruptedException {
    	//metricConversions MetricConversions = new metricConversions(driver); 
      
    	WebDriver driver = new ChromeDriver();
    	MteresToFeet.goTo(); 
        driver.manage().window().maximize(); 
    	
        //Thread.sleep(5000);
        MteresToFeet.metersToFeetInput();
        MteresToFeet.MetersToFeetInput("44");
        MteresToFeet.MFanswerInput();

       // Assert.assertEquals(true, MetricConversions.StartNow());

    }

	static void MFanswerInput() {
	
		
	}

	private static void MetersToFeetInput(String string) {
	
		
	}

	private static void clickMetersToFeetButton(String string) {
	
		
	}

	private static void metersToFeetInput() {
	
		
	}

	private static void answerInput() {
		
		
	}

	private static void ConvertInput() {
		
		
	}

	private static void goTo() {
		
		
	}

	}