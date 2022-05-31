package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Loginpage {

	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
		
	}
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id="Password")
	WebElement txtpass;
	
	@FindBy(xpath="//input[@value= 'Log in']")
	WebElement btnlogin;
	
	
	@FindBy(linkText = "Logout")
	WebElement btnlogout;
	
	public void setUsername(String usernm)
	{
		txtemail.clear();
		txtemail.sendKeys(usernm);
		
	}
	
	public void setPassword(String pwd)
	{
		txtpass.clear();
		txtpass.sendKeys(pwd);
	}
	
	public void login() {
		btnlogin.click();
	}
	
	public void logout()
	{
		btnlogout.click();
	}
}
