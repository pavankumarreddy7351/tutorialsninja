package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

import Telus.Project_Ninja_Utilites.Utilites;

public class SubscriptionPage_Validation extends BaseClass{
	By fn = By.xpath("//*[@id=\"input-firstname\"]");
	By ln = By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By phone=By.xpath("//*[@id=\"input-telephone\"]");
	By pass=By.xpath("//*[@id=\"input-password\"]");
	By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By success=By.xpath("//*[@id=\"content\"]/h1");
	By continueButton=By.xpath("//*[@id=\"content\"]/div/div/a");
	By news=By.xpath("//*[@id=\"column-right\"]/div/a[12]");
	By yes=By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[1]");
	By no=By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[2]");

	public void validate_Yes_Subcription() {
		
		enterText(fn,dataPro.getProperty("firstName"));
		enterText(ln,dataPro.getProperty("lastName"));
		enterText(email,Utilites.random_EmailID());
		enterText(phone,dataPro.getProperty("phoneNo"));
		enterText(pass,dataPro.getProperty("password"));
		enterText(cpass,dataPro.getProperty("password"));
		click(sub);
		click(check);
		click(con);
		
		WebElement n=driver.findElement(news);
		action.moveToElement(n).click().perform();
		Assert.assertTrue(driver.findElement(yes).isDisplayed());
		Assert.assertTrue(driver.findElement(yes).isEnabled());
		
	}
public void validate_No_Subcription() {
		
	enterText(fn,dataPro.getProperty("firstName"));
	enterText(ln,dataPro.getProperty("lastName"));
	enterText(email,Utilites.random_EmailID());
	enterText(phone,dataPro.getProperty("phoneNo"));
	enterText(pass,dataPro.getProperty("password"));
	enterText(cpass,dataPro.getProperty("password"));
	//click(sub);
	click(check);
	click(con);
		WebElement n=driver.findElement(news);
		action.moveToElement(n).click().perform();
		Assert.assertTrue(driver.findElement(no).isDisplayed());
		Assert.assertTrue(driver.findElement(no).isEnabled());
	
	}
}
