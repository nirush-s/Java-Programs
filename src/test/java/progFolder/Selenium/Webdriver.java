//package Selenium;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//public class Webdriver
//{
//
//
//	public static void main(String[] args) throws InterruptedException
//
//
//	{
//
//		String CHROME_VALUE="./drivers/IEDriverServer.exe";
//
//		System.setProperty("webdriver.ie.driver", CHROME_VALUE);
//
//		WebDriver driver = new InternetExplorerDriver();
//
//		String url = "http://otbapsrv:279/";
//
//		driver.get(url);
//
//		//Thread.sleep(500);
//
//		driver.manage().window().maximize();
//
//
//		String LeaseWave = driver.getWindowHandle();
//
//		System.out.println(LeaseWave);
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkCompany")).click();
//
//
//		Set<String> Windowhandles = driver.getWindowHandles();
//
//		int count = Windowhandles.size();
//
//		System.out.println(count);
//
//		for(String loginWindow : Windowhandles )
//		{
//
//			if(!LeaseWave.equalsIgnoreCase(loginWindow))
//			{
//
//				driver.switchTo().window(loginWindow);
//
//			}
//
//
//
//		}
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtUserName")).clear();
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtUserName")).sendKeys("deepa");
//
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtPassword")).clear();
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtPassword")).sendKeys("Samsung-1234");
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_cmdLogin1_cmdButtonControl")).click();
//
//
//
//
//
//
//
//		/*
//
//
//
//
//
//
//
//
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtUserName")).clear();
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtUserName")).sendKeys("deepa");
//
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtPassword")).clear();
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_txtPassword")).sendKeys("Samsung-1234");
//
//		driver.findElement(By.id("ctl00_ContentPlaceHolder_loginControl_cmdLogin1_cmdButtonControl")).click();
//
//
//*/
//
//
//
//	}
//
//
//	public void test()
//	{
//
//	}
//
//	public void test2()
//
//	{
//
//	}
//}