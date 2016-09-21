/**
 * 
 */
package com.test.steps;

import static org.junit.Assert.assertTrue;

import com.test.impl.DrivenTestImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author dguduru
 *
 */
public class DrivenTestSteps {
	
	String result;
	DrivenTestImpl service;
	@Given("^I want to test scenario one$")
	public void i_want_to_test_scenario_one() throws Throwable {
		service =new DrivenTestImpl();   
	}

	@When("^I enter valid user is (.*) password is (.*)$")
	public void i_enter_valid_user_is_guduru(String username,String password) throws Throwable {
		result=service.isValiedUser(username,password);
	}
	

	@Then("^should I get a welcome message$")
	public void should_I_get_a_welcome_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The User is "+result,result.equalsIgnoreCase("valid"));
	}
}
