package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class AddItemsToCartPage {

	
public WebDriver driver;
	
	public AddItemsToCartPage(WebDriver driver) {
		
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
	
	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement bymenu;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[5]")
	WebElement in_5throw;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[2]" )
	WebElement inside_2ndrow;
	
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[10]")
	WebElement inside_10throw;
	
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]" )
	WebElement addtocartundermenu;
	
	@FindBy(xpath = "//button[@class='c-button-link continue-shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	WebElement clickonbrand;
	
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	WebElement selectbrand;
	
	@FindBy(xpath = "//a[@href='/site/searchpage.jsp?_dyncharset=UTF-8&browsedCategory=pcmcat1496260428559&id=pcat17071&iht=n&ks=960&list=y&qp=category_facet%3DSmartwatch%20Accessories~pcmcat321000050005&sc=Global&st=pcmcat1496260428559_categoryid%24pcmcat321000050003&type=page&usc=All%20Categories']")
	WebElement buds;
	
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement addtocartunderbrand;
	
	public void select_country() {
		 selectcountry.click(); 
	 }
	
	public void Search_and_Select_item() throws IOException  {
		
		search.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		search.clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		search.sendKeys("Hangman - 10' Removable Double-Sided Poster and Craft Tape - White");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		searchbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		addtocart.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		File src =  scrnsht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\java exercise\\Project_1\\Screenshots\\image.png"));
		
			
	}
	
	public void Select_item_under_menu() throws IOException, InterruptedException {
		
		bymenu.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		in_5throw.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		inside_2ndrow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		inside_10throw.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		addtocartundermenu.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		continueshopping.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		File src =  scrnsht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\java exercise\\Project_1\\Screenshots\\image.png"));
		
		
	}
	
	public void select_item_under_brand() throws IOException {
		
		bymenu.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		clickonbrand.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		selectbrand.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		buds.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		addtocartunderbrand.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	
		
		
	}
	
	
	
	
}
