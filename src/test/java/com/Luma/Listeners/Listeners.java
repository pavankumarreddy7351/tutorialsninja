package com.Luma.Listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Project_Luma_Utilites.ExtentRepoter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class Listeners extends ExtentRepoter  implements ITestListener{
	ExtentReports extentReport;
	ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		
		String testName=result.getName();
		 extentTest = extentReport.createTest(testName);
		
		File scrScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath =System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		try {
			FileHandler.copy(scrScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.INFO, testName+" "+"onTestStart");
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
		String testName=result.getName();
		 extentTest = extentReport.createTest(testName);
		
		File scrScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath =System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		try {
			FileHandler.copy(scrScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.PASS, testName+" "+"onTestStart");
		ITestListener.super.onTestStart(result);

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getName();
		 extentTest = extentReport.createTest(testName);
		
		File scrScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath =System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		try {
			FileHandler.copy(scrScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, testName+" "+"onTestStart");
		ITestListener.super.onTestStart(result);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName=result.getName();
		
			extentTest.log(Status.INFO, result.getThrowable());
			extentTest.log(Status.SKIP, testName+" "+"onTestSkipped");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testName=result.getName();
		 extentTest = extentReport.createTest(testName);
			extentTest.log(Status.FAIL, testName+" "+"onTestStart");
		System.out.println(testName+" "+"onTestFailedButWithinSuccessPercentage");
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println("Screen Shot Taken");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testName=result.getName();
		 extentTest = extentReport.createTest(testName);
			extentTest.log(Status.FAIL, testName+" "+"onTestStart");
		System.out.println(testName+" "+"onTestFailedWithTimeout");
		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println("Screen Shot Taken");
		
	}

	@Override
	public void onStart(ITestContext context) {
	extentReport =ExtentRepoter.genrateExtentReport();
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
		String path=System.getProperty("user.dir")+".//test-output/ExtentReports/extentReport.html";
		File extentReport= new File(path);
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}