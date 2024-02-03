package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.Signuppage;

public class Signuptest extends BaseClass {

	
	
	
	//drive the data from the excel to signuptestcase
	@DataProvider (name ="signupdata")
	
	
	
	public Object[][] getsignupdata() throws IOException, InterruptedException{
		
		//create a file object frome where we want to pull the data
		
	
		FileInputStream fis = new FileInputStream("D:\\java exercise\\bestbuy_ecom\\src\\test\\java\\testdata\\bestbuy.xlsx");
		
		// create a workbook object to handle the excel data
		Workbook wrkbk = WorkbookFactory.create(fis);
		
		//Access the sheet "signuptest"
		Sheet sheet = wrkbk.getSheet("signuptest");
		
		
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		//create a 2d array to store the data from the excel
		Object[][] data = new Object[rowcount][colcount];
		Thread.sleep(3000);
		
		
		//iterate through each coloumn in row
		
		for(int i=0;i<rowcount;i++) {
			
			//get the current row
			Row row = sheet.getRow(i+1);
			
			//iterate through coloumn
			for(int j=0; j<colcount;j++) {
				Cell cell = row.getCell(j);
				
				
				//store the cell value  --> check if the cell is null or not
				
				data[i][j] =(cell!=null)?cell.toString():null;
						
				
			}
			
		}
		
		
		return data;
		
		
	}


	@Test (dataProvider = "signupdata" )
	public void signup(String firstname, String lastname, String email, String password, String cnfrmpassword , String cnfrmpasssword, String mobile) throws InterruptedException, IOException {
		
		//create object for signuppage class
		
		Signuppage sp = new Signuppage(driver);
		
		sp.select_country();
		sp.clickonaccount();
		sp.CreateAccountforfirsttime();
		Thread.sleep(3000);
		sp.enterfirstname(firstname);
		sp.enterlastname(lastname);
		sp.enteremail(email);
		sp.enterpassword(password);
		sp.entercnfrmpassword(cnfrmpasssword);
		sp.entermobileno(mobile);
		sp.clickonsubmit();
		
	
		
		
		
	}
	
	
}
