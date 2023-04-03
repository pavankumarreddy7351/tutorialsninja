package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.LogOutPages.Navigate_To_LogOutPage;

import ObjectManger.PageObject;

public class LogOutPageTestCases extends PageObject{
	@Test(priority = 1)
	public void logOut_Validation() throws Throwable {
		Navigate_To_LogOutPage.logOut_Validation();
		
	}
	@Test(priority = 2)
	public void closeApplication_WithOut_LogOut() throws Throwable {
		Navigate_To_LogOutPage.closeApplication_WithOut_Logout();
	}

}
