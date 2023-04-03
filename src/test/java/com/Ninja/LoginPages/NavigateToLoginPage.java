package com.Ninja.LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

public class NavigateToLoginPage extends BaseClass {
	 static By account = By.xpath("//span[normalize-space()='My Account']");
	 static By login =By.xpath("//a[normalize-space()='Login']");
	 static By userName =By.xpath("//input[@id='input-email']");
	 static By password=By.xpath("//input[@id='input-password']");

		public static void navigate_LoginPage() throws Throwable {
		WebElement acc=driver.findElement(account);
		action.moveToElement(acc).click().perform();
		Thread.sleep(1000);
		WebElement log=driver.findElement(login);
		
		action.moveToElement(log).click().perform();
		Thread.sleep(1000);
		
		Assert.assertTrue(Xpath(userName).isDisplayed());
		Assert.assertTrue(Xpath(password).isDisplayed());
}
}