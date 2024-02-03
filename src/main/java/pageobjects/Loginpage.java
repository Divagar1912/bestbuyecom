package pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	//create webDriver variable

		public WebDriver driver;
		
		public Loginpage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
		 WebElement selectcountry;
		 
		 @FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
		 WebElement ClickAccount;
		 
		
		@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
		WebElement signinbtn;
		
		@FindBy(xpath = "//input[@type='email']")
		WebElement enteremail;
		
		@FindBy(xpath = "//input[@type='password']")
		WebElement enterpassword;
		
		@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
		WebElement clickbtn;
		
	
		
		public void select_country() {
			 selectcountry.click(); 
		 }
		 
		 public void clickonaccount() {
			 ClickAccount.click();	 
		 }
		
		
		public void loginbtn() {
			signinbtn.click();			
		}
		
		public void enteremail(String mail) {
			enteremail.click();
			enteremail.clear();
			enteremail.sendKeys(mail);
		}
		
		public void enterpswrd(String pswrd) {
			enterpassword.click();
			enterpassword.clear();
			enterpassword.sendKeys(pswrd);
		}
		
		public void submitbtn() throws IOException {
		
			clickbtn.click();
			
		}
		
		
		
		
		
}	
		
		
	