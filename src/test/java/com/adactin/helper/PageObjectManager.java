package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingPage;
import com.adactin.pom.ConformationPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginPage lp;
	private SearchHotel sp;
	private BookingPage bp;
	private ConformationPage cp;

	public PageObjectManager(WebDriver ldriver) {

		this.driver = ldriver;
	}

	public LoginPage getLp() {

		lp = new LoginPage(driver);
		return lp;
	}

	public SearchHotel getSh() {
		sp = new SearchHotel(driver);
		return sp;
	}

	public BookingPage getBp() {
		bp = new BookingPage(driver);
		return bp;
	}

	public ConformationPage getCp() {
		cp = new ConformationPage(driver);
		return cp;
	}

}
