package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {

	//create webDriver variable
	public WebDriver driver;
	
	public Signuppage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	// locate element on sign up page
			 
	
	
	         @FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
			 WebElement selectcountry;
			 
			 @FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
			 WebElement ClickAccount;
			 
			 @FindBy(xpath = "//a[@class = 'c-button c-button-outline c-button-sm create-account-btn']")
			 WebElement CreateAccount;
			 
			 @FindBy(xpath = "//input[@name='firstName']")
			 WebElement Firstname;
			 
			 @FindBy(xpath = "//input[@name='lastName']")
			 WebElement Lastname;
			 
			 @FindBy(xpath = "//input[@name='email']")
			 WebElement email;
			 
			 @FindBy(xpath = "(//input[@type='password'])[1]")
			 WebElement password;
			 
			 @FindBy(xpath = "(//input[@type='password'])[2]")
			 WebElement cnfrmpassword;
			 
			 @FindBy(xpath = "//input[@name='phone']")
			 WebElement mobile;
			 
			 @FindBy(xpath = "//button[@type='submit']")
			 WebElement CreateAccountbtn;
			 
			 // CREATE METHODS
			 
			 public void select_country() {
				 selectcountry.click(); 
			 }
			 
			 public void clickonaccount() {
				 ClickAccount.click();	 
			 }
			 
			 public void CreateAccountforfirsttime() {
				 CreateAccount.click();
			 }
			 
			 public void enterfirstname(String firstname) {
				 Firstname.click();
				 Firstname.clear();
				 Firstname.sendKeys(firstname);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			 
			 public void enterlastname(String lastname) {
				 Lastname.click();
				 Lastname.clear();
				 Lastname.sendKeys(lastname);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			
			 public void enteremail(String Email) {
				 email.click();
				 email.clear();
				 email.sendKeys(Email);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			
			 public void enterpassword(String pswrd) {
				 password.click();
				 password.clear();
				 password.sendKeys(pswrd);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			
			 public void entercnfrmpassword(String cpswrd) {
				 cnfrmpassword.click();
				 cnfrmpassword.clear();
				 cnfrmpassword.sendKeys(cpswrd);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			
			 public void entermobileno(String mbl) {
				 mobile.click();
				 mobile.clear();
				 mobile.sendKeys(mbl);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 }
			 public void clickonsubmit() throws IOException {
				 CreateAccountbtn.click();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					
				 
				 
			 }
			 
			
			 
}
