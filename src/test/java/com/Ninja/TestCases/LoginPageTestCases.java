package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.LoginPages.NavigateToLoginPage;

import ObjectManger.PageObject;

public class LoginPageTestCases extends  PageObject {
	@Test(priority = 1)
	public void navigateTo_LoginPage() throws Throwable {

		NavigateToLoginPage.navigate_LoginPage();

	}
	@Test(priority = 2)
	public void loginPage_Validatioin() throws Throwable {
		
		NavigateToLoginPage.navigate_LoginPage();
//		loginPageValidation.valid_UserName_valid_Password();
//		logout.logOut_Page();
//		navigateToLoginPage.navigate_LoginPage();
//		loginPageValidation.valid_UserName_Invalid_Password();
//		loginPageValidation.Invalid_UserName_valid_Password();
//		loginPageValidation.Invalid_UserName_Invalid_Password();
//		loginPageValidation.No_UserName_No_Password();
//		loginPageValidation.validation_ForgetPassword();
//		navigateToLoginPage.navigate_LoginPage();
//		loginPageValidation.validation_TabKeyOption();
//		logout.logOut_Page();
////		navigateToLoginPage.navigate_LoginPage();
////		loginPageValidation.TC_LF_009();
//		navigateToLoginPage.navigate_LoginPage();
		loginPageValidation.TC_LF_012();
//		loginPageValidation.TC_LF_013();
//		loginPageValidation.TC_LF_014();
		///loginPageValidation.TC_LF_016();
//		loginPageValidation.TC_LF_017();
	}
	@Test(priority = 3)
	public void accountPage_Validation() throws Throwable {
		navigateRegister.register_Page();
		navigateToLoginPage.navigate_LoginPage();
		account.myAccountPage_Validation();
		navigateToLoginPage.navigate_LoginPage();
		account.rightAccount_Validation();
		
	}
	
	
}
