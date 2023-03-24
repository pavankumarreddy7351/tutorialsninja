package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.ObjectManger.PageObject;
import com.Ninja.Pages.LoginPage;

public class TestCaseTest extends PageObject {

	@Test(priority = 1)
	public void loginPage() throws Throwable   {
		LoginPage login=new LoginPage();
		login.login_Page();
	}

	@Test(priority = 2)
	public void registerPage() throws Throwable {
		register.register_Page();
	}

	@Test(priority = 3)
	public void negtiveRegisterPage() throws Throwable {
		login.login_Page();
		negtivePage.negtiveRegister_Page(dataPro.getProperty("e1msg"), dataPro.getProperty("e2msg"),
				dataPro.getProperty("e3msg"), dataPro.getProperty("e4msg"), dataPro.getProperty("e5msg"),
				dataPro.getProperty("e6msg"));
	}
	
}
