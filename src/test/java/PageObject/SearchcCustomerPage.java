package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitHelper;

public class SearchcCustomerPage {

	public WebDriver ldriver;
	WaitHelper waithelper;

	public SearchcCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	@FindBy(how=How.ID,using ="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.ID,using ="SearchFirstName")
	@CacheLookup
	WebElement txtFirst;
	

	@FindBy(how=How.ID,using ="SearchLastNam")
	@CacheLookup
	WebElement txtLast;
	
	
	@FindBy(how=How.ID, using="SearchMonthOfBirth")
	@CacheLookup
	WebElement drpMonthofBirth;
	
	@FindBy(how=How.ID,using="SearchDayOfBirth")
	@CacheLookup
	WebElement drpDayofBirth;

	@FindBy(how=How.ID,using="SearchCompany")
	@CacheLookup
	WebElement txtCompanyseach;
	
	@FindBy(how=How.XPATH,using="//div[@class='k-multiselect-wrap k-floatwrap']")
	@CacheLookup
	WebElement txtcustomerRole;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Administrators')]")
	@CacheLookup
	WebElement liitemAdministrator;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Forum Moderators')]")
	@CacheLookup
	WebElement liitemForumModerators;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Guests')]")
	@CacheLookup
	WebElement liitemGuests;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Registered')]")
	@CacheLookup
	WebElement liitemRegistered;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Vendors')]")
	@CacheLookup
	WebElement liitemVendors;
	
	@FindBy(how=How.ID,using="search-customers")
	@CacheLookup
	WebElement btnsearchCustomers;
	

	@FindBy(how=How.XPATH,using="//table[@role = 'grid']")
	@CacheLookup
	WebElement tbSearchResult;
	

	@FindBy(how=How.XPATH,using="//table[@id='customers-grid']")
	@CacheLookup
	WebElement table;
	

	@FindBy(how=How.XPATH,using="//table[@id='customer-grid']//tbody/tr")
	@CacheLookup
	List<WebElement> tableRows;
	

	@FindBy(how=How.ID,using="//table[@id='customer-grid']//tbody/tr/td")
	@CacheLookup
	List<WebElement> tableColomns;
	
	public void setEmail(String email) {
		
		waithelper.waitForElement(txtEmail,30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	public void setFirstname(String firststname) {
		
		waithelper.waitForElement(txtFirst,30);
		txtFirst.clear();
		txtFirst.sendKeys(firststname);
	}
	
	public void setLastname(String lastname) {
		
		waithelper.waitForElement(txtLast,30);
		txtLast.clear();
		txtLast.sendKeys(lastname);
	}

}
