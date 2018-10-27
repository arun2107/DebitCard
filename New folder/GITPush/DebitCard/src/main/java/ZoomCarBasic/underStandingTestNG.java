package ZoomCarBasic;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class underStandingTestNG extends TC_001
{
	
	@BeforeClass

	public void UseridGeneration2()

	{

	System.out.println("This block is @BeforeClass1");

	}
	
	@AfterClass
	
	public void UseridGeneration41()

	{

	System.out.println("This block is @AfterClass");

	}
	
	
	@BeforeSuite
	public void UseridGeneration3()
	{
		System.out.println("This block is @BeforeSuite");
	}
	
	@AfterSuite
	public void UseridGeneration4()
	{
		System.out.println("This block is @AfterSuite");
	}
	
	
	@BeforeMethod

	public void UseridGeneration()

	{

	System.out.println("This block is @BeforeMethod");

	}

	@BeforeTest

	public void Cookies()

	{

	System.out.println("This block is @BeforeTest");

	//delete cookies

	}
	
	@BeforeTest

	public void Cookies2()

	{

	System.out.println("This block is @BeforeTest2");

	//delete cookies

	}

	@AfterTest

	public void Cookiesclose()

	{

	System.out.println("This block is @AfterTest1");

	//close the browesers

	}

	
	@AfterTest

	public void Cookiesclose2()

	{

	System.out.println("This block is @AfterTest2");

	//close the browesers

	}

	
	@AfterMethod

	public void Reportadding()

	{

	System.out.println("This block is @AfterMethod");

	}

	@Test(priority=1)

	public void OpeningBrowser()

	{

	//This opens the Browser

	System.out.println("This block is @Test1");

	}

	@Test(priority=2)

	public void FlightBooking()

	{

	System.out.println("This Block is @Test2");

	}

	@Test(priority=3)

	public void FlightCancel()

	{

	System.out.println("This Block is @Test3");

	}

	}



