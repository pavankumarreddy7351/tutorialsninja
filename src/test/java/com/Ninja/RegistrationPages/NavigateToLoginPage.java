package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Ninja.BaseClass.BaseClass;

public class NavigateToLoginPage extends BaseClass {
	 By account = By.xpath("//span[normalize-space()='My Account']");
	 By login =By.xpath("//a[normalize-space()='Login']");

		public void navigate_LoginPage() throws Throwable {
			 WebElement acc=driver.findElement(account);
		action.moveToElement(acc).click().perform();
		Thread.sleep(3000);
		WebElement log=driver.findElement(login);
		action.moveToElement(log).click().perform();
		Thread.sleep(3000);
}
}