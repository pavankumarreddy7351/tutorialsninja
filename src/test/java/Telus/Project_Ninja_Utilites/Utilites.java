package Telus.Project_Ninja_Utilites;

import java.util.Date;

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
