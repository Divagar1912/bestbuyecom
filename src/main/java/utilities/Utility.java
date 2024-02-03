package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
		// use the properties from data.properties
		
		prop = new Properties();
		
		// provide a path to property
		
		String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		
		FileInputStream fis = new FileInputStream(proppath);
		
		//to get the data from the data.properties
		prop.load(fis);
		
		
		//browser selection
		
		String browsername = "chrome";
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browsername.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.out.println("Invalid browser selection");
			System.exit(1);
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	
		//TO CAPTURE SCREENSHOT
		
	public String takescreenshot(String testname, WebDriver driver) throws IOException {
		
		
		File srcscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//provide  path where to capture the screenshot
		
		String screenshotfilepath = System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
		
		//copy the file path
		FileUtils.copyFile(srcscreenshot, new File(screenshotfilepath));
		
		return screenshotfilepath;
		
	}
	
	
	//SWITCH TO WINDOW
	
	public static void Switchwindow() {
		
		String parentwindow = driver.getWindowHandle();
		Set<String> windowhandles = driver.getWindowHandles();
		windowhandles.size();
		
		//Iterate through windows
		for(String ChildWindow:windowhandles) {
			
			if(!ChildWindow.contentEquals(parentwindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}
		
		
	}
	
	
	// WAIT FOR AN ELEMENT TO BE CLICKABLE
	
	public static WebElement waitforelementtobeclickable(By locator, int timeoutinsecond) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutinsecond));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
