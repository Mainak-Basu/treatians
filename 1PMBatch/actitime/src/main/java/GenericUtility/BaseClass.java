package GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM_repository.HomePage;
import POM_repository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public FileUtility fUtils=new FileUtility();
	public ExcelUtility excelUtils = new ExcelUtility();
	public WebDriverUtility wUtils=new WebDriverUtility();

	@BeforeSuite
	//to connect to database
	public void bsconfig()
	{
		System.out.println("Connect to Database");
	}
	
	@BeforeClass
	//Launch the browser and navigate to url
	public void bcconfig() throws IOException
	{
		String url=fUtils.fetchDataFromPropertyFile("url");
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@BeforeMethod
	//to login
	public void bmConfig() throws IOException 
	{
		String username=fUtils.fetchDataFromPropertyFile("username");
		String password=fUtils.fetchDataFromPropertyFile("password");
		LoginPage login = new LoginPage(driver);
		login.loginACtion(username, password);
	}
	
	@AfterMethod
	//to logout
	public void amconfig()
	{
		HomePage home=new HomePage(driver);
		home.logoutAction();
	}
	
	@AfterClass
	//close the browser
	public void acConfig()
	{
		driver.quit();
	}
	
	@AfterSuite
	//exit from database 
	public void asConfig()
	{
		System.out.println("Database is closed.");
	}

}
