package generic_utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;

public class Base_Class {
	public static AndroidDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");
	//dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Fleek\\Downloads\\app-dev-jan-17.apk");
	dc.setCapability("noReset", true);
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
   driver = new AndroidDriver(url,dc);
   }
	
	public void failed_test(String testMethodName, AndroidDriver driver) throws IOException {
		Base_Class.driver=driver;
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("Y/MM/DD HH:mm:ss");
		String date=sdf.format(d);
		date=date.replace(':', '_');
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Fleek\\eclipse-workspace\\com.treatians.demo\\treatians_screenshots\\"+testMethodName+"_"+date+".jpg"));
	Allure.attachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	
	
	}
			
@AfterClass
public void teardown() {
	Allure.step("Server closed");
	driver.quit();
}

}
