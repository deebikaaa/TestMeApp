package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample14 {

	@Given("user login in to TestMeApp")
	public void user_login_in_to_TestMeApp() {
		System.out.println("user login");
	   
	}

	@When("user selects product as {string}")
	public void user_selects_product_as(String pn) {
		System.out.println("entered product is "+pn);
		
	   
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    System.out.println("user clicks on add to cart");
	}

	@When("User clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("user clicks on cart link");
	   
	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer int1) {
		System.out.println("");
	   
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
	   System.out.println("user has procceded to checkout");
	}

	@Then("verify the review and payment page")
	public void verify_the_review_and_payment_page() {
		System.out.println("user has reviewed the payment page");
	    
	}
}
