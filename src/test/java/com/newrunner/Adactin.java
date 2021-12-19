package com.newrunner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.adactinclick.AdactinClickonelement;
import com.adactinproperties.Filereader_Manager;
import com.adactinsign.Signinpage;
import com.adctinbase.Adactin_baseclass;
import com.movetoelement.AdactinMovetoelement;
import com.pom.Sendelements;
import com.pomanger.Pageobject_manger;

public class Adactin extends Adactin_baseclass {

	public static WebDriver driver = getbrowser("Chrome");
	
	public static Pageobject_manger pom = new Pageobject_manger(driver);
	
	public static Logger log = Logger.getLogger(Adactin.class);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = Filereader_Manager.getinstaceFRM().getinstanceCR().geturl();
		
		log.info("Browser Lanch");

		geturl(url);

		
		String username = Filereader_Manager.getinstaceFRM().getinstanceCR().getusername();

		sendkeys(pom.getinstancese().getUsername(),username);
		
		String password = Filereader_Manager.getinstaceFRM().getinstanceCR().getpassword();

		sendkeys(pom.getinstancese().getPass(), password);

		Clickonelement(pom.getclickonelement().getLogin());
		
		log.info("Login success");
		
		String place = exceldata("C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Mini_Project\\Adactin Test case.xlsx", 4, 5);

		Movetoelement(pom.getmovetoelement().getSelect(), place);

		Movetoelement(pom.getmovetoelement().getHotel(), "Hotel Sunshine");

		Movetoelement(pom.getmovetoelement().getRoomtypes(), "Double");

		Movetoelement(pom.getmovetoelement().getRoomnos(), "3");

		Movetoelement(pom.getmovetoelement().getDatein(), "16/12/2021");

		Movetoelement(pom.getmovetoelement().getDateout(), "17/12/2021");

		Movetoelement(pom.getmovetoelement().getAroom(), "2");
		
		Clickonelement(pom.getclickonelement().getSubmit());
		
		Clickonelement(pom.getclickonelement().getRadiobtn());
		
		Clickonelement(pom.getclickonelement().getConti());
		
		log.info("Details Given");
		
		Movetoelement(pom.getmovetoelement().getFirstname(), "syed");
		
		Movetoelement(pom.getmovetoelement().getLastname(), "sye");
		
		Movetoelement(pom.getmovetoelement().getAddress(), "NO;2 vedal street");
		
		Movetoelement(pom.getmovetoelement().getCcnum(), "5435345454678765");
		
		Movetoelement(pom.getmovetoelement().getCctype(), "VISA");
		
		Movetoelement(pom.getmovetoelement().getCcexpmonth(), "May");
		
		Movetoelement(pom.getmovetoelement().getCcexpyear(), "2012");
		
		Movetoelement(pom.getmovetoelement().getCvv(), "223");
		
		Clickonelement(pom.getclickonelement().getBook());
		
		log.info("Hotel Booked");
		
		

//		Signinpage se = new Signinpage(driver);
//
//		AdactinClickonelement ci = new AdactinClickonelement(driver);
//
//		AdactinMovetoelement am = new AdactinMovetoelement(driver);
		
		
		
		
		

	}

}
