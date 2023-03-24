package com.Ninja.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;


public class Negtive_RegisterPage extends BaseClass{
	
	 By fn = By.xpath("//*[@id=\"input-firstname\"]");
	 By e1=By.xpath("//*[@id=\"account\"]/div[2]/div/div");
	 By ln = By.xpath("//*[@id=\"input-lastname\"]");
	 By e2 =By.xpath("//*[@id=\"account\"]/div[3]/div/div");
	 By email=By.xpath("//*[@id=\"input-email\"]");
	 By e3=By.xpath("//*[@id=\"account\"]/div[4]/div/div");
	 By phone=By.xpath("//*[@id=\"input-telephone\"]");
	 By e4=By.xpath("//*[@id=\"account\"]/div[5]/div/div");
	 By pass=By.xpath("//*[@id=\"input-password\"]");
	 By e5=By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div");
	 By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	 By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	 By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	 By e6=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	 By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	public void negtiveRegister_Page(String e1msg,String e2msg,String e3msg,String e4msg,String e5msg,String e6msg) {
//		
//		driver.findElement(fn).sendKeys("");
//		driver.findElement(ln).sendKeys("");
//		driver.findElement(email).sendKeys("");
//		driver.findElement(phone).sendKeys();
//		driver.findElement(pass).sendKeys();
//		driver.findElement(cpass).sendKeys();
//		driver.findElement(sub).click();
//		driver.findElement(check).click();
		driver.findElement(con).click();
		WebElement ee1=driver.findElement(e1);
		Assert.assertTrue(ee1.isDisplayed());
		String msg1=ee1.getText();
		System.out.println("Actual Error Message is :"+msg1);
		Assert.assertEquals(msg1, e1msg, "First Name error message is not equals");
		WebElement ee2=driver.findElement(e2);
		Assert.assertTrue(ee1.isDisplayed());
		String msg2=ee2.getText();
		System.out.println("Actual Error Message is :"+msg2);
		Assert.assertEquals(msg2, e2msg, "Last Name error message is not equals");
		WebElement ee3=driver.findElement(e3);
		Assert.assertTrue(ee3.isDisplayed());
		String msg3=ee3.getText();
		System.out.println("Actual Error Message is :"+msg3);
		Assert.assertEquals(msg3, e3msg, "Email error message is not equals");
		WebElement ee4=driver.findElement(e4);
		Assert.assertTrue(ee4.isDisplayed());
		String msg4=ee4.getText();
		System.out.println("Actual Error Message is :"+msg4);
		Assert.assertEquals(msg4, e4msg, "Telephone error message is not equals");
		WebElement ee5=driver.findElement(e5);
		Assert.assertTrue(ee5.isDisplayed());
		String msg5=ee5.getText();
		System.out.println("Actual Error Message is :"+msg5);
		Assert.assertEquals(msg5, e5msg, "Password error message is not equals");
		WebElement ee6=driver.findElement(e6);
		Assert.assertTrue(ee6.isDisplayed());
		String msg6=ee6.getText();
		System.out.println("Actual Error Message is :"+msg6);
		Assert.assertEquals(msg1, e1msg, "Policy error message is not equals");
		
		
	}
	

}
