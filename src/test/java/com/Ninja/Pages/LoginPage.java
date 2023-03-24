package com.Ninja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Ninja.BaseClass.BaseClass;


public class LoginPage extends BaseClass {

	 By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	 By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

	public void login_Page() throws Throwable {
//		String a=driver.getCurrentUrl();
//		System.out.println(a);
//	Thread.sleep(2000);
//	driver.findElement(account).click();
//	Thread.sleep(2000);
//	driver.findElement(register);
//	Thread.sleep(2000);
		WebElement acc=driver.findElement(account);
		
		action.moveToElement(acc).click().perform();
		Thread.sleep(3000);
		WebElement reg=driver.findElement(register);
		action.moveToElement(reg).click().perform();
		Thread.sleep(3000);
	}
}
