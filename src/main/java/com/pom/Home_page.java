package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement Add;

	public Home_page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return Add;
	}
	
	@FindBy(xpath = "//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement proceed;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getBtn() {
		return btn;
	}

	@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement btn;
	
 
}
