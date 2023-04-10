package com.Luma.RegisterPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Luma.BaseClass.BaseClass;
import com.Project_Luma_Utilites.Log;
import com.Project_Luma_Utilites.Utilites;
public class RegisterFormFilling extends BaseClass {
	
	static By firstName =  By.xpath("//input[@id='firstname']");
	static By lastName=By .xpath("//input[@id='lastname']");
	static By email=By.xpath("//input[@id='email_address']");
	static By password=By.xpath("//input[@id='password']");
	static By confirmpassword=By.xpath("//input[@id='password-confirmation']");
	static By continueButton=By.xpath("//button[@title='Create an Account']");
	static By sub=By.xpath("//input[@id='is_subscribed']");
	static By success=By.xpath("//*[contains(text(),'Thank you for registering with Main Website Store.')]");
	public static void register_Filling() {
		Navigate_To_RegisterPage.naviagte_To_Register();
		Log.startTestCase("register_Page");
		enterText(firstName,dataPro.getProperty("firstName"));
		Log.info("First Name Passed");
		enterText(lastName,dataPro.getProperty("lastName"));
		Log.info("Last Name Passed");
		enterText(email,Utilites.random_EmailID());
		Log.info("Email Passed");
		enterText(password,dataPro.getProperty("password"));
		Log.info("Password Passed");
		enterText(confirmpassword,dataPro.getProperty("password"));
		Log.info("confirmpassword Passed");
		click(sub);
		Log.info("subscribed Passed");
		click(continueButton);
		Log.info("continueButton Passed");
	}
	public static void validate_SuccessPage() throws Exception {
		Thread.sleep(5000);
		String actualMsg=Xpath(success).getText();
		Assert.assertEquals(actualMsg, dataPro.getProperty("successmsg"), "Successfully registerd message is not showing correct");
		
	}
}
