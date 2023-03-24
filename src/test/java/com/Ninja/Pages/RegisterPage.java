package com.Ninja.Pages;

import org.openqa.selenium.By;

import com.Ninja.BaseClass.BaseClass;

import Telus.Project_Ninja_Utilites.Utilites;


public class RegisterPage extends BaseClass{
	
	 By fn = By.xpath("//*[@id=\"input-firstname\"]");
	 By ln = By.xpath("//*[@id=\"input-lastname\"]");
	 By email=By.xpath("//*[@id=\"input-email\"]");
	 By phone=By.xpath("//*[@id=\"input-telephone\"]");
	 By pass=By.xpath("//*[@id=\"input-password\"]");
	 By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	 By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	 By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	 By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	 By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	 By log=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
	
	
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
		Thread.sleep(5000);
		driver.findElement(account).click();
		driver.findElement(log).click();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	

}
