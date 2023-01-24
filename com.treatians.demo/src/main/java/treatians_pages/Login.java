package treatians_pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login{
	private AndroidDriver driver;
	public Login(AndroidDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
    public WebElement menu;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
    public WebElement login;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement Email_text_field;
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password_text_field;
	@AndroidFindBy(xpath="//android.widget.ListView/android.view.View[3]/android.view.View/android.view.View")
    public WebElement signin;
	
	
	public void menu() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		}
	
	public void enteremail() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(Email_text_field)));
		Email_text_field.click();
		Email_text_field.sendKeys("user1@gmail.com");
	}
	
	public void enterpassword() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password_text_field)));
		password_text_field.click();
		password_text_field.sendKeys("password");
	}
	public void signin() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signin)));
		signin.click();
		}
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
		login.click();
		}
	
}
