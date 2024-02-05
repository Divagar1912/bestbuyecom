package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.TitleValidationPage;

public class TitleValidationTest extends BaseClass {

	@Test
	public void titlevalidate() throws IOException {
		
		TitleValidationPage tvp = new TitleValidationPage(driver);
		
		tvp.select_country();
		tvp.menu1();
		tvp.menu2();
		tvp.menu3();
		tvp.menu4();
		tvp.menu5();
		tvp.menu6();
		tvp.menu7();
		com.takescreenshot("menu", driver);
		
	}
	
	
	
	
	
	
}
