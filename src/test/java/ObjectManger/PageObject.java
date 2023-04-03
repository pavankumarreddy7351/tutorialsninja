package ObjectManger;

import com.Ninja.BaseClass.BaseClass;
import com.Ninja.LogOutPages.Navigate_To_LogOutPage;
import com.Ninja.LoginPages.LoginPage_Validation;
import com.Ninja.LoginPages.LoguOutPage;
import com.Ninja.LoginPages.NavigateToLoginPage;
import com.Ninja.RegistrationPages.AccountDropDown;
import com.Ninja.RegistrationPages.EmailPage_Validation;
import com.Ninja.RegistrationPages.NavigateToRegisterPage;
import com.Ninja.RegistrationPages.Password_ValidationPage;
import com.Ninja.RegistrationPages.RegisterFromFilling;
import com.Ninja.RegistrationPages.RegisterPage_Validation;
import com.Ninja.RegistrationPages.RegisterWIthKeyBoradKeys;
import com.Ninja.RegistrationPages.SubscriptionPage_Validation;

public class PageObject extends BaseClass {

	public static NavigateToRegisterPage navigateRegister = new NavigateToRegisterPage();
	public static RegisterFromFilling register = new RegisterFromFilling();
	public static RegisterPage_Validation negtivePage = new RegisterPage_Validation();
	public static LoginPage_Validation loginPageValidation = new LoginPage_Validation();
	public static NavigateToLoginPage navigateToLoginPage = new NavigateToLoginPage();
	public static LoguOutPage logout=new LoguOutPage();
	public static SubscriptionPage_Validation subcriptionPage=new SubscriptionPage_Validation();
	public static AccountDropDown account=new AccountDropDown();
	public static Password_ValidationPage password=new Password_ValidationPage();
	public static EmailPage_Validation emailPage=new EmailPage_Validation();
	public static RegisterWIthKeyBoradKeys keys=new RegisterWIthKeyBoradKeys();
	public static Navigate_To_LogOutPage  logoutValidation=new Navigate_To_LogOutPage();
	
	
	
}
