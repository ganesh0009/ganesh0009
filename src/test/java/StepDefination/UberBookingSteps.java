package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	

@Given("User want to select a car type {string} from uber app")
public void user_want_to_select_a_car_type_from_uber_app(String carType) {
    
	System.out.println("Step no1: " + carType);
}

@When("User select a car {string} abd pickup point {string} and drop location {string}")
public void user_select_a_car_abd_pickup_point_and_drop_location(String carType, String pickuplocation, String dropelocation) {
    
	System.out.println("step no2:" + " careType " + " " + pickuplocation + " " + dropelocation);
}

@Then("Driver start journy")
public void driver_start_journy() {
	
	System.out.println( "Step no3:");
    
}

@Then("Driver ends journy")
public void driver_ends_journy() {
	
	System.out.println( "Step no4:");
    
   
}

@Then("User pay {int} USD")
public void user_pay_usd(Integer int1) {
	
	System.out.println( "Step no5:");
    
   
}

}
