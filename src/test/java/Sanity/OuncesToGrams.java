package Sanity;


import LoginPages.metricConversions;
import Sanity.OuncesToGrams;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OuncesToGrams{

   

	private char[] answer;

	@Test
    public void CelsiusToFahrenheit() throws InterruptedException {
    	//metricConversions MetricConversions = new metricConversions(driver); 
      
    	WebDriver driver = new ChromeDriver();
    	OuncesToGrams.goTo(); 
        driver.manage().window().maximize(); 
    	OuncesToGrams.wightImput();
        OuncesToGrams.wightouncesImput();
        OuncesToGrams. OTGInput("44");
        OuncesToGrams.OTGanswerInput();

    }

	private static void OTGanswerInput() {
		
		
	}

	private static void OTGInput(String string) {
	
		
	}

	private static void wightouncesImput() {
	
		
	}

	private static void wightImput() {
		
		
	}
	private static void goTo() {
		
		
	}
}