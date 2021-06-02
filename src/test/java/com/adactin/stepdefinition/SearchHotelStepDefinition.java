package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends BaseClass {

	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^user enter location$")
	public void user_enter_location() throws Throwable {
		Thread.sleep(3000);
		dropDown(pom.getSh().getLocation(), "text", "London");
	}

	@When("^user enter hotels$")
	public void user_enter_hotels() throws Throwable {
		dropDown(pom.getSh().getHotel(), "text", "Hotel Sunshine");
	}

	@When("^user enter room$")
	public void user_enter_room() throws Throwable {
		dropDown(pom.getSh().getRoom(), "text", "Super Deluxe");

	}

	@When("^user enter numbrooms$")
	public void user_enter_numbrooms() throws Throwable {
		dropDown(pom.getSh().getNumbrooms(), "index", "2");

	}

	@When("^user enter check in date$")
	public void user_enter_check_in_date() throws Throwable {
		clickOnElement(pom.getSh().getIn());
		inputOnElement(pom.getSh().getIn(), "24/12/2019");

	}

	@When("^user enter check out date$")
	public void user_enter_check_out_date() throws Throwable {
		clickOnElement(pom.getSh().getOut());
		inputOnElement(pom.getSh().getOut(), "04/01/2020");

	}

	@When("^user enter adult$")
	public void user_enter_adult() throws Throwable {
		dropDown(pom.getSh().getAdult(), "index", "3");
	}

	@When("^user enter children$")
	public void user_enter_children() throws Throwable {
		dropDown(pom.getSh().getChild(), "index", "2");

	}

	@Then("^user verify the username in the searchpage$")
	public void user_verify_the_username_in_the_searchpage() throws Throwable {
		clickOnElement(pom.getSh().getSearchBtn());
	}

}