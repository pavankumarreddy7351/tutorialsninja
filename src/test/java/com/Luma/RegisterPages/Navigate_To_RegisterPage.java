package com.Luma.RegisterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Luma.BaseClass.BaseClass;
import com.Project_Luma_Utilites.Log;

public class Navigate_To_RegisterPage extends BaseClass {
	static By account = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
	
	 public static void naviagte_To_Register()
	 {
		 WebElement a=Xpath(account);
		 action.moveToElement(a).click().perform();
		 Log.info("navigated to myAccount");
		
	 }
}

