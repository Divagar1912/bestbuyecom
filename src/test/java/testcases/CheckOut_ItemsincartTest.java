package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.CheckOut_ItemsincartPage;

public class CheckOut_ItemsincartTest extends BaseClass {

	
	@Test
	public void payment() throws IOException {
		
		CheckOut_ItemsincartPage ckout =new CheckOut_ItemsincartPage(driver);
		
		ckout.select_country();
		ckout.Search_and_Select_item();
		com.takescreenshot("payment", driver);
		
	}
	
	
}
