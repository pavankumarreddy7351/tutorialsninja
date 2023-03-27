package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.ObjectManger.PageObject;
import com.Ninja.RegistrationPages.NavigateToRegisterPage;

public class RegisterPageTestCases extends PageObject {

	@Test(priority = 1)
	public void navigate_To_RegisterPage() throws Throwable   {
		navigateRegister.register_Page();
	}
	@Test(priority = 2)
	public void registerPage_FormFilling() throws Throwable {
		register.register_Page();
		register.validate_SuccessPage();
		logout.logOut_Page();
		
	}

	@Test(priority = 3)
	public void registerPage_Validation() throws Throwable {
		navigateRegister.register_Page();
		negtivePage.negtiveRegister_Page(dataPro.getProperty("e1msg"), dataPro.getProperty("e2msg"),
				dataPro.getProperty("e3msg"), dataPro.getProperty("e4msg"), dataPro.getProperty("e5msg"),
				dataPro.getProperty("e6msg"));
	}
	@Test(priority = 4)
	public void subcriptionPage_Validation() throws Throwable {
		navigateRegister.register_Page();
		
		subcriptionPage.validate_Yes_Subcription();
		logout.logOut_Page();
		navigateRegister.register_Page();
		subcriptionPage.validate_No_Subcription();
		logout.logOut_Page();
	}
	@Test(priority = 5)
	public void navigateTo_LoginPage() throws Throwable {

		navigateToLoginPage.navigate_LoginPage();

	}
	@Test(priority = 6)
	public void loginPage_Validatioin() throws Throwable {
		
		loginPageValidation.valid_UserName_valid_Password();
		logout.logOut_Page();
		navigateToLoginPage.navigate_LoginPage();
		loginPageValidation.valid_UserName_Invalid_Password();
		loginPageValidation.Invalid_UserName_valid_Password();
		loginPageValidation.Invalid_UserName_Invalid_Password();
	}
	@Test(priority = 7)
	public void accountPage_Validation() throws Throwable {
		navigateRegister.register_Page();
		navigateToLoginPage.navigate_LoginPage();
		account.myAccountPage_Validation();
		navigateToLoginPage.navigate_LoginPage();
		account.rightAccount_Validation();
		
	}
	@Test(priority = 8)
	public void password_Validation() throws Throwable {
		navigateRegister.register_Page();
		password.register_Page();
		password.password_Validation();
		navigateRegister.register_Page();
		password.register_WithOut_ConfirmPassowrd();
	}
	@Test(priority = 9)
	
	public void email_Validation() throws Throwable {
		navigateRegister.register_Page();
		emailPage.register_Page();
		emailPage.email_Validation();
		emailPage.email_Verification1();
		emailPage.email_Verification2();
		emailPage.email_Verification3();
		emailPage.email_Verification4();
	}
	@Test(priority = 10)
	public void keyBord_Validation() throws Throwable {
		navigateRegister.register_Page();
		keys.register_WithKeyBoard();
	}


}
