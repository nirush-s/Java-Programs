package Selenium;

import org.testng.annotations.Test;

public class TestNGGroups 
{

/*	@Test(groups = {"Car"})
	public void maruti()
	{
		
		System.out.println("Maruthi");
		
	}
	
	@Test(groups = {"Car"})
	public void Hyundai()
	{
		
		System.out.println("Hyundai");
		
	}
	
	@Test(groups = {"Bike"})
	public void Yamaha()
	{
		
		System.out.println("Yamaha");
		
	}
	
	@Test(groups = {"Bike"})
	public void Bajaj()
	{
		
		System.out.println("Bajaj");
		
	}*/
	
	@Test
	public void Test()
	{
		
		System.out.println("Maruthi");
		
		
	}
	
	@Test(dependsOnMethods = {"Test"})
	public void testingDependsFunctionality()
	{
		
		System.out.println("This runs second");
	}
	
	
	
	
}
