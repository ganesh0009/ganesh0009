package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public   WebDriver ldriver;

	public AddcustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	By lnkCustomer_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	
	By lnkCustomer_menueItem = By.xpath(("//span[@class='menu-item-title'][contains(text(),'Customers')]"));
	
	By lnkAdd_newCust = By.xpath("//a[@class='btn bg-blue']");
	
	By txtEmail = By.xpath("//input[@id='Email']");
	
	By txtPassword = By.xpath("//input[@id='Password']");
	
	By txtCustomer_firstName = By.xpath("//input[@id='FirstName']");
	
	By txtCustomer_lastName = By.xpath("//input[@id='LastName']");
	
	By rdMaleGender = By.id("Gender_Male");
	
	By rdFemaleGender = By.id("Gender_Female");
	
	By txtDoB = By.xpath("//Input[@id='DateOfBirth']");
	
	By txtCompanyName = By.xpath("//input[@id='Company']");
	
	By rdistxx = By.xpath("//input[@id='IsTaxExempt']");
	
	By txtNewsletter = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	
	By txtCustRole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	
	By lstitemRegistered = By.xpath("//li[contains(text(),'Registered')]");
	
	By lstitenAdminisrtation = By.xpath("//li[contains(text(),'Administrators')]");
	
    By lstitemforumModetor = By.xpath("//li[contains(text(),'Forum Moderators')]");
	
	By lstitemGuest = By.xpath("//li[contains(text(),'Guests')]");
	
	By lstitemvendor = By.xpath("//li[contains(text(),'Vendors')]");
		
    By listmngrvndr = By.xpath("//select[@id='VendorId']");
    
    By txtAdmincomment = By.xpath("//textarea[@id='AdminComment']");
    
    By btnsave = By.xpath("//button[@name='save']");
    
    By drpmngrofvendor = By.xpath("//*[@id='VendorId']");
    
    //Action metthods
    public String gettitlePage()
    { 
    	//System.out.println("driver"+ldriver);
		return ldriver.getTitle();
    	
    	
    }
    public void clickOnCustomermenue() {
    	
    	ldriver.findElement(lnkCustomer_menu).click();
    }
    
    public void ClickonCustomerMenueItem() {
    	
    	ldriver.findElement(lnkCustomer_menueItem).click();
    }
    
    public void addNewcust() {
    	ldriver.findElement(lnkAdd_newCust).click();
    }
		
    public void setEmail(String email)
		{
			ldriver.findElement(txtEmail).sendKeys(email);
			
			
		}
    
    public void setpassword(String password) {
    	
    	ldriver.findElement(txtPassword).sendKeys(password);
    }
    
    public void setcustomerrole(String role) throws InterruptedException {
    	ldriver.findElement(txtCustRole).click();
    	
    	WebElement listitem;
    	Thread.sleep(3000);
    	
    	if(role.equals("Administrator")) {
    		listitem=ldriver.findElement(lstitenAdminisrtation);
    		}
    	else if(role.equals("Guest")){
    		listitem=ldriver.findElement(lstitemGuest);
    				{
    			if(role.equals("Registered")) {
                    listitem=ldriver.findElement(lstitemRegistered);
    			}
    			else if(role.equals("Vendor")) {
    				listitem=ldriver.findElement(lstitemvendor);
    				
    			}
    			else {
    				listitem=ldriver.findElement(lstitemGuest);
    			}
    			
    		//	listitem.click();
    			
    			JavascriptExecutor js = (JavascriptExecutor)ldriver;
    			js.executeScript("arguments[0].click();",listitem);
    			
    				}
                   
                    	
                    }
    					
    				}

    		
    		
    	
    

	public void setmanageVender(String value) {
		
		Select drp = new Select (ldriver.findElement(drpmngrofvendor));
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender) {
		if(gender.equals("Male")) {
			ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female")){
			ldriver.findElement(rdFemaleGender).click();
			
		}
		else {
			ldriver.findElement(rdMaleGender).click();
		}
		
		}
	
	public void setFirstname(String fname) {
		
		ldriver.findElement(txtCustomer_firstName).sendKeys(fname);
	}
public void setLarstname(String lname) {
		
		ldriver.findElement(txtCustomer_lastName).sendKeys(lname);
	
}
      public void setAdmincontent(String content ) {
    	  
    	  ldriver.findElement(txtAdmincomment).sendKeys(content);
      }
      
      
    	  /*public void setDateofBirth(String birthdate) {
    			
    			ldriver.findElement(txtDoB).sendKeys(birthdate);
    		}*/
    	  
    	 /* public void setCompanynmae(String companynm) {
  			
  			ldriver.findElement(txtCompanyName).sendKeys(companynm);
			
  		}*/
  	  
      
		public void clickSave() {
			
			ldriver.findElement(btnsave).click();
		}
		
		public void setCompanynm(String companynm) {
			ldriver.findElement(txtCompanyName).sendKeys(companynm);
			
			
		}
		public void setDofB(String birthdate) {
			ldriver.findElement(txtDoB).sendKeys(birthdate);
			
		}
			
		}
		
		


