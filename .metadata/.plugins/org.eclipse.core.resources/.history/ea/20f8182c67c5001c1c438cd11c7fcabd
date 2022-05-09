package com.opencart.stepdefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.opencart.pom.Login_Page;
import com.opencart.runner.TestRunner;

import Cucumber.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Stepdefinition extends BaseClass  {
	
	public static WebDriver driver = TestRunner.driver;
	
	Login_Page lp = new Login_Page(driver);
	
	@Given("User launches the Amazon web page")
	public void user_launches_the_amazon_web_page() {
	    geturl("https://www.amazon.in/");
	}
	
	@When("User clicks the My Account")
	public void user_clicks_the_my_account() {
	   conceptClick(lp.getAccount());  
	}
	
	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	    sendKey(lp.getEmail(), "9944543706");
	    sendKey(lp.getPassword(), "Padma#14");
	}
	
	@When("User clicks the continue button")
	public void user_clicks_the_continue_button() {
		conceptClick(lp.getLogin_Button());
	}
	
	@Then("It navigates to the home page of Amazon")
	public void it_navigates_to_the_home_page_of_amazon() {
	   assertTrue(driver.getCurrentUrl().endsWith("amazon.in/gp/yourstore/home"));
	    System.out.println("Successfully navigated");
	}

}