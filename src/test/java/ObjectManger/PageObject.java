package ObjectManger;

import com.Ninja.BaseClass.BaseClass;
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

	public NavigateToRegisterPage navigateRegister = new NavigateToRegisterPage();
	public RegisterFromFilling register = new RegisterFromFilling();
	public RegisterPage_Validation negtivePage = new RegisterPage_Validation();
	public LoginPage_Validation loginPageValidation = new LoginPage_Validation();
	public NavigateToLoginPage navigateToLoginPage = new NavigateToLoginPage();
	public LoguOutPage logout=new LoguOutPage();
	public SubscriptionPage_Validation subcriptionPage=new SubscriptionPage_Validation();
	public AccountDropDown account=new AccountDropDown();
	public Password_ValidationPage password=new Password_ValidationPage();
	public EmailPage_Validation emailPage=new EmailPage_Validation();
	public RegisterWIthKeyBoradKeys keys=new RegisterWIthKeyBoradKeys();
	
	
	
	
}
