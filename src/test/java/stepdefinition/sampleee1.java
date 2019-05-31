package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampleee1 {
	@Given("user login")
	public void user_login() {
	    System.out.println("the user has logged in");
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
		System.out.println("user has selected the product using category");
	    
	}

	@Then("verify the list of products And close application")
	public void verify_the_list_of_products_And_close_application() {
		System.out.println("the list of products has been verified and application has closed");
	   
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() {
		System.out.println("product has been selected using sub-category");
	    
	}

	@When("user selects product using product name")
	public void user_selects_product_using_product_name() {
	   System.out.println("product has been selected");
	}


}
