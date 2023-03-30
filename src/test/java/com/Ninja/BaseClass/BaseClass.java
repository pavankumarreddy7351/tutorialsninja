package com.Ninja.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.model.Log;

import Telus.Project_Ninja_Utilites.Utilites;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public  static Properties pro;
	public static  Actions action;
	public  Random rand;
	public  static Properties dataPro;

	@BeforeSuite
	public static void launchApplication() {
		DOMConfigurator.configure("log4j.xml");
		pro = new Properties();
		File proFile = new File(System.getProperty("user.dir") + ".//src/test/java/com/Ninja/Config/config.properties");
		dataPro = new Properties();
		File dataFile = new File(
				System.getProperty("user.dir") + ".//src/test/java/com/Ninja/TestData/TestData.properties");

		try {
			FileInputStream dataFis = new FileInputStream(dataFile);
			dataPro.load(dataFis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(proFile);
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		String browserName=pro.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilites.PAGE_Load_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilites.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);
		driver.get(pro.getProperty("testURL"));
		action = new Actions(driver);


	}
	public static  WebElement Xpath(By Xpath) {
		return driver.findElement(Xpath);
	}
	public void enterText(By Xpath,String text) {
		driver.findElement(Xpath).click();
		driver.findElement(Xpath).clear();
		driver.findElement(Xpath).sendKeys(text);
	}
	public static String getText(By Xpath) {
		return driver.findElement(Xpath).getText();
	}
	public static void click(By Xpath) {
		driver.findElement(Xpath).click();
	}
	public static void clear(By Xpath) {
		driver.findElement(Xpath).clear();
	}
	public static void getAttribute(By Xpath,String getText) {
		driver.findElement(Xpath).getAttribute(getText);
	}
	public String getURL() {
		return driver.getCurrentUrl();
	}
//	public void enterTextPFM(WebElement element,String text) {
//		try {
//			element.clear();
//			Log.info("Text in element : " + element + " is cleared");
//			element.click();
//			Log.info("Click on Text Box: " + element);
//			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
//			element.sendKeys(text);
//			Log.info("Enter text on " + element + " :" + text);
//		} catch (Exception e) {
//			Log.error(e.getMessage());
//		}
//	}
	@AfterSuite
	public static void closeApplication() {
		driver.quit();
	}
}
