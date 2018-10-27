package ZoomCarBasic;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_001 {
	
	public RemoteWebDriver driver;
    @Test(priority=-1)
	public  void Launchapp()  {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver= new ChromeDriver();
	}
	
    @Test(priority=1)
	public void LaunchURL()
	{
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
    @Test(priority=2)
	public void WonderfulJourneyClick() throws InterruptedException
	{
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[@class='items'][1]").click();
		driver.findElementByXPath("//div[@class='actions']/button[1]").click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void DatePicker() throws InterruptedException
	{
		//Create an object to date format 
		Date date = new Date();
		//create an object to Dateformat and select the dateformat as only day
		DateFormat sdf= new SimpleDateFormat("dd");
		// get today's date as a string 
		String today= sdf.format(date);
		// get tommorow date by converting the string to integer and add 1 to it
		int tommorow = Integer.parseInt(today)+1;
		System.out.println(tommorow);
		Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(text(),'"+tommorow+"')]").click();
		String SelectedDate = driver.findElementByXPath("//div[@class='item selected']/div[2]/div[1]").getText();
		System.out.println(SelectedDate);
		 if(SelectedDate.contains("Sun"))
		    {
		    	System.out.println("The date is verified");
		    }
		    else
		    {
		    	System.out.println("The date is not as expected");
		    }
	}
	@Test(priority=4)	
	public void nextclick() throws InterruptedException
	{
	driver.findElementByXPath("//div[@class='actions']/button[1]").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//div[@class='actions']/button[1]").click();
	}
	@Test(priority=5)
	public void CarSelect() throws InterruptedException
	{
	List<WebElement> results = driver.findElementsByXPath("//div[@class='results-body'][1]/div[2]/div[@class='car-listing']");
	System.out.println("The number of cars in the result is " +results.size());
	List<WebElement> Prices = driver.findElementsByXPath("//div[@class='car-amount'][1]/div[@class='price']");
	List<Integer> priceInt= new ArrayList<Integer>();
	for(WebElement price:Prices)
	{
		String textPrice = price.getText();
		String textPriceReg= textPrice.replaceAll("[^\\d]","");
		int textInt= Integer.parseInt(textPriceReg);
		priceInt.add(textInt);
	}
	 Collections.sort((List<Integer>)priceInt);
	 System.out.println(priceInt);
	int price = priceInt.get(priceInt.size()-1);
	System.out.println(price);
	WebElement LargestpriceBrand = driver.findElementByXPath("//div[contains(text(),'"+price+"')]/../../../div[2]/h3");
	String BrandPrice = LargestpriceBrand.getText(); 
	System.out.println("The Brand with the largest price is " + BrandPrice);
	WebElement BuyNow = driver.findElementByXPath("//div[contains(text(),'"+price+"')]/../../../div[2]/h3/../../div[@class='car-book']/div[1]/button[1]");
	System.out.println(BuyNow.getText());
	BuyNow.click();
	Thread.sleep(5000);
	
	
	
	
	}

	
	}
