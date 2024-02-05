package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.Loginpage;

public class Logintest extends BaseClass{

	@DataProvider(name = "logindata")
	
	public Object[][] getlogindata() throws EncryptedDocumentException, IOException, InterruptedException{
		
		FileInputStream fis = new FileInputStream("D:\\java exercise\\bestbuy_ecom\\src\\test\\java\\testdata\\bestbuy.xlsx");
		Workbook wrkbk = WorkbookFactory.create(fis);
		Sheet sheet = wrkbk.getSheet("Login");
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowcount][colcount];
		Thread.sleep(3000);
		
				
		for(int i=0;i<rowcount;i++) {
			
			Row row = sheet.getRow(i+1);
			
			for(int j=0; j<colcount;j++) {
				Cell cell = row.getCell(j);
								
				data[i][j] =(cell!=null)?cell.toString():null;
							
				
			}
			
		}
		
		return data;
		
		
	}
	
	
	
	@Test (dataProvider = "logindata")
	public void signin(String email, String password) throws InterruptedException, IOException {
		
		Loginpage lp = new Loginpage(driver);
		
		lp.select_country();
		lp.clickonaccount();
		lp.loginbtn();
		lp.enteremail(email);
		Thread.sleep(3000);
		lp.enterpswrd(password);
		Thread.sleep(3000);
		lp.submitbtn();
		com.takescreenshot(email, driver);
		
		
		
	}
	
	
}	