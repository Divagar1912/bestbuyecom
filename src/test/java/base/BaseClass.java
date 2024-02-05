package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseClass extends Utility {

	public Utility com = new Utility();
	
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
