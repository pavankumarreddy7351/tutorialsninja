package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.RegistrationPages.NavigateToRegisterPage;

import ObjectManger.PageObject;

public class RegisterPageTestCases extends PageObject {

	@Test(priority = 1)
	public void navigate_To_RegisterPage() throws Throwable   {
		navigateRegister.register_Page();
	}
	@Test(priority = 2)
	public void registerPage_FormFilling() throws Throwable {
		navigateRegister.register_Page();
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
	public void password_Validation() throws Throwable {
		navigateRegister.register_Page();
		password.validation_Invalidpassword();
		password.password_Validation();
		navigateRegister.register_Page();
		password.register_WithOut_ConfirmPassowrd();
	}@Test(priority = 5)
	
	public void email_Validation() throws Throwable {
		navigateRegister.register_Page();
		emailPage.register_Page();
		emailPage.email_Validation();
		emailPage.email_Verification1();
		emailPage.email_Verification2();
		emailPage.email_Verification3();
		emailPage.email_Verification4();
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
	public void keyBord_Validation() throws Throwable {
		navigateRegister.register_Page();
		keys.register_WithKeyBoard();
	}


}
