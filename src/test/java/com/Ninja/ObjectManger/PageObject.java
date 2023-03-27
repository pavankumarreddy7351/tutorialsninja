package com.Ninja.ObjectManger;

import com.Ninja.BaseClass.BaseClass;
import com.Ninja.Pages.EmailPage_Validation;
import com.Ninja.Pages.LoginPage_Validation;
import com.Ninja.Pages.LoguOutPage;
import com.Ninja.Pages.MyAccountPage;
import com.Ninja.Pages.NavigateToLoginPage;
import com.Ninja.Pages.NavigateToRegisterPage;
import com.Ninja.Pages.Password_ValidationPage;
import com.Ninja.Pages.RegisterPage_Validation;
import com.Ninja.Pages.SubscriptionPage_Validation;
import com.Ninja.Pages.RegisterFromFilling;

public class PageObject extends BaseClass {

	public NavigateToRegisterPage navigateRegister = new NavigateToRegisterPage();
	public RegisterFromFilling register = new RegisterFromFilling();
	public RegisterPage_Validation negtivePage = new RegisterPage_Validation();
	public LoginPage_Validation loginPageValidation = new LoginPage_Validation();
	public NavigateToLoginPage navigateToLoginPage = new NavigateToLoginPage();
	public LoguOutPage logout=new LoguOutPage();
	public SubscriptionPage_Validation subcriptionPage=new SubscriptionPage_Validation();
	public MyAccountPage account=new MyAccountPage();
	public Password_ValidationPage password=new Password_ValidationPage();
	public EmailPage_Validation emailPage=new EmailPage_Validation();
	
	
	
	
}
