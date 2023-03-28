package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

import Telus.Project_Ninja_Utilites.Utilites;

public class EmailPage_Validation extends BaseClass {
	By fn = By.xpath("//*[@id=\"input-firstname\"]");
	By ln = By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By phone=By.xpath("//*[@id=\"input-telephone\"]");
	By pass=By.xpath("//*[@id=\"input-password\"]");
	By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By emsg=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By emissemail=By.xpath("//p[contains(text(),'If you already have an account with us, please log')]");
	By e1=By.xpath("//*[@id=\"account\"]/div[4]/div/div");
	public void register_Page() throws Throwable {


		enterText(fn,dataPro.getProperty("firstName"));
		enterText(ln,dataPro.getProperty("lastName"));
		enterText(email,Utilites.random_EmailID());
		enterText(phone,dataPro.getProperty("phoneNo"));
		enterText(pass,dataPro.getProperty("password"));
		enterText(cpass,dataPro.getProperty("password"));
		click(sub);
		click(check);
		click(con);
	}
	public void email_Validation() {
		WebElement eee=driver.findElement(emsg);
		String em=eee.getText();
		Assert.assertEquals(em, dataPro.getProperty("emailmsg"), "Email error message is not showing correct");
		
	}
	public void email_Verification1() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("amotoori");
		Thread.sleep(2000);
		driver.findElement(con).click();
		WebElement s=driver.findElement(emissemail);
		String s1=s.getText();
		Assert.assertEquals(s1, dataPro.getProperty("emissemial"), "Email error message is not showing correct");
	
	}
	public void email_Verification2() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("amotoori@");
		Thread.sleep(2000);
		driver.findElement(con).click();
		WebElement s=driver.findElement(emissemail);
		String s1=s.getText();
		Assert.assertEquals(s1, dataPro.getProperty("emissemial"), "Email error message is not showing correct");
	
	}
	public void email_Verification3() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("amotoori@gmail");
		Thread.sleep(2000);
		driver.findElement(con).click();
		WebElement s=driver.findElement(e1);
		String s1=s.getText();
		Assert.assertEquals(s1, dataPro.getProperty("e1"), "Email error message is not showing correct");
	
	}
	public void email_Verification4() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("amotoori@gmail.");
		Thread.sleep(2000);
		driver.findElement(con).click();
		WebElement s=driver.findElement(e1);
		String s1=s.getText();
		Assert.assertEquals(s1, dataPro.getProperty("e1"), "Email error message is not showing correct");
	
	}
}
