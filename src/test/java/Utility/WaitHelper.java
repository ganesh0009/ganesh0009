package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
 
	public WebDriver ldriver;
	
	
	
	public WaitHelper(WebDriver driver) {
		super();
		this.ldriver = driver;
	}



	public void waitForElement(WebElement elemenmt,long timeOutInSeconds)
	{ 
		WebDriverWait wait = new WebDriverWait(ldriver,timeOutInSeconds);
		
	}
}
