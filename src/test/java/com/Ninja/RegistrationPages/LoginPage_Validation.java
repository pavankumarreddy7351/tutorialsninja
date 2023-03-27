package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

public class LoginPage_Validation extends BaseClass {

	By userName =By.xpath("//input[@id='input-email']");
	By password=By.xpath("//input[@id='input-password']");
	By epass=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

	public void valid_UserName_valid_Password() throws Throwable {


		driver.findElement(userName).sendKeys(dataPro.getProperty("userName"));
		driver.findElement(password).sendKeys(dataPro.getProperty("password"));
		driver.findElement(login).click();
	}
	public void valid_UserName_Invalid_Password() throws Throwable {


		driver.findElement(userName).sendKeys(dataPro.getProperty("userName"));
		driver.findElement(password).sendKeys(dataPro.getProperty("InValidpassword"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();

		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "Password Error message not showing correct");
	}
	public void Invalid_UserName_valid_Password() throws Throwable {


		driver.findElement(userName).sendKeys(dataPro.getProperty("InVailduserName"));
		driver.findElement(password).sendKeys(dataPro.getProperty("password"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();
		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "UserName Error message not showing correct");
	}
	public void Invalid_UserName_Invalid_Password() throws Throwable {


		driver.findElement(userName).sendKeys(dataPro.getProperty("InVailduserName"));
		driver.findElement(password).sendKeys(dataPro.getProperty("InValidpassword"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();

		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "UserName and Password Error message not showing correct");
	}


}
