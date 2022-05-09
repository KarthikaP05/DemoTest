package com.opencart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
		public static WebDriver driver;

		@FindBy(xpath = "//span[text()='Hello, Sign in']")
		private WebElement account;
		
		@FindBy(id = "ap_email")
		private WebElement email;
		
		@FindBy(name = "password")
		private WebElement password;
		
		@FindBy(id = "signInSubmit")
		private WebElement Login_Button;
		
		public Login_Page(WebDriver driver2) {
			Login_Page.driver = driver2;	//Assigning the driver
			PageFactory.initElements(driver2, this); 	//initialize the web elements
		}
		
		public WebElement getAccount() {
			return account;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}
		
		public WebElement getLogin_Button() {
			return Login_Button;
		}
}