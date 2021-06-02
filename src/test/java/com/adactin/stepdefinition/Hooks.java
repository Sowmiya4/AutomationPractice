package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before("@Login")
	public void beforeScenario(Scenario scenario) {
		
		System.out.println("Scenario Name:  "+scenario.getName());

	}
	@After("@Login")
	public void afterScenario(Scenario scenario) throws IOException {

		if(scenario.isFailed()) {
			String id=scenario.getId();
			System.out.println("Scenario id is:"+id);
			screenSht(id);
		}
		System.out.println("	Status: "+scenario.getStatus());
		System.out.println("    Id:"+scenario.getId());

	}
	
	

}
