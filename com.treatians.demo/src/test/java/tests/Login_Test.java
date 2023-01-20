package tests;

import org.testng.annotations.Test;

import generic_utilities.Base_Class;
import treatians_pages.Login;

public class Login_Test extends Base_Class{
@Test
public void logintest() {
	Login l=new Login(driver);
	driver.activateApp("com.treatians");
	l.menu();
	l.log();
	l.enteremail();
	l.enterpassword();
	l.signin();
}
}
