package com.adactinclick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinClickonelement {

	public WebDriver driver;
	
	public AdactinClickonelement(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	@FindBy(id = "login")
	private WebElement login;

	
	public WebDriver getDriver() {

		return driver;
	}

	public WebElement getLogin() {
		return login;
	}
	

	@FindBy (id = "Submit")
	private WebElement submit;


	public WebElement getSubmit() {
		return submit;
	}
	
	
	@FindBy (id = "radiobutton_0")
	private WebElement radiobtn;
	

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getConti() {
		return conti;
	}

	@FindBy (id = "continue")
	private WebElement conti;
	
	@FindBy (id = "book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}
	

}
