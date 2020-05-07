package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test 
{

	
	public void switchWindow(WebDriver driver,String currentWindow)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		
//		ExpectedCondition ec = new ExpectedCondition<String>();
		
		
		wait.until
		(new ExpectedCondition<String>()
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
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
