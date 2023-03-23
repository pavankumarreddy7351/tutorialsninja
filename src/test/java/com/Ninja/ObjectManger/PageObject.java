package com.Ninja.ObjectManger;

import com.Ninja.BaseClass.BaseTest;
import com.Ninja.Pages.LoginPage;
import com.Ninja.Pages.RegisterPage;

public class PageObject extends BaseTest {
	//public static LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	public static LoginPage login=new LoginPage();
	public static RegisterPage register=new RegisterPage();
	
	
}
