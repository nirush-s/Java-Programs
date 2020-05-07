package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	
	public void waitForWndows(WebDriver driver,String currentWindow)
	{
		 String newWindow = new WebDriverWait(driver, 60).until(new ExpectedCondition<String>()
		 {
			 @Override
			   public String apply(WebDriver d)
			   {
			     Set<String> handles = d.getWindowHandles();
			     handles.remove(currentWindow);
			     return handles.size() > 0 ? handles.iterator().next() : null;
			   }
		 }
		 );
		 
		 driver.switchTo().window(newWindow);
	}
	
	
}
