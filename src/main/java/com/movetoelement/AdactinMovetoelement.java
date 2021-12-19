package com.movetoelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinMovetoelement {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//select[@name='location']")
	private WebElement select;
	
	public AdactinMovetoelement(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements( driver2,this);
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSelect() {
		return select;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoomtypes() {
		return roomtypes;
	}


	public WebElement getRoomnos() {
		return roomnos;
	}


	public WebElement getDatein() {
		return datein;
	}


	public WebElement getDateout() {
		return dateout;
	}


	public WebElement getAroom() {
		return aroom;
	}


	@FindBy (xpath = "//select[@name='hotels']")
	private WebElement hotel;
	
	
	@FindBy (xpath = "//select[@name='room_type']")
	private WebElement roomtypes;
	
	
	@FindBy (xpath = "//select[@name='room_nos']")
	private WebElement roomnos;
	
	@FindBy (xpath = "//input[@name='datepick_in']")
	private WebElement datein;
	
	
	@FindBy (xpath = "//input[@name='datepick_out']")
	private WebElement dateout;
	
	
	@FindBy (xpath = "//select[@name='adult_room']")
	private WebElement aroom;
	
	
	@FindBy (id = "first_name")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCcnum() {
		return ccnum;
	}


	public WebElement getCctype() {
		return cctype;
	}


	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}


	public WebElement getCcexpyear() {
		return ccexpyear;
	}


	public WebElement getCvv() {
		return cvv;
	}


	@FindBy (id = "last_name")
	private WebElement lastname;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement ccnum;
	
	@FindBy (id = "cc_type")
	private WebElement cctype;
	
	
	@FindBy (id = "cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy (id = "cc_cvv")
	private WebElement cvv;
	
	
	

}
