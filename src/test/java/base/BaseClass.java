package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseClass extends Utility {

	
	// OPEN AND CLOSE THE BROWSER
	
	@BeforeMethod
	public void open() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@AfterMethod
	
	public void close() {
		
		driver.quit();
		
	
		
		
	}
	
}
