package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleValidationPage  {

	public WebDriver driver;
	
	public TitleValidationPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	 WebElement selectcountry;
	 
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[1]")
	WebElement topdeals;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[2]" )
	WebElement dealsoftheday;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[3]")
	WebElement bestbuysellsthat;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[4]")
	WebElement mybestbuymembership;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[5]")
	WebElement creditcards;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[6]")
	WebElement giftcards;
	
	@FindBy(xpath = "(//a[@class='bottom-left-links '])[7]")
	WebElement giftideas;
	
	
	public void pagetitle(String value) {
		String actualtitle=driver.getTitle();
		String expectedtitle = value; 
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("page title validation pass");
			
		}else {
			System.out.println("page title validation fail");
		}
		
	}
	
	public void select_country() {
		 selectcountry.click(); 
	 }
	
	
	public void menu1() {
		topdeals.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		pagetitle("Top Deals and Featured Offers on Electronics - Best Buy");
	}
	
	public void menu2() {
		dealsoftheday.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("Deal of the Day: Electronics Deals - Best Buy");
	}
	
	public void menu3() {
		bestbuysellsthat.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("Yes, Best Buy Sells That – Best Buy");
	}
	
	public void menu4() {
		mybestbuymembership.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("My Best Buy Memberships");
	}

	public void menu5() {
		creditcards.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("Best Buy Credit Card: Rewards & Financing");
	}
	
	public void menu6() {
		giftcards.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("Gifts Cards and E-Gift Cards - Best Buy");
	}
	
	public void menu7() throws IOException {
		giftideas.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pagetitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
	
	
	
	}
	
	
}
