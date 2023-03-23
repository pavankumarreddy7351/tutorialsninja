package com.Ninja.Utilites;

import java.io.IOException;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listeners extends ScreenShot implements ITestListener,ISuiteListener{


	@Override
	public void onTestStart(ITestResult result) {



//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test Case started is :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//captureScreenshot();
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Test Case Pass is :"+result.getName());

	}
	@Override
	public void onTestFailure(ITestResult result) {
		//captureScreenshot();
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		System.out.println("Test Case Faild is :"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		//captureScreenshot();
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//captureScreenshot();

		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Test Case Percentage is :"+result.getName());
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		//captureScreenshot();
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Test Case Time Out is :"+result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		//captureScreenshot();
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ScreenShot s1=new ScreenShot();
//		try {
//			s1.getScreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Execution Started");
	}
	@Override
	public void onFinish(ITestContext context) {
	//	captureScreenshot();
//		screenshot s=new screenshot();
//		try {
//			s.captureScreenShot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ScreenShot s1=new ScreenShot();
		try {
			s1.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("Execustion Completed");
	}


}
