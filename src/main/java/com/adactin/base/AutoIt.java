package com.adactin.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Sowmi\\ganishka_workspace_new\\AdactinCucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		
		WebElement chooseFile = driver.findElement(By.xpath("(//div[text()='or drop Word files here']//parent::div/div[2]/button/span[text()='Choose Files'])[1]"));
		chooseFile.click();
		Runtime.getRuntime().exec("C:\\Users\\Bharath\\Desktop\\autofile.exe");
		
		
		
	}

}
