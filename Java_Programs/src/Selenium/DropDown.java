package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public void dropdowns() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://learn.letskodeit.com/p/practice");

		driver.manage().window().maximize();

		driver.close();
		
		
		 /* WebElement selectList = driver.findElement(By.id("carselect"));
		  
		  Select se = new Select(selectList);
		  
		  List<WebElement> completeList = se.getOptions();
		  
		  System.out.println(completeList.size());
		  
		  
		  for ( WebElement ele : completeList) { String names = ele.getText();
		  System.out.println(names);*/
		  
		  }
		 

	

}
