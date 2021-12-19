package com.adactinsign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	public WebDriver driver;
	
	
	@FindBy (id = "username")
	private WebElement username;
	
	
	public Signinpage(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
		
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}


	@FindBy (id = "password")
	private WebElement pass;
	
	
	
	
	

}
