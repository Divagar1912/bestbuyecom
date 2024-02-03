package pageobjects;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinkPage {

	
public WebDriver driver;
	
	public BrokenLinkPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	 WebElement selectcountry;
	
	public void select_country() {
		 selectcountry.click(); 
	 }
	
	
	public void chk_brkn_link() throws IOException {
		
		String urlToCheck = "https://www.bestbuy.com/";

		try {
	        URL url = new URL(urlToCheck);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        
	        int responseCode = connection.getResponseCode();
	        
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            System.out.println("The URL is not broken.");
	        } else {
	            System.out.println("The URL is broken");
	        }
	        
	    } catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	        e.printStackTrace();
	    }
			
		
		
	}
	
}
