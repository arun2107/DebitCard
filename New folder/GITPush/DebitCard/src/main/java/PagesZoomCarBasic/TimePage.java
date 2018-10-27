package PagesZoomCarBasic;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*; 

public class TimePage {

	RemoteWebDriver driver;
	
	public TimePage() {
		
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(how=How.ID,using="//div[contains(text(),'26')]")
    private WebElement nextDay;
	
	public TimePage DatePicker()
	{
		nextDay.click();
		return this;
	}
	
	public TimePage DateVerify()
	{
		if(nextDay.getText().contains("Sun"))
	    {
	    	System.out.println("The date is verified");
	    }
	    else
	    {
	    	System.out.println("The date is not as expected");
	    }
		return this;
}
	
    
	@FindBy(how=How.XPATH,using="//div[@class='item selected']/div[2]/div[1]")
	private WebElement nextButton;
	
	public TimePage clickNextButton()
	{
		nextButton.click();
		return this;
	}
	
	
	
	
	
	
}
