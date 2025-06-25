package progFolder.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickOnGoogleSearchResult 
{

	@Test
	public  void search()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("Odessa");
		
		element.submit();
		
	//	WebDriverWait wait = new WebDriverWait(driver, 400);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
		
		
		String ThirdLink = list.get(3).getAttribute("href");
		
		driver.navigate().to(ThirdLink);
		
		
		
	}
	
	
}
