package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;

import cucumber.api.java.en.*;

public class BookingPageStepDefinition extends BaseClass{

	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^user select radio button$")
	public void user_select_radio_button() throws Throwable {

		clickOnElement(pom.getBp().getRadio());

	}

	@Then("^user click continue in the bookingpage$")
	public void user_click_continue_in_the_bookingpage() throws Throwable {

		clickOnElement(pom.getBp().getContinue());
	}
}
