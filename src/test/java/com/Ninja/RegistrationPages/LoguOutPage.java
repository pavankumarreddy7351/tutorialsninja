package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;

import com.Ninja.BaseClass.BaseClass;

public class LoguOutPage extends BaseClass {
	 By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	 By log=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
	 
	 
	 public void logOut_Page() throws Throwable {
		 Thread.sleep(2000);
			driver.findElement(account).click();
			driver.findElement(log).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
	 }
}


