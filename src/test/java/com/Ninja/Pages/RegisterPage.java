package com.Ninja.Pages;

import java.util.Random;

import org.openqa.selenium.By;

import com.Ninja.BaseClass.BaseClass;

public class RegisterPage extends BaseClass{
	
	private By fn = By.xpath("//*[@id=\"input-firstname\"]");
	private By ln = By.xpath("//*[@id=\"input-lastname\"]");
	private By email=By.xpath("//*[@id=\"input-email\"]");
	private By phone=By.xpath("//*[@id=\"input-telephone\"]");
	private By pass=By.xpath("//*[@id=\"input-password\"]");
	private By cpass=By.xpath("//*[@id=\"input-confirm\"]");
	private By sub=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	private By check=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	private By con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	public void register_Page() {
		
		driver.findElement(fn).sendKeys("pavan");
		driver.findElement(ln).sendKeys("reddy");
		driver.findElement(email).sendKeys("pavankumar123@gmail.com");
		driver.findElement(phone).sendKeys("7416410620");
		driver.findElement(pass).sendKeys("*Pavan@4331");
		driver.findElement(cpass).sendKeys("*Pavan@4331");
		driver.findElement(sub).click();
		driver.findElement(check).click();
		driver.findElement(con).click();
		
	}
	

}
