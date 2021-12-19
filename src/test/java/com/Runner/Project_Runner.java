package com.Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Baseclass.Base_Class;
import com.pom.Enter_page;
import com.pom.Home_page;
import com.pom.Sendelements;

public class Project_Runner extends Base_Class {
	public static WebDriver driver  = getbrowser("Chrome");

	public static void main(String[] args) throws InterruptedException, IOException {

		Enter_page ep = new Enter_page(driver);
		
		Sendelements se = new Sendelements(driver);
		

		geturl("http://automationpractice.com/index.php?id_category=5&controller=category");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);

		Clickonelement(ep.getAdd());

		Clickonelement(ep.getAdd());

		Thread.sleep(2000);

		Clickonelement(ep.getProceed());

		Thread.sleep(2000);

		Clickonelement(ep.getBtn());

		Thread.sleep(2000);

		Sendkeys(se.getEmail(), "nileg46187@latovic.com");

		Sendkeys(se.getPssd(), "nileg46187");

		Clickonelement(ep.getBtn1());

		Thread.sleep(2000);

		Clickonelement(ep.getBtn2());

		Thread.sleep(2000);

		Clickonelement(ep.getCheckb());

		Clickonelement(ep.getBtn3());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\home\\eclipse-workspace\\Selenium\\Screenshoot\\payment.png");

		FileUtils.copyFile(screenshotAs, dest);

		// WebElement Add = driver.findElement(By.xpath("//span[contains(text(),'Add to
		// cart')]"));

//		WebElement proceed = driver.findElement(
//				By.xpath("//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));

		// WebElement btn =
		// driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span"));

		// WebElement email = driver.findElement(By.id("email"));

		// email.sendKeys("nileg46187@latovic.com");

		// WebElement pssd = driver.findElement(By.id("passwd"));

		// psd.sendKeys("nileg46187");

//		WebElement btn1 = driver
//				.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));

		// btn1.click();

		// WebElement btn2 =
		// driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/form/p/button/span"));

		// btn2.click();

		// WebElement checkb =
		// driver.findElement(By.xpath("//input[@type='checkbox']"));

		// checkb.click();

//		WebElement btn3 = driver
//				.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/form/p/button/span"));

		// btn3.click();

	}

}
