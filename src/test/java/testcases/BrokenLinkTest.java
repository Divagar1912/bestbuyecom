package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.BrokenLinkPage;

public class BrokenLinkTest extends BaseClass {

	@Test
	public void brokenlink() throws IOException {
	
		
		BrokenLinkPage blp = new BrokenLinkPage(driver);
	
	blp.select_country();
	blp.chk_brkn_link();
	
	
	
	}

	
}
