package PagesZoomCarBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Carspage {

	RemoteWebDriver driver;
	public Carspage() {
 
		PageFactory.initElements(driver,this);
	}
	
	/*List<WebElement> results = driver.findElementsByXPath("//div[@class='results-body'][1]/div[2]/div[@class='car-listing']");
	System.out.println("The number of cars in the result is " +results.size());
	List<WebElement> Prices = driver.findElementsByXPath("//div[@class='car-amount'][1]/div[@class='price']");
	List<Integer> priceInt= new ArrayList<Integer>();*/

	@FindBy(how=How.XPATH,using="//div[@class='results-body'][1]/div[2]/div[@class='car-listing']")
	private List<WebElement> carsList; 
	
	public Carspage resultSizeDisplay()
	{
		System.out.println(carsList.size());
		return this;
		}
	
	@FindBy(how=How.XPATH,using="//div[@class='car-amount'][1]/div[@class='price']")
	private List<WebElement> prices;
	
	
	private List<Integer> priceint;
	//WebElement LargestpriceBrand = driver.findElementByXPath("//div[contains(text(),'"+price+"')]/../../../div[2]/h3");
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'\"+price+\"')]/../../../div[2]/h3")
    private WebElement LargestpriceBrand;
	
	public Carspage FindHighestPaidCar()
	{
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
		
		String BrandPrice = LargestpriceBrand.getText(); 
		System.out.println("The Brand with the largest price is " + BrandPrice);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'\"+price+\"')]/../../../div[2]/h3/../../div[@class='car-book']/div[1]/button[1]")
	private WebElement buyNow;
	
	public void buyNowclick()
	{
	buyNow.click();
	
}}