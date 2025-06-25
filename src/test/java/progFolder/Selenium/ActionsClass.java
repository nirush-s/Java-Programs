//package Selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//public class ActionsClass
//{
//
//	@Test
//	public void moveElement()
//	{
//
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://learn.letskodeit.com/p/practice");
//
//		driver.manage().window().maximize();
//
//
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[3]/a"));
//
//
//		Actions actions  = new Actions(driver);
//
//		actions.moveToElement(element).click().build().perform();
//
//
//
//
//
//
//
//	}
//
//
//}
