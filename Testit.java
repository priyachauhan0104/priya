package tests;

import java.io.File;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.ExcelUtils;

public class Testit {
	@Test
	public void testLogin() throws Exception {
		    	
		    	
		        // TODO Auto-generated method stub
		//WebDriver webdriver = new FirefoxDriver();
		File filedriver=new File("P:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", filedriver.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(webdriver,20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		Actions act=new Actions(driver);
		act.moveToElement(lp.hoverToSignIn()).build().perform();
		lp.signInApp().click();
		lp.emailInput().sendKeys("aries.chauhan01@gmail.com");
		lp.passwordInput().sendKeys("shopping");
		lp.contBtnClick().click();
		lp.chckBxClick().click();
		lp.logInBtnClick().click();
		driver.close();
		
		/*ExcelUtils file = new ExcelUtils();
		readObject object = new readObject();
		Properties allObjects = object.getObjectRepository();
		uiOperation operation = new uiOperation(webdriver);
		//Read keyword sheet
		XSSFSheet Sheet = file.readExcel();
		int rowcount=Sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=Sheet.getRow(i);
			//String rowText=row.toString().valueOf(i);
			//System.out.println(rowText);
			System.out.println(row);
			XSSFCell cell=row.getCell(i);
			String cellValue=cell.getStringCellValue();
			System.out.println(cellValue);
			
			Iterator<Cell> cellitr=row.cellIterator();
			while(cellitr.hasNext())
			{
	
				if(cell!=null)
				{
					String cellVal=cell.getStringCellValue();
					operation.getObject(allObjects, cellVal, cellVal);
					
					System.out.println(cellVal);
					if (cellVal.equalsIgnoreCase("gotourl"))
					{
						String urlname=object.p.getProperty("url");
						System.out.println(urlname);
						webdriver.get(urlname);
					}
				cellitr.next();
				System.out.println(cellVal);
				if(cell!=null)
				{
					String cellVal1=cell.getStringCellValue();
					operation.getObject(allObjects, cellVal1, cellVal1);
					
					System.out.println(cellVal1);
					if (cellVal.equalsIgnoreCase("search"))
					{
						String urlname=object.p.getProperty("url");
						webdriver.get(urlname);
					}
				
				
				}
				
				}
				
			}
			
			//}
		//}
		Find number of rows in excel file
		    int rowCount = Sheet.getLastRowNum();
		    Create a loop over all the rows of excel file to read it
		    for (int i = 0; i <=rowCount; i++) {
		        //Loop over all the rows
		        Row row = Sheet.getRow(i);
		        Cell cell=row.getCell(0);
		        //Check if the first cell contain a value, if yes, That means it is the new testcase name
		        if(cell!= null){
		        //Print testcase detail on console
		           // System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
		           // row.getCell(3).toString()+"----"+ row.getCell(4).toString());
		        //Call perform function to perform operation on UI
		            operation.perform(allObjects, row.getCell(0).toString(), row.getCell(1).toString(),
		                row.getCell(2).toString(), row.getCell(3).toString());
		     }
		        else{
		            //Print the new testcase name when it started
		                System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
		            }
		        }*/
		    }
		}




