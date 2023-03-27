package com.Ninja.RegistrationPages;

import org.openqa.selenium.By;

import com.Ninja.BaseClass.BaseClass;

public class AccountDropDown extends BaseClass {
	By account=By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
	By raccount=By.xpath("//*[@id=\"column-right\"]/div/a[2]");
	
	public void myAccountPage_Validation(){
		driver.findElement(account).click();
	}
	public void rightAccount_Validation(){
		driver.findElement(raccount).click();
	}
}
