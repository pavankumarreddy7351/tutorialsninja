package com.Project_Luma_Utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilites {

	public static final int IMPLICIT_WAIT_TIME = 10;
	public static final int PAGE_Load_TIME = 5;

	public static String random_EmailID() {
		Date date = new Date();
		String num = date.toString().replace(" ", "_").replace(":", "_");
		String email = "pavan" + num + "@gmail.com";
		return email;

	}

}
