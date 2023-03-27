package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

import Telus.Project_Ninja_Utilites.Utilites;


public class RegisterFromFilling extends BaseClass{
	
	 By fn = By.xpath("//*[@id=\"input-firstname\"]");
	 By ln = By.xpath("//*[@id=\"input-lastname\"]");
	 By email=By.xpath("//*[@id=\"input-email\"]");
	 By phone=By.xpath("//*[@id=\"input-telephone\"]");
	 By pass=By.xpath("//*[@id=\"input-password\"]");
	 By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	 By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	 By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	 By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	 By success=By.xpath("//*[@id=\"content\"]/p[1]");
	
	 
	 
	 
	
	
	public void register_Page() throws Throwable {
	
		
		driver.findElement(fn).sendKeys(dataPro.getProperty("firstName"));
		driver.findElement(ln).sendKeys(dataPro.getProperty("lastName"));
		driver.findElement(email).sendKeys(Utilites.random_EmailID());
		driver.findElement(phone).sendKeys(dataPro.getProperty("phoneNo"));
		driver.findElement(pass).sendKeys(dataPro.getProperty("password"));
		driver.findElement(cpass).sendKeys(dataPro.getProperty("password"));
		driver.findElement(sub).click();
		driver.findElement(check).click();
		driver.findElement(con).click();
		

	}
	public void validate_SuccessPage() {
		WebElement s=driver.findElement(success);
		String actualSuccessMsg=s.getText();
		Assert.assertEquals(actualSuccessMsg, dataPro.getProperty("successmsg"), "SuccessFull mesaage not showing correct");
		
	}
	

}
