package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Ninja.BaseClass.BaseClass;


public class NavigateToRegisterPage extends BaseClass {

	 By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	 By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

	public void register_Page() throws Throwable {

		WebElement acc=driver.findElement(account);
		
		action.moveToElement(acc).click().perform();
		Thread.sleep(1000);
		WebElement reg=driver.findElement(register);
		action.moveToElement(reg).click().perform();
		Thread.sleep(1000);
		
	}
}
