package ZoomCarBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAttributes {
	
	public void beforealltest()
	{
		System.out.println("I am before Test");
	}
	@Test(groups="smoke")
	public void smoke1()
	{
	System.out.println("My name is smoke1");
	}
	@Test(groups="smoke",dependsOnMethods="smoke1")
	public void smoke2()
	{
		System.out.println("My name is smoke2");
	}
	@Test(groups="sanity")
	public void sanity1()
	{
		System.out.println("My name is sanity1");
	}
	@Test(groups="regression")
	public void regression()
	{
		System.out.println("my name is regression");
	}
	@Test(groups="regression")
	public void regression2()
	{
		System.out.println("my name is regression2");
	}
	
	@AfterClass
	public void afterallclass()
	{
		System.out.println("I am after class");
	}
	
	
	
}
