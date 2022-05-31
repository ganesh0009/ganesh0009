package StepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddcustomerPage;
import PageObject.Loginpage;

public class Baseclass {
	
	

	
	public static WebDriver  driver;
	public Loginpage lp;
	public AddcustomerPage addCust;

	
	// created for generating random string for email
	public static String randomstring()
	{
		String generatingString1 = RandomStringUtils.randomAlphabetic(5);
		
		return (generatingString1) ;
		
	}
}