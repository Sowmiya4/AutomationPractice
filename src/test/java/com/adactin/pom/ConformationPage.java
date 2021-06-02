package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationPage {
	
	public static WebDriver driver;
	
    @FindBy(xpath="(//input[@class='reg_input'])[1]")
    private WebElement firstname;
    
    @FindBy(xpath="(//input[@class='reg_input'])[2]")
    private WebElement lastname;
    
    @FindBy(xpath="//textarea[@class='txtarea']")
    private WebElement address;
    
    @FindBy(xpath="(//input[@class='reg_input'])[3]")
    private WebElement cardno;
    
    @FindBy(xpath="//select[@class='select_combobox']")
    private WebElement cardtype;
    
    @FindBy(xpath="(//select[@class='select_combobox2'])[1]")
    private WebElement expirymonth;
    
    @FindBy(xpath="(//select[@class='select_combobox2'])[2]")
    private WebElement expiryyear;
    
    @FindBy(xpath="(//input[@class='reg_input'])[4]")
    private WebElement cvvnumber;
    
    @FindBy(xpath="//input[@id='book_now']")
    private WebElement booknow;
    
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logout;
    
    public ConformationPage(WebDriver cdriver) {
    	this.driver=cdriver;
    	PageFactory.initElements(driver,this);
    }


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}
	
	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
    
    public WebElement getLogout() {
    	return logout;
    }

}
