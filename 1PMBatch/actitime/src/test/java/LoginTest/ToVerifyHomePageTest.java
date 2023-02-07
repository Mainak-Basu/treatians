package LoginTest;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;

public class ToVerifyHomePageTest extends BaseClass {
			
	@Test
	//to verify home
	public void toVerifyHomePageTest() throws EncryptedDocumentException, IOException
	{
		String expectedTitle=excelUtils.fetchDataFromExcelSheets("Sheet2", 1, 0);
		
		wUtils.waitForTitle(driver, "Enter");
		
		String actualTitle=driver.getTitle();
			
		Assert.assertEquals(actualTitle, expectedTitle);
	
		System.out.println("Pass:The title is verified");
	}
}

