package com.auth.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class RegisterSteps {
	private String password;
	@Given("^FA wants to register details$")
	public void fa_wants_to_register_details() throws Throwable {
	 	}

	@When("^he enters a his name (.*) and valid email address (.*)$")
	public void he_enters_a_his_name_Adviser_and_valid_email_address_kalpana_vonteri_gmail_com(String name, String email) throws Throwable {
		validateDetails(email);
	}

	@Then("^FA should get mail with password$")
	public void fa_should_get_mail_with_password() throws Throwable {
	    assertTrue("password not generated ",password.contains("password"));
	}
	
	private void validateDetails(String email){
		if(email.contains("@")){
			password = "passwordone";
		}else
			password = "error";
		
	}

}
