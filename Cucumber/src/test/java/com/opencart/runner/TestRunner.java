package com.opencart.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.junit.BeforeClass;
import Cucumber.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\opencart\\feature", glue = "src\\test\\java\\com\\opencart\\stepdefinition")

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.getBrowser("Chrome");
	}
}