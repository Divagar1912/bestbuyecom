package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.BottomLinkPage;

public class BottomLinkTest extends BaseClass {

	
	@Test
	public void bottomlink() throws IOException {
		
		BottomLinkPage btmlp = new BottomLinkPage(driver);
		btmlp.select_country();
		btmlp.bottomlink();
		com.takescreenshot("bottomlink", driver);
	}
	
}
