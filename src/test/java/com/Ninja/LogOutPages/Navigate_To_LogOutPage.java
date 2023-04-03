package com.Ninja.LogOutPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Ninja.BaseClass.BaseClass;
import com.Ninja.LoginPages.LoginPage_Validation;
import com.Ninja.LoginPages.NavigateToLoginPage;

import Telus.Project_Ninja_Utilites.Log;

public class Navigate_To_LogOutPage extends BaseClass{
static By logout=By.className("dropdown open");
static By account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]");
	public static void logOut_Validation() throws Throwable {
		Log.info(" TC_LG_001 and TC_LG_002 "+" Navigation to LogoutPage");
		 // Find all the elements on the page
		Xpath(account).click();
        List<WebElement> allElements = driver.findElements(logout);

        // Print the number of elements found
        System.out.println("Number of elements found: " + allElements.size());

        // Print the tag name of each element
        for (WebElement element : allElements) {
            System.out.println("Tag name: " + element.getAttribute("href"));
            System.out.println("Tag name: " + element.getText());
            System.out.println("Tag name: " + element.getClass());
        }

		
	}
	public static void closeApplication_WithOut_Logout() throws Throwable {
		Log.info("TC_LG_003"+" Close Application without logut");
		NavigateToLoginPage.navigate_LoginPage();
		LoginPage_Validation.valid_UserName_valid_Password();
		BaseClass.closeApplication();
		Log.info("Application Closed");
		BaseClass.launchApplication();
		Log.info("Application Launched ");
		NavigateToLoginPage.navigate_LoginPage();
	}
}
