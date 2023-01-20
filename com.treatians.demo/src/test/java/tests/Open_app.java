package tests;

import org.testng.annotations.Test;

import generic_utilities.Base_Class;

public class Open_app extends Base_Class{
	@Test
	public void openapp() {
		driver.activateApp("com.treatians");
	}

}
