package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseClass;
import utilities.ExtentReport;

public class Listeners extends BaseClass implements ITestListener{

	
	
	WebDriver driver = null;
	
	//create an extent report object 
	
	ExtentReports  extentreport = new ExtentReport().getexteExtentReports();
	
	//initialixe extent test variable 
	
	ExtentTest extenttest;
	
			
		
		
	

	@Override
	public void onTestStart(ITestResult result) {
		extenttest=extentreport.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS	, "Test passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
extenttest.fail(result.getThrowable());
		
		// get the name of the testcase 
		
		String testname = result.getName();
		
		//logic to capture screenshot
		
		try {
			
			driver =(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
		
		
		try {
			
			
		// take screenshot
			String screenshotpath = takescreenshot(testname,driver);
			extenttest.addScreenCaptureFromPath(screenshotpath,testname);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}

	}

	@Override
	public void onFinish(ITestContext context) {
		extentreport.flush();
	
	}
	
	
	
	
	
	
	
}
