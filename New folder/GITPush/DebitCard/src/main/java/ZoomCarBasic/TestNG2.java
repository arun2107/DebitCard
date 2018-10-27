package ZoomCarBasic;

import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 extends TC_001{

	@BeforeClass()
	public void beforeclass1()
	{
		System.out.println("THis is @beforeclass1");
	}
	@Test(invocationCount=2)
	public void test1()
	
	{
		System.out.println("this is @test1");
	}
	@AfterClass
	public void afterClass1()
	{
		System.out.println("this is @afterclass1");
	}
	
}
