package com.Ninja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

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
	public void register_Page() throws Throwable {


		driver.findElement(fn).sendKeys(dataPro.getProperty("firstName"));
		driver.findElement(ln).sendKeys(dataPro.getProperty("lastName"));
		driver.findElement(email).sendKeys(dataPro.getProperty("email"));
		driver.findElement(phone).sendKeys(dataPro.getProperty("phoneNo"));
		driver.findElement(pass).sendKeys(dataPro.getProperty("password"));
		driver.findElement(cpass).sendKeys(dataPro.getProperty("password"));
		driver.findElement(sub).click();
		driver.findElement(check).click();
		driver.findElement(con).click();
	}
	public void email_Validation() {
		WebElement eee=driver.findElement(emsg);
		String em=eee.getText();
		Assert.assertEquals(em, dataPro.getProperty("emailmsg"), "Email error message is not showing correct");
		
	}
}
