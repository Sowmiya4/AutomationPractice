package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

	
	public  class LoginStepDefinition extends BaseClass {

		public static WebDriver driver = Runner.driver;

		public static PageObjectManager pom = new PageObjectManager(driver);

		@Given("^the user is logged in$")
		public void the_user_is_logged_in() throws Throwable {

			System.out.println("User starts to login into the application");

		}
		
		@Then("^go to landing page$")
		public void go_to_landing_page() throws Throwable {

			System.out.println("User logged on");
		}


		@When("^user enter application url$")
		public void user_enter_application_url() throws Throwable {
			String url = FileReaderManager.getInstance().getCrInstance().getUrl();
			getUrl(url);
		}
		
		@When("^user enter SowmiyaSri as username$")
		public void user_enter_SowmiyaSri_as_username(String arg1) throws Throwable {

			inputOnElement(pom.getLp().getUserName(), "SowmiyaSri");
		}

		@When("^user enter Sowmiya05 as password$")
		public void user_enter_as_Sowmiya05_as_password(String arg1) throws Throwable {

			inputOnElement(pom.getLp().getPassword(), "Sowmiya05");
		}

		@Then("^user verify the valid username and valid password in the homepage$")
		public void user_verify_the_valid_username_and_valid_password_in_the_homepage() throws Throwable {

			clickOnElement(pom.getLp().getLoginBtn());
		}

		@When("^user enter the application url$")
		public void user_enter_the_application_url() throws Throwable {

			String url = FileReaderManager.getInstance().getCrInstance().getUrl();
			getUrl(url);
		
		}
		
		@When("^user enter \"([^\"]*)\" as username$")
		public void user_enter_as_username(String arg1) throws Throwable {

			inputOnElement(pom.getLp().getUserName(), arg1);
		}

		@When("^user enter \"([^\"]*)\" as password$")
		public void user_enter_as_password(String arg1) throws Throwable {

			inputOnElement(pom.getLp().getPassword(), arg1);
		}

		@Then("^user verify the username in the homepage$")
		public void user_verify_the_username_in_the_homepage() throws Throwable {

			clickOnElement(pom.getLp().getLoginBtn());
		}

	}


