package PagesZoomCarBasic;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	RemoteWebDriver driver;
	public HomePage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
public HomePage StartApp()
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.zoomcar.com/chennai/");
			return this;
		}
    


@FindBy(how=How.LINK_TEXT,using="Start your wonderful journey")
	private WebElement StartWonderFulJourney;
	
    public StartingPointPage StartWonderFulJourneyClick()
    {
    	StartWonderFulJourney.click();
    	return new StartingPointPage();
    }
    

    
    
    
 
    
    
    }
