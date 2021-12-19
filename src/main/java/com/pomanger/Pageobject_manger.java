package com.pomanger;

import org.openqa.selenium.WebDriver;

import com.adactinclick.AdactinClickonelement;
import com.adactinsign.Signinpage;
import com.movetoelement.AdactinMovetoelement;

public class Pageobject_manger {
	public static WebDriver driver;
	
	private Signinpage se;
	
	private AdactinClickonelement ci;
	
	private AdactinMovetoelement am;
	
	public Pageobject_manger(WebDriver driver2) {
		this.driver = driver2;
	}

	public Signinpage getinstancese() {
		
		if (se == null) {
			
			se = new Signinpage(driver);
			
			
		}
		return se;
		
	}
	
	public AdactinMovetoelement getmovetoelement() {
		
		if (am == null) {
			
			am = new AdactinMovetoelement(driver);
			
			
		}
		
		return am;
		
	}
	public AdactinClickonelement getclickonelement() {
		
		if (ci == null) {
			
			ci = new AdactinClickonelement(driver);
			
			
		}
		
		return ci;
	}

}
