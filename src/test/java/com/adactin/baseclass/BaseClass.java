package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

//browserlaunch
	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid browsername");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();

		return driver;

	}

//url
	public static void getUrl(String url) {
		driver.get(url);
	}

//dropdown
	public static void dropDown(WebElement element, String option, String value) {

		Select s = new Select(element);
		try {
			if (option.equals("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else if (option.equals("value")) {
				s.selectByValue(value);
			} else if (option.equals("text")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

//inputOnElement
	public static void inputOnElement(WebElement element, String value) {

		element.sendKeys(value);
	}
//click
	public static void clickOnElement(WebElement element) {

		element.click();
	}

//scrollud
	public static void scrollUd(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,-4000)");

	}

//screenshot
	public static void screenSht(String fileName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Sowmi\\ganishka\\SeleniumProject\\ScreenShots\\" + fileName + ".png");
		FileUtils.copyFile(sourcefile, destfile);
	}

//alert
	public static void alertOk() throws InterruptedException {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertCancel() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void alertPrompt() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sowmiya");
		alert.accept();

	}

//sendkeys
	public static void sendKeys(WebElement element, String name) {

		element.sendKeys(name);
	}

//navigateto
	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}

//back
	public static void navigateBack() {

		driver.navigate().back();
	}

//forward
	public static void navigateForward() {

		driver.navigate().forward();
	}

//refresh
	public static void navigateRefresh() {

		driver.navigate().refresh();
	}

//enabled
	public static void enable(WebElement element) {

		element.isEnabled();
	}

//displayed
	public static void display(WebElement element) {

		element.isDisplayed();
	}

//selected
	public static void selected(WebElement element) {

		element.isSelected();
	}

//currenturl
	public static void currentUrl(String url) {

		driver.getCurrentUrl();
	}

//gettitle
	public static void title(String title) {

		driver.getTitle();
	}

//text
	public static void text(WebElement element) {

		System.out.println(element.getText());
	}

//attributes
	public static void attributes(WebElement element) {
		String attributes = element.getAttribute("value");
	}

//options
	public static void options(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement s1 : options) {
			System.out.println(s1.getText());
		}
	}

//rightclick
	public static void rightClick(WebElement element) {

		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

//doubleclick
	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();

	}

//draganddrop
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

//movetoelement
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).build().perform();
	}

//singleframe
	public static void singleFrames(String value) {

		driver.switchTo().frame(value);

	}

//frames
	public static void frames(WebElement element) {

		driver.switchTo().frame(element);
	}

//iframes
	public static void defaultContent() {

		driver.switchTo().defaultContent();
	}

//robots
	public static void robots() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//radiobtn
	public static void radioBtn(WebElement element) {

		element.click();
	}

//windowhandle
	public static void windowHandles(String value) {

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			System.out.println(id);
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String actualTitle = value;

		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;
			}
		}
	}

//implicit
	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

//explicit
	public static void explicitWait(long timeOutInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

//fluent
	public static void fluentWait() {

		Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(30, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}

//close	
	public static void close() {

		driver.close();
	}

//quit
	public static void quit() {

		driver.quit();
	}
}