package tests;
import org.testng.annotations.Test;
import generic_utilities.Base_Class;
import treatians_pages.Create_new_user_page;

public class Create_new_user extends Base_Class{
@Test
public void createnewuser() {
	Create_new_user_page c= new Create_new_user_page(driver);
	driver.activateApp("com.treatians");
	c.clickOnMenu();
	c.clickOnLogin();
	c.createNewUser();
	c.enterFirstName();
	c.enterLastName();
	c.enterEmail();
	c.back();
	c.phone();
	c.enternumber();
	c.enterpassword();
	c.confirmpassword();
	c.back();
	c.clickcountrydropdown();
	c.selectCountry();
	c.clickcitydropdown();
	c.selectcity();
	c.enterAddress();
	c.back();
	c.scroll();
	c.clickRegister();
	
}
}
