
package Selenium_Docker.Selenium_Docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class MainMenue {
	
	 @FindBy(id = "user-login-btn")
	    private WebElement signInBtn;

   //Mood
    @FindBy(css ="nav.main-menu li.Mood > a") 
    private WebElement mainMenueMoodInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='5']")
    private WebElement UpliftingInput;
    
    @FindBy(css = "#tagslist > li > a.remove-tag-link")
    private WebElement closeInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='6']")
    private WebElement PowerfulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='7']")
    private WebElement HappyInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='8']")
    private WebElement CarefreeInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='9']")
    private WebElement LoveInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='35']")
    private WebElement PlayfulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='78']")
    private WebElement HopefulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='10']")
    private WebElement PeacefulInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='12']")
    private WebElement SeriousInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='13']")
    private WebElement DramaticInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='14']")
    private WebElement AngryInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='15']")
    private WebElement TenseInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='16']")  
    private WebElement SadInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='79']")
    private WebElement ScaryAndDarkInput;



    //videoTheme
    @FindBy(css = ".menu > .VideoTheme > .toggle-sub")
    private WebElement videoThemeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='17']")
    private WebElement videoThemeBusinessInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='18']")
    private WebElement videoThemeTechnologyInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='19']")
    private WebElement videoThemeTimeLapseInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='20']")
    private WebElement videoThemeFoodInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='21']")
    private WebElement videoThemeEducationInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='21']")
    private WebElement videoThemePeopleInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='74']")
    private WebElement videoThemeWeddingsInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='84']")
    private WebElement videoThemeVlogInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='23']")
    private WebElement videoThemeRoadTripInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='75']")
    private WebElement videoThemeTravelInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='24']")
    private WebElement videoThemeSportsAndFitnessInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='25']")
    private WebElement videoThemeLifestyleInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='26']")
    private WebElement videoThemeBuildingAndCityInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='27']")
    private WebElement videoThemeNightlifeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='28']")
    private WebElement videoThemeFashionInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='29']")
    private WebElement videoThemeScienceInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='30']")
    private WebElement videoThemeMedicalInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='31']")
    private WebElement videoThemeIndustryInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='32']")
    private WebElement videoThemeAerialsInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='33']")
    private WebElement videoThemeLandscapeInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='34']")
    private WebElement videoThemeNatureInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='36']")
    private WebElement videoThemeSlowMotionInput;


    
    //Genre
    @FindBy(css =".menu > .Genre > .toggle-sub")
    private WebElement mainMenuGenreInput;
       
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='87']")
    private WebElement mainMenuGenreHolidayInput;
    
    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='64']")
    private WebElement mainMenuGenreElectronicInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='69']")
    private WebElement mainMenuGenrePopInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='85']")
    private WebElement mainMenuGenreHipHopInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='59']")
    private WebElement mainMenuGenreSoulAndRnBInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='59']")
    private WebElement mainMenuGenreCinematicInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='66']")
    private WebElement mainMenuGenreIndieInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='70']")
    private WebElement mainMenuGenreSingerSongwriterInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='65']")
    private WebElement mainMenuGenreAcousticInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='71']")
    private WebElement mainMenuGenreFolkInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='68']")
    private WebElement mainMenuGenreRockInput;

    @FindBy(css = "nav.main-menu  a.side-menu-category-link[categoryid='58']")
    private WebElement mainMenuGenreBluesInput;


    private WebDriver driver;
    private WebDriverWait wait;
    
    public MainMenue(WebDriver driver) {
        this.driver = driver; 
        this.wait = new WebDriverWait (driver, 30);
         PageFactory.initElements(driver, this);
    }

    public  void goTo() {
         this.driver.get("https://artlist.io");
         this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn)); 
    }


    public void clickOnMainMenueMood() {
    	WebDriverWait(mainMenueMoodInput, 10);
        this.mainMenueMoodInput.click();
        
    }
   private void WebDriverWait(WebElement mainMenueMoodInput2, int i) {
		
		
	}

   public void clickOnMainMenueUplifting() {
	   WebDriverWait(UpliftingInput, 10);
	   this.UpliftingInput.click();
       
    }
   public void closeMainMenueInput() {
	   WebDriverWait(closeInput, 10);
	   this.closeInput.click();
       
   }
   public void clickOnMainMenuePowerful() {
	   WebDriverWait(PowerfulInput, 10);
	   this.PowerfulInput.click();
      
   }
 
   public void clickOnMainMenueHappy() {
	   WebDriverWait(HappyInput, 10);
	   this.HappyInput.click();
      
  }
  
   public void clickOnMainMenueCarefree() {
	   WebDriverWait(CarefreeInput, 10);
	   this.CarefreeInput.click();
     
  }
  public void clickOnMainMenueLove() {
	  WebDriverWait(LoveInput, 10);
	  this.LoveInput.click();
    
  }
  public void clickOnMainMenuePlayful() {
	  WebDriverWait(PlayfulInput, 10);
	  this.PlayfulInput.click();
      
  }
  
  public void clickOnMainMenueHopeful() {
	  WebDriverWait(HopefulInput, 10);
	  this.HopefulInput.click();
     
  }
  
  public void clickOnMainMenuePeaceful() {
	  WebDriverWait(PeacefulInput, 10);
	  this.PeacefulInput.click();
      
  }
  
  public void clickOnMainMenueSerious() {
	  WebDriverWait(SeriousInput, 10);
	  this.SeriousInput.click();
      
  }
  
  public void clickOnMainMenueDramatic() {
	  WebDriverWait(DramaticInput, 10);
	  this.DramaticInput.click();
      
  }
  
  public void clickOnMainMenueAngry() {
	  WebDriverWait(AngryInput, 10);
	  this.AngryInput.click();
     
  }
  
  public void clickOnMainMenueTense() {
	  WebDriverWait(TenseInput, 10);
	  this.TenseInput.click();
      
  }

  public void clickOnMainMenueSad() {
	  WebDriverWait(SadInput, 10);
	  this.SadInput.click();
      
  }


  //videoTheme
    public void clickOnvideoTheme() {
    	WebDriverWait(videoThemeInput, 10);
    	this.videoThemeInput.click();
       
    }

    public void clickOnvideoThemeBusiness() {
    	WebDriverWait(videoThemeBusinessInput, 10);
    	this.videoThemeBusinessInput.click();
        
    }

    public void clickOnvideoThemeTechnology() {
    	WebDriverWait(videoThemeTechnologyInput, 10);
    	this.videoThemeTechnologyInput.click();
        
    }

    public void clickOnvideoThemeTimeLapse() {
    	WebDriverWait(videoThemeTimeLapseInput, 10);
    	this.videoThemeTimeLapseInput.click();
        
    }
    public void clickOnvideoThemeFood() {
    	WebDriverWait(videoThemeFoodInput, 10);
    	this.videoThemeFoodInput.click();
       
    }

    public void clickOnvideoThemeEducation() {
    	WebDriverWait(videoThemeEducationInput, 10);
    	this.videoThemeEducationInput.click();
       
    }

    public void clickOnvideoThemePeople() {
    	WebDriverWait(videoThemePeopleInput, 10);
    	this.videoThemePeopleInput.click();
        
    }
    public void clickOnvideoThemeWeddings() {
    	WebDriverWait(videoThemeWeddingsInput, 10);
    	this.videoThemeWeddingsInput.click();
        
    }

    public void clickOnvideoThemeVlog() {
    	WebDriverWait(videoThemeVlogInput, 10);
    	this.videoThemeVlogInput.click();
        
    }
    public void clickOnvideoThemeRoadTrip() {
    	WebDriverWait(videoThemeRoadTripInput, 10);
    	this.videoThemeRoadTripInput.click();
       
    }
    public void clickOnvideoThemeTravel() {
    	WebDriverWait(videoThemeTravelInput, 10);
    	this.videoThemeTravelInput.click();
        
    }

    public void clickOnvideoThemeSportsAndFitness() {
    	WebDriverWait(videoThemeSportsAndFitnessInput, 10);
    	this.videoThemeSportsAndFitnessInput.click();
       
    }
    public void clickOnvideoThemeLifestyle() {
    	WebDriverWait(videoThemeLifestyleInput, 10);
    	this.videoThemeLifestyleInput.click();
        
    }

    public void clickOnvideoThemeBuildingAndCity() {
    	WebDriverWait(videoThemeBuildingAndCityInput, 10);
    	this.videoThemeBuildingAndCityInput.click();
     
    }

    public void clickOnvideoThemeNightlife() {
    	WebDriverWait(videoThemeNightlifeInput, 10);
    	this.videoThemeNightlifeInput.click();
       
    }

    public void clickOnvideoThemeFashion() {
    	WebDriverWait(videoThemeFashionInput, 10);
    	this.videoThemeFashionInput.click();
       
    }

    public void clickOnvideoThemeScience() {
    	WebDriverWait(videoThemeScienceInput, 10);
    	this.videoThemeScienceInput.click();
       
    }

    public void clickOnvideoThemeMedical() {
    	WebDriverWait(videoThemeMedicalInput, 10);
    	this.videoThemeMedicalInput.click();
       
    }

    public void clickOnvideoThemeIndustry() {
    	WebDriverWait(videoThemeIndustryInput, 10);
    	this.videoThemeIndustryInput.click();
       
    }

    public void clickOnvideoThemeAerials() {
    	WebDriverWait(videoThemeAerialsInput, 10);
    	this.videoThemeAerialsInput.click();
       
    }
    public void clickOnvideoThemeLandscape() {
    	WebDriverWait(videoThemeLandscapeInput, 10);
    	this.videoThemeLandscapeInput.click();
       
    }

    public void clickOnvideoThemeNature() {
    	WebDriverWait(videoThemeNatureInput, 10);
    	this.videoThemeNatureInput.click();
        
    }

    public void clickOnvideoThemeSlowMotion() {
    	WebDriverWait(videoThemeSlowMotionInput, 10);
    	this.videoThemeSlowMotionInput.click(); 
        
    }

    
    //Genre
    public void clickOnmainMenuGenre() {
    	WebDriverWait(mainMenuGenreInput, 10);
    	this.mainMenuGenreInput.click(); 
        
    }
    
    public void clickOnmainMenuGenreHoliday() {
    	WebDriverWait(mainMenuGenreHolidayInput, 10);
    	this.mainMenuGenreHolidayInput.click(); 
        
    } 
     
    public void clickOnmainMenuGenreElectronic() {
    	WebDriverWait(mainMenuGenreElectronicInput, 10);
    	this.mainMenuGenreElectronicInput.click(); 
       
    }

    public void clickOnmainMenuGenrePop() {
    	WebDriverWait(mainMenuGenrePopInput, 10);
    	this.mainMenuGenrePopInput.click();
        
    }

    public void clickOnmainMenuGenreHipHop() {
    	WebDriverWait(mainMenuGenreHipHopInput, 10);
    	this.mainMenuGenreHipHopInput.click();
       
    }

    public void clickOnmainMenuGenreCinematic() {
    	WebDriverWait(mainMenuGenreCinematicInput, 10);
    	this.mainMenuGenreCinematicInput.click();
       
    }
    public void clickOnmainMenuGenreSoulAndRnB() {
    	WebDriverWait(mainMenuGenreCinematicInput, 10);
    	this.mainMenuGenreCinematicInput.click();
       
    }
    public void clickOnmainMenuGenreIndie() {
    	WebDriverWait(mainMenuGenreIndieInput, 10);
    	this.mainMenuGenreIndieInput.click();
        
    }

    public void clickOnmainMenuGenreSingerSongwriter() {
    	WebDriverWait(mainMenuGenreSingerSongwriterInput, 10);
    	this.mainMenuGenreSingerSongwriterInput.click();
        
    }

    public void clickOnmainMenuGenreAcoustic() {
    	WebDriverWait(mainMenuGenreAcousticInput, 10);
    	this.mainMenuGenreAcousticInput.click();
       
    }
    public void clickOnmainMenuGenreFolk() {
    	WebDriverWait(mainMenuGenreFolkInput, 10);
    	this.mainMenuGenreFolkInput.click();
       
    }

    public void clickOnmainMenuGenreRock() {
    	WebDriverWait(mainMenuGenreRockInput, 10);
    	this.mainMenuGenreRockInput.click();
       
    }

    public void clickOnmainMenuGenreBlues() {
    	WebDriverWait(mainMenuGenreBluesInput, 10);
        this.mainMenuGenreBluesInput.click();
       
    }

 }
