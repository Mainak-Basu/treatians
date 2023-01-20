package treatians_pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Book_Appointments {
	private AndroidDriver driver;
	public Book_Appointments(AndroidDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	public WebElement menu;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"person circle Log in\"]/android.view.View")
    public WebElement login;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement email_text_field;
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password_text_field;
	@AndroidFindBy(xpath="//android.widget.ListView/android.view.View[3]/android.view.View/android.view.View")
    public WebElement signin;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"calendar My Appointments\"]/android.view.View")
    public WebElement my_appointments;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"body Doctors\"]/android.view.View")
    public WebElement doctors;
	@AndroidFindBy(xpath="//android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
    public WebElement book_appointment;
	@AndroidFindBy(xpath="//android.view.View[5]/android.widget.TextView[5]")
    public WebElement today;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.Button")
    public WebElement slot;
	@AndroidFindBy(xpath="//android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    public WebElement book_appointment_final;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
    public WebElement search_doctor;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
    public WebElement doctor;
	@AndroidFindBy(xpath="//android.view.View[8]/android.view.View/android.view.View/android.view.View")
    public WebElement patient_log_out;
	@AndroidFindBy(xpath="//android.view.View[6]/android.view.View/android.view.View/android.view.View")
    public WebElement doctor_log_out;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"calendar My Appointments\"]/android.view.View")
    public WebElement doctor_appointments;
	@AndroidFindBy(xpath="//android.view.View[2]/android.widget.TextView[1]")
    public WebElement latest_appointment;
	@AndroidFindBy(xpath="//android.view.View[2]/android.widget.TextView[1]")
    public WebElement patient_appointment;
	
	
	
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitl.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
		login.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(email_text_field)));
		email_text_field.sendKeys("user1@gmail.com");
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password_text_field)));
		password_text_field.sendKeys("password");
		signin.click();
		}
	public void book_appointment(){
		WebDriverWait waitm = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitm.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doctors)));
		doctors.click();
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(search_doctor)));
		search_doctor.click();
		
		search_doctor.sendKeys("Do");
		WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doctor)));
		doctor.click();
		WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait5.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(book_appointment)));
		book_appointment.click();
		WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait6.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(today)));
		today.click();
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(), 300, 1400));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(2000),
		PointerInput.Origin.viewport(),300, 400));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
		//WebDriverWait wait7 = new WebDriverWait(driver,Duration.ofSeconds(200));
		//wait7.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(slot)));
		slot.click();
		WebDriverWait wait8 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait8.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(book_appointment_final)));
		book_appointment_final.click();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
