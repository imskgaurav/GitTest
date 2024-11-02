package util.selenium.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility {

	
	//scroll to Element 
	
	
	public static void scrollToElement(WebDriver driver,WebElement elm ) {
		
		 ( (JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", elm);
		
		
	}

}
