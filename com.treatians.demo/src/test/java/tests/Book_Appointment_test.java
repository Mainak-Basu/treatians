package tests;

import org.testng.annotations.Test;

import generic_utilities.Base_Class;
import treatians_pages.Book_Appointments;

public class Book_Appointment_test extends Base_Class{
	@Test
	public void book_ap() {
		Book_Appointments ba= new Book_Appointments(driver);
		driver.activateApp("com.treatians");
		ba.login();
		ba.book_appointment();
	}

}
