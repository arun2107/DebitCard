package PagesZoomCarBasic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StartingPointPage {
	
	RemoteWebDriver driver;

	public StartingPointPage() {
		PageFactory.initElements(driver, this);
	}

	   @FindBy(how=How.XPATH,using="//div[@class='component-popular-locations']/div[@class='items'][1]")
	    private WebElement PickUpPoint;
	    
	    public StartingPointPage PickUpPointClick()
	    {
	    	PickUpPoint.click();
	    	return this;
	    	
	    }
	    
	    @FindBy(how=How.XPATH,using="//div[@class='actions']/button[1]")
	    private WebElement NextButton;
	    
	    public TimePage NextButtonClick()
	    {
	    NextButton.click();	
	    return new TimePage();
	    }
	    
	    @FindBy(how=How.XPATH,using="//div[@class='actions']/button[1]")
	    private WebElement DoneButton;
	    
	    public TimePage DoneButtonClick()
	    {
	    	DoneButton.click();
	    	return new TimePage();
	    }
	
	
}
