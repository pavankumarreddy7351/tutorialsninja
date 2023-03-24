package com.Ninja.ObjectManger;

import com.Ninja.BaseClass.BaseClass;

import com.Ninja.Pages.LoginPage;
import com.Ninja.Pages.Negtive_RegisterPage;
import com.Ninja.Pages.RegisterPage;

public class PageObject extends BaseClass {
	
	public LoginPage login=new LoginPage();
	
	public  RegisterPage register=new RegisterPage();
	public  Negtive_RegisterPage negtivePage=new Negtive_RegisterPage();
	
}
