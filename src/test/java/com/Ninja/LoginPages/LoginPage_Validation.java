package com.Ninja.LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;

import Telus.Project_Ninja_Utilites.Log;

public class LoginPage_Validation extends BaseClass {

	static By userName =By.xpath("//input[@id='input-email']");
	static By password=By.xpath("//input[@id='input-password']");
	static By epass=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	static By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	static By forgetpass=By.linkText("Forgotten Password");
	static By hourerrmsg=By.xpath("//*[contains(text(),' Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.')] ");
	static By changePassword=By.xpath("//*[@id=\"content\"]/ul[1]/li[2]/a");
	static By newPassword=By.xpath("//*[@id=\"input-password\"]");
	static By newConfirmPassword=By.xpath("//*[@id=\"input-confirm\"]");
	static By continueButton=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");


	public static void valid_UserName_valid_Password() throws Throwable {


		driver.findElement(userName).sendKeys(dataPro.getProperty("userName"));
		driver.findElement(password).sendKeys(dataPro.getProperty("password"));
		driver.findElement(login).click();
	}
	public void valid_UserName_Invalid_Password() throws Throwable {

		clear(userName);
		driver.findElement(userName).sendKeys(dataPro.getProperty("userName"));
		clear(password);
		driver.findElement(password).sendKeys(dataPro.getProperty("InValidpassword"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();

		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "Password Error message not showing correct");
	}
	public void Invalid_UserName_valid_Password() throws Throwable {

		clear(userName);
		driver.findElement(userName).sendKeys(dataPro.getProperty("InVailduserName"));
		clear(password);
		driver.findElement(password).sendKeys(dataPro.getProperty("password"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();
		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "UserName Error message not showing correct");
	}
	public void Invalid_UserName_Invalid_Password() throws Throwable {

		clear(userName);
		driver.findElement(userName).sendKeys(dataPro.getProperty("InVailduserName"));
		clear(password);
		driver.findElement(password).sendKeys(dataPro.getProperty("InValidpassword"));
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();

		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "UserName and Password Error message not showing correct");
	}
	public void No_UserName_No_Password() throws Throwable {


		clear(userName);
		Log.info("No User Name ");
		clear(password);
		Log.info("No Password");
		driver.findElement(login).click();
		WebElement ep=driver.findElement(epass);
		String actualPassErro=ep.getText();

		Assert.assertEquals(dataPro.getProperty("epassmsg"), actualPassErro, "UserName and Password Error message not showing correct");
	}
	public void validation_ForgetPassword() {
		clear(userName);
		clear(password);
		WebElement pass=Xpath(forgetpass);
		String actualForeget=pass.getAttribute("href");
		Assert.assertEquals(dataPro.getProperty("excpectedForgetPass"), actualForeget, "Forget Password Link is not matching");
		click(forgetpass);
		String url=getURL();
		Assert.assertEquals(dataPro.getProperty("excpectedForgetPass"), url, "Forget Password Link is not matching");


	}
	public void validation_TabKeyOption() throws InterruptedException {
		for(int i=0;i<=23;i++) {
			Thread.sleep(1000);
			action.sendKeys(Keys.TAB).build().perform();
		}

		enterText(userName,dataPro.getProperty("userName"));
		action.sendKeys(Keys.TAB).build().perform();
		enterText(password,dataPro.getProperty("password"));
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		click(login);

	}
	public void TC_LF_009() throws Throwable {
		enterText(userName,dataPro.getProperty("userName"));
		enterText(password,dataPro.getProperty("password"));
		click(login);
		Thread.sleep(1000);
		driver.navigate().back();
	}
	public void TC_LF_012() throws Throwable {
		enterText(userName,dataPro.getProperty("InVailduserName"));
		enterText(password,dataPro.getProperty("InValidpassword"));
		for(int i=1;i<=6;i++) {
			Thread.sleep(1000);
			click(login);
		}
		//oneHourErrMsg
		String actualHourMsg=Xpath(hourerrmsg).getText();
		Assert.assertEquals(dataPro.getProperty("oneHourErrMsg"), actualHourMsg, "Hour Message getting error");


	}
	public void TC_LF_013() {
		enterText(password,dataPro.getProperty("password"));
		String tag1=Xpath(password).getAttribute("type");
		Log.info("Password type is "+tag1);
		Assert.assertTrue(Xpath(password).isDisplayed());
	}
	public void TC_LF_014() {
		enterText(password,dataPro.getProperty("password"));

		action.moveToElement(Xpath(password)).doubleClick().build().perform();
		action.contextClick(Xpath(password)).build().perform();
		clear(password);
		enterText(password,dataPro.getProperty("password"));
		Xpath(password).sendKeys(Keys.CONTROL);
		Xpath(password).sendKeys("A");
		Xpath(password).sendKeys(Keys.CONTROL);
		Xpath(password).sendKeys("C");
		clear(password);
		Xpath(password).sendKeys(Keys.CONTROL);
		Xpath(password).sendKeys("V");
		String duplicatePassword=getText(password);
		Assert.assertNotSame(duplicatePassword, dataPro.getProperty("password"), "Copy Password is same to Actual password");

	}
	public void TC_LF_016() throws Throwable {
		enterText(userName,dataPro.getProperty("userName"));
		enterText(password,dataPro.getProperty("password"));
		click(login);
		click(changePassword);
		enterText(newPassword,dataPro.getProperty("InValidpassword"));
		enterText(newConfirmPassword,dataPro.getProperty("InValidpassword"));
		click(continueButton);
		LoguOutPage.logOut_Page();
		NavigateToLoginPage.navigate_LoginPage();
		enterText(userName,dataPro.getProperty("userName"));
		enterText(newPassword,dataPro.getProperty("InValidpassword"));
		click(login);
		LoguOutPage.logOut_Page();
	}
	public void TC_LF_017() throws Throwable {
		enterText(userName,dataPro.getProperty("userName"));
		enterText(newPassword,dataPro.getProperty("InValidpassword"));
		click(login);
		
		driver.close();

	}
}
