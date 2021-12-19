package com.adctinbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_baseclass {

	public static WebDriver driver;

	public static String value;

	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static String exceldata(String path, int row_Index, int Cell_Index) throws Throwable {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis); // upcasting

		org.apache.poi.ss.usermodel.Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(Cell_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			value = cell.getStringCellValue();

		}

		else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int val = (int) numericCellValue;

			value = String.valueOf(val);

		}

		return value;

	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void sendkeys(WebElement elements, String value) {

		elements.sendKeys(value);

	}

	public static void Clickonelement(WebElement element) {

		element.click();

	}

	public static void Movetoelement(WebElement element, String value) {

		element.sendKeys(value);

	}

}
