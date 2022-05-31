package StepDefination;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddcustomerPage;
import PageObject.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginSteps extends Baseclass {
	

@Given("User Launch Chrome browser")
public void user_launch_chrome_browser() {

    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
    driver=new ChromeDriver();
    lp=new Loginpage(driver);
}

@When("User Opens URL {string}")
public void user_opens_url(String url) {
    
	driver.get(url);
}

@Then("User enter Email as {string} and Password as {string}")
public void user_enter_email_as_and_password_as(String uname, String password) {
    
	lp.setUsername(uname);
	lp.setPassword(password);
}

@Then("Click on Login")
public void click_on_login() {
    
	lp.login();
}

@Then("Page Tiltle Should be {string}")
public void page_tiltle_should_be(String title) {
    
	Assert.assertEquals(title, driver.getTitle());
		
		System.out.println(driver.getTitle());
	}


@When("User Click on Log Out link")
public void user_click_on_log_out_link() {
   
	lp.logout();
	
}

@Then("Page Should be {string}")
public void page_should_be(String title) {
    
	
}

@Then("Close The Browser")
public void close_the_browser() throws InterruptedException {
  
	driver.quit();
	
	Thread.sleep(3000);
}


@Then("User can View Dashboard")
public void user_can_view_dashboard() {
	System.out.println("driver"+driver);
    
	addCust = new AddcustomerPage(driver);
	Assert.assertEquals("Dashboard / nopCommerce administration",addCust.gettitlePage());
	System.out.println("pass");
}


@When("User click customer menue")
public void user_click_customer_menue() throws InterruptedException {
	
	Thread.sleep(3000);
    addCust.clickOnCustomermenue();
}

@When("Click customer menue item")
public void click_customer_menue_item() throws InterruptedException {
	
	Thread.sleep(3000);
	 addCust.ClickonCustomerMenueItem();
	
    
}

@When("Click on Add new button")
public void click_on_add_new_button() throws InterruptedException {
    
	 addCust.addNewcust();
	 Thread.sleep(3000);
}

@Then("User can view add new customer page")
public void user_can_view_add_new_customer_page() {
	
	addCust = new AddcustomerPage(driver);
	
	System.out.println(driver.getTitle());
	Assert.assertEquals("Add a new customer / nopCommerce administration",addCust.gettitlePage() );
    
}

@When("User enter customer info")
public void user_enter_customer_info()  {
	
	String  emails=randomstring()+"@gmail.com";
	//String emails = randomstring() + "gmail.com";

	addCust.setEmail(emails);
	addCust.setpassword("test123");

	addCust.setFirstname("Pavan");
	addCust.setLarstname("Kumar");
	addCust.setGender("Male");
	addCust.setAdmincontent("This is for Testing");
	try {
		addCust.setcustomerrole("Guests");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	    
	    addCust.setmanageVender("Vendor 1");
	    
	    addCust.setDofB("10/12/2020");
	    addCust.setCompanynm("busyQA");
}

@When("Click on save button")
public void click_on_save_button() throws InterruptedException {
 
	addCust.clickSave();
	Thread.sleep(3000);
	
}

@Then("User can view conformation message {string}")
public void user_can_view_conformation_message(String string) {
	
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
  
}

//Step for Search Customer  by Using  Email id

@When("Enter customer Email")
public void enter_customer_email() {
    
}

@When("lick on Search button")
public void lick_on_search_button() {
    
}

@Then("User found email in search table")
public void user_found_email_in_search_table() {
   
}



}
