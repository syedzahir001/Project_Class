package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {

		driver.get(url);
	}

	public static void Clickonelement(WebElement element) {
		element.click();

	}

	public static void Sendkeys(WebElement element, String value) {

		element.sendKeys(value);
	}
	
	

}
