package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic_utilities.Base_Class;
import generic_utilities.Data_Providers;
import treatians_pages.Login;

public class Login_Test extends Base_Class{
	
@Test(dataProvider = "excelTest", dataProviderClass = Data_Providers.class)
public void logintest(String email, String password){
	Login l=new Login(driver);
	driver.activateApp("com.treatians");
	l.menu();
	l.login();
	l.Email_text_field.sendKeys(email);
	l.password_text_field.sendKeys(password);
	l.signin();
	Assert.assertTrue(l.successfully_loggedin.isDisplayed());
	l.menu();
	l.logout();
}

@Test(enabled=false)
public void logintestloop() throws InterruptedException {
	Login l=new Login(driver);
	l.loop();
}



} 



















