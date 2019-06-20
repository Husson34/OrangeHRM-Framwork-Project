package com.OrangeHRM.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	@Given("I navigated to Google")
	public void i_navigated_to_Google() {
	    System.out.println("I am on google page");
	}

	@When("I type search item")
	public void i_type_search_item() {
		System.out.println("I search for item");
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		System.out.println("I click on button");
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() {
		System.out.println("results are displayed");
	}


	
	
	
	
}
