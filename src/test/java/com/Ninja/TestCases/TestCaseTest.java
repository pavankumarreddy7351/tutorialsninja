package com.Ninja.TestCases;

import org.testng.annotations.Test;

import com.Ninja.ObjectManger.PageObject;

public class TestCaseTest extends PageObject{
	
  @Test(priority = 1)
  public void loginPage() throws Throwable {
	  login.login_Page();
  }
  @Test(priority = 2)
  public void registerPage() {
	  register.register_Page();
  }
}
