package com.Ninja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Ninja.BaseClass.BaseClass;
import com.Ninja.BaseClass.BaseTest;

public class LoginPage extends BaseTest {

	private By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	private By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

	public void login_Page() throws Throwable {
		Thread.sleep(2000);
		WebElement acc=driver.findElement(account);
		action.moveToElement(acc).click().perform();
		WebElement reg=driver.findElement(register);
		action.moveToElement(reg).click().perform();
		Thread.sleep(3000);
	}
}
