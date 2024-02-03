package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomLinkPage {

	
	public WebDriver driver;
	
	public BottomLinkPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	 WebElement selectcountry;
	
	public void select_country() {
		 selectcountry.click(); 
	 }
	
public void bottomlink() throws IOException {
		
		WebElement bottomLinks = driver.findElement(By.cssSelector("footer"));

		List<WebElement> links = bottomLinks.findElements(By.tagName("a"));

		for (WebElement webElement : links) {
			String url = webElement.getAttribute("href");

			if (url != null && !url.isEmpty()) {
				System.out.println("Link is valid: " + url);
            } else {
                System.out.println("Link is empty or invalid: " + webElement);
            }
			
		}
		
}
	
}
