package tests;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_utilities.Base_Class;
import generic_utilities.treatians_listener;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import treatians_pages.Book_Appointments;
@Listeners(treatians_listener.class)
public class Book_Appointment_test extends Base_Class{
	@Test(priority=1)
	public void book_ap() throws IOException {
		Base_Class bc=new Base_Class();
		Book_Appointments ba= new Book_Appointments(driver);
		driver.activateApp("com.treatians");
		ba.menu();
		ba.login();
		ba.enter_email();
		ba.enter_password();
		ba.signin();
		ba.click_on_first_doctor();
		ba.click_book_appointment();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ba.today)));
		bc.ocr_test_shot(driver);
		Assert.assertTrue(bc.string.contains("MON"));
		}
	@Test(priority=2)
	public void back() throws InterruptedException {
		Book_Appointments ba= new Book_Appointments(driver);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		ba.menu();
		ba.logout.click();
		
		
	}
	}
