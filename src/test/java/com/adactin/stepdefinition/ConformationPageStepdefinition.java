package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.ConformationPage;

import cucumber.api.java.en.*;

public class ConformationPageStepdefinition extends BaseClass {

	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^user enter Firstname$")
	public void user_enter_Firstname() throws Throwable {

		inputOnElement(pom.getCp().getFirstname(), "Sowmiya");

	}

	@When("^user enter Lastname$")
	public void user_enter_Lastname() throws Throwable {

		inputOnElement(pom.getCp().getLastname(), "Sri");

	}

	@When("^user enter Address$")
	public void user_enter_Address() throws Throwable {

		inputOnElement(pom.getCp().getAddress(), "xxxxxx");
	}

	@When("^user enter Cardno$")
	public void user_enter_Cardno() throws Throwable {

		inputOnElement(pom.getCp().getCardno(), "1236547896541236");

	}

	@When("^user enter Cardtype$")
	public void user_enter_Cardtype() throws Throwable {

		dropDown(pom.getCp().getCardtype(), "value", "VISA");

	}

	@When("^user enter Expirymonth$")
	public void user_enter_Expirymonth() throws Throwable {

		dropDown(pom.getCp().getExpirymonth(), "text", "October");

	}

	@When("^user enter Expiryyear$")
	public void user_enter_Expiryyear() throws Throwable {

		dropDown(pom.getCp().getExpiryyear(), "value", "2021");

	}

	@When("^user enter Cvvnumber$")
	public void user_enter_Cvvnumber() throws Throwable {

		inputOnElement(pom.getCp().getCvvnumber(), "123");

	}

	@When("^user enter Booknow$")
	public void user_enter_Booknow() throws Throwable {

		clickOnElement(pom.getCp().getBooknow());

	}

	@Then("^user click login in the conformationpage$")
	public void user_click_login_in_the_conformationpage() throws Throwable {

		clickOnElement(pom.getCp().getLogout());
	}

}
