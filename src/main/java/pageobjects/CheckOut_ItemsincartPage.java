package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_ItemsincartPage {

public WebDriver driver;
	
	public CheckOut_ItemsincartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	 WebElement selectcountry;
	
	@FindBy(xpath = "//input[@id='gh-search-input']" )
	WebElement search;
	
	@FindBy(xpath = "//button[@class='header-search-button']")
	WebElement searchbtn;
	
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]" )
	WebElement addtocart;
	
	@FindBy(xpath = "//span[@class='cart-label']")
	WebElement cartbtn;
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkout;
	
	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement continueasguest;
	
	@FindBy(id = "user.emailAddress")
	WebElement enteremailincheckoutpage;
	
	@FindBy(id = "user.phone")
	WebElement entermobilenmbrincheckoutpage;
	
	@FindBy(xpath = "//span[normalize-space()='Continue to Payment Information']")
	WebElement continuepayment;
	
	@FindBy(id = "number")
	WebElement cardnumber;
	
	@FindBy(id = "first-name")
	WebElement fninpaymentpage;
	
	@FindBy(id = "last-name")
	WebElement lninpaymentpage;
	
	@FindBy(id = "address-input")
	WebElement add;
	
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;
	
	public void select_country() {
		 selectcountry.click(); 
	 }
	
	public void Search_and_Select_item() throws IOException {
		
		search.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		search.clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		search.sendKeys("Brother - P-touch TZe251 Laminated Label Tape - Black on White");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		searchbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		addtocart.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		cartbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		cartbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		checkout.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		continueasguest.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		enteremailincheckoutpage.click();
		enteremailincheckoutpage.clear();
		enteremailincheckoutpage.sendKeys("divagar.xploresense@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		entermobilenmbrincheckoutpage.click();
		entermobilenmbrincheckoutpage.clear();
		entermobilenmbrincheckoutpage.sendKeys("8667230925");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		continuepayment.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cardnumber.click();
		cardnumber.clear();
		cardnumber.sendKeys("7542 2548 2548 2587");
		
		fninpaymentpage.click();
		fninpaymentpage.clear();
		fninpaymentpage.sendKeys("Divagar");
		
		
		lninpaymentpage.click();
		lninpaymentpage.clear();
		lninpaymentpage.sendKeys("V");
		
		add.click();
		add.clear();
		add.sendKeys("cb1 Calle 130");
		add.sendKeys(Keys.ENTER);
		
		placeorder.click();
		
		
		String title = driver.getTitle();
		if(title.equals("Checkout – Best Buy")) {
			System.out.println("Enter valid details - UNABLE TO MOVE FORWARD");
		}else {
			System.out.println("Order placed successfully");
		}
		
	}

	
}
