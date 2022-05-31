package StepDefination;

import Amazonimplimention.Product;
import Amazonimplimention.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchstep {
	
Product product;
Search search;

@Given("I have search field on Amazon  Page")
public void i_have_search_field_on_amazon_page() {
	System.out.println("Step no1: I am on Search page");

}
	@When("I Search Product with name {string} and price {int}")
	public void i_search_product_with_name_and_price(String pronam, Integer proprice) {
		System.out.println("Step no2: Search the product with name : " + pronam + "proprice:" + proprice);
		
		product=new Product(pronam,proprice);
	    
	}

	@Then("product with name {string} is display")
	public void product_with_name_is_display(String pronam) {
		
		System.out.println("Step no3: product " + pronam + "is display");
		
		//search = new Search();
	   // search.displayproduct(product);
		
	    
		
	}
}


