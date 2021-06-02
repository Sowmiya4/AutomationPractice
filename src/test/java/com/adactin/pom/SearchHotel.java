package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement numbrooms;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement in;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement out;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	
    @FindBy(xpath="//input[@name='Submit']")
	private WebElement searchbtn;
		
	public SearchHotel(WebDriver sdriver) {
		this.driver=sdriver;
		PageFactory.initElements(driver, this);	
		
	}
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}
	
	public WebElement getRoom() {
		return room;
	}
	
	public WebElement getNumbrooms() {
		return numbrooms;
	}
	public WebElement getIn() {
		return in;
	}
	public WebElement getOut() {
		return out;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearchBtn() {
		return searchbtn;
	}
}
