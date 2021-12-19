package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sendelements {
	
	public WebDriver driver;
	
	@FindBy (id = "email")
	private WebElement email;
	
	
	public Sendelements(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}


	public WebElement getEmail() {
		return email;
	}

	public WebElement getPssd() {
		return pssd;
	}

	@FindBy ( id = "passwd")
	private WebElement pssd;
	
	
}
