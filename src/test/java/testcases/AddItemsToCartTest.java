package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.AddItemsToCartPage;

public class AddItemsToCartTest extends BaseClass {

	
	@Test
	public void additems() throws IOException, InterruptedException {
		
		AddItemsToCartPage aitcp = new AddItemsToCartPage(driver);
		aitcp.select_country();
		aitcp.Search_and_Select_item();
		aitcp.Select_item_under_menu();
		aitcp.select_item_under_brand();
		com.takescreenshot("add items", driver);
	}
	
	
}
